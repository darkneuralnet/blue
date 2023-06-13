package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
/* loaded from: classes5.dex */
public final class WritableObjectId {
    public final ObjectIdGenerator<?> generator;

    /* renamed from: id */
    public Object f69966id;
    protected boolean idWritten = false;

    public WritableObjectId(ObjectIdGenerator<?> objectIdGenerator) {
        this.generator = objectIdGenerator;
    }

    public Object generateId(Object obj) {
        if (this.f69966id == null) {
            this.f69966id = this.generator.generateId(obj);
        }
        return this.f69966id;
    }

    public void writeAsField(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) throws IOException {
        String valueOf;
        this.idWritten = true;
        if (jsonGenerator.canWriteObjectId()) {
            Object obj = this.f69966id;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(obj);
            }
            jsonGenerator.writeObjectId(valueOf);
            return;
        }
        SerializableString serializableString = objectIdWriter.propertyName;
        if (serializableString != null) {
            jsonGenerator.writeFieldName(serializableString);
            objectIdWriter.serializer.serialize(this.f69966id, jsonGenerator, serializerProvider);
        }
    }

    public boolean writeAsId(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) throws IOException {
        if (this.f69966id != null) {
            if (this.idWritten || objectIdWriter.alwaysAsId) {
                if (jsonGenerator.canWriteObjectId()) {
                    jsonGenerator.writeObjectRef(String.valueOf(this.f69966id));
                    return true;
                }
                objectIdWriter.serializer.serialize(this.f69966id, jsonGenerator, serializerProvider);
                return true;
            }
            return false;
        }
        return false;
    }
}
