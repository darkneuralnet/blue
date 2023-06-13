package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* renamed from: ki8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC44066ki8 implements ServiceConnection {

    /* renamed from: b */
    public final String f94813b;

    /* renamed from: c */
    public final /* synthetic */ C51773xi8 f94814c;

    public ServiceConnectionC44066ki8(C51773xi8 c51773xi8, String str) {
        this.f94814c = c51773xi8;
        this.f94813b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                QM7 m114064d5 = BM7.m114064d5(iBinder);
                if (m114064d5 == null) {
                    this.f94814c.f118008a.mo22258a().m106888t().m42708a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f94814c.f118008a.mo22258a().m106889s().m42708a("Install Referrer Service connected");
                this.f94814c.f118008a.mo22257c().m43695w(new RunnableC36598Vh8(this, m114064d5, this));
                return;
            } catch (RuntimeException e) {
                this.f94814c.f118008a.mo22258a().m106888t().m42707b("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        this.f94814c.f118008a.mo22258a().m106888t().m42708a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f94814c.f118008a.mo22258a().m106889s().m42708a("Install Referrer Service disconnected");
    }
}
