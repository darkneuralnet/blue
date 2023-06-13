package co.bird.android.model.identification;

import co.bird.android.model.wire.WireIdentificationSubmissionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"toSubmissionData", "Lco/bird/android/model/identification/IdentificationSubmissionData;", "Lco/bird/android/model/wire/WireIdentificationSubmissionData;", "toWire", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationSubmissionDataKt {
    public static final IdentificationSubmissionData toSubmissionData(WireIdentificationSubmissionData wireIdentificationSubmissionData) {
        Intrinsics.checkNotNullParameter(wireIdentificationSubmissionData, "<this>");
        return new IdentificationSubmissionData(wireIdentificationSubmissionData.getBarcode(), wireIdentificationSubmissionData.getDocumentFront(), wireIdentificationSubmissionData.getDocumentBack(), wireIdentificationSubmissionData.getSelfiePhoto(), wireIdentificationSubmissionData.getSelfieVideo());
    }

    public static final WireIdentificationSubmissionData toWire(IdentificationSubmissionData identificationSubmissionData) {
        Intrinsics.checkNotNullParameter(identificationSubmissionData, "<this>");
        return new WireIdentificationSubmissionData(identificationSubmissionData.getBarcode(), identificationSubmissionData.getDocumentFront(), identificationSubmissionData.getDocumentBack(), identificationSubmissionData.getSelfiePhoto(), identificationSubmissionData.getSelfieVideo());
    }
}
