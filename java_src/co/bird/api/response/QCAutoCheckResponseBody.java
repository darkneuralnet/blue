package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.QCAutoCheck;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/QCAutoCheckResponseBody;", "", "runId", "", "checks", "", "Lco/bird/android/model/QCAutoCheck;", "(Ljava/lang/String;Ljava/util/List;)V", "getChecks", "()Ljava/util/List;", "getRunId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QCAutoCheckResponseBody {
    @JsonProperty("checks")
    @InterfaceC41208ft5("checks")
    private final List<QCAutoCheck> checks;
    @JsonProperty("run_id")
    @InterfaceC41208ft5("run_id")
    private final String runId;

    public QCAutoCheckResponseBody() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QCAutoCheckResponseBody copy$default(QCAutoCheckResponseBody qCAutoCheckResponseBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qCAutoCheckResponseBody.runId;
        }
        if ((i & 2) != 0) {
            list = qCAutoCheckResponseBody.checks;
        }
        return qCAutoCheckResponseBody.copy(str, list);
    }

    public final String component1() {
        return this.runId;
    }

    public final List<QCAutoCheck> component2() {
        return this.checks;
    }

    public final QCAutoCheckResponseBody copy(String runId, List<QCAutoCheck> checks) {
        Intrinsics.checkNotNullParameter(runId, "runId");
        Intrinsics.checkNotNullParameter(checks, "checks");
        return new QCAutoCheckResponseBody(runId, checks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QCAutoCheckResponseBody) {
            QCAutoCheckResponseBody qCAutoCheckResponseBody = (QCAutoCheckResponseBody) obj;
            return Intrinsics.areEqual(this.runId, qCAutoCheckResponseBody.runId) && Intrinsics.areEqual(this.checks, qCAutoCheckResponseBody.checks);
        }
        return false;
    }

    public final List<QCAutoCheck> getChecks() {
        return this.checks;
    }

    public final String getRunId() {
        return this.runId;
    }

    public int hashCode() {
        return (this.runId.hashCode() * 31) + this.checks.hashCode();
    }

    public String toString() {
        String str = this.runId;
        List<QCAutoCheck> list = this.checks;
        return "QCAutoCheckResponseBody(runId=" + str + ", checks=" + list + ")";
    }

    public QCAutoCheckResponseBody(String runId, List<QCAutoCheck> checks) {
        Intrinsics.checkNotNullParameter(runId, "runId");
        Intrinsics.checkNotNullParameter(checks, "checks");
        this.runId = runId;
        this.checks = checks;
    }

    public /* synthetic */ QCAutoCheckResponseBody(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
