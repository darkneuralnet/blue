package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: ee4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40464ee4 implements InterfaceC48812sj1<C39872de4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f78650a;

    /* renamed from: b */
    public final Y94<InterfaceC42586iD1> f78651b;

    /* renamed from: c */
    public final Y94<C10566a5> f78652c;

    public C40464ee4(Y94<BaseActivity> y94, Y94<InterfaceC42586iD1> y942, Y94<C10566a5> y943) {
        this.f78650a = y94;
        this.f78651b = y942;
        this.f78652c = y943;
    }

    /* renamed from: a */
    public static C40464ee4 m42667a(Y94<BaseActivity> y94, Y94<InterfaceC42586iD1> y942, Y94<C10566a5> y943) {
        return new C40464ee4(y94, y942, y943);
    }

    /* renamed from: c */
    public static C39872de4 m42665c(BaseActivity baseActivity, InterfaceC42586iD1 interfaceC42586iD1, C10566a5 c10566a5) {
        return new C39872de4(baseActivity, interfaceC42586iD1, c10566a5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39872de4 get() {
        return m42665c(this.f78650a.get(), this.f78651b.get(), this.f78652c.get());
    }
}
