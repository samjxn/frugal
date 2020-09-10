module github.com/Workiva/frugal

go 1.12

require (
	git.apache.org/thrift.git v0.13.0
	github.com/Sirupsen/logrus v0.11.5
	github.com/Workiva/frugal/lib/go v0.0.0-20200902184714-afa94c859c07
	github.com/apache/thrift v0.13.0
	github.com/go-stomp/stomp v2.0.6+incompatible
	github.com/gopherjs/gopherjs v0.0.0-20200217142428-fce0ec30dd00
	github.com/nats-io/gnatsd v1.4.1
	github.com/nats-io/go-nats v1.7.2
	github.com/nats-io/nuid v1.0.1
	github.com/niemeyer/pretty v0.0.0-20200227124842-a10e7caefd8e // indirect
	github.com/sirupsen/logrus v1.6.0 // indirect
	github.com/stretchr/objx v0.3.0 // indirect
	github.com/stretchr/testify v1.6.1
	github.com/urfave/cli v1.19.1
	golang.org/x/tools v0.0.0-20161215003254-dd796641777b
	gopkg.in/check.v1 v1.0.0-20200902074654-038fdea0a05b // indirect
	gopkg.in/yaml.v2 v2.0.0-20160928153709-a5b47d31c556
)

replace (
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.4.0
	ithub.com/Workiva/frugal/lib/go => ./lib/go
)
