package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB!\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lbo/app/d4;", "Lbo/app/j;", "", "isNoneActionType", "Z", "y", "()Z", "Lbo/app/d1;", "eventType", "Lorg/json/JSONObject;", "eventData", "", "actionType", "<init>", "(Lbo/app/d1;Lorg/json/JSONObject;Ljava/lang/String;)V", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.d4 */
/* loaded from: classes.dex */
public final class C12582d4 extends C12749j {

    /* renamed from: k */
    public static final C12583a f58352k = new C12583a(null);

    /* renamed from: j */
    private final boolean f58353j;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\n"}, m28432d2 = {"Lbo/app/d4$a;", "", "", "campaignId", "actionId", "actionType", "Lbo/app/u1;", C17296a.f69688o, "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.d4$a */
    /* loaded from: classes.dex */
    public static final class C12583a {
        public /* synthetic */ C12583a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63842a(String campaignId, String actionId, String actionType) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", campaignId);
            jSONObject.put(C17296a.f69688o, actionId);
            return new C12582d4(EnumC12577d1.PUSH_ACTION_BUTTON_CLICKED, jSONObject, actionType, null);
        }

        private C12583a() {
        }
    }

    public /* synthetic */ C12582d4(EnumC12577d1 enumC12577d1, JSONObject jSONObject, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC12577d1, jSONObject, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final InterfaceC13160u1 m63844a(String str, String str2, String str3) {
        return f58352k.m63842a(str, str2, str3);
    }

    /* renamed from: y */
    public final boolean m63843y() {
        return this.f58353j;
    }

    private C12582d4(EnumC12577d1 enumC12577d1, JSONObject jSONObject, String str) {
        super(enumC12577d1, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
        this.f58353j = Intrinsics.areEqual(str, "ab_none");
    }
}
