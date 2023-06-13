package com.google.gson.internal.bind;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* renamed from: com.google.gson.internal.bind.a */
/* loaded from: classes6.dex */
public final class C18447a<T> extends AbstractC31862Bb6<T> {

    /* renamed from: a */
    public final C46153oE1 f74648a;

    /* renamed from: b */
    public final AbstractC31862Bb6<T> f74649b;

    /* renamed from: c */
    public final Type f74650c;

    public C18447a(C46153oE1 c46153oE1, AbstractC31862Bb6<T> abstractC31862Bb6, Type type) {
        this.f74648a = c46153oE1;
        this.f74649b = abstractC31862Bb6;
        this.f74650c = type;
    }

    /* renamed from: e */
    public static Type m46774e(Type type, Object obj) {
        if (obj != null) {
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    /* renamed from: f */
    public static boolean m46773f(AbstractC31862Bb6<?> abstractC31862Bb6) {
        AbstractC31862Bb6<T> mo21532e;
        while ((abstractC31862Bb6 instanceof AbstractC39430ct5) && (mo21532e = ((AbstractC39430ct5) abstractC31862Bb6).mo21532e()) != abstractC31862Bb6) {
            abstractC31862Bb6 = mo21532e;
        }
        return abstractC31862Bb6 instanceof ReflectiveTypeAdapterFactory.AbstractC18403b;
    }

    @Override // p000.AbstractC31862Bb6
    public T read(JsonReader jsonReader) throws IOException {
        return this.f74649b.read(jsonReader);
    }

    @Override // p000.AbstractC31862Bb6
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        AbstractC31862Bb6<T> abstractC31862Bb6 = this.f74649b;
        Type m46774e = m46774e(this.f74650c, t);
        if (m46774e != this.f74650c) {
            abstractC31862Bb6 = this.f74648a.m21553p(C32798Fb6.get(m46774e));
            if ((abstractC31862Bb6 instanceof ReflectiveTypeAdapterFactory.AbstractC18403b) && !m46773f(this.f74649b)) {
                abstractC31862Bb6 = this.f74649b;
            }
        }
        abstractC31862Bb6.write(jsonWriter, t);
    }
}
