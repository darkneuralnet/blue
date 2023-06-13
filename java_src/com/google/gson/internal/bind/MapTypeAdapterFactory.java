package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes6.dex */
public final class MapTypeAdapterFactory implements InterfaceC32096Cb6 {

    /* renamed from: b */
    public final C47193pz0 f74524b;

    /* renamed from: c */
    public final boolean f74525c;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    /* loaded from: classes6.dex */
    public final class C18397a<K, V> extends AbstractC31862Bb6<Map<K, V>> {

        /* renamed from: a */
        public final AbstractC31862Bb6<K> f74526a;

        /* renamed from: b */
        public final AbstractC31862Bb6<V> f74527b;

        /* renamed from: c */
        public final InterfaceC33515Id3<? extends Map<K, V>> f74528c;

        public C18397a(C46153oE1 c46153oE1, Type type, AbstractC31862Bb6<K> abstractC31862Bb6, Type type2, AbstractC31862Bb6<V> abstractC31862Bb62, InterfaceC33515Id3<? extends Map<K, V>> interfaceC33515Id3) {
            this.f74526a = new C18447a(c46153oE1, abstractC31862Bb6, type);
            this.f74527b = new C18447a(c46153oE1, abstractC31862Bb62, type2);
            this.f74528c = interfaceC33515Id3;
        }

        /* renamed from: e */
        public final String m46869e(AbstractC52360yi2 abstractC52360yi2) {
            if (abstractC52360yi2.m2878v()) {
                C37537Zi2 m2884f = abstractC52360yi2.m2884f();
                if (m2884f.m72659A()) {
                    return String.valueOf(m2884f.m72656x());
                }
                if (m2884f.m72655y()) {
                    return Boolean.toString(m2884f.mo2888a());
                }
                if (m2884f.m72658C()) {
                    return m2884f.mo2882j();
                }
                throw new AssertionError();
            } else if (abstractC52360yi2.m2880s()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mo18357a = this.f74528c.mo18357a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K read = this.f74526a.read(jsonReader);
                    if (mo18357a.put(read, this.f74527b.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AbstractC41698gj2.INSTANCE.promoteNameToValue(jsonReader);
                    K read2 = this.f74526a.read(jsonReader);
                    if (mo18357a.put(read2, this.f74527b.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                jsonReader.endObject();
            }
            return mo18357a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC31862Bb6
        /* renamed from: g */
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            boolean z;
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!MapTypeAdapterFactory.this.f74525c) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f74527b.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    AbstractC52360yi2 m113811d = this.f74526a.m113811d(entry2.getKey());
                    arrayList.add(m113811d);
                    arrayList2.add(entry2.getValue());
                    if (!m113811d.m2881o() && !m113811d.m2879u()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 |= z;
                }
                if (z2) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        KR5.m98884b((AbstractC52360yi2) arrayList.get(i), jsonWriter);
                        this.f74527b.write(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    jsonWriter.name(m46869e((AbstractC52360yi2) arrayList.get(i)));
                    this.f74527b.write(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public MapTypeAdapterFactory(C47193pz0 c47193pz0, boolean z) {
        this.f74524b = c47193pz0;
        this.f74525c = z;
    }

    /* renamed from: a */
    public final AbstractC31862Bb6<?> m46870a(C46153oE1 c46153oE1, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return c46153oE1.m21553p(C32798Fb6.get(type));
        }
        return TypeAdapters.f74607f;
    }

    @Override // p000.InterfaceC32096Cb6
    /* renamed from: d */
    public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
        Type type = c32798Fb6.getType();
        Class<? super T> rawType = c32798Fb6.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] m65152j = C12259b.m65152j(type, rawType);
        return new C18397a(c46153oE1, m65152j[0], m46870a(c46153oE1, m65152j[0]), m65152j[1], c46153oE1.m21553p(C32798Fb6.get(m65152j[1])), this.f74524b.m18362b(c32798Fb6));
    }
}
