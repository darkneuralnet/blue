package p000;

import co.bird.android.feature.nestflagging.NestFlaggingActivity;
import dagger.MembersInjector;
/* renamed from: l33  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44270l33 implements MembersInjector<NestFlaggingActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f95401a;

    /* renamed from: b */
    public final Y94<C22454gl> f95402b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f95403c;

    /* renamed from: d */
    public final Y94<C52570z33> f95404d;

    /* renamed from: b */
    public static void m27980b(NestFlaggingActivity nestFlaggingActivity, C52570z33 c52570z33) {
        nestFlaggingActivity.f64247j = c52570z33;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(NestFlaggingActivity nestFlaggingActivity) {
        C4650Ky.m98043b(nestFlaggingActivity, this.f95401a.get());
        C4650Ky.m98042c(nestFlaggingActivity, this.f95402b.get());
        C4650Ky.m98041d(nestFlaggingActivity, this.f95403c.get());
        m27980b(nestFlaggingActivity, this.f95404d.get());
    }
}
