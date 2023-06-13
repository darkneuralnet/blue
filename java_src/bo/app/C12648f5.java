package bo.app;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¨\u0006\u0010"}, m28432d2 = {"Lbo/app/f5;", "LaP1;", "", "toString", "e", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/UUID;", "sessionIdUuid", "<init>", "(Ljava/util/UUID;)V", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.f5 */
/* loaded from: classes.dex */
public final class C12648f5 implements InterfaceC37933aP1<String> {

    /* renamed from: d */
    public static final C12649a f58467d = new C12649a(null);

    /* renamed from: b */
    private final UUID f58468b;

    /* renamed from: c */
    private final String f58469c;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, m28432d2 = {"Lbo/app/f5$a;", "", "Lbo/app/f5;", C17296a.f69688o, "", "sessionId", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f5$a */
    /* loaded from: classes.dex */
    public static final class C12649a {
        public /* synthetic */ C12649a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C12648f5 m63733a() {
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            return new C12648f5(randomUUID);
        }

        private C12649a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final C12648f5 m63732a(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            UUID fromString = UUID.fromString(sessionId);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionId)");
            return new C12648f5(fromString);
        }
    }

    public C12648f5(UUID sessionIdUuid) {
        Intrinsics.checkNotNullParameter(sessionIdUuid, "sessionIdUuid");
        this.f58468b = sessionIdUuid;
        String uuid = sessionIdUuid.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "sessionIdUuid.toString()");
        this.f58469c = uuid;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public String forJsonPut() {
        return this.f58469c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12648f5) && Intrinsics.areEqual(this.f58468b, ((C12648f5) obj).f58468b);
    }

    public int hashCode() {
        return this.f58468b.hashCode();
    }

    public String toString() {
        return this.f58469c;
    }
}
