package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* renamed from: cP6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39124cP6 extends VK6<AbstractC39114cO5> {
    @Nullable

    /* renamed from: j */
    public static C39124cP6 f60547j;

    /* renamed from: g */
    public final Handler f60548g;

    /* renamed from: h */
    public final InterfaceC42681iN6 f60549h;

    /* renamed from: i */
    public final Set<InterfaceC39725dO5> f60550i;

    public C39124cP6(Context context, InterfaceC42681iN6 interfaceC42681iN6) {
        super(new C42061hK6("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f60548g = new Handler(Looper.getMainLooper());
        this.f60550i = new LinkedHashSet();
        this.f60549h = interfaceC42681iN6;
    }

    /* renamed from: f */
    public static synchronized C39124cP6 m61427f(Context context) {
        C39124cP6 c39124cP6;
        synchronized (C39124cP6.class) {
            if (f60547j == null) {
                f60547j = new C39124cP6(context, EnumC49212tO6.f110421b);
            }
            c39124cP6 = f60547j;
        }
        return c39124cP6;
    }

    @Override // p000.VK6
    /* renamed from: a */
    public final void mo61428a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        AbstractC39114cO5 m61451e = AbstractC39114cO5.m61451e(bundleExtra);
        this.f38875a.m36538a("ListenerRegistryBroadcastReceiver.onReceive: %s", m61451e);
        InterfaceC50981wN6 mo12416a = this.f60549h.mo12416a();
        if (m61451e.mo61447i() != 3 || mo12416a == null) {
            m61426g(m61451e);
        } else {
            mo12416a.mo6955a(m61451e.mo61452d(), new WO6(this, m61451e, intent, context));
        }
    }

    /* renamed from: g */
    public final synchronized void m61426g(AbstractC39114cO5 abstractC39114cO5) {
        Iterator it = new LinkedHashSet(this.f60550i).iterator();
        while (it.hasNext()) {
            ((InterfaceC39725dO5) it.next()).mo48465a(abstractC39114cO5);
        }
        super.m79953d(abstractC39114cO5);
    }
}
