package p000;

import android.content.Context;
import co.bird.android.persistence.hardcount.impl.HardCountScanDatabase;
/* renamed from: nk */
/* loaded from: classes4.dex */
public final class C26575nk implements InterfaceC48812sj1<HardCountScanDatabase> {

    /* renamed from: a */
    public final C22711hj f100436a;

    /* renamed from: b */
    public final Y94<Context> f100437b;

    public C26575nk(C22711hj c22711hj, Y94<Context> y94) {
        this.f100436a = c22711hj;
        this.f100437b = y94;
    }

    /* renamed from: a */
    public static C26575nk m23251a(C22711hj c22711hj, Y94<Context> y94) {
        return new C26575nk(c22711hj, y94);
    }

    /* renamed from: c */
    public static HardCountScanDatabase m23249c(C22711hj c22711hj, Context context) {
        return (HardCountScanDatabase) C51679xZ3.m5002e(c22711hj.m35994g0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HardCountScanDatabase get() {
        return m23249c(this.f100436a, this.f100437b.get());
    }
}
