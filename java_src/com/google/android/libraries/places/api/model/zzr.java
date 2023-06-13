package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
/* loaded from: classes6.dex */
abstract class zzr extends Place {
    private final String zza;
    private final AddressComponents zzb;
    private final Place.BusinessStatus zzc;
    private final List zzd;
    private final String zze;
    private final LatLng zzf;
    private final String zzg;
    private final OpeningHours zzh;
    private final String zzi;
    private final List zzj;
    private final PlusCode zzk;
    private final Integer zzl;
    private final Double zzm;
    private final List zzn;
    private final Integer zzo;
    private final Integer zzp;
    private final LatLngBounds zzq;
    private final Uri zzr;
    private final String zzs;
    private final Integer zzt;

    public zzr(String str, AddressComponents addressComponents, Place.BusinessStatus businessStatus, List list, String str2, LatLng latLng, String str3, OpeningHours openingHours, String str4, List list2, PlusCode plusCode, Integer num, Double d, List list3, Integer num2, Integer num3, LatLngBounds latLngBounds, Uri uri, String str5, Integer num4) {
        this.zza = str;
        this.zzb = addressComponents;
        this.zzc = businessStatus;
        this.zzd = list;
        this.zze = str2;
        this.zzf = latLng;
        this.zzg = str3;
        this.zzh = openingHours;
        this.zzi = str4;
        this.zzj = list2;
        this.zzk = plusCode;
        this.zzl = num;
        this.zzm = d;
        this.zzn = list3;
        this.zzo = num2;
        this.zzp = num3;
        this.zzq = latLngBounds;
        this.zzr = uri;
        this.zzs = str5;
        this.zzt = num4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str = this.zza;
            if (str != null ? str.equals(place.getAddress()) : place.getAddress() == null) {
                AddressComponents addressComponents = this.zzb;
                if (addressComponents != null ? addressComponents.equals(place.getAddressComponents()) : place.getAddressComponents() == null) {
                    Place.BusinessStatus businessStatus = this.zzc;
                    if (businessStatus != null ? businessStatus.equals(place.getBusinessStatus()) : place.getBusinessStatus() == null) {
                        List list = this.zzd;
                        if (list != null ? list.equals(place.getAttributions()) : place.getAttributions() == null) {
                            String str2 = this.zze;
                            if (str2 != null ? str2.equals(place.getId()) : place.getId() == null) {
                                LatLng latLng = this.zzf;
                                if (latLng != null ? latLng.equals(place.getLatLng()) : place.getLatLng() == null) {
                                    String str3 = this.zzg;
                                    if (str3 != null ? str3.equals(place.getName()) : place.getName() == null) {
                                        OpeningHours openingHours = this.zzh;
                                        if (openingHours != null ? openingHours.equals(place.getOpeningHours()) : place.getOpeningHours() == null) {
                                            String str4 = this.zzi;
                                            if (str4 != null ? str4.equals(place.getPhoneNumber()) : place.getPhoneNumber() == null) {
                                                List list2 = this.zzj;
                                                if (list2 != null ? list2.equals(place.getPhotoMetadatas()) : place.getPhotoMetadatas() == null) {
                                                    PlusCode plusCode = this.zzk;
                                                    if (plusCode != null ? plusCode.equals(place.getPlusCode()) : place.getPlusCode() == null) {
                                                        Integer num = this.zzl;
                                                        if (num != null ? num.equals(place.getPriceLevel()) : place.getPriceLevel() == null) {
                                                            Double d = this.zzm;
                                                            if (d != null ? d.equals(place.getRating()) : place.getRating() == null) {
                                                                List list3 = this.zzn;
                                                                if (list3 != null ? list3.equals(place.getTypes()) : place.getTypes() == null) {
                                                                    Integer num2 = this.zzo;
                                                                    if (num2 != null ? num2.equals(place.getUserRatingsTotal()) : place.getUserRatingsTotal() == null) {
                                                                        Integer num3 = this.zzp;
                                                                        if (num3 != null ? num3.equals(place.getUtcOffsetMinutes()) : place.getUtcOffsetMinutes() == null) {
                                                                            LatLngBounds latLngBounds = this.zzq;
                                                                            if (latLngBounds != null ? latLngBounds.equals(place.getViewport()) : place.getViewport() == null) {
                                                                                Uri uri = this.zzr;
                                                                                if (uri != null ? uri.equals(place.getWebsiteUri()) : place.getWebsiteUri() == null) {
                                                                                    String str5 = this.zzs;
                                                                                    if (str5 != null ? str5.equals(place.getIconUrl()) : place.getIconUrl() == null) {
                                                                                        Integer num4 = this.zzt;
                                                                                        if (num4 != null ? num4.equals(place.getIconBackgroundColor()) : place.getIconBackgroundColor() == null) {
                                                                                            return true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final AddressComponents getAddressComponents() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<String> getAttributions() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Place.BusinessStatus getBusinessStatus() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getIconBackgroundColor() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getIconUrl() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getId() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final LatLng getLatLng() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getName() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final OpeningHours getOpeningHours() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getPhoneNumber() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final PlusCode getPlusCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getPriceLevel() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Double getRating() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<Place.Type> getTypes() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getUserRatingsTotal() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getUtcOffsetMinutes() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final LatLngBounds getViewport() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Uri getWebsiteUri() {
        return this.zzr;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AddressComponents addressComponents = this.zzb;
        if (addressComponents == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = addressComponents.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Place.BusinessStatus businessStatus = this.zzc;
        if (businessStatus == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = businessStatus.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        List list = this.zzd;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str2 = this.zze;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        LatLng latLng = this.zzf;
        if (latLng == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = latLng.hashCode();
        }
        int i7 = (i6 ^ hashCode6) * 1000003;
        String str3 = this.zzg;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i8 = (i7 ^ hashCode7) * 1000003;
        OpeningHours openingHours = this.zzh;
        if (openingHours == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = openingHours.hashCode();
        }
        int i9 = (i8 ^ hashCode8) * 1000003;
        String str4 = this.zzi;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i10 = (i9 ^ hashCode9) * 1000003;
        List list2 = this.zzj;
        if (list2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list2.hashCode();
        }
        int i11 = (i10 ^ hashCode10) * 1000003;
        PlusCode plusCode = this.zzk;
        if (plusCode == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = plusCode.hashCode();
        }
        int i12 = (i11 ^ hashCode11) * 1000003;
        Integer num = this.zzl;
        if (num == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num.hashCode();
        }
        int i13 = (i12 ^ hashCode12) * 1000003;
        Double d = this.zzm;
        if (d == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = d.hashCode();
        }
        int i14 = (i13 ^ hashCode13) * 1000003;
        List list3 = this.zzn;
        if (list3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = list3.hashCode();
        }
        int i15 = (i14 ^ hashCode14) * 1000003;
        Integer num2 = this.zzo;
        if (num2 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num2.hashCode();
        }
        int i16 = (i15 ^ hashCode15) * 1000003;
        Integer num3 = this.zzp;
        if (num3 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num3.hashCode();
        }
        int i17 = (i16 ^ hashCode16) * 1000003;
        LatLngBounds latLngBounds = this.zzq;
        if (latLngBounds == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = latLngBounds.hashCode();
        }
        int i18 = (i17 ^ hashCode17) * 1000003;
        Uri uri = this.zzr;
        if (uri == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = uri.hashCode();
        }
        int i19 = (i18 ^ hashCode18) * 1000003;
        String str5 = this.zzs;
        if (str5 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str5.hashCode();
        }
        int i20 = (i19 ^ hashCode19) * 1000003;
        Integer num4 = this.zzt;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return i20 ^ i;
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String str2 = this.zze;
        String valueOf4 = String.valueOf(this.zzf);
        String str3 = this.zzg;
        String valueOf5 = String.valueOf(this.zzh);
        String str4 = this.zzi;
        String valueOf6 = String.valueOf(this.zzj);
        String valueOf7 = String.valueOf(this.zzk);
        String valueOf8 = String.valueOf(this.zzl);
        String valueOf9 = String.valueOf(this.zzm);
        String valueOf10 = String.valueOf(this.zzn);
        String valueOf11 = String.valueOf(this.zzo);
        String valueOf12 = String.valueOf(this.zzp);
        String valueOf13 = String.valueOf(this.zzq);
        String valueOf14 = String.valueOf(this.zzr);
        String str5 = this.zzs;
        String valueOf15 = String.valueOf(this.zzt);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        int length5 = String.valueOf(str2).length();
        int length6 = valueOf4.length();
        int length7 = String.valueOf(str3).length();
        int length8 = valueOf5.length();
        int length9 = String.valueOf(str4).length();
        int length10 = valueOf6.length();
        int length11 = valueOf7.length();
        int length12 = valueOf8.length();
        int length13 = valueOf9.length();
        int length14 = valueOf10.length();
        int length15 = valueOf11.length();
        int length16 = valueOf12.length();
        int length17 = valueOf13.length();
        int length18 = valueOf14.length();
        StringBuilder sb = new StringBuilder(length + 269 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + String.valueOf(str5).length() + valueOf15.length());
        sb.append("Place{address=");
        sb.append(str);
        sb.append(", addressComponents=");
        sb.append(valueOf);
        sb.append(", businessStatus=");
        sb.append(valueOf2);
        sb.append(", attributions=");
        sb.append(valueOf3);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", latLng=");
        sb.append(valueOf4);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", openingHours=");
        sb.append(valueOf5);
        sb.append(", phoneNumber=");
        sb.append(str4);
        sb.append(", photoMetadatas=");
        sb.append(valueOf6);
        sb.append(", plusCode=");
        sb.append(valueOf7);
        sb.append(", priceLevel=");
        sb.append(valueOf8);
        sb.append(", rating=");
        sb.append(valueOf9);
        sb.append(", types=");
        sb.append(valueOf10);
        sb.append(", userRatingsTotal=");
        sb.append(valueOf11);
        sb.append(", utcOffsetMinutes=");
        sb.append(valueOf12);
        sb.append(", viewport=");
        sb.append(valueOf13);
        sb.append(", websiteUri=");
        sb.append(valueOf14);
        sb.append(", iconUrl=");
        sb.append(str5);
        sb.append(", iconBackgroundColor=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }
}
