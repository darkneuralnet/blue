package p000;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* renamed from: wE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50897wE3 {

    /* renamed from: f */
    public static final InterfaceC29815c f115622f = new C29813a();

    /* renamed from: a */
    public final List<C29816d> f115623a;

    /* renamed from: b */
    public final List<NY5> f115624b;

    /* renamed from: d */
    public final SparseBooleanArray f115626d = new SparseBooleanArray();

    /* renamed from: c */
    public final Map<NY5, C29816d> f115625c = new C28385so();

    /* renamed from: e */
    public final C29816d f115627e = m7190a();

    /* renamed from: wE3$a */
    /* loaded from: classes.dex */
    public static class C29813a implements InterfaceC29815c {
        @Override // p000.C50897wE3.InterfaceC29815c
        /* renamed from: a */
        public boolean mo7174a(int i, float[] fArr) {
            return (m7180d(fArr) || m7182b(fArr) || m7181c(fArr)) ? false : true;
        }

        /* renamed from: b */
        public final boolean m7182b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: c */
        public final boolean m7181c(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: d */
        public final boolean m7180d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* renamed from: wE3$b */
    /* loaded from: classes.dex */
    public static final class C29814b {

        /* renamed from: a */
        public final List<C29816d> f115628a;

        /* renamed from: b */
        public final Bitmap f115629b;

        /* renamed from: c */
        public final List<NY5> f115630c;

        /* renamed from: d */
        public int f115631d;

        /* renamed from: e */
        public int f115632e;

        /* renamed from: f */
        public int f115633f;

        /* renamed from: g */
        public final List<InterfaceC29815c> f115634g;

        /* renamed from: h */
        public Rect f115635h;

        public C29814b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f115630c = arrayList;
            this.f115631d = 16;
            this.f115632e = 12544;
            this.f115633f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f115634g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(C50897wE3.f115622f);
                this.f115629b = bitmap;
                this.f115628a = null;
                arrayList.add(NY5.f24766e);
                arrayList.add(NY5.f24767f);
                arrayList.add(NY5.f24768g);
                arrayList.add(NY5.f24769h);
                arrayList.add(NY5.f24770i);
                arrayList.add(NY5.f24771j);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        /* renamed from: a */
        public C29814b m7179a(InterfaceC29815c interfaceC29815c) {
            if (interfaceC29815c != null) {
                this.f115634g.add(interfaceC29815c);
            }
            return this;
        }

        /* renamed from: b */
        public C29814b m7178b() {
            this.f115634g.clear();
            return this;
        }

        /* renamed from: c */
        public C50897wE3 m7177c() {
            List<C29816d> list;
            InterfaceC29815c[] interfaceC29815cArr;
            Bitmap bitmap = this.f115629b;
            if (bitmap != null) {
                Bitmap m7175e = m7175e(bitmap);
                Rect rect = this.f115635h;
                if (m7175e != this.f115629b && rect != null) {
                    double width = m7175e.getWidth() / this.f115629b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), m7175e.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), m7175e.getHeight());
                }
                int[] m7176d = m7176d(m7175e);
                int i = this.f115631d;
                if (this.f115634g.isEmpty()) {
                    interfaceC29815cArr = null;
                } else {
                    List<InterfaceC29815c> list2 = this.f115634g;
                    interfaceC29815cArr = (InterfaceC29815c[]) list2.toArray(new InterfaceC29815c[list2.size()]);
                }
                C48249rm0 c48249rm0 = new C48249rm0(m7176d, i, interfaceC29815cArr);
                if (m7175e != this.f115629b) {
                    m7175e.recycle();
                }
                list = c48249rm0.m15429d();
            } else {
                list = this.f115628a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C50897wE3 c50897wE3 = new C50897wE3(list, this.f115630c);
            c50897wE3.m7188c();
            return c50897wE3;
        }

        /* renamed from: d */
        public final int[] m7176d(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f115635h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f115635h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f115635h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        /* renamed from: e */
        public final Bitmap m7175e(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f115632e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f115632e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f115633f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f115633f)) {
                d = i / max;
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }
    }

    /* renamed from: wE3$c */
    /* loaded from: classes.dex */
    public interface InterfaceC29815c {
        /* renamed from: a */
        boolean mo7174a(int i, float[] fArr);
    }

    /* renamed from: wE3$d */
    /* loaded from: classes.dex */
    public static final class C29816d {

        /* renamed from: a */
        public final int f115636a;

        /* renamed from: b */
        public final int f115637b;

        /* renamed from: c */
        public final int f115638c;

        /* renamed from: d */
        public final int f115639d;

        /* renamed from: e */
        public final int f115640e;

        /* renamed from: f */
        public boolean f115641f;

        /* renamed from: g */
        public int f115642g;

        /* renamed from: h */
        public int f115643h;

        /* renamed from: i */
        public float[] f115644i;

        public C29816d(int i, int i2) {
            this.f115636a = Color.red(i);
            this.f115637b = Color.green(i);
            this.f115638c = Color.blue(i);
            this.f115639d = i;
            this.f115640e = i2;
        }

        /* renamed from: a */
        public final void m7173a() {
            int m99845p;
            int m99845p2;
            if (!this.f115641f) {
                int m99854g = C33827Jm0.m99854g(-1, this.f115639d, 4.5f);
                int m99854g2 = C33827Jm0.m99854g(-1, this.f115639d, 3.0f);
                if (m99854g != -1 && m99854g2 != -1) {
                    this.f115643h = C33827Jm0.m99845p(-1, m99854g);
                    this.f115642g = C33827Jm0.m99845p(-1, m99854g2);
                    this.f115641f = true;
                    return;
                }
                int m99854g3 = C33827Jm0.m99854g(-16777216, this.f115639d, 4.5f);
                int m99854g4 = C33827Jm0.m99854g(-16777216, this.f115639d, 3.0f);
                if (m99854g3 != -1 && m99854g4 != -1) {
                    this.f115643h = C33827Jm0.m99845p(-16777216, m99854g3);
                    this.f115642g = C33827Jm0.m99845p(-16777216, m99854g4);
                    this.f115641f = true;
                    return;
                }
                if (m99854g != -1) {
                    m99845p = C33827Jm0.m99845p(-1, m99854g);
                } else {
                    m99845p = C33827Jm0.m99845p(-16777216, m99854g3);
                }
                this.f115643h = m99845p;
                if (m99854g2 != -1) {
                    m99845p2 = C33827Jm0.m99845p(-1, m99854g2);
                } else {
                    m99845p2 = C33827Jm0.m99845p(-16777216, m99854g4);
                }
                this.f115642g = m99845p2;
                this.f115641f = true;
            }
        }

        /* renamed from: b */
        public int m7172b() {
            m7173a();
            return this.f115643h;
        }

        /* renamed from: c */
        public float[] m7171c() {
            if (this.f115644i == null) {
                this.f115644i = new float[3];
            }
            C33827Jm0.m99860a(this.f115636a, this.f115637b, this.f115638c, this.f115644i);
            return this.f115644i;
        }

        /* renamed from: d */
        public int m7170d() {
            return this.f115640e;
        }

        /* renamed from: e */
        public int m7169e() {
            return this.f115639d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C29816d.class != obj.getClass()) {
                return false;
            }
            C29816d c29816d = (C29816d) obj;
            if (this.f115640e == c29816d.f115640e && this.f115639d == c29816d.f115639d) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int m7168f() {
            m7173a();
            return this.f115642g;
        }

        public int hashCode() {
            return (this.f115639d * 31) + this.f115640e;
        }

        public String toString() {
            return C29816d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m7169e()) + "] [HSL: " + Arrays.toString(m7171c()) + "] [Population: " + this.f115640e + "] [Title Text: #" + Integer.toHexString(m7168f()) + "] [Body Text: #" + Integer.toHexString(m7172b()) + ']';
        }
    }

    public C50897wE3(List<C29816d> list, List<NY5> list2) {
        this.f115623a = list;
        this.f115624b = list2;
    }

    /* renamed from: b */
    public static C29814b m7189b(Bitmap bitmap) {
        return new C29814b(bitmap);
    }

    /* renamed from: a */
    public final C29816d m7190a() {
        int size = this.f115623a.size();
        int i = Integer.MIN_VALUE;
        C29816d c29816d = null;
        for (int i2 = 0; i2 < size; i2++) {
            C29816d c29816d2 = this.f115623a.get(i2);
            if (c29816d2.m7170d() > i) {
                i = c29816d2.m7170d();
                c29816d = c29816d2;
            }
        }
        return c29816d;
    }

    /* renamed from: c */
    public void m7188c() {
        int size = this.f115624b.size();
        for (int i = 0; i < size; i++) {
            NY5 ny5 = this.f115624b.get(i);
            ny5.m93772k();
            this.f115625c.put(ny5, m7186e(ny5));
        }
        this.f115626d.clear();
    }

    /* renamed from: d */
    public final float m7187d(C29816d c29816d, NY5 ny5) {
        int i;
        float f;
        float f2;
        float[] m7171c = c29816d.m7171c();
        C29816d c29816d2 = this.f115627e;
        if (c29816d2 != null) {
            i = c29816d2.m7170d();
        } else {
            i = 1;
        }
        float f3 = 0.0f;
        if (ny5.m93776g() > 0.0f) {
            f = ny5.m93776g() * (1.0f - Math.abs(m7171c[1] - ny5.m93774i()));
        } else {
            f = 0.0f;
        }
        if (ny5.m93782a() > 0.0f) {
            f2 = ny5.m93782a() * (1.0f - Math.abs(m7171c[2] - ny5.m93775h()));
        } else {
            f2 = 0.0f;
        }
        if (ny5.m93777f() > 0.0f) {
            f3 = ny5.m93777f() * (c29816d.m7170d() / i);
        }
        return f + f2 + f3;
    }

    /* renamed from: e */
    public final C29816d m7186e(NY5 ny5) {
        C29816d m7184g = m7184g(ny5);
        if (m7184g != null && ny5.m93773j()) {
            this.f115626d.append(m7184g.m7169e(), true);
        }
        return m7184g;
    }

    /* renamed from: f */
    public C29816d m7185f() {
        return this.f115627e;
    }

    /* renamed from: g */
    public final C29816d m7184g(NY5 ny5) {
        int size = this.f115623a.size();
        float f = 0.0f;
        C29816d c29816d = null;
        for (int i = 0; i < size; i++) {
            C29816d c29816d2 = this.f115623a.get(i);
            if (m7183h(c29816d2, ny5)) {
                float m7187d = m7187d(c29816d2, ny5);
                if (c29816d == null || m7187d > f) {
                    c29816d = c29816d2;
                    f = m7187d;
                }
            }
        }
        return c29816d;
    }

    /* renamed from: h */
    public final boolean m7183h(C29816d c29816d, NY5 ny5) {
        float[] m7171c = c29816d.m7171c();
        if (m7171c[1] >= ny5.m93778e() && m7171c[1] <= ny5.m93780c() && m7171c[2] >= ny5.m93779d() && m7171c[2] <= ny5.m93781b() && !this.f115626d.get(c29816d.m7169e())) {
            return true;
        }
        return false;
    }
}
