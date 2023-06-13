package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireFlagNestReason;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "title", "requiresComment", "", "currentNestSize", "", "maxAllowedNestSize", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getCurrentNestSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxAllowedNestSize", "getRequiresComment", "()Z", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/WireFlagNestReason;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "Companion", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlagNestReason {
    public static final Companion Companion = new Companion(null);
    public static final String INCORRECT_NEST_SIZE_CODE = "incorrect_nest_size";
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("current_nest_size")
    @InterfaceC41208ft5("current_nest_size")
    private final Integer currentNestSize;
    @JsonProperty("max_allowed_nest_size")
    @InterfaceC41208ft5("max_allowed_nest_size")
    private final Integer maxAllowedNestSize;
    @JsonProperty("requires_comment")
    @InterfaceC41208ft5("requires_comment")
    private final boolean requiresComment;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlagNestReason$Companion;", "", "()V", "INCORRECT_NEST_SIZE_CODE", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WireFlagNestReason() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ WireFlagNestReason copy$default(WireFlagNestReason wireFlagNestReason, String str, String str2, boolean z, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFlagNestReason.code;
        }
        if ((i & 2) != 0) {
            str2 = wireFlagNestReason.title;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = wireFlagNestReason.requiresComment;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            num = wireFlagNestReason.currentNestSize;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = wireFlagNestReason.maxAllowedNestSize;
        }
        return wireFlagNestReason.copy(str, str3, z2, num3, num2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.requiresComment;
    }

    public final Integer component4() {
        return this.currentNestSize;
    }

    public final Integer component5() {
        return this.maxAllowedNestSize;
    }

    public final WireFlagNestReason copy(String code, String title, boolean z, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireFlagNestReason(code, title, z, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFlagNestReason) {
            WireFlagNestReason wireFlagNestReason = (WireFlagNestReason) obj;
            return Intrinsics.areEqual(this.code, wireFlagNestReason.code) && Intrinsics.areEqual(this.title, wireFlagNestReason.title) && this.requiresComment == wireFlagNestReason.requiresComment && Intrinsics.areEqual(this.currentNestSize, wireFlagNestReason.currentNestSize) && Intrinsics.areEqual(this.maxAllowedNestSize, wireFlagNestReason.maxAllowedNestSize);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getCurrentNestSize() {
        return this.currentNestSize;
    }

    public final Integer getMaxAllowedNestSize() {
        return this.maxAllowedNestSize;
    }

    public final boolean getRequiresComment() {
        return this.requiresComment;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.code.hashCode() * 31) + this.title.hashCode()) * 31;
        boolean z = this.requiresComment;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.currentNestSize;
        int hashCode2 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxAllowedNestSize;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.title;
        boolean z = this.requiresComment;
        Integer num = this.currentNestSize;
        Integer num2 = this.maxAllowedNestSize;
        return "WireFlagNestReason(code=" + str + ", title=" + str2 + ", requiresComment=" + z + ", currentNestSize=" + num + ", maxAllowedNestSize=" + num2 + ")";
    }

    public WireFlagNestReason(String code, String title, boolean z, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        this.code = code;
        this.title = title;
        this.requiresComment = z;
        this.currentNestSize = num;
        this.maxAllowedNestSize = num2;
    }

    public /* synthetic */ WireFlagNestReason(String str, String str2, boolean z, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
