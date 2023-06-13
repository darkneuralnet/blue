package com.fasterxml.jackson.core.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes5.dex */
public abstract class TypeReference<T> implements Comparable<TypeReference<T>> {
    protected final Type _type;

    public TypeReference() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this._type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            return;
        }
        throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
    }

    public int compareTo(TypeReference<T> typeReference) {
        return 0;
    }

    public Type getType() {
        return this._type;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((TypeReference) ((TypeReference) obj));
    }
}