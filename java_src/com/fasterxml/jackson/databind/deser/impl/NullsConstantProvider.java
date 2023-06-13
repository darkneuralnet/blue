package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;
/* loaded from: classes5.dex */
public class NullsConstantProvider implements NullValueProvider, Serializable {
    private static final long serialVersionUID = 1;
    protected final AccessPattern _access;
    protected final Object _nullValue;
    private static final NullsConstantProvider SKIPPER = new NullsConstantProvider(null);
    private static final NullsConstantProvider NULLER = new NullsConstantProvider(null);

    public NullsConstantProvider(Object obj) {
        AccessPattern accessPattern;
        this._nullValue = obj;
        if (obj == null) {
            accessPattern = AccessPattern.ALWAYS_NULL;
        } else {
            accessPattern = AccessPattern.CONSTANT;
        }
        this._access = accessPattern;
    }

    public static NullsConstantProvider forValue(Object obj) {
        if (obj == null) {
            return NULLER;
        }
        return new NullsConstantProvider(obj);
    }

    public static boolean isNuller(NullValueProvider nullValueProvider) {
        return nullValueProvider == NULLER;
    }

    public static boolean isSkipper(NullValueProvider nullValueProvider) {
        return nullValueProvider == SKIPPER;
    }

    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
