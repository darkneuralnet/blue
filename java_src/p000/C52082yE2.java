package p000;

import android.annotation.SuppressLint;
import p000.OP2;
/* renamed from: yE2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52082yE2 extends C49711uE2<InterfaceC38133ak2, VL4<?>> implements OP2 {

    /* renamed from: e */
    public OP2.InterfaceC5987a f119162e;

    public C52082yE2(long j) {
        super(j);
    }

    @Override // p000.OP2
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo3796a(int i) {
        if (i >= 40) {
            m10527b();
        } else if (i >= 20 || i == 15) {
            m10521m(m10524h() / 2);
        }
    }

    @Override // p000.OP2
    /* renamed from: c */
    public void mo3795c(OP2.InterfaceC5987a interfaceC5987a) {
        this.f119162e = interfaceC5987a;
    }

    @Override // p000.OP2
    /* renamed from: d */
    public /* bridge */ /* synthetic */ VL4 mo3794d(InterfaceC38133ak2 interfaceC38133ak2) {
        return (VL4) super.m10522l(interfaceC38133ak2);
    }

    @Override // p000.OP2
    /* renamed from: e */
    public /* bridge */ /* synthetic */ VL4 mo3793e(InterfaceC38133ak2 interfaceC38133ak2, VL4 vl4) {
        return (VL4) super.m10523k(interfaceC38133ak2, vl4);
    }

    @Override // p000.C49711uE2
    /* renamed from: n */
    public int mo3792i(VL4<?> vl4) {
        if (vl4 == null) {
            return super.mo3792i(null);
        }
        return vl4.mo5713a();
    }

    @Override // p000.C49711uE2
    /* renamed from: o */
    public void mo3791j(InterfaceC38133ak2 interfaceC38133ak2, VL4<?> vl4) {
        OP2.InterfaceC5987a interfaceC5987a = this.f119162e;
        if (interfaceC5987a != null && vl4 != null) {
            interfaceC5987a.mo92348d(vl4);
        }
    }
}
