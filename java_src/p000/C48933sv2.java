package p000;

import co.bird.android.app.feature.locale.LocaleChangedReceiver;
import dagger.MembersInjector;
/* renamed from: sv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48933sv2 implements MembersInjector<LocaleChangedReceiver> {

    /* renamed from: a */
    public final Y94<InterfaceC35422Qh2> f109570a;

    /* renamed from: a */
    public static void m13388a(LocaleChangedReceiver localeChangedReceiver, InterfaceC35422Qh2 interfaceC35422Qh2) {
        localeChangedReceiver.f61537a = interfaceC35422Qh2;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(LocaleChangedReceiver localeChangedReceiver) {
        m13388a(localeChangedReceiver, this.f109570a.get());
    }
}
