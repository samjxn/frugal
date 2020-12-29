/*
 * Copyright 2017 Workiva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test

import (
	"path/filepath"
	"testing"
	"time"

	"github.com/samjxn/frugal/compiler"
	"github.com/samjxn/frugal/compiler/globals"
)

func TestValidJsonFrugalCompiler(t *testing.T) {
	defer globals.Reset()
	nowBefore := globals.Now
	defer func() {
		globals.Now = nowBefore
	}()
	globals.Now = time.Date(2015, 11, 24, 0, 0, 0, 0, time.UTC)

	options := compiler.Options{
		File:    frugalGenFile,
		Gen:     "json:indent",
		Out:     outputDir,
		Delim:   delim,
		Recurse: true,
	}
	if err := compiler.Compile(options); err != nil {
		t.Fatal("Unexpected error", err)
	}

	files := []FileComparisonPair{
		{"expected/frugal.json", filepath.Join(outputDir, "frugal.json")},
	}

	copyAllFiles(t, files)
	compareAllFiles(t, files)
}
