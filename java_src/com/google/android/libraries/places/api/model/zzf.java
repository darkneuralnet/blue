package com.google.android.libraries.places.api.model;
/* loaded from: classes6.dex */
final class zzf extends zzba {
    private int zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zza(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zzb(int i) {
        this.zza = i;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzbb zzc() {
        if (this.zzc != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.zzc & 1) == 0) {
                sb.append(" offset");
            }
            if ((this.zzc & 2) == 0) {
                sb.append(" length");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzaf(this.zza, this.zzb);
    }
}
