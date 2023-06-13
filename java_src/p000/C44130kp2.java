package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C32992Fx2;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0005B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0014"}, m28432d2 = {"Lkp2;", "", "Landroid/os/Bundle;", "c", "", C17296a.f69688o, "", "key", "bundle", "b", "Ljava/lang/String;", "cacheKey", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "cache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: kp2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44130kp2 {

    /* renamed from: c */
    public static final String f95035c;

    /* renamed from: d */
    public static final C25503a f95036d = new C25503a(null);

    /* renamed from: a */
    public final String f95037a;

    /* renamed from: b */
    public final SharedPreferences f95038b;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0011R\u0014\u0010!\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0011R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0011R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0011R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0011R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0011R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0011R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0011R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0011R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0011R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0011R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0011R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0011R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0011R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0011R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0011¨\u00067"}, m28432d2 = {"Lkp2$a;", "", "Landroid/os/Bundle;", "bundle", "", "g", "", "f", "Ljava/util/Date;", "c", "LI1;", "e", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "key", "b", "APPLICATION_ID_KEY", "Ljava/lang/String;", "DECLINED_PERMISSIONS_KEY", "DEFAULT_CACHE_KEY", "EXPIRATION_DATE_KEY", "EXPIRED_PERMISSIONS_KEY", "", "INVALID_BUNDLE_MILLISECONDS", "J", "IS_SSO_KEY", "JSON_VALUE", "JSON_VALUE_ENUM_TYPE", "JSON_VALUE_TYPE", "LAST_REFRESH_DATE_KEY", "PERMISSIONS_KEY", "TAG", "TOKEN_KEY", "TOKEN_SOURCE_KEY", "TYPE_BOOLEAN", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_CHAR", "TYPE_CHAR_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_ENUM", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_SHORT", "TYPE_SHORT_ARRAY", "TYPE_STRING", "TYPE_STRING_LIST", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: kp2$a */
    /* loaded from: classes5.dex */
    public static final class C25503a {
        private C25503a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final String m28385a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        /* renamed from: b */
        public final Date m28384b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        @JvmStatic
        /* renamed from: c */
        public final Date m28383c(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return m28384b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        @JvmStatic
        /* renamed from: d */
        public final Date m28382d(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return m28384b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        @JvmStatic
        /* renamed from: e */
        public final EnumC3312I1 m28381e(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (EnumC3312I1) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                return EnumC3312I1.FACEBOOK_APPLICATION_WEB;
            }
            return EnumC3312I1.WEB_VIEW;
        }

        @JvmStatic
        /* renamed from: f */
        public final String m28380f(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        @JvmStatic
        /* renamed from: g */
        public final boolean m28379g(Bundle bundle) {
            String string;
            boolean z;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C25503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = C44130kp2.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "LegacyTokenHelper::class.java.simpleName");
        f95035c = simpleName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if ((r4.length() == 0) != false) goto L14;
     */
    @JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C44130kp2(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null) {
        }
        str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        this.f95037a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.f95038b = sharedPreferences;
    }

    /* renamed from: a */
    public final void m28388a() {
        this.f95038b.edit().clear().apply();
    }

    /* renamed from: b */
    public final void m28387b(String str, Bundle bundle) throws JSONException {
        String str2;
        String string = this.f95038b.getString(str, "{}");
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            String string2 = jSONObject.getString("valueType");
            if (Intrinsics.areEqual(string2, "bool")) {
                bundle.putBoolean(str, jSONObject.getBoolean("value"));
                return;
            }
            int i = 0;
            if (Intrinsics.areEqual(string2, "bool[]")) {
                JSONArray jSONArray = jSONObject.getJSONArray("value");
                int length = jSONArray.length();
                boolean[] zArr = new boolean[length];
                while (i < length) {
                    zArr[i] = jSONArray.getBoolean(i);
                    i++;
                }
                bundle.putBooleanArray(str, zArr);
                return;
            } else if (Intrinsics.areEqual(string2, "byte")) {
                bundle.putByte(str, (byte) jSONObject.getInt("value"));
                return;
            } else if (Intrinsics.areEqual(string2, "byte[]")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                byte[] bArr = new byte[length2];
                while (i < length2) {
                    bArr[i] = (byte) jSONArray2.getInt(i);
                    i++;
                }
                bundle.putByteArray(str, bArr);
                return;
            } else if (Intrinsics.areEqual(string2, "short")) {
                bundle.putShort(str, (short) jSONObject.getInt("value"));
                return;
            } else if (Intrinsics.areEqual(string2, "short[]")) {
                JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                int length3 = jSONArray3.length();
                short[] sArr = new short[length3];
                while (i < length3) {
                    sArr[i] = (short) jSONArray3.getInt(i);
                    i++;
                }
                bundle.putShortArray(str, sArr);
                return;
            } else if (Intrinsics.areEqual(string2, "int")) {
                bundle.putInt(str, jSONObject.getInt("value"));
                return;
            } else if (Intrinsics.areEqual(string2, "int[]")) {
                JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                int length4 = jSONArray4.length();
                int[] iArr = new int[length4];
                while (i < length4) {
                    iArr[i] = jSONArray4.getInt(i);
                    i++;
                }
                bundle.putIntArray(str, iArr);
                return;
            } else if (Intrinsics.areEqual(string2, "long")) {
                bundle.putLong(str, jSONObject.getLong("value"));
                return;
            } else if (Intrinsics.areEqual(string2, "long[]")) {
                JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                int length5 = jSONArray5.length();
                long[] jArr = new long[length5];
                while (i < length5) {
                    jArr[i] = jSONArray5.getLong(i);
                    i++;
                }
                bundle.putLongArray(str, jArr);
                return;
            } else if (Intrinsics.areEqual(string2, "float")) {
                bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                return;
            } else if (Intrinsics.areEqual(string2, "float[]")) {
                JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                int length6 = jSONArray6.length();
                float[] fArr = new float[length6];
                while (i < length6) {
                    fArr[i] = (float) jSONArray6.getDouble(i);
                    i++;
                }
                bundle.putFloatArray(str, fArr);
                return;
            } else if (Intrinsics.areEqual(string2, "double")) {
                bundle.putDouble(str, jSONObject.getDouble("value"));
                return;
            } else if (Intrinsics.areEqual(string2, "double[]")) {
                JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                int length7 = jSONArray7.length();
                double[] dArr = new double[length7];
                while (i < length7) {
                    dArr[i] = jSONArray7.getDouble(i);
                    i++;
                }
                bundle.putDoubleArray(str, dArr);
                return;
            } else if (Intrinsics.areEqual(string2, "char")) {
                String string3 = jSONObject.getString("value");
                if (string3 != null && string3.length() == 1) {
                    bundle.putChar(str, string3.charAt(0));
                    return;
                }
                return;
            } else if (Intrinsics.areEqual(string2, "char[]")) {
                JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                int length8 = jSONArray8.length();
                char[] cArr = new char[length8];
                for (int i2 = 0; i2 < length8; i2++) {
                    String string4 = jSONArray8.getString(i2);
                    if (string4 != null && string4.length() == 1) {
                        cArr[i2] = string4.charAt(0);
                    }
                }
                bundle.putCharArray(str, cArr);
                return;
            } else if (Intrinsics.areEqual(string2, "string")) {
                bundle.putString(str, jSONObject.getString("value"));
                return;
            } else if (Intrinsics.areEqual(string2, "stringList")) {
                JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                int length9 = jSONArray9.length();
                ArrayList<String> arrayList = new ArrayList<>(length9);
                while (i < length9) {
                    Object obj = jSONArray9.get(i);
                    if (obj == JSONObject.NULL) {
                        str2 = null;
                    } else if (obj != null) {
                        str2 = (String) obj;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    arrayList.add(i, str2);
                    i++;
                }
                bundle.putStringArrayList(str, arrayList);
                return;
            } else if (Intrinsics.areEqual(string2, "enum")) {
                try {
                    bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                    return;
                } catch (ClassNotFoundException | IllegalArgumentException unused) {
                    return;
                }
            } else {
                return;
            }
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: c */
    public final Bundle m28386c() {
        Bundle bundle = new Bundle();
        for (String key : this.f95038b.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                m28387b(key, bundle);
            } catch (JSONException e) {
                C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
                EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.CACHE;
                String str = f95035c;
                c2516a.m106216a(enumC36034Sx2, 5, str, "Error reading cached value for key: '" + key + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public /* synthetic */ C44130kp2(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }
}
