package p000;

import java.util.List;
/* renamed from: b99  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38389b99 extends Ed9 {

    /* renamed from: d */
    public final transient int f56992d;

    /* renamed from: e */
    public final transient int f56993e;

    /* renamed from: f */
    public final /* synthetic */ Ed9 f56994f;

    public C38389b99(Ed9 ed9, int i, int i2) {
        this.f56994f = ed9;
        this.f56992d = i;
        this.f56993e = i2;
    }

    @Override // p000.TT8
    /* renamed from: b */
    public final int mo64917b() {
        return this.f56994f.mo64916c() + this.f56992d + this.f56993e;
    }

    @Override // p000.TT8
    /* renamed from: c */
    public final int mo64916c() {
        return this.f56994f.mo64916c() + this.f56992d;
    }

    @Override // p000.TT8
    /* renamed from: f */
    public final Object[] mo64915f() {
        return this.f56994f.mo64915f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C43433je8.m30137a(i, this.f56993e, "index");
        return this.f56994f.get(i + this.f56992d);
    }

    @Override // p000.Ed9
    /* renamed from: h */
    public final Ed9 mo64914h(int i, int i2) {
        C43433je8.m30135c(i, i2, this.f56993e);
        Ed9 ed9 = this.f56994f;
        int i3 = this.f56992d;
        return ed9.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56993e;
    }

    @Override // p000.Ed9, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
