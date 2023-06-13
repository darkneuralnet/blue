package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ&\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010*2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020(0*2\u0006\u0010%\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\f\u00105\u001a\b\u0012\u0004\u0012\u00020&0*J\u0010\u00106\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020&J\u0012\u00107\u001a\u0004\u0018\u0001082\b\b\u0002\u00109\u001a\u000208J\u0013\u0010:\u001a\u00020\u00172\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020&HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006?"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "", "status", "Lco/bird/android/model/identification/IdentificationStatus;", "rejectionReason", "Lco/bird/android/model/identification/IdentificationRejectionReason;", "idCard", "Lco/bird/android/model/identification/IdentificationEntry;", "acceptableMethods", "", "Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "acceptableAttestation", "Lco/bird/android/model/identification/IdentificationAcceptableAttestation;", "acceptableManualEntry", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;)V", "getAcceptableAttestation", "()Lco/bird/android/model/identification/IdentificationAcceptableAttestation;", "getAcceptableManualEntry", "()Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "getAcceptableMethods", "()Ljava/util/List;", "attestationAllowed", "", "getAttestationAllowed", "()Z", "getIdCard", "()Lco/bird/android/model/identification/IdentificationEntry;", "manualEntryAllowed", "getManualEntryAllowed", "manualEntryOfferBeforeScan", "getManualEntryOfferBeforeScan", "getRejectionReason", "()Lco/bird/android/model/identification/IdentificationRejectionReason;", "getStatus", "()Lco/bird/android/model/identification/IdentificationStatus;", "acceptableMethod", "countryCode", "", "documentType", "Lco/bird/android/model/identification/IdentificationDocumentType;", "allowedDocumentEntryMethods", "", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "allowedCountryCodes", "allowedDocumentTypes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "countriesAllowingBarcode", "defaultDocumentType", "defaultLocale", "Ljava/util/Locale;", "locale", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIdentificationIntentPermissionStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationIntentPermissionStatus.kt\nco/bird/android/model/identification/IdentificationIntentPermissionStatus\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1789#2,3:126\n1789#2,3:129\n288#2,2:133\n1#3:132\n*S KotlinDebug\n*F\n+ 1 IdentificationIntentPermissionStatus.kt\nco/bird/android/model/identification/IdentificationIntentPermissionStatus\n*L\n24#1:126,3\n34#1:129,3\n100#1:133,2\n*E\n"})
/* loaded from: classes4.dex */
public final class IdentificationIntentPermissionStatus {
    private final IdentificationAcceptableAttestation acceptableAttestation;
    private final IdentificationAcceptableManualEntry acceptableManualEntry;
    private final List<IdentificationAcceptableMethod> acceptableMethods;
    private final boolean attestationAllowed;
    private final IdentificationEntry idCard;
    private final boolean manualEntryAllowed;
    private final boolean manualEntryOfferBeforeScan;
    private final IdentificationRejectionReason rejectionReason;
    private final IdentificationStatus status;

