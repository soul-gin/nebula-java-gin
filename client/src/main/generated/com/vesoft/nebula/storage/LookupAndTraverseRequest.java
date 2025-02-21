/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

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
public class LookupAndTraverseRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LookupAndTraverseRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)2);
  private static final TField INDICES_FIELD_DESC = new TField("indices", TType.STRUCT, (short)3);
  private static final TField TRAVERSE_SPEC_FIELD_DESC = new TField("traverse_spec", TType.STRUCT, (short)4);
  private static final TField COMMON_FIELD_DESC = new TField("common", TType.STRUCT, (short)5);

  public int space_id;
  public List<Integer> parts;
  public IndexSpec indices;
  public TraverseSpec traverse_spec;
  public RequestCommon common;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int INDICES = 3;
  public static final int TRAVERSE_SPEC = 4;
  public static final int COMMON = 5;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(INDICES, new FieldMetaData("indices", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, IndexSpec.class)));
    tmpMetaDataMap.put(TRAVERSE_SPEC, new FieldMetaData("traverse_spec", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, TraverseSpec.class)));
    tmpMetaDataMap.put(COMMON, new FieldMetaData("common", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, RequestCommon.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(LookupAndTraverseRequest.class, metaDataMap);
  }

  public LookupAndTraverseRequest() {
  }

  public LookupAndTraverseRequest(
      int space_id,
      List<Integer> parts) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
  }

  public LookupAndTraverseRequest(
      int space_id,
      List<Integer> parts,
      IndexSpec indices,
      TraverseSpec traverse_spec) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.indices = indices;
    this.traverse_spec = traverse_spec;
  }

  public LookupAndTraverseRequest(
      int space_id,
      List<Integer> parts,
      IndexSpec indices,
      TraverseSpec traverse_spec,
      RequestCommon common) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.indices = indices;
    this.traverse_spec = traverse_spec;
    this.common = common;
  }

  public static class Builder {
    private int space_id;
    private List<Integer> parts;
    private IndexSpec indices;
    private TraverseSpec traverse_spec;
    private RequestCommon common;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final List<Integer> parts) {
      this.parts = parts;
      return this;
    }

    public Builder setIndices(final IndexSpec indices) {
      this.indices = indices;
      return this;
    }

    public Builder setTraverse_spec(final TraverseSpec traverse_spec) {
      this.traverse_spec = traverse_spec;
      return this;
    }

    public Builder setCommon(final RequestCommon common) {
      this.common = common;
      return this;
    }

    public LookupAndTraverseRequest build() {
      LookupAndTraverseRequest result = new LookupAndTraverseRequest();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      result.setIndices(this.indices);
      result.setTraverse_spec(this.traverse_spec);
      result.setCommon(this.common);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LookupAndTraverseRequest(LookupAndTraverseRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetIndices()) {
      this.indices = TBaseHelper.deepCopy(other.indices);
    }
    if (other.isSetTraverse_spec()) {
      this.traverse_spec = TBaseHelper.deepCopy(other.traverse_spec);
    }
    if (other.isSetCommon()) {
      this.common = TBaseHelper.deepCopy(other.common);
    }
  }

  public LookupAndTraverseRequest deepCopy() {
    return new LookupAndTraverseRequest(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public LookupAndTraverseRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public List<Integer> getParts() {
    return this.parts;
  }

  public LookupAndTraverseRequest setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  public IndexSpec getIndices() {
    return this.indices;
  }

  public LookupAndTraverseRequest setIndices(IndexSpec indices) {
    this.indices = indices;
    return this;
  }

  public void unsetIndices() {
    this.indices = null;
  }

  // Returns true if field indices is set (has been assigned a value) and false otherwise
  public boolean isSetIndices() {
    return this.indices != null;
  }

  public void setIndicesIsSet(boolean __value) {
    if (!__value) {
      this.indices = null;
    }
  }

  public TraverseSpec getTraverse_spec() {
    return this.traverse_spec;
  }

  public LookupAndTraverseRequest setTraverse_spec(TraverseSpec traverse_spec) {
    this.traverse_spec = traverse_spec;
    return this;
  }

  public void unsetTraverse_spec() {
    this.traverse_spec = null;
  }

  // Returns true if field traverse_spec is set (has been assigned a value) and false otherwise
  public boolean isSetTraverse_spec() {
    return this.traverse_spec != null;
  }

  public void setTraverse_specIsSet(boolean __value) {
    if (!__value) {
      this.traverse_spec = null;
    }
  }

  public RequestCommon getCommon() {
    return this.common;
  }

  public LookupAndTraverseRequest setCommon(RequestCommon common) {
    this.common = common;
    return this;
  }

  public void unsetCommon() {
    this.common = null;
  }

  // Returns true if field common is set (has been assigned a value) and false otherwise
  public boolean isSetCommon() {
    return this.common != null;
  }

  public void setCommonIsSet(boolean __value) {
    if (!__value) {
      this.common = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)__value);
      }
      break;

    case INDICES:
      if (__value == null) {
        unsetIndices();
      } else {
        setIndices((IndexSpec)__value);
      }
      break;

    case TRAVERSE_SPEC:
      if (__value == null) {
        unsetTraverse_spec();
      } else {
        setTraverse_spec((TraverseSpec)__value);
      }
      break;

    case COMMON:
      if (__value == null) {
        unsetCommon();
      } else {
        setCommon((RequestCommon)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case INDICES:
      return getIndices();

    case TRAVERSE_SPEC:
      return getTraverse_spec();

    case COMMON:
      return getCommon();

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
    if (!(_that instanceof LookupAndTraverseRequest))
      return false;
    LookupAndTraverseRequest that = (LookupAndTraverseRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetIndices(), that.isSetIndices(), this.indices, that.indices)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetTraverse_spec(), that.isSetTraverse_spec(), this.traverse_spec, that.traverse_spec)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetCommon(), that.isSetCommon(), this.common, that.common)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, parts, indices, traverse_spec, common});
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
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.LIST) {
            {
              TList _list189 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list189.size));
              for (int _i190 = 0; 
                   (_list189.size < 0) ? iprot.peekList() : (_i190 < _list189.size); 
                   ++_i190)
              {
                int _elem191;
                _elem191 = iprot.readI32();
                this.parts.add(_elem191);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case INDICES:
          if (__field.type == TType.STRUCT) {
            this.indices = new IndexSpec();
            this.indices.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TRAVERSE_SPEC:
          if (__field.type == TType.STRUCT) {
            this.traverse_spec = new TraverseSpec();
            this.traverse_spec.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case COMMON:
          if (__field.type == TType.STRUCT) {
            this.common = new RequestCommon();
            this.common.read(iprot);
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
    if (!isSetSpace_id()) {
      throw new TProtocolException("Required field 'space_id' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
        for (int _iter192 : this.parts)        {
          oprot.writeI32(_iter192);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.indices != null) {
      oprot.writeFieldBegin(INDICES_FIELD_DESC);
      this.indices.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.traverse_spec != null) {
      oprot.writeFieldBegin(TRAVERSE_SPEC_FIELD_DESC);
      this.traverse_spec.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.common != null) {
      if (isSetCommon()) {
        oprot.writeFieldBegin(COMMON_FIELD_DESC);
        this.common.write(oprot);
        oprot.writeFieldEnd();
      }
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
    StringBuilder sb = new StringBuilder("LookupAndTraverseRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("indices");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getIndices() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getIndices(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("traverse_spec");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getTraverse_spec() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getTraverse_spec(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetCommon())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("common");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getCommon() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getCommon(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'space_id' because it's a primitive and you chose the non-beans generator.
    if (parts == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'parts' was not present! Struct: " + toString());
    }
  }

}

