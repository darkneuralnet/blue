package p000;

import androidx.camera.core.InterfaceC11183i;
import p000.InterfaceC45179mb5;
/* renamed from: yJ6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52131yJ6 extends C29962wo<InterfaceC11183i> {
    public C52131yJ6(int i, InterfaceC45179mb5.InterfaceC26138a<InterfaceC11183i> interfaceC26138a) {
        super(i, interfaceC26138a);
    }

    /* renamed from: c */
    public void m3674c(InterfaceC11183i interfaceC11183i) {
        if (m3673d(interfaceC11183i.mo40428i1())) {
            super.m6311b(interfaceC11183i);
        } else {
            this.f116543d.mo8906a(interfaceC11183i);
        }
    }

    /* renamed from: d */
    public final boolean m3673d(InterfaceC51066wX1 interfaceC51066wX1) {
        InterfaceC51685xa0 m1085a = C52871za0.m1085a(interfaceC51066wX1);
        if ((m1085a.mo2303c() != EnumC49907ua0.LOCKED_FOCUSED && m1085a.mo2303c() != EnumC49907ua0.PASSIVE_FOCUSED) || m1085a.mo2301e() != EnumC48721sa0.CONVERGED || m1085a.mo2302d() != EnumC50499va0.CONVERGED) {
            return false;
        }
        return true;
    }
}