    public IdentificationIntentPermissionStatus(IdentificationStatus status, IdentificationRejectionReason identificationRejectionReason, IdentificationEntry identificationEntry, List<IdentificationAcceptableMethod> list, IdentificationAcceptableAttestation identificationAcceptableAttestation, IdentificationAcceptableManualEntry identificationAcceptableManualEntry) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.rejectionReason = identificationRejectionReason;
        this.idCard = identificationEntry;
        this.acceptableMethods = list;
        this.acceptableAttestation = identificationAcceptableAttestation;
        this.acceptableManualEntry = identificationAcceptableManualEntry;
        boolean z = true;
        this.attestationAllowed = identificationAcceptableAttestation != null;
        this.manualEntryAllowed = identificationAcceptableManualEntry != null;
        this.manualEntryOfferBeforeScan = (identificationAcceptableManualEntry == null || !identificationAcceptableManualEntry.getOfferBeforeScan()) ? false : z;
    }

    public static /* synthetic */ IdentificationIntentPermissionStatus copy$default(IdentificationIntentPermissionStatus identificationIntentPermissionStatus, IdentificationStatus identificationStatus, IdentificationRejectionReason identificationRejectionReason, IdentificationEntry identificationEntry, List list, IdentificationAcceptableAttestation identificationAcceptableAttestation, IdentificationAcceptableManualEntry identificationAcceptableManualEntry, int i, Object obj) {
        if ((i & 1) != 0) {
            identificationStatus = identificationIntentPermissionStatus.status;
        }
        if ((i & 2) != 0) {
            identificationRejectionReason = identificationIntentPermissionStatus.rejectionReason;
        }
        IdentificationRejectionReason identificationRejectionReason2 = identificationRejectionReason;
        if ((i & 4) != 0) {
            identificationEntry = identificationIntentPermissionStatus.idCard;
        }
        IdentificationEntry identificationEntry2 = identificationEntry;
        List<IdentificationAcceptableMethod> list2 = list;
        if ((i & 8) != 0) {
            list2 = identificationIntentPermissionStatus.acceptableMethods;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            identificationAcceptableAttestation = identificationIntentPermissionStatus.acceptableAttestation;
        }
        IdentificationAcceptableAttestation identificationAcceptableAttestation2 = identificationAcceptableAttestation;
        if ((i & 32) != 0) {
            identificationAcceptableManualEntry = identificationIntentPermissionStatus.acceptableManualEntry;
        }
        return identificationIntentPermissionStatus.copy(identificationStatus, identificationRejectionReason2, identificationEntry2, list3, identificationAcceptableAttestation2, identificationAcceptableManualEntry);
    }

    public static /* synthetic */ Locale defaultLocale$default(IdentificationIntentPermissionStatus identificationIntentPermissionStatus, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return identificationIntentPermissionStatus.defaultLocale(locale);
    }

    public final IdentificationAcceptableMethod acceptableMethod(String countryCode, IdentificationDocumentType documentType, Set<? extends IdentificationEntryMethod> allowedDocumentEntryMethods) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(allowedDocumentEntryMethods, "allowedDocumentEntryMethods");
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        if (list == null) {
            return null;
        }
        for (IdentificationAcceptableMethod identificationAcceptableMethod : list) {
            IdentificationEntryMethod documentEntryMethod = identificationAcceptableMethod.getDocumentEntryMethod();
            boolean z3 = true;
            if (documentEntryMethod != null && allowedDocumentEntryMethods.contains(documentEntryMethod)) {
                z = true;
            } else {
                z = false;
            }
            if (z && Intrinsics.areEqual(identificationAcceptableMethod.getCanSubmit(), Boolean.TRUE) && identificationAcceptableMethod.getStateCodes() == null && identificationAcceptableMethod.getRegionCodes() == null) {
                List<String> countryCodes = identificationAcceptableMethod.getCountryCodes();
                if (countryCodes != null && !countryCodes.contains(countryCode)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    continue;
                } else {
                    List<IdentificationDocumentType> documentTypes = identificationAcceptableMethod.getDocumentTypes();
                    if ((documentTypes == null || !documentTypes.contains(documentType)) ? false : false) {
                        return identificationAcceptableMethod;
                    }
                }
            }
        }
        return null;
    }

    public final Set<String> allowedCountryCodes(Set<? extends IdentificationEntryMethod> allowedDocumentEntryMethods) {
        Set<String> emptySet;
        Set<String> emptySet2;
        Intrinsics.checkNotNullParameter(allowedDocumentEntryMethods, "allowedDocumentEntryMethods");
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        if (list != null) {
            emptySet2 = SetsKt__SetsKt.emptySet();
            for (IdentificationAcceptableMethod identificationAcceptableMethod : list) {
                Set<String> allowedCountryCodes = identificationAcceptableMethod.allowedCountryCodes(allowedDocumentEntryMethods);
                if (allowedCountryCodes == null) {
                    return null;
                }
                emptySet2 = CollectionsKt___CollectionsKt.union(emptySet2, allowedCountryCodes);
            }
            if (emptySet2 != null) {
                return emptySet2;
            }
        }
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }

    public final Set<IdentificationDocumentType> allowedDocumentTypes(String countryCode, Set<? extends IdentificationEntryMethod> allowedDocumentEntryMethods) {
        Set<IdentificationDocumentType> emptySet;
        Set<IdentificationDocumentType> emptySet2;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(allowedDocumentEntryMethods, "allowedDocumentEntryMethods");
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        if (list != null) {
            emptySet2 = SetsKt__SetsKt.emptySet();
            for (IdentificationAcceptableMethod identificationAcceptableMethod : list) {
                emptySet2 = CollectionsKt___CollectionsKt.union(emptySet2, identificationAcceptableMethod.allowedDocumentTypes(countryCode, allowedDocumentEntryMethods));
            }
            if (emptySet2 != null) {
                return emptySet2;
            }
        }
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }

    public final IdentificationStatus component1() {
        return this.status;
    }

    public final IdentificationRejectionReason component2() {
        return this.rejectionReason;
    }

    public final IdentificationEntry component3() {
        return this.idCard;
    }

    public final List<IdentificationAcceptableMethod> component4() {
        return this.acceptableMethods;
    }

    public final IdentificationAcceptableAttestation component5() {
        return this.acceptableAttestation;
    }

    public final IdentificationAcceptableManualEntry component6() {
        return this.acceptableManualEntry;
    }

    public final IdentificationIntentPermissionStatus copy(IdentificationStatus status, IdentificationRejectionReason identificationRejectionReason, IdentificationEntry identificationEntry, List<IdentificationAcceptableMethod> list, IdentificationAcceptableAttestation identificationAcceptableAttestation, IdentificationAcceptableManualEntry identificationAcceptableManualEntry) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new IdentificationIntentPermissionStatus(status, identificationRejectionReason, identificationEntry, list, identificationAcceptableAttestation, identificationAcceptableManualEntry);
    }

    public final Set<String> countriesAllowingBarcode() {
        Set<String> set;
        List<String> countryCodes;
        Set<String> emptySet;
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        if (list == null) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (IdentificationAcceptableMethod identificationAcceptableMethod : list) {
            if (Intrinsics.areEqual(identificationAcceptableMethod.getCanSubmit(), Boolean.TRUE) && identificationAcceptableMethod.getDocumentEntryMethod() == IdentificationEntryMethod.BARCODE_ONLY) {
                List<IdentificationDocumentType> documentTypes = identificationAcceptableMethod.getDocumentTypes();
                boolean z = false;
                if (documentTypes != null && documentTypes.contains(IdentificationDocumentType.DRIVER_LICENSE)) {
                    z = true;
                }
                if (z && (countryCodes = identificationAcceptableMethod.getCountryCodes()) != null) {
                    linkedHashSet.addAll(countryCodes);
                }
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(linkedHashSet);
        return set;
    }

    public final IdentificationDocumentType defaultDocumentType(String countryCode) {
        int i;
        List<IdentificationDocumentType> documentTypes;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        if (list == null) {
            return null;
        }
        for (IdentificationAcceptableMethod identificationAcceptableMethod : list) {
            if (Intrinsics.areEqual(identificationAcceptableMethod.getCanSubmit(), Boolean.TRUE)) {
                List<IdentificationDocumentType> documentTypes2 = identificationAcceptableMethod.getDocumentTypes();
                if (documentTypes2 != null) {
                    i = documentTypes2.size();
                } else {
                    i = 0;
                }
                if (i != 0) {
                    if (!identificationAcceptableMethod.allowsCountry(countryCode)) {
                        identificationAcceptableMethod = null;
                    }
                    if (identificationAcceptableMethod != null && (documentTypes = identificationAcceptableMethod.getDocumentTypes()) != null) {
                        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) documentTypes);
                        return (IdentificationDocumentType) firstOrNull;
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public final Locale defaultLocale(Locale locale) {
        IdentificationAcceptableMethod identificationAcceptableMethod;
        String str;
        boolean isBlank;
        List<String> countryCodes;
        Object firstOrNull;
        Object obj;
        int i;
        Intrinsics.checkNotNullParameter(locale, "locale");
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    IdentificationAcceptableMethod identificationAcceptableMethod2 = (IdentificationAcceptableMethod) obj;
                    boolean z = false;
                    if (Intrinsics.areEqual(identificationAcceptableMethod2.getCanSubmit(), Boolean.TRUE)) {
                        List<String> countryCodes2 = identificationAcceptableMethod2.getCountryCodes();
                        if (countryCodes2 != null) {
                            i = countryCodes2.size();
                        } else {
                            i = 0;
                        }
                        if (i > 0) {
                            z = true;
                            continue;
                        } else {
                            continue;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            identificationAcceptableMethod = (IdentificationAcceptableMethod) obj;
        } else {
            identificationAcceptableMethod = null;
        }
        if (identificationAcceptableMethod != null && (countryCodes = identificationAcceptableMethod.getCountryCodes()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) countryCodes);
            str = (String) firstOrNull;
        } else {
            str = null;
        }
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "it.country");
        isBlank = StringsKt__StringsJVMKt.isBlank(country);
        if (!(true ^ isBlank)) {
            locale = null;
        }
        if (locale == null) {
            if (str == null) {
                return null;
            }
            return new Locale("", str);
        }
        return locale;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationIntentPermissionStatus) {
            IdentificationIntentPermissionStatus identificationIntentPermissionStatus = (IdentificationIntentPermissionStatus) obj;
            return this.status == identificationIntentPermissionStatus.status && this.rejectionReason == identificationIntentPermissionStatus.rejectionReason && Intrinsics.areEqual(this.idCard, identificationIntentPermissionStatus.idCard) && Intrinsics.areEqual(this.acceptableMethods, identificationIntentPermissionStatus.acceptableMethods) && Intrinsics.areEqual(this.acceptableAttestation, identificationIntentPermissionStatus.acceptableAttestation) && Intrinsics.areEqual(this.acceptableManualEntry, identificationIntentPermissionStatus.acceptableManualEntry);
        }
        return false;
    }

    public final IdentificationAcceptableAttestation getAcceptableAttestation() {
        return this.acceptableAttestation;
    }

    public final IdentificationAcceptableManualEntry getAcceptableManualEntry() {
        return this.acceptableManualEntry;
    }

    public final List<IdentificationAcceptableMethod> getAcceptableMethods() {
        return this.acceptableMethods;
    }

    public final boolean getAttestationAllowed() {
        return this.attestationAllowed;
    }

    public final IdentificationEntry getIdCard() {
        return this.idCard;
    }

    public final boolean getManualEntryAllowed() {
        return this.manualEntryAllowed;
    }

    public final boolean getManualEntryOfferBeforeScan() {
        return this.manualEntryOfferBeforeScan;
    }

    public final IdentificationRejectionReason getRejectionReason() {
        return this.rejectionReason;
    }

    public final IdentificationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        IdentificationRejectionReason identificationRejectionReason = this.rejectionReason;
        int hashCode2 = (hashCode + (identificationRejectionReason == null ? 0 : identificationRejectionReason.hashCode())) * 31;
        IdentificationEntry identificationEntry = this.idCard;
        int hashCode3 = (hashCode2 + (identificationEntry == null ? 0 : identificationEntry.hashCode())) * 31;
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        IdentificationAcceptableAttestation identificationAcceptableAttestation = this.acceptableAttestation;
        int hashCode5 = (hashCode4 + (identificationAcceptableAttestation == null ? 0 : identificationAcceptableAttestation.hashCode())) * 31;
        IdentificationAcceptableManualEntry identificationAcceptableManualEntry = this.acceptableManualEntry;
        return hashCode5 + (identificationAcceptableManualEntry != null ? identificationAcceptableManualEntry.hashCode() : 0);
    }

    public String toString() {
        IdentificationStatus identificationStatus = this.status;
        IdentificationRejectionReason identificationRejectionReason = this.rejectionReason;
        IdentificationEntry identificationEntry = this.idCard;
        List<IdentificationAcceptableMethod> list = this.acceptableMethods;
        IdentificationAcceptableAttestation identificationAcceptableAttestation = this.acceptableAttestation;
        IdentificationAcceptableManualEntry identificationAcceptableManualEntry = this.acceptableManualEntry;
        return "IdentificationIntentPermissionStatus(status=" + identificationStatus + ", rejectionReason=" + identificationRejectionReason + ", idCard=" + identificationEntry + ", acceptableMethods=" + list + ", acceptableAttestation=" + identificationAcceptableAttestation + ", acceptableManualEntry=" + identificationAcceptableManualEntry + ")";
    }

    public /* synthetic */ IdentificationIntentPermissionStatus(IdentificationStatus identificationStatus, IdentificationRejectionReason identificationRejectionReason, IdentificationEntry identificationEntry, List list, IdentificationAcceptableAttestation identificationAcceptableAttestation, IdentificationAcceptableManualEntry identificationAcceptableManualEntry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identificationStatus, (i & 2) != 0 ? null : identificationRejectionReason, (i & 4) != 0 ? null : identificationEntry, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : identificationAcceptableAttestation, (i & 32) == 0 ? identificationAcceptableManualEntry : null);
    }
}
