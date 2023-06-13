package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000.C49785uM4;
/* renamed from: Ci */
/* loaded from: classes.dex */
public class C1131Ci {

    /* renamed from: a */
    public final TextView f4496a;

    /* renamed from: b */
    public X46 f4497b;

    /* renamed from: c */
    public X46 f4498c;

    /* renamed from: d */
    public X46 f4499d;

    /* renamed from: e */
    public X46 f4500e;

    /* renamed from: f */
    public X46 f4501f;

    /* renamed from: g */
    public X46 f4502g;

    /* renamed from: h */
    public X46 f4503h;

    /* renamed from: i */
    public final C3736Ii f4504i;

    /* renamed from: j */
    public int f4505j = 0;

    /* renamed from: k */
    public int f4506k = -1;

    /* renamed from: l */
    public Typeface f4507l;

    /* renamed from: m */
    public boolean f4508m;

    /* renamed from: Ci$a */
    /* loaded from: classes.dex */
    public class C1132a extends C49785uM4.AbstractC29183e {

        /* renamed from: a */
        public final /* synthetic */ int f4509a;

        /* renamed from: b */
        public final /* synthetic */ int f4510b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f4511c;

        public C1132a(int i, int i2, WeakReference weakReference) {
            this.f4509a = i;
            this.f4510b = i2;
            this.f4511c = weakReference;
        }

        @Override // p000.C49785uM4.AbstractC29183e
        /* renamed from: h */
        public void mo10376h(int i) {
        }

        @Override // p000.C49785uM4.AbstractC29183e
        /* renamed from: i */
        public void mo10375i(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f4509a) != -1) {
                if ((this.f4510b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C1137f.m111831a(typeface, i, z);
            }
            C1131Ci.this.m111853n(this.f4511c, typeface);
        }
    }

    /* renamed from: Ci$b */
    /* loaded from: classes.dex */
    public class RunnableC1133b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ TextView f4513b;

        /* renamed from: c */
        public final /* synthetic */ Typeface f4514c;

        /* renamed from: d */
        public final /* synthetic */ int f4515d;

