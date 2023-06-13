package p000;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import net.danlew.android.joda.DateUtils;
import p000.C50897wE3;
/* renamed from: rm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48249rm0 {

    /* renamed from: g */
    public static final Comparator<C27995b> f107586g = new C27994a();

    /* renamed from: a */
    public final int[] f107587a;

    /* renamed from: b */
    public final int[] f107588b;

    /* renamed from: c */
    public final List<C50897wE3.C29816d> f107589c;

    /* renamed from: e */
    public final C50897wE3.InterfaceC29815c[] f107591e;

    /* renamed from: f */
    public final float[] f107592f = new float[3];

    /* renamed from: d */
    public final TimingLogger f107590d = null;

    /* renamed from: rm0$a */
    /* loaded from: classes.dex */
    public static class C27994a implements Comparator<C27995b> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C27995b c27995b, C27995b c27995b2) {
            return c27995b2.m15410g() - c27995b.m15410g();
        }
    }

    /* renamed from: rm0$b */
    /* loaded from: classes.dex */
    public class C27995b {

        /* renamed from: a */
        public int f107593a;

        /* renamed from: b */
        public int f107594b;

        /* renamed from: c */
        public int f107595c;

        /* renamed from: d */
        public int f107596d;

        /* renamed from: e */
        public int f107597e;

        /* renamed from: f */
        public int f107598f;

        /* renamed from: g */
        public int f107599g;

        /* renamed from: h */
        public int f107600h;

        /* renamed from: i */
        public int f107601i;

        public C27995b(int i, int i2) {
            this.f107593a = i;
            this.f107594b = i2;
            m15414c();
        }

        /* renamed from: a */
        public final boolean m15416a() {
            return m15412e() > 1;
        }

        /* renamed from: b */
        public final int m15415b() {
            int m15411f = m15411f();
            C48249rm0 c48249rm0 = C48249rm0.this;
            int[] iArr = c48249rm0.f107587a;
            int[] iArr2 = c48249rm0.f107588b;
            C48249rm0.m15428e(iArr, m15411f, this.f107593a, this.f107594b);
            Arrays.sort(iArr, this.f107593a, this.f107594b + 1);
            C48249rm0.m15428e(iArr, m15411f, this.f107593a, this.f107594b);
            int i = this.f107595c / 2;
            int i2 = this.f107593a;
            int i3 = 0;
            while (true) {
                int i4 = this.f107594b;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.f107593a;
                }
            }
        }

        /* renamed from: c */
        public final void m15414c() {
            C48249rm0 c48249rm0 = C48249rm0.this;
            int[] iArr = c48249rm0.f107587a;
            int[] iArr2 = c48249rm0.f107588b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f107593a; i8 <= this.f107594b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int m15422k = C48249rm0.m15422k(i9);
                int m15423j = C48249rm0.m15423j(i9);
                int m15424i = C48249rm0.m15424i(i9);
                if (m15422k > i2) {
                    i2 = m15422k;
                }
                if (m15422k < i) {
                    i = m15422k;
                }
                if (m15423j > i3) {
                    i3 = m15423j;
                }
                if (m15423j < i6) {
                    i6 = m15423j;
                }
                if (m15424i > i4) {
                    i4 = m15424i;
                }
                if (m15424i < i7) {
                    i7 = m15424i;
                }
            }
            this.f107596d = i;
            this.f107597e = i2;
            this.f107598f = i6;
            this.f107599g = i3;
            this.f107600h = i7;
            this.f107601i = i4;
            this.f107595c = i5;
        }

        /* renamed from: d */
        public final C50897wE3.C29816d m15413d() {
            C48249rm0 c48249rm0 = C48249rm0.this;
            int[] iArr = c48249rm0.f107587a;
            int[] iArr2 = c48249rm0.f107588b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f107593a; i5 <= this.f107594b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C48249rm0.m15422k(i6) * i7;
                i3 += C48249rm0.m15423j(i6) * i7;
                i4 += i7 * C48249rm0.m15424i(i6);
            }
            float f = i2;
            return new C50897wE3.C29816d(C48249rm0.m15431b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        /* renamed from: e */
        public final int m15412e() {
            return (this.f107594b + 1) - this.f107593a;
        }

        /* renamed from: f */
        public final int m15411f() {
            int i = this.f107597e - this.f107596d;
            int i2 = this.f107599g - this.f107598f;
            int i3 = this.f107601i - this.f107600h;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 >= i && i2 >= i3) {
                return -2;
            }
            return -1;
        }

        /* renamed from: g */
        public final int m15410g() {
            return ((this.f107597e - this.f107596d) + 1) * ((this.f107599g - this.f107598f) + 1) * ((this.f107601i - this.f107600h) + 1);
        }

        /* renamed from: h */
        public final C27995b m15409h() {
            if (m15416a()) {
                int m15415b = m15415b();
                C27995b c27995b = new C27995b(m15415b + 1, this.f107594b);
                this.f107594b = m15415b;
                m15414c();
                return c27995b;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public C48249rm0(int[] iArr, int i, C50897wE3.InterfaceC29815c[] interfaceC29815cArr) {
        this.f107591e = interfaceC29815cArr;
        int[] iArr2 = new int[DateUtils.FORMAT_ABBREV_WEEKDAY];
        this.f107588b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int m15426g = m15426g(iArr[i2]);
            iArr[i2] = m15426g;
            iArr2[m15426g] = iArr2[m15426g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m15421l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f107587a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.f107589c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f107589c.add(new C50897wE3.C29816d(m15432a(i8), iArr2[i8]));
            }
            return;
        }
        this.f107589c = m15425h(i);
    }

    /* renamed from: a */
    public static int m15432a(int i) {
        return m15431b(m15422k(i), m15423j(i), m15424i(i));
    }

    /* renamed from: b */
    public static int m15431b(int i, int i2, int i3) {
        return Color.rgb(m15427f(i, 5, 8), m15427f(i2, 5, 8), m15427f(i3, 5, 8));
    }

    /* renamed from: e */
    public static void m15428e(int[] iArr, int i, int i2, int i3) {
        if (i != -2) {
            if (i == -1) {
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = m15422k(i4) | (m15424i(i4) << 10) | (m15423j(i4) << 5);
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = m15424i(i5) | (m15423j(i5) << 10) | (m15422k(i5) << 5);
            i2++;
        }
    }

    /* renamed from: f */
    public static int m15427f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: g */
    public static int m15426g(int i) {
        return m15427f(Color.blue(i), 8, 5) | (m15427f(Color.red(i), 8, 5) << 10) | (m15427f(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: i */
    public static int m15424i(int i) {
        return i & 31;
    }

    /* renamed from: j */
    public static int m15423j(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: k */
    public static int m15422k(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: c */
    public final List<C50897wE3.C29816d> m15430c(Collection<C27995b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C27995b c27995b : collection) {
            C50897wE3.C29816d m15413d = c27995b.m15413d();
            if (!m15419n(m15413d)) {
                arrayList.add(m15413d);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C50897wE3.C29816d> m15429d() {
        return this.f107589c;
    }

    /* renamed from: h */
    public final List<C50897wE3.C29816d> m15425h(int i) {
        PriorityQueue<C27995b> priorityQueue = new PriorityQueue<>(i, f107586g);
        priorityQueue.offer(new C27995b(0, this.f107587a.length - 1));
        m15418o(priorityQueue, i);
        return m15430c(priorityQueue);
    }

    /* renamed from: l */
    public final boolean m15421l(int i) {
        int m15432a = m15432a(i);
        C33827Jm0.m99853h(m15432a, this.f107592f);
        return m15420m(m15432a, this.f107592f);
    }

    /* renamed from: m */
    public final boolean m15420m(int i, float[] fArr) {
        C50897wE3.InterfaceC29815c[] interfaceC29815cArr = this.f107591e;
        if (interfaceC29815cArr != null && interfaceC29815cArr.length > 0) {
            int length = interfaceC29815cArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f107591e[i2].mo7174a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m15419n(C50897wE3.C29816d c29816d) {
        return m15420m(c29816d.m7169e(), c29816d.m7171c());
    }

    /* renamed from: o */
    public final void m15418o(PriorityQueue<C27995b> priorityQueue, int i) {
        C27995b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.m15416a()) {
            priorityQueue.offer(poll.m15409h());
            priorityQueue.offer(poll);
        }
    }
}
