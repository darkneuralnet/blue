package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes5.dex */
public class GmsSignatureVerifier {
    private static final zzab zza;
    private static final zzab zzb;
    private static final HashMap zzc;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zzd("com.google.android.gms");
        zzzVar.zza(204200000L);
        zzl zzlVar = zzn.zzd;
        zzzVar.zzc(AbstractC44688ll7.m26857y(zzlVar.zzf(), zzn.zzb.zzf()));
        zzl zzlVar2 = zzn.zzc;
        zzzVar.zzb(AbstractC44688ll7.m26857y(zzlVar2.zzf(), zzn.zza.zzf()));
        zza = zzzVar.zze();
        zzz zzzVar2 = new zzz();
        zzzVar2.zzd("com.android.vending");
        zzzVar2.zza(82240000L);
        zzzVar2.zzc(AbstractC44688ll7.m26858x(zzlVar.zzf()));
        zzzVar2.zzb(AbstractC44688ll7.m26858x(zzlVar2.zzf()));
        zzb = zzzVar2.zze();
        zzc = new HashMap();
    }
}
