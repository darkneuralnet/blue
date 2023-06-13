package p000;

import android.content.Context;
import co.bird.android.persistence.hibernation.impl.HibernationDatabase;
/* renamed from: pk */
/* loaded from: classes4.dex */
public final class C27345pk implements InterfaceC48812sj1<HibernationDatabase> {

    /* renamed from: a */
    public final C22711hj f103994a;

    /* renamed from: b */
    public final Y94<Context> f103995b;

    public C27345pk(C22711hj c22711hj, Y94<Context> y94) {
        this.f103994a = c22711hj;
        this.f103995b = y94;
    }

    /* renamed from: a */
    public static C27345pk m18874a(C22711hj c22711hj, Y94<Context> y94) {
        return new C27345pk(c22711hj, y94);
    }

    /* renamed from: c */
    public static HibernationDatabase m18872c(C22711hj c22711hj, Context context) {
        return (HibernationDatabase) C51679xZ3.m5002e(c22711hj.m35990i0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HibernationDatabase get() {
        return m18872c(this.f103994a, this.f103995b.get());
    }
}
