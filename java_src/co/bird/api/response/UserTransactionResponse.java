package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireRideTransaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/UserTransactionResponse;", "", "user", "Lco/bird/android/model/User;", "transaction", "Lco/bird/android/model/wire/WireRideTransaction;", "(Lco/bird/android/model/User;Lco/bird/android/model/wire/WireRideTransaction;)V", "getTransaction", "()Lco/bird/android/model/wire/WireRideTransaction;", "getUser", "()Lco/bird/android/model/User;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserTransactionResponse {
    @JsonProperty("transaction")
    @InterfaceC41208ft5("transaction")
    private final WireRideTransaction transaction;
    @JsonProperty("user")
    @InterfaceC41208ft5("user")
    private final User user;

    public UserTransactionResponse(User user, WireRideTransaction transaction) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.user = user;
        this.transaction = transaction;
    }

    public static /* synthetic */ UserTransactionResponse copy$default(UserTransactionResponse userTransactionResponse, User user, WireRideTransaction wireRideTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userTransactionResponse.user;
        }
        if ((i & 2) != 0) {
            wireRideTransaction = userTransactionResponse.transaction;
        }
        return userTransactionResponse.copy(user, wireRideTransaction);
    }

    public final User component1() {
        return this.user;
    }

    public final WireRideTransaction component2() {
        return this.transaction;
    }

    public final UserTransactionResponse copy(User user, WireRideTransaction transaction) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new UserTransactionResponse(user, transaction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserTransactionResponse) {
            UserTransactionResponse userTransactionResponse = (UserTransactionResponse) obj;
            return Intrinsics.areEqual(this.user, userTransactionResponse.user) && Intrinsics.areEqual(this.transaction, userTransactionResponse.transaction);
        }
        return false;
    }

    public final WireRideTransaction getTransaction() {
        return this.transaction;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        return (this.user.hashCode() * 31) + this.transaction.hashCode();
    }

    public String toString() {
        User user = this.user;
        WireRideTransaction wireRideTransaction = this.transaction;
        return "UserTransactionResponse(user=" + user + ", transaction=" + wireRideTransaction + ")";
    }
}
