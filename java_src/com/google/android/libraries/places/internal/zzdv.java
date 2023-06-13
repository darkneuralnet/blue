package com.google.android.libraries.places.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzdv {
    private zza[] addressComponents;
    private String businessStatus;
    private String formattedAddress;
    private zzb geometry;
    private String icon;
    private String iconBackgroundColor;
    private String iconMaskBaseUri;
    private String internationalPhoneNumber;
    private String name;
    private zzc openingHours;
    private zzd[] photos;
    private String placeId;
    private zze plusCode;
    private Integer priceLevel;
    private Double rating;
    private String[] types;
    private Integer userRatingsTotal;
    private Integer utcOffset;
    private String website;

    /* loaded from: classes6.dex */
    class zza {
        private String longName;
        private String shortName;
        private String[] types;

        public final zzhs zza() {
            String[] strArr = this.types;
            if (strArr != null) {
                return zzhs.zzl(strArr);
            }
            return null;
        }

        public final String zzb() {
            return this.longName;
        }

        public final String zzc() {
            return this.shortName;
        }
    }

    /* loaded from: classes6.dex */
    class zzb {
        private zza location;
        private C31612zzb viewport;

        /* loaded from: classes6.dex */
        class zza {
            private Double lat;
            private Double lng;

            public final Double zza() {
                return this.lat;
            }

            public final Double zzb() {
                return this.lng;
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzdv$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        class C31612zzb {
            private zza northeast;
            private zza southwest;

            public final zza zza() {
                return this.northeast;
            }

            public final zza zzb() {
                return this.southwest;
            }
        }

        public final zza zza() {
            return this.location;
        }

        public final C31612zzb zzb() {
            return this.viewport;
        }
    }

    /* loaded from: classes6.dex */
    class zzc {
        private zza[] periods;
        private String[] weekdayText;

        /* loaded from: classes6.dex */
        class zza {
            private zzb close;
            private zzb open;

            public final zzb zza() {
                return this.close;
            }

            public final zzb zzb() {
                return this.open;
            }
        }

        /* loaded from: classes6.dex */
        class zzb {
            private Integer day;
            private String time;

            public final Integer zza() {
                return this.day;
            }

            public final String zzb() {
                return this.time;
            }
        }

        public final zzhs zza() {
            zza[] zzaVarArr = this.periods;
            if (zzaVarArr != null) {
                return zzhs.zzl(zzaVarArr);
            }
            return null;
        }

        public final zzhs zzb() {
            String[] strArr = this.weekdayText;
            if (strArr != null) {
                return zzhs.zzl(strArr);
            }
            return null;
        }
    }

    /* loaded from: classes6.dex */
    class zzd {
        private Integer height;
        private String[] htmlAttributions;
        private String photoReference;
        private Integer width;

        public final zzhs zza() {
            String[] strArr = this.htmlAttributions;
            if (strArr != null) {
                return zzhs.zzl(strArr);
            }
            return null;
        }

        public final Integer zzb() {
            return this.height;
        }

        public final Integer zzc() {
            return this.width;
        }

        public final String zzd() {
            return this.photoReference;
        }
    }

    /* loaded from: classes6.dex */
    class zze {
        private String compoundCode;
        private String globalCode;

        public final String zza() {
            return this.compoundCode;
        }

        public final String zzb() {
            return this.globalCode;
        }
    }

    public final zzb zza() {
        return this.geometry;
    }

    public final zzc zzb() {
        return this.openingHours;
    }

    public final zze zzc() {
        return this.plusCode;
    }

    public final zzhs zzd() {
        zza[] zzaVarArr = this.addressComponents;
        if (zzaVarArr != null) {
            return zzhs.zzl(zzaVarArr);
        }
        return null;
    }

    public final zzhs zze() {
        zzd[] zzdVarArr = this.photos;
        if (zzdVarArr != null) {
            return zzhs.zzl(zzdVarArr);
        }
        return null;
    }

    public final zzhs zzf() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzhs.zzl(strArr);
        }
        return null;
    }

    public final Double zzg() {
        return this.rating;
    }

    public final Integer zzh() {
        return this.priceLevel;
    }

    public final Integer zzi() {
        return this.userRatingsTotal;
    }

    public final Integer zzj() {
        return this.utcOffset;
    }

    public final String zzk() {
        return this.businessStatus;
    }

    public final String zzl() {
        return this.formattedAddress;
    }

    public final String zzm() {
        return this.iconBackgroundColor;
    }

    public final String zzn() {
        return this.iconMaskBaseUri;
    }

    public final String zzo() {
        return this.internationalPhoneNumber;
    }

    public final String zzp() {
        return this.name;
    }

    public final String zzq() {
        return this.placeId;
    }

    public final String zzr() {
        return this.website;
    }
}
