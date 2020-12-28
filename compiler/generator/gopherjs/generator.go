package gopherjs

import (
	"github.com/samjxn/frugal/compiler/generator"
	"github.com/samjxn/frugal/compiler/generator/golang"
)

// Generator implements the LanguageGenerator interface for Go.
type Generator struct {
	*golang.Generator
}

// NewGenerator creates a new Go LanguageGenerator.
func NewGenerator(options map[string]string) generator.LanguageGenerator {
	options["slim"] = "true"
	options["frugal_import"] = "github.com/samjxn/frugal/lib/gopherjs/frugal"
	options["thrift_import"] = "github.com/samjxn/frugal/lib/gopherjs/thrift"
	return &Generator{
		Generator: &golang.Generator{
			BaseGenerator: &generator.BaseGenerator{Options: options},
		},
	}
}
