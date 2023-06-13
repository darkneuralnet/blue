package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.FacebookRequestError;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0014\u0018\u0000  2\u00020\u0001:\u0001\u000eB\u0081\u0001\b\u0000\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f\u0012\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f\u0012\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR-\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R-\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R-\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006!"}, m28432d2 = {"Lnj1;", "", "Lcom/facebook/FacebookRequestError$a;", "category", "", DateTokenConverter.CONVERTER_KEY, "", "errorCode", "errorSubCode", "", "isTransient", "c", "", "", C17296a.f69688o, "Ljava/util/Map;", "getOtherErrors", "()Ljava/util/Map;", "otherErrors", "b", "getTransientErrors", "transientErrors", "getLoginRecoverableErrors", "loginRecoverableErrors", "Ljava/lang/String;", "otherRecoveryMessage", "e", "transientRecoveryMessage", "f", "loginRecoverableRecoveryMessage", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "h", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: nj1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45848nj1 {

    /* renamed from: g */
    public static C45848nj1 f100422g;

    /* renamed from: h */
    public static final C26574a f100423h = new C26574a(null);

    /* renamed from: a */
    public final Map<Integer, Set<Integer>> f100424a;

    /* renamed from: b */
    public final Map<Integer, Set<Integer>> f100425b;

    /* renamed from: c */
    public final Map<Integer, Set<Integer>> f100426c;

    /* renamed from: d */
    public final String f100427d;

    /* renamed from: e */
    public final String f100428e;

    /* renamed from: f */
    public final String f100429f;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010\u000fJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J&\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\n\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001a\u0010\u0010\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m28432d2 = {"Lnj1$a;", "", "Lorg/json/JSONArray;", "jsonArray", "Lnj1;", C17296a.f69688o, "Lorg/json/JSONObject;", "definition", "", "", "", DateTokenConverter.CONVERTER_KEY, "b", "()Lnj1;", "getDefaultErrorClassification$annotations", "()V", "defaultErrorClassification", "c", "defaultErrorClassificationImpl", "EC_APP_NOT_INSTALLED", "I", "EC_APP_TOO_MANY_CALLS", "EC_INVALID_SESSION", "EC_INVALID_TOKEN", "EC_RATE", "EC_SERVICE_UNAVAILABLE", "EC_TOO_MANY_USER_ACTION_CALLS", "EC_USER_TOO_MANY_CALLS", "ESC_APP_INACTIVE", "ESC_APP_NOT_INSTALLED", "", "KEY_LOGIN_RECOVERABLE", "Ljava/lang/String;", "KEY_NAME", "KEY_OTHER", "KEY_RECOVERY_MESSAGE", "KEY_TRANSIENT", "defaultInstance", "Lnj1;", "<init>", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: nj1$a */
    /* loaded from: classes5.dex */
    public static final class C26574a {
        private C26574a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final C45848nj1 m23266a(JSONArray jSONArray) {
            String optString;
            boolean equals;
            boolean equals2;
            boolean equals3;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map<Integer, Set<Integer>> map = null;
            Map<Integer, Set<Integer>> map2 = null;
            Map<Integer, Set<Integer>> map3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                    equals = StringsKt__StringsJVMKt.equals(optString, LegacyRepairType.OTHER_KEY, true);
                    if (equals) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = m23263d(optJSONObject);
                    } else {
                        equals2 = StringsKt__StringsJVMKt.equals(optString, "transient", true);
                        if (equals2) {
                            str2 = optJSONObject.optString("recovery_message", null);
                            map2 = m23263d(optJSONObject);
                        } else {
                            equals3 = StringsKt__StringsJVMKt.equals(optString, "login_recoverable", true);
                            if (equals3) {
                                str3 = optJSONObject.optString("recovery_message", null);
                                map3 = m23263d(optJSONObject);
                            }
                        }
                    }
                }
            }
            return new C45848nj1(map, map2, map3, str, str2, str3);
        }

        /* renamed from: b */
        public final synchronized C45848nj1 m23265b() {
            C45848nj1 c45848nj1;
            if (C45848nj1.f100422g == null) {
                C45848nj1.f100422g = C45848nj1.f100423h.m23264c();
            }
            c45848nj1 = C45848nj1.f100422g;
            if (c45848nj1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return c45848nj1;
        }

        /* renamed from: c */
        public final C45848nj1 m23264c() {
            HashMap hashMapOf;
            HashMap hashMapOf2;
            hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m28425to(2, null), TuplesKt.m28425to(4, null), TuplesKt.m28425to(9, null), TuplesKt.m28425to(17, null), TuplesKt.m28425to(341, null));
            hashMapOf2 = MapsKt__MapsKt.hashMapOf(TuplesKt.m28425to(102, null), TuplesKt.m28425to(190, null), TuplesKt.m28425to(Integer.valueOf((int) Constants.FAILED_PRECONDITION_STATUS_CODE), null));
            return new C45848nj1(null, hashMapOf, hashMapOf2, null, null, null);
        }

        /* renamed from: d */
        public final Map<Integer, Set<Integer>> m23263d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (optInt = optJSONObject.optInt(PaymentMethodOptionsParams.Blik.PARAM_CODE)) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        public /* synthetic */ C26574a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45848nj1(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f100424a = map;
        this.f100425b = map2;
        this.f100426c = map3;
        this.f100427d = str;
        this.f100428e = str2;
        this.f100429f = str3;
    }

    /* renamed from: c */
    public final FacebookRequestError.EnumC17196a m23268c(int i, int i2, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.EnumC17196a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f100424a;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = this.f100424a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC17196a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f100426c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = this.f100426c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC17196a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f100425b;
        if (map3 != null && map3.containsKey(Integer.valueOf(i)) && ((set = this.f100425b.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC17196a.TRANSIENT;
        }
        return FacebookRequestError.EnumC17196a.OTHER;
    }

    /* renamed from: d */
    public final String m23267d(FacebookRequestError.EnumC17196a enumC17196a) {
        if (enumC17196a != null) {
            int i = C46441oj1.$EnumSwitchMapping$0[enumC17196a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f100428e;
                    }
                } else {
                    return this.f100429f;
                }
            } else {
                return this.f100427d;
            }
        }
        return null;
    }
}
