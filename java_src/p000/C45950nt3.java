package p000;

import co.bird.android.app.feature.settings.operator.OperatorSettingsActivity;
import dagger.MembersInjector;
/* renamed from: nt3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45950nt3 implements MembersInjector<OperatorSettingsActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f100984a;

    /* renamed from: b */
    public final Y94<C22454gl> f100985b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f100986c;

    /* renamed from: d */
    public final Y94<C50692vt3> f100987d;

    /* renamed from: e */
    public final Y94<C47136pt3> f100988e;

    /* renamed from: a */
    public static void m22240a(OperatorSettingsActivity operatorSettingsActivity, C47136pt3 c47136pt3) {
        operatorSettingsActivity.f62752k = c47136pt3;
    }

    /* renamed from: c */
    public static void m22238c(OperatorSettingsActivity operatorSettingsActivity, C50692vt3 c50692vt3) {
        operatorSettingsActivity.f62751j = c50692vt3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(OperatorSettingsActivity operatorSettingsActivity) {
        C4650Ky.m98043b(operatorSettingsActivity, this.f100984a.get());
        C4650Ky.m98042c(operatorSettingsActivity, this.f100985b.get());
        C4650Ky.m98041d(operatorSettingsActivity, this.f100986c.get());
        m22238c(operatorSettingsActivity, this.f100987d.get());
        m22240a(operatorSettingsActivity, this.f100988e.get());
    }
}
