package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/BirdFraudReport;", "", "id", "", "birdId", "userId", Entry.TYPE_TEXT, "createAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getBirdId", "()Ljava/lang/String;", "getCreateAt", "()Lorg/joda/time/DateTime;", "getId", "getText", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdFraudReport {
    private final String birdId;
    private final DateTime createAt;

    /* renamed from: id */
    private final String f66570id;
    private final String text;
    private final String userId;

    public BirdFraudReport(String id, String birdId, String userId, String text, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f66570id = id;
        this.birdId = birdId;
        this.userId = userId;
        this.text = text;
        this.createAt = dateTime;
    }

    public static /* synthetic */ BirdFraudReport copy$default(BirdFraudReport birdFraudReport, String str, String str2, String str3, String str4, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdFraudReport.f66570id;
        }
        if ((i & 2) != 0) {
            str2 = birdFraudReport.birdId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = birdFraudReport.userId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = birdFraudReport.text;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            dateTime = birdFraudReport.createAt;
        }
        return birdFraudReport.copy(str, str5, str6, str7, dateTime);
    }

    public final String component1() {
        return this.f66570id;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.text;
    }

    public final DateTime component5() {
        return this.createAt;
    }

    public final BirdFraudReport copy(String id, String birdId, String userId, String text, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new BirdFraudReport(id, birdId, userId, text, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdFraudReport) {
            BirdFraudReport birdFraudReport = (BirdFraudReport) obj;
            return Intrinsics.areEqual(this.f66570id, birdFraudReport.f66570id) && Intrinsics.areEqual(this.birdId, birdFraudReport.birdId) && Intrinsics.areEqual(this.userId, birdFraudReport.userId) && Intrinsics.areEqual(this.text, birdFraudReport.text) && Intrinsics.areEqual(this.createAt, birdFraudReport.createAt);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCreateAt() {
        return this.createAt;
    }

    public final String getId() {
        return this.f66570id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66570id.hashCode() * 31) + this.birdId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.text.hashCode()) * 31;
        DateTime dateTime = this.createAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f66570id;
        String str2 = this.birdId;
        String str3 = this.userId;
        String str4 = this.text;
        DateTime dateTime = this.createAt;
        return "BirdFraudReport(id=" + str + ", birdId=" + str2 + ", userId=" + str3 + ", text=" + str4 + ", createAt=" + dateTime + ")";
    }

    public /* synthetic */ BirdFraudReport(String str, String str2, String str3, String str4, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : dateTime);
    }
}
