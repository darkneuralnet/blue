package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/BatchBirdFraudReport;", "", "id", "", "userId", "count", "", Entry.TYPE_TEXT, "createAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lorg/joda/time/DateTime;)V", "getCount", "()I", "getCreateAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getText", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BatchBirdFraudReport {
    private final int count;
    private final DateTime createAt;

    /* renamed from: id */
    private final String f66569id;
    private final String text;
    private final String userId;

    public BatchBirdFraudReport(String id, String userId, int i, String text, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f66569id = id;
        this.userId = userId;
        this.count = i;
        this.text = text;
        this.createAt = dateTime;
    }

    public static /* synthetic */ BatchBirdFraudReport copy$default(BatchBirdFraudReport batchBirdFraudReport, String str, String str2, int i, String str3, DateTime dateTime, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = batchBirdFraudReport.f66569id;
        }
        if ((i2 & 2) != 0) {
            str2 = batchBirdFraudReport.userId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = batchBirdFraudReport.count;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = batchBirdFraudReport.text;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            dateTime = batchBirdFraudReport.createAt;
        }
        return batchBirdFraudReport.copy(str, str4, i3, str5, dateTime);
    }

    public final String component1() {
        return this.f66569id;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.count;
    }

    public final String component4() {
        return this.text;
    }

    public final DateTime component5() {
        return this.createAt;
    }

    public final BatchBirdFraudReport copy(String id, String userId, int i, String text, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new BatchBirdFraudReport(id, userId, i, text, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BatchBirdFraudReport) {
            BatchBirdFraudReport batchBirdFraudReport = (BatchBirdFraudReport) obj;
            return Intrinsics.areEqual(this.f66569id, batchBirdFraudReport.f66569id) && Intrinsics.areEqual(this.userId, batchBirdFraudReport.userId) && this.count == batchBirdFraudReport.count && Intrinsics.areEqual(this.text, batchBirdFraudReport.text) && Intrinsics.areEqual(this.createAt, batchBirdFraudReport.createAt);
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final DateTime getCreateAt() {
        return this.createAt;
    }

    public final String getId() {
        return this.f66569id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66569id.hashCode() * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.text.hashCode()) * 31;
        DateTime dateTime = this.createAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f66569id;
        String str2 = this.userId;
        int i = this.count;
        String str3 = this.text;
        DateTime dateTime = this.createAt;
        return "BatchBirdFraudReport(id=" + str + ", userId=" + str2 + ", count=" + i + ", text=" + str3 + ", createAt=" + dateTime + ")";
    }

    public /* synthetic */ BatchBirdFraudReport(String str, String str2, int i, String str3, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? null : dateTime);
    }
}
