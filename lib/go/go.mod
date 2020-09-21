module github.com/Workiva/frugal/lib/go

require (
	git.apache.org/thrift.git v0.0.0-20161221203622-b2a4d4ae21c7
	github.com/go-stomp/stomp v2.0.6+incompatible
	github.com/nats-io/nats-server/v2 v2.1.8
	github.com/nats-io/nats.go v1.10.0
	github.com/nats-io/nuid v1.0.1
	github.com/sirupsen/logrus v1.6.0
	github.com/stretchr/testify v1.6.1
)

replace git.apache.org/thrift.git => github.com/apache/thrift v0.0.0-20161221203622-b2a4d4ae21c7
