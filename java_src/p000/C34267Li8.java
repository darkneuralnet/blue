package p000;

import android.net.Uri;
import p000.Np9;
/* renamed from: Li8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34267Li8<T extends Np9> extends AbstractC31720Al8<T> {

    /* renamed from: a */
    public Uri f21960a;

    /* renamed from: b */
    public T f21961b;

    /* renamed from: c */
    public C45262mj8<T> f21962c;

    /* renamed from: d */
    public ZP8<InterfaceC34744Nj8<T>> f21963d;

    /* renamed from: e */
    public Boolean f21964e;

    /* renamed from: f */
    public Boolean f21965f;

    /* renamed from: g */
    public Boolean f21966g;

    /* renamed from: h */
    public C35014On8 f21967h;

    @Override // p000.AbstractC31720Al8
    /* renamed from: a */
    public final AbstractC31720Al8<T> mo96418a(boolean z) {
        this.f21966g = Boolean.FALSE;
        return this;
    }

    @Override // p000.AbstractC31720Al8
    /* renamed from: b */
    public final AbstractC31720Al8<T> mo96417b(C45262mj8<T> c45262mj8) {
        this.f21962c = c45262mj8;
        return this;
    }

    @Override // p000.AbstractC31720Al8
    /* renamed from: c */
    public final AbstractC31720Al8<T> mo96416c(T t) {
        if (t != null) {
            this.f21961b = t;
            return this;
        }
        throw new NullPointerException("Null schema");
    }

    @Override // p000.AbstractC31720Al8
    /* renamed from: d */
    public final AbstractC31720Al8<T> mo96415d(boolean z) {
        this.f21965f = Boolean.FALSE;
        return this;
    }

    @Override // p000.AbstractC31720Al8
    /* renamed from: e */
    public final AbstractC31720Al8<T> mo96414e(Uri uri) {
        if (uri != null) {
            this.f21960a = uri;
            return this;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // p000.AbstractC31720Al8
    /* renamed from: f */
    public final AbstractC31720Al8<T> mo96413f(boolean z) {
        this.f21964e = Boolean.valueOf(z);
        return this;
    }

    @Override // p000.AbstractC31720Al8
    /* renamed from: g */
    public final AbstractC34996Ol8<T> mo96412g() {
        T t;
        C45262mj8<T> c45262mj8;
        C35014On8 c35014On8;
        Boolean bool;
        if (this.f21963d == null) {
            this.f21963d = ZP8.m73197z();
        }
        Uri uri = this.f21960a;
        if (uri != null && (t = this.f21961b) != null && (c45262mj8 = this.f21962c) != null && (c35014On8 = this.f21967h) != null && (bool = this.f21964e) != null && this.f21965f != null && this.f21966g != null) {
            return new C37309Yi8(uri, t, c45262mj8, this.f21963d, c35014On8, bool.booleanValue(), this.f21965f.booleanValue(), this.f21966g.booleanValue(), null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21960a == null) {
            sb.append(" uri");
        }
        if (this.f21961b == null) {
            sb.append(" schema");
        }
        if (this.f21962c == null) {
            sb.append(" handler");
        }
        if (this.f21967h == null) {
            sb.append(" variantConfig");
        }
        if (this.f21964e == null) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if (this.f21965f == null) {
            sb.append(" updateSequencingBugFix");
        }
        if (this.f21966g == null) {
            sb.append(" enableTracing");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: h */
    public final AbstractC31720Al8<T> m96411h(C35014On8 c35014On8) {
        this.f21967h = c35014On8;
        return this;
    }
}
