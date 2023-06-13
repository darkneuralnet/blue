package com.google.protobuf;
/* renamed from: com.google.protobuf.v */
/* loaded from: classes6.dex */
public class C18558v {

    /* renamed from: e */
    public static final C18525k f74881e = C18525k.m46121b();

    /* renamed from: a */
    public AbstractC18504e f74882a;

    /* renamed from: b */
    public C18525k f74883b;

    /* renamed from: c */
    public volatile InterfaceC18462D f74884c;

    /* renamed from: d */
    public volatile AbstractC18504e f74885d;

    /* renamed from: a */
    public void m45985a(InterfaceC18462D interfaceC18462D) {
        if (this.f74884c != null) {
            return;
        }
        synchronized (this) {
            if (this.f74884c != null) {
                return;
            }
            try {
                if (this.f74882a != null) {
                    this.f74884c = interfaceC18462D.getParserForType().mo46326a(this.f74882a, this.f74883b);
                    this.f74885d = this.f74882a;
                } else {
                    this.f74884c = interfaceC18462D;
                    this.f74885d = AbstractC18504e.f74797c;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f74884c = interfaceC18462D;
                this.f74885d = AbstractC18504e.f74797c;
            }
        }
    }

    /* renamed from: b */
    public int m45984b() {
        if (this.f74885d != null) {
            return this.f74885d.size();
        }
        AbstractC18504e abstractC18504e = this.f74882a;
        if (abstractC18504e != null) {
            return abstractC18504e.size();
        }
        if (this.f74884c != null) {
            return this.f74884c.getSerializedSize();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC18462D m45983c(InterfaceC18462D interfaceC18462D) {
        m45985a(interfaceC18462D);
        return this.f74884c;
    }

    /* renamed from: d */
    public InterfaceC18462D m45982d(InterfaceC18462D interfaceC18462D) {
        InterfaceC18462D interfaceC18462D2 = this.f74884c;
        this.f74882a = null;
        this.f74885d = null;
        this.f74884c = interfaceC18462D;
        return interfaceC18462D2;
    }

    /* renamed from: e */
    public AbstractC18504e m45981e() {
        if (this.f74885d != null) {
            return this.f74885d;
        }
        AbstractC18504e abstractC18504e = this.f74882a;
        if (abstractC18504e != null) {
            return abstractC18504e;
        }
        synchronized (this) {
            if (this.f74885d != null) {
                return this.f74885d;
            }
            if (this.f74884c == null) {
                this.f74885d = AbstractC18504e.f74797c;
            } else {
                this.f74885d = this.f74884c.mo46335d();
            }
            return this.f74885d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18558v)) {
            return false;
        }
        C18558v c18558v = (C18558v) obj;
        InterfaceC18462D interfaceC18462D = this.f74884c;
        InterfaceC18462D interfaceC18462D2 = c18558v.f74884c;
        if (interfaceC18462D == null && interfaceC18462D2 == null) {
            return m45981e().equals(c18558v.m45981e());
        }
        if (interfaceC18462D != null && interfaceC18462D2 != null) {
            return interfaceC18462D.equals(interfaceC18462D2);
        }
        if (interfaceC18462D != null) {
            return interfaceC18462D.equals(c18558v.m45983c(interfaceC18462D.getDefaultInstanceForType()));
        }
        return m45983c(interfaceC18462D2.getDefaultInstanceForType()).equals(interfaceC18462D2);
    }

    public int hashCode() {
        return 1;
    }
}
