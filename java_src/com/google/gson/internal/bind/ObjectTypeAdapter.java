package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ObjectTypeAdapter extends AbstractC31862Bb6<Object> {

    /* renamed from: c */
    public static final InterfaceC32096Cb6 f74534c = m46861f(EnumC38939c56.f60073b);

    /* renamed from: a */
    public final C46153oE1 f74535a;

    /* renamed from: b */
    public final InterfaceC39550d56 f74536b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18401a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74538a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f74538a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74538a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74538a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74538a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74538a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74538a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: e */
    public static InterfaceC32096Cb6 m46862e(InterfaceC39550d56 interfaceC39550d56) {
        if (interfaceC39550d56 == EnumC38939c56.f60073b) {
            return f74534c;
        }
        return m46861f(interfaceC39550d56);
    }

    /* renamed from: f */
    public static InterfaceC32096Cb6 m46861f(final InterfaceC39550d56 interfaceC39550d56) {
        return new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
                if (c32798Fb6.getRawType() != Object.class) {
                    return null;
                }
                return new ObjectTypeAdapter(c46153oE1, InterfaceC39550d56.this);
            }
        };
    }

    /* renamed from: g */
    public final Object m46860g(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = C18401a.f74538a[jsonToken.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        jsonReader.nextNull();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + jsonToken);
                }
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
            return this.f74536b.mo44615a(jsonReader);
        }
        return jsonReader.nextString();
    }

    /* renamed from: h */
    public final Object m46859h(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = C18401a.f74538a[jsonToken.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new C36448Ur2();
        }
        jsonReader.beginArray();
        return new ArrayList();
    }

    @Override // p000.AbstractC31862Bb6
    public Object read(JsonReader jsonReader) throws IOException {
        String str;
        boolean z;
        JsonToken peek = jsonReader.peek();
        Object m46859h = m46859h(jsonReader, peek);
        if (m46859h == null) {
            return m46860g(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                if (m46859h instanceof Map) {
                    str = jsonReader.nextName();
                } else {
                    str = null;
                }
                JsonToken peek2 = jsonReader.peek();
                Object m46859h2 = m46859h(jsonReader, peek2);
                if (m46859h2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (m46859h2 == null) {
                    m46859h2 = m46860g(jsonReader, peek2);
                }
                if (m46859h instanceof List) {
                    ((List) m46859h).add(m46859h2);
                } else {
                    ((Map) m46859h).put(str, m46859h2);
                }
                if (z) {
                    arrayDeque.addLast(m46859h);
                    m46859h = m46859h2;
                }
            } else {
                if (m46859h instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return m46859h;
                }
                m46859h = arrayDeque.removeLast();
            }
        }
    }

    @Override // p000.AbstractC31862Bb6
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AbstractC31862Bb6 m21552q = this.f74535a.m21552q(obj.getClass());
        if (m21552q instanceof ObjectTypeAdapter) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        m21552q.write(jsonWriter, obj);
    }

    public ObjectTypeAdapter(C46153oE1 c46153oE1, InterfaceC39550d56 interfaceC39550d56) {
        this.f74535a = c46153oE1;
        this.f74536b = interfaceC39550d56;
    }
}
