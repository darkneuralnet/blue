package p000;

import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u001d\u001e\u001f !\"B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006#"}, m28432d2 = {"LWY2;", "T", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "f", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", C17296a.f69688o, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/String;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "toString", "", "Z", "c", "()Z", "isNullableAllowed", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Z)V", "l", "m", "n", "o", "p", "q", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: WY2 */
/* loaded from: classes.dex */
public abstract class WY2<T> {

    /* renamed from: c */
    public static final C9095l f41270c = new C9095l(null);
    @JvmField

    /* renamed from: d */
    public static final WY2<Integer> f41271d = new C9089f();
    @JvmField

    /* renamed from: e */
    public static final WY2<Integer> f41272e = new C9092i();
    @JvmField

    /* renamed from: f */
    public static final WY2<int[]> f41273f = new C9088e();
    @JvmField

    /* renamed from: g */
    public static final WY2<Long> f41274g = new C9091h();
    @JvmField

    /* renamed from: h */
    public static final WY2<long[]> f41275h = new C9090g();
    @JvmField

    /* renamed from: i */
    public static final WY2<Float> f41276i = new C9087d();
    @JvmField

    /* renamed from: j */
    public static final WY2<float[]> f41277j = new C9086c();
    @JvmField

    /* renamed from: k */
    public static final WY2<Boolean> f41278k = new C9085b();
    @JvmField

    /* renamed from: l */
    public static final WY2<boolean[]> f41279l = new C9084a();
    @JvmField

    /* renamed from: m */
    public static final WY2<String> f41280m = new C9094k();
    @JvmField

    /* renamed from: n */
    public static final WY2<String[]> f41281n = new C9093j();

    /* renamed from: a */
    public final boolean f41282a;

    /* renamed from: b */
    public final String f41283b = "nav_type";

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"WY2$a", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$a */
    /* loaded from: classes.dex */
    public static final class C9084a extends WY2<boolean[]> {
        public C9084a() {
            super(true);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "boolean[]";
        }

        @Override // p000.WY2
        /* renamed from: g */
        public boolean[] mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public boolean[] mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, boolean[] zArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"WY2$b", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "h", "(Ljava/lang/String;)Ljava/lang/Boolean;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$b */
    /* loaded from: classes.dex */
    public static final class C9085b extends WY2<Boolean> {
        public C9085b() {
            super(false);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "boolean";
        }

        @Override // p000.WY2
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo78182f(Bundle bundle, String str, Boolean bool) {
            m78221i(bundle, str, bool.booleanValue());
        }

        @Override // p000.WY2
        /* renamed from: g */
        public Boolean mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public Boolean mo78183e(String value) {
            boolean z;
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "true")) {
                z = true;
            } else if (Intrinsics.areEqual(value, "false")) {
                z = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: i */
        public void m78221i(Bundle bundle, String key, boolean z) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBoolean(key, z);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"WY2$c", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$c */
    /* loaded from: classes.dex */
    public static final class C9086c extends WY2<float[]> {
        public C9086c() {
            super(true);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "float[]";
        }

        @Override // p000.WY2
        /* renamed from: g */
        public float[] mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public float[] mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, float[] fArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"WY2$d", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "h", "(Ljava/lang/String;)Ljava/lang/Float;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$d */
    /* loaded from: classes.dex */
    public static final class C9087d extends WY2<Float> {
        public C9087d() {
            super(false);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "float";
        }

        @Override // p000.WY2
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo78182f(Bundle bundle, String str, Float f) {
            m78215i(bundle, str, f.floatValue());
        }

        @Override // p000.WY2
        /* renamed from: g */
        public Float mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // p000.WY2
        /* renamed from: h */
        public Float mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        /* renamed from: i */
        public void m78215i(Bundle bundle, String key, float f) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloat(key, f);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"WY2$e", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$e */
    /* loaded from: classes.dex */
    public static final class C9088e extends WY2<int[]> {
        public C9088e() {
            super(true);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "integer[]";
        }

        @Override // p000.WY2
        /* renamed from: g */
        public int[] mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public int[] mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, int[] iArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putIntArray(key, iArr);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"WY2$f", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "h", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$f */
    /* loaded from: classes.dex */
    public static final class C9089f extends WY2<Integer> {
        public C9089f() {
            super(false);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "integer";
        }

        @Override // p000.WY2
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo78182f(Bundle bundle, String str, Integer num) {
            m78209i(bundle, str, num.intValue());
        }

        @Override // p000.WY2
        /* renamed from: g */
        public Integer mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // p000.WY2
        /* renamed from: h */
        public Integer mo78183e(String value) {
            boolean startsWith$default;
            int parseInt;
            int checkRadix;
            Intrinsics.checkNotNullParameter(value, "value");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null);
            if (startsWith$default) {
                String substring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                checkRadix = CharsKt__CharJVMKt.checkRadix(16);
                parseInt = Integer.parseInt(substring, checkRadix);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        /* renamed from: i */
        public void m78209i(Bundle bundle, String key, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"WY2$g", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$g */
    /* loaded from: classes.dex */
    public static final class C9090g extends WY2<long[]> {
        public C9090g() {
            super(true);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "long[]";
        }

        @Override // p000.WY2
        /* renamed from: g */
        public long[] mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public long[] mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, long[] jArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLongArray(key, jArr);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"WY2$h", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "h", "(Ljava/lang/String;)Ljava/lang/Long;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$h */
    /* loaded from: classes.dex */
    public static final class C9091h extends WY2<Long> {
        public C9091h() {
            super(false);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "long";
        }

        @Override // p000.WY2
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo78182f(Bundle bundle, String str, Long l) {
            m78203i(bundle, str, l.longValue());
        }

        @Override // p000.WY2
        /* renamed from: g */
        public Long mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // p000.WY2
        /* renamed from: h */
        public Long mo78183e(String value) {
            boolean endsWith$default;
            String str;
            boolean startsWith$default;
            long parseLong;
            int checkRadix;
            Intrinsics.checkNotNullParameter(value, "value");
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(value, "L", false, 2, null);
            if (endsWith$default) {
                str = value.substring(0, value.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = value;
            }
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null);
            if (startsWith$default) {
                String substring = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                checkRadix = CharsKt__CharJVMKt.checkRadix(16);
                parseLong = Long.parseLong(substring, checkRadix);
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        /* renamed from: i */
        public void m78203i(Bundle bundle, String key, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLong(key, j);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"WY2$i", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "h", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$i */
    /* loaded from: classes.dex */
    public static final class C9092i extends WY2<Integer> {
        public C9092i() {
            super(false);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "reference";
        }

        @Override // p000.WY2
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo78182f(Bundle bundle, String str, Integer num) {
            m78200i(bundle, str, num.intValue());
        }

        @Override // p000.WY2
        /* renamed from: g */
        public Integer mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // p000.WY2
        /* renamed from: h */
        public Integer mo78183e(String value) {
            boolean startsWith$default;
            int parseInt;
            int checkRadix;
            Intrinsics.checkNotNullParameter(value, "value");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null);
            if (startsWith$default) {
                String substring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                checkRadix = CharsKt__CharJVMKt.checkRadix(16);
                parseInt = Integer.parseInt(substring, checkRadix);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        /* renamed from: i */
        public void m78200i(Bundle bundle, String key, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"WY2$j", "LWY2;", "", "", "Landroid/os/Bundle;", "bundle", "key", "value", "", "i", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "h", "(Ljava/lang/String;)[Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$j */
    /* loaded from: classes.dex */
    public static final class C9093j extends WY2<String[]> {
        public C9093j() {
            super(true);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "string[]";
        }

        @Override // p000.WY2
        /* renamed from: g */
        public String[] mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public String[] mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, String[] strArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putStringArray(key, strArr);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"WY2$k", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "key", "value", "", "i", "g", "h", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$k */
    /* loaded from: classes.dex */
    public static final class C9094k extends WY2<String> {
        public C9094k() {
            super(true);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            return "string";
        }

        @Override // p000.WY2
        /* renamed from: g */
        public String mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public String mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putString(key, str);
        }
    }

    @Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007¨\u0006\u001d"}, m28432d2 = {"LWY2$l;", "", "value", "LWY2;", C17296a.f69688o, "", "BoolArrayType", "LWY2;", "", "BoolType", "", "FloatArrayType", "", "FloatType", "", "IntArrayType", "", "IntType", "", "LongArrayType", "", "LongType", "ReferenceType", "", "", "StringArrayType", "StringType", "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$l */
    /* loaded from: classes.dex */
    public static final class C9095l {
        public /* synthetic */ C9095l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WY2<Object> m78193a(Object obj) {
            WY2<Object> c9100q;
            if (obj instanceof Integer) {
                return WY2.f41271d;
            }
            if (obj instanceof int[]) {
                return WY2.f41273f;
            }
            if (obj instanceof Long) {
                return WY2.f41274g;
            }
            if (obj instanceof long[]) {
                return WY2.f41275h;
            }
            if (obj instanceof Float) {
                return WY2.f41276i;
            }
            if (obj instanceof float[]) {
                return WY2.f41277j;
            }
            if (obj instanceof Boolean) {
                return WY2.f41278k;
            }
            if (obj instanceof boolean[]) {
                return WY2.f41279l;
            }
            if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    return WY2.f41281n;
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        if (componentType2 != null) {
                            c9100q = new C9097n<>(componentType2);
                            return c9100q;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        if (componentType4 != null) {
                            c9100q = new C9099p<>(componentType4);
                            return c9100q;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    }
                }
                if (obj instanceof Parcelable) {
                    c9100q = new C9098o<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    c9100q = new C9096m<>(obj.getClass());
                } else if (obj instanceof Serializable) {
                    c9100q = new C9100q<>(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return c9100q;
            }
            return WY2.f41280m;
        }

        private C9095l() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LWY2$m;", "", "D", "LWY2$q;", "", "value", "j", "(Ljava/lang/String;)Ljava/lang/Enum;", "Ljava/lang/Class;", "p", "Ljava/lang/Class;", "type", "b", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$m */
    /* loaded from: classes.dex */
    public static final class C9096m<D extends Enum<?>> extends C9100q<D> {

        /* renamed from: p */
        public final Class<D> f41284p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9096m(Class<D> type) {
            super(false, type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.f41284p = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // p000.WY2.C9100q, p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            String name = this.f41284p.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // p000.WY2.C9100q
        /* renamed from: j */
        public D mo78180h(String value) {
            D d;
            boolean equals;
            Intrinsics.checkNotNullParameter(value, "value");
            D[] enumConstants = this.f41284p.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    d = enumConstants[i];
                    equals = StringsKt__StringsJVMKt.equals(d.name(), value, true);
                    if (equals) {
                        break;
                    }
                    i++;
                } else {
                    d = null;
                    break;
                }
            }
            D d2 = d;
            if (d2 != null) {
                return d2;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f41284p.getName() + CoreConstants.DOT);
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001f\u0010 J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m28432d2 = {"LWY2$n;", "Landroid/os/Parcelable;", "D", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "h", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$n */
    /* loaded from: classes.dex */
    public static final class C9097n<D extends Parcelable> extends WY2<D[]> {

        /* renamed from: o */
        public final Class<D[]> f41285o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9097n(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Parcelable.class.isAssignableFrom(type)) {
                try {
                    this.f41285o = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                    return;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            String name = this.f41285o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Intrinsics.areEqual(C9097n.class, obj.getClass())) {
                return Intrinsics.areEqual(this.f41285o, ((C9097n) obj).f41285o);
            }
            return false;
        }

        @Override // p000.WY2
        /* renamed from: g */
        public D[] mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // p000.WY2
        /* renamed from: h */
        public D[] mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f41285o.hashCode();
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, D[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f41285o.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LWY2$o;", "D", "LWY2;", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "f", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", C17296a.f69688o, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "type", "b", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$o */
    /* loaded from: classes.dex */
    public static final class C9098o<D> extends WY2<D> {

        /* renamed from: o */
        public final Class<D> f41286o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9098o(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z = true;
            if (!Parcelable.class.isAssignableFrom(type) && !Serializable.class.isAssignableFrom(type)) {
                z = false;
            }
            if (z) {
                this.f41286o = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // p000.WY2
        /* renamed from: a */
        public D mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            String name = this.f41286o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // p000.WY2
        /* renamed from: e */
        public D mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Intrinsics.areEqual(C9098o.class, obj.getClass())) {
                return Intrinsics.areEqual(this.f41286o, ((C9098o) obj).f41286o);
            }
            return false;
        }

        @Override // p000.WY2
        /* renamed from: f */
        public void mo78182f(Bundle bundle, String key, D d) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f41286o.cast(d);
            if (d != null && !(d instanceof Parcelable)) {
                if (d instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) d);
                    return;
                }
                return;
            }
            bundle.putParcelable(key, (Parcelable) d);
        }

        public int hashCode() {
            return this.f41286o.hashCode();
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001f\u0010 J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m28432d2 = {"LWY2$p;", "Ljava/io/Serializable;", "D", "LWY2;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "h", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$p */
    /* loaded from: classes.dex */
    public static final class C9099p<D extends Serializable> extends WY2<D[]> {

        /* renamed from: o */
        public final Class<D[]> f41287o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9099p(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                try {
                    this.f41287o = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                    return;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            String name = this.f41287o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Intrinsics.areEqual(C9099p.class, obj.getClass())) {
                return Intrinsics.areEqual(this.f41287o, ((C9099p) obj).f41287o);
            }
            return false;
        }

        @Override // p000.WY2
        /* renamed from: g */
        public D[] mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // p000.WY2
        /* renamed from: h */
        public D[] mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f41287o.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, D[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f41287o.cast(dArr);
            bundle.putSerializable(key, dArr);
        }
    }

    public WY2(boolean z) {
        this.f41282a = z;
    }

    /* renamed from: a */
    public abstract T mo78185a(Bundle bundle, String str);

    /* renamed from: b */
    public abstract String mo78184b();

    /* renamed from: c */
    public boolean m78228c() {
        return this.f41282a;
    }

    /* renamed from: d */
    public final T m78227d(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        T mo78183e = mo78183e(value);
        mo78182f(bundle, key, mo78183e);
        return mo78183e;
    }

    /* renamed from: e */
    public abstract T mo78183e(String str);

    /* renamed from: f */
    public abstract void mo78182f(Bundle bundle, String str, T t);

    public String toString() {
        return mo78184b();
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u001eB\u001f\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001d\u0010 J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"LWY2$q;", "Ljava/io/Serializable;", "D", "LWY2;", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "i", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "h", "(Ljava/lang/String;)Ljava/io/Serializable;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Ljava/lang/Class;", "o", "Ljava/lang/Class;", "type", "b", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "nullableAllowed", "(ZLjava/lang/Class;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: WY2$q */
    /* loaded from: classes.dex */
    public static class C9100q<D extends Serializable> extends WY2<D> {

        /* renamed from: o */
        public final Class<D> f41288o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9100q(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                if (true ^ type.isEnum()) {
                    this.f41288o = type;
                    return;
                }
                throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // p000.WY2
        /* renamed from: b */
        public String mo78184b() {
            String name = this.f41288o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9100q)) {
                return false;
            }
            return Intrinsics.areEqual(this.f41288o, ((C9100q) obj).f41288o);
        }

        @Override // p000.WY2
        /* renamed from: g */
        public D mo78185a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D) bundle.get(key);
        }

        @Override // p000.WY2
        /* renamed from: h */
        public D mo78183e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public int hashCode() {
            return this.f41288o.hashCode();
        }

        @Override // p000.WY2
        /* renamed from: i */
        public void mo78182f(Bundle bundle, String key, D value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f41288o.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9100q(boolean z, Class<D> type) {
            super(z);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f41288o = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
