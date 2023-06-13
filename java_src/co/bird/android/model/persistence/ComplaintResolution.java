package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0011HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J£\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001d¨\u00065"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution;", "", "complaintHash", "", "complaintIds", "", "", "situation", "beforePhotoAssetId", "beforePhotoUrl", "afterPhotoAssetId", "afterPhotoUrl", "issues", "actionTaken", "vehicleIdsInvolved", "additionalNotes", "submitted", "", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getActionTaken", "()Ljava/lang/String;", "getAdditionalNotes", "getAfterPhotoAssetId", "getAfterPhotoUrl", "getBeforePhotoAssetId", "getBeforePhotoUrl", "getComplaintHash", "()I", "getComplaintIds", "()Ljava/util/List;", "getIssues", "getSituation", "getSubmitted", "()Z", "getVehicleIdsInvolved", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "Companion", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ComplaintResolution {
    public static final Companion Companion = new Companion(null);
    private final String actionTaken;
    private final String additionalNotes;
    private final String afterPhotoAssetId;
    private final String afterPhotoUrl;
    private final String beforePhotoAssetId;
    private final String beforePhotoUrl;
    private final int complaintHash;
    private final List<String> complaintIds;
    private final List<String> issues;
    private final String situation;
    private final boolean submitted;
    private final List<String> vehicleIdsInvolved;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\u0006R\u001b\u0010\u0003\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution$Companion;", "", "()V", "complaintHash", "", "", "", "getComplaintHash", "(Ljava/util/List;)I", "create", "Lco/bird/android/model/persistence/ComplaintResolution;", "complaintIds", "situation", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComplaintResolution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolution.kt\nco/bird/android/model/persistence/ComplaintResolution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ComplaintResolution create(List<String> complaintIds, String situation) {
            Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
            Intrinsics.checkNotNullParameter(situation, "situation");
            return new ComplaintResolution(getComplaintHash(complaintIds), complaintIds, situation, null, null, null, null, null, null, null, null, false, 4088, null);
        }

        public final int getComplaintHash(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            int i = 0;
            for (String str : list) {
                i += str.hashCode();
            }
            return i;
        }

        private Companion() {
        }
    }

    public ComplaintResolution(int i, List<String> complaintIds, String situation, String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(situation, "situation");
        this.complaintHash = i;
        this.complaintIds = complaintIds;
        this.situation = situation;
        this.beforePhotoAssetId = str;
        this.beforePhotoUrl = str2;
        this.afterPhotoAssetId = str3;
        this.afterPhotoUrl = str4;
        this.issues = list;
        this.actionTaken = str5;
        this.vehicleIdsInvolved = list2;
        this.additionalNotes = str6;
        this.submitted = z;
    }

    public final int component1() {
        return this.complaintHash;
    }

    public final List<String> component10() {
        return this.vehicleIdsInvolved;
    }

    public final String component11() {
        return this.additionalNotes;
    }

    public final boolean component12() {
        return this.submitted;
    }

    public final List<String> component2() {
        return this.complaintIds;
    }

    public final String component3() {
        return this.situation;
    }

    public final String component4() {
        return this.beforePhotoAssetId;
    }

    public final String component5() {
        return this.beforePhotoUrl;
    }

    public final String component6() {
        return this.afterPhotoAssetId;
    }

    public final String component7() {
        return this.afterPhotoUrl;
    }

    public final List<String> component8() {
        return this.issues;
    }

    public final String component9() {
        return this.actionTaken;
    }

    public final ComplaintResolution copy(int i, List<String> complaintIds, String situation, String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(situation, "situation");
        return new ComplaintResolution(i, complaintIds, situation, str, str2, str3, str4, list, str5, list2, str6, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplaintResolution) {
            ComplaintResolution complaintResolution = (ComplaintResolution) obj;
            return this.complaintHash == complaintResolution.complaintHash && Intrinsics.areEqual(this.complaintIds, complaintResolution.complaintIds) && Intrinsics.areEqual(this.situation, complaintResolution.situation) && Intrinsics.areEqual(this.beforePhotoAssetId, complaintResolution.beforePhotoAssetId) && Intrinsics.areEqual(this.beforePhotoUrl, complaintResolution.beforePhotoUrl) && Intrinsics.areEqual(this.afterPhotoAssetId, complaintResolution.afterPhotoAssetId) && Intrinsics.areEqual(this.afterPhotoUrl, complaintResolution.afterPhotoUrl) && Intrinsics.areEqual(this.issues, complaintResolution.issues) && Intrinsics.areEqual(this.actionTaken, complaintResolution.actionTaken) && Intrinsics.areEqual(this.vehicleIdsInvolved, complaintResolution.vehicleIdsInvolved) && Intrinsics.areEqual(this.additionalNotes, complaintResolution.additionalNotes) && this.submitted == complaintResolution.submitted;
        }
        return false;
    }

    public final String getActionTaken() {
        return this.actionTaken;
    }

    public final String getAdditionalNotes() {
        return this.additionalNotes;
    }

    public final String getAfterPhotoAssetId() {
        return this.afterPhotoAssetId;
    }

    public final String getAfterPhotoUrl() {
        return this.afterPhotoUrl;
    }

    public final String getBeforePhotoAssetId() {
        return this.beforePhotoAssetId;
    }

    public final String getBeforePhotoUrl() {
        return this.beforePhotoUrl;
    }

    public final int getComplaintHash() {
        return this.complaintHash;
    }

    public final List<String> getComplaintIds() {
        return this.complaintIds;
    }

    public final List<String> getIssues() {
        return this.issues;
    }

    public final String getSituation() {
        return this.situation;
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    public final List<String> getVehicleIdsInvolved() {
        return this.vehicleIdsInvolved;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.complaintHash) * 31) + this.complaintIds.hashCode()) * 31) + this.situation.hashCode()) * 31;
        String str = this.beforePhotoAssetId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.beforePhotoUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.afterPhotoAssetId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.afterPhotoUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.issues;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.actionTaken;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.vehicleIdsInvolved;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.additionalNotes;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.submitted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode9 + i;
    }

    public String toString() {
        int i = this.complaintHash;
        List<String> list = this.complaintIds;
        String str = this.situation;
        String str2 = this.beforePhotoAssetId;
        String str3 = this.beforePhotoUrl;
        String str4 = this.afterPhotoAssetId;
        String str5 = this.afterPhotoUrl;
        List<String> list2 = this.issues;
        String str6 = this.actionTaken;
        List<String> list3 = this.vehicleIdsInvolved;
        String str7 = this.additionalNotes;
        boolean z = this.submitted;
        return "ComplaintResolution(complaintHash=" + i + ", complaintIds=" + list + ", situation=" + str + ", beforePhotoAssetId=" + str2 + ", beforePhotoUrl=" + str3 + ", afterPhotoAssetId=" + str4 + ", afterPhotoUrl=" + str5 + ", issues=" + list2 + ", actionTaken=" + str6 + ", vehicleIdsInvolved=" + list3 + ", additionalNotes=" + str7 + ", submitted=" + z + ")";
    }

    public /* synthetic */ ComplaintResolution(int i, List list, String str, String str2, String str3, String str4, String str5, List list2, String str6, List list3, String str7, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : list3, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? false : z);
    }
}
