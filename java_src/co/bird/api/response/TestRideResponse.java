package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/response/TestRideResponse;", "", "successTitle", "", "successMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getSuccessMessage", "()Ljava/lang/String;", "getSuccessTitle", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TestRideResponse {
    @JsonProperty("success_message")
    @InterfaceC41208ft5("success_message")
    private final String successMessage;
    @JsonProperty("success_title")
    @InterfaceC41208ft5("success_title")
    private final String successTitle;

    public TestRideResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ TestRideResponse copy$default(TestRideResponse testRideResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testRideResponse.successTitle;
        }
        if ((i & 2) != 0) {
            str2 = testRideResponse.successMessage;
        }
        return testRideResponse.copy(str, str2);
    }

    public final String component1() {
        return this.successTitle;
    }

    public final String component2() {
        return this.successMessage;
    }

    public final TestRideResponse copy(String str, String str2) {
        return new TestRideResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestRideResponse) {
            TestRideResponse testRideResponse = (TestRideResponse) obj;
            return Intrinsics.areEqual(this.successTitle, testRideResponse.successTitle) && Intrinsics.areEqual(this.successMessage, testRideResponse.successMessage);
        }
        return false;
    }

    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public final String getSuccessTitle() {
        return this.successTitle;
    }

    public int hashCode() {
        String str = this.successTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.successMessage;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.successTitle;
        String str2 = this.successMessage;
        return "TestRideResponse(successTitle=" + str + ", successMessage=" + str2 + ")";
    }

    public TestRideResponse(String str, String str2) {
        this.successTitle = str;
        this.successMessage = str2;
    }

    public /* synthetic */ TestRideResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
