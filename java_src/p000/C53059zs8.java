package p000;

import java.util.concurrent.Executor;
/* renamed from: zs8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C53059zs8 implements InterfaceC52969zj8 {

    /* renamed from: a */
    public final /* synthetic */ C35059Os8 f122415a;

    public /* synthetic */ C53059zs8(C35059Os8 c35059Os8, C32242Cr8 c32242Cr8) {
        this.f122415a = c35059Os8;
    }

    @Override // p000.InterfaceC52969zj8
    /* renamed from: a */
    public final Mb9<Void> mo188a(final InterfaceC43713k69 interfaceC43713k69, final Executor executor) {
        YA8 ya8;
        C51933xy8 c51933xy8;
        ya8 = this.f122415a.f27517h;
        ya8.mo61802a();
        c51933xy8 = this.f122415a.f27514e;
        return C50508va9.m8425k(C50508va9.m8428h(c51933xy8.m4366b()), KD8.m99067c(new InterfaceC43713k69() { // from class: ws8
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj) {
                InterfaceC47151pu8 interfaceC47151pu8;
                C53059zs8 c53059zs8 = C53059zs8.this;
                InterfaceC43713k69 interfaceC43713k692 = interfaceC43713k69;
                Executor executor2 = executor;
                Void r4 = (Void) obj;
                interfaceC47151pu8 = c53059zs8.f122415a.f27512c;
                return interfaceC47151pu8.mo16925b(interfaceC43713k692, executor2, null);
            }
        }), Hc9.m103649b());
    }
}
