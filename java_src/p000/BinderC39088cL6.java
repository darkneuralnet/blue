package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
/* renamed from: cL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC39088cL6 extends AbstractBinderC43292jP6 {

    /* renamed from: a */
    public final C42061hK6 f60434a = new C42061hK6("AssetPackExtractionService");

    /* renamed from: b */
    public final Context f60435b;

    /* renamed from: c */
    public final HK6 f60436c;

    public BinderC39088cL6(Context context, HK6 hk6) {
        this.f60435b = context;
        this.f60436c = hk6;
    }

    @Override // p000.InterfaceC43885kP6
    /* renamed from: A4 */
    public final void mo29014A4(Bundle bundle, BP6 bp6) throws RemoteException {
        this.f60434a.m36538a("updateServiceState AIDL call", new Object[0]);
        if (!C52149yL6.m3582a(this.f60435b) || !C52149yL6.m3581b(this.f60435b)) {
            bp6.mo27321B1(new Bundle());
            return;
        }
        m61545B1(bundle);
        bp6.mo27320k1(new Bundle(), new Bundle());
    }

    /* renamed from: B1 */
    public final synchronized void m61545B1(Bundle bundle) {
        ComponentName componentName;
        Intent intent = new Intent(this.f60435b, ExtractionForegroundService.class);
        int i = bundle.getInt("action_type");
        intent.putExtra("action_type", i);
        if (i == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentName = Build.VERSION.SDK_INT >= 26 ? this.f60435b.startForegroundService(intent) : this.f60435b.startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            this.f60434a.m36536c(e, "Failed starting installation service.", new Object[0]);
            componentName = null;
        }
        if (componentName == null) {
            this.f60434a.m36537b("Failed starting installation service.", new Object[0]);
        }
    }

    @Override // p000.InterfaceC43885kP6
    /* renamed from: L4 */
    public final void mo29013L4(BP6 bp6) throws RemoteException {
        this.f60434a.m36538a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C52149yL6.m3582a(this.f60435b) || !C52149yL6.m3581b(this.f60435b)) {
            bp6.mo27321B1(new Bundle());
            return;
        }
        this.f60436c.m104018K();
        bp6.mo27319p1(new Bundle());
    }
}
