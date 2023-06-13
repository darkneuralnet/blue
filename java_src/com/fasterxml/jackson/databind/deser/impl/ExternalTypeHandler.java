package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class ExternalTypeHandler {
    private final JavaType _beanType;
    private final Map<String, Object> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    /* loaded from: classes5.dex */
    public static class Builder {
        private final JavaType _beanType;
        private final List<ExtTypedProperty> _properties = new ArrayList();
        private final Map<String, Object> _nameToPropertyIndex = new HashMap();

        public Builder(JavaType javaType) {
            this._beanType = javaType;
        }

        private void _addPropertyIndex(String str, Integer num) {
            Object obj = this._nameToPropertyIndex.get(str);
            if (obj == null) {
                this._nameToPropertyIndex.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this._nameToPropertyIndex.put(str, linkedList);
            }
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer valueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            _addPropertyIndex(settableBeanProperty.getName(), valueOf);
            _addPropertyIndex(typeDeserializer.getPropertyName(), valueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i = 0; i < size; i++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i);
                SettableBeanProperty find = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (find != null) {
                    extTypedProperty.linkTypeProperty(find);
                }
                extTypedPropertyArr[i] = extTypedProperty;
            }
            return new ExternalTypeHandler(this._beanType, extTypedPropertyArr, this._nameToPropertyIndex, null, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            return this._typeDeserializer.hasDefaultImpl();
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }
    }

    public ExternalTypeHandler(JavaType javaType, ExtTypedProperty[] extTypedPropertyArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._beanType = javaType;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = map;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    private final boolean _handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws IOException {
        boolean z = false;
        if (!this._properties[i].hasTypePropertyName(str)) {
            return false;
        }
        if (obj != null && this._tokens[i] != null) {
            z = true;
        }
        if (z) {
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str2);
            this._tokens[i] = null;
        } else {
            this._typeIds[i] = str2;
        }
        return true;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        JsonParser asParser = this._tokens[i].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.writeStartArray();
        bufferForInputBuffering.writeString(str);
        bufferForInputBuffering.copyCurrentStructure(asParser);
        bufferForInputBuffering.writeEndArray();
        JsonParser asParser2 = bufferForInputBuffering.asParser(jsonParser);
        asParser2.nextToken();
        return this._properties[i].getProperty().deserialize(asParser2, deserializationContext);
    }

    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this._beanType, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        JsonParser asParser = this._tokens[i].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i].getProperty().set(obj, null);
            return;
        }
        TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.writeStartArray();
        bufferForInputBuffering.writeString(str);
        bufferForInputBuffering.copyCurrentStructure(asParser);
        bufferForInputBuffering.writeEndArray();
        JsonParser asParser2 = bufferForInputBuffering.asParser(jsonParser);
        asParser2.nextToken();
        this._properties[i].getProperty().deserializeAndSet(asParser2, deserializationContext, obj);
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        int length = this._properties.length;
        for (int i = 0; i < length; i++) {
            String str = this._typeIds[i];
            ExtTypedProperty extTypedProperty = this._properties[i];
            if (str == null) {
                TokenBuffer tokenBuffer = this._tokens[i];
                if (tokenBuffer != null) {
                    if (tokenBuffer.firstToken().isScalarValue()) {
                        JsonParser asParser = tokenBuffer.asParser(jsonParser);
                        asParser.nextToken();
                        SettableBeanProperty property = extTypedProperty.getProperty();
                        Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(asParser, deserializationContext, property.getType());
                        if (deserializeIfNatural != null) {
                            property.set(obj, deserializeIfNatural);
                        }
                    }
                    if (!extTypedProperty.hasDefaultType()) {
                        deserializationContext.reportPropertyInputMismatch(this._beanType, extTypedProperty.getProperty().getName(), "Missing external type id property '%s' (and no 'defaultImpl' specified)", extTypedProperty.getTypePropertyName());
                    } else {
                        str = extTypedProperty.getDefaultTypeId();
                        if (str == null) {
                            deserializationContext.reportPropertyInputMismatch(this._beanType, extTypedProperty.getProperty().getName(), "Invalid default type id for property '%s': `null` returned by TypeIdResolver", extTypedProperty.getTypePropertyName());
                        }
                    }
                }
            } else if (this._tokens[i] == null) {
                SettableBeanProperty property2 = extTypedProperty.getProperty();
                if (property2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportPropertyInputMismatch(obj.getClass(), property2.getName(), "Missing property '%s' for external type id '%s'", property2.getName(), extTypedProperty.getTypePropertyName());
                }
                return obj;
            }
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r10._tokens[r0] != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r10._typeIds[r0] != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handlePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof List) {
            Iterator it = ((List) obj2).iterator();
            Integer num = (Integer) it.next();
            if (this._properties[num.intValue()].hasTypePropertyName(str)) {
                String text = jsonParser.getText();
                jsonParser.skipChildren();
                this._typeIds[num.intValue()] = text;
                while (it.hasNext()) {
                    this._typeIds[((Integer) it.next()).intValue()] = text;
                }
            } else {
                TokenBuffer bufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                this._tokens[num.intValue()] = bufferAsCopyOfValue;
                while (it.hasNext()) {
                    this._tokens[((Integer) it.next()).intValue()] = bufferAsCopyOfValue;
                }
            }
            return true;
        }
        int intValue = ((Integer) obj2).intValue();
        if (this._properties[intValue].hasTypePropertyName(str)) {
            this._typeIds[intValue] = jsonParser.getValueAsString();
            jsonParser.skipChildren();
            if (obj != null) {
            }
            if (z) {
                String[] strArr = this._typeIds;
                String str2 = strArr[intValue];
                strArr[intValue] = null;
                _deserializeAndSet(jsonParser, deserializationContext, obj, intValue, str2);
                this._tokens[intValue] = null;
            }
            return true;
        }
        this._tokens[intValue] = deserializationContext.bufferAsCopyOfValue(jsonParser);
        if (obj != null) {
        }
        if (z) {
        }
        return true;
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (obj2 instanceof List) {
            for (Integer num : (List) obj2) {
                if (_handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, num.intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return _handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._beanType = externalTypeHandler._beanType;
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r13.isEnabled(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer, PropertyBasedCreator propertyBasedCreator) throws IOException {
        String str;
        int length = this._properties.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            String str2 = this._typeIds[i];
            ExtTypedProperty extTypedProperty = this._properties[i];
            if (str2 == null) {
                TokenBuffer tokenBuffer = this._tokens[i];
                if (tokenBuffer != null && tokenBuffer.firstToken() != JsonToken.VALUE_NULL) {
                    if (!extTypedProperty.hasDefaultType()) {
                        deserializationContext.reportPropertyInputMismatch(this._beanType, extTypedProperty.getProperty().getName(), "Missing external type id property '%s'", extTypedProperty.getTypePropertyName());
                        str = str2;
                    } else {
                        str = extTypedProperty.getDefaultTypeId();
                    }
                }
            } else {
                str = str2;
                if (this._tokens[i] == null) {
                    SettableBeanProperty property = extTypedProperty.getProperty();
                    if (!property.isRequired()) {
                        str = str2;
                    }
                    deserializationContext.reportPropertyInputMismatch(this._beanType, property.getName(), "Missing property '%s' for external type id '%s'", property.getName(), this._properties[i].getTypePropertyName());
                    str = str2;
                }
            }
            if (this._tokens[i] != null) {
                objArr[i] = _deserialize(jsonParser, deserializationContext, i, str);
            }
            SettableBeanProperty property2 = extTypedProperty.getProperty();
            if (property2.getCreatorIndex() >= 0) {
                propertyValueBuffer.assignParameter(property2, objArr[i]);
                SettableBeanProperty typeProperty = extTypedProperty.getTypeProperty();
                if (typeProperty != null && typeProperty.getCreatorIndex() >= 0) {
                    Object obj = str;
                    if (!typeProperty.getType().hasRawClass(String.class)) {
                        TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
                        bufferForInputBuffering.writeString(str);
                        Object deserialize = typeProperty.getValueDeserializer().deserialize(bufferForInputBuffering.asParserOnFirstToken(), deserializationContext);
                        bufferForInputBuffering.close();
                        obj = deserialize;
                    }
                    propertyValueBuffer.assignParameter(typeProperty, obj);
                }
            }
        }
        Object build = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty property3 = this._properties[i2].getProperty();
            if (property3.getCreatorIndex() < 0) {
                property3.set(build, objArr[i2]);
            }
        }
        return build;
    }
}
