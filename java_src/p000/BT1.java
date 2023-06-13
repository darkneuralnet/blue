package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.identification.IdentificationAcceptableAttestation;
import co.bird.android.model.identification.IdentificationAcceptableManualEntry;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationEntry;
import co.bird.android.model.identification.IdentificationEntryMethod;
import co.bird.android.model.identification.IdentificationIngestionResult;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationRejectionReason;
import co.bird.android.model.identification.IdentificationSelfieEntryMethod;
import co.bird.android.model.identification.IdentificationStatus;
import co.bird.android.model.wire.WireIdentification;
import co.bird.android.model.wire.WireIdentificationAcceptableAttestation;
import co.bird.android.model.wire.WireIdentificationAcceptableManualEntry;
import co.bird.android.model.wire.WireIdentificationAcceptableMethod;
import co.bird.api.response.WireIdentificationIntentPermissionResponse;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/response/WireIdentificationIntentPermissionResponse;", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "e", "", "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;", "Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "c", "Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;", "Lco/bird/android/model/identification/IdentificationAcceptableAttestation;", C17296a.f69688o, "Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "b", "Lco/bird/android/model/wire/WireIdentification;", "Lco/bird/android/model/identification/IdentificationEntry;", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManager.kt\nco/bird/android/coreinterface/manager/IdentificationManagerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n1#2:213\n1#2:227\n1549#3:214\n1620#3,2:215\n1603#3,9:217\n1855#3:226\n1856#3:228\n1612#3:229\n1622#3:230\n1549#3:231\n1620#3,3:232\n1549#3:235\n1620#3,3:236\n*S KotlinDebug\n*F\n+ 1 IdentificationManager.kt\nco/bird/android/coreinterface/manager/IdentificationManagerKt\n*L\n149#1:227\n144#1:214\n144#1:215,2\n149#1:217,9\n149#1:226\n149#1:228\n149#1:229\n144#1:230\n174#1:231\n174#1:232,3\n175#1:235\n175#1:236,3\n*E\n"})
/* renamed from: BT1 */
/* loaded from: classes2.dex */
public final class BT1 {
    /* renamed from: a */
    public static final IdentificationAcceptableAttestation m114013a(WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(wireIdentificationAcceptableAttestation, "<this>");
        Integer numberRemaining = wireIdentificationAcceptableAttestation.getNumberRemaining();
        if (numberRemaining != null) {
            i = numberRemaining.intValue();
        } else {
            i = 1;
        }
        List<String> validReasons = wireIdentificationAcceptableAttestation.getValidReasons();
        if (validReasons == null) {
            validReasons = CollectionsKt__CollectionsKt.emptyList();
        }
        Integer durationSeconds = wireIdentificationAcceptableAttestation.getDurationSeconds();
        if (durationSeconds != null) {
            i2 = durationSeconds.intValue();
        } else {
            i2 = 0;
        }
        return new IdentificationAcceptableAttestation(i, validReasons, i2, wireIdentificationAcceptableAttestation.getMinAge());
    }

