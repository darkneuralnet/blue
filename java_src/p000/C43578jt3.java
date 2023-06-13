package p000;

import com.uber.autodispose.ScopeProvider;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
/* renamed from: jt3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43578jt3 implements InterfaceC42985it3 {

    /* renamed from: a */
    public final C44171kt3 f93505a;

    public C43578jt3(C44171kt3 c44171kt3) {
        this.f93505a = c44171kt3;
    }

    /* renamed from: b */
    public static Y94<InterfaceC42985it3> m29781b(C44171kt3 c44171kt3) {
        return C39546d52.m44621a(new C43578jt3(c44171kt3));
    }

    @Override // p000.InterfaceC42985it3
    /* renamed from: a */
    public C42392ht3 mo29782a(ScopeProvider scopeProvider, InterfaceC42324hm5 interfaceC42324hm5, ZXingScannerView zXingScannerView) {
        return this.f93505a.m28240b(scopeProvider, interfaceC42324hm5, zXingScannerView);
    }
}
