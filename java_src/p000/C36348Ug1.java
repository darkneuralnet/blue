package p000;

import android.content.Context;
/* renamed from: Ug1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36348Ug1 implements InterfaceC48220rj1<String> {

    /* renamed from: a */
    public final Y94<Context> f37730a;

    public C36348Ug1(Y94<Context> y94) {
        this.f37730a = y94;
    }

    /* renamed from: a */
    public static C36348Ug1 m81197a(Y94<Context> y94) {
        return new C36348Ug1(y94);
    }

    /* renamed from: c */
    public static String m81195c(Context context) {
        return (String) CZ3.m112115c(AbstractC35880Sg1.m85143b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public String get() {
        return m81195c(this.f37730a.get());
    }
}
