package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzha;
/* loaded from: classes6.dex */
public abstract class PhotoMetadata implements Parcelable {

    /* loaded from: classes6.dex */
    public static abstract class Builder {
        @RecentlyNonNull
        public PhotoMetadata build() {
            boolean z;
            PhotoMetadata zzb = zzb();
            int width = zzb.getWidth();
            boolean z2 = false;
            if (width >= 0) {
                z = true;
            } else {
                z = false;
            }
            zzha.zzj(z, "Width must not be < 0, but was: %s.", width);
            int height = zzb.getHeight();
            if (height >= 0) {
                z2 = true;
            }
            zzha.zzj(z2, "Height must not be < 0, but was: %s.", height);
            zzha.zzi(!TextUtils.isEmpty(zzb.zza()), "PhotoReference must not be null or empty.");
            return zzb;
        }

        @RecentlyNonNull
        public abstract String getAttributions();

        public abstract int getHeight();

        public abstract int getWidth();

        @RecentlyNonNull
        public abstract Builder setAttributions(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setHeight(int i);

        @RecentlyNonNull
        public abstract Builder setWidth(int i);

        public abstract PhotoMetadata zzb();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzo zzoVar = new zzo();
        zzoVar.zza(str);
        zzoVar.setWidth(0);
        zzoVar.setHeight(0);
        zzoVar.setAttributions("");
        return zzoVar;
    }

    @RecentlyNonNull
    public abstract String getAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    @RecentlyNonNull
    public abstract String zza();
}
