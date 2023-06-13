package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"Lbo/app/g4;", "Lbo/app/j;", "Lbo/app/d1;", "eventType", "Lorg/json/JSONObject;", "eventData", "<init>", "(Lbo/app/d1;Lorg/json/JSONObject;)V", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.g4 */
/* loaded from: classes.dex */
public final class C12660g4 extends C12749j {

    /* renamed from: j */
    public static final C12661a f58490j = new C12661a(null);

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\n"}, m28432d2 = {"Lbo/app/g4$a;", "", "", "campaignId", "Lbo/app/g4;", C17296a.f69688o, "Lbo/app/u1;", "event", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g4$a */
    /* loaded from: classes.dex */
    public static final class C12661a {
        public /* synthetic */ C12661a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C12660g4 m63709a(String campaignId) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", campaignId);
            return new C12660g4(EnumC12577d1.PUSH_CLICKED, jSONObject, null);
        }

        private C12661a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final String m63710a(InterfaceC13160u1 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            String string = event.mo62896k().getString("cid");
            Intrinsics.checkNotNullExpressionValue(string, "event.data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
            return string;
        }
    }

    public /* synthetic */ C12660g4(EnumC12577d1 enumC12577d1, JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC12577d1, jSONObject);
    }

    @JvmStatic
    /* renamed from: d */
    public static final C12660g4 m63711d(String str) {
        return f58490j.m63709a(str);
    }

    private C12660g4(EnumC12577d1 enumC12577d1, JSONObject jSONObject) {
        super(enumC12577d1, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
    }
}
