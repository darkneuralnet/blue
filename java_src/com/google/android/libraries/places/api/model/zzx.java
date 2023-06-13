package com.google.android.libraries.places.api.model;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class zzx extends TimeOfWeek {
    private final DayOfWeek zza;
    private final LocalTime zzb;

    public zzx(DayOfWeek dayOfWeek, LocalTime localTime) {
        if (dayOfWeek != null) {
            this.zza = dayOfWeek;
            if (localTime != null) {
                this.zzb = localTime;
                return;
            }
            throw new NullPointerException("Null time");
        }
        throw new NullPointerException("Null day");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            if (this.zza.equals(timeOfWeek.getDay()) && this.zzb.equals(timeOfWeek.getTime())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final DayOfWeek getDay() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalTime getTime() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 23 + obj2.length());
        sb.append("TimeOfWeek{day=");
        sb.append(obj);
        sb.append(", time=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}
