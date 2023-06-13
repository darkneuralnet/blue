package bo.app;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J(\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J>\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J2\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0016¨\u0006\u0015"}, m28432d2 = {"Lbo/app/h3;", "Lbo/app/h2;", "Lbo/app/r4;", "requestTarget", "", "", "Lcom/braze/communication/HttpHeaders;", "requestHeaders", "Lkotlin/Lazy;", "requestIdentifier", "Lorg/json/JSONObject;", "jsonParams", "", C17296a.f69688o, FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "timeInMillis", "payload", "httpConnector", "<init>", "(Lbo/app/h2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.h3 */
/* loaded from: classes.dex */
public final class C12716h3 implements InterfaceC12715h2 {

    /* renamed from: a */
    private final InterfaceC12715h2 f58599a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h3$a */
    /* loaded from: classes.dex */
    public static final class C12717a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C13082r4 f58600b;

        /* renamed from: c */
        final /* synthetic */ Map<String, String> f58601c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f58602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12717a(C13082r4 c13082r4, Map<String, String> map, JSONObject jSONObject) {
            super(0);
            this.f58600b = c13082r4;
            this.f58601c = map;
            this.f58602d = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return C13111s1.m62983a(this.f58600b, this.f58601c, this.f58602d);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h3$b */
    /* loaded from: classes.dex */
    public static final class C12718b extends Lambda implements Function0<String> {

        /* renamed from: c */
        final /* synthetic */ C13082r4 f58604c;

        /* renamed from: d */
        final /* synthetic */ Map<String, String> f58605d;

        /* renamed from: e */
        final /* synthetic */ Lazy<String> f58606e;

        /* renamed from: f */
        final /* synthetic */ JSONObject f58607f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12718b(C13082r4 c13082r4, Map<String, String> map, Lazy<String> lazy, JSONObject jSONObject) {
            super(0);
            this.f58604c = c13082r4;
            this.f58605d = map;
            this.f58606e = lazy;
            this.f58607f = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return C12716h3.this.m63619a(this.f58604c, this.f58605d, this.f58606e.getValue(), this.f58607f);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h3$c */
    /* loaded from: classes.dex */
    public static final class C12719c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12719c f58608b = new C12719c();

        public C12719c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging request: ";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h3$d */
    /* loaded from: classes.dex */
    public static final class C12720d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58609b;

        /* renamed from: c */
        final /* synthetic */ Lazy<String> f58610c;

        /* renamed from: d */
        final /* synthetic */ long f58611d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12720d(JSONObject jSONObject, Lazy<String> lazy, long j) {
            super(0);
            this.f58609b = jSONObject;
            this.f58610c = lazy;
            this.f58611d = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            JSONObject jSONObject = this.f58609b;
            String str = (jSONObject == null || (str = C31696Aj2.m115350i(jSONObject)) == null) ? "none" : "none";
            return "Result(id = " + this.f58610c.getValue() + " time = " + this.f58611d + "ms)\n" + str;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h3$e */
    /* loaded from: classes.dex */
    public static final class C12721e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12721e f58612b = new C12721e();

        public C12721e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging result: ";
        }
    }

    public C12716h3(InterfaceC12715h2 httpConnector) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        this.f58599a = httpConnector;
    }

    @Override // bo.app.InterfaceC12715h2
    /* renamed from: a */
    public JSONObject mo63101a(C13082r4 requestTarget, Map<String, String> requestHeaders, JSONObject payload) {
        Lazy<String> lazy;
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        lazy = LazyKt__LazyJVMKt.lazy(new C12717a(requestTarget, requestHeaders, payload));
        m63618a(requestTarget, requestHeaders, lazy, payload);
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject mo63101a = this.f58599a.mo63101a(requestTarget, requestHeaders, payload);
        m63617a(mo63101a, lazy, System.currentTimeMillis() - currentTimeMillis);
        return mo63101a;
    }

    /* renamed from: a */
    private final void m63618a(C13082r4 c13082r4, Map<String, String> map, Lazy<String> lazy, JSONObject jSONObject) {
        try {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12718b(c13082r4, map, lazy, jSONObject), 7, null);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12719c.f58608b, 4, null);
        }
    }

    /* renamed from: a */
    private final void m63617a(JSONObject jSONObject, Lazy<String> lazy, long j) {
        try {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12720d(jSONObject, lazy, j), 7, null);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12721e.f58612b, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final String m63619a(C13082r4 c13082r4, Map<String, String> map, String str, JSONObject jSONObject) {
        String joinToString$default;
        String trimMargin$default;
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |Making request with id => \"");
        sb.append(str);
        sb.append("\"\n            |to url: ");
        sb.append(c13082r4);
        sb.append("\n            \n            |with headers:\n            ");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add("|\"" + entry.getKey() + "\" => \"" + ((Object) entry.getValue()) + '\"');
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
        sb.append(joinToString$default);
        sb.append("\n            |\n            |");
        sb.append(jSONObject == null ? "" : Intrinsics.stringPlus("and JSON :\n", C31696Aj2.m115350i(jSONObject)));
        sb.append("\n        ");
        trimMargin$default = StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null);
        return trimMargin$default;
    }
}
