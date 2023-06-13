package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* renamed from: BK6 */
/* loaded from: classes6.dex */
public final class BK6 extends VK6<AbstractC7546So> {

    /* renamed from: g */
    public final C46823pM6 f2207g;

    /* renamed from: h */
    public final C49778uL6 f2208h;

    /* renamed from: i */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f2209i;

    /* renamed from: j */
    public final C44442lL6 f2210j;

    /* renamed from: k */
    public final C51556xL6 f2211k;

    /* renamed from: l */
    public final InterfaceC46230oM6<Executor> f2212l;

    /* renamed from: m */
    public final InterfaceC46230oM6<Executor> f2213m;

    /* renamed from: n */
    public final Handler f2214n;

    public BK6(Context context, C46823pM6 c46823pM6, C49778uL6 c49778uL6, InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6, C51556xL6 c51556xL6, C44442lL6 c44442lL6, InterfaceC46230oM6<Executor> interfaceC46230oM62, InterfaceC46230oM6<Executor> interfaceC46230oM63) {
        super(new C42061hK6("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f2214n = new Handler(Looper.getMainLooper());
        this.f2207g = c46823pM6;
        this.f2208h = c49778uL6;
        this.f2209i = interfaceC46230oM6;
        this.f2211k = c51556xL6;
        this.f2210j = c44442lL6;
        this.f2212l = interfaceC46230oM62;
        this.f2213m = interfaceC46230oM63;
    }

    @Override // p000.VK6
    /* renamed from: a */
    public final void mo61428a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f38875a.m36537b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f38875a.m36537b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AbstractC7546So m84819e = AbstractC7546So.m84819e(bundleExtra, stringArrayList.get(0), this.f2211k, FK6.f9200c);
        this.f38875a.m36538a("ListenerRegistryBroadcastReceiver.onReceive: %s", m84819e);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f2210j.m27416a(pendingIntent);
        }
        this.f2213m.m21257a().execute(new Runnable(this, bundleExtra, m84819e) { // from class: yK6

            /* renamed from: b */
            public final BK6 f119364b;

            /* renamed from: c */
            public final Bundle f119365c;

            /* renamed from: d */
            public final AbstractC7546So f119366d;

            {
                this.f119364b = this;
                this.f119365c = bundleExtra;
                this.f119366d = m84819e;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f119364b.m114090h(this.f119365c, this.f119366d);
            }
        });
        this.f2212l.m21257a().execute(new Runnable(this, bundleExtra) { // from class: AK6

            /* renamed from: b */
            public final BK6 f398b;

            /* renamed from: c */
            public final Bundle f399c;

            {
                this.f398b = this;
                this.f399c = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f398b.m114091g(this.f399c);
            }
        });
    }

    /* renamed from: f */
    public final void m114092f(final AbstractC7546So abstractC7546So) {
        this.f2214n.post(new Runnable(this, abstractC7546So) { // from class: wK6

            /* renamed from: b */
            public final BK6 f115827b;

            /* renamed from: c */
            public final AbstractC7546So f115828c;

            {
                this.f115827b = this;
                this.f115828c = abstractC7546So;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f115827b.m79953d(this.f115828c);
            }
        });
    }

    /* renamed from: g */
    public final /* synthetic */ void m114091g(Bundle bundle) {
        if (this.f2207g.m19415d(bundle)) {
            this.f2208h.m10413a();
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m114090h(Bundle bundle, AbstractC7546So abstractC7546So) {
        if (this.f2207g.m19414e(bundle)) {
            m114092f(abstractC7546So);
            this.f2209i.m21257a().mo10441j();
        }
    }
}
