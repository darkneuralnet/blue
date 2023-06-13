package bo.app;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J(\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, m28432d2 = {"Lbo/app/s5;", "Lbo/app/m6;", "Lbo/app/y2;", "Lorg/json/JSONArray;", "remoteAssetUrls", "Lbo/app/l4;", "pathType", "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/g2;", "internalEventPublisher", "Lbo/app/t2;", "triggerEvent", "", "triggeredActionDisplayExpirationTimestamp", "Lorg/json/JSONObject;", "e", "", "<set-?>", "triggerId", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "J", "A", "()J", "", "Lbo/app/k4;", "b", "()Ljava/util/List;", "remoteAssetPaths", "json", "Lbo/app/y1;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.s5 */
/* loaded from: classes.dex */
public final class C13117s5 extends AbstractC12913m6 {

    /* renamed from: m */
    public static final C13119b f59283m = new C13119b(null);

    /* renamed from: i */
    private InterfaceC13231y1 f59284i;

    /* renamed from: j */
    private String f59285j;

    /* renamed from: k */
    private final List<C12820k4> f59286k;

    /* renamed from: l */
    private long f59287l;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s5$a */
    /* loaded from: classes.dex */
    public static final class C13118a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f59288b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13118a(JSONObject jSONObject) {
            super(0);
            this.f59288b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Parsing templated triggered action with JSON: ", C31696Aj2.m115350i(this.f59288b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"Lbo/app/s5$b;", "", "", "PREFETCH_FILE_URLS", "Ljava/lang/String;", "PREFETCH_IMAGE_URLS", "PREFETCH_ZIP_URLS", "TEMPLATED_INAPP_TYPE", "TRIGGER_ID", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s5$b */
    /* loaded from: classes.dex */
    public static final class C13119b {
        public /* synthetic */ C13119b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13119b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.s5$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C13120c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59289a;

        static {
            int[] iArr = new int[EnumC12870l4.values().length];
            iArr[EnumC12870l4.IMAGE.ordinal()] = 1;
            iArr[EnumC12870l4.ZIP.ordinal()] = 2;
            iArr[EnumC12870l4.FILE.ordinal()] = 3;
            f59289a = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s5$d */
    /* loaded from: classes.dex */
    public static final class C13121d extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59290b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13121d(JSONArray jSONArray) {
            super(1);
            this.f59290b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean m62968a(int i) {
            return Boolean.valueOf(this.f59290b.opt(i) instanceof String);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m62968a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "it", C17296a.f69688o, "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s5$e */
    /* loaded from: classes.dex */
    public static final class C13122e extends Lambda implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13122e(JSONArray jSONArray) {
            super(1);
            this.f59291b = jSONArray;
        }

        /* renamed from: a */
        public final String m62967a(int i) {
            Object obj = this.f59291b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return m62967a(num.intValue());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s5$f */
    /* loaded from: classes.dex */
    public static final class C13123f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13123f f59292b = new C13123f();

        public C13123f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not convert TemplatedTriggeredAction to JSON";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s5$g */
    /* loaded from: classes.dex */
    public static final class C13124g extends Lambda implements Function0<String> {
        public C13124g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Posting templating request after delay of " + C13117s5.this.mo62740f().mo62979g() + " seconds.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13117s5(JSONObject json, InterfaceC13231y1 brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f59286k = new ArrayList();
        this.f59287l = -1L;
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13118a(json), 7, null);
        this.f59284i = brazeManager;
        JSONObject jSONObject = json.getJSONObject(MessageExtension.FIELD_DATA);
        String string = jSONObject.getString("trigger_id");
        Intrinsics.checkNotNullExpressionValue(string, "dataObject.getString(TRIGGER_ID)");
        this.f59285j = string;
        JSONArray optJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            m62972a(optJSONArray, EnumC12870l4.IMAGE);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            m62972a(optJSONArray2, EnumC12870l4.ZIP);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            m62972a(optJSONArray3, EnumC12870l4.FILE);
        }
    }

    /* renamed from: A */
    public final long m62973A() {
        return this.f59287l;
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: a */
    public void mo62745a(Context context, InterfaceC12658g2 internalEventPublisher, InterfaceC13145t2 triggerEvent, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f59287l = j;
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13124g(), 7, null);
        this.f59284i.mo62758a(this, triggerEvent);
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: b */
    public List<C12820k4> mo62742b() {
        return new ArrayList(this.f59286k);
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject mo62971e = super.mo62971e();
            if (mo62971e == null) {
                return null;
            }
            mo62971e.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.f59285j);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (C12820k4 c12820k4 : this.f59286k) {
                int i = C13120c.f59289a[c12820k4.m63458a().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            jSONArray3.put(c12820k4.m63457b());
                        }
                    } else {
                        jSONArray2.put(c12820k4.m63457b());
                    }
                } else {
                    jSONArray.put(c12820k4.m63457b());
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            mo62971e.put(MessageExtension.FIELD_DATA, jSONObject);
            return mo62971e;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13123f.f59292b, 4, null);
            return null;
        }
    }

    /* renamed from: z */
    public final String m62970z() {
        return this.f59285j;
    }

    /* renamed from: a */
    private final void m62972a(JSONArray jSONArray, EnumC12870l4 enumC12870l4) {
        IntRange until;
        Sequence asSequence;
        Sequence filter;
        Sequence map;
        Iterator it;
        List emptyList;
        if (jSONArray == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            it = emptyList.iterator();
        } else {
            until = RangesKt___RangesKt.until(0, jSONArray.length());
            asSequence = CollectionsKt___CollectionsKt.asSequence(until);
            filter = SequencesKt___SequencesKt.filter(asSequence, new C13121d(jSONArray));
            map = SequencesKt___SequencesKt.map(filter, new C13122e(jSONArray));
            it = map.iterator();
        }
        while (it.hasNext()) {
            this.f59286k.add(new C12820k4(enumC12870l4, (String) it.next()));
        }
    }
}
