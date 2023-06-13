package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f56238a = AbstractC32056Bx2.m113270i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56238a;
        m113272e.mo113269a(str, "Received intent " + intent);
        try {
            C37830aD6.m71761p(context).m71751z(goAsync());
        } catch (IllegalStateException e) {
            AbstractC32056Bx2.m113272e().mo113266d(f56238a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
