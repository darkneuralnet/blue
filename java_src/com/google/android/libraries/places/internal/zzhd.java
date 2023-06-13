package com.google.android.libraries.places.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class zzhd extends zzgl {
    final CharSequence zzb;
    final zzgq zzc;
    int zzd = 0;
    int zze;

    public zzhd(zzhe zzheVar, CharSequence charSequence) {
        zzgq zzgqVar;
        zzgqVar = zzheVar.zza;
        this.zzc = zzgqVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = "2.6.0";
    }

    @Override // com.google.android.libraries.places.internal.zzgl
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 != -1) {
                int zzd = zzd(i2);
                if (zzd == -1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    zzc = -1;
                } else {
                    zzc = zzc(zzd);
                    this.zzd = zzc;
                }
                if (zzc == i) {
                    int i3 = zzc + 1;
                    this.zzd = i3;
                    if (i3 > this.zzb.length()) {
                        this.zzd = -1;
                    }
                } else {
                    if (i < zzd) {
                        this.zzb.charAt(i);
                    }
                    if (i < zzd) {
                        this.zzb.charAt(zzd - 1);
                    }
                    int i4 = this.zze;
                    if (i4 == 1) {
                        zzd = this.zzb.length();
                        this.zzd = -1;
                        if (zzd > i) {
                            this.zzb.charAt(zzd - 1);
                        }
                    } else {
                        this.zze = i4 - 1;
                    }
                    return this.zzb.subSequence(i, zzd).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
