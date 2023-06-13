package p000;

import android.content.Context;
/* renamed from: EE0 */
/* loaded from: classes5.dex */
public final class EE0 implements InterfaceC48220rj1<DE0> {

    /* renamed from: a */
    public final Y94<Context> f7125a;

    /* renamed from: b */
    public final Y94<InterfaceC38734bl0> f7126b;

    /* renamed from: c */
    public final Y94<InterfaceC38734bl0> f7127c;

    public EE0(Y94<Context> y94, Y94<InterfaceC38734bl0> y942, Y94<InterfaceC38734bl0> y943) {
        this.f7125a = y94;
        this.f7126b = y942;
        this.f7127c = y943;
    }

    /* renamed from: a */
    public static EE0 m109286a(Y94<Context> y94, Y94<InterfaceC38734bl0> y942, Y94<InterfaceC38734bl0> y943) {
        return new EE0(y94, y942, y943);
    }

    /* renamed from: c */
    public static DE0 m109284c(Context context, InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02) {
        return new DE0(context, interfaceC38734bl0, interfaceC38734bl02);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public DE0 get() {
        return m109284c(this.f7125a.get(), this.f7126b.get(), this.f7127c.get());
    }
}
