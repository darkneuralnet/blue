package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u001f2\u00020\u0001:\u0003\u0003\t\u000bB3\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006 "}, m28432d2 = {"LNX1;", "", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "b", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "imageUri", "LNX1$b;", "LNX1$b;", "()LNX1$b;", "callback", "", DateTokenConverter.CONVERTER_KEY, "Z", "getAllowCachedRedirects", "()Z", "allowCachedRedirects", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callerTag", "isCachedRedirectAllowed", "<init>", "(Landroid/content/Context;Landroid/net/Uri;LNX1$b;ZLjava/lang/Object;)V", "f", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: NX1 */
/* loaded from: classes5.dex */
public final class NX1 {

    /* renamed from: f */
    public static final C5602c f24741f = new C5602c(null);

    /* renamed from: a */
    public final Context f24742a;

    /* renamed from: b */
    public final Uri f24743b;

    /* renamed from: c */
    public final InterfaceC5601b f24744c;

    /* renamed from: d */
    public final boolean f24745d;

    /* renamed from: e */
    public final Object f24746e;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LNX1$a;", "", "LNX1$b;", "callback", "c", "callerTag", DateTokenConverter.CONVERTER_KEY, "", "allowCachedRedirects", "b", "LNX1;", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "LNX1$b;", "Z", "Ljava/lang/Object;", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "e", "Landroid/net/Uri;", "imageUri", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: NX1$a */
    /* loaded from: classes5.dex */
    public static final class C5600a {

        /* renamed from: a */
        public InterfaceC5601b f24747a;

        /* renamed from: b */
        public boolean f24748b;

        /* renamed from: c */
        public Object f24749c;

        /* renamed from: d */
        public final Context f24750d;

        /* renamed from: e */
        public final Uri f24751e;

        public C5600a(Context context, Uri imageUri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            this.f24750d = context;
            this.f24751e = imageUri;
        }

        /* renamed from: a */
        public final NX1 m93803a() {
            Context context = this.f24750d;
            Uri uri = this.f24751e;
            InterfaceC5601b interfaceC5601b = this.f24747a;
            boolean z = this.f24748b;
            Object obj = this.f24749c;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            return new NX1(context, uri, interfaceC5601b, z, obj, null);
        }

        /* renamed from: b */
        public final C5600a m93802b(boolean z) {
            this.f24748b = z;
            return this;
        }

        /* renamed from: c */
        public final C5600a m93801c(InterfaceC5601b interfaceC5601b) {
            this.f24747a = interfaceC5601b;
            return this;
        }

        /* renamed from: d */
        public final C5600a m93800d(Object obj) {
            this.f24749c = obj;
            return this;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5600a) {
                    C5600a c5600a = (C5600a) obj;
                    return Intrinsics.areEqual(this.f24750d, c5600a.f24750d) && Intrinsics.areEqual(this.f24751e, c5600a.f24751e);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Context context = this.f24750d;
            int hashCode = (context != null ? context.hashCode() : 0) * 31;
            Uri uri = this.f24751e;
            return hashCode + (uri != null ? uri.hashCode() : 0);
        }

        public String toString() {
            return "Builder(context=" + this.f24750d + ", imageUri=" + this.f24751e + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, m28432d2 = {"LNX1$b;", "", "LQX1;", "response", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: NX1$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC5601b {
        /* renamed from: a */
        void mo52436a(QX1 qx1);
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"LNX1$c;", "", "", "userId", "", "width", "height", "accessToken", "Landroid/net/Uri;", C17296a.f69688o, "ACCESS_TOKEN_PARAM", "Ljava/lang/String;", "HEIGHT_PARAM", "MIGRATION_PARAM", "MIGRATION_VALUE", "PATH", "UNSPECIFIED_DIMENSION", "I", "WIDTH_PARAM", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: NX1$c */
    /* loaded from: classes5.dex */
    public static final class C5602c {
        private C5602c() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Uri m93799a(String str, int i, int i2, String str2) {
            boolean z;
            C48817sj6.m13764n(str, "userId");
            int max = Math.max(i, 0);
            int max2 = Math.max(i2, 0);
            if (max == 0 && max2 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Uri.Builder buildUpon = Uri.parse(C53066zt5.m159f()).buildUpon();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{C17216a.m52729q(), str}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                Uri.Builder path = buildUpon.path(format);
                if (max2 != 0) {
                    path.appendQueryParameter("height", String.valueOf(max2));
                }
                if (max != 0) {
                    path.appendQueryParameter("width", String.valueOf(max));
                }
                path.appendQueryParameter("migration_overrides", "{october_2012:true}");
                if (!C52364yi6.m2860R(str2)) {
                    path.appendQueryParameter("access_token", str2);
                } else if (!C52364yi6.m2860R(C17216a.m52733m()) && !C52364yi6.m2860R(C17216a.m52740f())) {
                    path.appendQueryParameter("access_token", C17216a.m52740f() + "|" + C17216a.m52733m());
                } else {
                    Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
                }
                Uri build = path.build();
                Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
                return build;
            }
            throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
        }

        public /* synthetic */ C5602c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ NX1(Context context, Uri uri, InterfaceC5601b interfaceC5601b, boolean z, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, interfaceC5601b, z, obj);
    }

    @JvmStatic
    /* renamed from: d */
    public static final Uri m93805d(String str, int i, int i2, String str2) {
        return f24741f.m93799a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final InterfaceC5601b m93808a() {
        return this.f24744c;
    }

    /* renamed from: b */
    public final Object m93807b() {
        return this.f24746e;
    }

    /* renamed from: c */
    public final Uri m93806c() {
        return this.f24743b;
    }

    /* renamed from: e */
    public final boolean m93804e() {
        return this.f24745d;
    }

    public NX1(Context context, Uri uri, InterfaceC5601b interfaceC5601b, boolean z, Object obj) {
        this.f24742a = context;
        this.f24743b = uri;
        this.f24744c = interfaceC5601b;
        this.f24745d = z;
        this.f24746e = obj;
    }
}
