package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J]\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationSubmissionData;", "", "barcode", "", "documentFront", "", "documentBack", "selfiePhoto", "selfieVideo", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBarcode", "()Ljava/lang/String;", "getDocumentBack", "()Ljava/util/List;", "getDocumentFront", "getSelfiePhoto", "getSelfieVideo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationSubmissionData {
    private final String barcode;
    private final List<String> documentBack;
    private final List<String> documentFront;
    private final List<String> selfiePhoto;
    private final List<String> selfieVideo;

    public IdentificationSubmissionData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ IdentificationSubmissionData copy$default(IdentificationSubmissionData identificationSubmissionData, String str, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identificationSubmissionData.barcode;
        }
        List<String> list5 = list;
        if ((i & 2) != 0) {
            list5 = identificationSubmissionData.documentFront;
        }
        List list6 = list5;
        List<String> list7 = list2;
        if ((i & 4) != 0) {
            list7 = identificationSubmissionData.documentBack;
        }
        List list8 = list7;
        List<String> list9 = list3;
        if ((i & 8) != 0) {
            list9 = identificationSubmissionData.selfiePhoto;
        }
        List list10 = list9;
        List<String> list11 = list4;
        if ((i & 16) != 0) {
            list11 = identificationSubmissionData.selfieVideo;
        }
        return identificationSubmissionData.copy(str, list6, list8, list10, list11);
    }

    public final String component1() {
        return this.barcode;
    }

    public final List<String> component2() {
        return this.documentFront;
    }

    public final List<String> component3() {
        return this.documentBack;
    }

    public final List<String> component4() {
        return this.selfiePhoto;
    }

    public final List<String> component5() {
        return this.selfieVideo;
    }

    public final IdentificationSubmissionData copy(String str, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        return new IdentificationSubmissionData(str, list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationSubmissionData) {
            IdentificationSubmissionData identificationSubmissionData = (IdentificationSubmissionData) obj;
            return Intrinsics.areEqual(this.barcode, identificationSubmissionData.barcode) && Intrinsics.areEqual(this.documentFront, identificationSubmissionData.documentFront) && Intrinsics.areEqual(this.documentBack, identificationSubmissionData.documentBack) && Intrinsics.areEqual(this.selfiePhoto, identificationSubmissionData.selfiePhoto) && Intrinsics.areEqual(this.selfieVideo, identificationSubmissionData.selfieVideo);
        }
        return false;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final List<String> getDocumentBack() {
        return this.documentBack;
    }

    public final List<String> getDocumentFront() {
        return this.documentFront;
    }

    public final List<String> getSelfiePhoto() {
        return this.selfiePhoto;
    }

    public final List<String> getSelfieVideo() {
        return this.selfieVideo;
    }

    public int hashCode() {
        String str = this.barcode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.documentFront;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.documentBack;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.selfiePhoto;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.selfieVideo;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        String str = this.barcode;
        List<String> list = this.documentFront;
        List<String> list2 = this.documentBack;
        List<String> list3 = this.selfiePhoto;
        List<String> list4 = this.selfieVideo;
        return "IdentificationSubmissionData(barcode=" + str + ", documentFront=" + list + ", documentBack=" + list2 + ", selfiePhoto=" + list3 + ", selfieVideo=" + list4 + ")";
    }

    public IdentificationSubmissionData(String str, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.barcode = str;
        this.documentFront = list;
        this.documentBack = list2;
        this.selfiePhoto = list3;
        this.selfieVideo = list4;
    }

    public /* synthetic */ IdentificationSubmissionData(String str, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
