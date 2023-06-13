package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;
/* loaded from: classes5.dex */
public abstract class PropertySerializerMap {
    protected final boolean _resetWhenFull;

    /* loaded from: classes5.dex */
    public static final class Double extends PropertySerializerMap {
        private final JsonSerializer<Object> _serializer1;
        private final JsonSerializer<Object> _serializer2;
        private final Class<?> _type1;
        private final Class<?> _type2;

        public Double(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer, Class<?> cls2, JsonSerializer<Object> jsonSerializer2) {
            super(propertySerializerMap);
            this._type1 = cls;
            this._serializer1 = jsonSerializer;
            this._type2 = cls2;
            this._serializer2 = jsonSerializer2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new Multi(this, new TypeAndSerializer[]{new TypeAndSerializer(this._type1, this._serializer1), new TypeAndSerializer(this._type2, this._serializer2), new TypeAndSerializer(cls, jsonSerializer)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this._type1) {
                return this._serializer1;
            }
            if (cls == this._type2) {
                return this._serializer2;
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Empty extends PropertySerializerMap {
        public static final Empty FOR_PROPERTIES = new Empty(false);
        public static final Empty FOR_ROOT_VALUES = new Empty(true);

        public Empty(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new Single(this, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Multi extends PropertySerializerMap {
        private static final int MAX_ENTRIES = 8;
        private final TypeAndSerializer[] _entries;

        public Multi(PropertySerializerMap propertySerializerMap, TypeAndSerializer[] typeAndSerializerArr) {
            super(propertySerializerMap);
            this._entries = typeAndSerializerArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            TypeAndSerializer[] typeAndSerializerArr = this._entries;
            int length = typeAndSerializerArr.length;
            if (length == 8) {
                if (this._resetWhenFull) {
                    return new Single(this, cls, jsonSerializer);
                }
                return this;
            }
            TypeAndSerializer[] typeAndSerializerArr2 = (TypeAndSerializer[]) Arrays.copyOf(typeAndSerializerArr, length + 1);
            typeAndSerializerArr2[length] = new TypeAndSerializer(cls, jsonSerializer);
            return new Multi(this, typeAndSerializerArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            TypeAndSerializer typeAndSerializer;
            TypeAndSerializer typeAndSerializer2;
            TypeAndSerializer typeAndSerializer3;
            TypeAndSerializer typeAndSerializer4;
            TypeAndSerializer[] typeAndSerializerArr = this._entries;
            TypeAndSerializer typeAndSerializer5 = typeAndSerializerArr[0];
            if (typeAndSerializer5.type == cls) {
                return typeAndSerializer5.serializer;
            }
            TypeAndSerializer typeAndSerializer6 = typeAndSerializerArr[1];
            if (typeAndSerializer6.type == cls) {
                return typeAndSerializer6.serializer;
            }
            TypeAndSerializer typeAndSerializer7 = typeAndSerializerArr[2];
            if (typeAndSerializer7.type == cls) {
                return typeAndSerializer7.serializer;
            }
            switch (typeAndSerializerArr.length) {
                case 4:
                    typeAndSerializer = typeAndSerializerArr[3];
                    if (typeAndSerializer.type == cls) {
                        return typeAndSerializer.serializer;
                    }
                    return null;
                case 5:
                    typeAndSerializer2 = typeAndSerializerArr[4];
                    if (typeAndSerializer2.type == cls) {
                        return typeAndSerializer2.serializer;
                    }
                    typeAndSerializer = typeAndSerializerArr[3];
                    if (typeAndSerializer.type == cls) {
                    }
                    break;
                case 6:
                    typeAndSerializer3 = typeAndSerializerArr[5];
                    if (typeAndSerializer3.type == cls) {
                        return typeAndSerializer3.serializer;
                    }
                    typeAndSerializer2 = typeAndSerializerArr[4];
                    if (typeAndSerializer2.type == cls) {
                    }
                    typeAndSerializer = typeAndSerializerArr[3];
                    if (typeAndSerializer.type == cls) {
                    }
                    break;
                case 7:
                    typeAndSerializer4 = typeAndSerializerArr[6];
                    if (typeAndSerializer4.type == cls) {
                        return typeAndSerializer4.serializer;
                    }
                    typeAndSerializer3 = typeAndSerializerArr[5];
                    if (typeAndSerializer3.type == cls) {
                    }
                    typeAndSerializer2 = typeAndSerializerArr[4];
                    if (typeAndSerializer2.type == cls) {
                    }
                    typeAndSerializer = typeAndSerializerArr[3];
                    if (typeAndSerializer.type == cls) {
                    }
                    break;
                case 8:
                    TypeAndSerializer typeAndSerializer8 = typeAndSerializerArr[7];
                    if (typeAndSerializer8.type == cls) {
                        return typeAndSerializer8.serializer;
                    }
                    typeAndSerializer4 = typeAndSerializerArr[6];
                    if (typeAndSerializer4.type == cls) {
                    }
                    typeAndSerializer3 = typeAndSerializerArr[5];
                    if (typeAndSerializer3.type == cls) {
                    }
                    typeAndSerializer2 = typeAndSerializerArr[4];
                    if (typeAndSerializer2.type == cls) {
                    }
                    typeAndSerializer = typeAndSerializerArr[3];
                    if (typeAndSerializer.type == cls) {
                    }
                    break;
                default:
                    return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class SerializerAndMapResult {
        public final PropertySerializerMap map;
        public final JsonSerializer<Object> serializer;

        public SerializerAndMapResult(JsonSerializer<Object> jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.serializer = jsonSerializer;
            this.map = propertySerializerMap;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Single extends PropertySerializerMap {
        private final JsonSerializer<Object> _serializer;
        private final Class<?> _type;

        public Single(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            super(propertySerializerMap);
            this._type = cls;
            this._serializer = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new Double(this, this._type, this._serializer, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this._type) {
                return this._serializer;
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class TypeAndSerializer {
        public final JsonSerializer<Object> serializer;
        public final Class<?> type;

        public TypeAndSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            this.type = cls;
            this.serializer = jsonSerializer;
        }
    }

    public PropertySerializerMap(boolean z) {
        this._resetWhenFull = z;
    }

    public static PropertySerializerMap emptyForProperties() {
        return Empty.FOR_PROPERTIES;
    }

    public static PropertySerializerMap emptyForRootValues() {
        return Empty.FOR_ROOT_VALUES;
    }

    public final SerializerAndMapResult addSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(cls, jsonSerializer));
    }

    public final SerializerAndMapResult findAndAddKeySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findKeySerializer = serializerProvider.findKeySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findKeySerializer, newWith(cls, findKeySerializer));
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(cls, findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> findTypedValueSerializer = serializerProvider.findTypedValueSerializer(cls, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(cls, findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findContentValueSerializer = serializerProvider.findContentValueSerializer(cls, beanProperty);
        return new SerializerAndMapResult(findContentValueSerializer, newWith(cls, findContentValueSerializer));
    }

    public abstract PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer);

    public abstract JsonSerializer<Object> serializerFor(Class<?> cls);

    public final SerializerAndMapResult addSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(javaType.getRawClass(), jsonSerializer));
    }

    public PropertySerializerMap(PropertySerializerMap propertySerializerMap) {
        this._resetWhenFull = propertySerializerMap._resetWhenFull;
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(javaType.getRawClass(), findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> findTypedValueSerializer = serializerProvider.findTypedValueSerializer(javaType, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(javaType.getRawClass(), findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findContentValueSerializer = serializerProvider.findContentValueSerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findContentValueSerializer, newWith(javaType.getRawClass(), findContentValueSerializer));
    }
}