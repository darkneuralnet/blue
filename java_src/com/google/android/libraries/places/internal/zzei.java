package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.libraries.places.api.net.PlacesClient;
/* loaded from: classes6.dex */
public final class zzei implements zzek {
    private final zzem zza;
    private final Context zzb;
    private final zzet zzc;
    private final zzei zzd = this;
    private final zzagm zze = zzagl.zza(zzau.zza());

    public /* synthetic */ zzei(Context context, zzem zzemVar, zzet zzetVar, zzeh zzehVar) {
        this.zza = zzemVar;
        this.zzb = context;
        this.zzc = zzetVar;
    }

    public static zzej zza() {
        return new zzeg(null);
    }

    private final zzbk zzc() {
        return zzbl.zza(new zzex(this.zzb), this.zzc, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final PlacesClient zzb() {
        zzem zzemVar = this.zza;
        zzez zzezVar = new zzez(this.zzb);
        Context applicationContext = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext);
        C40864fJ4 m94588a = C34607Mu6.m94588a(applicationContext);
        zzagk.zza(m94588a);
        zzbs zza = zzbt.zza(m94588a, new zzde());
        Context applicationContext2 = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext2);
        C40864fJ4 m94588a2 = C34607Mu6.m94588a(applicationContext2);
        zzagk.zza(m94588a2);
        zzdp zza2 = zzdq.zza(zzemVar, zzezVar, zza, zzbz.zza(m94588a2), zzc(), (zzas) this.zze.zzb(), zzcr.zza(), zzcv.zza(zzdt.zza()), zzcz.zza(), zzdd.zza(zzdt.zza()));
        Context applicationContext3 = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext3);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(applicationContext3);
        zzagk.zza(fusedLocationProviderClient);
        zzbd zza3 = zzbe.zza(fusedLocationProviderClient, new zzee(new zzea()));
        Context applicationContext4 = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext4);
        return zzck.zza(zza2, zza3, zzbj.zza(applicationContext4, (zzas) this.zze.zzb()), zzc(), (zzas) this.zze.zzb());
    }
}
