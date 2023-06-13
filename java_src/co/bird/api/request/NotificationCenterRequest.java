package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/NotificationCenterRequest;", "", "categories", "", "", "lastReceivedDate", "Lorg/joda/time/DateTime;", "userId", "(Ljava/util/List;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getLastReceivedDate", "()Lorg/joda/time/DateTime;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NotificationCenterRequest {
    @JsonProperty("categories")
    @InterfaceC41208ft5("categories")
    private final List<String> categories;
    @JsonProperty("last_received_date")
    @InterfaceC41208ft5("last_received_date")
    private final DateTime lastReceivedDate;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public NotificationCenterRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationCenterRequest copy$default(NotificationCenterRequest notificationCenterRequest, List list, DateTime dateTime, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notificationCenterRequest.categories;
        }
        if ((i & 2) != 0) {
            dateTime = notificationCenterRequest.lastReceivedDate;
        }
        if ((i & 4) != 0) {
            str = notificationCenterRequest.userId;
        }
        return notificationCenterRequest.copy(list, dateTime, str);
    }

    public final List<String> component1() {
        return this.categories;
    }

    public final DateTime component2() {
        return this.lastReceivedDate;
    }

    public final String component3() {
        return this.userId;
    }

    public final NotificationCenterRequest copy(List<String> list, DateTime dateTime, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new NotificationCenterRequest(list, dateTime, userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationCenterRequest) {
            NotificationCenterRequest notificationCenterRequest = (NotificationCenterRequest) obj;
            return Intrinsics.areEqual(this.categories, notificationCenterRequest.categories) && Intrinsics.areEqual(this.lastReceivedDate, notificationCenterRequest.lastReceivedDate) && Intrinsics.areEqual(this.userId, notificationCenterRequest.userId);
        }
        return false;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final DateTime getLastReceivedDate() {
        return this.lastReceivedDate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        List<String> list = this.categories;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        DateTime dateTime = this.lastReceivedDate;
        return ((hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31) + this.userId.hashCode();
    }

    public String toString() {
        List<String> list = this.categories;
        DateTime dateTime = this.lastReceivedDate;
        String str = this.userId;
        return "NotificationCenterRequest(categories=" + list + ", lastReceivedDate=" + dateTime + ", userId=" + str + ")";
    }

    public NotificationCenterRequest(List<String> list, DateTime dateTime, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.categories = list;
        this.lastReceivedDate = dateTime;
        this.userId = userId;
    }

    public /* synthetic */ NotificationCenterRequest(List list, DateTime dateTime, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : dateTime, (i & 4) != 0 ? "" : str);
    }
}
