package p000;

import co.bird.android.model.ridertutorial.TutorialKind;
import com.uber.autodispose.ScopeProvider;
/* renamed from: x65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51416x65 implements InterfaceC50823w65 {

    /* renamed from: a */
    public final C52009y65 f117104a;

    public C51416x65(C52009y65 c52009y65) {
        this.f117104a = c52009y65;
    }

    /* renamed from: b */
    public static Y94<InterfaceC50823w65> m5840b(C52009y65 c52009y65) {
        return C39546d52.m44621a(new C51416x65(c52009y65));
    }

    @Override // p000.InterfaceC50823w65
    /* renamed from: a */
    public C50230v65 mo5841a(ScopeProvider scopeProvider, InterfaceC37468Za5 interfaceC37468Za5, TutorialKind tutorialKind) {
        return this.f117104a.m4136b(scopeProvider, interfaceC37468Za5, tutorialKind);
    }
}
