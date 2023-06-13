package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.ComplaintResolution;
import co.bird.android.model.persistence.ComplaintResolutionForm;
import co.bird.android.model.persistence.nestedstructures.ComplaintActionTakenRequiredField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import co.bird.android.model.wire.WireComplaintActionTakenRequiredField;
import co.bird.android.model.wire.WireComplaintIssueOption;
import co.bird.android.model.wire.WireComplaintResolutionFormResponse;
import co.bird.api.request.ComplaintResolutionSubmissionRequest;
import co.bird.api.request.ComplaintResolutionUpdateRequest;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\r\u001a\u00020\f*\u00020\t¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "c", "Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;", "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", C17296a.f69688o, "Lco/bird/android/model/wire/WireComplaintIssueOption;", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "b", "Lco/bird/android/model/persistence/ComplaintResolution;", "Lco/bird/api/request/ComplaintResolutionSubmissionRequest;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/ComplaintResolutionUpdateRequest;", "e", "co.bird.android.repository.complaint-resolution"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintResolutionConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConversion.kt\nco/bird/android/repository/complaintresolution/converter/ComplaintResolutionConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,3:62\n1549#2:65\n1620#2,3:66\n1549#2:69\n1620#2,3:70\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConversion.kt\nco/bird/android/repository/complaintresolution/converter/ComplaintResolutionConversionKt\n*L\n15#1:61\n15#1:62,3\n16#1:65\n16#1:66,3\n17#1:69\n17#1:70,3\n18#1:73\n18#1:74,3\n*E\n"})
/* renamed from: Aq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31757Aq0 {
    /* renamed from: a */
    public static final ComplaintActionTakenRequiredField m115125a(WireComplaintActionTakenRequiredField wireComplaintActionTakenRequiredField) {
        Intrinsics.checkNotNullParameter(wireComplaintActionTakenRequiredField, "<this>");
        return new ComplaintActionTakenRequiredField(wireComplaintActionTakenRequiredField.getField(), wireComplaintActionTakenRequiredField.getRequired());
    }

    /* renamed from: b */
    public static final ComplaintIssueOption m115124b(WireComplaintIssueOption wireComplaintIssueOption) {
        Intrinsics.checkNotNullParameter(wireComplaintIssueOption, "<this>");
        return new ComplaintIssueOption(wireComplaintIssueOption.getValue(), wireComplaintIssueOption.getLabel());
    }

    /* renamed from: c */
    public static final ComplaintResolutionForm m115123c(WireComplaintResolutionFormResponse wireComplaintResolutionFormResponse) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        Intrinsics.checkNotNullParameter(wireComplaintResolutionFormResponse, "<this>");
        List<WireComplaintActionTakenRequiredField> actionTakenRequiredFields = wireComplaintResolutionFormResponse.getActionTakenRequiredFields();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(actionTakenRequiredFields, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireComplaintActionTakenRequiredField wireComplaintActionTakenRequiredField : actionTakenRequiredFields) {
            arrayList.add(m115125a(wireComplaintActionTakenRequiredField));
        }
        List<WireComplaintActionTakenRequiredField> noActionTakenRequiredFields = wireComplaintResolutionFormResponse.getNoActionTakenRequiredFields();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(noActionTakenRequiredFields, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireComplaintActionTakenRequiredField wireComplaintActionTakenRequiredField2 : noActionTakenRequiredFields) {
            arrayList2.add(m115125a(wireComplaintActionTakenRequiredField2));
        }
        List<WireComplaintIssueOption> issueOptions = wireComplaintResolutionFormResponse.getIssueOptions();
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(issueOptions, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (WireComplaintIssueOption wireComplaintIssueOption : issueOptions) {
            arrayList3.add(m115124b(wireComplaintIssueOption));
        }
        List<WireComplaintIssueOption> actionTakenOptions = wireComplaintResolutionFormResponse.getActionTakenOptions();
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(actionTakenOptions, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault4);
        for (WireComplaintIssueOption wireComplaintIssueOption2 : actionTakenOptions) {
            arrayList4.add(m115124b(wireComplaintIssueOption2));
        }
        return new ComplaintResolutionForm(arrayList, arrayList2, arrayList3, arrayList4);
    }

    /* renamed from: d */
    public static final ComplaintResolutionSubmissionRequest m115122d(ComplaintResolution complaintResolution) {
        Intrinsics.checkNotNullParameter(complaintResolution, "<this>");
        return new ComplaintResolutionSubmissionRequest(complaintResolution.getComplaintIds(), complaintResolution.getSituation(), complaintResolution.getBeforePhotoAssetId(), complaintResolution.getAfterPhotoAssetId(), complaintResolution.getIssues(), complaintResolution.getActionTaken(), complaintResolution.getVehicleIdsInvolved(), complaintResolution.getAdditionalNotes());
    }

    /* renamed from: e */
    public static final ComplaintResolutionUpdateRequest m115121e(ComplaintResolution complaintResolution) {
        Intrinsics.checkNotNullParameter(complaintResolution, "<this>");
        return new ComplaintResolutionUpdateRequest(complaintResolution.getComplaintIds(), complaintResolution.getBeforePhotoAssetId(), complaintResolution.getAfterPhotoAssetId(), complaintResolution.getIssues(), complaintResolution.getActionTaken(), complaintResolution.getVehicleIdsInvolved(), complaintResolution.getAdditionalNotes());
    }
}
