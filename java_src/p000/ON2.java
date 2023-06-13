package p000;

import androidx.lifecycle.C11747p;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m28432d2 = {"LON2;", "LOr6;", "", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "", C17296a.f69688o, "Ljava/util/concurrent/ConcurrentHashMap;", "g", "()Ljava/util/concurrent/ConcurrentHashMap;", "lastDeliveredStates", "", "b", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "activeSubscriptions", "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "mavericksViewId", "Landroidx/lifecycle/p;", TransferTable.COLUMN_STATE, "<init>", "(Landroidx/lifecycle/p;)V", DateTokenConverter.CONVERTER_KEY, "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ON2 */
/* loaded from: classes2.dex */
public final class ON2 extends AbstractC35048Or6 {

    /* renamed from: d */
    public static final C5982a f26447d = new C5982a(null);

    /* renamed from: a */
    public final ConcurrentHashMap<String, Object> f26448a;

    /* renamed from: b */
    public final Set<String> f26449b;

    /* renamed from: c */
    public final String f26450c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LON2$a;", "", "", "PERSISTED_VIEW_ID_KEY", "Ljava/lang/String;", "<init>", "()V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ON2$a */
    /* loaded from: classes2.dex */
    public static final class C5982a {
        public /* synthetic */ C5982a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5982a() {
        }
    }

    public ON2(C11747p state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f26448a = new ConcurrentHashMap<>();
        this.f26449b = new LinkedHashSet();
        String str = (String) state.m66947f("mavericks:persisted_view_id");
        if (str == null) {
            str = m92367e();
            state.m66940m("mavericks:persisted_view_id", str);
        }
        this.f26450c = str;
    }

    /* renamed from: e */
    public final String m92367e() {
        return "MavericksView_" + UUID.randomUUID();
    }

    /* renamed from: f */
    public final Set<String> m92366f() {
        return this.f26449b;
    }

    /* renamed from: g */
    public final ConcurrentHashMap<String, Object> m92365g() {
        return this.f26448a;
    }

    /* renamed from: h */
    public final String m92364h() {
        return this.f26450c;
    }
}
