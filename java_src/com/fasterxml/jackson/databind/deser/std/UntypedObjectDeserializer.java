package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@JacksonStdImpl
/* loaded from: classes5.dex */
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements ResolvableDeserializer, ContextualDeserializer {
    protected static final Object[] NO_OBJECTS = new Object[0];
    private static final long serialVersionUID = 1;
    protected JsonDeserializer<Object> _listDeserializer;
    protected JavaType _listType;
    protected JsonDeserializer<Object> _mapDeserializer;
    protected JavaType _mapType;
    protected final boolean _nonMerging;
    protected JsonDeserializer<Object> _numberDeserializer;
    protected JsonDeserializer<Object> _stringDeserializer;

    @JacksonStdImpl
    /* loaded from: classes5.dex */
    public static class Vanilla extends StdDeserializer<Object> {
        private static final int MAX_DEPTH = 1000;
        private static final long serialVersionUID = 1;
        public static final Vanilla std = new Vanilla();
        protected final boolean _nonMerging;

        public Vanilla() {
            this(false);
        }

        private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }

        public static Vanilla instance(boolean z) {
            if (z) {
                return new Vanilla(true);
            }
            return std;
        }

        public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
            boolean isEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (isEnabled) {
                _squashDups(map, str, obj, obj2);
            }
            while (str2 != null) {
                jsonParser.nextToken();
                Object deserialize = deserialize(jsonParser, deserializationContext);
                Object put = map.put(str2, deserialize);
                if (put != null && isEnabled) {
                    _squashDups(map, str2, put, deserialize);
                }
                str2 = jsonParser.nextFieldName();
            }
            return map;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return deserialize(jsonParser, deserializationContext, 0);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId != 1 && currentTokenId != 3) {
                switch (currentTokenId) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.getText();
                    case 7:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                            return jsonParser.getBigIntegerValue();
                        }
                        return jsonParser.getNumberValue();
                    case 8:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return jsonParser.getDecimalValue();
                        }
                        return jsonParser.getNumberValue();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.getEmbeddedObject();
                    default:
                        return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                }
            }
            return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public LogicalType logicalType() {
            return LogicalType.Untyped;
        }

        @Deprecated
        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapArray(jsonParser, deserializationContext, 0);
        }

        @Deprecated
        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapArrayToArray(jsonParser, deserializationContext, 0);
        }

        @Deprecated
        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapObject(jsonParser, deserializationContext, 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
            if (this._nonMerging) {
                return Boolean.FALSE;
            }
            return null;
        }

        public Vanilla(boolean z) {
            super(Object.class);
            this._nonMerging = z;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            switch (jsonParser.currentTokenId()) {
                case 1:
                    if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return UntypedObjectDeserializer.NO_OBJECTS;
                        }
                        return new ArrayList(2);
                    } else if (i <= 1000) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return mapArrayToArray(jsonParser, deserializationContext, i);
                        }
                        return mapArray(jsonParser, deserializationContext, i);
                    } else {
                        throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
                    }
                case 4:
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                case 5:
                    break;
                case 6:
                    return jsonParser.getText();
                case 7:
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.getNumberValue();
                case 8:
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.getDecimalValue();
                    }
                    return jsonParser.getNumberValue();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.getEmbeddedObject();
            }
            if (i <= 1000) {
                return mapObject(jsonParser, deserializationContext, i);
            }
            throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
        }

        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            Object deserialize = deserialize(jsonParser, deserializationContext, i2);
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            int i3 = 2;
            if (nextToken == jsonToken) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(deserialize);
                return arrayList;
            }
            Object deserialize2 = deserialize(jsonParser, deserializationContext, i2);
            if (jsonParser.nextToken() == jsonToken) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(deserialize);
                arrayList2.add(deserialize2);
                return arrayList2;
            }
            ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
            resetAndStart[0] = deserialize;
            resetAndStart[1] = deserialize2;
            int i4 = 2;
            while (true) {
                Object deserialize3 = deserialize(jsonParser, deserializationContext, i2);
                i3++;
                if (i4 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i4 = 0;
                }
                int i5 = i4 + 1;
                resetAndStart[i4] = deserialize3;
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    ArrayList arrayList3 = new ArrayList(i3);
                    leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i5, arrayList3);
                    return arrayList3;
                }
                i4 = i5;
            }
        }

        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
            int i3 = 0;
            while (true) {
                Object deserialize = deserialize(jsonParser, deserializationContext, i2);
                if (i3 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i3 = 0;
                }
                int i4 = i3 + 1;
                resetAndStart[i3] = deserialize;
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    return leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i4);
                }
                i3 = i4;
            }
        }

        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            String currentName = jsonParser.currentName();
            jsonParser.nextToken();
            Object deserialize = deserialize(jsonParser, deserializationContext, i2);
            String nextFieldName = jsonParser.nextFieldName();
            if (nextFieldName == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(currentName, deserialize);
                return linkedHashMap;
            }
            jsonParser.nextToken();
            Object deserialize2 = deserialize(jsonParser, deserializationContext, i2);
            String nextFieldName2 = jsonParser.nextFieldName();
            if (nextFieldName2 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(currentName, deserialize);
                return linkedHashMap2.put(nextFieldName, deserialize2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, currentName, deserialize, deserialize2, nextFieldName2) : linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(currentName, deserialize);
            if (linkedHashMap3.put(nextFieldName, deserialize2) != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, currentName, deserialize, deserialize2, nextFieldName2);
            }
            String str = nextFieldName2;
            do {
                jsonParser.nextToken();
                Object deserialize3 = deserialize(jsonParser, deserializationContext, i2);
                Object put = linkedHashMap3.put(str, deserialize3);
                if (put != null) {
                    return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, str, put, deserialize3, jsonParser.nextFieldName());
                }
                str = jsonParser.nextFieldName();
            } while (str != null);
            return linkedHashMap3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x001a, code lost:
            if (r0 != 5) goto L29;
         */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            Object deserialize;
            if (this._nonMerging) {
                return deserialize(jsonParser, deserializationContext);
            }
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId != 1) {
                if (currentTokenId != 2) {
                    if (currentTokenId == 3) {
                        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                            return obj;
                        }
                        if (obj instanceof Collection) {
                            Collection collection = (Collection) obj;
                            do {
                                collection.add(deserialize(jsonParser, deserializationContext));
                            } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                        }
                        return deserialize(jsonParser, deserializationContext);
                    } else if (currentTokenId != 4) {
                    }
                }
                return obj;
            } else if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                return obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String currentName = jsonParser.currentName();
                do {
                    jsonParser.nextToken();
                    Object obj2 = map.get(currentName);
                    if (obj2 != null) {
                        deserialize = deserialize(jsonParser, deserializationContext, obj2);
                    } else {
                        deserialize = deserialize(jsonParser, deserializationContext);
                    }
                    if (deserialize != obj2) {
                        map.put(currentName, deserialize);
                    }
                    currentName = jsonParser.nextFieldName();
                } while (currentName != null);
                return obj;
            }
            return deserialize(jsonParser, deserializationContext);
        }
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((JavaType) null, (JavaType) null);
    }

    private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        map.put(str, arrayList);
    }

    public JsonDeserializer<Object> _clearIfStdImpl(JsonDeserializer<Object> jsonDeserializer) {
        if (ClassUtil.isJacksonStdImpl(jsonDeserializer)) {
            return null;
        }
        return jsonDeserializer;
    }

    public JsonDeserializer<Object> _findCustomDeser(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return deserializationContext.findNonContextualValueDeserializer(javaType);
    }

    public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean isEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (isEnabled) {
            _squashDups(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.nextToken();
            Object deserialize = deserialize(jsonParser, deserializationContext);
            Object put = map.put(str2, deserialize);
            if (put != null && isEnabled) {
                _squashDups(map, str, put, deserialize);
            }
            str2 = jsonParser.nextFieldName();
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        boolean z;
        if (beanProperty == null && Boolean.FALSE.equals(deserializationContext.getConfig().getDefaultMergeable(Object.class))) {
            z = true;
        } else {
            z = false;
        }
        if (this._stringDeserializer == null && this._numberDeserializer == null && this._mapDeserializer == null && this._listDeserializer == null && getClass() == UntypedObjectDeserializer.class) {
            return Vanilla.instance(z);
        }
        if (z != this._nonMerging) {
            return new UntypedObjectDeserializer(this, z);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer<Object> jsonDeserializer = this._mapDeserializer;
                if (jsonDeserializer != null) {
                    return jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                return mapObject(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                JsonDeserializer<Object> jsonDeserializer2 = this._listDeserializer;
                if (jsonDeserializer2 != null) {
                    return jsonDeserializer2.deserialize(jsonParser, deserializationContext);
                }
                return mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            case 6:
                JsonDeserializer<Object> jsonDeserializer3 = this._stringDeserializer;
                if (jsonDeserializer3 != null) {
                    return jsonDeserializer3.deserialize(jsonParser, deserializationContext);
                }
                return jsonParser.getText();
            case 7:
                JsonDeserializer<Object> jsonDeserializer4 = this._numberDeserializer;
                if (jsonDeserializer4 != null) {
                    return jsonDeserializer4.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.getNumberValue();
            case 8:
                JsonDeserializer<Object> jsonDeserializer5 = this._numberDeserializer;
                if (jsonDeserializer5 != null) {
                    return jsonDeserializer5.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId != 1 && currentTokenId != 3) {
            switch (currentTokenId) {
                case 5:
                    break;
                case 6:
                    JsonDeserializer<Object> jsonDeserializer = this._stringDeserializer;
                    if (jsonDeserializer != null) {
                        return jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                    return jsonParser.getText();
                case 7:
                    JsonDeserializer<Object> jsonDeserializer2 = this._numberDeserializer;
                    if (jsonDeserializer2 != null) {
                        return jsonDeserializer2.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.getNumberValue();
                case 8:
                    JsonDeserializer<Object> jsonDeserializer3 = this._numberDeserializer;
                    if (jsonDeserializer3 != null) {
                        return jsonDeserializer3.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.getDecimalValue();
                    }
                    return jsonParser.getNumberValue();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.getEmbeddedObject();
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            }
        }
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken nextToken = jsonParser.nextToken();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i = 2;
        if (nextToken == jsonToken) {
            return new ArrayList(2);
        }
        Object deserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(deserialize);
            return arrayList;
        }
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(deserialize);
            arrayList2.add(deserialize2);
            return arrayList2;
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        resetAndStart[0] = deserialize;
        resetAndStart[1] = deserialize2;
        int i2 = 2;
        while (true) {
            Object deserialize3 = deserialize(jsonParser, deserializationContext);
            i++;
            if (i2 >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i2 = 0;
            }
            int i3 = i2 + 1;
            resetAndStart[i2] = deserialize3;
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i3, arrayList3);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return NO_OBJECTS;
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0;
        while (true) {
            Object deserialize = deserialize(jsonParser, deserializationContext);
            if (i >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i = 0;
            }
            int i2 = i + 1;
            resetAndStart[i] = deserialize;
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                return leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i2);
            }
            i = i2;
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            str = jsonParser.nextFieldName();
        } else if (currentToken == JsonToken.FIELD_NAME) {
            str = jsonParser.currentName();
        } else if (currentToken != JsonToken.END_OBJECT) {
            return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.nextToken();
        Object deserialize = deserialize(jsonParser, deserializationContext);
        String nextFieldName = jsonParser.nextFieldName();
        if (nextFieldName == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str2, deserialize);
            return linkedHashMap;
        }
        jsonParser.nextToken();
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        String nextFieldName2 = jsonParser.nextFieldName();
        if (nextFieldName2 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str2, deserialize);
            return linkedHashMap2.put(nextFieldName, deserialize2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, str2, deserialize, deserialize2, nextFieldName2) : linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str2, deserialize);
        if (linkedHashMap3.put(nextFieldName, deserialize2) != null) {
            return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, str2, deserialize, deserialize2, nextFieldName2);
        }
        do {
            jsonParser.nextToken();
            Object deserialize3 = deserialize(jsonParser, deserializationContext);
            Object put = linkedHashMap3.put(nextFieldName2, deserialize3);
            if (put != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, nextFieldName2, put, deserialize3, jsonParser.nextFieldName());
            }
            nextFieldName2 = jsonParser.nextFieldName();
        } while (nextFieldName2 != null);
        return linkedHashMap3;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType constructType = deserializationContext.constructType(Object.class);
        JavaType constructType2 = deserializationContext.constructType(String.class);
        TypeFactory typeFactory = deserializationContext.getTypeFactory();
        JavaType javaType = this._listType;
        if (javaType == null) {
            this._listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructCollectionType(List.class, constructType)));
        } else {
            this._listDeserializer = _findCustomDeser(deserializationContext, javaType);
        }
        JavaType javaType2 = this._mapType;
        if (javaType2 == null) {
            this._mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructMapType(Map.class, constructType2, constructType)));
        } else {
            this._mapDeserializer = _findCustomDeser(deserializationContext, javaType2);
        }
        this._stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, constructType2));
        this._numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructType(Number.class)));
        JavaType unknownType = TypeFactory.unknownType();
        this._mapDeserializer = deserializationContext.handleSecondaryContextualization(this._mapDeserializer, null, unknownType);
        this._listDeserializer = deserializationContext.handleSecondaryContextualization(this._listDeserializer, null, unknownType);
        this._stringDeserializer = deserializationContext.handleSecondaryContextualization(this._stringDeserializer, null, unknownType);
        this._numberDeserializer = deserializationContext.handleSecondaryContextualization(this._numberDeserializer, null, unknownType);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super(Object.class);
        this._listType = javaType;
        this._mapType = javaType2;
        this._nonMerging = false;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, JsonDeserializer<?> jsonDeserializer3, JsonDeserializer<?> jsonDeserializer4) {
        super(Object.class);
        this._mapDeserializer = jsonDeserializer;
        this._listDeserializer = jsonDeserializer2;
        this._stringDeserializer = jsonDeserializer3;
        this._numberDeserializer = jsonDeserializer4;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = untypedObjectDeserializer._nonMerging;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super(Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            collection.add(deserialize(jsonParser, deserializationContext));
        }
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._nonMerging) {
            return deserialize(jsonParser, deserializationContext);
        }
        switch (jsonParser.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer<Object> jsonDeserializer = this._mapDeserializer;
                if (jsonDeserializer != null) {
                    return jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Map) {
                    return mapObject(jsonParser, deserializationContext, (Map) obj);
                }
                return mapObject(jsonParser, deserializationContext);
            case 3:
                JsonDeserializer<Object> jsonDeserializer2 = this._listDeserializer;
                if (jsonDeserializer2 != null) {
                    return jsonDeserializer2.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Collection) {
                    return mapArray(jsonParser, deserializationContext, (Collection) obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                return mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserialize(jsonParser, deserializationContext);
            case 6:
                JsonDeserializer<Object> jsonDeserializer3 = this._stringDeserializer;
                if (jsonDeserializer3 != null) {
                    return jsonDeserializer3.deserialize(jsonParser, deserializationContext, obj);
                }
                return jsonParser.getText();
            case 7:
                JsonDeserializer<Object> jsonDeserializer4 = this._numberDeserializer;
                if (jsonDeserializer4 != null) {
                    return jsonDeserializer4.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.getNumberValue();
            case 8:
                JsonDeserializer<Object> jsonDeserializer5 = this._numberDeserializer;
                if (jsonDeserializer5 != null) {
                    return jsonDeserializer5.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        Object deserialize;
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        if (currentToken == JsonToken.END_OBJECT) {
            return map;
        }
        String currentName = jsonParser.currentName();
        do {
            jsonParser.nextToken();
            Object obj = map.get(currentName);
            if (obj != null) {
                deserialize = deserialize(jsonParser, deserializationContext, obj);
            } else {
                deserialize = deserialize(jsonParser, deserializationContext);
            }
            if (deserialize != obj) {
                map.put(currentName, deserialize);
            }
            currentName = jsonParser.nextFieldName();
        } while (currentName != null);
        return map;
    }
}
