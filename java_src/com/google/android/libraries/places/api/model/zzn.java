package com.google.android.libraries.places.api.model;
/* loaded from: classes6.dex */
abstract class zzn extends Period {
    private final TimeOfWeek zza;
    private final TimeOfWeek zzb;

    public zzn(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        this.zza = timeOfWeek;
        this.zzb = timeOfWeek2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            TimeOfWeek timeOfWeek = this.zza;
            if (timeOfWeek != null ? timeOfWeek.equals(period.getOpen()) : period.getOpen() == null) {
                TimeOfWeek timeOfWeek2 = this.zzb;
                if (timeOfWeek2 != null ? timeOfWeek2.equals(period.getClose()) : period.getClose() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        TimeOfWeek timeOfWeek = this.zza;
        int i = 0;
        if (timeOfWeek == null) {
            hashCode = 0;
        } else {
            hashCode = timeOfWeek.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        TimeOfWeek timeOfWeek2 = this.zzb;
        if (timeOfWeek2 != null) {
            i = timeOfWeek2.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
        sb.append("Period{open=");
        sb.append(valueOf);
        sb.append(", close=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
