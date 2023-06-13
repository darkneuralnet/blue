package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016¨\u0006!"}, m28432d2 = {"LzP1;", "", "Landroid/graphics/drawable/Drawable;", C17296a.f69688o, "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "drawable", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setDrawableRes", "(Ljava/lang/Integer;)V", "drawableRes", "LBP1;", "c", "LBP1;", DateTokenConverter.CONVERTER_KEY, "()LBP1;", "iconGravity", "I", "g", "()I", "iconWidth", "e", "iconHeight", "f", "iconSpace", "iconColor", "LzP1$a;", "builder", "<init>", "(LzP1$a;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: zP1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52773zP1 {

    /* renamed from: a */
    public final Drawable f121296a;

    /* renamed from: b */
    public Integer f121297b;

    /* renamed from: c */
    public final BP1 f121298c;

    /* renamed from: d */
    public final int f121299d;

    /* renamed from: e */
    public final int f121300e;

    /* renamed from: f */
    public final int f121301f;

    /* renamed from: g */
    public final int f121302g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b5\u00106J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R.\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010,\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010/\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u00102\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R*\u00104\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b \u0010)\"\u0004\b3\u0010+¨\u00067"}, m28432d2 = {"LzP1$a;", "", "Landroid/graphics/drawable/Drawable;", "value", "i", "LBP1;", "j", "", "n", "l", "m", "k", "LzP1;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<set-?>", "b", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setDrawableRes", "(Ljava/lang/Integer;)V", "drawableRes", DateTokenConverter.CONVERTER_KEY, "LBP1;", "e", "()LBP1;", "setIconGravity", "(LBP1;)V", "iconGravity", "I", "h", "()I", "setIconWidth", "(I)V", "iconWidth", "f", "setIconHeight", "iconHeight", "g", "setIconSpace", "iconSpace", "setIconColor", "iconColor", "<init>", "(Landroid/content/Context;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: zP1$a */
    /* loaded from: classes6.dex */
    public static final class C30997a {

        /* renamed from: a */
        public final Context f121303a;

        /* renamed from: b */
        public Drawable f121304b;

        /* renamed from: c */
        public Integer f121305c;

        /* renamed from: d */
        public BP1 f121306d;

        /* renamed from: e */
        public int f121307e;

        /* renamed from: f */
        public int f121308f;

        /* renamed from: g */
        public int f121309g;

        /* renamed from: h */
        public int f121310h;

        public C30997a(Context context) {
            int roundToInt;
            int roundToInt2;
            int roundToInt3;
            Intrinsics.checkNotNullParameter(context, "context");
            this.f121303a = context;
            this.f121306d = BP1.START;
            float f = 28;
            roundToInt = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.f121307e = roundToInt;
            roundToInt2 = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.f121308f = roundToInt2;
            roundToInt3 = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.f121309g = roundToInt3;
            this.f121310h = -1;
        }

        /* renamed from: a */
        public final C52773zP1 m1405a() {
            return new C52773zP1(this, null);
        }

        /* renamed from: b */
        public final Drawable m1404b() {
            return this.f121304b;
        }

        /* renamed from: c */
        public final Integer m1403c() {
            return this.f121305c;
        }

        /* renamed from: d */
        public final int m1402d() {
            return this.f121310h;
        }

        /* renamed from: e */
        public final BP1 m1401e() {
            return this.f121306d;
        }

        /* renamed from: f */
        public final int m1400f() {
            return this.f121308f;
        }

        /* renamed from: g */
        public final int m1399g() {
            return this.f121309g;
        }

        /* renamed from: h */
        public final int m1398h() {
            return this.f121307e;
        }

        /* renamed from: i */
        public final C30997a m1397i(Drawable drawable) {
            this.f121304b = drawable;
            return this;
        }

        /* renamed from: j */
        public final C30997a m1396j(BP1 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f121306d = value;
            return this;
        }

        /* renamed from: k */
        public final C30997a m1395k(int i) {
            this.f121310h = i;
            return this;
        }

        /* renamed from: l */
        public final C30997a m1394l(int i) {
            this.f121308f = i;
            return this;
        }

        /* renamed from: m */
        public final C30997a m1393m(int i) {
            this.f121309g = i;
            return this;
        }

        /* renamed from: n */
        public final C30997a m1392n(int i) {
            this.f121307e = i;
            return this;
        }
    }

    public /* synthetic */ C52773zP1(C30997a c30997a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30997a);
    }

    /* renamed from: a */
    public final Drawable m1412a() {
        return this.f121296a;
    }

    /* renamed from: b */
    public final Integer m1411b() {
        return this.f121297b;
    }

    /* renamed from: c */
    public final int m1410c() {
        return this.f121302g;
    }

    /* renamed from: d */
    public final BP1 m1409d() {
        return this.f121298c;
    }

    /* renamed from: e */
    public final int m1408e() {
        return this.f121300e;
    }

    /* renamed from: f */
    public final int m1407f() {
        return this.f121301f;
    }

    /* renamed from: g */
    public final int m1406g() {
        return this.f121299d;
    }

    public C52773zP1(C30997a c30997a) {
        this.f121296a = c30997a.m1404b();
        this.f121297b = c30997a.m1403c();
        this.f121298c = c30997a.m1401e();
        this.f121299d = c30997a.m1398h();
        this.f121300e = c30997a.m1400f();
        this.f121301f = c30997a.m1399g();
        this.f121302g = c30997a.m1402d();
    }
}
