package p000;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0007B'\b\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010&\u001a\u00020 ¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#\"\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010'¨\u0006+"}, m28432d2 = {"Lvv5;", "", "", "h", "m", "", "<set-?>", C17296a.f69688o, "I", "c", "()I", "interruptionCount", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "i", "(Ljava/lang/Long;)V", "diskRestoreTime", "LBN5;", "LBN5;", "g", "()LBN5;", "l", "(LBN5;)V", "sourceApplicationInfo", DateTokenConverter.CONVERTER_KEY, "getSessionStartTime", "sessionStartTime", "e", "k", "sessionLastEventTime", "Ljava/util/UUID;", "f", "Ljava/util/UUID;", "()Ljava/util/UUID;", "j", "(Ljava/util/UUID;)V", "sessionId", "()J", "sessionLength", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: vv5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50714vv5 {

    /* renamed from: g */
    public static final C29702a f114909g = new C29702a(null);

    /* renamed from: a */
    public int f114910a;

    /* renamed from: b */
    public Long f114911b;

    /* renamed from: c */
    public BN5 f114912c;

    /* renamed from: d */
    public final Long f114913d;

    /* renamed from: e */
    public Long f114914e;

    /* renamed from: f */
    public UUID f114915f;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lvv5$a;", "", "Lvv5;", "b", "", C17296a.f69688o, "", "INTERRUPTION_COUNT_KEY", "Ljava/lang/String;", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vv5$a */
    /* loaded from: classes5.dex */
    public static final class C29702a {
        private C29702a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void m7744a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            BN5.f2242c.m114059a();
        }

        @JvmStatic
        /* renamed from: b */
        public final C50714vv5 m7743b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            C50714vv5 c50714vv5 = new C50714vv5(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            c50714vv5.f114910a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            c50714vv5.m7746l(BN5.f2242c.m114058b());
            c50714vv5.m7749i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(fromString, "UUID.fromString(sessionIDStr)");
            c50714vv5.m7748j(fromString);
            return c50714vv5;
        }

        public /* synthetic */ C29702a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public C50714vv5(Long l, Long l2, UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f114913d = l;
        this.f114914e = l2;
        this.f114915f = sessionId;
    }

    /* renamed from: b */
    public final Long m7756b() {
        Long l = this.f114911b;
        return Long.valueOf(l != null ? l.longValue() : 0L);
    }

    /* renamed from: c */
    public final int m7755c() {
        return this.f114910a;
    }

    /* renamed from: d */
    public final UUID m7754d() {
        return this.f114915f;
    }

    /* renamed from: e */
    public final Long m7753e() {
        return this.f114914e;
    }

    /* renamed from: f */
    public final long m7752f() {
        Long l;
        if (this.f114913d != null && (l = this.f114914e) != null) {
            if (l != null) {
                return l.longValue() - this.f114913d.longValue();
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        return 0L;
    }

    /* renamed from: g */
    public final BN5 m7751g() {
        return this.f114912c;
    }

    /* renamed from: h */
    public final void m7750h() {
        this.f114910a++;
    }

    /* renamed from: i */
    public final void m7749i(Long l) {
        this.f114911b = l;
    }

    /* renamed from: j */
    public final void m7748j(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.f114915f = uuid;
    }

    /* renamed from: k */
    public final void m7747k(Long l) {
        this.f114914e = l;
    }

    /* renamed from: l */
    public final void m7746l(BN5 bn5) {
        this.f114912c = bn5;
    }

    /* renamed from: m */
    public final void m7745m() {
        long j;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e()).edit();
        Long l = this.f114913d;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", j);
        Long l2 = this.f114914e;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j2);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f114910a);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f114915f.toString());
        edit.apply();
        BN5 bn5 = this.f114912c;
        if (bn5 != null && bn5 != null) {
            bn5.m114060a();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50714vv5(Long l, Long l2, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, uuid);
        if ((i & 4) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID()");
        }
    }
}
