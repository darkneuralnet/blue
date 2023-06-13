package p000;

import co.bird.android.app.feature.locale.LocaleChangedJobConsumer;
import dagger.MembersInjector;
/* renamed from: rv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48341rv2 implements MembersInjector<LocaleChangedJobConsumer> {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f107893a;

    /* renamed from: b */
    public static void m15084b(LocaleChangedJobConsumer localeChangedJobConsumer, InterfaceC44647lh6 interfaceC44647lh6) {
        localeChangedJobConsumer.f61535k = interfaceC44647lh6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(LocaleChangedJobConsumer localeChangedJobConsumer) {
        m15084b(localeChangedJobConsumer, this.f107893a.get());
    }
}
