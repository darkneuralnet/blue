package p000;

import android.content.Intent;
import dagger.MembersInjector;
/* renamed from: Uu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36475Uu2 implements MembersInjector<C36241Tu2> {

    /* renamed from: a */
    public final Y94<Intent> f38240a;

    /* renamed from: b */
    public final Y94<C38836bv2> f38241b;

    /* renamed from: a */
    public static void m80644a(C36241Tu2 c36241Tu2, Intent intent) {
        c36241Tu2.f36432e = intent;
    }

    /* renamed from: c */
    public static void m80642c(C36241Tu2 c36241Tu2, C38836bv2 c38836bv2) {
        c36241Tu2.f36433f = c38836bv2;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(C36241Tu2 c36241Tu2) {
        m80644a(c36241Tu2, this.f38240a.get());
        m80642c(c36241Tu2, this.f38241b.get());
    }
}
