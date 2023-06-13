package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import p000.C25919m8;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zza implements zzc {
    final /* synthetic */ zzd zza;

    public zza(zzd zzdVar) {
        this.zza = zzdVar;
    }

    @Override // com.google.android.gms.tagmanager.zzc
    public final C25919m8.C25920a zza() {
        Context context;
        try {
            context = this.zza.zzi;
            return C25919m8.m26307a(context);
        } catch (GooglePlayServicesNotAvailableException e) {
            this.zza.zze();
            zzdh.zzd("GooglePlayServicesNotAvailableException getting Advertising Id Info", e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            zzdh.zzd("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            return null;
        } catch (IOException e3) {
            zzdh.zzd("IOException getting Ad Id Info", e3);
            return null;
        } catch (IllegalStateException e4) {
            zzdh.zzd("IllegalStateException getting Advertising Id Info", e4);
            return null;
        } catch (Exception e5) {
            zzdh.zzd("Unknown exception. Could not get the Advertising Id Info.", e5);
            return null;
        }
    }
}