    /* renamed from: b */
    public static final IdentificationAcceptableManualEntry m114012b(WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry) {
        boolean z;
        List emptyList;
        ArrayList arrayList;
        List emptyList2;
        ArrayList arrayList2;
        boolean z2;
        boolean z3;
        boolean z4;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireIdentificationAcceptableManualEntry, "<this>");
        Boolean offerBeforeScan = wireIdentificationAcceptableManualEntry.getOfferBeforeScan();
        boolean z5 = false;
        if (offerBeforeScan != null) {
            z = offerBeforeScan.booleanValue();
        } else {
            z = false;
        }
        List<String> allowedDocumentTypes = wireIdentificationAcceptableManualEntry.getAllowedDocumentTypes();
        if (allowedDocumentTypes != null) {
            List<String> list = allowedDocumentTypes;
            IdentificationDocumentType.Companion companion = IdentificationDocumentType.Companion;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (String str : list) {
                arrayList3.add(companion.fromWire(str));
            }
            arrayList = arrayList3;
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            arrayList = emptyList;
        }
        List<String> allowedSpecialDocumentTypes = wireIdentificationAcceptableManualEntry.getAllowedSpecialDocumentTypes();
        if (allowedSpecialDocumentTypes != null) {
            List<String> list2 = allowedSpecialDocumentTypes;
            IdentificationDocumentType.Companion companion2 = IdentificationDocumentType.Companion;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
            for (String str2 : list2) {
                arrayList4.add(companion2.fromWire(str2));
            }
            arrayList2 = arrayList4;
        } else {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            arrayList2 = emptyList2;
        }
        String requireIdNumberRegex = wireIdentificationAcceptableManualEntry.getRequireIdNumberRegex();
        List<String> requireIssuingAuthority = wireIdentificationAcceptableManualEntry.getRequireIssuingAuthority();
        Boolean requireGender = wireIdentificationAcceptableManualEntry.getRequireGender();
        if (requireGender != null) {
            z2 = requireGender.booleanValue();
        } else {
            z2 = false;
        }
        Boolean requireNationality = wireIdentificationAcceptableManualEntry.getRequireNationality();
        if (requireNationality != null) {
            z5 = requireNationality.booleanValue();
        }
        boolean z6 = z5;
        Boolean requireName = wireIdentificationAcceptableManualEntry.getRequireName();
        if (requireName != null) {
            z3 = requireName.booleanValue();
        } else {
            z3 = true;
        }
        Boolean requireIssueDate = wireIdentificationAcceptableManualEntry.getRequireIssueDate();
        if (requireIssueDate != null) {
            z4 = requireIssueDate.booleanValue();
        } else {
            z4 = true;
        }
        return new IdentificationAcceptableManualEntry(z, arrayList, arrayList2, requireIdNumberRegex, requireIssuingAuthority, z2, z6, z3, z4, wireIdentificationAcceptableManualEntry.getImplicitAgeYears(), wireIdentificationAcceptableManualEntry.getImplicitExpirationDays());
    }

    /* renamed from: c */
    public static final List<IdentificationAcceptableMethod> m114011c(List<WireIdentificationAcceptableMethod> list) {
        int collectionSizeOrDefault;
        IdentificationEntryMethod identificationEntryMethod;
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<WireIdentificationAcceptableMethod> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireIdentificationAcceptableMethod wireIdentificationAcceptableMethod : list2) {
            String documentEntryMethod = wireIdentificationAcceptableMethod.getDocumentEntryMethod();
            if (documentEntryMethod == null || (identificationEntryMethod = IdentificationEntryMethod.Companion.fromWire(documentEntryMethod)) == null) {
                identificationEntryMethod = IdentificationEntryMethod.UNKNOWN;
            }
            IdentificationEntryMethod identificationEntryMethod2 = identificationEntryMethod;
            String selfieEntryMethod = wireIdentificationAcceptableMethod.getSelfieEntryMethod();
            ArrayList arrayList2 = null;
            if (selfieEntryMethod != null) {
                identificationSelfieEntryMethod = IdentificationSelfieEntryMethod.Companion.fromWire(selfieEntryMethod);
            } else {
                identificationSelfieEntryMethod = null;
            }
            List<String> documentTypes = wireIdentificationAcceptableMethod.getDocumentTypes();
            if (documentTypes != null) {
                arrayList2 = new ArrayList();
                for (String str : documentTypes) {
                    IdentificationDocumentType nullableFromWire = IdentificationDocumentType.Companion.nullableFromWire(str);
                    if (nullableFromWire != null) {
                        arrayList2.add(nullableFromWire);
                    }
                }
            }
            arrayList.add(new IdentificationAcceptableMethod(identificationEntryMethod2, identificationSelfieEntryMethod, arrayList2, wireIdentificationAcceptableMethod.getServices(), wireIdentificationAcceptableMethod.getStateCodes(), wireIdentificationAcceptableMethod.getCountryCodes(), wireIdentificationAcceptableMethod.getRegionCodes(), wireIdentificationAcceptableMethod.getMinimumScore(), wireIdentificationAcceptableMethod.getMaxDocumentExpirationDays(), wireIdentificationAcceptableMethod.getCanSubmit()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final IdentificationEntry m114010d(WireIdentification wireIdentification) {
        IdentificationDocumentType identificationDocumentType;
        IdentificationEntryMethod identificationEntryMethod;
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod;
        IdentificationIngestionResult identificationIngestionResult;
        Intrinsics.checkNotNullParameter(wireIdentification, "<this>");
        String id = wireIdentification.getId();
        String principalId = wireIdentification.getPrincipalId();
        String userGuestId = wireIdentification.getUserGuestId();
        String service = wireIdentification.getService();
        String serviceTransactionId = wireIdentification.getServiceTransactionId();
        String documentType = wireIdentification.getDocumentType();
        if (documentType == null || (identificationDocumentType = IdentificationDocumentType.Companion.fromWire(documentType)) == null) {
            identificationDocumentType = IdentificationDocumentType.UNKNOWN;
        }
        IdentificationDocumentType identificationDocumentType2 = identificationDocumentType;
        String documentEntryMethod = wireIdentification.getDocumentEntryMethod();
        if (documentEntryMethod == null || (identificationEntryMethod = IdentificationEntryMethod.Companion.fromWire(documentEntryMethod)) == null) {
            identificationEntryMethod = IdentificationEntryMethod.UNKNOWN;
        }
        IdentificationEntryMethod identificationEntryMethod2 = identificationEntryMethod;
        String selfieEntryMethod = wireIdentification.getSelfieEntryMethod();
        if (selfieEntryMethod != null) {
            identificationSelfieEntryMethod = IdentificationSelfieEntryMethod.Companion.fromWire(selfieEntryMethod);
        } else {
            identificationSelfieEntryMethod = null;
        }
        String ingestionResult = wireIdentification.getIngestionResult();
        if (ingestionResult != null) {
            identificationIngestionResult = IdentificationIngestionResult.Companion.fromWire(ingestionResult);
        } else {
            identificationIngestionResult = null;
        }
        return new IdentificationEntry(id, principalId, userGuestId, service, serviceTransactionId, identificationDocumentType2, identificationEntryMethod2, identificationSelfieEntryMethod, null, identificationIngestionResult, wireIdentification.getDocumentHash(), wireIdentification.getScore(), wireIdentification.getStateCode(), wireIdentification.getCountryCode(), wireIdentification.getRegionCode(), wireIdentification.getMinAge(), wireIdentification.getCreatedAt(), wireIdentification.getUpdatedAt(), wireIdentification.getCompletedAt(), wireIdentification.getExpiresAt(), 256, null);
    }

    /* renamed from: e */
    public static final IdentificationIntentPermissionStatus m114009e(WireIdentificationIntentPermissionResponse wireIdentificationIntentPermissionResponse) {
        IdentificationStatus identificationStatus;
        IdentificationRejectionReason identificationRejectionReason;
        IdentificationEntry identificationEntry;
        List<IdentificationAcceptableMethod> list;
        IdentificationAcceptableAttestation identificationAcceptableAttestation;
        IdentificationAcceptableManualEntry identificationAcceptableManualEntry;
        Intrinsics.checkNotNullParameter(wireIdentificationIntentPermissionResponse, "<this>");
        String status = wireIdentificationIntentPermissionResponse.getStatus();
        if (status == null || (identificationStatus = IdentificationStatus.Companion.fromWire(status)) == null) {
            identificationStatus = IdentificationStatus.UNKNOWN;
        }
        IdentificationStatus identificationStatus2 = identificationStatus;
        String rejectionReason = wireIdentificationIntentPermissionResponse.getRejectionReason();
        if (rejectionReason == null || (identificationRejectionReason = IdentificationRejectionReason.Companion.fromWire(rejectionReason)) == null) {
            identificationRejectionReason = IdentificationRejectionReason.UNKNOWN;
        }
        IdentificationRejectionReason identificationRejectionReason2 = identificationRejectionReason;
        WireIdentification identification = wireIdentificationIntentPermissionResponse.getIdentification();
        if (identification != null) {
            identificationEntry = m114010d(identification);
        } else {
            identificationEntry = null;
        }
        List<WireIdentificationAcceptableMethod> acceptableMethods = wireIdentificationIntentPermissionResponse.getAcceptableMethods();
        if (acceptableMethods != null) {
            list = m114011c(acceptableMethods);
        } else {
            list = null;
        }
        WireIdentificationAcceptableAttestation acceptableAttestation = wireIdentificationIntentPermissionResponse.getAcceptableAttestation();
        if (acceptableAttestation != null) {
            identificationAcceptableAttestation = m114013a(acceptableAttestation);
        } else {
            identificationAcceptableAttestation = null;
        }
        WireIdentificationAcceptableManualEntry acceptableManualEntry = wireIdentificationIntentPermissionResponse.getAcceptableManualEntry();
        if (acceptableManualEntry != null) {
            identificationAcceptableManualEntry = m114012b(acceptableManualEntry);
        } else {
            identificationAcceptableManualEntry = null;
        }
        return new IdentificationIntentPermissionStatus(identificationStatus2, identificationRejectionReason2, identificationEntry, list, identificationAcceptableAttestation, identificationAcceptableManualEntry);
    }
}
