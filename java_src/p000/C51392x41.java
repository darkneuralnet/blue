package p000;

import io.reactivex.Observable;
import p000.C45792nd5;
/* renamed from: x41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51392x41 implements InterfaceC49405tj1<C50206v41> {

    /* renamed from: a */
    public final Z94<String> f117063a;

    /* renamed from: b */
    public final Z94<C46978pd5> f117064b;

    /* renamed from: c */
    public final Z94<Observable<C45792nd5.C26559b>> f117065c;

    public C51392x41(Z94<String> z94, Z94<C46978pd5> z942, Z94<Observable<C45792nd5.C26559b>> z943) {
        this.f117063a = z94;
        this.f117064b = z942;
        this.f117065c = z943;
    }

    /* renamed from: a */
    public static C51392x41 m5880a(Z94<String> z94, Z94<C46978pd5> z942, Z94<Observable<C45792nd5.C26559b>> z943) {
        return new C51392x41(z94, z942, z943);
    }

    /* renamed from: c */
    public static C50206v41 m5878c(String str, C46978pd5 c46978pd5, Observable<C45792nd5.C26559b> observable) {
        return new C50206v41(str, c46978pd5, observable);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C50206v41 get() {
        return m5878c(this.f117063a.get(), this.f117064b.get(), this.f117065c.get());
    }
}
