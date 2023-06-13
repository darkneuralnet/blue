package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C44130kp2;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u001e\n\u0002\b\t\u0018\u0000 F2\u00020\u0001:\u0002\b\u001eB\u008b\u0001\b\u0017\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010>\u0012\u0010\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010>\u0012\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010>\u0012\b\u0010?\u001a\u0004\u0018\u00010-\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0017\u0012\b\u00108\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010CB\u0011\b\u0010\u0012\u0006\u0010D\u001a\u00020\u0013¢\u0006\u0004\bB\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b/\u00100R\u0017\u00103\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b2\u0010\u001bR\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b\u0018\u0010+R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b6\u0010+R\u0017\u00108\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0019\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b4\u0010+R\u0011\u0010<\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006G"}, m28432d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "", "s", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", C17296a.f69688o, "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lorg/json/JSONObject;", "r", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "Ljava/util/Date;", "b", "Ljava/util/Date;", "h", "()Ljava/util/Date;", "expires", "", "c", "Ljava/util/Set;", "k", "()Ljava/util/Set;", "permissions", DateTokenConverter.CONVERTER_KEY, "e", "declinedPermissions", "g", "expiredPermissions", "f", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "token", "LI1;", "LI1;", "l", "()LI1;", Stripe3ds2AuthParams.FIELD_SOURCE, "j", "lastRefresh", "i", NamedConstantsKt.APPLICATION_ID, "n", "userId", "dataAccessExpirationTime", "graphDomain", "p", "()Z", "isExpired", "accessToken", "", "accessTokenSource", "expirationTime", "lastRefreshTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;LI1;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "q", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class AccessToken implements Parcelable {
    @JvmField
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* renamed from: m */
    public static final Date f69310m;

    /* renamed from: n */
    public static final Date f69311n;

    /* renamed from: o */
    public static final Date f69312o;

    /* renamed from: p */
    public static final EnumC3312I1 f69313p;

    /* renamed from: q */
    public static final C17188c f69314q = new C17188c(null);

    /* renamed from: b */
    public final Date f69315b;

    /* renamed from: c */
    public final Set<String> f69316c;

    /* renamed from: d */
    public final Set<String> f69317d;

    /* renamed from: e */
    public final Set<String> f69318e;

    /* renamed from: f */
    public final String f69319f;

    /* renamed from: g */
    public final EnumC3312I1 f69320g;

    /* renamed from: h */
    public final Date f69321h;

    /* renamed from: i */
    public final String f69322i;

    /* renamed from: j */
    public final String f69323j;

    /* renamed from: k */
    public final Date f69324k;

    /* renamed from: l */
    public final String f69325l;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lcom/facebook/AccessToken$a;", "", "Lcom/facebook/FacebookException;", "exception", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.AccessToken$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC17186a {
        /* renamed from: a */
        void m52904a(FacebookException facebookException);
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"com/facebook/AccessToken$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "Landroid/os/Parcel;", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "", "size", "", "b", "(I)[Lcom/facebook/AccessToken;", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.AccessToken$b */
    /* loaded from: classes5.dex */
    public static final class C17187b implements Parcelable.Creator<AccessToken> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AccessToken createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AccessToken(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J)\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0007R\u0014\u0010\u0018\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0014\u0010/\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(R\u0014\u00100\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0014\u00101\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u0014\u00102\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0019¨\u00067"}, m28432d2 = {"Lcom/facebook/AccessToken$c;", "", "Lcom/facebook/AccessToken;", "e", "accessToken", "", "h", "", "g", DateTokenConverter.CONVERTER_KEY, "current", C17296a.f69688o, "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;", "Landroid/os/Bundle;", "bundle", "c", "", "key", "", "f", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "Lorg/json/JSONObject;", "jsonObject", "b", "ACCESS_TOKEN_KEY", "Ljava/lang/String;", "APPLICATION_ID_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "CURRENT_JSON_FORMAT", "I", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "LI1;", "DEFAULT_ACCESS_TOKEN_SOURCE", "LI1;", "Ljava/util/Date;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.AccessToken$c */
    /* loaded from: classes5.dex */
    public static final class C17188c {
        private C17188c() {
        }

        /* renamed from: a */
        public final AccessToken m52901a(AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.m52911m(), current.m52921b(), current.m52910n(), current.m52913k(), current.m52918e(), current.m52917g(), current.m52912l(), new Date(), new Date(), current.m52919d(), null, 1024, null);
        }

        @JvmStatic
        /* renamed from: b */
        public final AccessToken m52900b(JSONObject jsonObject) throws JSONException {
            Collection m2856V;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") <= 1) {
                String token = jsonObject.getString("token");
                Date date = new Date(jsonObject.getLong("expires_at"));
                JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
                JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jsonObject.getLong("last_refresh"));
                String string = jsonObject.getString(Stripe3ds2AuthParams.FIELD_SOURCE);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
                EnumC3312I1 valueOf = EnumC3312I1.valueOf(string);
                String applicationId = jsonObject.getString(NetworkConstants.PARAMS_APPLICATION_ID);
                String userId = jsonObject.getString("user_id");
                Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
                String optString = jsonObject.optString("graph_domain", null);
                Intrinsics.checkNotNullExpressionValue(token, "token");
                Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
                Intrinsics.checkNotNullExpressionValue(userId, "userId");
                Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
                List<String> m2856V2 = C52364yi6.m2856V(permissionsArray);
                Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
                List<String> m2856V3 = C52364yi6.m2856V(declinedPermissionsArray);
                if (optJSONArray == null) {
                    m2856V = new ArrayList();
                } else {
                    m2856V = C52364yi6.m2856V(optJSONArray);
                }
                return new AccessToken(token, applicationId, userId, m2856V2, m2856V3, m2856V, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        @JvmStatic
        /* renamed from: c */
        public final AccessToken m52899c(Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<String> m52896f = m52896f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> m52896f2 = m52896f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> m52896f3 = m52896f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            C44130kp2.C25503a c25503a = C44130kp2.f95036d;
            String m28385a = c25503a.m28385a(bundle);
            if (C52364yi6.m2860R(m28385a)) {
                m28385a = C17216a.m52740f();
            }
            String str = m28385a;
            String m28380f = c25503a.m28380f(bundle);
            if (m28380f != null) {
                JSONObject m2847c = C52364yi6.m2847c(m28380f);
                if (m2847c != null) {
                    try {
                        string = m2847c.getString("id");
                    } catch (JSONException unused) {
                        return null;
                    }
                } else {
                    string = null;
                }
                if (str != null && string != null) {
                    return new AccessToken(m28380f, str, string, m52896f, m52896f2, m52896f3, c25503a.m28381e(bundle), c25503a.m28383c(bundle), c25503a.m28382d(bundle), null, null, 1024, null);
                }
            }
            return null;
        }

        @JvmStatic
        /* renamed from: d */
        public final void m52898d() {
            AccessToken m106005g = C2597G1.f10726g.m105991e().m106005g();
            if (m106005g != null) {
                m52894h(m52901a(m106005g));
            }
        }

        @JvmStatic
        /* renamed from: e */
        public final AccessToken m52897e() {
            return C2597G1.f10726g.m105991e().m106005g();
        }

        @JvmStatic
        /* renamed from: f */
        public final List<String> m52896f(Bundle bundle, String str) {
            List<String> emptyList;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiable…ist(originalPermissions))");
            return unmodifiableList;
        }

        @JvmStatic
        /* renamed from: g */
        public final boolean m52895g() {
            AccessToken m106005g = C2597G1.f10726g.m105991e().m106005g();
            if (m106005g != null && !m106005g.m52908p()) {
                return true;
            }
            return false;
        }

        @JvmStatic
        /* renamed from: h */
        public final void m52894h(AccessToken accessToken) {
            C2597G1.f10726g.m105991e().m105999m(accessToken);
        }

        public /* synthetic */ C17188c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Date date = new Date((long) LongCompanionObject.MAX_VALUE);
        f69310m = date;
        f69311n = date;
        f69312o = new Date();
        f69313p = EnumC3312I1.FACEBOOK_APPLICATION_WEB;
        CREATOR = new C17187b();
    }

    @JvmOverloads
    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC3312I1 enumC3312I1, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, enumC3312I1, date, date2, date3, null, 1024, null);
    }

    @JvmStatic
    /* renamed from: c */
    public static final AccessToken m52920c() {
        return f69314q.m52897e();
    }

    @JvmStatic
    /* renamed from: o */
    public static final boolean m52909o() {
        return f69314q.m52895g();
    }

    @JvmStatic
    /* renamed from: q */
    public static final void m52907q(AccessToken accessToken) {
        f69314q.m52894h(accessToken);
    }

    /* renamed from: a */
    public final void m52922a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f69316c));
        sb.append("]");
    }

    /* renamed from: b */
    public final String m52921b() {
        return this.f69322i;
    }

    /* renamed from: d */
    public final Date m52919d() {
        return this.f69324k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Set<String> m52918e() {
        return this.f69317d;
    }

    public boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.areEqual(this.f69315b, accessToken.f69315b) && Intrinsics.areEqual(this.f69316c, accessToken.f69316c) && Intrinsics.areEqual(this.f69317d, accessToken.f69317d) && Intrinsics.areEqual(this.f69318e, accessToken.f69318e) && Intrinsics.areEqual(this.f69319f, accessToken.f69319f) && this.f69320g == accessToken.f69320g && Intrinsics.areEqual(this.f69321h, accessToken.f69321h) && Intrinsics.areEqual(this.f69322i, accessToken.f69322i) && Intrinsics.areEqual(this.f69323j, accessToken.f69323j) && Intrinsics.areEqual(this.f69324k, accessToken.f69324k)) {
            String str = this.f69325l;
            String str2 = accessToken.f69325l;
            if (str == null) {
                if (str2 == null) {
                    areEqual = true;
                } else {
                    areEqual = false;
                }
            } else {
                areEqual = Intrinsics.areEqual(str, str2);
            }
            if (areEqual) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final Set<String> m52917g() {
        return this.f69318e;
    }

    /* renamed from: h */
    public final Date m52916h() {
        return this.f69315b;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((((((((((527 + this.f69315b.hashCode()) * 31) + this.f69316c.hashCode()) * 31) + this.f69317d.hashCode()) * 31) + this.f69318e.hashCode()) * 31) + this.f69319f.hashCode()) * 31) + this.f69320g.hashCode()) * 31) + this.f69321h.hashCode()) * 31) + this.f69322i.hashCode()) * 31) + this.f69323j.hashCode()) * 31) + this.f69324k.hashCode()) * 31;
        String str = this.f69325l;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final String m52915i() {
        return this.f69325l;
    }

    /* renamed from: j */
    public final Date m52914j() {
        return this.f69321h;
    }

    /* renamed from: k */
    public final Set<String> m52913k() {
        return this.f69316c;
    }

    /* renamed from: l */
    public final EnumC3312I1 m52912l() {
        return this.f69320g;
    }

    /* renamed from: m */
    public final String m52911m() {
        return this.f69319f;
    }

    /* renamed from: n */
    public final String m52910n() {
        return this.f69323j;
    }

    /* renamed from: p */
    public final boolean m52908p() {
        return new Date().after(this.f69315b);
    }

    /* renamed from: r */
    public final JSONObject m52906r() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f69319f);
        jSONObject.put("expires_at", this.f69315b.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f69316c));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f69317d));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f69318e));
        jSONObject.put("last_refresh", this.f69321h.getTime());
        jSONObject.put(Stripe3ds2AuthParams.FIELD_SOURCE, this.f69320g.name());
        jSONObject.put(NetworkConstants.PARAMS_APPLICATION_ID, this.f69322i);
        jSONObject.put("user_id", this.f69323j);
        jSONObject.put("data_access_expiration_time", this.f69324k.getTime());
        String str = this.f69325l;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    /* renamed from: s */
    public final String m52905s() {
        if (C17216a.m52720z(EnumC36034Sx2.INCLUDE_ACCESS_TOKENS)) {
            return this.f69319f;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m52905s());
        m52922a(sb);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f69315b.getTime());
        dest.writeStringList(new ArrayList(this.f69316c));
        dest.writeStringList(new ArrayList(this.f69317d));
        dest.writeStringList(new ArrayList(this.f69318e));
        dest.writeString(this.f69319f);
        dest.writeString(this.f69320g.name());
        dest.writeLong(this.f69321h.getTime());
        dest.writeString(this.f69322i);
        dest.writeString(this.f69323j);
        dest.writeLong(this.f69324k.getTime());
        dest.writeString(this.f69325l);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC3312I1 enumC3312I1, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, enumC3312I1, date, date2, date3, (i & 1024) != 0 ? null : str4);
    }

    @JvmOverloads
    public AccessToken(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC3312I1 enumC3312I1, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        C48817sj6.m13768j(accessToken, "accessToken");
        C48817sj6.m13768j(applicationId, NamedConstantsKt.APPLICATION_ID);
        C48817sj6.m13768j(userId, "userId");
        this.f69315b = date == null ? f69311n : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "Collections.unmodifiable…missions) else HashSet())");
        this.f69316c = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "Collections.unmodifiable…missions) else HashSet())");
        this.f69317d = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "Collections.unmodifiable…missions) else HashSet())");
        this.f69318e = unmodifiableSet3;
        this.f69319f = accessToken;
        this.f69320g = enumC3312I1 == null ? f69313p : enumC3312I1;
        this.f69321h = date2 == null ? f69312o : date2;
        this.f69322i = applicationId;
        this.f69323j = userId;
        this.f69324k = (date3 == null || date3.getTime() == 0) ? f69311n : date3;
        this.f69325l = str;
    }

    public AccessToken(Parcel parcel) {
        EnumC3312I1 enumC3312I1;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f69315b = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f69316c = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f69317d = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f69318e = unmodifiableSet3;
        String readString = parcel.readString();
        C48817sj6.m13764n(readString, "token");
        if (readString != null) {
            this.f69319f = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                enumC3312I1 = EnumC3312I1.valueOf(readString2);
            } else {
                enumC3312I1 = f69313p;
            }
            this.f69320g = enumC3312I1;
            this.f69321h = new Date(parcel.readLong());
            String readString3 = parcel.readString();
            C48817sj6.m13764n(readString3, NamedConstantsKt.APPLICATION_ID);
            if (readString3 != null) {
                this.f69322i = readString3;
                String readString4 = parcel.readString();
                C48817sj6.m13764n(readString4, "userId");
                if (readString4 != null) {
                    this.f69323j = readString4;
                    this.f69324k = new Date(parcel.readLong());
                    this.f69325l = parcel.readString();
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
