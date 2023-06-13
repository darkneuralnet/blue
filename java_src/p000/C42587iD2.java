package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: iD2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42587iD2 {

    /* renamed from: a */
    public final Y94<InterfaceC46473om3> f86950a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f86951b;

    public C42587iD2(Y94<InterfaceC46473om3> y94, Y94<InterfaceC1880Ea> y942) {
        this.f86950a = y94;
        this.f86951b = y942;
    }

    /* renamed from: a */
    public static C42587iD2 m34334a(Y94<InterfaceC46473om3> y94, Y94<InterfaceC1880Ea> y942) {
        return new C42587iD2(y94, y942);
    }

    /* renamed from: c */
    public static C40808fD2 m34332c(InterfaceC46473om3 interfaceC46473om3, InterfaceC1880Ea interfaceC1880Ea, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC43180jD2 interfaceC43180jD2, InterfaceC40099e13 interfaceC40099e13) {
        return new C40808fD2(interfaceC46473om3, interfaceC1880Ea, lifecycleScopeProvider, interfaceC43180jD2, interfaceC40099e13);
    }

    /* renamed from: b */
    public C40808fD2 m34333b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC43180jD2 interfaceC43180jD2, InterfaceC40099e13 interfaceC40099e13) {
        return m34332c(this.f86950a.get(), this.f86951b.get(), lifecycleScopeProvider, interfaceC43180jD2, interfaceC40099e13);
    }
}
