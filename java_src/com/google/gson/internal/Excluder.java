package com.google.gson.internal;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class Excluder implements InterfaceC32096Cb6, Cloneable {

    /* renamed from: h */
    public static final Excluder f74502h = new Excluder();

    /* renamed from: e */
    public boolean f74506e;

    /* renamed from: b */
    public double f74503b = -1.0d;

    /* renamed from: c */
    public int f74504c = SyslogConstants.LOG_LOCAL1;

    /* renamed from: d */
    public boolean f74505d = true;

    /* renamed from: f */
    public List<InterfaceC52942zh1> f74507f = Collections.emptyList();

    /* renamed from: g */
    public List<InterfaceC52942zh1> f74508g = Collections.emptyList();

    /* renamed from: com.google.gson.internal.Excluder$a */
    /* loaded from: classes6.dex */
    public class C18393a extends AbstractC31862Bb6<T> {

        /* renamed from: a */
        public AbstractC31862Bb6<T> f74509a;

        /* renamed from: b */
        public final /* synthetic */ boolean f74510b;

        /* renamed from: c */
        public final /* synthetic */ boolean f74511c;

        /* renamed from: d */
        public final /* synthetic */ C46153oE1 f74512d;

        /* renamed from: e */
        public final /* synthetic */ C32798Fb6 f74513e;

        public C18393a(boolean z, boolean z2, C46153oE1 c46153oE1, C32798Fb6 c32798Fb6) {
            this.f74510b = z;
            this.f74511c = z2;
            this.f74512d = c46153oE1;
            this.f74513e = c32798Fb6;
        }

        /* renamed from: e */
        public final AbstractC31862Bb6<T> m46877e() {
            AbstractC31862Bb6<T> abstractC31862Bb6 = this.f74509a;
            if (abstractC31862Bb6 == 0) {
                AbstractC31862Bb6<T> m21551r = this.f74512d.m21551r(Excluder.this, this.f74513e);
                this.f74509a = m21551r;
                return m21551r;
            }
            return abstractC31862Bb6;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // p000.AbstractC31862Bb6
        public T read(JsonReader jsonReader) throws IOException {
            if (this.f74510b) {
                jsonReader.skipValue();
                return null;
            }
            return m46877e().read(jsonReader);
        }

        @Override // p000.AbstractC31862Bb6
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (this.f74511c) {
                jsonWriter.nullValue();
            } else {
                m46877e().write(jsonWriter, t);
            }
        }
    }

    @Override // p000.InterfaceC32096Cb6
    /* renamed from: d */
    public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
        boolean z;
        boolean z2;
        Class<? super T> rawType = c32798Fb6.getRawType();
        boolean m46887g = m46887g(rawType);
        if (!m46887g && !m46886h(rawType, true)) {
            z = false;
        } else {
            z = true;
        }
        if (!m46887g && !m46886h(rawType, false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return null;
        }
        return new C18393a(z2, z, c46153oE1, c32798Fb6);
    }

    /* renamed from: e */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public boolean m46888f(Class<?> cls, boolean z) {
        if (!m46887g(cls) && !m46886h(cls, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m46887g(Class<?> cls) {
        if (this.f74503b != -1.0d && !m46879p((InterfaceC38997cB5) cls.getAnnotation(InterfaceC38997cB5.class), (InterfaceC32357De6) cls.getAnnotation(InterfaceC32357De6.class))) {
            return true;
        }
        if (!this.f74505d && m46883l(cls)) {
            return true;
        }
        return m46884k(cls);
    }

    /* renamed from: h */
    public final boolean m46886h(Class<?> cls, boolean z) {
        List<InterfaceC52942zh1> list;
        if (z) {
            list = this.f74507f;
        } else {
            list = this.f74508g;
        }
        for (InterfaceC52942zh1 interfaceC52942zh1 : list) {
            if (interfaceC52942zh1.m561a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean m46885j(Field field, boolean z) {
        List<InterfaceC52942zh1> list;
        InterfaceC52952zi1 interfaceC52952zi1;
        if ((this.f74504c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f74503b != -1.0d && !m46879p((InterfaceC38997cB5) field.getAnnotation(InterfaceC38997cB5.class), (InterfaceC32357De6) field.getAnnotation(InterfaceC32357De6.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f74506e && ((interfaceC52952zi1 = (InterfaceC52952zi1) field.getAnnotation(InterfaceC52952zi1.class)) == null || (!z ? !interfaceC52952zi1.deserialize() : !interfaceC52952zi1.serialize()))) {
            return true;
        }
        if ((!this.f74505d && m46883l(field.getType())) || m46884k(field.getType())) {
            return true;
        }
        if (z) {
            list = this.f74507f;
        } else {
            list = this.f74508g;
        }
        if (!list.isEmpty()) {
            C35682Rk1 c35682Rk1 = new C35682Rk1(field);
            for (InterfaceC52942zh1 interfaceC52942zh1 : list) {
                if (interfaceC52942zh1.m560b(c35682Rk1)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m46884k(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls) && !m46882m(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m46883l(Class<?> cls) {
        return cls.isMemberClass() && !m46882m(cls);
    }

    /* renamed from: m */
    public final boolean m46882m(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: n */
    public final boolean m46881n(InterfaceC38997cB5 interfaceC38997cB5) {
        if (interfaceC38997cB5 == null) {
            return true;
        }
        if (this.f74503b >= interfaceC38997cB5.value()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m46880o(InterfaceC32357De6 interfaceC32357De6) {
        if (interfaceC32357De6 == null) {
            return true;
        }
        if (this.f74503b < interfaceC32357De6.value()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m46879p(InterfaceC38997cB5 interfaceC38997cB5, InterfaceC32357De6 interfaceC32357De6) {
        return m46881n(interfaceC38997cB5) && m46880o(interfaceC32357De6);
    }

    /* renamed from: q */
    public Excluder m46878q(int... iArr) {
        Excluder clone = clone();
        clone.f74504c = 0;
        for (int i : iArr) {
            clone.f74504c = i | clone.f74504c;
        }
        return clone;
    }
}
