package p000;

import android.content.Context;
import co.bird.android.persistence.announcements.AnnouncementDatabase;
/* renamed from: rj */
/* loaded from: classes4.dex */
public final class C27982rj implements InterfaceC48812sj1<AnnouncementDatabase> {

    /* renamed from: a */
    public final C22711hj f107520a;

    /* renamed from: b */
    public final Y94<Context> f107521b;

    public C27982rj(C22711hj c22711hj, Y94<Context> y94) {
        this.f107520a = c22711hj;
        this.f107521b = y94;
    }

    /* renamed from: a */
    public static C27982rj m15550a(C22711hj c22711hj, Y94<Context> y94) {
        return new C27982rj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AnnouncementDatabase m15548c(C22711hj c22711hj, Context context) {
        return (AnnouncementDatabase) C51679xZ3.m5002e(c22711hj.m35989j(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AnnouncementDatabase get() {
        return m15548c(this.f107520a, this.f107521b.get());
    }
}
