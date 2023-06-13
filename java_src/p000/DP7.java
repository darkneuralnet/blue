package p000;

import android.content.BroadcastReceiver;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
/* renamed from: DP7 */
/* loaded from: classes5.dex */
public final class DP7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ BroadcastReceiver.PendingResult f5644b;

    public DP7(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.f5644b = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.f5644b;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
