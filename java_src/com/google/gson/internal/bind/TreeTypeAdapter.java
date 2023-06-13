package com.google.gson.internal.bind;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
/* loaded from: classes6.dex */
public final class TreeTypeAdapter<T> extends AbstractC39430ct5<T> {

    /* renamed from: a */
    public final InterfaceC44663lj2<T> f74564a;

    /* renamed from: b */
    public final InterfaceC50581vi2<T> f74565b;

    /* renamed from: c */
    public final C46153oE1 f74566c;

    /* renamed from: d */
    public final C32798Fb6<T> f74567d;

    /* renamed from: e */
    public final InterfaceC32096Cb6 f74568e;

    /* renamed from: f */
    public final TreeTypeAdapter<T>.C18408b f74569f;

    /* renamed from: g */
    public final boolean f74570g;

    /* renamed from: h */
    public volatile AbstractC31862Bb6<T> f74571h;

    /* loaded from: classes6.dex */
    public static final class SingleTypeFactory implements InterfaceC32096Cb6 {

        /* renamed from: b */
        public final C32798Fb6<?> f74572b;

        /* renamed from: c */
        public final boolean f74573c;

        /* renamed from: d */
        public final Class<?> f74574d;

        /* renamed from: e */
        public final InterfaceC44663lj2<?> f74575e;

        /* renamed from: f */
        public final InterfaceC50581vi2<?> f74576f;

        public SingleTypeFactory(Object obj, C32798Fb6<?> c32798Fb6, boolean z, Class<?> cls) {
            InterfaceC44663lj2<?> interfaceC44663lj2;
            boolean z2;
            if (obj instanceof InterfaceC44663lj2) {
                interfaceC44663lj2 = (InterfaceC44663lj2) obj;
            } else {
                interfaceC44663lj2 = null;
            }
            this.f74575e = interfaceC44663lj2;
            InterfaceC50581vi2<?> interfaceC50581vi2 = obj instanceof InterfaceC50581vi2 ? (InterfaceC50581vi2) obj : null;
            this.f74576f = interfaceC50581vi2;
            if (interfaceC44663lj2 == null && interfaceC50581vi2 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C10483a.m72139a(z2);
            this.f74572b = c32798Fb6;
            this.f74573c = z;
            this.f74574d = cls;
        }

        @Override // p000.InterfaceC32096Cb6
        /* renamed from: d */
        public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
            boolean isAssignableFrom;
            C32798Fb6<?> c32798Fb62 = this.f74572b;
            if (c32798Fb62 != null) {
                if (!c32798Fb62.equals(c32798Fb6) && (!this.f74573c || this.f74572b.getType() != c32798Fb6.getRawType())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.f74574d.isAssignableFrom(c32798Fb6.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.f74575e, this.f74576f, c46153oE1, c32798Fb6, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$b */
    /* loaded from: classes6.dex */
    public final class C18408b implements InterfaceC44070kj2, InterfaceC49989ui2 {
        public C18408b() {
        }

        @Override // p000.InterfaceC49989ui2
        /* renamed from: a */
        public <R> R mo9858a(AbstractC52360yi2 abstractC52360yi2, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.f74566c.m21560i(abstractC52360yi2, type);
        }
    }

    public TreeTypeAdapter(InterfaceC44663lj2<T> interfaceC44663lj2, InterfaceC50581vi2<T> interfaceC50581vi2, C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6, InterfaceC32096Cb6 interfaceC32096Cb6, boolean z) {
        this.f74569f = new C18408b();
        this.f74564a = interfaceC44663lj2;
        this.f74565b = interfaceC50581vi2;
        this.f74566c = c46153oE1;
        this.f74567d = c32798Fb6;
        this.f74568e = interfaceC32096Cb6;
        this.f74570g = z;
    }

    /* renamed from: g */
    public static InterfaceC32096Cb6 m46841g(C32798Fb6<?> c32798Fb6, Object obj) {
        boolean z;
        if (c32798Fb6.getType() == c32798Fb6.getRawType()) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, c32798Fb6, z, null);
    }

    @Override // p000.AbstractC39430ct5
    /* renamed from: e */
    public AbstractC31862Bb6<T> mo21532e() {
        return this.f74564a != null ? this : m46842f();
    }

    /* renamed from: f */
    public final AbstractC31862Bb6<T> m46842f() {
        AbstractC31862Bb6<T> abstractC31862Bb6 = this.f74571h;
        if (abstractC31862Bb6 == null) {
            AbstractC31862Bb6<T> m21551r = this.f74566c.m21551r(this.f74568e, this.f74567d);
            this.f74571h = m21551r;
            return m21551r;
        }
        return abstractC31862Bb6;
    }

    @Override // p000.AbstractC31862Bb6
    public T read(JsonReader jsonReader) throws IOException {
        if (this.f74565b == null) {
            return m46842f().read(jsonReader);
        }
        AbstractC52360yi2 m98885a = KR5.m98885a(jsonReader);
        if (this.f74570g && m98885a.m2880s()) {
            return null;
        }
        return this.f74565b.deserialize(m98885a, this.f74567d.getType(), this.f74569f);
    }

    @Override // p000.AbstractC31862Bb6
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        InterfaceC44663lj2<T> interfaceC44663lj2 = this.f74564a;
        if (interfaceC44663lj2 == null) {
            m46842f().write(jsonWriter, t);
        } else if (this.f74570g && t == null) {
            jsonWriter.nullValue();
        } else {
            KR5.m98884b(interfaceC44663lj2.serialize(t, this.f74567d.getType(), this.f74569f), jsonWriter);
        }
    }

    public TreeTypeAdapter(InterfaceC44663lj2<T> interfaceC44663lj2, InterfaceC50581vi2<T> interfaceC50581vi2, C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6, InterfaceC32096Cb6 interfaceC32096Cb6) {
        this(interfaceC44663lj2, interfaceC50581vi2, c46153oE1, c32798Fb6, interfaceC32096Cb6, true);
    }
}
