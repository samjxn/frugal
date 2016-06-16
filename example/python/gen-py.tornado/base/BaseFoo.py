#
# Autogenerated by Thrift Compiler (0.9.3-wk-3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py:tornado
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException
import logging
from ttypes import *
from thrift.Thrift import TProcessor
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None

from tornado import gen
from tornado import concurrent
from thrift.transport import TTransport

class Iface(object):
  def basePing(self):
    pass


class Client(Iface):
  def __init__(self, transport, iprot_factory, oprot_factory=None):
    self._transport = transport
    self._iprot_factory = iprot_factory
    self._oprot_factory = (oprot_factory if oprot_factory is not None
                           else iprot_factory)
    self._seqid = 0
    self._reqs = {}
    self._transport.io_loop.spawn_callback(self._start_receiving)

  @gen.engine
  def _start_receiving(self):
    while True:
      try:
        frame = yield self._transport.readFrame()
      except TTransport.TTransportException as e:
        for future in self._reqs.itervalues():
          future.set_exception(e)
        self._reqs = {}
        return
      tr = TTransport.TMemoryBuffer(frame)
      iprot = self._iprot_factory.getProtocol(tr)
      (fname, mtype, rseqid) = iprot.readMessageBegin()
      future = self._reqs.pop(rseqid, None)
      if not future:
        # future has already been discarded
        continue
      method = getattr(self, 'recv_' + fname)
      try:
        result = method(iprot, mtype, rseqid)
      except Exception as e:
        future.set_exception(e)
      else:
        future.set_result(result)

  def basePing(self):
    self._seqid += 1
    future = self._reqs[self._seqid] = concurrent.Future()
    self.send_basePing()
    return future

  def send_basePing(self):
    oprot = self._oprot_factory.getProtocol(self._transport)
    oprot.writeMessageBegin('basePing', TMessageType.CALL, self._seqid)
    args = basePing_args()
    args.write(oprot)
    oprot.writeMessageEnd()
    oprot.trans.flush()

  def recv_basePing(self, iprot, mtype, rseqid):
    if mtype == TMessageType.EXCEPTION:
      x = TApplicationException()
      x.read(iprot)
      iprot.readMessageEnd()
      raise x
    result = basePing_result()
    result.read(iprot)
    iprot.readMessageEnd()
    return


class Processor(Iface, TProcessor):
  def __init__(self, handler):
    self._handler = handler
    self._processMap = {}
    self._processMap["basePing"] = Processor.process_basePing

  def process(self, iprot, oprot):
    (name, type, seqid) = iprot.readMessageBegin()
    if name not in self._processMap:
      iprot.skip(TType.STRUCT)
      iprot.readMessageEnd()
      x = TApplicationException(TApplicationException.UNKNOWN_METHOD, 'Unknown function %s' % (name))
      oprot.writeMessageBegin(name, TMessageType.EXCEPTION, seqid)
      x.write(oprot)
      oprot.writeMessageEnd()
      oprot.trans.flush()
      return
    else:
      return self._processMap[name](self, seqid, iprot, oprot)

  @gen.coroutine
  def process_basePing(self, seqid, iprot, oprot):
    args = basePing_args()
    args.read(iprot)
    iprot.readMessageEnd()
    result = basePing_result()
    yield gen.maybe_future(self._handler.basePing())
    oprot.writeMessageBegin("basePing", TMessageType.REPLY, seqid)
    result.write(oprot)
    oprot.writeMessageEnd()
    oprot.trans.flush()


# HELPER FUNCTIONS AND STRUCTURES

class basePing_args:

  thrift_spec = (
  )

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('basePing_args')
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    return


  def __hash__(self):
    value = 17
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class basePing_result:

  thrift_spec = (
  )

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('basePing_result')
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    return


  def __hash__(self):
    value = 17
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)