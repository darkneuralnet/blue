package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: A9 */
/* loaded from: classes2.dex */
public final class C0042A9 {

    /* renamed from: a */
    public final Y94<YR4> f195a;

    /* renamed from: b */
    public final Y94<InterfaceC25921m9> f196b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f197c;

    public C0042A9(Y94<YR4> y94, Y94<InterfaceC25921m9> y942, Y94<C36207Tq4> y943) {
        this.f195a = y94;
        this.f196b = y942;
        this.f197c = y943;
    }

    /* renamed from: a */
    public static C0042A9 m116063a(Y94<YR4> y94, Y94<InterfaceC25921m9> y942, Y94<C36207Tq4> y943) {
        return new C0042A9(y94, y942, y943);
    }

    /* renamed from: c */
    public static C30045x9 m116061c(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, YR4 yr4, InterfaceC25921m9 interfaceC25921m9, C36207Tq4 c36207Tq4, InterfaceC0533B9 interfaceC0533B9) {
        return new C30045x9(lifecycleScopeProvider, yr4, interfaceC25921m9, c36207Tq4, interfaceC0533B9);
    }

    /* renamed from: b */
    public C30045x9 m116062b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC0533B9 interfaceC0533B9) {
        return m116061c(lifecycleScopeProvider, this.f195a.get(), this.f196b.get(), this.f197c.get(), interfaceC0533B9);
    }
}
