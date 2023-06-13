package p000;

import co.bird.android.app.feature.locale.ApplicationForegroundLocaleUpdater;
/* renamed from: cm */
/* loaded from: classes2.dex */
public final class C13666cm implements InterfaceC48812sj1<ApplicationForegroundLocaleUpdater> {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f61215a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f61216b;

    public C13666cm(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC35660Rh6> y942) {
        this.f61215a = y94;
        this.f61216b = y942;
    }

    /* renamed from: a */
    public static C13666cm m60891a(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC35660Rh6> y942) {
        return new C13666cm(y94, y942);
    }

    /* renamed from: c */
    public static ApplicationForegroundLocaleUpdater m60889c(InterfaceC44647lh6 interfaceC44647lh6, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new ApplicationForegroundLocaleUpdater(interfaceC44647lh6, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ApplicationForegroundLocaleUpdater get() {
        return m60889c(this.f61215a.get(), this.f61216b.get());
    }
}
