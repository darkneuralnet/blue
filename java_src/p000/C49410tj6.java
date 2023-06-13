package p000;

import java.util.Collection;
/* renamed from: tj6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49410tj6 implements T83 {

    /* renamed from: a */
    public final T83 f110944a;

    /* renamed from: b */
    public Collection<InterfaceC39410cr5> f110945b;

    public C49410tj6(T83 t83) {
        this.f110944a = t83;
    }

    @Override // p000.T83
    /* renamed from: a */
    public void mo11840a(Collection collection) {
        this.f110944a.mo11840a(collection);
        this.f110945b = this.f110944a.mo11839b();
        m11838c();
    }

    @Override // p000.T83
    /* renamed from: b */
    public Collection mo11839b() {
        return this.f110945b;
    }

    /* renamed from: c */
    public final void m11838c() {
        new C33801Jj1(this.f110945b).m99914b();
    }
}
