package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: Ii */
/* loaded from: classes.dex */
public class C3736Ii {

    /* renamed from: l */
    public static final RectF f16086l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f16087m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    public static ConcurrentHashMap<String, Field> f16088n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f16089a = 0;

    /* renamed from: b */
    public boolean f16090b = false;

    /* renamed from: c */
    public float f16091c = -1.0f;

    /* renamed from: d */
    public float f16092d = -1.0f;

    /* renamed from: e */
    public float f16093e = -1.0f;

    /* renamed from: f */
    public int[] f16094f = new int[0];

    /* renamed from: g */
    public boolean f16095g = false;

    /* renamed from: h */
    public TextPaint f16096h;

    /* renamed from: i */
    public final TextView f16097i;

    /* renamed from: j */
    public final Context f16098j;

    /* renamed from: k */
    public final C3742f f16099k;

    /* renamed from: Ii$a */
    /* loaded from: classes.dex */
    public static final class C3737a {
        private C3737a() {
        }

        /* renamed from: a */
        public static StaticLayout m101766a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        public static int m101765b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: Ii$b */
    /* loaded from: classes.dex */
    public static final class C3738b {
        private C3738b() {
        }

        /* renamed from: a */
        public static boolean m101764a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: Ii$c */
    /* loaded from: classes.dex */
    public static final class C3739c {
        private C3739c() {
        }

