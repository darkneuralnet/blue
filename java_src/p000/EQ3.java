package p000;

import android.app.Activity;
/* renamed from: EQ3 */
/* loaded from: classes3.dex */
public final class EQ3 implements InterfaceC48812sj1<DQ3> {

    /* renamed from: a */
    public final Y94<Activity> f7443a;

    /* renamed from: b */
    public final Y94<C22454gl> f7444b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f7445c;

    public EQ3(Y94<Activity> y94, Y94<C22454gl> y942, Y94<InterfaceC1880Ea> y943) {
        this.f7443a = y94;
        this.f7444b = y942;
        this.f7445c = y943;
    }

    /* renamed from: a */
    public static EQ3 m109028a(Y94<Activity> y94, Y94<C22454gl> y942, Y94<InterfaceC1880Ea> y943) {
        return new EQ3(y94, y942, y943);
    }

    /* renamed from: c */
    public static DQ3 m109026c(Activity activity, C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea) {
        return new DQ3(activity, c22454gl, interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public DQ3 get() {
        return m109026c(this.f7443a.get(), this.f7444b.get(), this.f7445c.get());
    }
}
