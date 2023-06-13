package p000;

import co.bird.android.feature.suggestanest.SuggestNestActivity;
import dagger.MembersInjector;
/* renamed from: dU5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39779dU5 implements MembersInjector<SuggestNestActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f76716a;

    /* renamed from: b */
    public final Y94<C22454gl> f76717b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f76718c;

    /* renamed from: d */
    public final Y94<LU5> f76719d;

    /* renamed from: e */
    public final Y94<C42743iU5> f76720e;

    /* renamed from: f */
    public final Y94<IL2> f76721f;

    /* renamed from: a */
    public static void m44220a(SuggestNestActivity suggestNestActivity, C42743iU5 c42743iU5) {
        suggestNestActivity.f65640k = c42743iU5;
    }

    /* renamed from: b */
    public static void m44219b(SuggestNestActivity suggestNestActivity, IL2 il2) {
        suggestNestActivity.f65641l = il2;
    }

    /* renamed from: d */
    public static void m44217d(SuggestNestActivity suggestNestActivity, LU5 lu5) {
        suggestNestActivity.f65639j = lu5;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(SuggestNestActivity suggestNestActivity) {
        C4650Ky.m98043b(suggestNestActivity, this.f76716a.get());
        C4650Ky.m98042c(suggestNestActivity, this.f76717b.get());
        C4650Ky.m98041d(suggestNestActivity, this.f76718c.get());
        m44217d(suggestNestActivity, this.f76719d.get());
        m44220a(suggestNestActivity, this.f76720e.get());
        m44219b(suggestNestActivity, this.f76721f.get());
    }
}
