package p000;

import co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker;
import dagger.MembersInjector;
/* renamed from: PH1 */
/* loaded from: classes2.dex */
public final class PH1 implements MembersInjector<HeadlessSweepWorker> {

    /* renamed from: a */
    public final Y94<InterfaceC5225MD> f28198a;

    /* renamed from: b */
    public final Y94<InterfaceC47153pv0> f28199b;

    /* renamed from: c */
    public final Y94<InterfaceC40001dr4> f28200c;

    /* renamed from: a */
    public static void m90518a(HeadlessSweepWorker headlessSweepWorker, InterfaceC5225MD interfaceC5225MD) {
        headlessSweepWorker.f61335h = interfaceC5225MD;
    }

    /* renamed from: b */
    public static void m90517b(HeadlessSweepWorker headlessSweepWorker, InterfaceC47153pv0 interfaceC47153pv0) {
        headlessSweepWorker.f61336i = interfaceC47153pv0;
    }

    /* renamed from: d */
    public static void m90515d(HeadlessSweepWorker headlessSweepWorker, InterfaceC40001dr4 interfaceC40001dr4) {
        headlessSweepWorker.f61337j = interfaceC40001dr4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(HeadlessSweepWorker headlessSweepWorker) {
        m90518a(headlessSweepWorker, this.f28198a.get());
        m90517b(headlessSweepWorker, this.f28199b.get());
        m90515d(headlessSweepWorker, this.f28200c.get());
    }
}
