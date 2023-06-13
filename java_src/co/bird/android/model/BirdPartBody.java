package co.bird.android.model;

import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/BirdPartBody;", "", "attachSource", "Lco/bird/android/model/AttachSource;", "sourcePart", "Lco/bird/android/model/wire/WirePart;", "identifyingPart", "partKind", "Lco/bird/android/model/constant/PartKind;", "birdId", "", "(Lco/bird/android/model/AttachSource;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "getAttachSource", "()Lco/bird/android/model/AttachSource;", "getBirdId", "()Ljava/lang/String;", "getIdentifyingPart", "()Lco/bird/android/model/wire/WirePart;", "getPartKind", "()Lco/bird/android/model/constant/PartKind;", "getSourcePart", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPartBody {
    @JsonProperty("attach_source")
    @InterfaceC41208ft5("attach_source")
    private final AttachSource attachSource;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("identifying_part")
    @InterfaceC41208ft5("identifying_part")
    private final WirePart identifyingPart;
    @JsonProperty("part_kind")
    @InterfaceC41208ft5("part_kind")
    private final PartKind partKind;
    @JsonProperty("source_part")
    @InterfaceC41208ft5("source_part")
    private final WirePart sourcePart;

    public BirdPartBody() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BirdPartBody copy$default(BirdPartBody birdPartBody, AttachSource attachSource, WirePart wirePart, WirePart wirePart2, PartKind partKind, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            attachSource = birdPartBody.attachSource;
        }
        if ((i & 2) != 0) {
            wirePart = birdPartBody.sourcePart;
        }
        WirePart wirePart3 = wirePart;
        if ((i & 4) != 0) {
            wirePart2 = birdPartBody.identifyingPart;
        }
        WirePart wirePart4 = wirePart2;
        if ((i & 8) != 0) {
            partKind = birdPartBody.partKind;
        }
        PartKind partKind2 = partKind;
        if ((i & 16) != 0) {
            str = birdPartBody.birdId;
        }
        return birdPartBody.copy(attachSource, wirePart3, wirePart4, partKind2, str);
    }

    public final AttachSource component1() {
        return this.attachSource;
    }

    public final WirePart component2() {
        return this.sourcePart;
    }

    public final WirePart component3() {
        return this.identifyingPart;
    }

    public final PartKind component4() {
        return this.partKind;
    }

    public final String component5() {
        return this.birdId;
    }

    public final BirdPartBody copy(AttachSource attachSource, WirePart wirePart, WirePart wirePart2, PartKind partKind, String birdId) {
        Intrinsics.checkNotNullParameter(attachSource, "attachSource");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new BirdPartBody(attachSource, wirePart, wirePart2, partKind, birdId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPartBody) {
            BirdPartBody birdPartBody = (BirdPartBody) obj;
            return this.attachSource == birdPartBody.attachSource && Intrinsics.areEqual(this.sourcePart, birdPartBody.sourcePart) && Intrinsics.areEqual(this.identifyingPart, birdPartBody.identifyingPart) && this.partKind == birdPartBody.partKind && Intrinsics.areEqual(this.birdId, birdPartBody.birdId);
        }
        return false;
    }

    public final AttachSource getAttachSource() {
        return this.attachSource;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final WirePart getIdentifyingPart() {
        return this.identifyingPart;
    }

    public final PartKind getPartKind() {
        return this.partKind;
    }

    public final WirePart getSourcePart() {
        return this.sourcePart;
    }

    public int hashCode() {
        int hashCode = this.attachSource.hashCode() * 31;
        WirePart wirePart = this.sourcePart;
        int hashCode2 = (hashCode + (wirePart == null ? 0 : wirePart.hashCode())) * 31;
        WirePart wirePart2 = this.identifyingPart;
        int hashCode3 = (hashCode2 + (wirePart2 == null ? 0 : wirePart2.hashCode())) * 31;
        PartKind partKind = this.partKind;
        return ((hashCode3 + (partKind != null ? partKind.hashCode() : 0)) * 31) + this.birdId.hashCode();
    }

    public String toString() {
        AttachSource attachSource = this.attachSource;
        WirePart wirePart = this.sourcePart;
        WirePart wirePart2 = this.identifyingPart;
        PartKind partKind = this.partKind;
        String str = this.birdId;
        return "BirdPartBody(attachSource=" + attachSource + ", sourcePart=" + wirePart + ", identifyingPart=" + wirePart2 + ", partKind=" + partKind + ", birdId=" + str + ")";
    }

    public BirdPartBody(AttachSource attachSource, WirePart wirePart, WirePart wirePart2, PartKind partKind, String birdId) {
        Intrinsics.checkNotNullParameter(attachSource, "attachSource");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.attachSource = attachSource;
        this.sourcePart = wirePart;
        this.identifyingPart = wirePart2;
        this.partKind = partKind;
        this.birdId = birdId;
    }

    public /* synthetic */ BirdPartBody(AttachSource attachSource, WirePart wirePart, WirePart wirePart2, PartKind partKind, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AttachSource.SCAN : attachSource, (i & 2) != 0 ? null : wirePart, (i & 4) != 0 ? null : wirePart2, (i & 8) == 0 ? partKind : null, (i & 16) != 0 ? "" : str);
    }
}
