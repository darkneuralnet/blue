package com.google.android.libraries.places.api.model;

import java.util.List;
/* loaded from: classes6.dex */
abstract class zzl extends OpeningHours {
    private final List zza;
    private final List zzb;

    public zzl(List list, List list2) {
        if (list != null) {
            this.zza = list;
            if (list2 != null) {
                this.zzb = list2;
                return;
            }
            throw new NullPointerException("Null weekdayText");
        }
        throw new NullPointerException("Null periods");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpeningHours) {
            OpeningHours openingHours = (OpeningHours) obj;
            if (this.zza.equals(openingHours.getPeriods()) && this.zzb.equals(openingHours.getWeekdayText())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final List<Period> getPeriods() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final List<String> getWeekdayText() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 36 + obj2.length());
        sb.append("OpeningHours{periods=");
        sb.append(obj);
        sb.append(", weekdayText=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}
