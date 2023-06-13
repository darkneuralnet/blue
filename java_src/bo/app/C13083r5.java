package bo.app;

import bo.app.C13176v3;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0005B1\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u000102¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J \u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0007R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006;"}, m28432d2 = {"Lbo/app/r5;", "Lbo/app/r;", "Lbo/app/o2;", "scheduleConfig", "", C17296a.f69688o, "Lbo/app/g2;", "externalPublisher", "Lbo/app/d;", "apiResponse", "", "internalPublisher", "Lbo/app/n2;", "responseError", "", "x", "Lbo/app/t2;", "triggerEvent", "Lbo/app/t2;", "v", "()Lbo/app/t2;", "templatePayloadExpirationTimestamp", "J", "u", "()J", "Lbo/app/y2;", "triggeredAction", "Lbo/app/y2;", "w", "()Lbo/app/y2;", "Lbo/app/v3;", "outboundRespondWith", "Lbo/app/v3;", "c", "()Lbo/app/v3;", "setOutboundRespondWith", "(Lbo/app/v3;)V", "Lbo/app/e1;", "backoffStateProvider", "Lbo/app/e1;", "t", "()Lbo/app/e1;", "containsNoNewData", "Z", "b", "()Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "urlBase", "Lbo/app/s5;", "templatedTriggeredAction", "Lbo/app/y1;", "brazeManager", "userId", "<init>", "(Ljava/lang/String;Lbo/app/s5;Lbo/app/t2;Lbo/app/y1;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.r5 */
/* loaded from: classes.dex */
public final class C13083r5 extends AbstractC13065r {

    /* renamed from: C */
    public static final C13084a f59213C = new C13084a(null);

    /* renamed from: A */
    private final C12594e1 f59214A;

    /* renamed from: B */
    private final boolean f59215B;

    /* renamed from: r */
    private final C13117s5 f59216r;

    /* renamed from: s */
    private final InterfaceC13145t2 f59217s;

    /* renamed from: t */
    private final InterfaceC13231y1 f59218t;

    /* renamed from: u */
    private final String f59219u;

    /* renamed from: v */
    private final long f59220v;

    /* renamed from: w */
    private final long f59221w;

    /* renamed from: x */
    private final long f59222x;

    /* renamed from: y */
    private final InterfaceC13232y2 f59223y;

