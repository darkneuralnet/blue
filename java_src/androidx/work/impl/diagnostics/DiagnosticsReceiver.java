package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f56287a = AbstractC32056Bx2.m113270i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC32056Bx2.m113272e().mo113269a(f56287a, "Requesting diagnostics");
        try {
            ZC6.m73614h(context).m73616c(C32849Fh3.m106745e(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            AbstractC32056Bx2.m113272e().mo113266d(f56287a, "WorkManager is not initialized", e);
        }
    }
}
