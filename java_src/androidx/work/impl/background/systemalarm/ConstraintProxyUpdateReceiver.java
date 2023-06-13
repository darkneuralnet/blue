package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f56233a = AbstractC32056Bx2.m113270i("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    /* loaded from: classes.dex */
    public class RunnableC12133a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Intent f56234b;

        /* renamed from: c */
        public final /* synthetic */ Context f56235c;

        /* renamed from: d */
        public final /* synthetic */ BroadcastReceiver.PendingResult f56236d;

        public RunnableC12133a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f56234b = intent;
            this.f56235c = context;
            this.f56236d = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f56234b.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f56234b.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f56234b.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f56234b.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC32056Bx2.m113272e().mo113269a(ConstraintProxyUpdateReceiver.f56233a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                KD3.m99070a(this.f56235c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                KD3.m99070a(this.f56235c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                KD3.m99070a(this.f56235c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                KD3.m99070a(this.f56235c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f56236d.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m65535a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str2 = f56233a;
            m113272e.mo113269a(str2, "Ignoring unknown action " + str);
            return;
        }
        C37830aD6.m71761p(context).m71755v().m25427a(new RunnableC12133a(intent, context, goAsync()));
    }
}
