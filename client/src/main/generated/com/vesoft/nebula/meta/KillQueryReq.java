/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class KillQueryReq implements TBase, java.io.Serializable, Cloneable, Comparable<KillQueryReq> {
  private static final TStruct STRUCT_DESC = new TStruct("KillQueryReq");
  private static final TField KILL_QUERIES_FIELD_DESC = new TField("kill_queries", TType.MAP, (short)1);

  public Map<Long,Set<Long>> kill_queries;
  public static final int KILL_QUERIES = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(KILL_QUERIES, new FieldMetaData("kill_queries", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I64), 
            new SetMetaData(TType.SET, 
                new FieldValueMetaData(TType.I64)))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(KillQueryReq.class, metaDataMap);
  }

  public KillQueryReq() {
  }

  public KillQueryReq(
      Map<Long,Set<Long>> kill_queries) {
    this();
    this.kill_queries = kill_queries;
  }

  public static class Builder {
    private Map<Long,Set<Long>> kill_queries;

    public Builder() {
    }

    public Builder setKill_queries(final Map<Long,Set<Long>> kill_queries) {
      this.kill_queries = kill_queries;
      return this;
    }

    public KillQueryReq build() {
      KillQueryReq result = new KillQueryReq();
      result.setKill_queries(this.kill_queries);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KillQueryReq(KillQueryReq other) {
    if (other.isSetKill_queries()) {
      this.kill_queries = TBaseHelper.deepCopy(other.kill_queries);
    }
  }

  public KillQueryReq deepCopy() {
    return new KillQueryReq(this);
  }

  public Map<Long,Set<Long>> getKill_queries() {
    return this.kill_queries;
  }

  public KillQueryReq setKill_queries(Map<Long,Set<Long>> kill_queries) {
    this.kill_queries = kill_queries;
    return this;
  }

  public void unsetKill_queries() {
    this.kill_queries = null;
  }

  // Returns true if field kill_queries is set (has been assigned a value) and false otherwise
  public boolean isSetKill_queries() {
    return this.kill_queries != null;
  }

  public void setKill_queriesIsSet(boolean __value) {
    if (!__value) {
      this.kill_queries = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case KILL_QUERIES:
      if (__value == null) {
        unsetKill_queries();
      } else {
        setKill_queries((Map<Long,Set<Long>>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case KILL_QUERIES:
      return getKill_queries();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof KillQueryReq))
      return false;
    KillQueryReq that = (KillQueryReq)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetKill_queries(), that.isSetKill_queries(), this.kill_queries, that.kill_queries)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {kill_queries});
  }

  @Override
  public int compareTo(KillQueryReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKill_queries()).compareTo(other.isSetKill_queries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(kill_queries, other.kill_queries);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case KILL_QUERIES:
          if (__field.type == TType.MAP) {
            {
              TMap _map344 = iprot.readMapBegin();
              this.kill_queries = new HashMap<Long,Set<Long>>(Math.max(0, 2*_map344.size));
              for (int _i345 = 0; 
                   (_map344.size < 0) ? iprot.peekMap() : (_i345 < _map344.size); 
                   ++_i345)
              {
                long _key346;
                Set<Long> _val347;
                _key346 = iprot.readI64();
                {
                  TSet _set348 = iprot.readSetBegin();
                  _val347 = new HashSet<Long>(Math.max(0, 2*_set348.size));
                  for (int _i349 = 0; 
                       (_set348.size < 0) ? iprot.peekSet() : (_i349 < _set348.size); 
                       ++_i349)
                  {
                    long _elem350;
                    _elem350 = iprot.readI64();
                    _val347.add(_elem350);
                  }
                  iprot.readSetEnd();
                }
                this.kill_queries.put(_key346, _val347);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.kill_queries != null) {
      oprot.writeFieldBegin(KILL_QUERIES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.SET, this.kill_queries.size()));
        for (Map.Entry<Long, Set<Long>> _iter351 : this.kill_queries.entrySet())        {
          oprot.writeI64(_iter351.getKey());
          {
            oprot.writeSetBegin(new TSet(TType.I64, _iter351.getValue().size()));
            for (long _iter352 : _iter351.getValue())            {
              oprot.writeI64(_iter352);
            }
            oprot.writeSetEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("KillQueryReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("kill_queries");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getKill_queries() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getKill_queries(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

