package bo.app;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0017R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"Lbo/app/e3;", "Lbo/app/m6;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/g2;", "internalEventPublisher", "Lbo/app/t2;", "triggerEvent", "", "triggeredActionDisplayExpirationTimestamp", "", C17296a.f69688o, "Lorg/json/JSONObject;", "e", "", "Lbo/app/k4;", "b", "()Ljava/util/List;", "remoteAssetPaths", "json", "Lbo/app/y1;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "c", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.e3 */
/* loaded from: classes.dex */
public final class C12600e3 extends AbstractC12913m6 {

    /* renamed from: l */
    public static final C12603c f58384l = new C12603c(null);

    /* renamed from: i */
    private final InterfaceC50985wO1 f58385i;

    /* renamed from: j */
    private final JSONObject f58386j;

    /* renamed from: k */
    private final InterfaceC13231y1 f58387k;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$a */
    /* loaded from: classes.dex */
    public static final class C12601a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12601a(JSONObject jSONObject) {
            super(0);
            this.f58388b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Attempting to parse in-app message triggered action with JSON: ", C31696Aj2.m115350i(this.f58388b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$b */
    /* loaded from: classes.dex */
    public static final class C12602b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12602b f58389b = new C12602b();

        public C12602b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to parse in-app message triggered action.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lbo/app/e3$c;", "", "", "INAPP_TYPE", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$c */
    /* loaded from: classes.dex */
    public static final class C12603c {
        public /* synthetic */ C12603c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12603c() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.e3$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class C12604d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58390a;

        static {
            int[] iArr = new int[EnumC52810zT2.values().length];
            iArr[EnumC52810zT2.HTML_FULL.ordinal()] = 1;
            iArr[EnumC52810zT2.FULL.ordinal()] = 2;
            iArr[EnumC52810zT2.MODAL.ordinal()] = 3;
            iArr[EnumC52810zT2.SLIDEUP.ordinal()] = 4;
            iArr[EnumC52810zT2.HTML.ordinal()] = 5;
            f58390a = iArr;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$e */
    /* loaded from: classes.dex */
    public static final class C12605e extends Lambda implements Function0<String> {
        public C12605e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Attempting to publish in-app message after delay of " + C12600e3.this.mo62740f().mo62979g() + " seconds.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$f */
    /* loaded from: classes.dex */
    public static final class C12606f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13145t2 f58392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12606f(InterfaceC13145t2 interfaceC13145t2) {
            super(0);
            this.f58392b = interfaceC13145t2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.f58392b + " due to in-app message json being null";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$g */
    /* loaded from: classes.dex */
    public static final class C12607g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13145t2 f58393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12607g(InterfaceC13145t2 interfaceC13145t2) {
            super(0);
            this.f58393b = interfaceC13145t2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.f58393b + " due to deserialized in-app message being null";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$h */
    /* loaded from: classes.dex */
    public static final class C12608h extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12608h f58394b = new C12608h();

        public C12608h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while performing triggered action.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$i */
    /* loaded from: classes.dex */
    public static final class C12609i extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12609i f58395b = new C12609i();

        public C12609i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "In-app message has no remote assets for prefetch. Returning empty list.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e3$j */
    /* loaded from: classes.dex */
    public static final class C12610j extends Lambda implements Function0<String> {
        public C12610j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            InterfaceC50985wO1 interfaceC50985wO1 = C12600e3.this.f58385i;
            return Intrinsics.stringPlus("Failed to return remote paths to assets for type: ", interfaceC50985wO1 == null ? null : interfaceC50985wO1.mo5008h0());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12600e3(JSONObject json, InterfaceC13231y1 brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.V, null, false, new C12601a(json), 6, null);
        JSONObject inAppMessageObject = json.getJSONObject(MessageExtension.FIELD_DATA);
        this.f58387k = brazeManager;
        this.f58386j = inAppMessageObject;
        Intrinsics.checkNotNullExpressionValue(inAppMessageObject, "inAppMessageObject");
        InterfaceC50985wO1 m63893a = C12547b3.m63893a(inAppMessageObject, brazeManager);
        this.f58385i = m63893a;
        if (m63893a != null) {
            return;
        }
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, C12602b.f58389b, 6, null);
        throw new IllegalArgumentException(Intrinsics.stringPlus("Failed to parse in-app message triggered action with JSON: ", C31696Aj2.m115350i(json)));
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: b */
    public List<C12820k4> mo62742b() {
        List<String> mo6941f0;
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        InterfaceC50985wO1 interfaceC50985wO1 = this.f58385i;
        EnumC52810zT2 enumC52810zT2 = null;
        if (interfaceC50985wO1 == null) {
            mo6941f0 = null;
        } else {
            mo6941f0 = interfaceC50985wO1.mo6941f0();
        }
        if (mo6941f0 != null && !mo6941f0.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12609i.f58395b, 7, null);
            return arrayList;
        }
        InterfaceC50985wO1 interfaceC50985wO12 = this.f58385i;
        if (interfaceC50985wO12 != null) {
            enumC52810zT2 = interfaceC50985wO12.mo5008h0();
        }
        if (enumC52810zT2 == null) {
            i = -1;
        } else {
            i = C12604d.f58390a[enumC52810zT2.ordinal()];
        }
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12610j(), 6, null);
                } else {
                    for (String str : mo6941f0) {
                        arrayList.add(new C12820k4(EnumC12870l4.FILE, str));
                    }
                }
            } else {
                arrayList.add(new C12820k4(EnumC12870l4.IMAGE, mo6941f0.get(0)));
            }
        } else {
            arrayList.add(new C12820k4(EnumC12870l4.ZIP, mo6941f0.get(0)));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject forJsonPut;
        try {
            JSONObject mo62971e = super.mo62971e();
            if (mo62971e == null) {
                return null;
            }
            InterfaceC50985wO1 interfaceC50985wO1 = this.f58385i;
            if (interfaceC50985wO1 == null) {
                forJsonPut = null;
            } else {
                forJsonPut = interfaceC50985wO1.forJsonPut();
            }
            mo62971e.put(MessageExtension.FIELD_DATA, forJsonPut);
            mo62971e.put("type", "inapp");
            return mo62971e;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: a */
    public void mo62745a(Context context, InterfaceC12658g2 internalEventPublisher, InterfaceC13145t2 triggerEvent, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        try {
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, null, null, false, new C12605e(), 7, null);
            JSONObject jSONObject = this.f58386j;
            if (jSONObject == null) {
                C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, new C12606f(triggerEvent), 6, null);
                return;
            }
            InterfaceC50985wO1 m63893a = C12547b3.m63893a(jSONObject, this.f58387k);
            if (m63893a == null) {
                C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, new C12607g(triggerEvent), 6, null);
                return;
            }
            m63893a.mo6943c0(m63306y());
            m63893a.mo6938k0(j);
            internalEventPublisher.mo63715a((InterfaceC12658g2) new C12566c3(triggerEvent, this, m63893a, this.f58387k.mo62760a()), (Class<InterfaceC12658g2>) C12566c3.class);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C12608h.f58394b, 4, null);
        }
    }
}
