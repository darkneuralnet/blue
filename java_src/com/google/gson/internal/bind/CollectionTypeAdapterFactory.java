package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes6.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC32096Cb6 {

    /* renamed from: b */
    public final C47193pz0 f74518b;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    /* loaded from: classes6.dex */
    public static final class C18395a<E> extends AbstractC31862Bb6<Collection<E>> {

        /* renamed from: a */
        public final AbstractC31862Bb6<E> f74519a;

        /* renamed from: b */
        public final InterfaceC33515Id3<? extends Collection<E>> f74520b;

        public C18395a(C46153oE1 c46153oE1, Type type, AbstractC31862Bb6<E> abstractC31862Bb6, InterfaceC33515Id3<? extends Collection<E>> interfaceC33515Id3) {
            this.f74519a = new C18447a(c46153oE1, abstractC31862Bb6, type);
            this.f74520b = interfaceC33515Id3;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> mo18357a = this.f74520b.mo18357a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                mo18357a.add(this.f74519a.read(jsonReader));
            }
            jsonReader.endArray();
            return mo18357a;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e : collection) {
                this.f74519a.write(jsonWriter, e);
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(C47193pz0 c47193pz0) {
        this.f74518b = c47193pz0;
    }

    @Override // p000.InterfaceC32096Cb6
    /* renamed from: d */
    public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
        Type type = c32798Fb6.getType();
        Class<? super T> rawType = c32798Fb6.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type m65154h = C12259b.m65154h(type, rawType);
        return new C18395a(c46153oE1, m65154h, c46153oE1.m21553p(C32798Fb6.get(m65154h)), this.f74518b.m18362b(c32798Fb6));
    }
}
