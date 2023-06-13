package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: xa5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51690xa5 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f117825a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f117826b;

    /* renamed from: c */
    public final Y94<InterfaceC41018fa5> f117827c;

    /* renamed from: d */
    public final Y94<YR4> f117828d;

    public C51690xa5(Y94<C36207Tq4> y94, Y94<InterfaceC35660Rh6> y942, Y94<InterfaceC41018fa5> y943, Y94<YR4> y944) {
        this.f117825a = y94;
        this.f117826b = y942;
        this.f117827c = y943;
        this.f117828d = y944;
    }

    /* renamed from: a */
    public static C51690xa5 m4994a(Y94<C36207Tq4> y94, Y94<InterfaceC35660Rh6> y942, Y94<InterfaceC41018fa5> y943, Y94<YR4> y944) {
        return new C51690xa5(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C49912ua5 m4992c(C36207Tq4 c36207Tq4, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC41018fa5 interfaceC41018fa5, YR4 yr4, InterfaceC52283ya5 interfaceC52283ya5, ScopeProvider scopeProvider) {
        return new C49912ua5(c36207Tq4, interfaceC35660Rh6, interfaceC41018fa5, yr4, interfaceC52283ya5, scopeProvider);
    }

    /* renamed from: b */
    public C49912ua5 m4993b(InterfaceC52283ya5 interfaceC52283ya5, ScopeProvider scopeProvider) {
        return m4992c(this.f117825a.get(), this.f117826b.get(), this.f117827c.get(), this.f117828d.get(), interfaceC52283ya5, scopeProvider);
    }
}
