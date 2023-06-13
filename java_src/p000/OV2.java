package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C11512a;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC33194Gt6;
import p000.AbstractC34364Lt6;
import p000.AbstractC50685vs6;
/* renamed from: OV2 */
/* loaded from: classes.dex */
public class OV2 {

    /* renamed from: B */
    public HashMap<String, AbstractC34364Lt6> f26671B;

    /* renamed from: C */
    public HashMap<String, AbstractC33194Gt6> f26672C;

    /* renamed from: D */
    public HashMap<String, AbstractC50685vs6> f26673D;

    /* renamed from: E */
    public C34747Nk2[] f26674E;

    /* renamed from: F */
    public int f26675F;

    /* renamed from: G */
    public int f26676G;

    /* renamed from: H */
    public View f26677H;

    /* renamed from: I */
    public int f26678I;

    /* renamed from: J */
    public float f26679J;

    /* renamed from: K */
    public Interpolator f26680K;

    /* renamed from: L */
    public boolean f26681L;

    /* renamed from: b */
    public View f26683b;

    /* renamed from: c */
    public int f26684c;

    /* renamed from: e */
    public String f26686e;

    /* renamed from: k */
    public AbstractC42603iF0[] f26692k;

    /* renamed from: l */
    public AbstractC42603iF0 f26693l;

    /* renamed from: p */
    public float f26697p;

    /* renamed from: q */
    public float f26698q;

    /* renamed from: r */
    public int[] f26699r;

    /* renamed from: s */
    public double[] f26700s;

    /* renamed from: t */
    public double[] f26701t;

    /* renamed from: u */
    public String[] f26702u;

    /* renamed from: v */
    public int[] f26703v;

    /* renamed from: a */
    public Rect f26682a = new Rect();

    /* renamed from: d */
    public boolean f26685d = false;

    /* renamed from: f */
    public int f26687f = -1;

    /* renamed from: g */
    public XV2 f26688g = new XV2();

    /* renamed from: h */
    public XV2 f26689h = new XV2();

    /* renamed from: i */
    public NV2 f26690i = new NV2();

    /* renamed from: j */
    public NV2 f26691j = new NV2();

    /* renamed from: m */
    public float f26694m = Float.NaN;

    /* renamed from: n */
    public float f26695n = 0.0f;

    /* renamed from: o */
    public float f26696o = 1.0f;

    /* renamed from: w */
    public int f26704w = 4;

    /* renamed from: x */
    public float[] f26705x = new float[4];

    /* renamed from: y */
    public ArrayList<XV2> f26706y = new ArrayList<>();

    /* renamed from: z */
    public float[] f26707z = new float[1];

    /* renamed from: A */
    public ArrayList<AbstractC37078Xj2> f26670A = new ArrayList<>();

