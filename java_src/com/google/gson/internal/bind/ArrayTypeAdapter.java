package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class ArrayTypeAdapter<E> extends AbstractC31862Bb6<Object> {

    /* renamed from: c */
    public static final InterfaceC32096Cb6 f74515c = new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // p000.InterfaceC32096Cb6
        /* renamed from: d */
        public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
            Type type = c32798Fb6.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type m65155g = C12259b.m65155g(type);
            return new ArrayTypeAdapter(c46153oE1, c46153oE1.m21553p(C32798Fb6.get(m65155g)), C12259b.m65151k(m65155g));
        }
    };

    /* renamed from: a */
    public final Class<E> f74516a;

    /* renamed from: b */
    public final AbstractC31862Bb6<E> f74517b;

    public ArrayTypeAdapter(C46153oE1 c46153oE1, AbstractC31862Bb6<E> abstractC31862Bb6, Class<E> cls) {
        this.f74517b = new C18447a(c46153oE1, abstractC31862Bb6, cls);
        this.f74516a = cls;
    }

    @Override // p000.AbstractC31862Bb6
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f74517b.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        if (this.f74516a.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.f74516a, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f74516a, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC31862Bb6
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f74517b.write(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
