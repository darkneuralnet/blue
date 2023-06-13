package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LyT;", "", "", "message", "LyT$a;", "reason", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "LyT$a;", "getReason", "()LyT$a;", "<init>", "(Ljava/lang/String;LyT$a;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yT */
/* loaded from: classes4.dex */
public final class C30595yT {
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final EnumC30596a reason;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"LyT$a;", "", "<init>", "(Ljava/lang/String;I)V", "PERMISSION_DENIED", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yT$a */
    /* loaded from: classes4.dex */
    public enum EnumC30596a {
        PERMISSION_DENIED
    }

    public C30595yT(String message, EnumC30596a reason) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.reason = reason;
    }

    public static /* synthetic */ C30595yT copy$default(C30595yT c30595yT, String str, EnumC30596a enumC30596a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c30595yT.message;
        }
        if ((i & 2) != 0) {
            enumC30596a = c30595yT.reason;
        }
        return c30595yT.m3473a(str, enumC30596a);
    }

    /* renamed from: a */
    public final C30595yT m3473a(String message, EnumC30596a reason) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new C30595yT(message, reason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30595yT) {
            C30595yT c30595yT = (C30595yT) obj;
            return Intrinsics.areEqual(this.message, c30595yT.message) && this.reason == c30595yT.reason;
        }
        return false;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.reason.hashCode();
    }

    public String toString() {
        String str = this.message;
        EnumC30596a enumC30596a = this.reason;
        return "BirdUserActionError(message=" + str + ", reason=" + enumC30596a + ")";
    }
}
