package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.x */
/* loaded from: classes6.dex */
public class C18252x {

    /* renamed from: e */
    public static final C18219m f74226e = C18219m.m47528b();

    /* renamed from: a */
    public AbstractC18199g f74227a;

    /* renamed from: b */
    public C18219m f74228b;

    /* renamed from: c */
    public volatile InterfaceC18149F f74229c;

    /* renamed from: d */
    public volatile AbstractC18199g f74230d;

    /* renamed from: a */
    public void m47408a(InterfaceC18149F interfaceC18149F) {
        if (this.f74229c != null) {
            return;
        }
        synchronized (this) {
            if (this.f74229c != null) {
                return;
            }
            try {
                if (this.f74227a != null) {
                    this.f74229c = interfaceC18149F.getParserForType().mo47790a(this.f74227a, this.f74228b);
                    this.f74230d = this.f74227a;
                } else {
                    this.f74229c = interfaceC18149F;
                    this.f74230d = AbstractC18199g.f74142c;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f74229c = interfaceC18149F;
                this.f74230d = AbstractC18199g.f74142c;
            }
        }
    }

    /* renamed from: b */
    public int m47407b() {
        if (this.f74230d != null) {
            return this.f74230d.size();
        }
        AbstractC18199g abstractC18199g = this.f74227a;
        if (abstractC18199g != null) {
            return abstractC18199g.size();
        }
        if (this.f74229c != null) {
            return this.f74229c.getSerializedSize();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC18149F m47406c(InterfaceC18149F interfaceC18149F) {
        m47408a(interfaceC18149F);
        return this.f74229c;
    }

    /* renamed from: d */
    public InterfaceC18149F m47405d(InterfaceC18149F interfaceC18149F) {
        InterfaceC18149F interfaceC18149F2 = this.f74229c;
        this.f74227a = null;
        this.f74230d = null;
        this.f74229c = interfaceC18149F;
        return interfaceC18149F2;
    }

    /* renamed from: e */
    public AbstractC18199g m47404e() {
        if (this.f74230d != null) {
            return this.f74230d;
        }
        AbstractC18199g abstractC18199g = this.f74227a;
        if (abstractC18199g != null) {
            return abstractC18199g;
        }
        synchronized (this) {
            if (this.f74230d != null) {
                return this.f74230d;
            }
            if (this.f74229c == null) {
                this.f74230d = AbstractC18199g.f74142c;
            } else {
                this.f74230d = this.f74229c.mo47796d();
            }
            return this.f74230d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18252x)) {
            return false;
        }
        C18252x c18252x = (C18252x) obj;
        InterfaceC18149F interfaceC18149F = this.f74229c;
        InterfaceC18149F interfaceC18149F2 = c18252x.f74229c;
        if (interfaceC18149F == null && interfaceC18149F2 == null) {
            return m47404e().equals(c18252x.m47404e());
        }
        if (interfaceC18149F != null && interfaceC18149F2 != null) {
            return interfaceC18149F.equals(interfaceC18149F2);
        }
        if (interfaceC18149F != null) {
            return interfaceC18149F.equals(c18252x.m47406c(interfaceC18149F.getDefaultInstanceForType()));
        }
        return m47406c(interfaceC18149F2.getDefaultInstanceForType()).equals(interfaceC18149F2);
    }

    public int hashCode() {
        return 1;
    }
}
