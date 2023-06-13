package com.google.android.libraries.places.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
/* loaded from: classes6.dex */
public final class zzfo {
    public static Status zza(Intent intent) {
        boolean z;
        try {
            zzha.zzc(intent, "Intent must not be null.");
            Status status = (Status) intent.getParcelableExtra("places/status");
            if (status != null) {
                z = true;
            } else {
                z = false;
            }
            zzha.zze(z, "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public static Place zzb(Intent intent) {
        boolean z;
        try {
            zzha.zzc(intent, "Intent must not be null.");
            Place place = (Place) intent.getParcelableExtra("places/selected_place");
            if (place != null) {
                z = true;
            } else {
                z = false;
            }
            zzha.zze(z, "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }
}