        /* renamed from: a */
        public static StaticLayout m101763a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C3742f c3742f) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c3742f.mo101762a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: Ii$d */
    /* loaded from: classes.dex */
    public static class C3740d extends C3742f {
        @Override // p000.C3736Ii.C3742f
        /* renamed from: a */
        public void mo101762a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C3736Ii.m101780m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: Ii$e */
    /* loaded from: classes.dex */
    public static class C3741e extends C3740d {
        @Override // p000.C3736Ii.C3740d, p000.C3736Ii.C3742f
        /* renamed from: a */
        public void mo101762a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // p000.C3736Ii.C3742f
        /* renamed from: b */
        public boolean mo101761b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: Ii$f */
    /* loaded from: classes.dex */
    public static class C3742f {
        /* renamed from: a */
        public void mo101762a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo101761b(TextView textView) {
            return ((Boolean) C3736Ii.m101780m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C3736Ii(TextView textView) {
        this.f16097i = textView;
        this.f16098j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f16099k = new C3741e();
        } else {
            this.f16099k = new C3740d();
        }
    }

    /* renamed from: k */
    public static Method m101782k(String str) {
        try {
            Method method = f16087m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f16087m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: m */
    public static <T> T m101780m(Object obj, String str, T t) {
        try {
            return (T) m101782k(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    public void m101792a() {
        int measuredWidth;
        if (!m101779n()) {
            return;
        }
        if (this.f16090b) {
            if (this.f16097i.getMeasuredHeight() > 0 && this.f16097i.getMeasuredWidth() > 0) {
                if (this.f16099k.mo101761b(this.f16097i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f16097i.getMeasuredWidth() - this.f16097i.getTotalPaddingLeft()) - this.f16097i.getTotalPaddingRight();
                }
                int height = (this.f16097i.getHeight() - this.f16097i.getCompoundPaddingBottom()) - this.f16097i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f16086l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m101788e = m101788e(rectF);
                        if (m101788e != this.f16097i.getTextSize()) {
                            m101773t(0, m101788e);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f16090b = true;
    }

    /* renamed from: b */
    public final int[] m101791b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final void m101790c() {
        this.f16089a = 0;
        this.f16092d = -1.0f;
        this.f16093e = -1.0f;
        this.f16091c = -1.0f;
        this.f16094f = new int[0];
        this.f16090b = false;
    }

    /* renamed from: d */
    public StaticLayout m101789d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return C3739c.m101763a(charSequence, alignment, i, i2, this.f16097i, this.f16096h, this.f16099k);
    }

    /* renamed from: e */
    public final int m101788e(RectF rectF) {
        int length = this.f16094f.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (m101769x(this.f16094f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i;
                    i = i5;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.f16094f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: f */
    public int m101787f() {
        return Math.round(this.f16093e);
    }

    /* renamed from: g */
    public int m101786g() {
        return Math.round(this.f16092d);
    }

    /* renamed from: h */
    public int m101785h() {
        return Math.round(this.f16091c);
    }

    /* renamed from: i */
    public int[] m101784i() {
        return this.f16094f;
    }

    /* renamed from: j */
    public int m101783j() {
        return this.f16089a;
    }

    /* renamed from: l */
    public void m101781l(int i) {
        TextPaint textPaint = this.f16096h;
        if (textPaint == null) {
            this.f16096h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f16096h.set(this.f16097i.getPaint());
        this.f16096h.setTextSize(i);
    }

    /* renamed from: n */
    public boolean m101779n() {
        return m101768y() && this.f16089a != 0;
    }

    /* renamed from: o */
    public void m101778o(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.f16098j;
        int[] iArr = C43509jm4.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f16097i;
        C38790bq6.m62456t0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C43509jm4.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f16089a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C43509jm4.AppCompatTextView_autoSizeStepGranularity;
        if (obtainStyledAttributes.hasValue(i3)) {
            f = obtainStyledAttributes.getDimension(i3, -1.0f);
        } else {
            f = -1.0f;
        }
        int i4 = C43509jm4.AppCompatTextView_autoSizeMinTextSize;
        if (obtainStyledAttributes.hasValue(i4)) {
            f2 = obtainStyledAttributes.getDimension(i4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        int i5 = C43509jm4.AppCompatTextView_autoSizeMaxTextSize;
        if (obtainStyledAttributes.hasValue(i5)) {
            f3 = obtainStyledAttributes.getDimension(i5, -1.0f);
        } else {
            f3 = -1.0f;
        }
        int i6 = C43509jm4.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m101771v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m101768y()) {
            if (this.f16089a == 1) {
                if (!this.f16095g) {
                    DisplayMetrics displayMetrics = this.f16098j.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    m101767z(f2, f3, f);
                }
                m101772u();
                return;
            }
            return;
        }
        this.f16089a = 0;
    }

    /* renamed from: p */
    public void m101777p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m101768y()) {
            DisplayMetrics displayMetrics = this.f16098j.getResources().getDisplayMetrics();
            m101767z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m101772u()) {
                m101792a();
            }
        }
    }

    /* renamed from: q */
    public void m101776q(int[] iArr, int i) throws IllegalArgumentException {
        if (m101768y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f16098j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f16094f = m101791b(iArr2);
                if (!m101770w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f16095g = false;
            }
            if (m101772u()) {
                m101792a();
            }
        }
    }

    /* renamed from: r */
    public void m101775r(int i) {
        if (m101768y()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = this.f16098j.getResources().getDisplayMetrics();
                    m101767z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m101772u()) {
                        m101792a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            m101790c();
        }
    }

    /* renamed from: s */
    public final void m101774s(float f) {
        if (f != this.f16097i.getPaint().getTextSize()) {
            this.f16097i.getPaint().setTextSize(f);
            boolean m101764a = C3738b.m101764a(this.f16097i);
            if (this.f16097i.getLayout() != null) {
                this.f16090b = false;
                try {
                    Method m101782k = m101782k("nullLayouts");
                    if (m101782k != null) {
                        m101782k.invoke(this.f16097i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!m101764a) {
                    this.f16097i.requestLayout();
                } else {
                    this.f16097i.forceLayout();
                }
                this.f16097i.invalidate();
            }
        }
    }

    /* renamed from: t */
    public void m101773t(int i, float f) {
        Resources resources;
        Context context = this.f16098j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m101774s(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: u */
    public final boolean m101772u() {
        if (m101768y() && this.f16089a == 1) {
            if (!this.f16095g || this.f16094f.length == 0) {
                int floor = ((int) Math.floor((this.f16093e - this.f16092d) / this.f16091c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f16092d + (i * this.f16091c));
                }
                this.f16094f = m101791b(iArr);
            }
            this.f16090b = true;
        } else {
            this.f16090b = false;
        }
        return this.f16090b;
    }

    /* renamed from: v */
    public final void m101771v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f16094f = m101791b(iArr);
            m101770w();
        }
    }

    /* renamed from: w */
    public final boolean m101770w() {
        int[] iArr;
        int length;
        boolean z;
        if (this.f16094f.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f16095g = z;
        if (z) {
            this.f16089a = 1;
            this.f16092d = iArr[0];
            this.f16093e = iArr[length - 1];
            this.f16091c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    public final boolean m101769x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f16097i.getText();
        TransformationMethod transformationMethod = this.f16097i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f16097i)) != null) {
            text = transformation;
        }
        int m101765b = C3737a.m101765b(this.f16097i);
        m101781l(i);
        StaticLayout m101789d = m101789d(text, (Layout.Alignment) m101780m(this.f16097i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m101765b);
        if ((m101765b != -1 && (m101789d.getLineCount() > m101765b || m101789d.getLineEnd(m101789d.getLineCount() - 1) != text.length())) || m101789d.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m101768y() {
        return !(this.f16097i instanceof AppCompatEditText);
    }

    /* renamed from: z */
    public final void m101767z(float f, float f2, float f3) throws IllegalArgumentException {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.f16089a = 1;
                    this.f16092d = f;
                    this.f16093e = f2;
                    this.f16091c = f3;
                    this.f16095g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }
}
