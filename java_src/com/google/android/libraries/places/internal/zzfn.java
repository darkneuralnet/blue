package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
/* loaded from: classes6.dex */
public abstract class zzfn {
    public static zzfn zzg() {
        return zzr(3).zzf();
    }

    public static zzfn zzh(String str) {
        str.getClass();
        zzfm zzr = zzr(6);
        zzr.zzd(str);
        return zzr.zzf();
    }

    public static zzfn zzi(String str, Status status) {
        str.getClass();
        status.getClass();
        zzfm zzr = zzr(7);
        zzr.zzd(str);
        zzr.zze(status);
        return zzr.zzf();
    }

    public static zzfn zzj(List list) {
        list.getClass();
        zzfm zzr = zzr(5);
        zzr.zzc(list);
        return zzr.zzf();
    }

    public static zzfn zzk() {
        return zzr(2).zzf();
    }

    public static zzfn zzl() {
        zzfm zzr = zzr(10);
        zzr.zze(new Status(16));
        return zzr.zzf();
    }

    public static zzfn zzm(AutocompletePrediction autocompletePrediction, Status status) {
        autocompletePrediction.getClass();
        status.getClass();
        zzfm zzr = zzr(9);
        zzr.zzb(autocompletePrediction);
        zzr.zze(status);
        return zzr.zzf();
    }

    public static zzfn zzn(Place place) {
        place.getClass();
        zzfm zzr = zzr(8);
        zzr.zza(place);
        return zzr.zzf();
    }

    public static zzfn zzo() {
        return zzr(1).zzf();
    }

    public static zzfn zzp() {
        return zzr(4).zzf();
    }

    public static zzfn zzq(Status status) {
        status.getClass();
        zzfm zzr = zzr(10);
        zzr.zze(status);
        return zzr.zzf();
    }

    private static zzfm zzr(int i) {
        zzff zzffVar = new zzff();
        zzffVar.zzg(i);
        return zzffVar;
    }

    public abstract Status zza();

    public abstract AutocompletePrediction zzb();

    public abstract Place zzc();

    public abstract zzhs zzd();

    public abstract String zze();

    public abstract int zzf();
}
