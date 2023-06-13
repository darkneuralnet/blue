package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
/* loaded from: classes5.dex */
public interface NullValueProvider {
    default Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    AccessPattern getNullAccessPattern();

    Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;
}
