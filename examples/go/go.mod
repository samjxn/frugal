module github.com/Workiva/frugal/examples/go

go 1.12

require (
	git.apache.org/thrift.git v0.13.0
	github.com/Sirupsen/logrus v1.6.0
	github.com/Workiva/frugal/lib/go v3.11.0+incompatible
	github.com/go-stomp/stomp v2.0.6+incompatible
	github.com/nats-io/go-nats v1.7.2
	github.com/nats-io/nkeys v0.2.0 // indirect
	github.com/niemeyer/pretty v0.0.0-20200227124842-a10e7caefd8e // indirect
	github.com/rs/cors v1.3.0
	github.com/sirupsen/logrus v1.6.0 // indirect
	github.com/stretchr/objx v0.3.0 // indirect
	gopkg.in/check.v1 v1.0.0-20200902074654-038fdea0a05b // indirect
)

replace (
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.4.0
	github.com/Workiva/frugal/lib/go => ../../lib/go
)
