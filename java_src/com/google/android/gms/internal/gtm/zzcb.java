package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzcb implements ServiceConnection {
    final /* synthetic */ zzcc zza;
    private volatile boolean zzb;
    private volatile zzey zzc;

    public zzcb(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #2 {, blocks: (B:6:0x000f, B:7:0x0012, B:31:0x0080, B:32:0x0083, B:5:0x0008, B:10:0x0015, B:12:0x0021, B:14:0x002b, B:16:0x0033, B:23:0x0047, B:25:0x0050, B:27:0x0064, B:29:0x0068, B:30:0x007e, B:15:0x002e, B:18:0x003b), top: B:43:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzey zzeyVar;
        zzcb zzcbVar;
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zza.zzJ("Service connected with null binder");
                notifyAll();
                return;
            }
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    if (queryLocalInterface instanceof zzey) {
                        zzeyVar = (zzey) queryLocalInterface;
                    } else {
                        zzeyVar = new zzey(iBinder);
                    }
                    try {
                        this.zza.zzO("Bound to IAnalyticsService interface");
                    } catch (RemoteException unused) {
                        this.zza.zzJ("Service connect failed to get IAnalyticsService");
                        if (zzeyVar != null) {
                        }
                        notifyAll();
                    }
                } else {
                    this.zza.zzK("Got binder with a wrong descriptor", interfaceDescriptor);
                    zzeyVar = null;
                }
            } catch (RemoteException unused2) {
                zzeyVar = null;
            }
            if (zzeyVar != null) {
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzo = this.zza.zzo();
                    zzcbVar = this.zza.zza;
                    connectionTracker.unbindService(zzo, zzcbVar);
                } catch (IllegalArgumentException unused3) {
                }
            } else if (!this.zzb) {
                this.zza.zzR("onServiceConnected received after the timeout limit");
                this.zza.zzq().m87995i(new zzbz(this, zzeyVar, null));
            } else {
                this.zzc = zzeyVar;
            }
            notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        this.zza.zzq().m87995i(new zzca(this, componentName));
    }

    public final zzey zza() {
        zzcb zzcbVar;
        Ql9.m87996h();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context zzo = this.zza.zzo();
        intent.putExtra("app_package_name", zzo.getPackageName());
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            this.zzc = null;
            this.zzb = true;
            zzcbVar = this.zza.zza;
            boolean bindService = connectionTracker.bindService(zzo, intent, zzcbVar, 129);
            this.zza.zzP("Bind to service requested", Boolean.valueOf(bindService));
            if (!bindService) {
                this.zzb = false;
                return null;
            }
            try {
                this.zza.zzw();
                wait(zzeu.zzL.zzb().longValue());
            } catch (InterruptedException unused) {
                this.zza.zzR("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzey zzeyVar = this.zzc;
            this.zzc = null;
            if (zzeyVar == null) {
                this.zza.zzJ("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzeyVar;
        }
    }
}
