module github.com/Workiva/frugal

go 1.14

require (
	git.apache.org/thrift.git v0.13.0
	github.com/Sirupsen/logrus v0.11.5 // indirect
	github.com/Workiva/frugal/lib/go v0.0.0-20200421192525-12467b8f9ae8
	github.com/davecgh/go-spew v1.1.1 // indirect
	github.com/go-stomp/stomp v2.0.5+incompatible
	github.com/gopherjs/gopherjs v0.0.0-20200217142428-fce0ec30dd00
	github.com/nats-io/gnatsd v1.4.1
	github.com/nats-io/go-nats v0.0.0-20161120202126-6b6bf392d34d
	github.com/nats-io/nuid v1.0.1
	github.com/pmezard/go-difflib v1.0.0 // indirect
	github.com/rs/cors v1.7.0
	github.com/sirupsen/logrus v1.6.0
	github.com/stretchr/testify v1.5.1
	github.com/urfave/cli v1.19.1
	golang.org/x/tools v0.0.0-20161215003254-dd796641777b
	gopkg.in/yaml.v2 v2.2.2
)

replace github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.5.0
