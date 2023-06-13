package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/Detail;", "", "title", "", "detail", "textColor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDetail", "()Ljava/lang/String;", "getTextColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/android/model/Detail;", "copyWithoutNulls", "detailIsNotBlank", "", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Detail {
    public static final Companion Companion = new Companion(null);
    public static final String EMPTY_CHAR = "-";
    @JsonProperty("detail")
    @InterfaceC41208ft5("detail")
    private final String detail;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final Integer textColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/Detail$Companion;", "", "()V", "EMPTY_CHAR", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Detail() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Detail copy$default(Detail detail, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detail.title;
        }
        if ((i & 2) != 0) {
            str2 = detail.detail;
        }
        if ((i & 4) != 0) {
            num = detail.textColor;
        }
        return detail.copy(str, str2, num);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.detail;
    }

    public final Integer component3() {
        return this.textColor;
    }

    public final Detail copy(String title, String str, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new Detail(title, str, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Detail copyWithoutNulls() {
        boolean z;
        String str;
        boolean isBlank;
        String str2 = this.title;
        String str3 = this.detail;
        if (str3 != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str3);
            if (!isBlank) {
                z = false;
                if (!z) {
                    str = EMPTY_CHAR;
                } else {
                    str = this.detail;
                }
                return copy(str2, str, this.textColor);
            }
        }
        z = true;
        if (!z) {
        }
        return copy(str2, str, this.textColor);
    }

    public final boolean detailIsNotBlank() {
        boolean z;
        boolean isBlank;
        String str = this.detail;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                return (z || Intrinsics.areEqual(this.detail, EMPTY_CHAR)) ? false : true;
            }
        }
        z = true;
        if (z) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Detail) {
            Detail detail = (Detail) obj;
            return Intrinsics.areEqual(this.title, detail.title) && Intrinsics.areEqual(this.detail, detail.detail) && Intrinsics.areEqual(this.textColor, detail.textColor);
        }
        return false;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.detail;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.textColor;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.detail;
        Integer num = this.textColor;
        return "Detail(title=" + str + ", detail=" + str2 + ", textColor=" + num + ")";
    }

    public Detail(String title, String str, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.detail = str;
        this.textColor = num;
    }

    public /* synthetic */ Detail(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
