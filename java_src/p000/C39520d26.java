package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.stripe.android.core.networking.FileUploadRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import p000.N51;
/* renamed from: d26  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39520d26 extends AbstractC27525qB {

    /* renamed from: D */
    public final StringBuilder f76029D;

    /* renamed from: E */
    public final RectF f76030E;

    /* renamed from: F */
    public final Matrix f76031F;

    /* renamed from: G */
    public final Paint f76032G;

    /* renamed from: H */
    public final Paint f76033H;

    /* renamed from: I */
    public final Map<C43013iw1, List<C43151jA0>> f76034I;

    /* renamed from: J */
    public final C46602oz2<String> f76035J;

    /* renamed from: K */
    public final List<C19670d> f76036K;

    /* renamed from: L */
    public final C38316b26 f76037L;

    /* renamed from: M */
    public final RD2 f76038M;

    /* renamed from: N */
    public final C47924rD2 f76039N;

    /* renamed from: O */
    public AbstractC26856oB<Integer, Integer> f76040O;

    /* renamed from: P */
    public AbstractC26856oB<Integer, Integer> f76041P;

    /* renamed from: Q */
    public AbstractC26856oB<Integer, Integer> f76042Q;

    /* renamed from: R */
    public AbstractC26856oB<Integer, Integer> f76043R;

    /* renamed from: S */
    public AbstractC26856oB<Float, Float> f76044S;

    /* renamed from: T */
    public AbstractC26856oB<Float, Float> f76045T;

    /* renamed from: U */
    public AbstractC26856oB<Float, Float> f76046U;

    /* renamed from: V */
    public AbstractC26856oB<Float, Float> f76047V;

    /* renamed from: W */
    public AbstractC26856oB<Float, Float> f76048W;

    /* renamed from: X */
    public AbstractC26856oB<Typeface, Typeface> f76049X;

    /* renamed from: d26$a */
    /* loaded from: classes2.dex */
    public class C19667a extends Paint {
        public C19667a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: d26$b */
    /* loaded from: classes2.dex */
    public class C19668b extends Paint {
        public C19668b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: d26$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C19669c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f76052a;

        static {
            int[] iArr = new int[N51.EnumC5475a.values().length];
            f76052a = iArr;
            try {
                iArr[N51.EnumC5475a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76052a[N51.EnumC5475a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76052a[N51.EnumC5475a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C39520d26(RD2 rd2, C41135fm2 c41135fm2) {
        super(rd2, c41135fm2);
        C27640qe c27640qe;
        C27640qe c27640qe2;
        C27323pe c27323pe;
        C27323pe c27323pe2;
        this.f76029D = new StringBuilder(2);
        this.f76030E = new RectF();
        this.f76031F = new Matrix();
        this.f76032G = new C19667a(1);
        this.f76033H = new C19668b(1);
        this.f76034I = new HashMap();
        this.f76035J = new C46602oz2<>();
        this.f76036K = new ArrayList();
        this.f76038M = rd2;
        this.f76039N = c41135fm2.m40876b();
        C38316b26 mo951a = c41135fm2.m40859s().mo951a();
        this.f76037L = mo951a;
        mo951a.m21665a(this);
        m17981i(mo951a);
        C1109Ce m40858t = c41135fm2.m40858t();
        if (m40858t != null && (c27323pe2 = m40858t.f4419a) != null) {
            AbstractC26856oB<Integer, Integer> mo951a2 = c27323pe2.mo951a();
            this.f76040O = mo951a2;
            mo951a2.m21665a(this);
            m17981i(this.f76040O);
        }
        if (m40858t != null && (c27323pe = m40858t.f4420b) != null) {
            AbstractC26856oB<Integer, Integer> mo951a3 = c27323pe.mo951a();
            this.f76042Q = mo951a3;
            mo951a3.m21665a(this);
            m17981i(this.f76042Q);
        }
        if (m40858t != null && (c27640qe2 = m40858t.f4421c) != null) {
            AbstractC26856oB<Float, Float> mo951a4 = c27640qe2.mo951a();
            this.f76044S = mo951a4;
            mo951a4.m21665a(this);
            m17981i(this.f76044S);
        }
        if (m40858t != null && (c27640qe = m40858t.f4422d) != null) {
            AbstractC26856oB<Float, Float> mo951a5 = c27640qe.mo951a();
            this.f76046U = mo951a5;
            mo951a5.m21665a(this);
            m17981i(this.f76046U);
        }
    }

    /* renamed from: O */
    public final String m44687O(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m44673c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.f76035J.m20198f(j)) {
            return this.f76035J.m20196h(j);
        }
        this.f76029D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f76029D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f76029D.toString();
        this.f76035J.m20191n(j, sb);
        return sb;
    }

    /* renamed from: P */
    public final void m44686P(N51 n51, Matrix matrix) {
        int intValue;
        AbstractC26856oB<Integer, Integer> abstractC26856oB = this.f76041P;
        if (abstractC26856oB != null) {
            this.f76032G.setColor(abstractC26856oB.mo21658h().intValue());
        } else {
            AbstractC26856oB<Integer, Integer> abstractC26856oB2 = this.f76040O;
            if (abstractC26856oB2 != null) {
                this.f76032G.setColor(abstractC26856oB2.mo21658h().intValue());
            } else {
                this.f76032G.setColor(n51.f24127h);
            }
        }
        AbstractC26856oB<Integer, Integer> abstractC26856oB3 = this.f76043R;
        if (abstractC26856oB3 != null) {
            this.f76033H.setColor(abstractC26856oB3.mo21658h().intValue());
        } else {
            AbstractC26856oB<Integer, Integer> abstractC26856oB4 = this.f76042Q;
            if (abstractC26856oB4 != null) {
                this.f76033H.setColor(abstractC26856oB4.mo21658h().intValue());
            } else {
                this.f76033H.setColor(n51.f24128i);
            }
        }
        if (this.f104860x.m26230h() == null) {
            intValue = 100;
        } else {
            intValue = this.f104860x.m26230h().mo21658h().intValue();
        }
        int i = (intValue * KotlinVersion.MAX_COMPONENT_VALUE) / 100;
        this.f76032G.setAlpha(i);
        this.f76033H.setAlpha(i);
        AbstractC26856oB<Float, Float> abstractC26856oB5 = this.f76045T;
        if (abstractC26856oB5 != null) {
            this.f76033H.setStrokeWidth(abstractC26856oB5.mo21658h().floatValue());
            return;
        }
        AbstractC26856oB<Float, Float> abstractC26856oB6 = this.f76044S;
        if (abstractC26856oB6 != null) {
            this.f76033H.setStrokeWidth(abstractC26856oB6.mo21658h().floatValue());
        } else {
            this.f76033H.setStrokeWidth(n51.f24129j * C33095Gi6.m104867e());
        }
    }

    /* renamed from: Q */
    public final void m44685Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: R */
    public final void m44684R(C43013iw1 c43013iw1, float f, N51 n51, Canvas canvas) {
        List<C43151jA0> m44676Z = m44676Z(c43013iw1);
        for (int i = 0; i < m44676Z.size(); i++) {
            Path path = m44676Z.get(i).getPath();
            path.computeBounds(this.f76030E, false);
            this.f76031F.reset();
            this.f76031F.preTranslate(0.0f, (-n51.f24126g) * C33095Gi6.m104867e());
            this.f76031F.preScale(f, f);
            path.transform(this.f76031F);
            if (n51.f24130k) {
                m44681U(path, this.f76032G, canvas);
                m44681U(path, this.f76033H, canvas);
            } else {
                m44681U(path, this.f76033H, canvas);
                m44681U(path, this.f76032G, canvas);
            }
        }
    }

    /* renamed from: S */
    public final void m44683S(String str, N51 n51, Canvas canvas) {
        if (n51.f24130k) {
            m44685Q(str, this.f76032G, canvas);
            m44685Q(str, this.f76033H, canvas);
            return;
        }
        m44685Q(str, this.f76033H, canvas);
        m44685Q(str, this.f76032G, canvas);
    }

    /* renamed from: T */
    public final void m44682T(String str, N51 n51, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String m44687O = m44687O(str, i);
            i += m44687O.length();
            m44683S(m44687O, n51, canvas);
            canvas.translate(this.f76032G.measureText(m44687O) + f, 0.0f);
        }
    }

    /* renamed from: U */
    public final void m44681U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: V */
    public final void m44680V(String str, N51 n51, C41234fw1 c41234fw1, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            C43013iw1 m96983k = this.f76039N.m16221c().m96983k(C43013iw1.m31595c(str.charAt(i), c41234fw1.m40436a(), c41234fw1.m40434c()));
            if (m96983k != null) {
                m44684R(m96983k, f2, n51, canvas);
                canvas.translate((((float) m96983k.m31596b()) * f2 * C33095Gi6.m104867e()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m44679W(N51 n51, C41234fw1 c41234fw1, Canvas canvas) {
        float f;
        float floatValue;
        int size;
        int i;
        float f2;
        Typeface m44674b0 = m44674b0(c41234fw1);
        if (m44674b0 == null) {
            return;
        }
        String str = n51.f24120a;
        U06 m87096X = this.f76038M.m87096X();
        if (m87096X != null) {
            str = m87096X.m82169c(getName(), str);
        }
        this.f76032G.setTypeface(m44674b0);
        AbstractC26856oB<Float, Float> abstractC26856oB = this.f76048W;
        if (abstractC26856oB != null) {
            f = abstractC26856oB.mo21658h().floatValue();
        } else {
            f = n51.f24122c;
        }
        this.f76032G.setTextSize(C33095Gi6.m104867e() * f);
        this.f76033H.setTypeface(this.f76032G.getTypeface());
        this.f76033H.setTextSize(this.f76032G.getTextSize());
        float f3 = n51.f24124e / 10.0f;
        AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f76047V;
        if (abstractC26856oB2 != null) {
            floatValue = abstractC26856oB2.mo21658h().floatValue();
        } else {
            AbstractC26856oB<Float, Float> abstractC26856oB3 = this.f76046U;
            if (abstractC26856oB3 != null) {
                floatValue = abstractC26856oB3.mo21658h().floatValue();
            }
            float m104867e = ((f3 * C33095Gi6.m104867e()) * f) / 100.0f;
            List<String> m44675a0 = m44675a0(str);
            size = m44675a0.size();
            int i2 = -1;
            i = 0;
            while (i < size) {
                String str2 = m44675a0.get(i);
                PointF pointF = n51.f24132m;
                if (pointF == null) {
                    f2 = 0.0f;
                } else {
                    f2 = pointF.x;
                }
                int i3 = i;
                List<C19670d> m44671e0 = m44671e0(str2, f2, c41234fw1, 0.0f, m104867e, false);
                for (int i4 = 0; i4 < m44671e0.size(); i4++) {
                    C19670d c19670d = m44671e0.get(i4);
                    i2++;
                    canvas.save();
                    m44672d0(canvas, n51, i2, c19670d.f76054b);
                    m44682T(c19670d.f76053a, n51, canvas, m104867e);
                    canvas.restore();
                }
                i = i3 + 1;
            }
        }
        f3 += floatValue;
        float m104867e2 = ((f3 * C33095Gi6.m104867e()) * f) / 100.0f;
        List<String> m44675a02 = m44675a0(str);
        size = m44675a02.size();
        int i22 = -1;
        i = 0;
        while (i < size) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m44678X(N51 n51, Matrix matrix, C41234fw1 c41234fw1, Canvas canvas) {
        float f;
        float floatValue;
        int i;
        float f2;
        AbstractC26856oB<Float, Float> abstractC26856oB = this.f76048W;
        if (abstractC26856oB != null) {
            f = abstractC26856oB.mo21658h().floatValue();
        } else {
            f = n51.f24122c;
        }
        float f3 = f / 100.0f;
        float m104865g = C33095Gi6.m104865g(matrix);
        List<String> m44675a0 = m44675a0(n51.f24120a);
        int size = m44675a0.size();
        float f4 = n51.f24124e / 10.0f;
        AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f76047V;
        if (abstractC26856oB2 != null) {
            floatValue = abstractC26856oB2.mo21658h().floatValue();
        } else {
            AbstractC26856oB<Float, Float> abstractC26856oB3 = this.f76046U;
            if (abstractC26856oB3 != null) {
                floatValue = abstractC26856oB3.mo21658h().floatValue();
            }
            float f5 = f4;
            int i2 = -1;
            i = 0;
            while (i < size) {
                String str = m44675a0.get(i);
                PointF pointF = n51.f24132m;
                if (pointF == null) {
                    f2 = 0.0f;
                } else {
                    f2 = pointF.x;
                }
                int i3 = i;
                List<C19670d> m44671e0 = m44671e0(str, f2, c41234fw1, f3, f5, true);
                int i4 = 0;
                while (i4 < m44671e0.size()) {
                    C19670d c19670d = m44671e0.get(i4);
                    int i5 = i2 + 1;
                    canvas.save();
                    m44672d0(canvas, n51, i5, c19670d.f76054b);
                    m44680V(c19670d.f76053a, n51, c41234fw1, canvas, m104865g, f3, f5);
                    canvas.restore();
                    i4++;
                    m44671e0 = m44671e0;
                    i2 = i5;
                }
                i = i3 + 1;
            }
        }
        f4 += floatValue;
        float f52 = f4;
        int i22 = -1;
        i = 0;
        while (i < size) {
        }
    }

    /* renamed from: Y */
    public final C19670d m44677Y(int i) {
        for (int size = this.f76036K.size(); size < i; size++) {
            this.f76036K.add(new C19670d(null));
        }
        return this.f76036K.get(i - 1);
    }

    /* renamed from: Z */
    public final List<C43151jA0> m44676Z(C43013iw1 c43013iw1) {
        if (this.f76034I.containsKey(c43013iw1)) {
            return this.f76034I.get(c43013iw1);
        }
        List<C47781qy5> m31597a = c43013iw1.m31597a();
        int size = m31597a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C43151jA0(this.f76038M, this, m31597a.get(i), this.f76039N));
        }
        this.f76034I.put(c43013iw1, arrayList);
        return arrayList;
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        super.mo3375a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f76039N.m16222b().width(), this.f76039N.m16222b().height());
    }

    /* renamed from: a0 */
    public final List<String> m44675a0(String str) {
        return Arrays.asList(str.replaceAll(FileUploadRequest.LINE_BREAK, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: b0 */
    public final Typeface m44674b0(C41234fw1 c41234fw1) {
        Typeface mo21658h;
        AbstractC26856oB<Typeface, Typeface> abstractC26856oB = this.f76049X;
        if (abstractC26856oB != null && (mo21658h = abstractC26856oB.mo21658h()) != null) {
            return mo21658h;
        }
        Typeface m87094Y = this.f76038M.m87094Y(c41234fw1);
        if (m87094Y != null) {
            return m87094Y;
        }
        return c41234fw1.m40433d();
    }

    /* renamed from: c0 */
    public final boolean m44673c0(int i) {
        if (Character.getType(i) != 16 && Character.getType(i) != 27 && Character.getType(i) != 6 && Character.getType(i) != 28 && Character.getType(i) != 8 && Character.getType(i) != 19) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    public final void m44672d0(Canvas canvas, N51 n51, int i, float f) {
        float f2;
        float f3;
        PointF pointF = n51.f24131l;
        PointF pointF2 = n51.f24132m;
        float m104867e = C33095Gi6.m104867e();
        float f4 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (n51.f24125f * m104867e) + pointF.y;
        }
        float f5 = (i * n51.f24125f * m104867e) + f2;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = C19669c.f76052a[n51.f24123d.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f5);
                    return;
                }
                return;
            }
            canvas.translate((f3 + f4) - f, f5);
            return;
        }
        canvas.translate(f3, f5);
    }

    /* renamed from: e0 */
    public final List<C19670d> m44671e0(String str, float f, C41234fw1 c41234fw1, float f2, float f3, boolean z) {
        float measureText;
        String substring;
        String trim;
        String substring2;
        String trim2;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                C43013iw1 m96983k = this.f76039N.m16221c().m96983k(C43013iw1.m31595c(charAt, c41234fw1.m40436a(), c41234fw1.m40434c()));
                if (m96983k != null) {
                    measureText = ((float) m96983k.m31596b()) * f2 * C33095Gi6.m104867e();
                }
            } else {
                measureText = this.f76032G.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                C19670d m44677Y = m44677Y(i);
                if (i3 == i2) {
                    m44677Y.m44668c(str.substring(i2, i4).trim(), (f4 - f7) - ((trim2.length() - substring2.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    m44677Y.m44668c(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((substring.length() - trim.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            m44677Y(i).m44668c(str.substring(i2), f4);
        }
        return this.f76036K.subList(0, i);
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        super.mo3374h(t, c41410gE2);
        if (t == InterfaceC37835aE2.f50112a) {
            AbstractC26856oB<Integer, Integer> abstractC26856oB = this.f76041P;
            if (abstractC26856oB != null) {
                m17989G(abstractC26856oB);
            }
            if (c41410gE2 == null) {
                this.f76041P = null;
                return;
            }
            C32168Cj6 c32168Cj6 = new C32168Cj6(c41410gE2);
            this.f76041P = c32168Cj6;
            c32168Cj6.m21665a(this);
            m17981i(this.f76041P);
        } else if (t == InterfaceC37835aE2.f50113b) {
            AbstractC26856oB<Integer, Integer> abstractC26856oB2 = this.f76043R;
            if (abstractC26856oB2 != null) {
                m17989G(abstractC26856oB2);
            }
            if (c41410gE2 == null) {
                this.f76043R = null;
                return;
            }
            C32168Cj6 c32168Cj62 = new C32168Cj6(c41410gE2);
            this.f76043R = c32168Cj62;
            c32168Cj62.m21665a(this);
            m17981i(this.f76043R);
        } else if (t == InterfaceC37835aE2.f50130s) {
            AbstractC26856oB<Float, Float> abstractC26856oB3 = this.f76045T;
            if (abstractC26856oB3 != null) {
                m17989G(abstractC26856oB3);
            }
            if (c41410gE2 == null) {
                this.f76045T = null;
                return;
            }
            C32168Cj6 c32168Cj63 = new C32168Cj6(c41410gE2);
            this.f76045T = c32168Cj63;
            c32168Cj63.m21665a(this);
            m17981i(this.f76045T);
        } else if (t == InterfaceC37835aE2.f50131t) {
            AbstractC26856oB<Float, Float> abstractC26856oB4 = this.f76047V;
            if (abstractC26856oB4 != null) {
                m17989G(abstractC26856oB4);
            }
            if (c41410gE2 == null) {
                this.f76047V = null;
                return;
            }
            C32168Cj6 c32168Cj64 = new C32168Cj6(c41410gE2);
            this.f76047V = c32168Cj64;
            c32168Cj64.m21665a(this);
            m17981i(this.f76047V);
        } else if (t == InterfaceC37835aE2.f50102F) {
            AbstractC26856oB<Float, Float> abstractC26856oB5 = this.f76048W;
            if (abstractC26856oB5 != null) {
                m17989G(abstractC26856oB5);
            }
            if (c41410gE2 == null) {
                this.f76048W = null;
                return;
            }
            C32168Cj6 c32168Cj65 = new C32168Cj6(c41410gE2);
            this.f76048W = c32168Cj65;
            c32168Cj65.m21665a(this);
            m17981i(this.f76048W);
        } else if (t == InterfaceC37835aE2.f50109M) {
            AbstractC26856oB<Typeface, Typeface> abstractC26856oB6 = this.f76049X;
            if (abstractC26856oB6 != null) {
                m17989G(abstractC26856oB6);
            }
            if (c41410gE2 == null) {
                this.f76049X = null;
                return;
            }
            C32168Cj6 c32168Cj66 = new C32168Cj6(c41410gE2);
            this.f76049X = c32168Cj66;
            c32168Cj66.m21665a(this);
            m17981i(this.f76049X);
        } else if (t == InterfaceC37835aE2.f50111O) {
            this.f76037L.m65083q(c41410gE2);
        }
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: t */
    public void mo3373t(Canvas canvas, Matrix matrix, int i) {
        N51 mo21658h = this.f76037L.mo21658h();
        C41234fw1 c41234fw1 = this.f76039N.m16217g().get(mo21658h.f24121b);
        if (c41234fw1 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m44686P(mo21658h, matrix);
        if (this.f76038M.m87076e1()) {
            m44678X(mo21658h, matrix, c41234fw1, canvas);
        } else {
            m44679W(mo21658h, c41234fw1, canvas);
        }
        canvas.restore();
    }

    /* renamed from: d26$d */
    /* loaded from: classes2.dex */
    public static class C19670d {

        /* renamed from: a */
        public String f76053a;

        /* renamed from: b */
        public float f76054b;

        private C19670d() {
            this.f76053a = "";
            this.f76054b = 0.0f;
        }

        /* renamed from: c */
        public void m44668c(String str, float f) {
            this.f76053a = str;
            this.f76054b = f;
        }

        public /* synthetic */ C19670d(C19667a c19667a) {
            this();
        }
    }
}
