package p000;

import co.bird.android.feature.configurabletutorial.ConfigurableTutorialsActivity;
import dagger.MembersInjector;
/* renamed from: Xw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37193Xw0 implements MembersInjector<ConfigurableTutorialsActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f44260a;

    /* renamed from: b */
    public final Y94<C22454gl> f44261b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f44262c;

    /* renamed from: d */
    public final Y94<C38854bx0> f44263d;

    /* renamed from: b */
    public static void m76043b(ConfigurableTutorialsActivity configurableTutorialsActivity, C38854bx0 c38854bx0) {
        configurableTutorialsActivity.f63731j = c38854bx0;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ConfigurableTutorialsActivity configurableTutorialsActivity) {
        C4650Ky.m98043b(configurableTutorialsActivity, this.f44260a.get());
        C4650Ky.m98042c(configurableTutorialsActivity, this.f44261b.get());
        C4650Ky.m98041d(configurableTutorialsActivity, this.f44262c.get());
        m76043b(configurableTutorialsActivity, this.f44263d.get());
    }
}
