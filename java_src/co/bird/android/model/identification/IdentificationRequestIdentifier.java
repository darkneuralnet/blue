package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "", "intent", "Lco/bird/android/model/identification/IdentificationIntent;", "userGuestId", "", "habitatId", "partnerId", "birdModel", "Lco/bird/android/model/constant/BirdModel;", "(Lco/bird/android/model/identification/IdentificationIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;)V", "getBirdModel", "()Lco/bird/android/model/constant/BirdModel;", "getHabitatId", "()Ljava/lang/String;", "getIntent", "()Lco/bird/android/model/identification/IdentificationIntent;", "getPartnerId", "getUserGuestId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationRequestIdentifier {
    private final BirdModel birdModel;
    private final String habitatId;
    private final IdentificationIntent intent;
    private final String partnerId;
    private final String userGuestId;

    public IdentificationRequestIdentifier(IdentificationIntent intent, String str, String str2, String str3, BirdModel birdModel) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.userGuestId = str;
        this.habitatId = str2;
        this.partnerId = str3;
        this.birdModel = birdModel;
    }

    public static /* synthetic */ IdentificationRequestIdentifier copy$default(IdentificationRequestIdentifier identificationRequestIdentifier, IdentificationIntent identificationIntent, String str, String str2, String str3, BirdModel birdModel, int i, Object obj) {
        if ((i & 1) != 0) {
            identificationIntent = identificationRequestIdentifier.intent;
        }
        if ((i & 2) != 0) {
            str = identificationRequestIdentifier.userGuestId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = identificationRequestIdentifier.habitatId;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = identificationRequestIdentifier.partnerId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            birdModel = identificationRequestIdentifier.birdModel;
        }
        return identificationRequestIdentifier.copy(identificationIntent, str4, str5, str6, birdModel);
    }

    public final IdentificationIntent component1() {
        return this.intent;
    }

    public final String component2() {
        return this.userGuestId;
    }

    public final String component3() {
        return this.habitatId;
    }

    public final String component4() {
        return this.partnerId;
    }

    public final BirdModel component5() {
        return this.birdModel;
    }

    public final IdentificationRequestIdentifier copy(IdentificationIntent intent, String str, String str2, String str3, BirdModel birdModel) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new IdentificationRequestIdentifier(intent, str, str2, str3, birdModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationRequestIdentifier) {
            IdentificationRequestIdentifier identificationRequestIdentifier = (IdentificationRequestIdentifier) obj;
            return this.intent == identificationRequestIdentifier.intent && Intrinsics.areEqual(this.userGuestId, identificationRequestIdentifier.userGuestId) && Intrinsics.areEqual(this.habitatId, identificationRequestIdentifier.habitatId) && Intrinsics.areEqual(this.partnerId, identificationRequestIdentifier.partnerId) && this.birdModel == identificationRequestIdentifier.birdModel;
        }
        return false;
    }

    public final BirdModel getBirdModel() {
        return this.birdModel;
    }

    public final String getHabitatId() {
        return this.habitatId;
    }

    public final IdentificationIntent getIntent() {
        return this.intent;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    public int hashCode() {
        int hashCode = this.intent.hashCode() * 31;
        String str = this.userGuestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.habitatId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BirdModel birdModel = this.birdModel;
        return hashCode4 + (birdModel != null ? birdModel.hashCode() : 0);
    }

    public String toString() {
        IdentificationIntent identificationIntent = this.intent;
        String str = this.userGuestId;
        String str2 = this.habitatId;
        String str3 = this.partnerId;
        BirdModel birdModel = this.birdModel;
        return "IdentificationRequestIdentifier(intent=" + identificationIntent + ", userGuestId=" + str + ", habitatId=" + str2 + ", partnerId=" + str3 + ", birdModel=" + birdModel + ")";
    }

    public /* synthetic */ IdentificationRequestIdentifier(IdentificationIntent identificationIntent, String str, String str2, String str3, BirdModel birdModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identificationIntent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : birdModel);
    }
}
