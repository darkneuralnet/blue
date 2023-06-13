package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.C12137d;
/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements C12137d.InterfaceC12140c {

    /* renamed from: e */
    public static final String f56239e = AbstractC32056Bx2.m113270i("SystemAlarmService");

    /* renamed from: c */
    public C12137d f56240c;

    /* renamed from: d */
    public boolean f56241d;

    @Override // androidx.work.impl.background.systemalarm.C12137d.InterfaceC12140c
    /* renamed from: b */
    public void mo65497b() {
        this.f56241d = true;
        AbstractC32056Bx2.m113272e().mo113269a(f56239e, "All commands completed in dispatcher");
        C37433Yw6.m73958a();
        stopSelf();
    }

    /* renamed from: e */
    public final void m65534e() {
        C12137d c12137d = new C12137d(this);
        this.f56240c = c12137d;
        c12137d.m65498l(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m65534e();
        this.f56241d = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f56241d = true;
        this.f56240c.m65500j();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f56241d) {
            AbstractC32056Bx2.m113272e().mo113265f(f56239e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f56240c.m65500j();
            m65534e();
            this.f56241d = false;
        }
        if (intent != null) {
            this.f56240c.m65508a(intent, i2);
            return 3;
        }
        return 3;
    }
}
