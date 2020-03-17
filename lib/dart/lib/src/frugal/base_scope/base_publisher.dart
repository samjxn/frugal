part of frugal.src.frugal;

/// Base publisher class which all publisher classes will extend from.
///
/// Provides access to opening and closing the underlying [transport].
class FBasePublisher {
  /// Construct an instance of a base publisher.
  FBasePublisher(FScopeProvider provider) {
    transport = provider.publisherTransportFactory.getTransport();
  }

  /// The frugal transport for the publisher.
  FPublisherTransport transport;

  /// Opens the [transport].
  Future open() {
    return transport.open();
  }

  /// Closes the [transport].
  Future close() {
    return transport.close();
  }
}
