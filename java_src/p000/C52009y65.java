package p000;

import co.bird.android.model.ridertutorial.TutorialKind;
import com.uber.autodispose.ScopeProvider;
/* renamed from: y65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52009y65 {

    /* renamed from: a */
    public final Y94<InterfaceC36532Va5> f118757a;

    public C52009y65(Y94<InterfaceC36532Va5> y94) {
        this.f118757a = y94;
    }

    /* renamed from: a */
    public static C52009y65 m4137a(Y94<InterfaceC36532Va5> y94) {
        return new C52009y65(y94);
    }

    /* renamed from: c */
    public static C50230v65 m4135c(InterfaceC36532Va5 interfaceC36532Va5, ScopeProvider scopeProvider, InterfaceC37468Za5 interfaceC37468Za5, TutorialKind tutorialKind) {
        return new C50230v65(interfaceC36532Va5, scopeProvider, interfaceC37468Za5, tutorialKind);
    }

    /* renamed from: b */
    public C50230v65 m4136b(ScopeProvider scopeProvider, InterfaceC37468Za5 interfaceC37468Za5, TutorialKind tutorialKind) {
        return m4135c(this.f118757a.get(), scopeProvider, interfaceC37468Za5, tutorialKind);
    }
}
