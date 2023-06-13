package bo.app;

import bo.app.C13176v3;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001d\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\nH\u0016R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m28432d2 = {"Lbo/app/g0;", "Lbo/app/r;", "Lbo/app/g2;", "externalPublisher", "Lbo/app/d;", "apiResponse", "", C17296a.f69688o, "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "Lbo/app/v3;", "outboundRespondWith", "Lbo/app/v3;", "c", "()Lbo/app/v3;", "setOutboundRespondWith", "(Lbo/app/v3;)V", "", "b", "()Z", "containsNoNewData", "doesSendOptionalData", "Z", "g", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "urlBase", "<init>", "(Ljava/lang/String;Lbo/app/v3;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.g0 */
/* loaded from: classes.dex */
public final class C12652g0 extends AbstractC13065r {

    /* renamed from: t */
    public static final C12653a f58473t = new C12653a(null);

    /* renamed from: r */
    private C13176v3 f58474r;

    /* renamed from: s */
    private final boolean f58475s;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lbo/app/g0$a;", "", "", "BRAZE_NEWS_FEED_REQUEST_HEADER", "Ljava/lang/String;", "BRAZE_TRIGGERS_REQUEST_HEADER", "URL_EXTENSION", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g0$a */
    /* loaded from: classes.dex */
    public static final class C12653a {
        public /* synthetic */ C12653a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12653a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g0$b */
    /* loaded from: classes.dex */
    public static final class C12654b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12654b f58476b = new C12654b();

        public C12654b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "DataSyncRequest executed successfully.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g0$c */
    /* loaded from: classes.dex */
    public static final class C12655c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12655c f58477b = new C12655c();

        public C12655c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    public /* synthetic */ C12652g0(String str, C13176v3 c13176v3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C13176v3.C13177a(null, null, null, null, 15, null).m62870a() : c13176v3);
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    public void mo62660a(InterfaceC12658g2 externalPublisher, C12570d c12570d) {
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12654b.f58476b, 7, null);
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: b */
    public boolean mo62594b() {
        C13176v3 mo62592c = mo62592c();
        return (mo62592c != null && mo62592c.mo62845e()) && super.mo62594b();
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: c */
    public C13176v3 mo62592c() {
        return this.f58474r;
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: g */
    public boolean mo62584g() {
        return this.f58475s;
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: l */
    public JSONObject mo62580l() {
        JSONObject forJsonPut;
        JSONObject mo62580l = super.mo62580l();
        if (mo62580l == null) {
            return null;
        }
        try {
            C13176v3 mo62592c = mo62592c();
            if (mo62592c == null) {
                forJsonPut = null;
            } else {
                forJsonPut = mo62592c.forJsonPut();
            }
            mo62580l.put("respond_with", forJsonPut);
            return mo62580l;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C12655c.f58477b, 4, null);
            return null;
        }
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62595a(Map<String, String> existingHeaders) {
        boolean z;
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.mo62595a(existingHeaders);
        C13176v3 mo62592c = mo62592c();
        boolean z2 = false;
        boolean z3 = true;
        if (mo62592c != null && mo62592c.mo62845e()) {
            return;
        }
        C13176v3 mo62592c2 = mo62592c();
        if (mo62592c2 != null && mo62592c2.m62873w()) {
            existingHeaders.put("X-Braze-FeedRequest", "true");
            z = true;
        } else {
            z = false;
        }
        C13176v3 mo62592c3 = mo62592c();
        if (mo62592c3 != null && mo62592c3.m62872x()) {
            z2 = true;
        }
        if (z2) {
            existingHeaders.put("X-Braze-TriggersRequest", "true");
        } else {
            z3 = z;
        }
        if (z3) {
            existingHeaders.put("X-Braze-DataRequest", "true");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12652g0(String urlBase, C13176v3 c13176v3) {
        super(new C13082r4(Intrinsics.stringPlus(urlBase, MessageExtension.FIELD_DATA)));
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f58474r = c13176v3;
        this.f58475s = true;
    }
}
