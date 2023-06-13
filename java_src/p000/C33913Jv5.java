package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LJv5;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "sessionId", "LJv5$a;", "b", "LJv5$a;", "getEventType", "()LJv5$a;", "eventType", "<init>", "(Ljava/lang/String;LJv5$a;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Jv5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33913Jv5 {

    /* renamed from: a */
    public final String f18771a;

    /* renamed from: b */
    public final EnumC4279a f18772b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LJv5$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Jv5$a */
    /* loaded from: classes2.dex */
    public enum EnumC4279a {
        SESSION_STARTED,
        SESSION_ENDED
    }

    public C33913Jv5(String sessionId, EnumC4279a eventType) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f18771a = sessionId;
        this.f18772b = eventType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33913Jv5) {
            C33913Jv5 c33913Jv5 = (C33913Jv5) obj;
            return Intrinsics.areEqual(this.f18771a, c33913Jv5.f18771a) && this.f18772b == c33913Jv5.f18772b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f18771a.hashCode() * 31) + this.f18772b.hashCode();
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.f18771a + "', eventType='" + this.f18772b + "'}'";
    }
}