        public RunnableC1133b(TextView textView, Typeface typeface, int i) {
            this.f4513b = textView;
            this.f4514c = typeface;
            this.f4515d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4513b.setTypeface(this.f4514c, this.f4515d);
        }
    }

    /* renamed from: Ci$c */
    /* loaded from: classes.dex */
    public static class C1134c {
        private C1134c() {
        }

        /* renamed from: a */
        public static Drawable[] m111840a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static void m111839b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public static void m111838c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: Ci$d */
    /* loaded from: classes.dex */
    public static class C1135d {
        private C1135d() {
        }

        /* renamed from: a */
        public static LocaleList m111837a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        public static void m111836b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: Ci$e */
    /* loaded from: classes.dex */
    public static class C1136e {
        private C1136e() {
        }

        /* renamed from: a */
        public static int m111835a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        /* renamed from: b */
        public static void m111834b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        public static void m111833c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        public static boolean m111832d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* renamed from: Ci$f */
    /* loaded from: classes.dex */
    public static class C1137f {
        private C1137f() {
        }

        /* renamed from: a */
        public static Typeface m111831a(Typeface typeface, int i, boolean z) {
            Typeface create;
            create = Typeface.create(typeface, i, z);
            return create;
        }
    }

    public C1131Ci(TextView textView) {
        this.f4496a = textView;
        this.f4504i = new C3736Ii(textView);
    }

    /* renamed from: d */
    public static X46 m111863d(Context context, C27043oi c27043oi, int i) {
        ColorStateList m20607f = c27043oi.m20607f(context, i);
        if (m20607f != null) {
            X46 x46 = new X46();
            x46.f42623d = true;
            x46.f42620a = m20607f;
            return x46;
        }
        return null;
    }

    /* renamed from: A */
    public void m111869A(int i, float f) {
        if (!C37406Yt6.f47599b && !m111855l()) {
            m111868B(i, f);
        }
    }

    /* renamed from: B */
    public final void m111868B(int i, float f) {
        this.f4504i.m101773t(i, f);
    }

    /* renamed from: C */
    public final void m111867C(Context context, Z46 z46) {
        String m73754o;
        boolean z;
        boolean z2;
        this.f4505j = z46.m73758k(C43509jm4.TextAppearance_android_textStyle, this.f4505j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int m73758k = z46.m73758k(C43509jm4.TextAppearance_android_textFontWeight, -1);
            this.f4506k = m73758k;
            if (m73758k != -1) {
                this.f4505j = (this.f4505j & 2) | 0;
            }
        }
        int i2 = C43509jm4.TextAppearance_android_fontFamily;
        if (!z46.m73750s(i2) && !z46.m73750s(C43509jm4.TextAppearance_fontFamily)) {
            int i3 = C43509jm4.TextAppearance_android_typeface;
            if (z46.m73750s(i3)) {
                this.f4508m = false;
                int m73758k2 = z46.m73758k(i3, 1);
                if (m73758k2 != 1) {
                    if (m73758k2 != 2) {
                        if (m73758k2 == 3) {
                            this.f4507l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f4507l = Typeface.SERIF;
                    return;
                }
                this.f4507l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f4507l = null;
        int i4 = C43509jm4.TextAppearance_fontFamily;
        if (z46.m73750s(i4)) {
            i2 = i4;
        }
        int i5 = this.f4506k;
        int i6 = this.f4505j;
        if (!context.isRestricted()) {
            try {
                Typeface m73759j = z46.m73759j(i2, this.f4505j, new C1132a(i5, i6, new WeakReference(this.f4496a)));
                if (m73759j != null) {
                    if (i >= 28 && this.f4506k != -1) {
                        Typeface create = Typeface.create(m73759j, 0);
                        int i7 = this.f4506k;
                        if ((this.f4505j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f4507l = C1137f.m111831a(create, i7, z2);
                    } else {
                        this.f4507l = m73759j;
                    }
                }
                if (this.f4507l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f4508m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4507l == null && (m73754o = z46.m73754o(i2)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f4506k != -1) {
                Typeface create2 = Typeface.create(m73754o, 0);
                int i8 = this.f4506k;
                if ((this.f4505j & 2) != 0) {
                    z3 = true;
                }
                this.f4507l = C1137f.m111831a(create2, i8, z3);
                return;
            }
            this.f4507l = Typeface.create(m73754o, this.f4505j);
        }
    }

    /* renamed from: a */
    public final void m111866a(Drawable drawable, X46 x46) {
        if (drawable == null || x46 == null) {
            return;
        }
        C27043oi.m20604i(drawable, x46, this.f4496a.getDrawableState());
    }

    /* renamed from: b */
    public void m111865b() {
        if (this.f4497b != null || this.f4498c != null || this.f4499d != null || this.f4500e != null) {
            Drawable[] compoundDrawables = this.f4496a.getCompoundDrawables();
            m111866a(compoundDrawables[0], this.f4497b);
            m111866a(compoundDrawables[1], this.f4498c);
            m111866a(compoundDrawables[2], this.f4499d);
            m111866a(compoundDrawables[3], this.f4500e);
        }
        if (this.f4501f != null || this.f4502g != null) {
            Drawable[] m111840a = C1134c.m111840a(this.f4496a);
            m111866a(m111840a[0], this.f4501f);
            m111866a(m111840a[2], this.f4502g);
        }
    }

    /* renamed from: c */
    public void m111864c() {
        this.f4504i.m101792a();
    }

    /* renamed from: e */
    public int m111862e() {
        return this.f4504i.m101787f();
    }

    /* renamed from: f */
    public int m111861f() {
        return this.f4504i.m101786g();
    }

    /* renamed from: g */
    public int m111860g() {
        return this.f4504i.m101785h();
    }

    /* renamed from: h */
    public int[] m111859h() {
        return this.f4504i.m101784i();
    }

    /* renamed from: i */
    public int m111858i() {
        return this.f4504i.m101783j();
    }

    /* renamed from: j */
    public ColorStateList m111857j() {
        X46 x46 = this.f4503h;
        if (x46 != null) {
            return x46.f42620a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m111856k() {
        X46 x46 = this.f4503h;
        if (x46 != null) {
            return x46.f42621b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m111855l() {
        return this.f4504i.m101779n();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f2  */
    @SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m111854m(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        int i2;
        Typeface typeface;
        Z46 m73748u;
        int m73755n;
        Drawable drawable;
        int m73755n2;
        Drawable drawable2;
        int m73755n3;
        Drawable drawable3;
        int m73755n4;
        Drawable drawable4;
        int m73755n5;
        Drawable drawable5;
        int m73755n6;
        Drawable drawable6;
        int i3;
        int i4;
        int m73763f;
        int m73763f2;
        int m73763f3;
        int[] m101784i;
        int i5;
        Context context = this.f4496a.getContext();
        C27043oi m20611b = C27043oi.m20611b();
        int[] iArr = C43509jm4.AppCompatTextHelper;
        Z46 m73747v = Z46.m73747v(context, attributeSet, iArr, i, 0);
        TextView textView = this.f4496a;
        C38790bq6.m62456t0(textView, textView.getContext(), iArr, attributeSet, m73747v.m73751r(), i, 0);
        int m73755n7 = m73747v.m73755n(C43509jm4.AppCompatTextHelper_android_textAppearance, -1);
        int i6 = C43509jm4.AppCompatTextHelper_android_drawableLeft;
        if (m73747v.m73750s(i6)) {
            this.f4497b = m111863d(context, m20611b, m73747v.m73755n(i6, 0));
        }
        int i7 = C43509jm4.AppCompatTextHelper_android_drawableTop;
        if (m73747v.m73750s(i7)) {
            this.f4498c = m111863d(context, m20611b, m73747v.m73755n(i7, 0));
        }
        int i8 = C43509jm4.AppCompatTextHelper_android_drawableRight;
        if (m73747v.m73750s(i8)) {
            this.f4499d = m111863d(context, m20611b, m73747v.m73755n(i8, 0));
        }
        int i9 = C43509jm4.AppCompatTextHelper_android_drawableBottom;
        if (m73747v.m73750s(i9)) {
            this.f4500e = m111863d(context, m20611b, m73747v.m73755n(i9, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        int i11 = C43509jm4.AppCompatTextHelper_android_drawableStart;
        if (m73747v.m73750s(i11)) {
            this.f4501f = m111863d(context, m20611b, m73747v.m73755n(i11, 0));
        }
        int i12 = C43509jm4.AppCompatTextHelper_android_drawableEnd;
        if (m73747v.m73750s(i12)) {
            this.f4502g = m111863d(context, m20611b, m73747v.m73755n(i12, 0));
        }
        m73747v.m73746w();
        boolean z4 = this.f4496a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m73755n7 != -1) {
            Z46 m73749t = Z46.m73749t(context, m73755n7, C43509jm4.TextAppearance);
            if (!z4) {
                int i13 = C43509jm4.TextAppearance_textAllCaps;
                if (m73749t.m73750s(i13)) {
                    z = m73749t.m73768a(i13, false);
                    z2 = true;
                    m111867C(context, m73749t);
                    i5 = C43509jm4.TextAppearance_textLocale;
                    if (!m73749t.m73750s(i5)) {
                        str2 = m73749t.m73754o(i5);
                    } else {
                        str2 = null;
                    }
                    if (i10 >= 26) {
                        int i14 = C43509jm4.TextAppearance_fontVariationSettings;
                        if (m73749t.m73750s(i14)) {
                            str = m73749t.m73754o(i14);
                            m73749t.m73746w();
                        }
                    }
                    str = null;
                    m73749t.m73746w();
                }
            }
            z = false;
            z2 = false;
            m111867C(context, m73749t);
            i5 = C43509jm4.TextAppearance_textLocale;
            if (!m73749t.m73750s(i5)) {
            }
            if (i10 >= 26) {
            }
            str = null;
            m73749t.m73746w();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        Z46 m73747v2 = Z46.m73747v(context, attributeSet, C43509jm4.TextAppearance, i, 0);
        if (!z4) {
            int i15 = C43509jm4.TextAppearance_textAllCaps;
            if (m73747v2.m73750s(i15)) {
                z = m73747v2.m73768a(i15, false);
                z3 = true;
                i2 = C43509jm4.TextAppearance_textLocale;
                if (m73747v2.m73750s(i2)) {
                    str2 = m73747v2.m73754o(i2);
                }
                if (i10 >= 26) {
                    int i16 = C43509jm4.TextAppearance_fontVariationSettings;
                    if (m73747v2.m73750s(i16)) {
                        str = m73747v2.m73754o(i16);
                    }
                }
                if (i10 >= 28) {
                    int i17 = C43509jm4.TextAppearance_android_textSize;
                    if (m73747v2.m73750s(i17) && m73747v2.m73763f(i17, -1) == 0) {
                        this.f4496a.setTextSize(0, 0.0f);
                    }
                }
                m111867C(context, m73747v2);
                m73747v2.m73746w();
                if (!z4 && z3) {
                    m111848s(z);
                }
                typeface = this.f4507l;
                if (typeface != null) {
                    if (this.f4506k == -1) {
                        this.f4496a.setTypeface(typeface, this.f4505j);
                    } else {
                        this.f4496a.setTypeface(typeface);
                    }
                }
                if (str != null) {
                    C1136e.m111832d(this.f4496a, str);
                }
                if (str2 != null) {
                    C1135d.m111836b(this.f4496a, C1135d.m111837a(str2));
                }
                this.f4504i.m101778o(attributeSet, i);
                if (C37406Yt6.f47599b && this.f4504i.m101783j() != 0) {
                    m101784i = this.f4504i.m101784i();
                    if (m101784i.length > 0) {
                        if (C1136e.m111835a(this.f4496a) != -1.0f) {
                            C1136e.m111834b(this.f4496a, this.f4504i.m101786g(), this.f4504i.m101787f(), this.f4504i.m101785h(), 0);
                        } else {
                            C1136e.m111833c(this.f4496a, m101784i, 0);
                        }
                    }
                }
                m73748u = Z46.m73748u(context, attributeSet, C43509jm4.AppCompatTextView);
                m73755n = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableLeftCompat, -1);
                if (m73755n == -1) {
                    drawable = m20611b.m20610c(context, m73755n);
                } else {
                    drawable = null;
                }
                m73755n2 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableTopCompat, -1);
                if (m73755n2 == -1) {
                    drawable2 = m20611b.m20610c(context, m73755n2);
                } else {
                    drawable2 = null;
                }
                m73755n3 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableRightCompat, -1);
                if (m73755n3 == -1) {
                    drawable3 = m20611b.m20610c(context, m73755n3);
                } else {
                    drawable3 = null;
                }
                m73755n4 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableBottomCompat, -1);
                if (m73755n4 == -1) {
                    drawable4 = m20611b.m20610c(context, m73755n4);
                } else {
                    drawable4 = null;
                }
                m73755n5 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableStartCompat, -1);
                if (m73755n5 == -1) {
                    drawable5 = m20611b.m20610c(context, m73755n5);
                } else {
                    drawable5 = null;
                }
                m73755n6 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableEndCompat, -1);
                if (m73755n6 == -1) {
                    drawable6 = m20611b.m20610c(context, m73755n6);
                } else {
                    drawable6 = null;
                }
                m111842y(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
                i3 = C43509jm4.AppCompatTextView_drawableTint;
                if (m73748u.m73750s(i3)) {
                    Q26.m89068h(this.f4496a, m73748u.m73766c(i3));
                }
                i4 = C43509jm4.AppCompatTextView_drawableTintMode;
                if (m73748u.m73750s(i4)) {
                    Q26.m89067i(this.f4496a, C39565d71.m44598e(m73748u.m73758k(i4, -1), null));
                }
                m73763f = m73748u.m73763f(C43509jm4.AppCompatTextView_firstBaselineToTopHeight, -1);
                m73763f2 = m73748u.m73763f(C43509jm4.AppCompatTextView_lastBaselineToBottomHeight, -1);
                m73763f3 = m73748u.m73763f(C43509jm4.AppCompatTextView_lineHeight, -1);
                m73748u.m73746w();
                if (m73763f != -1) {
                    Q26.m89065k(this.f4496a, m73763f);
                }
                if (m73763f2 != -1) {
                    Q26.m89064l(this.f4496a, m73763f2);
                }
                if (m73763f3 == -1) {
                    Q26.m89063m(this.f4496a, m73763f3);
                    return;
                }
                return;
            }
        }
        z3 = z2;
        i2 = C43509jm4.TextAppearance_textLocale;
        if (m73747v2.m73750s(i2)) {
        }
        if (i10 >= 26) {
        }
        if (i10 >= 28) {
        }
        m111867C(context, m73747v2);
        m73747v2.m73746w();
        if (!z4) {
            m111848s(z);
        }
        typeface = this.f4507l;
        if (typeface != null) {
        }
        if (str != null) {
        }
        if (str2 != null) {
        }
        this.f4504i.m101778o(attributeSet, i);
        if (C37406Yt6.f47599b) {
            m101784i = this.f4504i.m101784i();
            if (m101784i.length > 0) {
            }
        }
        m73748u = Z46.m73748u(context, attributeSet, C43509jm4.AppCompatTextView);
        m73755n = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableLeftCompat, -1);
        if (m73755n == -1) {
        }
        m73755n2 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableTopCompat, -1);
        if (m73755n2 == -1) {
        }
        m73755n3 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableRightCompat, -1);
        if (m73755n3 == -1) {
        }
        m73755n4 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableBottomCompat, -1);
        if (m73755n4 == -1) {
        }
        m73755n5 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableStartCompat, -1);
        if (m73755n5 == -1) {
        }
        m73755n6 = m73748u.m73755n(C43509jm4.AppCompatTextView_drawableEndCompat, -1);
        if (m73755n6 == -1) {
        }
        m111842y(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
        i3 = C43509jm4.AppCompatTextView_drawableTint;
        if (m73748u.m73750s(i3)) {
        }
        i4 = C43509jm4.AppCompatTextView_drawableTintMode;
        if (m73748u.m73750s(i4)) {
        }
        m73763f = m73748u.m73763f(C43509jm4.AppCompatTextView_firstBaselineToTopHeight, -1);
        m73763f2 = m73748u.m73763f(C43509jm4.AppCompatTextView_lastBaselineToBottomHeight, -1);
        m73763f3 = m73748u.m73763f(C43509jm4.AppCompatTextView_lineHeight, -1);
        m73748u.m73746w();
        if (m73763f != -1) {
        }
        if (m73763f2 != -1) {
        }
        if (m73763f3 == -1) {
        }
    }

    /* renamed from: n */
    public void m111853n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f4508m) {
            this.f4507l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C38790bq6.m62506Y(textView)) {
                    textView.post(new RunnableC1133b(textView, typeface, this.f4505j));
                } else {
                    textView.setTypeface(typeface, this.f4505j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m111852o(boolean z, int i, int i2, int i3, int i4) {
        if (!C37406Yt6.f47599b) {
            m111864c();
        }
    }

    /* renamed from: p */
    public void m111851p() {
        m111865b();
    }

    /* renamed from: q */
    public void m111850q(Context context, int i) {
        String m73754o;
        Z46 m73749t = Z46.m73749t(context, i, C43509jm4.TextAppearance);
        int i2 = C43509jm4.TextAppearance_textAllCaps;
        if (m73749t.m73750s(i2)) {
            m111848s(m73749t.m73768a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = C43509jm4.TextAppearance_android_textSize;
        if (m73749t.m73750s(i4) && m73749t.m73763f(i4, -1) == 0) {
            this.f4496a.setTextSize(0, 0.0f);
        }
        m111867C(context, m73749t);
        if (i3 >= 26) {
            int i5 = C43509jm4.TextAppearance_fontVariationSettings;
            if (m73749t.m73750s(i5) && (m73754o = m73749t.m73754o(i5)) != null) {
                C1136e.m111832d(this.f4496a, m73754o);
            }
        }
        m73749t.m73746w();
        Typeface typeface = this.f4507l;
        if (typeface != null) {
            this.f4496a.setTypeface(typeface, this.f4505j);
        }
    }

    /* renamed from: r */
    public void m111849r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            X91.m77281f(editorInfo, textView.getText());
        }
    }

    /* renamed from: s */
    public void m111848s(boolean z) {
        this.f4496a.setAllCaps(z);
    }

    /* renamed from: t */
    public void m111847t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f4504i.m101777p(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void m111846u(int[] iArr, int i) throws IllegalArgumentException {
        this.f4504i.m101776q(iArr, i);
    }

    /* renamed from: v */
    public void m111845v(int i) {
        this.f4504i.m101775r(i);
    }

    /* renamed from: w */
    public void m111844w(ColorStateList colorStateList) {
        boolean z;
        if (this.f4503h == null) {
            this.f4503h = new X46();
        }
        X46 x46 = this.f4503h;
        x46.f42620a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        x46.f42623d = z;
        m111841z();
    }

    /* renamed from: x */
    public void m111843x(PorterDuff.Mode mode) {
        boolean z;
        if (this.f4503h == null) {
            this.f4503h = new X46();
        }
        X46 x46 = this.f4503h;
        x46.f42621b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        x46.f42622c = z;
        m111841z();
    }

    /* renamed from: y */
    public final void m111842y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] m111840a = C1134c.m111840a(this.f4496a);
                Drawable drawable7 = m111840a[0];
                if (drawable7 == null && m111840a[2] == null) {
                    Drawable[] compoundDrawables = this.f4496a.getCompoundDrawables();
                    TextView textView = this.f4496a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.f4496a;
                if (drawable2 == null) {
                    drawable2 = m111840a[1];
                }
                Drawable drawable8 = m111840a[2];
                if (drawable4 == null) {
                    drawable4 = m111840a[3];
                }
                C1134c.m111839b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] m111840a2 = C1134c.m111840a(this.f4496a);
        TextView textView3 = this.f4496a;
        if (drawable5 == null) {
            drawable5 = m111840a2[0];
        }
        if (drawable2 == null) {
            drawable2 = m111840a2[1];
        }
        if (drawable6 == null) {
            drawable6 = m111840a2[2];
        }
        if (drawable4 == null) {
            drawable4 = m111840a2[3];
        }
        C1134c.m111839b(textView3, drawable5, drawable2, drawable6, drawable4);
    }

    /* renamed from: z */
    public final void m111841z() {
        X46 x46 = this.f4503h;
        this.f4497b = x46;
        this.f4498c = x46;
        this.f4499d = x46;
        this.f4500e = x46;
        this.f4501f = x46;
        this.f4502g = x46;
    }
}
