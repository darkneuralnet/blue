package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m28432d2 = {"Lbo/app/u3;", "LaP1;", "Lorg/json/JSONObject;", "Lbo/app/f2;", "v", "", "e", "()Z", "isEmpty", "", "lastConfigUnixTimestampSeconds", "isFirstTimeConfigRequest", "<init>", "(JZ)V", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.u3 */
/* loaded from: classes.dex */
public final class C13163u3 implements InterfaceC37933aP1<JSONObject>, InterfaceC12644f2 {

    /* renamed from: d */
    public static final C13164a f59353d = new C13164a(null);

    /* renamed from: b */
    private final long f59354b;

    /* renamed from: c */
    private final boolean f59355c;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lbo/app/u3$a;", "", "", "CONFIG_TIME_KEY", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u3$a */
    /* loaded from: classes.dex */
    public static final class C13164a {
        public /* synthetic */ C13164a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13164a() {
        }
    }

    public C13163u3(long j, boolean z) {
        this.f59354b = j;
        this.f59355c = z;
    }

    @Override // bo.app.InterfaceC12644f2
    /* renamed from: e */
    public boolean mo62845e() {
        return !this.f59355c;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: v */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f59354b);
        return jSONObject;
    }
}
