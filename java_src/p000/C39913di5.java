package p000;

import co.bird.android.feature.savemoney.SaveMoneyActivity;
import dagger.MembersInjector;
/* renamed from: di5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39913di5 implements MembersInjector<SaveMoneyActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f77079a;

    /* renamed from: b */
    public final Y94<C22454gl> f77080b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f77081c;

    /* renamed from: d */
    public final Y94<C52956zi5> f77082d;

    /* renamed from: b */
    public static void m43869b(SaveMoneyActivity saveMoneyActivity, C52956zi5 c52956zi5) {
        saveMoneyActivity.f65191m = c52956zi5;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(SaveMoneyActivity saveMoneyActivity) {
        C4650Ky.m98043b(saveMoneyActivity, this.f77079a.get());
        C4650Ky.m98042c(saveMoneyActivity, this.f77080b.get());
        C4650Ky.m98041d(saveMoneyActivity, this.f77081c.get());
        m43869b(saveMoneyActivity, this.f77082d.get());
    }
}
