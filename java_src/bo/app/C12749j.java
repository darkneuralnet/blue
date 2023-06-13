package bo.app;

import bo.app.EnumC12577d1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt___StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/BG\b\u0016\u0012\u0006\u00100\u001a\u00020\f\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR/\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010#R/\u0010*\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010(\"\u0004\b\"\u0010)R\u0014\u0010-\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00064"}, m28432d2 = {"Lbo/app/j;", "Lbo/app/u1;", "Lorg/json/JSONObject;", "v", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lbo/app/d1;", "type", "Lbo/app/d1;", "j", "()Lbo/app/d1;", MessageExtension.FIELD_DATA, "Lorg/json/JSONObject;", "k", "()Lorg/json/JSONObject;", "", "timestampSeconds", "D", "w", "()D", "uniqueIdentifier", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "<set-?>", "userId$delegate", "Lbo/app/f3;", "x", C17296a.f69688o, "(Ljava/lang/String;)V", "userId", "Lbo/app/f5;", "sessionId$delegate", "n", "()Lbo/app/f5;", "(Lbo/app/f5;)V", "sessionId", DateTokenConverter.CONVERTER_KEY, "()Z", "isNonPersistable", "<init>", "(Lbo/app/d1;Lorg/json/JSONObject;DLjava/lang/String;)V", "eventType", "eventData", "eventTimeInSeconds", "(Lbo/app/d1;Lorg/json/JSONObject;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.j */
/* loaded from: classes.dex */
public class C12749j implements InterfaceC13160u1 {

    /* renamed from: b */
    private final EnumC12577d1 f58649b;

    /* renamed from: c */
    private final JSONObject f58650c;

    /* renamed from: d */
    private final double f58651d;

    /* renamed from: e */
    private final String f58652e;

    /* renamed from: f */
    private final C12645f3 f58653f;

    /* renamed from: g */
    private final C12645f3 f58654g;

