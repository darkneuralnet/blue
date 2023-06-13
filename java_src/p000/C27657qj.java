package p000;

import co.bird.android.persistence.announcements.AnnouncementDatabase;
/* renamed from: qj */
/* loaded from: classes4.dex */
public final class C27657qj implements InterfaceC48812sj1<AbstractC20087eg> {

    /* renamed from: a */
    public final C22711hj f105662a;

    /* renamed from: b */
    public final Y94<AnnouncementDatabase> f105663b;

    public C27657qj(C22711hj c22711hj, Y94<AnnouncementDatabase> y94) {
        this.f105662a = c22711hj;
        this.f105663b = y94;
    }

    /* renamed from: a */
    public static C27657qj m17201a(C22711hj c22711hj, Y94<AnnouncementDatabase> y94) {
        return new C27657qj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC20087eg m17199c(C22711hj c22711hj, AnnouncementDatabase announcementDatabase) {
        return (AbstractC20087eg) C51679xZ3.m5002e(c22711hj.m35991i(announcementDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC20087eg get() {
        return m17199c(this.f105662a, this.f105663b.get());
    }
}
