package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0014\u0015B1\b\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lbo/app/v3;", "LaP1;", "Lorg/json/JSONObject;", "Lbo/app/f2;", "v", "", "x", "w", "y", "e", "()Z", "isEmpty", "", "userId", "containsRespondWithFeed", "containsRespondWithTriggers", "Lbo/app/u3;", "outboundConfigParams", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lbo/app/u3;)V", C17296a.f69688o, "b", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.v3 */
/* loaded from: classes.dex */
public final class C13176v3 implements InterfaceC37933aP1<JSONObject>, InterfaceC12644f2 {

    /* renamed from: f */
    public static final C13178b f59369f = new C13178b(null);

    /* renamed from: b */
    private final String f59370b;

    /* renamed from: c */
    private final Boolean f59371c;

    /* renamed from: d */
    private final Boolean f59372d;

    /* renamed from: e */
    private final C13163u3 f59373e;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0004\u001a\u00020\u0000J\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\b\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\b\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0004\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0004\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"Lbo/app/v3$a;", "", "", "userId", "b", "c", "Lbo/app/u3;", "outboundConfigParams", C17296a.f69688o, "Lbo/app/v3;", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "containsRespondWithFeed", "Ljava/lang/Boolean;", "getContainsRespondWithFeed", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "containsRespondWithTriggers", "getContainsRespondWithTriggers", "Lbo/app/u3;", "getOutboundConfigParams", "()Lbo/app/u3;", "(Lbo/app/u3;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lbo/app/u3;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v3$a */
    /* loaded from: classes.dex */
    public static final class C13177a {

        /* renamed from: a */
        private String f59374a;

        /* renamed from: b */
        private Boolean f59375b;

        /* renamed from: c */
        private Boolean f59376c;

        /* renamed from: d */
        private C13163u3 f59377d;

        public C13177a() {
            this(null, null, null, null, 15, null);
        }

        /* renamed from: a */
        public final void m62867a(String str) {
            this.f59374a = str;
        }

        /* renamed from: b */
        public final void m62864b(Boolean bool) {
            this.f59376c = bool;
        }

        /* renamed from: c */
        public final C13177a m62862c() {
            m62864b(Boolean.TRUE);
            return this;
        }

        public C13177a(String str, Boolean bool, Boolean bool2, C13163u3 c13163u3) {
            this.f59374a = str;
            this.f59375b = bool;
            this.f59376c = bool2;
            this.f59377d = c13163u3;
        }

        /* renamed from: a */
        public final void m62868a(Boolean bool) {
            this.f59375b = bool;
        }

        /* renamed from: b */
        public final void m62865b(C13163u3 c13163u3) {
            this.f59377d = c13163u3;
        }

        /* renamed from: a */
        public final C13177a m62869a(C13163u3 outboundConfigParams) {
            Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
            m62865b(outboundConfigParams);
            return this;
        }

        /* renamed from: b */
        public final C13177a m62863b(String str) {
            m62867a(str);
            return this;
        }

        /* renamed from: a */
        public final C13176v3 m62870a() {
            return new C13176v3(this.f59374a, this.f59375b, this.f59376c, this.f59377d, null);
        }

        /* renamed from: b */
        public final C13177a m62866b() {
            m62868a(Boolean.TRUE);
            return this;
        }

        public /* synthetic */ C13177a(String str, Boolean bool, Boolean bool2, C13163u3 c13163u3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : c13163u3);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lbo/app/v3$b;", "", "", "RESPOND_WITH_CONFIG_KEY", "Ljava/lang/String;", "RESPOND_WITH_FEED_KEY", "RESPOND_WITH_TRIGGERS_KEY", "USER_ID_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v3$b */
    /* loaded from: classes.dex */
    public static final class C13178b {
        public /* synthetic */ C13178b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13178b() {
        }
    }

    public /* synthetic */ C13176v3(String str, Boolean bool, Boolean bool2, C13163u3 c13163u3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, bool2, c13163u3);
    }

    @Override // bo.app.InterfaceC12644f2
    /* renamed from: e */
    public boolean mo62845e() {
        C13163u3 c13163u3;
        JSONObject forJsonPut = forJsonPut();
        if (forJsonPut.length() == 0) {
            return true;
        }
        if (this.f59371c == null && this.f59372d == null && (c13163u3 = this.f59373e) != null) {
            return c13163u3.mo62845e();
        }
        if (forJsonPut.length() == 1) {
            return forJsonPut.has("user_id");
        }
        return false;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: v */
    public JSONObject forJsonPut() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        String str = this.f59370b;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            jSONObject.put("user_id", this.f59370b);
        }
        Boolean bool = this.f59371c;
        if (bool != null) {
            jSONObject.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.f59372d;
        if (bool2 != null) {
            jSONObject.put("triggers", bool2.booleanValue());
        }
        C13163u3 c13163u3 = this.f59373e;
        if (c13163u3 != null) {
            jSONObject.put("config", c13163u3.forJsonPut());
        }
        return jSONObject;
    }

    /* renamed from: w */
    public final boolean m62873w() {
        return this.f59371c != null;
    }

    /* renamed from: x */
    public final boolean m62872x() {
        return this.f59372d != null;
    }

    /* renamed from: y */
    public final boolean m62871y() {
        String str = this.f59370b;
        return !(str == null || str.length() == 0);
    }

    private C13176v3(String str, Boolean bool, Boolean bool2, C13163u3 c13163u3) {
        this.f59370b = str;
        this.f59371c = bool;
        this.f59372d = bool2;
        this.f59373e = c13163u3;
    }
}
