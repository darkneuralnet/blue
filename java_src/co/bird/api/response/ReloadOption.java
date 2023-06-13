package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012JT\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006#"}, m28432d2 = {"Lco/bird/api/response/ReloadOption;", "", "id", "", "amount", "", "incentiveText", "incentiveSubtext", "incentiveTag", "incentiveTagColor", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAmount", "()J", "getId", "()Ljava/lang/String;", "getIncentiveSubtext", "getIncentiveTag", "getIncentiveTagColor", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIncentiveText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lco/bird/api/response/ReloadOption;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReloadOption {
    private final long amount;

    /* renamed from: id */
    private final String f68226id;
    private final String incentiveSubtext;
    private final String incentiveTag;
    private final Long incentiveTagColor;
    private final String incentiveText;

    public ReloadOption(String str, long j, String str2, String str3, String str4, Long l) {
        this.f68226id = str;
        this.amount = j;
        this.incentiveText = str2;
        this.incentiveSubtext = str3;
        this.incentiveTag = str4;
        this.incentiveTagColor = l;
    }

    public static /* synthetic */ ReloadOption copy$default(ReloadOption reloadOption, String str, long j, String str2, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reloadOption.f68226id;
        }
        if ((i & 2) != 0) {
            j = reloadOption.amount;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = reloadOption.incentiveText;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = reloadOption.incentiveSubtext;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = reloadOption.incentiveTag;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            l = reloadOption.incentiveTagColor;
        }
        return reloadOption.copy(str, j2, str5, str6, str7, l);
    }

    public final String component1() {
        return this.f68226id;
    }

    public final long component2() {
        return this.amount;
    }

    public final String component3() {
        return this.incentiveText;
    }

    public final String component4() {
        return this.incentiveSubtext;
    }

    public final String component5() {
        return this.incentiveTag;
    }

    public final Long component6() {
        return this.incentiveTagColor;
    }

    public final ReloadOption copy(String str, long j, String str2, String str3, String str4, Long l) {
        return new ReloadOption(str, j, str2, str3, str4, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReloadOption) {
            ReloadOption reloadOption = (ReloadOption) obj;
            return Intrinsics.areEqual(this.f68226id, reloadOption.f68226id) && this.amount == reloadOption.amount && Intrinsics.areEqual(this.incentiveText, reloadOption.incentiveText) && Intrinsics.areEqual(this.incentiveSubtext, reloadOption.incentiveSubtext) && Intrinsics.areEqual(this.incentiveTag, reloadOption.incentiveTag) && Intrinsics.areEqual(this.incentiveTagColor, reloadOption.incentiveTagColor);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.f68226id;
    }

    public final String getIncentiveSubtext() {
        return this.incentiveSubtext;
    }

    public final String getIncentiveTag() {
        return this.incentiveTag;
    }

    public final Long getIncentiveTagColor() {
        return this.incentiveTagColor;
    }

    public final String getIncentiveText() {
        return this.incentiveText;
    }

    public int hashCode() {
        String str = this.f68226id;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.amount)) * 31;
        String str2 = this.incentiveText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.incentiveSubtext;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.incentiveTag;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.incentiveTagColor;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68226id;
        long j = this.amount;
        String str2 = this.incentiveText;
        String str3 = this.incentiveSubtext;
        String str4 = this.incentiveTag;
        Long l = this.incentiveTagColor;
        return "ReloadOption(id=" + str + ", amount=" + j + ", incentiveText=" + str2 + ", incentiveSubtext=" + str3 + ", incentiveTag=" + str4 + ", incentiveTagColor=" + l + ")";
    }
}
