package p000;

import co.bird.android.feature.tutorial.TutorialActivity;
import dagger.MembersInjector;
/* renamed from: Ca6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32087Ca6 implements MembersInjector<TutorialActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f4276a;

    /* renamed from: b */
    public final Y94<C22454gl> f4277b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f4278c;

    /* renamed from: d */
    public final Y94<AbstractC34661Na6> f4279d;

    /* renamed from: e */
    public final Y94<C32789Fa6> f4280e;

    /* renamed from: a */
    public static void m112101a(TutorialActivity tutorialActivity, C32789Fa6 c32789Fa6) {
        tutorialActivity.f65844k = c32789Fa6;
    }

    /* renamed from: c */
    public static void m112099c(TutorialActivity tutorialActivity, AbstractC34661Na6 abstractC34661Na6) {
        tutorialActivity.f65843j = abstractC34661Na6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(TutorialActivity tutorialActivity) {
        C4650Ky.m98043b(tutorialActivity, this.f4276a.get());
        C4650Ky.m98042c(tutorialActivity, this.f4277b.get());
        C4650Ky.m98041d(tutorialActivity, this.f4278c.get());
        m112099c(tutorialActivity, this.f4279d.get());
        m112101a(tutorialActivity, this.f4280e.get());
    }
}
