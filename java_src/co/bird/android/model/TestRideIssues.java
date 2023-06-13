package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/TestRideIssues;", "", "success", "", "issues", "", "", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getIssues", "()Ljava/util/List;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lco/bird/android/model/TestRideIssues;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TestRideIssues {
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<String> issues;
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final Boolean success;

    public TestRideIssues() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestRideIssues copy$default(TestRideIssues testRideIssues, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = testRideIssues.success;
        }
        if ((i & 2) != 0) {
            list = testRideIssues.issues;
        }
        return testRideIssues.copy(bool, list);
    }

    public final Boolean component1() {
        return this.success;
    }

    public final List<String> component2() {
        return this.issues;
    }

    public final TestRideIssues copy(Boolean bool, List<String> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        return new TestRideIssues(bool, issues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestRideIssues) {
            TestRideIssues testRideIssues = (TestRideIssues) obj;
            return Intrinsics.areEqual(this.success, testRideIssues.success) && Intrinsics.areEqual(this.issues, testRideIssues.issues);
        }
        return false;
    }

    public final List<String> getIssues() {
        return this.issues;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.issues.hashCode();
    }

    public String toString() {
        Boolean bool = this.success;
        List<String> list = this.issues;
        return "TestRideIssues(success=" + bool + ", issues=" + list + ")";
    }

    public TestRideIssues(Boolean bool, List<String> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.success = bool;
        this.issues = issues;
    }

    public /* synthetic */ TestRideIssues(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
