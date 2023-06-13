package p000;

import androidx.camera.core.AbstractC11160f;
import androidx.camera.core.InterfaceC11183i;
/* renamed from: DW1 */
/* loaded from: classes.dex */
public final class DW1 extends AbstractC11160f {

    /* renamed from: DW1$a */
    /* loaded from: classes.dex */
    public class C1505a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11183i f5812a;

        public C1505a(InterfaceC11183i interfaceC11183i) {
            this.f5812a = interfaceC11183i;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            this.f5812a.close();
        }
    }

    @Override // androidx.camera.core.AbstractC11160f
    /* renamed from: d */
    public InterfaceC11183i mo69584d(KX1 kx1) {
        return kx1.mo69133e();
    }

    @Override // androidx.camera.core.AbstractC11160f
    /* renamed from: g */
    public void mo69583g() {
    }

    @Override // androidx.camera.core.AbstractC11160f
    /* renamed from: o */
    public void mo69582o(InterfaceC11183i interfaceC11183i) {
        IA1.m102842b(m69603e(interfaceC11183i), new C1505a(interfaceC11183i), C31631Ac0.m115449a());
    }
}
