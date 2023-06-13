package co.bird.android.model.identification;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.location.places.Place;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001JB\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u001c\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030,J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010/\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030,J\u000e\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\nJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010!J¤\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010<J\t\u0010=\u001a\u00020\u0011HÖ\u0001J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0011HÖ\u0001J\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u0007J\t\u0010D\u001a\u00020\nHÖ\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019¨\u0006K"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "Landroid/os/Parcelable;", "documentEntryMethod", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "selfieEntryMethod", "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "documentTypes", "", "Lco/bird/android/model/identification/IdentificationDocumentType;", "services", "", "stateCodes", "countryCodes", "regionCodes", "minimumScore", "", "maxDocumentExpirationDays", "", "canSubmit", "", "(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCanSubmit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCountryCodes", "()Ljava/util/List;", "getDocumentEntryMethod", "()Lco/bird/android/model/identification/IdentificationEntryMethod;", "getDocumentTypes", "hasJurisdictionRestrictions", "getHasJurisdictionRestrictions", "()Z", "getMaxDocumentExpirationDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinimumScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRegionCodes", "getSelfieEntryMethod", "()Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "getServices", "getStateCodes", "allowedCountryCodes", "", "allowedDocumentEntryMethods", "allowedDocumentTypes", "countryCode", "allowsCountry", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "requiredEntryMethodTypes", "Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "EntryMethodType", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIdentificationAcceptableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAcceptableMethod.kt\nco/bird/android/model/identification/IdentificationAcceptableMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes4.dex */
public final class IdentificationAcceptableMethod implements Parcelable {
    public static final Parcelable.Creator<IdentificationAcceptableMethod> CREATOR = new Creator();
    private final Boolean canSubmit;
    private final List<String> countryCodes;
    private final IdentificationEntryMethod documentEntryMethod;
    private final List<IdentificationDocumentType> documentTypes;
    private final boolean hasJurisdictionRestrictions;
    private final Integer maxDocumentExpirationDays;
    private final Double minimumScore;
    private final List<String> regionCodes;
    private final IdentificationSelfieEntryMethod selfieEntryMethod;
    private final List<String> services;
    private final List<String> stateCodes;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IdentificationAcceptableMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationAcceptableMethod createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IdentificationEntryMethod valueOf = parcel.readInt() == 0 ? null : IdentificationEntryMethod.valueOf(parcel.readString());
            IdentificationSelfieEntryMethod valueOf2 = parcel.readInt() == 0 ? null : IdentificationSelfieEntryMethod.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(IdentificationDocumentType.CREATOR.createFromParcel(parcel));
                }
            }
            return new IdentificationAcceptableMethod(valueOf, valueOf2, arrayList, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationAcceptableMethod[] newArray(int i) {
            return new IdentificationAcceptableMethod[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;", "", "(Ljava/lang/String;I)V", "toDocumentEntryMethod", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "toSelfieEntryMethod", "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "FRONT_SCAN", "BACK_SCAN", "SELFIE_PHOTO", "SELFIE_VIDEO", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum EntryMethodType {
        FRONT_SCAN,
        BACK_SCAN,
        SELFIE_PHOTO,
        SELFIE_VIDEO;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryMethodType.values().length];
                try {
                    iArr[EntryMethodType.FRONT_SCAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryMethodType.BACK_SCAN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryMethodType.SELFIE_PHOTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryMethodType.SELFIE_VIDEO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final IdentificationEntryMethod toDocumentEntryMethod() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return IdentificationEntryMethod.SCAN_BACK;
            }
            return IdentificationEntryMethod.SCAN_FRONT;
        }

        public final IdentificationSelfieEntryMethod toSelfieEntryMethod() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return IdentificationSelfieEntryMethod.VIDEO;
            }
            return IdentificationSelfieEntryMethod.PHOTO;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IdentificationEntryMethod.values().length];
            try {
                iArr[IdentificationEntryMethod.SCAN_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationEntryMethod.SCAN_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationEntryMethod.SCAN_FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IdentificationSelfieEntryMethod.values().length];
            try {
                iArr2[IdentificationSelfieEntryMethod.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdentificationSelfieEntryMethod.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public IdentificationAcceptableMethod() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        r3 = kotlin.collections.CollectionsKt___CollectionsJvmKt.toSortedSet(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        r3 = kotlin.collections.CollectionsKt___CollectionsKt.toSet(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set<String> allowedCountryCodes(Set<? extends IdentificationEntryMethod> allowedDocumentEntryMethods) {
        Set<String> emptySet;
        Set<String> emptySet2;
        SortedSet sortedSet;
        Set<String> set;
        Intrinsics.checkNotNullParameter(allowedDocumentEntryMethods, "allowedDocumentEntryMethods");
        if (Intrinsics.areEqual(this.canSubmit, Boolean.TRUE)) {
            IdentificationEntryMethod identificationEntryMethod = this.documentEntryMethod;
            boolean z = false;
            if (identificationEntryMethod != null && allowedDocumentEntryMethods.contains(identificationEntryMethod)) {
                z = true;
            }
            if (z) {
                if (!this.hasJurisdictionRestrictions) {
                    return null;
                }
                List<String> list = this.countryCodes;
                if (list == null || sortedSet == null || set == null) {
                    emptySet2 = SetsKt__SetsKt.emptySet();
                    return emptySet2;
                }
                return set;
            }
        }
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        r5 = kotlin.collections.CollectionsKt___CollectionsKt.toSet(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set<IdentificationDocumentType> allowedDocumentTypes(String countryCode, Set<? extends IdentificationEntryMethod> allowedDocumentEntryMethods) {
        Set<IdentificationDocumentType> emptySet;
        Set<IdentificationDocumentType> set;
        boolean z;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(allowedDocumentEntryMethods, "allowedDocumentEntryMethods");
        List<IdentificationDocumentType> list = this.documentTypes;
        if (list != null) {
            boolean z2 = false;
            if (Intrinsics.areEqual(this.canSubmit, Boolean.TRUE)) {
                IdentificationEntryMethod identificationEntryMethod = this.documentEntryMethod;
                if (identificationEntryMethod != null && allowedDocumentEntryMethods.contains(identificationEntryMethod)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && allowsCountry(countryCode)) {
                    z2 = true;
                }
            }
            if (!z2) {
                list = null;
            }
            if (list != null && set != null) {
                return set;
            }
        }
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }

    public final boolean allowsCountry(String countryCode) {
        boolean z;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (!this.hasJurisdictionRestrictions) {
            return true;
        }
        List<String> list = this.countryCodes;
        if (list != null && list.contains(countryCode)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final IdentificationEntryMethod component1() {
        return this.documentEntryMethod;
    }

    public final Boolean component10() {
        return this.canSubmit;
    }

    public final IdentificationSelfieEntryMethod component2() {
        return this.selfieEntryMethod;
    }

    public final List<IdentificationDocumentType> component3() {
        return this.documentTypes;
    }

    public final List<String> component4() {
        return this.services;
    }

    public final List<String> component5() {
        return this.stateCodes;
    }

    public final List<String> component6() {
        return this.countryCodes;
    }

    public final List<String> component7() {
        return this.regionCodes;
    }

    public final Double component8() {
        return this.minimumScore;
    }

    public final Integer component9() {
        return this.maxDocumentExpirationDays;
    }

    public final IdentificationAcceptableMethod copy(IdentificationEntryMethod identificationEntryMethod, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, List<? extends IdentificationDocumentType> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, Double d, Integer num, Boolean bool) {
        return new IdentificationAcceptableMethod(identificationEntryMethod, identificationSelfieEntryMethod, list, list2, list3, list4, list5, d, num, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationAcceptableMethod) {
            IdentificationAcceptableMethod identificationAcceptableMethod = (IdentificationAcceptableMethod) obj;
            return this.documentEntryMethod == identificationAcceptableMethod.documentEntryMethod && this.selfieEntryMethod == identificationAcceptableMethod.selfieEntryMethod && Intrinsics.areEqual(this.documentTypes, identificationAcceptableMethod.documentTypes) && Intrinsics.areEqual(this.services, identificationAcceptableMethod.services) && Intrinsics.areEqual(this.stateCodes, identificationAcceptableMethod.stateCodes) && Intrinsics.areEqual(this.countryCodes, identificationAcceptableMethod.countryCodes) && Intrinsics.areEqual(this.regionCodes, identificationAcceptableMethod.regionCodes) && Intrinsics.areEqual((Object) this.minimumScore, (Object) identificationAcceptableMethod.minimumScore) && Intrinsics.areEqual(this.maxDocumentExpirationDays, identificationAcceptableMethod.maxDocumentExpirationDays) && Intrinsics.areEqual(this.canSubmit, identificationAcceptableMethod.canSubmit);
        }
        return false;
    }

    public final Boolean getCanSubmit() {
        return this.canSubmit;
    }

    public final List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public final IdentificationEntryMethod getDocumentEntryMethod() {
        return this.documentEntryMethod;
    }

    public final List<IdentificationDocumentType> getDocumentTypes() {
        return this.documentTypes;
    }

    public final boolean getHasJurisdictionRestrictions() {
        return this.hasJurisdictionRestrictions;
    }

    public final Integer getMaxDocumentExpirationDays() {
        return this.maxDocumentExpirationDays;
    }

    public final Double getMinimumScore() {
        return this.minimumScore;
    }

    public final List<String> getRegionCodes() {
        return this.regionCodes;
    }

    public final IdentificationSelfieEntryMethod getSelfieEntryMethod() {
        return this.selfieEntryMethod;
    }

    public final List<String> getServices() {
        return this.services;
    }

    public final List<String> getStateCodes() {
        return this.stateCodes;
    }

    public int hashCode() {
        IdentificationEntryMethod identificationEntryMethod = this.documentEntryMethod;
        int hashCode = (identificationEntryMethod == null ? 0 : identificationEntryMethod.hashCode()) * 31;
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod = this.selfieEntryMethod;
        int hashCode2 = (hashCode + (identificationSelfieEntryMethod == null ? 0 : identificationSelfieEntryMethod.hashCode())) * 31;
        List<IdentificationDocumentType> list = this.documentTypes;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.services;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.stateCodes;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.countryCodes;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.regionCodes;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Double d = this.minimumScore;
        int hashCode8 = (hashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.maxDocumentExpirationDays;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canSubmit;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final List<EntryMethodType> requiredEntryMethodTypes() {
        int i;
        List listOf;
        ArrayList arrayList = new ArrayList();
        IdentificationEntryMethod identificationEntryMethod = this.documentEntryMethod;
        int i2 = -1;
        if (identificationEntryMethod == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[identificationEntryMethod.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EntryMethodType[]{EntryMethodType.FRONT_SCAN, EntryMethodType.BACK_SCAN});
                    arrayList.addAll(listOf);
                }
            } else {
                arrayList.add(EntryMethodType.BACK_SCAN);
            }
        } else {
            arrayList.add(EntryMethodType.FRONT_SCAN);
        }
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod = this.selfieEntryMethod;
        if (identificationSelfieEntryMethod != null) {
            i2 = WhenMappings.$EnumSwitchMapping$1[identificationSelfieEntryMethod.ordinal()];
        }
        if (i2 != 1) {
            if (i2 == 2) {
                arrayList.add(EntryMethodType.SELFIE_VIDEO);
            }
        } else {
            arrayList.add(EntryMethodType.SELFIE_PHOTO);
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public String toString() {
        IdentificationEntryMethod identificationEntryMethod = this.documentEntryMethod;
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod = this.selfieEntryMethod;
        List<IdentificationDocumentType> list = this.documentTypes;
        List<String> list2 = this.services;
        List<String> list3 = this.stateCodes;
        List<String> list4 = this.countryCodes;
        List<String> list5 = this.regionCodes;
        Double d = this.minimumScore;
        Integer num = this.maxDocumentExpirationDays;
        Boolean bool = this.canSubmit;
        return "IdentificationAcceptableMethod(documentEntryMethod=" + identificationEntryMethod + ", selfieEntryMethod=" + identificationSelfieEntryMethod + ", documentTypes=" + list + ", services=" + list2 + ", stateCodes=" + list3 + ", countryCodes=" + list4 + ", regionCodes=" + list5 + ", minimumScore=" + d + ", maxDocumentExpirationDays=" + num + ", canSubmit=" + bool + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        IdentificationEntryMethod identificationEntryMethod = this.documentEntryMethod;
        if (identificationEntryMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(identificationEntryMethod.name());
        }
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod = this.selfieEntryMethod;
        if (identificationSelfieEntryMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(identificationSelfieEntryMethod.name());
        }
        List<IdentificationDocumentType> list = this.documentTypes;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (IdentificationDocumentType identificationDocumentType : list) {
                identificationDocumentType.writeToParcel(out, i);
            }
        }
        out.writeStringList(this.services);
        out.writeStringList(this.stateCodes);
        out.writeStringList(this.countryCodes);
        out.writeStringList(this.regionCodes);
        Double d = this.minimumScore;
        if (d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d.doubleValue());
        }
        Integer num = this.maxDocumentExpirationDays;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Boolean bool = this.canSubmit;
        if (bool == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdentificationAcceptableMethod(IdentificationEntryMethod identificationEntryMethod, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, List<? extends IdentificationDocumentType> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, Double d, Integer num, Boolean bool) {
        this.documentEntryMethod = identificationEntryMethod;
        this.selfieEntryMethod = identificationSelfieEntryMethod;
        this.documentTypes = list;
        this.services = list2;
        this.stateCodes = list3;
        this.countryCodes = list4;
        this.regionCodes = list5;
        this.minimumScore = d;
        this.maxDocumentExpirationDays = num;
        this.canSubmit = bool;
        this.hasJurisdictionRestrictions = (list3 == null && list4 == null && list5 == null) ? false : true;
    }

    public /* synthetic */ IdentificationAcceptableMethod(IdentificationEntryMethod identificationEntryMethod, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, List list, List list2, List list3, List list4, List list5, Double d, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : identificationEntryMethod, (i & 2) != 0 ? null : identificationSelfieEntryMethod, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : num, (i & 512) == 0 ? bool : null);
    }
}