    /* renamed from: i */
    static final /* synthetic */ KProperty<Object>[] f58648i = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(C12749j.class, "userId", "getUserId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(C12749j.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0))};

    /* renamed from: h */
    public static final C12750a f58647h = new C12750a(null);

    @Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bF\u0010GJ\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J6\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J&\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0007J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u001a\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u0006H\u0007J\u0012\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u0006H\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u0006H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0007J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0007J\u0012\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u0006H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u000eH\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0007J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0007J+\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000101H\u0007¢\u0006\u0004\b\u0005\u00102J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u00104\u001a\u000203H\u0007J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u00108\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0007J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0007J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0005\u0010?J3\u0010\u0005\u001a\u00020@2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0001¢\u0006\u0004\b\u0005\u0010AR\u0014\u0010B\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006H"}, m28432d2 = {"Lbo/app/j$a;", "", "Lkotlin/Function0;", "Lbo/app/u1;", "block", C17296a.f69688o, "", "eventName", "Ls20;", "properties", "productId", "currencyCode", "Ljava/math/BigDecimal;", "price", "", "quantity", "Lbo/app/x1;", "location", "", "throwable", "Lbo/app/f5;", "sessionId", "", "shouldPersist", "alias", "label", "g", "cardId", "f", "e", DateTokenConverter.CONVERTER_KEY, "b", "c", "id", "eventType", "triggerId", "h", "i", "LmT2;", "messageButton", "buttonId", "LmZ1;", "inAppMessageFailureType", "name", "j", "customUserAttributeKey", "incrementValue", "key", "value", "", "(Ljava/lang/String;[Ljava/lang/String;)Lbo/app/u1;", "", "sessionDurationSeconds", "", "latitude", "longitude", "subscriptionGroupId", "Lbo/app/o5;", "subscriptionGroupStatus", "campaignId", "pageId", "serializedEvent", "uniqueIdentifier", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;LmZ1;)Lorg/json/JSONObject;", "MAX_STACK_TRACE_STRING_LENGTH", "I", "SHOULD_NOT_BE_PERSISTED_KEY", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j$a */
    /* loaded from: classes.dex */
    public static final class C12750a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$a */
        /* loaded from: classes.dex */
        public static final class C12751a extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58655b;

            /* renamed from: c */
            final /* synthetic */ String f58656c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12751a(String str, String str2) {
                super(0);
                this.f58655b = str;
                this.f58656c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.f58655b).put("value", this.f58656c);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$a0 */
        /* loaded from: classes.dex */
        public static final class C12752a0 extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ C12648f5 f58657b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12752a0(C12648f5 c12648f5) {
                super(0);
                this.f58657b = c12648f5;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                C12749j c12749j = new C12749j(EnumC12577d1.SESSION_START, (JSONObject) null, 0.0d, (String) null, 14, (DefaultConstructorMarker) null);
                c12749j.mo62900a(this.f58657b);
                return c12749j;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$b */
        /* loaded from: classes.dex */
        public static final class C12753b extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58658b;

            /* renamed from: c */
            final /* synthetic */ String f58659c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12753b(String str, String str2) {
                super(0);
                this.f58658b = str;
                this.f58659c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject(this.f58658b);
                String eventTypeString = jSONObject.getString("name");
                EnumC12577d1.C12578a c12578a = EnumC12577d1.f58319c;
                Intrinsics.checkNotNullExpressionValue(eventTypeString, "eventTypeString");
                EnumC12577d1 m63852a = c12578a.m63852a(eventTypeString);
                JSONObject data = jSONObject.getJSONObject(MessageExtension.FIELD_DATA);
                double d = jSONObject.getDouble("time");
                String m115351h = C31696Aj2.m115351h(jSONObject, "user_id");
                String m115351h2 = C31696Aj2.m115351h(jSONObject, AnalyticsFields.SESSION_ID);
                Intrinsics.checkNotNullExpressionValue(data, "data");
                return new C12749j(m63852a, data, d, this.f58659c, m115351h, m115351h2);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$b0 */
        /* loaded from: classes.dex */
        public static final class C12754b0 extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58660b;

            /* renamed from: c */
            final /* synthetic */ String[] f58661c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12754b0(String str, String[] strArr) {
                super(0);
                this.f58660b = str;
                this.f58661c = strArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", this.f58660b);
                String[] strArr = this.f58661c;
                if (strArr == null) {
                    jSONObject.put("value", JSONObject.NULL);
                } else {
                    jSONObject.put("value", C31696Aj2.m115356c(strArr));
                }
                return new C12749j(EnumC12577d1.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$c */
        /* loaded from: classes.dex */
        public static final class C12755c extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58662b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12755c(String str) {
                super(0);
                this.f58662b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f58662b);
                jSONObject.put("ids", jSONArray);
                return new C12749j(EnumC12577d1.CONTENT_CARDS_CLICK, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$c0 */
        /* loaded from: classes.dex */
        public static final class C12756c0 extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58663b;

            /* renamed from: c */
            final /* synthetic */ EnumC12984o5 f58664c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12756c0(String str, EnumC12984o5 enumC12984o5) {
                super(0);
                this.f58663b = str;
                this.f58664c = enumC12984o5;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("group_id", this.f58663b).put("status", this.f58664c.forJsonPut());
                EnumC12577d1 enumC12577d1 = EnumC12577d1.SUBSCRIPTION_GROUP_UPDATE;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$d */
        /* loaded from: classes.dex */
        public static final class C12757d extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58665b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12757d(String str) {
                super(0);
                this.f58665b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f58665b);
                jSONObject.put("ids", jSONArray);
                return new C12749j(EnumC12577d1.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$d0 */
        /* loaded from: classes.dex */
        public static final class C12758d0 extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58666b;

            /* renamed from: c */
            final /* synthetic */ String f58667c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12758d0(String str, String str2) {
                super(0);
                this.f58666b = str;
                this.f58667c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put(C17296a.f69688o, this.f58666b).put("l", this.f58667c);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.USER_ALIAS;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$e */
        /* loaded from: classes.dex */
        public static final class C12759e extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58668b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12759e(String str) {
                super(0);
                this.f58668b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f58668b);
                jSONObject.put("ids", jSONArray);
                return new C12749j(EnumC12577d1.CONTENT_CARDS_DISMISS, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$e0 */
        /* loaded from: classes.dex */
        public static final class C12760e0 extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C12760e0 f58669b = new C12760e0();

            public C12760e0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to create event";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$f */
        /* loaded from: classes.dex */
        public static final class C12761f extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58670b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12761f(String str) {
                super(0);
                this.f58670b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f58670b);
                jSONObject.put("ids", jSONArray);
                return new C12749j(EnumC12577d1.CONTENT_CARDS_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$g */
        /* loaded from: classes.dex */
        public static final class C12762g extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58671b;

            /* renamed from: c */
            final /* synthetic */ C48407s20 f58672c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12762g(String str, C48407s20 c48407s20) {
                super(0);
                this.f58671b = str;
                this.f58672c = c48407s20;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("n", this.f58671b);
                C48407s20 c48407s20 = this.f58672c;
                if (c48407s20 != null && c48407s20.m14854x() > 0) {
                    eventData.put("p", this.f58672c.forJsonPut());
                }
                EnumC12577d1 enumC12577d1 = EnumC12577d1.CUSTOM_EVENT;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$h */
        /* loaded from: classes.dex */
        public static final class C12763h extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ Throwable f58673b;

            /* renamed from: c */
            final /* synthetic */ C12648f5 f58674c;

            /* renamed from: d */
            final /* synthetic */ boolean f58675d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12763h(Throwable th, C12648f5 c12648f5, boolean z) {
                super(0);
                this.f58673b = th;
                this.f58674c = c12648f5;
                this.f58675d = z;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                String stringPlus;
                String trimIndent;
                StringBuilder sb = new StringBuilder();
                sb.append("\n                original_sdk_version: 21.0.0\n                exception_class: ");
                sb.append((Object) this.f58673b.getClass().getName());
                sb.append("\n                available_cpus: ");
                sb.append(C13204x5.m62821b());
                sb.append("\n                ");
                C12648f5 c12648f5 = this.f58674c;
                if (c12648f5 == null) {
                    stringPlus = null;
                } else {
                    stringPlus = Intrinsics.stringPlus("session_id: ", c12648f5);
                }
                sb.append((Object) stringPlus);
                sb.append("\n                ");
                sb.append(C12749j.f58647h.m63559a(this.f58673b));
                sb.append("\n            ");
                trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
                JSONObject eventData = new JSONObject().put("e", trimIndent);
                if (!this.f58675d) {
                    eventData.put("nop", true);
                }
                EnumC12577d1 enumC12577d1 = EnumC12577d1.INTERNAL_ERROR;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$i */
        /* loaded from: classes.dex */
        public static final class C12764i extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58676b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12764i(String str) {
                super(0);
                this.f58676b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f58676b);
                jSONObject.put("ids", jSONArray);
                return new C12749j(EnumC12577d1.NEWS_FEED_CARD_CLICK, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$j */
        /* loaded from: classes.dex */
        public static final class C12765j extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58677b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12765j(String str) {
                super(0);
                this.f58677b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f58677b);
                jSONObject.put("ids", jSONArray);
                return new C12749j(EnumC12577d1.NEWS_FEED_CARD_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$k */
        /* loaded from: classes.dex */
        public static final class C12766k extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58678b;

            /* renamed from: c */
            final /* synthetic */ String f58679c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12766k(String str, String str2) {
                super(0);
                this.f58678b = str;
                this.f58679c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("geo_id", this.f58678b).put("event_type", this.f58679c);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.GEOFENCE;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$l */
        /* loaded from: classes.dex */
        public static final class C12767l extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58680b;

            /* renamed from: c */
            final /* synthetic */ String f58681c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12767l(String str, String str2) {
                super(0);
                this.f58680b = str;
                this.f58681c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                return new C12749j(EnumC12577d1.INAPP_MESSAGE_BUTTON_CLICK, C12750a.m63572a(C12749j.f58647h, this.f58680b, this.f58681c, null, 4, null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$m */
        /* loaded from: classes.dex */
        public static final class C12768m extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58682b;

            /* renamed from: c */
            final /* synthetic */ C45103mT2 f58683c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12768m(String str, C45103mT2 c45103mT2) {
                super(0);
                this.f58682b = str;
                this.f58683c = c45103mT2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                return new C12749j(EnumC12577d1.INAPP_MESSAGE_BUTTON_CLICK, C12750a.m63572a(C12749j.f58647h, this.f58682b, this.f58683c.m25548y(), null, 4, null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$n */
        /* loaded from: classes.dex */
        public static final class C12769n extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58684b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12769n(String str) {
                super(0);
                this.f58684b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                return new C12749j(EnumC12577d1.INAPP_MESSAGE_CLICK, C12750a.m63572a(C12749j.f58647h, this.f58684b, null, null, 6, null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$o */
        /* loaded from: classes.dex */
        public static final class C12770o extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58685b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12770o(String str) {
                super(0);
                this.f58685b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                return new C12749j(EnumC12577d1.INAPP_MESSAGE_CONTROL_IMPRESSION, C12750a.m63572a(C12749j.f58647h, this.f58685b, null, null, 6, null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$p */
        /* loaded from: classes.dex */
        public static final class C12771p extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58686b;

            /* renamed from: c */
            final /* synthetic */ EnumC45156mZ1 f58687c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12771p(String str, EnumC45156mZ1 enumC45156mZ1) {
                super(0);
                this.f58686b = str;
                this.f58687c = enumC45156mZ1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                return new C12749j(EnumC12577d1.INAPP_MESSAGE_DISPLAY_FAILURE, C12750a.m63572a(C12749j.f58647h, this.f58686b, null, this.f58687c, 2, null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$q */
        /* loaded from: classes.dex */
        public static final class C12772q extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58688b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12772q(String str) {
                super(0);
                this.f58688b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                return new C12749j(EnumC12577d1.INAPP_MESSAGE_IMPRESSION, C12750a.m63572a(C12749j.f58647h, this.f58688b, null, null, 6, null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$r */
        /* loaded from: classes.dex */
        public static final class C12773r extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58689b;

            /* renamed from: c */
            final /* synthetic */ int f58690c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12773r(String str, int i) {
                super(0);
                this.f58689b = str;
                this.f58690c = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.f58689b).put("value", this.f58690c);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.INCREMENT;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$s */
        /* loaded from: classes.dex */
        public static final class C12774s extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58691b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12774s(String str) {
                super(0);
                this.f58691b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("n", this.f58691b);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.INTERNAL;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$t */
        /* loaded from: classes.dex */
        public static final class C12775t extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58692b;

            /* renamed from: c */
            final /* synthetic */ double f58693c;

            /* renamed from: d */
            final /* synthetic */ double f58694d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12775t(String str, double d, double d2) {
                super(0);
                this.f58692b = str;
                this.f58693c = d;
                this.f58694d = d2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.f58692b).put("latitude", this.f58693c).put("longitude", this.f58694d);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.LOCATION_CUSTOM_ATTRIBUTE_ADD;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$v */
        /* loaded from: classes.dex */
        public static final class C12776v extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ InterfaceC13200x1 f58695b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12776v(InterfaceC13200x1 interfaceC13200x1) {
                super(0);
                this.f58695b = interfaceC13200x1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                return new C12749j(EnumC12577d1.LOCATION_RECORDED, this.f58695b.forJsonPut(), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$w */
        /* loaded from: classes.dex */
        public static final class C12777w extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ C48407s20 f58696b;

            /* renamed from: c */
            final /* synthetic */ String f58697c;

            /* renamed from: d */
            final /* synthetic */ String f58698d;

            /* renamed from: e */
            final /* synthetic */ BigDecimal f58699e;

            /* renamed from: f */
            final /* synthetic */ int f58700f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12777w(C48407s20 c48407s20, String str, String str2, BigDecimal bigDecimal, int i) {
                super(0);
                this.f58696b = c48407s20;
                this.f58697c = str;
                this.f58698d = str2;
                this.f58699e = bigDecimal;
                this.f58700f = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject jSONObject = new JSONObject();
                String str = this.f58697c;
                String str2 = this.f58698d;
                BigDecimal bigDecimal = this.f58699e;
                int i = this.f58700f;
                jSONObject.put("pid", str);
                jSONObject.put("c", str2);
                jSONObject.put("p", C13019p3.m63151a(bigDecimal).doubleValue());
                jSONObject.put("q", i);
                C48407s20 c48407s20 = this.f58696b;
                if (c48407s20 != null && c48407s20.m14854x() > 0) {
                    jSONObject.put("pr", this.f58696b.forJsonPut());
                }
                return new C12749j(EnumC12577d1.PURCHASE, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$x */
        /* loaded from: classes.dex */
        public static final class C12778x extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58701b;

            /* renamed from: c */
            final /* synthetic */ String f58702c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12778x(String str, String str2) {
                super(0);
                this.f58701b = str;
                this.f58702c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("cid", this.f58701b).put(C17296a.f69688o, this.f58702c);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.PUSH_STORY_PAGE_CLICK;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$y */
        /* loaded from: classes.dex */
        public static final class C12779y extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ String f58703b;

            /* renamed from: c */
            final /* synthetic */ String f58704c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12779y(String str, String str2) {
                super(0);
                this.f58703b = str;
                this.f58704c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.f58703b).put("value", this.f58704c);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lbo/app/u1;", C17296a.f69688o, "()Lbo/app/u1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$z */
        /* loaded from: classes.dex */
        public static final class C12780z extends Lambda implements Function0<InterfaceC13160u1> {

            /* renamed from: b */
            final /* synthetic */ long f58705b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12780z(long j) {
                super(0);
                this.f58705b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC13160u1 invoke() {
                JSONObject eventData = new JSONObject().put(DateTokenConverter.CONVERTER_KEY, this.f58705b);
                EnumC12577d1 enumC12577d1 = EnumC12577d1.SESSION_END;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new C12749j(enumC12577d1, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C12750a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63561a(String eventName, C48407s20 c48407s20) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return m63557a(new C12762g(eventName, c48407s20));
        }

        @JvmStatic
        /* renamed from: b */
        public final InterfaceC13160u1 m63556b(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return m63557a(new C12757d(cardId));
        }

        @JvmStatic
        /* renamed from: c */
        public final InterfaceC13160u1 m63554c(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return m63557a(new C12759e(cardId));
        }

        @JvmStatic
        /* renamed from: d */
        public final InterfaceC13160u1 m63552d(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return m63557a(new C12761f(cardId));
        }

        @JvmStatic
        /* renamed from: e */
        public final InterfaceC13160u1 m63550e(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return m63557a(new C12764i(cardId));
        }

        @JvmStatic
        /* renamed from: f */
        public final InterfaceC13160u1 m63548f(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return m63557a(new C12765j(cardId));
        }

        @JvmStatic
        /* renamed from: g */
        public final InterfaceC13160u1 m63545g(String alias, String label) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(label, "label");
            return m63557a(new C12758d0(alias, label));
        }

        @JvmStatic
        /* renamed from: h */
        public final InterfaceC13160u1 m63544h(String triggerId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            return m63557a(new C12770o(triggerId));
        }

        @JvmStatic
        /* renamed from: i */
        public final InterfaceC13160u1 m63543i(String triggerId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            return m63557a(new C12772q(triggerId));
        }

        @JvmStatic
        /* renamed from: j */
        public final InterfaceC13160u1 m63542j(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return m63557a(new C12774s(name));
        }

        private C12750a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63565a(String productId, String currencyCode, BigDecimal price, int i, C48407s20 c48407s20) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(price, "price");
            return m63557a(new C12777w(c48407s20, productId, currencyCode, price, i));
        }

        @JvmStatic
        /* renamed from: b */
        public final InterfaceC13160u1 m63555b(String serializedEvent, String uniqueIdentifier) {
            Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
            Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
            return m63557a(new C12753b(serializedEvent, uniqueIdentifier));
        }

        @JvmStatic
        /* renamed from: c */
        public final InterfaceC13160u1 m63553c(String id, String eventType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return m63557a(new C12766k(id, eventType));
        }

        @JvmStatic
        /* renamed from: d */
        public final InterfaceC13160u1 m63551d(String triggerId, String buttonId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            Intrinsics.checkNotNullParameter(buttonId, "buttonId");
            return m63557a(new C12767l(triggerId, buttonId));
        }

        @JvmStatic
        /* renamed from: e */
        public final InterfaceC13160u1 m63549e(String campaignId, String pageId) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            return m63557a(new C12778x(campaignId, pageId));
        }

        @JvmStatic
        /* renamed from: f */
        public final InterfaceC13160u1 m63547f(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return m63557a(new C12779y(key, value));
        }

        @JvmStatic
        /* renamed from: g */
        public final InterfaceC13160u1 m63546g(String triggerId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            return m63557a(new C12769n(triggerId));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63571a(InterfaceC13200x1 location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return m63557a(new C12776v(location));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63558a(Throwable throwable, C12648f5 c12648f5, boolean z) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return m63557a(new C12763h(throwable, c12648f5, z));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63570a(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return m63557a(new C12755c(cardId));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63563a(String triggerId, C45103mT2 messageButton) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            Intrinsics.checkNotNullParameter(messageButton, "messageButton");
            return m63557a(new C12768m(triggerId, messageButton));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63562a(String triggerId, EnumC45156mZ1 inAppMessageFailureType) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            Intrinsics.checkNotNullParameter(inAppMessageFailureType, "inAppMessageFailureType");
            return m63557a(new C12771p(triggerId, inAppMessageFailureType));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63575a() {
            return m63542j("feed_displayed");
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63568a(String customUserAttributeKey, int i) {
            Intrinsics.checkNotNullParameter(customUserAttributeKey, "customUserAttributeKey");
            return m63557a(new C12773r(customUserAttributeKey, i));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63566a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return m63557a(new C12751a(key, value));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63560a(String key, String[] strArr) {
            Intrinsics.checkNotNullParameter(key, "key");
            return m63557a(new C12754b0(key, strArr));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63573a(C12648f5 sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return m63557a(new C12752a0(sessionId));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63574a(long j) {
            return m63557a(new C12780z(j));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63569a(String key, double d, double d2) {
            Intrinsics.checkNotNullParameter(key, "key");
            return m63557a(new C12775t(key, d, d2));
        }

        @JvmStatic
        /* renamed from: a */
        public final InterfaceC13160u1 m63567a(String subscriptionGroupId, EnumC12984o5 subscriptionGroupStatus) {
            Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
            Intrinsics.checkNotNullParameter(subscriptionGroupStatus, "subscriptionGroupStatus");
            return m63557a(new C12756c0(subscriptionGroupId, subscriptionGroupStatus));
        }

        @JvmStatic
        /* renamed from: a */
        public final String m63559a(Throwable throwable) {
            String take;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            StringWriter stringWriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "result.toString()");
            take = StringsKt___StringsKt.take(stringWriter2, 5000);
            return take;
        }

        /* renamed from: a */
        public static /* synthetic */ JSONObject m63572a(C12750a c12750a, String str, String str2, EnumC45156mZ1 enumC45156mZ1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                enumC45156mZ1 = null;
            }
            return c12750a.m63564a(str, str2, enumC45156mZ1);
        }

        @JvmStatic
        /* renamed from: a */
        public final JSONObject m63564a(String str, String str2, EnumC45156mZ1 enumC45156mZ1) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                jSONObject.put("trigger_ids", jSONArray);
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                jSONObject.put("bid", str2);
            }
            if (enumC45156mZ1 != null) {
                jSONObject.put("error_code", enumC45156mZ1.forJsonPut());
            }
            return jSONObject;
        }

        /* renamed from: a */
        private final InterfaceC13160u1 m63557a(Function0<? extends InterfaceC13160u1> function0) {
            try {
                return function0.invoke();
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12760e0.f58669b, 4, null);
                return null;
            }
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j$b */
    /* loaded from: classes.dex */
    public static final class C12781b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12781b f58706b = new C12781b();

        public C12781b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Braze event json";
        }
    }

    public C12749j(EnumC12577d1 type, JSONObject data, double d, String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.f58649b = type;
        this.f58650c = data;
        this.f58651d = d;
        this.f58652e = uniqueIdentifier;
        this.f58653f = new C12645f3();
        this.f58654g = new C12645f3();
        if (type == EnumC12577d1.UNKNOWN) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final InterfaceC13160u1 m63583a(InterfaceC13200x1 interfaceC13200x1) {
        return f58647h.m63571a(interfaceC13200x1);
    }

    @JvmStatic
    /* renamed from: e */
    public static final InterfaceC13160u1 m63579e() {
        return f58647h.m63575a();
    }

    @Override // bo.app.InterfaceC13160u1
    /* renamed from: d */
    public boolean mo62898d() {
        if (this.f58649b != EnumC12577d1.INTERNAL_ERROR || !mo62896k().optBoolean("nop", false)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            return Intrinsics.areEqual(mo62893r(), ((C12749j) obj).mo62893r());
        }
        return false;
    }

    public int hashCode() {
        return mo62893r().hashCode();
    }

    @Override // bo.app.InterfaceC13160u1
    /* renamed from: j */
    public final EnumC12577d1 mo62897j() {
        return this.f58649b;
    }

    @Override // bo.app.InterfaceC13160u1
    /* renamed from: k */
    public JSONObject mo62896k() {
        return this.f58650c;
    }

    @Override // bo.app.InterfaceC13160u1
    /* renamed from: n */
    public final C12648f5 mo62895n() {
        return (C12648f5) this.f58654g.getValue(this, f58648i[1]);
    }

    @Override // bo.app.InterfaceC13160u1
    /* renamed from: r */
    public String mo62893r() {
        return this.f58652e;
    }

    public String toString() {
        return m62894p();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: JSONException -> 0x004e, TryCatch #0 {JSONException -> 0x004e, blocks: (B:3:0x0005, B:5:0x0028, B:11:0x0034, B:12:0x003d, B:15:0x0044), top: B:20:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: JSONException -> 0x004e, TRY_LEAVE, TryCatch #0 {JSONException -> 0x004e, blocks: (B:3:0x0005, B:5:0x0028, B:11:0x0034, B:12:0x003d, B:15:0x0044), top: B:20:0x0005 }] */
    @Override // p000.InterfaceC37933aP1
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject forJsonPut() {
        String m63576x;
        boolean z;
        C12648f5 mo62895n;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f58649b.forJsonPut());
            jSONObject.put(MessageExtension.FIELD_DATA, mo62896k());
            jSONObject.put("time", m63577w());
            m63576x = m63576x();
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12781b.f58706b, 4, null);
        }
        if (m63576x != null && m63576x.length() != 0) {
            z = false;
            if (!z) {
                jSONObject.put("user_id", m63576x());
            }
            mo62895n = mo62895n();
            if (mo62895n == null) {
                jSONObject.put(AnalyticsFields.SESSION_ID, mo62895n.forJsonPut());
            }
            return jSONObject;
        }
        z = true;
        if (!z) {
        }
        mo62895n = mo62895n();
        if (mo62895n == null) {
        }
        return jSONObject;
    }

    /* renamed from: w */
    public double m63577w() {
        return this.f58651d;
    }

    /* renamed from: x */
    public final String m63576x() {
        return (String) this.f58653f.getValue(this, f58648i[0]);
    }

    @JvmStatic
    /* renamed from: a */
    public static final InterfaceC13160u1 m63580a(String str, C48407s20 c48407s20) {
        return f58647h.m63561a(str, c48407s20);
    }

    @JvmStatic
    /* renamed from: a */
    public static final InterfaceC13160u1 m63582a(String str, String str2) {
        return f58647h.m63549e(str, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final InterfaceC13160u1 m63581a(String str, String str2, BigDecimal bigDecimal, int i, C48407s20 c48407s20) {
        return f58647h.m63565a(str, str2, bigDecimal, i, c48407s20);
    }

    @Override // bo.app.InterfaceC13160u1
    /* renamed from: a */
    public final void mo62899a(String str) {
        this.f58653f.setValue(this, f58648i[0], str);
    }

    @Override // bo.app.InterfaceC13160u1
    /* renamed from: a */
    public final void mo62900a(C12648f5 c12648f5) {
        this.f58654g.setValue(this, f58648i[1], c12648f5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C12749j(EnumC12577d1 enumC12577d1, JSONObject jSONObject, double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC12577d1, r2, r3, str);
        JSONObject jSONObject2 = (i & 2) != 0 ? new JSONObject() : jSONObject;
        double m21026j = (i & 4) != 0 ? C46287oT0.m21026j() : d;
        if ((i & 8) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12749j(EnumC12577d1 eventType, JSONObject eventData, double d, String uniqueIdentifier, String str, String str2) {
        this(eventType, eventData, d, uniqueIdentifier);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        mo62899a(str);
        mo62900a(str2 == null ? null : C12648f5.f58467d.m63732a(str2));
    }
}
