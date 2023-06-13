package p000;

import co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer;
import dagger.MembersInjector;
/* renamed from: gW0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41570gW0 implements MembersInjector<DeepSleepJobConsumer> {

    /* renamed from: a */
    public final Y94<InterfaceC27246pJ> f82369a;

    /* renamed from: a */
    public static void m39237a(DeepSleepJobConsumer deepSleepJobConsumer, InterfaceC27246pJ interfaceC27246pJ) {
        deepSleepJobConsumer.f61328k = interfaceC27246pJ;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(DeepSleepJobConsumer deepSleepJobConsumer) {
        m39237a(deepSleepJobConsumer, this.f82369a.get());
    }
}
