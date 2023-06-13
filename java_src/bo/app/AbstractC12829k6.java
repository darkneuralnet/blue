package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28434bv = {}, m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001!B\u0011\b\u0014\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"Lbo/app/k6;", "Lbo/app/y2;", "Lbo/app/t2;", "event", "", "b", "Lorg/json/JSONObject;", "e", "x", "()Z", "isWithinTimeWindow", "w", "isPastStartDate", "v", "isNotExpired", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lbo/app/o2;", "scheduleConfig", "Lbo/app/o2;", "f", "()Lbo/app/o2;", "shouldPrefetchAssets", "Z", "m", "Lbo/app/h6;", "triggerMetadata", "Lbo/app/h6;", "i", "()Lbo/app/h6;", C17296a.f69688o, "(Lbo/app/h6;)V", "json", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.k6 */
/* loaded from: classes.dex */
public abstract class AbstractC12829k6 implements InterfaceC13232y2 {

    /* renamed from: g */
    public static final C12830a f58769g = new C12830a(null);

    /* renamed from: b */
    private final String f58770b;

    /* renamed from: c */
    private final InterfaceC12981o2 f58771c;

    /* renamed from: d */
    private final boolean f58772d;

    /* renamed from: e */
    private C12728h6 f58773e;

    /* renamed from: f */
    private final List<InterfaceC13112s2> f58774f;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lbo/app/k6$a;", "", "", "ID", "Ljava/lang/String;", "PREFETCH", "TRIGGER_CONDITIONS", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k6$a */
    /* loaded from: classes.dex */
    public static final class C12830a {
        public /* synthetic */ C12830a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12830a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k6$b */
    /* loaded from: classes.dex */
    public static final class C12831b extends Lambda implements Function0<String> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13145t2 f58776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12831b(InterfaceC13145t2 interfaceC13145t2) {
            super(0);
            this.f58776c = interfaceC13145t2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action " + AbstractC12829k6.this.getId() + " not eligible to be triggered by " + ((Object) this.f58776c.mo62885d()) + " event. Current device time outside triggered action time window.";
        }
    }

    public AbstractC12829k6(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        this.f58774f = arrayList;
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(ID)");
        this.f58770b = string;
        this.f58771c = new C13114s4(json);
        JSONArray jSONArray = json.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            List<InterfaceC13112s2> m63587a = C12748i6.m63587a(jSONArray);
            Intrinsics.checkNotNullExpressionValue(m63587a, "parseTriggerConditions(triggers)");
            arrayList.addAll(m63587a);
        }
        this.f58772d = json.optBoolean("prefetch", true);
    }

    /* renamed from: v */
    private final boolean m63449v() {
        return this.f58771c.mo62978h() == -1 || C46287oT0.m21027i() < this.f58771c.mo62978h();
    }

    /* renamed from: w */
    private final boolean m63448w() {
        return this.f58771c.mo62981c() == -1 || C46287oT0.m21027i() > this.f58771c.mo62981c();
    }

    /* renamed from: x */
    private final boolean m63447x() {
        return m63448w() && m63449v();
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: a */
    public void mo62744a(C12728h6 c12728h6) {
        this.f58773e = c12728h6;
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: b */
    public boolean mo62741b(InterfaceC13145t2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!m63447x()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12831b(event), 7, null);
            return false;
        }
        Iterator<InterfaceC13112s2> it = this.f58774f.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo62577a(event)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public JSONObject mo62971e() {
        JSONObject forJsonPut;
        try {
            forJsonPut = this.f58771c.forJsonPut();
        } catch (JSONException unused) {
        }
        if (forJsonPut != null) {
            forJsonPut.put("id", this.f58770b);
            JSONArray jSONArray = new JSONArray();
            for (InterfaceC13112s2 interfaceC13112s2 : this.f58774f) {
                jSONArray.put(interfaceC13112s2.forJsonPut());
            }
            forJsonPut.put("trigger_condition", jSONArray);
            forJsonPut.put("prefetch", this.f58772d);
            return forJsonPut;
        }
        return null;
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: f */
    public final InterfaceC12981o2 mo62740f() {
        return this.f58771c;
    }

    @Override // bo.app.InterfaceC13232y2
    public final String getId() {
        return this.f58770b;
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: i */
    public C12728h6 mo62739i() {
        return this.f58773e;
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: m */
    public final boolean mo62738m() {
        return this.f58772d;
    }
}
