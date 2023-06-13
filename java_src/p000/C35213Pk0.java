package p000;

import io.reactivex.AbstractC23437E;
import io.reactivex.Observable;
import p000.C45792nd5;
/* renamed from: Pk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35213Pk0 implements InterfaceC49405tj1<C34979Ok0> {

    /* renamed from: a */
    public final Z94<C46978pd5> f28974a;

    /* renamed from: b */
    public final Z94<Observable<C45792nd5.C26559b>> f28975b;

    /* renamed from: c */
    public final Z94<Observable<Boolean>> f28976c;

    /* renamed from: d */
    public final Z94<InterfaceC34855Nw2> f28977d;

    /* renamed from: e */
    public final Z94<AbstractC23437E> f28978e;

    public C35213Pk0(Z94<C46978pd5> z94, Z94<Observable<C45792nd5.C26559b>> z942, Z94<Observable<Boolean>> z943, Z94<InterfaceC34855Nw2> z944, Z94<AbstractC23437E> z945) {
        this.f28974a = z94;
        this.f28975b = z942;
        this.f28976c = z943;
        this.f28977d = z944;
        this.f28978e = z945;
    }

    /* renamed from: a */
    public static C35213Pk0 m89879a(Z94<C46978pd5> z94, Z94<Observable<C45792nd5.C26559b>> z942, Z94<Observable<Boolean>> z943, Z94<InterfaceC34855Nw2> z944, Z94<AbstractC23437E> z945) {
        return new C35213Pk0(z94, z942, z943, z944, z945);
    }

    /* renamed from: c */
    public static C34979Ok0 m89877c(C46978pd5 c46978pd5, Observable<C45792nd5.C26559b> observable, Observable<Boolean> observable2, InterfaceC34855Nw2 interfaceC34855Nw2, AbstractC23437E abstractC23437E) {
        return new C34979Ok0(c46978pd5, observable, observable2, interfaceC34855Nw2, abstractC23437E);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C34979Ok0 get() {
        return m89877c(this.f28974a.get(), this.f28975b.get(), this.f28976c.get(), this.f28977d.get(), this.f28978e.get());
    }
}
