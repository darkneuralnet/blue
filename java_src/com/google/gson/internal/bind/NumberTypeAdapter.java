package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
/* loaded from: classes6.dex */
public final class NumberTypeAdapter extends AbstractC31862Bb6<Number> {

    /* renamed from: b */
    public static final InterfaceC32096Cb6 f74530b = m46865f(EnumC38939c56.f60074c);

    /* renamed from: a */
    public final InterfaceC39550d56 f74531a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18399a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74533a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f74533a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74533a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74533a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(InterfaceC39550d56 interfaceC39550d56) {
        this.f74531a = interfaceC39550d56;
    }

    /* renamed from: e */
    public static InterfaceC32096Cb6 m46866e(InterfaceC39550d56 interfaceC39550d56) {
        if (interfaceC39550d56 == EnumC38939c56.f60074c) {
            return f74530b;
        }
        return m46865f(interfaceC39550d56);
    }

    /* renamed from: f */
    public static InterfaceC32096Cb6 m46865f(InterfaceC39550d56 interfaceC39550d56) {
        return new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
                if (c32798Fb6.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: g */
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i = C18399a.f74533a[peek.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new JsonSyntaxException("Expecting number, got: " + peek + "; at path " + jsonReader.getPath());
            }
            return this.f74531a.mo44615a(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: h */
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
