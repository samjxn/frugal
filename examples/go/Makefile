
.PHONY: all
all: install

# Installs dependencies and symlink the local frugal into the
# vendor folder so local changes to frugal can be easily tested
.PHONY: install
install:
	rm -rf vendor && \
		glide install && \
		rm -rf vendor/github.com/samjxn/frugal/lib/go && \
		ln -s ${GOPATH}/src/github.com/samjxn/frugal/lib/go vendor/github.com/samjxn/frugal/lib/go
