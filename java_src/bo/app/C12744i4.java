package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"Lbo/app/i4;", "Lbo/app/k2;", "Lorg/json/JSONObject;", "e", "", "o", "()Z", "isAlwaysEligible", "s", "isOnlyEligibleOnce", "", "q", "()Ljava/lang/Integer;", "reEligibilityTime", "reEligibility", "<init>", "(I)V", "json", "(Lorg/json/JSONObject;)V", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.i4 */
/* loaded from: classes.dex */
public final class C12744i4 implements InterfaceC12817k2 {

    /* renamed from: c */
    public static final C12745a f58640c = new C12745a(null);

    /* renamed from: b */
    private final int f58641b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lbo/app/i4$a;", "", "", "ALWAYS_ELIGIBLE", "I", "ELIGIBLE_ONCE", "", "RE_ELIGIBILITY", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i4$a */
    /* loaded from: classes.dex */
    public static final class C12745a {
        public /* synthetic */ C12745a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12745a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i4$b */
    /* loaded from: classes.dex */
    public static final class C12746b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12746b f58642b = new C12746b();

        public C12746b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not convert ReEligibilityConfig to JSON";
        }
    }

    public C12744i4(int i) {
        this.f58641b = i;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            return new JSONObject().put("re_eligibility", this.f58641b);
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12746b.f58642b, 4, null);
            return null;
        }
    }

    @Override // bo.app.InterfaceC12817k2
    /* renamed from: o */
    public boolean mo63461o() {
        return this.f58641b == 0;
    }

    @Override // bo.app.InterfaceC12817k2
    /* renamed from: q */
    public Integer mo63460q() {
        int i = this.f58641b;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // bo.app.InterfaceC12817k2
    /* renamed from: s */
    public boolean mo63459s() {
        return this.f58641b == -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12744i4(JSONObject json) {
        this(json.optInt("re_eligibility", -1));
        Intrinsics.checkNotNullParameter(json, "json");
    }
}
