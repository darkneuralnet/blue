package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* renamed from: WJ6 */
/* loaded from: classes6.dex */
public final class WJ6 extends VK6<X42> {
    public WJ6(Context context) {
        super(new C42061hK6("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // p000.VK6
    /* renamed from: a */
    public final void mo61428a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f38875a.m36538a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f38875a.m36538a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f38875a.m36538a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        C42061hK6 c42061hK6 = this.f38875a;
        c42061hK6.m36538a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        c42061hK6.m36538a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        c42061hK6.m36538a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        X42 m77439a = X42.m77439a(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.f38875a.m36538a("ListenerRegistryBroadcastReceiver.onReceive: %s", m77439a);
        m79953d(m77439a);
    }
}
