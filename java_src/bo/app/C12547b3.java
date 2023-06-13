package bo.app;

import bo.app.C12749j;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\f"}, m28432d2 = {"Lorg/json/JSONObject;", "inAppMessageJson", "Lbo/app/y1;", "brazeManager", "LwO1;", C17296a.f69688o, "Lbo/app/d3;", "Lorg/json/JSONArray;", "b", "", "", "c", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: bo.app.b3 */
/* loaded from: classes.dex */
public final class C12547b3 {

    /* renamed from: a */
    private static final String f58267a = C43664k20.f93782a.m29432o("InAppMessageModelUtils");

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.b3$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C12548a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58268a;

        static {
            int[] iArr = new int[EnumC52810zT2.values().length];
            iArr[EnumC52810zT2.FULL.ordinal()] = 1;
            iArr[EnumC52810zT2.MODAL.ordinal()] = 2;
            iArr[EnumC52810zT2.SLIDEUP.ordinal()] = 3;
            iArr[EnumC52810zT2.HTML_FULL.ordinal()] = 4;
            iArr[EnumC52810zT2.HTML.ordinal()] = 5;
            f58268a = iArr;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b3$b */
    /* loaded from: classes.dex */
    public static final class C12549b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12549b f58269b = new C12549b();

        public C12549b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Deserializing control in-app message.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b3$c */
    /* loaded from: classes.dex */
    public static final class C12550c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58270b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12550c(JSONObject jSONObject) {
            super(0);
            this.f58270b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("In-app message type was unknown for in-app message: ", C31696Aj2.m115350i(this.f58270b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b3$d */
    /* loaded from: classes.dex */
    public static final class C12551d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12551d(JSONObject jSONObject) {
            super(0);
            this.f58271b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Unknown in-app message type. Returning null: ", C31696Aj2.m115350i(this.f58271b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b3$e */
    /* loaded from: classes.dex */
    public static final class C12552e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12552e(JSONObject jSONObject) {
            super(0);
            this.f58272b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to deserialize the in-app message: " + C31696Aj2.m115350i(this.f58272b) + ". Returning null.";
        }
    }

    /* renamed from: a */
    public static final InterfaceC50985wO1 m63893a(JSONObject inAppMessageJson, InterfaceC13231y1 brazeManager) {
        EnumC52810zT2 enumC52810zT2;
        InterfaceC50985wO1 c45749nZ1;
        String upperCase;
        EnumC52810zT2[] values;
        int length;
        int i;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (m63890c(inAppMessageJson)) {
                C43664k20.m29441f(C43664k20.f93782a, f58267a, C43664k20.EnumC25082a.D, null, false, C12549b.f58269b, 12, null);
                return new C43970kZ1(inAppMessageJson, brazeManager);
            }
            try {
                C13109s0 c13109s0 = C13109s0.f59272a;
                String string = inAppMessageJson.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = string.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                values = EnumC52810zT2.values();
                length = values.length;
                i = 0;
            } catch (Exception unused) {
                enumC52810zT2 = null;
            }
            while (i < length) {
                enumC52810zT2 = values[i];
                i++;
                if (Intrinsics.areEqual(enumC52810zT2.name(), upperCase)) {
                    if (enumC52810zT2 == null) {
                        C43664k20.m29441f(C43664k20.f93782a, f58267a, C43664k20.EnumC25082a.I, null, false, new C12550c(inAppMessageJson), 12, null);
                        m63891b(inAppMessageJson, brazeManager);
                        return null;
                    }
                    int i2 = C12548a.f58268a[enumC52810zT2.ordinal()];
                    if (i2 == 1) {
                        c45749nZ1 = new C45749nZ1(inAppMessageJson, brazeManager);
                    } else if (i2 == 2) {
                        c45749nZ1 = new C51677xZ1(inAppMessageJson, brazeManager);
                    } else if (i2 == 3) {
                        c45749nZ1 = new BZ1(inAppMessageJson, brazeManager);
                    } else if (i2 == 4) {
                        c45749nZ1 = new C48121rZ1(inAppMessageJson, brazeManager);
                    } else if (i2 != 5) {
                        C43664k20.m29441f(C43664k20.f93782a, f58267a, C43664k20.EnumC25082a.W, null, false, new C12551d(inAppMessageJson), 12, null);
                        m63891b(inAppMessageJson, brazeManager);
                        return null;
                    } else {
                        c45749nZ1 = new C46935pZ1(inAppMessageJson, brazeManager);
                    }
                    return c45749nZ1;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e) {
            C43664k20.m29441f(C43664k20.f93782a, f58267a, C43664k20.EnumC25082a.E, e, false, new C12552e(inAppMessageJson), 8, null);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONArray m63892b(JSONObject inAppMessageJson) {
        JSONObject optJSONObject;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        JSONObject optJSONObject2 = inAppMessageJson.optJSONObject("themes");
        JSONArray optJSONArray = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("dark")) == null) ? null : optJSONObject.optJSONArray("btns");
        return optJSONArray == null ? new JSONArray() : optJSONArray;
    }

    /* renamed from: c */
    public static final boolean m63890c(JSONObject inAppMessageJson) {
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        return inAppMessageJson.optBoolean("is_control", false);
    }

    /* renamed from: b */
    private static final void m63891b(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1) {
        String triggerId = jSONObject.optString("trigger_id");
        if (triggerId == null || triggerId.length() == 0) {
            return;
        }
        C12749j.C12750a c12750a = C12749j.f58647h;
        Intrinsics.checkNotNullExpressionValue(triggerId, "triggerId");
        InterfaceC13160u1 m63562a = c12750a.m63562a(triggerId, EnumC45156mZ1.UNKNOWN_MESSAGE_TYPE);
        if (m63562a == null) {
            return;
        }
        interfaceC13231y1.mo62756a(m63562a);
    }

    /* renamed from: a */
    public static final C12580d3 m63894a(JSONObject inAppMessageJson) {
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        JSONObject optJSONObject = inAppMessageJson.optJSONObject("themes");
        JSONObject optJSONObject2 = optJSONObject == null ? null : optJSONObject.optJSONObject("dark");
        if (optJSONObject2 == null) {
            return null;
        }
        return new C12580d3(optJSONObject2);
    }
}
