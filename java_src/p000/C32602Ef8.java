package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: Ef8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32602Ef8 extends BroadcastReceiver {

    /* renamed from: a */
    public final C42162hV8 f7933a;

    /* renamed from: b */
    public boolean f7934b;

    /* renamed from: c */
    public boolean f7935c;

    public C32602Ef8(C42162hV8 c42162hV8) {
        Preconditions.checkNotNull(c42162hV8);
        this.f7933a = c42162hV8;
    }

    /* renamed from: b */
    public final void m108588b() {
        this.f7933a.m36292d();
        this.f7933a.mo22257c().mo19953e();
        if (this.f7934b) {
            return;
        }
        this.f7933a.mo22255z().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f7935c = this.f7933a.m36298Y().m64190j();
        this.f7933a.mo22258a().m106889s().m42707b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f7935c));
        this.f7934b = true;
    }

    /* renamed from: c */
    public final void m108587c() {
        this.f7933a.m36292d();
        this.f7933a.mo22257c().mo19953e();
        this.f7933a.mo22257c().mo19953e();
        if (this.f7934b) {
            this.f7933a.mo22258a().m106889s().m42708a("Unregistering connectivity change receiver");
            this.f7934b = false;
            this.f7935c = false;
            try {
                this.f7933a.mo22255z().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f7933a.mo22258a().m106893o().m42707b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f7933a.m36292d();
        String action = intent.getAction();
        this.f7933a.mo22258a().m106889s().m42707b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m64190j = this.f7933a.m36298Y().m64190j();
            if (this.f7935c != m64190j) {
                this.f7935c = m64190j;
                this.f7933a.mo22257c().m43695w(new RunnableC47594qf8(this, m64190j));
                return;
            }
            return;
        }
        this.f7933a.mo22258a().m106888t().m42707b("NetworkBroadcastReceiver received unknown action", action);
    }
}