    /* renamed from: z */
    private C13176v3 f59224z;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, m28432d2 = {"Lbo/app/r5$a;", "", "", "EVENT_DATA_KEY", "Ljava/lang/String;", "", "EXTRA_DELAY_IN_SECONDS", "I", "TEMPLATE_OBJECT_KEY", "TRIGGER_EVENT_TYPE", "TRIGGER_ID_KEY", "URL_EXTENSION", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r5$a */
    /* loaded from: classes.dex */
    public static final class C13084a {
        public /* synthetic */ C13084a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13084a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r5$b */
    /* loaded from: classes.dex */
    public static final class C13085b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13085b f59225b = new C13085b();

        public C13085b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Template request failed. Attempting to log in-app message template request failure.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r5$c */
    /* loaded from: classes.dex */
    public static final class C13086c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13086c f59226b = new C13086c();

        public C13086c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger ID not found. Not logging in-app message template request failure.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r5$d */
    /* loaded from: classes.dex */
    public static final class C13087d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13087d f59227b = new C13087d();

        public C13087d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r5$e */
    /* loaded from: classes.dex */
    public static final class C13088e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f59228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13088e(long j) {
            super(0);
            this.f59228b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Template request has not yet expired. It expires at time: " + this.f59228b + ". Proceeding with retry.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r5$f */
    /* loaded from: classes.dex */
    public static final class C13089f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f59229b;

        /* renamed from: c */
        final /* synthetic */ C13083r5 f59230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13089f(long j, C13083r5 c13083r5) {
            super(0);
            this.f59229b = j;
            this.f59230c = c13083r5;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Template request expired at time: " + this.f59229b + " and is not eligible for a response retry. Not retrying or performing any fallback triggers. " + this.f59230c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13083r5(String urlBase, C13117s5 templatedTriggeredAction, InterfaceC13145t2 triggerEvent, InterfaceC13231y1 brazeManager, String str) {
        super(new C13082r4(Intrinsics.stringPlus(urlBase, "template")));
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f59216r = templatedTriggeredAction;
        this.f59217s = triggerEvent;
        this.f59218t = brazeManager;
        this.f59219u = templatedTriggeredAction.m62970z();
        long m63032a = m63032a(templatedTriggeredAction.mo62740f());
        this.f59220v = m63032a;
        long min = Math.min(m63032a, TimeUnit.MINUTES.toMillis(1L));
        this.f59221w = min;
        this.f59222x = templatedTriggeredAction.m62973A();
        this.f59223y = templatedTriggeredAction;
        this.f59224z = new C13176v3.C13177a(null, null, null, null, 15, null).m62863b(str).m62870a();
        this.f59214A = new C12594e1((int) min, (int) TimeUnit.SECONDS.toMillis(1L));
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    public void mo62660a(InterfaceC12658g2 externalPublisher, C12570d c12570d) {
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        mo63031m().m63818c();
        if ((c12570d == null ? null : c12570d.m63862f()) != null) {
            c12570d.m63862f().mo6943c0(this.f59216r.m63306y());
        } else {
            m63026x();
        }
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: b */
    public boolean mo62594b() {
        return this.f59215B;
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: c */
    public C13176v3 mo62592c() {
        return this.f59224z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[Catch: JSONException -> 0x005d, TryCatch #0 {JSONException -> 0x005d, blocks: (B:6:0x000d, B:10:0x0031, B:18:0x004b, B:22:0x0059, B:21:0x0055, B:13:0x0040, B:9:0x002b), top: B:27:0x000d }] */
    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject mo62580l() {
        JSONObject forJsonPut;
        boolean z;
        JSONObject forJsonPut2;
        JSONObject mo62580l = super.mo62580l();
        if (mo62580l == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_id", this.f59219u);
            jSONObject.put("trigger_event_type", this.f59217s.mo62885d());
            InterfaceC13160u1 mo62924a = this.f59217s.mo62924a();
            if (mo62924a == null) {
                forJsonPut = null;
            } else {
                forJsonPut = mo62924a.forJsonPut();
            }
            jSONObject.put(MessageExtension.FIELD_DATA, forJsonPut);
            mo62580l.put("template", jSONObject);
            C13176v3 mo62592c = mo62592c();
            if (mo62592c != null) {
                z = true;
                if (mo62592c.m62871y()) {
                    if (z) {
                        C13176v3 mo62592c2 = mo62592c();
                        if (mo62592c2 == null) {
                            forJsonPut2 = null;
                        } else {
                            forJsonPut2 = mo62592c2.forJsonPut();
                        }
                        mo62580l.put("respond_with", forJsonPut2);
                    }
                    return mo62580l;
                }
            }
            z = false;
            if (z) {
            }
            return mo62580l;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C13087d.f59227b, 4, null);
            return null;
        }
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC12868l2
    /* renamed from: t */
    public C12594e1 mo63031m() {
        return this.f59214A;
    }

    /* renamed from: u */
    public final long m63029u() {
        return this.f59222x;
    }

    /* renamed from: v */
    public final InterfaceC13145t2 m63028v() {
        return this.f59217s;
    }

    /* renamed from: w */
    public final InterfaceC13232y2 m63027w() {
        return this.f59223y;
    }

    /* renamed from: x */
    public final void m63026x() {
        boolean isBlank;
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, C13085b.f59225b, 6, null);
        isBlank = StringsKt__StringsJVMKt.isBlank(this.f59219u);
        if (isBlank) {
            C43664k20.m29442e(c43664k20, this, null, null, false, C13086c.f59226b, 7, null);
            return;
        }
        try {
            InterfaceC13160u1 m63562a = C12749j.f58647h.m63562a(this.f59219u, EnumC45156mZ1.TEMPLATE_REQUEST);
            if (m63562a != null) {
                this.f59218t.mo62756a(m63562a);
            }
        } catch (JSONException e) {
            this.f59218t.mo62752a(e);
        }
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC12868l2
    /* renamed from: a */
    public void mo63034a(InterfaceC12658g2 internalPublisher, InterfaceC12658g2 externalPublisher, InterfaceC12918n2 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.mo63034a(internalPublisher, externalPublisher, responseError);
        m63026x();
        if (responseError instanceof C12651g) {
            internalPublisher.mo63715a((InterfaceC12658g2) new C12876l6(this.f59217s, this.f59216r), (Class<InterfaceC12658g2>) C12876l6.class);
        }
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC12868l2
    /* renamed from: a */
    public boolean mo63033a(InterfaceC12918n2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        if ((responseError instanceof C12919n3) || (responseError instanceof C13147t4)) {
            long mo62922e = this.f59217s.mo62922e() + this.f59220v;
            if (C46287oT0.m21028h() < mo62922e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13088e(mo62922e), 6, null);
                return true;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13089f(mo62922e, this), 7, null);
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private final long m63032a(InterfaceC12981o2 interfaceC12981o2) {
        if (interfaceC12981o2.mo62982a() == -1) {
            return TimeUnit.SECONDS.toMillis(interfaceC12981o2.mo62979g() + 30);
        }
        return interfaceC12981o2.mo62982a();
    }
}
