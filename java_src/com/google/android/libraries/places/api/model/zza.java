package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AddressComponent;
import java.util.List;
/* loaded from: classes6.dex */
final class zza extends AddressComponent.Builder {
    private String zza;
    private String zzb;
    private List zzc;

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder setShortName(String str) {
        this.zzb = str;
        return this;
    }

    public final AddressComponent.Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder zzb(List list) {
        if (list != null) {
            this.zzc = list;
            return this;
        }
        throw new NullPointerException("Null types");
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzc) != null) {
            return new zzz(str, this.zzb, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" name");
        }
        if (this.zzc == null) {
            sb.append(" types");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