    /* renamed from: OV2$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationInterpolatorC6018a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C41363g91 f26708a;

        public animationInterpolatorC6018a(C41363g91 c41363g91) {
            this.f26708a = c41363g91;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f26708a.mo39969a(f);
        }
    }

    public OV2(View view) {
        int i = AbstractC37078Xj2.f43729f;
        this.f26675F = i;
        this.f26676G = i;
        this.f26677H = null;
        this.f26678I = i;
        this.f26679J = Float.NaN;
        this.f26680K = null;
        this.f26681L = false;
        m92159H(view);
    }

    /* renamed from: p */
    public static Interpolator m92141p(Context context, int i, String str, int i2) {
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animationInterpolatorC6018a(C41363g91.m39970c(str));
        }
        return AnimationUtils.loadInterpolator(context, i2);
    }

    /* renamed from: A */
    public void m92166A(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        int i4 = rect.left + rect.right;
                        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
                        rect2.top = (i4 - rect.height()) / 2;
                        rect2.right = rect2.left + rect.width();
                        rect2.bottom = rect2.top + rect.height();
                        return;
                    }
                    return;
                }
                int i5 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i5 / 2);
                rect2.top = i3 - ((i5 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i6 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i6 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i3 - ((i7 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    /* renamed from: B */
    public void m92165B(View view) {
        XV2 xv2 = this.f26688g;
        xv2.f43316d = 0.0f;
        xv2.f43317e = 0.0f;
        this.f26681L = true;
        xv2.m76924p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f26689h.m76924p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f26690i.m93843j(view);
        this.f26691j.m93843j(view);
    }

    /* renamed from: C */
    public void m92164C(Rect rect, C11515b c11515b, int i, int i2) {
        int i3 = c11515b.f54078d;
        if (i3 != 0) {
            m92166A(rect, this.f26682a, i3, i, i2);
            rect = this.f26682a;
        }
        XV2 xv2 = this.f26689h;
        xv2.f43316d = 1.0f;
        xv2.f43317e = 1.0f;
        m92132y(xv2);
        this.f26689h.m76924p(rect.left, rect.top, rect.width(), rect.height());
        this.f26689h.m76939a(c11515b.m67849A(this.f26684c));
        this.f26691j.m93844i(rect, c11515b, i3, this.f26684c);
    }

    /* renamed from: D */
    public void m92163D(int i) {
        this.f26675F = i;
    }

    /* renamed from: E */
    public void m92162E(View view) {
        XV2 xv2 = this.f26688g;
        xv2.f43316d = 0.0f;
        xv2.f43317e = 0.0f;
        xv2.m76924p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f26690i.m93843j(view);
    }

    /* renamed from: F */
    public void m92161F(C33428Ht6 c33428Ht6, View view, int i, int i2, int i3) {
        XV2 xv2 = this.f26688g;
        xv2.f43316d = 0.0f;
        xv2.f43317e = 0.0f;
        Rect rect = new Rect();
        if (i != 1) {
            if (i == 2) {
                int i4 = c33428Ht6.f14144b + c33428Ht6.f14146d;
                rect.left = i3 - (((c33428Ht6.f14145c + c33428Ht6.f14147e) + c33428Ht6.m103240b()) / 2);
                rect.top = (i4 - c33428Ht6.m103241a()) / 2;
                rect.right = rect.left + c33428Ht6.m103240b();
                rect.bottom = rect.top + c33428Ht6.m103241a();
            }
        } else {
            int i5 = c33428Ht6.f14144b + c33428Ht6.f14146d;
            rect.left = ((c33428Ht6.f14145c + c33428Ht6.f14147e) - c33428Ht6.m103240b()) / 2;
            rect.top = i2 - ((i5 + c33428Ht6.m103241a()) / 2);
            rect.right = rect.left + c33428Ht6.m103240b();
            rect.bottom = rect.top + c33428Ht6.m103241a();
        }
        this.f26688g.m76924p(rect.left, rect.top, rect.width(), rect.height());
        this.f26690i.m93845h(rect, view, i, c33428Ht6.f14143a);
    }

    /* renamed from: G */
    public void m92160G(Rect rect, C11515b c11515b, int i, int i2) {
        int i3 = c11515b.f54078d;
        if (i3 != 0) {
            m92166A(rect, this.f26682a, i3, i, i2);
        }
        XV2 xv2 = this.f26688g;
        xv2.f43316d = 0.0f;
        xv2.f43317e = 0.0f;
        m92132y(xv2);
        this.f26688g.m76924p(rect.left, rect.top, rect.width(), rect.height());
        C11515b.C11516a m67849A = c11515b.m67849A(this.f26684c);
        this.f26688g.m76939a(m67849A);
        this.f26694m = m67849A.f54085d.f54179g;
        this.f26690i.m93844i(rect, c11515b, i3, this.f26684c);
        this.f26676G = m67849A.f54087f.f54201i;
        C11515b.C11519c c11519c = m67849A.f54085d;
        this.f26678I = c11519c.f54183k;
        this.f26679J = c11519c.f54182j;
        Context context = this.f26683b.getContext();
        C11515b.C11519c c11519c2 = m67849A.f54085d;
        this.f26680K = m92141p(context, c11519c2.f54185m, c11519c2.f54184l, c11519c2.f54186n);
    }

    /* renamed from: H */
    public void m92159H(View view) {
        this.f26683b = view;
        this.f26684c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f26686e = ((ConstraintLayout.LayoutParams) layoutParams).m67881a();
        }
    }

    /* renamed from: I */
    public void m92158I(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        XV2 xv2;
        C11512a c11512a;
        int i3;
        AbstractC34364Lt6 m96238h;
        C11512a c11512a2;
        int i4;
        Integer num;
        AbstractC33194Gt6 m104612g;
        C11512a c11512a3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i5 = this.f26675F;
        if (i5 != AbstractC37078Xj2.f43729f) {
            this.f26688g.f43324l = i5;
        }
        this.f26690i.m93847f(this.f26691j, hashSet2);
        ArrayList<AbstractC37078Xj2> arrayList2 = this.f26670A;
        if (arrayList2 != null) {
            Iterator<AbstractC37078Xj2> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                AbstractC37078Xj2 next = it.next();
                if (next instanceof C32641Ek2) {
                    C32641Ek2 c32641Ek2 = (C32641Ek2) next;
                    m92134w(new XV2(i, i2, c32641Ek2, this.f26688g, this.f26689h));
                    int i6 = c32641Ek2.f10056g;
                    if (i6 != AbstractC37078Xj2.f43729f) {
                        this.f26687f = i6;
                    }
                } else if (next instanceof C41115fk2) {
                    next.mo40948d(hashSet3);
                } else if (next instanceof C34513Mk2) {
                    next.mo40948d(hashSet);
                } else if (next instanceof C34747Nk2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C34747Nk2) next);
                } else {
                    next.mo60992h(hashMap);
                    next.mo40948d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i7 = 0;
        if (arrayList != null) {
            this.f26674E = (C34747Nk2[]) arrayList.toArray(new C34747Nk2[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f26672C = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<AbstractC37078Xj2> it3 = this.f26670A.iterator();
                    while (it3.hasNext()) {
                        AbstractC37078Xj2 next3 = it3.next();
                        HashMap<String, C11512a> hashMap2 = next3.f43734e;
                        if (hashMap2 != null && (c11512a3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.f43730a, c11512a3);
                        }
                    }
                    m104612g = AbstractC33194Gt6.m104613f(next2, sparseArray);
                } else {
                    m104612g = AbstractC33194Gt6.m104612g(next2);
                }
                if (m104612g != null) {
                    m104612g.m77075d(next2);
                    this.f26672C.put(next2, m104612g);
                }
            }
            ArrayList<AbstractC37078Xj2> arrayList3 = this.f26670A;
            if (arrayList3 != null) {
                Iterator<AbstractC37078Xj2> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    AbstractC37078Xj2 next4 = it4.next();
                    if (next4 instanceof C39319ck2) {
                        next4.mo40951a(this.f26672C);
                    }
                }
            }
            this.f26690i.m93852a(this.f26672C, 0);
            this.f26691j.m93852a(this.f26672C, 100);
            for (String str2 : this.f26672C.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 0;
                }
                AbstractC33194Gt6 abstractC33194Gt6 = this.f26672C.get(str2);
                if (abstractC33194Gt6 != null) {
                    abstractC33194Gt6.mo77074e(i4);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f26671B == null) {
                this.f26671B = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.f26671B.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<AbstractC37078Xj2> it6 = this.f26670A.iterator();
                        while (it6.hasNext()) {
                            AbstractC37078Xj2 next6 = it6.next();
                            HashMap<String, C11512a> hashMap3 = next6.f43734e;
                            if (hashMap3 != null && (c11512a2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.f43730a, c11512a2);
                            }
                        }
                        m96238h = AbstractC34364Lt6.m96239g(next5, sparseArray2);
                    } else {
                        m96238h = AbstractC34364Lt6.m96238h(next5, j);
                    }
                    if (m96238h != null) {
                        m96238h.m34497d(next5);
                        this.f26671B.put(next5, m96238h);
                    }
                }
            }
            ArrayList<AbstractC37078Xj2> arrayList4 = this.f26670A;
            if (arrayList4 != null) {
                Iterator<AbstractC37078Xj2> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    AbstractC37078Xj2 next7 = it7.next();
                    if (next7 instanceof C34513Mk2) {
                        ((C34513Mk2) next7).m94938U(this.f26671B);
                    }
                }
            }
            for (String str4 : this.f26671B.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i3 = hashMap.get(str4).intValue();
                } else {
                    i3 = 0;
                }
                this.f26671B.get(str4).mo34496e(i3);
            }
        }
        int i8 = 2;
        int size = this.f26706y.size() + 2;
        XV2[] xv2Arr = new XV2[size];
        xv2Arr[0] = this.f26688g;
        xv2Arr[size - 1] = this.f26689h;
        if (this.f26706y.size() > 0 && this.f26687f == -1) {
            this.f26687f = 0;
        }
        Iterator<XV2> it8 = this.f26706y.iterator();
        int i9 = 1;
        while (it8.hasNext()) {
            xv2Arr[i9] = it8.next();
            i9++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f26689h.f43328p.keySet()) {
            if (this.f26688g.f43328p.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f26702u = strArr2;
        this.f26703v = new int[strArr2.length];
        int i10 = 0;
        while (true) {
            strArr = this.f26702u;
            if (i10 >= strArr.length) {
                break;
            }
            String str6 = strArr[i10];
            this.f26703v[i10] = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (xv2Arr[i11].f43328p.containsKey(str6) && (c11512a = xv2Arr[i11].f43328p.get(str6)) != null) {
                    int[] iArr = this.f26703v;
                    iArr[i10] = iArr[i10] + c11512a.m67854h();
                    break;
                }
                i11++;
            }
            i10++;
        }
        if (xv2Arr[0].f43324l != AbstractC37078Xj2.f43729f) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 1; i12 < size; i12++) {
            xv2Arr[i12].m76936d(xv2Arr[i12 - 1], zArr, this.f26702u, z);
        }
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        this.f26699r = new int[i13];
        int max = Math.max(2, i13);
        this.f26700s = new double[max];
        this.f26701t = new double[max];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.f26699r[i15] = i16;
                i15++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, size, this.f26699r.length);
        double[] dArr2 = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            xv2Arr[i17].m76935e(dArr[i17], this.f26699r);
            dArr2[i17] = xv2Arr[i17].f43316d;
        }
        int i18 = 0;
        while (true) {
            int[] iArr2 = this.f26699r;
            if (i18 >= iArr2.length) {
                break;
            }
            if (iArr2[i18] < XV2.f43313u.length) {
                String str7 = XV2.f43313u[this.f26699r[i18]] + " [";
                for (int i19 = 0; i19 < size; i19++) {
                    str7 = str7 + dArr[i19][i18];
                }
            }
            i18++;
        }
        this.f26692k = new AbstractC42603iF0[this.f26702u.length + 1];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.f26702u;
            if (i20 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i20];
            int i21 = i7;
            int i22 = i21;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i21 < size) {
                if (xv2Arr[i21].m76929k(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i8];
                        iArr3[c] = xv2Arr[i21].m76931i(str8);
                        iArr3[i7] = size;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr3);
                    }
                    XV2 xv22 = xv2Arr[i21];
                    dArr3[i22] = xv22.f43316d;
                    xv22.m76932h(str8, dArr4[i22], 0);
                    i22++;
                }
                i21++;
                i8 = 2;
                i7 = 0;
                c = 1;
            }
            i20++;
            this.f26692k[i20] = AbstractC42603iF0.m34285a(this.f26687f, Arrays.copyOf(dArr3, i22), (double[][]) Arrays.copyOf(dArr4, i22));
            i8 = 2;
            i7 = 0;
            c = 1;
        }
        this.f26692k[0] = AbstractC42603iF0.m34285a(this.f26687f, dArr2, dArr);
        if (xv2Arr[0].f43324l != AbstractC37078Xj2.f43729f) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
            for (int i23 = 0; i23 < size; i23++) {
                iArr4[i23] = xv2Arr[i23].f43324l;
                dArr5[i23] = xv2.f43316d;
                double[] dArr7 = dArr6[i23];
                dArr7[0] = xv2.f43318f;
                dArr7[1] = xv2.f43319g;
            }
            this.f26693l = AbstractC42603iF0.m34284b(iArr4, dArr5, dArr6);
        }
        this.f26673D = new HashMap<>();
        if (this.f26670A != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                AbstractC50685vs6 m7878i = AbstractC50685vs6.m7878i(next8);
                if (m7878i != null) {
                    if (m7878i.m37765h() && Float.isNaN(f2)) {
                        f2 = m92138s();
                    }
                    m7878i.m37767f(next8);
                    this.f26673D.put(next8, m7878i);
                }
            }
            Iterator<AbstractC37078Xj2> it10 = this.f26670A.iterator();
            while (it10.hasNext()) {
                AbstractC37078Xj2 next9 = it10.next();
                if (next9 instanceof C41115fk2) {
                    ((C41115fk2) next9).m40953Y(this.f26673D);
                }
            }
            for (AbstractC50685vs6 abstractC50685vs6 : this.f26673D.values()) {
                abstractC50685vs6.m37766g(f2);
            }
        }
    }

    /* renamed from: J */
    public void m92157J(OV2 ov2) {
        this.f26688g.m76921s(ov2, ov2.f26688g);
        this.f26689h.m76921s(ov2, ov2.f26689h);
    }

    /* renamed from: a */
    public void m92156a(AbstractC37078Xj2 abstractC37078Xj2) {
        this.f26670A.add(abstractC37078Xj2);
    }

    /* renamed from: b */
    public void m92155b(ArrayList<AbstractC37078Xj2> arrayList) {
        this.f26670A.addAll(arrayList);
    }

    /* renamed from: c */
    public int m92154c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] mo34278h = this.f26692k[0].mo34278h();
        if (iArr != null) {
            Iterator<XV2> it = this.f26706y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f43329q;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < mo34278h.length; i3++) {
            this.f26692k[0].mo34282d(mo34278h[i3], this.f26700s);
            this.f26688g.m76934f(mo34278h[i3], this.f26699r, this.f26700s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: d */
    public void m92153d(float[] fArr, int i) {
        AbstractC33194Gt6 abstractC33194Gt6;
        AbstractC33194Gt6 abstractC33194Gt62;
        AbstractC50685vs6 abstractC50685vs6;
        double d;
        float f;
        float f2 = 1.0f;
        float f3 = 1.0f / (i - 1);
        HashMap<String, AbstractC33194Gt6> hashMap = this.f26672C;
        AbstractC50685vs6 abstractC50685vs62 = null;
        if (hashMap == null) {
            abstractC33194Gt6 = null;
        } else {
            abstractC33194Gt6 = hashMap.get("translationX");
        }
        HashMap<String, AbstractC33194Gt6> hashMap2 = this.f26672C;
        if (hashMap2 == null) {
            abstractC33194Gt62 = null;
        } else {
            abstractC33194Gt62 = hashMap2.get("translationY");
        }
        HashMap<String, AbstractC50685vs6> hashMap3 = this.f26673D;
        if (hashMap3 == null) {
            abstractC50685vs6 = null;
        } else {
            abstractC50685vs6 = hashMap3.get("translationX");
        }
        HashMap<String, AbstractC50685vs6> hashMap4 = this.f26673D;
        if (hashMap4 != null) {
            abstractC50685vs62 = hashMap4.get("translationY");
        }
        AbstractC50685vs6 abstractC50685vs63 = abstractC50685vs62;
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f3;
            float f5 = this.f26696o;
            float f6 = 0.0f;
            if (f5 != f2) {
                float f7 = this.f26695n;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, f2);
                }
            }
            float f8 = f4;
            double d2 = f8;
            C41363g91 c41363g91 = this.f26688g.f43314b;
            Iterator<XV2> it = this.f26706y.iterator();
            float f9 = Float.NaN;
            while (it.hasNext()) {
                XV2 next = it.next();
                C41363g91 c41363g912 = next.f43314b;
                double d3 = d2;
                if (c41363g912 != null) {
                    float f10 = next.f43316d;
                    if (f10 < f8) {
                        f6 = f10;
                        c41363g91 = c41363g912;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.f43316d;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (c41363g91 != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d = (((float) c41363g91.mo39969a((f8 - f6) / f)) * (f9 - f6)) + f6;
            } else {
                d = d4;
            }
            this.f26692k[0].mo34282d(d, this.f26700s);
            AbstractC42603iF0 abstractC42603iF0 = this.f26693l;
            if (abstractC42603iF0 != null) {
                double[] dArr = this.f26700s;
                if (dArr.length > 0) {
                    abstractC42603iF0.mo34282d(d, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f26688g.m76934f(d, this.f26699r, this.f26700s, fArr, i3);
            if (abstractC50685vs6 != null) {
                fArr[i3] = fArr[i3] + abstractC50685vs6.m37771a(f8);
            } else if (abstractC33194Gt6 != null) {
                fArr[i3] = fArr[i3] + abstractC33194Gt6.m77078a(f8);
            }
            if (abstractC50685vs63 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + abstractC50685vs63.m37771a(f8);
            } else if (abstractC33194Gt62 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + abstractC33194Gt62.m77078a(f8);
            }
            i2 = i4 + 1;
            f2 = 1.0f;
        }
    }

    /* renamed from: e */
    public void m92152e(float f, float[] fArr, int i) {
        this.f26692k[0].mo34282d(m92150g(f, null), this.f26700s);
        this.f26688g.m76930j(this.f26699r, this.f26700s, fArr, i);
    }

    /* renamed from: f */
    public void m92151f(boolean z) {
        float f;
        if ("button".equals(FU0.m107117d(this.f26683b)) && this.f26674E != null) {
            int i = 0;
            while (true) {
                C34747Nk2[] c34747Nk2Arr = this.f26674E;
                if (i < c34747Nk2Arr.length) {
                    C34747Nk2 c34747Nk2 = c34747Nk2Arr[i];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    c34747Nk2.m93502y(f, this.f26683b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final float m92150g(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f26696o;
            if (f4 != 1.0d) {
                float f5 = this.f26695n;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C41363g91 c41363g91 = this.f26688g.f43314b;
        Iterator<XV2> it = this.f26706y.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            XV2 next = it.next();
            C41363g91 c41363g912 = next.f43314b;
            if (c41363g912 != null) {
                float f7 = next.f43316d;
                if (f7 < f) {
                    c41363g91 = c41363g912;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f43316d;
                }
            }
        }
        if (c41363g91 != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            f = (((float) c41363g91.mo39969a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) c41363g91.mo39968b(d);
            }
        }
        return f;
    }

    /* renamed from: h */
    public int m92149h() {
        return this.f26688g.f43325m;
    }

    /* renamed from: i */
    public void m92148i(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f26692k[0].mo34282d(d, dArr);
        this.f26692k[0].mo34279g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f26688g.m76933g(d, this.f26699r, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: j */
    public float m92147j() {
        return this.f26697p;
    }

    /* renamed from: k */
    public float m92146k() {
        return this.f26698q;
    }

    /* renamed from: l */
    public void m92145l(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float m92150g = m92150g(f, this.f26707z);
        AbstractC42603iF0[] abstractC42603iF0Arr = this.f26692k;
        int i = 0;
        if (abstractC42603iF0Arr != null) {
            double d = m92150g;
            abstractC42603iF0Arr[0].mo34279g(d, this.f26701t);
            this.f26692k[0].mo34282d(d, this.f26700s);
            float f4 = this.f26707z[0];
            while (true) {
                dArr = this.f26701t;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            AbstractC42603iF0 abstractC42603iF0 = this.f26693l;
            if (abstractC42603iF0 != null) {
                double[] dArr2 = this.f26700s;
                if (dArr2.length > 0) {
                    abstractC42603iF0.mo34282d(d, dArr2);
                    this.f26693l.mo34279g(d, this.f26701t);
                    this.f26688g.m76923q(f2, f3, fArr, this.f26699r, this.f26701t, this.f26700s);
                    return;
                }
                return;
            }
            this.f26688g.m76923q(f2, f3, fArr, this.f26699r, dArr, this.f26700s);
            return;
        }
        XV2 xv2 = this.f26689h;
        float f5 = xv2.f43318f;
        XV2 xv22 = this.f26688g;
        float f6 = f5 - xv22.f43318f;
        float f7 = xv2.f43319g - xv22.f43319g;
        float f8 = (xv2.f43320h - xv22.f43320h) + f6;
        float f9 = (xv2.f43321i - xv22.f43321i) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: m */
    public int m92144m() {
        int i = this.f26688g.f43315c;
        Iterator<XV2> it = this.f26706y.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f43315c);
        }
        return Math.max(i, this.f26689h.f43315c);
    }

    /* renamed from: n */
    public float m92143n() {
        return this.f26689h.f43318f;
    }

    /* renamed from: o */
    public float m92142o() {
        return this.f26689h.f43319g;
    }

    /* renamed from: q */
    public XV2 m92140q(int i) {
        return this.f26706y.get(i);
    }

    /* renamed from: r */
    public void m92139r(float f, int i, int i2, float f2, float f3, float[] fArr) {
        AbstractC33194Gt6 abstractC33194Gt6;
        AbstractC33194Gt6 abstractC33194Gt62;
        AbstractC33194Gt6 abstractC33194Gt63;
        AbstractC33194Gt6 abstractC33194Gt64;
        AbstractC33194Gt6 abstractC33194Gt65;
        AbstractC50685vs6 abstractC50685vs6;
        AbstractC50685vs6 abstractC50685vs62;
        AbstractC50685vs6 abstractC50685vs63;
        AbstractC50685vs6 abstractC50685vs64;
        float m92150g = m92150g(f, this.f26707z);
        HashMap<String, AbstractC33194Gt6> hashMap = this.f26672C;
        AbstractC50685vs6 abstractC50685vs65 = null;
        if (hashMap == null) {
            abstractC33194Gt6 = null;
        } else {
            abstractC33194Gt6 = hashMap.get("translationX");
        }
        HashMap<String, AbstractC33194Gt6> hashMap2 = this.f26672C;
        if (hashMap2 == null) {
            abstractC33194Gt62 = null;
        } else {
            abstractC33194Gt62 = hashMap2.get("translationY");
        }
        HashMap<String, AbstractC33194Gt6> hashMap3 = this.f26672C;
        if (hashMap3 == null) {
            abstractC33194Gt63 = null;
        } else {
            abstractC33194Gt63 = hashMap3.get("rotation");
        }
        HashMap<String, AbstractC33194Gt6> hashMap4 = this.f26672C;
        if (hashMap4 == null) {
            abstractC33194Gt64 = null;
        } else {
            abstractC33194Gt64 = hashMap4.get("scaleX");
        }
        HashMap<String, AbstractC33194Gt6> hashMap5 = this.f26672C;
        if (hashMap5 == null) {
            abstractC33194Gt65 = null;
        } else {
            abstractC33194Gt65 = hashMap5.get("scaleY");
        }
        HashMap<String, AbstractC50685vs6> hashMap6 = this.f26673D;
        if (hashMap6 == null) {
            abstractC50685vs6 = null;
        } else {
            abstractC50685vs6 = hashMap6.get("translationX");
        }
        HashMap<String, AbstractC50685vs6> hashMap7 = this.f26673D;
        if (hashMap7 == null) {
            abstractC50685vs62 = null;
        } else {
            abstractC50685vs62 = hashMap7.get("translationY");
        }
        HashMap<String, AbstractC50685vs6> hashMap8 = this.f26673D;
        if (hashMap8 == null) {
            abstractC50685vs63 = null;
        } else {
            abstractC50685vs63 = hashMap8.get("rotation");
        }
        HashMap<String, AbstractC50685vs6> hashMap9 = this.f26673D;
        if (hashMap9 == null) {
            abstractC50685vs64 = null;
        } else {
            abstractC50685vs64 = hashMap9.get("scaleX");
        }
        HashMap<String, AbstractC50685vs6> hashMap10 = this.f26673D;
        if (hashMap10 != null) {
            abstractC50685vs65 = hashMap10.get("scaleY");
        }
        C49460to6 c49460to6 = new C49460to6();
        c49460to6.m11755b();
        c49460to6.m11753d(abstractC33194Gt63, m92150g);
        c49460to6.m11749h(abstractC33194Gt6, abstractC33194Gt62, m92150g);
        c49460to6.m11751f(abstractC33194Gt64, abstractC33194Gt65, m92150g);
        c49460to6.m11754c(abstractC50685vs63, m92150g);
        c49460to6.m11750g(abstractC50685vs6, abstractC50685vs62, m92150g);
        c49460to6.m11752e(abstractC50685vs64, abstractC50685vs65, m92150g);
        AbstractC42603iF0 abstractC42603iF0 = this.f26693l;
        if (abstractC42603iF0 != null) {
            double[] dArr = this.f26700s;
            if (dArr.length > 0) {
                double d = m92150g;
                abstractC42603iF0.mo34282d(d, dArr);
                this.f26693l.mo34279g(d, this.f26701t);
                this.f26688g.m76923q(f2, f3, fArr, this.f26699r, this.f26701t, this.f26700s);
            }
            c49460to6.m11756a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f26692k != null) {
            double m92150g2 = m92150g(m92150g, this.f26707z);
            this.f26692k[0].mo34279g(m92150g2, this.f26701t);
            this.f26692k[0].mo34282d(m92150g2, this.f26700s);
            float f4 = this.f26707z[0];
            while (true) {
                double[] dArr2 = this.f26701t;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * f4;
                    i3++;
                } else {
                    this.f26688g.m76923q(f2, f3, fArr, this.f26699r, dArr2, this.f26700s);
                    c49460to6.m11756a(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            XV2 xv2 = this.f26689h;
            float f5 = xv2.f43318f;
            XV2 xv22 = this.f26688g;
            float f6 = f5 - xv22.f43318f;
            float f7 = xv2.f43319g - xv22.f43319g;
            AbstractC50685vs6 abstractC50685vs66 = abstractC50685vs64;
            float f8 = (xv2.f43321i - xv22.f43321i) + f7;
            fArr[0] = (f6 * (1.0f - f2)) + (((xv2.f43320h - xv22.f43320h) + f6) * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f8 * f3);
            c49460to6.m11755b();
            c49460to6.m11753d(abstractC33194Gt63, m92150g);
            c49460to6.m11749h(abstractC33194Gt6, abstractC33194Gt62, m92150g);
            c49460to6.m11751f(abstractC33194Gt64, abstractC33194Gt65, m92150g);
            c49460to6.m11754c(abstractC50685vs63, m92150g);
            c49460to6.m11750g(abstractC50685vs6, abstractC50685vs62, m92150g);
            c49460to6.m11752e(abstractC50685vs66, abstractC50685vs65, m92150g);
            c49460to6.m11756a(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: s */
    public final float m92138s() {
        char c;
        float f;
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f4 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f5 = i * f3;
            double d3 = f5;
            C41363g91 c41363g91 = this.f26688g.f43314b;
            Iterator<XV2> it = this.f26706y.iterator();
            float f6 = Float.NaN;
            float f7 = 0.0f;
            while (it.hasNext()) {
                XV2 next = it.next();
                C41363g91 c41363g912 = next.f43314b;
                if (c41363g912 != null) {
                    float f8 = next.f43316d;
                    if (f8 < f5) {
                        c41363g91 = c41363g912;
                        f7 = f8;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.f43316d;
                    }
                }
            }
            if (c41363g91 != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d3 = (((float) c41363g91.mo39969a((f5 - f7) / f2)) * (f6 - f7)) + f7;
            }
            this.f26692k[0].mo34282d(d3, this.f26700s);
            float f9 = f4;
            int i2 = i;
            this.f26688g.m76934f(d3, this.f26699r, this.f26700s, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (f9 + Math.hypot(d2 - fArr[1], d - fArr[0]));
            } else {
                c = 0;
                f = f9;
            }
            d = fArr[c];
            i = i2 + 1;
            f4 = f;
            d2 = fArr[1];
        }
        return f4;
    }

    /* renamed from: t */
    public float m92137t() {
        return this.f26688g.f43318f;
    }

    public String toString() {
        return " start: x: " + this.f26688g.f43318f + " y: " + this.f26688g.f43319g + " end: x: " + this.f26689h.f43318f + " y: " + this.f26689h.f43319g;
    }

    /* renamed from: u */
    public float m92136u() {
        return this.f26688g.f43319g;
    }

    /* renamed from: v */
    public View m92135v() {
        return this.f26683b;
    }

    /* renamed from: w */
    public final void m92134w(XV2 xv2) {
        int binarySearch = Collections.binarySearch(this.f26706y, xv2);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + xv2.f43317e + "\" outside of range");
        }
        this.f26706y.add((-binarySearch) - 1, xv2);
    }

    /* renamed from: x */
    public boolean m92133x(View view, float f, long j, C39930dk2 c39930dk2) {
        AbstractC34364Lt6.C5113d c5113d;
        boolean z;
        int i;
        double d;
        View view2;
        float f2;
        float m92150g = m92150g(f, null);
        int i2 = this.f26678I;
        if (i2 != AbstractC37078Xj2.f43729f) {
            float f3 = 1.0f / i2;
            float floor = ((float) Math.floor(m92150g / f3)) * f3;
            float f4 = (m92150g % f3) / f3;
            if (!Float.isNaN(this.f26679J)) {
                f4 = (f4 + this.f26679J) % 1.0f;
            }
            Interpolator interpolator = this.f26680K;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f4);
            } else if (f4 > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            m92150g = (f2 * f3) + floor;
        }
        float f5 = m92150g;
        HashMap<String, AbstractC33194Gt6> hashMap = this.f26672C;
        if (hashMap != null) {
            for (AbstractC33194Gt6 abstractC33194Gt6 : hashMap.values()) {
                abstractC33194Gt6.mo104609h(view, f5);
            }
        }
        HashMap<String, AbstractC34364Lt6> hashMap2 = this.f26671B;
        if (hashMap2 != null) {
            AbstractC34364Lt6.C5113d c5113d2 = null;
            boolean z2 = false;
            for (AbstractC34364Lt6 abstractC34364Lt6 : hashMap2.values()) {
                if (abstractC34364Lt6 instanceof AbstractC34364Lt6.C5113d) {
                    c5113d2 = (AbstractC34364Lt6.C5113d) abstractC34364Lt6;
                } else {
                    z2 |= abstractC34364Lt6.mo96235i(view, f5, j, c39930dk2);
                }
            }
            z = z2;
            c5113d = c5113d2;
        } else {
            c5113d = null;
            z = false;
        }
        AbstractC42603iF0[] abstractC42603iF0Arr = this.f26692k;
        if (abstractC42603iF0Arr != null) {
            double d2 = f5;
            abstractC42603iF0Arr[0].mo34282d(d2, this.f26700s);
            this.f26692k[0].mo34279g(d2, this.f26701t);
            AbstractC42603iF0 abstractC42603iF0 = this.f26693l;
            if (abstractC42603iF0 != null) {
                double[] dArr = this.f26700s;
                if (dArr.length > 0) {
                    abstractC42603iF0.mo34282d(d2, dArr);
                    this.f26693l.mo34279g(d2, this.f26701t);
                }
            }
            if (!this.f26681L) {
                d = d2;
                this.f26688g.m76922r(f5, view, this.f26699r, this.f26700s, this.f26701t, null, this.f26685d);
                this.f26685d = false;
            } else {
                d = d2;
            }
            if (this.f26676G != AbstractC37078Xj2.f43729f) {
                if (this.f26677H == null) {
                    this.f26677H = ((View) view.getParent()).findViewById(this.f26676G);
                }
                if (this.f26677H != null) {
                    float top = (view2.getTop() + this.f26677H.getBottom()) / 2.0f;
                    float left = (this.f26677H.getLeft() + this.f26677H.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, AbstractC33194Gt6> hashMap3 = this.f26672C;
            if (hashMap3 != null) {
                for (AbstractC33194Gt6 abstractC33194Gt62 : hashMap3.values()) {
                    if (abstractC33194Gt62 instanceof AbstractC33194Gt6.C2973d) {
                        double[] dArr2 = this.f26701t;
                        if (dArr2.length > 1) {
                            ((AbstractC33194Gt6.C2973d) abstractC33194Gt62).m104610i(view, f5, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (c5113d != null) {
                double[] dArr3 = this.f26701t;
                i = 1;
                z |= c5113d.m96236j(view, c39930dk2, f5, j, dArr3[0], dArr3[1]);
            } else {
                i = 1;
            }
            int i3 = i;
            while (true) {
                AbstractC42603iF0[] abstractC42603iF0Arr2 = this.f26692k;
                if (i3 >= abstractC42603iF0Arr2.length) {
                    break;
                }
                abstractC42603iF0Arr2[i3].mo34281e(d, this.f26705x);
                C46754pF0.m19738b(this.f26688g.f43328p.get(this.f26702u[i3 - 1]), view, this.f26705x);
                i3++;
            }
            NV2 nv2 = this.f26690i;
            if (nv2.f24659c == 0) {
                if (f5 <= 0.0f) {
                    view.setVisibility(nv2.f24660d);
                } else if (f5 >= 1.0f) {
                    view.setVisibility(this.f26691j.f24660d);
                } else if (this.f26691j.f24660d != nv2.f24660d) {
                    view.setVisibility(0);
                }
            }
            if (this.f26674E != null) {
                int i4 = 0;
                while (true) {
                    C34747Nk2[] c34747Nk2Arr = this.f26674E;
                    if (i4 >= c34747Nk2Arr.length) {
                        break;
                    }
                    c34747Nk2Arr[i4].m93502y(f5, view);
                    i4++;
                }
            }
        } else {
            i = 1;
            XV2 xv2 = this.f26688g;
            float f6 = xv2.f43318f;
            XV2 xv22 = this.f26689h;
            float f7 = f6 + ((xv22.f43318f - f6) * f5);
            float f8 = xv2.f43319g;
            float f9 = f8 + ((xv22.f43319g - f8) * f5);
            float f10 = xv2.f43320h;
            float f11 = xv22.f43320h;
            float f12 = xv2.f43321i;
            float f13 = xv22.f43321i;
            float f14 = f7 + 0.5f;
            int i5 = (int) f14;
            float f15 = f9 + 0.5f;
            int i6 = (int) f15;
            int i7 = (int) (f14 + ((f11 - f10) * f5) + f10);
            int i8 = (int) (f15 + ((f13 - f12) * f5) + f12);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (f11 != f10 || f13 != f12 || this.f26685d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                this.f26685d = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap<String, AbstractC50685vs6> hashMap4 = this.f26673D;
        if (hashMap4 != null) {
            for (AbstractC50685vs6 abstractC50685vs6 : hashMap4.values()) {
                if (abstractC50685vs6 instanceof AbstractC50685vs6.C29679d) {
                    double[] dArr4 = this.f26701t;
                    ((AbstractC50685vs6.C29679d) abstractC50685vs6).m7876k(view, f5, dArr4[0], dArr4[i]);
                } else {
                    abstractC50685vs6.mo7875j(view, f5);
                }
            }
        }
        return z;
    }

    /* renamed from: y */
    public final void m92132y(XV2 xv2) {
        xv2.m76924p((int) this.f26683b.getX(), (int) this.f26683b.getY(), this.f26683b.getWidth(), this.f26683b.getHeight());
    }

    /* renamed from: z */
    public void m92131z() {
        this.f26685d = true;
    }
}
