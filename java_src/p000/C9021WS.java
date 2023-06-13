package p000;

import co.bird.android.model.extra.ScanBarcodeExtra;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: WS */
/* loaded from: classes2.dex */
public final class C9021WS implements InterfaceC8652VS {

    /* renamed from: a */
    public final C9416XS f41026a;

    public C9021WS(C9416XS c9416xs) {
        this.f41026a = c9416xs;
    }

    /* renamed from: b */
    public static Y94<InterfaceC8652VS> m78432b(C9416XS c9416xs) {
        return C39546d52.m44621a(new C9021WS(c9416xs));
    }

    @Override // p000.InterfaceC8652VS
    /* renamed from: a */
    public C7427SS mo78433a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, ScanBarcodeExtra scanBarcodeExtra, InterfaceC10274ZS interfaceC10274ZS, InterfaceC40099e13 interfaceC40099e13, boolean z, boolean z2) {
        return this.f41026a.m77005b(lifecycleScopeProvider, scanBarcodeExtra, interfaceC10274ZS, interfaceC40099e13, z, z2);
    }
}
