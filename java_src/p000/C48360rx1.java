package p000;

import co.bird.android.foregroundservice.ForegroundService;
import dagger.MembersInjector;
import java.util.Set;
/* renamed from: rx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48360rx1 implements MembersInjector<ForegroundService> {

    /* renamed from: a */
    public final Y94<Set<AbstractC47767qx1>> f107947a;

    /* renamed from: b */
    public final Y94<InterfaceC6097Oh> f107948b;

    /* renamed from: a */
    public static void m14989a(ForegroundService foregroundService, InterfaceC6097Oh interfaceC6097Oh) {
        foregroundService.f66002c = interfaceC6097Oh;
    }

    /* renamed from: c */
    public static void m14987c(ForegroundService foregroundService, Set<AbstractC47767qx1> set) {
        foregroundService.f66001b = set;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(ForegroundService foregroundService) {
        m14987c(foregroundService, this.f107947a.get());
        m14989a(foregroundService, this.f107948b.get());
    }
}
