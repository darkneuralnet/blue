package p000;

import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import p000.C45672nQ5;
/* renamed from: wQ5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51007wQ5 implements InterfaceC48812sj1<C50414vQ5> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f115938a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f115939b;

    /* renamed from: c */
    public final Y94<InterfaceC51600xQ5> f115940c;

    /* renamed from: d */
    public final Y94<AbstractC24569h<C45672nQ5.EnumC26504b>> f115941d;

    public C51007wQ5(Y94<ScopeProvider> y94, Y94<InterfaceC40099e13> y942, Y94<InterfaceC51600xQ5> y943, Y94<AbstractC24569h<C45672nQ5.EnumC26504b>> y944) {
        this.f115938a = y94;
        this.f115939b = y942;
        this.f115940c = y943;
        this.f115941d = y944;
    }

    /* renamed from: a */
    public static C51007wQ5 m6851a(Y94<ScopeProvider> y94, Y94<InterfaceC40099e13> y942, Y94<InterfaceC51600xQ5> y943, Y94<AbstractC24569h<C45672nQ5.EnumC26504b>> y944) {
        return new C51007wQ5(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C50414vQ5 m6849c(ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC51600xQ5 interfaceC51600xQ5, AbstractC24569h<C45672nQ5.EnumC26504b> abstractC24569h) {
        return new C50414vQ5(scopeProvider, interfaceC40099e13, interfaceC51600xQ5, abstractC24569h);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C50414vQ5 get() {
        return m6849c(this.f115938a.get(), this.f115939b.get(), this.f115940c.get(), this.f115941d.get());
    }
}
