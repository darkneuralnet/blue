package p000;

import android.content.Context;
/* renamed from: av5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38246av5 implements InterfaceC48812sj1<C37648Zu5> {

    /* renamed from: a */
    public final Y94<Context> f56546a;

    public C38246av5(Y94<Context> y94) {
        this.f56546a = y94;
    }

    /* renamed from: a */
    public static C38246av5 m65253a(Y94<Context> y94) {
        return new C38246av5(y94);
    }

    /* renamed from: c */
    public static C37648Zu5 m65251c(Context context) {
        return new C37648Zu5(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C37648Zu5 get() {
        return m65251c(this.f56546a.get());
    }
}
