package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireNestSuggestionMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/response/NestSuggestionResponse;", "", "message", "Lco/bird/android/model/wire/WireNestSuggestionMessage;", "(Lco/bird/android/model/wire/WireNestSuggestionMessage;)V", "getMessage", "()Lco/bird/android/model/wire/WireNestSuggestionMessage;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestSuggestionResponse {
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final WireNestSuggestionMessage message;

    public NestSuggestionResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ NestSuggestionResponse copy$default(NestSuggestionResponse nestSuggestionResponse, WireNestSuggestionMessage wireNestSuggestionMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            wireNestSuggestionMessage = nestSuggestionResponse.message;
        }
        return nestSuggestionResponse.copy(wireNestSuggestionMessage);
    }

    public final WireNestSuggestionMessage component1() {
        return this.message;
    }

    public final NestSuggestionResponse copy(WireNestSuggestionMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new NestSuggestionResponse(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NestSuggestionResponse) && Intrinsics.areEqual(this.message, ((NestSuggestionResponse) obj).message);
    }

    public final WireNestSuggestionMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        WireNestSuggestionMessage wireNestSuggestionMessage = this.message;
        return "NestSuggestionResponse(message=" + wireNestSuggestionMessage + ")";
    }

    public NestSuggestionResponse(WireNestSuggestionMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public /* synthetic */ NestSuggestionResponse(WireNestSuggestionMessage wireNestSuggestionMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WireNestSuggestionMessage(null, null, 3, null) : wireNestSuggestionMessage);
    }
}
