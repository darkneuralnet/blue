package p000;

import androidx.appcompat.app.AppCompatActivity;
/* renamed from: eL4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40289eL4 {

    /* renamed from: a */
    public final Y94<InterfaceC51545xK4> f78248a;

    /* renamed from: b */
    public final Y94<InterfaceC46820pM3> f78249b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f78250c;

    public C40289eL4(Y94<InterfaceC51545xK4> y94, Y94<InterfaceC46820pM3> y942, Y94<InterfaceC1880Ea> y943) {
        this.f78248a = y94;
        this.f78249b = y942;
        this.f78250c = y943;
    }

    /* renamed from: a */
    public static C40289eL4 m43019a(Y94<InterfaceC51545xK4> y94, Y94<InterfaceC46820pM3> y942, Y94<InterfaceC1880Ea> y943) {
        return new C40289eL4(y94, y942, y943);
    }

    /* renamed from: c */
    public static C38493bL4 m43017c(InterfaceC51545xK4 interfaceC51545xK4, InterfaceC46820pM3 interfaceC46820pM3, InterfaceC1880Ea interfaceC1880Ea, AppCompatActivity appCompatActivity, GL4 gl4) {
        return new C38493bL4(interfaceC51545xK4, interfaceC46820pM3, interfaceC1880Ea, appCompatActivity, gl4);
    }

    /* renamed from: b */
    public C38493bL4 m43018b(AppCompatActivity appCompatActivity, GL4 gl4) {
        return m43017c(this.f78248a.get(), this.f78249b.get(), this.f78250c.get(), appCompatActivity, gl4);
    }
}
