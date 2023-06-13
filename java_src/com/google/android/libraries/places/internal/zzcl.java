package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
final class zzcl {
    private String description;
    private Integer distanceMeters;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    /* loaded from: classes6.dex */
    class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        public final zzhs zza() {
            zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zzhs.zzl(zzbVarArr);
            }
            return null;
        }

        public final zzhs zzb() {
            zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zzhs.zzl(zzbVarArr);
            }
            return null;
        }

        public final String zzc() {
            return this.mainText;
        }

        public final String zzd() {
            return this.secondaryText;
        }
    }

    /* loaded from: classes6.dex */
    class zzb {
        Integer length;
        Integer offset;
    }

    public final zza zza() {
        return this.structuredFormatting;
    }

    public final zzhs zzb() {
        zzb[] zzbVarArr = this.matchedSubstrings;
        if (zzbVarArr != null) {
            return zzhs.zzl(zzbVarArr);
        }
        return null;
    }

    public final zzhs zzc() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzhs.zzl(strArr);
        }
        return null;
    }

    public final Integer zzd() {
        return this.distanceMeters;
    }

    public final String zze() {
        return this.description;
    }

    public final String zzf() {
        return this.placeId;
    }
}
