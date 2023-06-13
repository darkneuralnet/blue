package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public class C11905h {

    /* renamed from: a */
    public static final Comparator<C11909d> f55432a = new C11906a();

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    public class C11906a implements Comparator<C11909d> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C11909d c11909d, C11909d c11909d2) {
            return c11909d.f55435a - c11909d2.f55435a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11907b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    /* loaded from: classes.dex */
    public static class C11908c {

        /* renamed from: a */
        public final int[] f55433a;

        /* renamed from: b */
        public final int f55434b;

        public C11908c(int i) {
            int[] iArr = new int[i];
            this.f55433a = iArr;
            this.f55434b = iArr.length / 2;
        }

        /* renamed from: a */
        public int[] m66269a() {
            return this.f55433a;
        }

        /* renamed from: b */
        public int m66268b(int i) {
            return this.f55433a[i + this.f55434b];
        }

        /* renamed from: c */
        public void m66267c(int i, int i2) {
            this.f55433a[i + this.f55434b] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    /* loaded from: classes.dex */
    public static class C11909d {

        /* renamed from: a */
        public final int f55435a;

        /* renamed from: b */
        public final int f55436b;

        /* renamed from: c */
        public final int f55437c;

        public C11909d(int i, int i2, int i3) {
            this.f55435a = i;
            this.f55436b = i2;
            this.f55437c = i3;
        }

        /* renamed from: a */
        public int m66266a() {
            return this.f55435a + this.f55437c;
        }

        /* renamed from: b */
        public int m66265b() {
            return this.f55436b + this.f55437c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$e */
    /* loaded from: classes.dex */
    public static class C11910e {

        /* renamed from: a */
        public final List<C11909d> f55438a;

        /* renamed from: b */
        public final int[] f55439b;

        /* renamed from: c */
        public final int[] f55440c;

        /* renamed from: d */
        public final AbstractC11907b f55441d;

        /* renamed from: e */
        public final int f55442e;

        /* renamed from: f */
        public final int f55443f;

        /* renamed from: g */
        public final boolean f55444g;

        public C11910e(AbstractC11907b abstractC11907b, List<C11909d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f55438a = list;
            this.f55439b = iArr;
            this.f55440c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f55441d = abstractC11907b;
            this.f55442e = abstractC11907b.getOldListSize();
            this.f55443f = abstractC11907b.getNewListSize();
            this.f55444g = z;
            m66264a();
            m66259f();
        }

        /* renamed from: h */
        public static C11912g m66257h(Collection<C11912g> collection, int i, boolean z) {
            C11912g c11912g;
            Iterator<C11912g> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    c11912g = it.next();
                    if (c11912g.f55445a == i && c11912g.f55447c == z) {
                        it.remove();
                        break;
                    }
                } else {
                    c11912g = null;
                    break;
                }
            }
            while (it.hasNext()) {
                C11912g next = it.next();
                if (z) {
                    next.f55446b--;
                } else {
                    next.f55446b++;
                }
            }
            return c11912g;
        }

        /* renamed from: a */
        public final void m66264a() {
            C11909d c11909d;
            if (this.f55438a.isEmpty()) {
                c11909d = null;
            } else {
                c11909d = this.f55438a.get(0);
            }
            if (c11909d == null || c11909d.f55435a != 0 || c11909d.f55436b != 0) {
                this.f55438a.add(0, new C11909d(0, 0, 0));
            }
            this.f55438a.add(new C11909d(this.f55442e, this.f55443f, 0));
        }

        /* renamed from: b */
        public int m66263b(int i) {
            if (i >= 0 && i < this.f55442e) {
                int i2 = this.f55439b[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f55442e);
        }

        /* renamed from: c */
        public void m66262c(InterfaceC32011Bs2 interfaceC32011Bs2) {
            C6743QF c6743qf;
            int i;
            if (interfaceC32011Bs2 instanceof C6743QF) {
                c6743qf = (C6743QF) interfaceC32011Bs2;
            } else {
                c6743qf = new C6743QF(interfaceC32011Bs2);
            }
            int i2 = this.f55442e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f55442e;
            int i4 = this.f55443f;
            for (int size = this.f55438a.size() - 1; size >= 0; size--) {
                C11909d c11909d = this.f55438a.get(size);
                int m66266a = c11909d.m66266a();
                int m66265b = c11909d.m66265b();
                while (true) {
                    if (i3 <= m66266a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f55439b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C11912g m66257h = m66257h(arrayDeque, i6, false);
                        if (m66257h != null) {
                            int i7 = (i2 - m66257h.f55446b) - 1;
                            c6743qf.onMoved(i3, i7);
                            if ((i5 & 4) != 0) {
                                c6743qf.onChanged(i7, 1, this.f55441d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C11912g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        c6743qf.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > m66265b) {
                    i4--;
                    int i8 = this.f55440c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C11912g m66257h2 = m66257h(arrayDeque, i9, true);
                        if (m66257h2 == null) {
                            arrayDeque.add(new C11912g(i4, i2 - i3, false));
                        } else {
                            c6743qf.onMoved((i2 - m66257h2.f55446b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                c6743qf.onChanged(i3, 1, this.f55441d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        c6743qf.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i10 = c11909d.f55435a;
                int i11 = c11909d.f55436b;
                for (i = 0; i < c11909d.f55437c; i++) {
                    if ((this.f55439b[i10] & 15) == 2) {
                        c6743qf.onChanged(i10, 1, this.f55441d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = c11909d.f55435a;
                i4 = c11909d.f55436b;
            }
            c6743qf.m88700a();
        }

        /* renamed from: d */
        public void m66261d(RecyclerView.AbstractC11843h abstractC11843h) {
            m66262c(new C11881b(abstractC11843h));
        }

        /* renamed from: e */
        public final void m66260e(int i) {
            int i2;
            int size = this.f55438a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C11909d c11909d = this.f55438a.get(i4);
                while (i3 < c11909d.f55436b) {
                    if (this.f55440c[i3] == 0 && this.f55441d.areItemsTheSame(i, i3)) {
                        if (this.f55441d.areContentsTheSame(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.f55439b[i] = (i3 << 4) | i2;
                        this.f55440c[i3] = (i << 4) | i2;
                        return;
                    }
                    i3++;
                }
                i3 = c11909d.m66265b();
            }
        }

        /* renamed from: f */
        public final void m66259f() {
            int i;
            for (C11909d c11909d : this.f55438a) {
                for (int i2 = 0; i2 < c11909d.f55437c; i2++) {
                    int i3 = c11909d.f55435a + i2;
                    int i4 = c11909d.f55436b + i2;
                    if (this.f55441d.areContentsTheSame(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f55439b[i3] = (i4 << 4) | i;
                    this.f55440c[i4] = (i3 << 4) | i;
                }
            }
            if (this.f55444g) {
                m66258g();
            }
        }

        /* renamed from: g */
        public final void m66258g() {
            int i = 0;
            for (C11909d c11909d : this.f55438a) {
                while (i < c11909d.f55435a) {
                    if (this.f55439b[i] == 0) {
                        m66260e(i);
                    }
                    i++;
                }
                i = c11909d.m66266a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11911f<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$g */
    /* loaded from: classes.dex */
    public static class C11912g {

        /* renamed from: a */
        public int f55445a;

        /* renamed from: b */
        public int f55446b;

        /* renamed from: c */
        public boolean f55447c;

        public C11912g(int i, int i2, boolean z) {
            this.f55445a = i;
            this.f55446b = i2;
            this.f55447c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h */
    /* loaded from: classes.dex */
    public static class C11913h {

        /* renamed from: a */
        public int f55448a;

        /* renamed from: b */
        public int f55449b;

        /* renamed from: c */
        public int f55450c;

        /* renamed from: d */
        public int f55451d;

        public C11913h() {
        }

        /* renamed from: a */
        public int m66256a() {
            return this.f55451d - this.f55450c;
        }

        /* renamed from: b */
        public int m66255b() {
            return this.f55449b - this.f55448a;
        }

        public C11913h(int i, int i2, int i3, int i4) {
            this.f55448a = i;
            this.f55449b = i2;
            this.f55450c = i3;
            this.f55451d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$i */
    /* loaded from: classes.dex */
    public static class C11914i {

        /* renamed from: a */
        public int f55452a;

        /* renamed from: b */
        public int f55453b;

        /* renamed from: c */
        public int f55454c;

        /* renamed from: d */
        public int f55455d;

        /* renamed from: e */
        public boolean f55456e;

        /* renamed from: a */
        public int m66254a() {
            return Math.min(this.f55454c - this.f55452a, this.f55455d - this.f55453b);
        }

        /* renamed from: b */
        public boolean m66253b() {
            return this.f55455d - this.f55453b != this.f55454c - this.f55452a;
        }

        /* renamed from: c */
        public boolean m66252c() {
            return this.f55455d - this.f55453b > this.f55454c - this.f55452a;
        }

        /* renamed from: d */
        public C11909d m66251d() {
            if (m66253b()) {
                if (this.f55456e) {
                    return new C11909d(this.f55452a, this.f55453b, m66254a());
                }
                if (m66252c()) {
                    return new C11909d(this.f55452a, this.f55453b + 1, m66254a());
                }
                return new C11909d(this.f55452a + 1, this.f55453b, m66254a());
            }
            int i = this.f55452a;
            return new C11909d(i, this.f55453b, this.f55454c - i);
        }
    }

    private C11905h() {
    }

    /* renamed from: a */
    public static C11914i m66275a(C11913h c11913h, AbstractC11907b abstractC11907b, C11908c c11908c, C11908c c11908c2, int i) {
        boolean z;
        int m66268b;
        int i2;
        int i3;
        int i4;
        if ((c11913h.m66255b() - c11913h.m66256a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int m66255b = c11913h.m66255b() - c11913h.m66256a();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 != i5 && (i6 == i || c11908c2.m66268b(i6 + 1) >= c11908c2.m66268b(i6 - 1))) {
                m66268b = c11908c2.m66268b(i6 - 1);
                i2 = m66268b - 1;
            } else {
                m66268b = c11908c2.m66268b(i6 + 1);
                i2 = m66268b;
            }
            int i7 = c11913h.f55451d - ((c11913h.f55449b - i2) - i6);
            if (i != 0 && i2 == m66268b) {
                i3 = i7 + 1;
            } else {
                i3 = i7;
            }
            while (i2 > c11913h.f55448a && i7 > c11913h.f55450c && abstractC11907b.areItemsTheSame(i2 - 1, i7 - 1)) {
                i2--;
                i7--;
            }
            c11908c2.m66267c(i6, i2);
            if (z && (i4 = m66255b - i6) >= i5 && i4 <= i && c11908c.m66268b(i4) >= i2) {
                C11914i c11914i = new C11914i();
                c11914i.f55452a = i2;
                c11914i.f55453b = i7;
                c11914i.f55454c = m66268b;
                c11914i.f55455d = i3;
                c11914i.f55456e = true;
                return c11914i;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C11910e m66274b(AbstractC11907b abstractC11907b) {
        return m66273c(abstractC11907b, true);
    }

    /* renamed from: c */
    public static C11910e m66273c(AbstractC11907b abstractC11907b, boolean z) {
        C11913h c11913h;
        int oldListSize = abstractC11907b.getOldListSize();
        int newListSize = abstractC11907b.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C11913h(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        C11908c c11908c = new C11908c(i);
        C11908c c11908c2 = new C11908c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C11913h c11913h2 = (C11913h) arrayList2.remove(arrayList2.size() - 1);
            C11914i m66271e = m66271e(c11913h2, abstractC11907b, c11908c, c11908c2);
            if (m66271e != null) {
                if (m66271e.m66254a() > 0) {
                    arrayList.add(m66271e.m66251d());
                }
                if (arrayList3.isEmpty()) {
                    c11913h = new C11913h();
                } else {
                    c11913h = (C11913h) arrayList3.remove(arrayList3.size() - 1);
                }
                c11913h.f55448a = c11913h2.f55448a;
                c11913h.f55450c = c11913h2.f55450c;
                c11913h.f55449b = m66271e.f55452a;
                c11913h.f55451d = m66271e.f55453b;
                arrayList2.add(c11913h);
                c11913h2.f55449b = c11913h2.f55449b;
                c11913h2.f55451d = c11913h2.f55451d;
                c11913h2.f55448a = m66271e.f55454c;
                c11913h2.f55450c = m66271e.f55455d;
                arrayList2.add(c11913h2);
            } else {
                arrayList3.add(c11913h2);
            }
        }
        Collections.sort(arrayList, f55432a);
        return new C11910e(abstractC11907b, arrayList, c11908c.m66269a(), c11908c2.m66269a(), z);
    }

    /* renamed from: d */
    public static C11914i m66272d(C11913h c11913h, AbstractC11907b abstractC11907b, C11908c c11908c, C11908c c11908c2, int i) {
        int m66268b;
        int i2;
        int i3;
        boolean z = true;
        if (Math.abs(c11913h.m66255b() - c11913h.m66256a()) % 2 != 1) {
            z = false;
        }
        int m66255b = c11913h.m66255b() - c11913h.m66256a();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 != i4 && (i5 == i || c11908c.m66268b(i5 + 1) <= c11908c.m66268b(i5 - 1))) {
                m66268b = c11908c.m66268b(i5 - 1);
                i2 = m66268b + 1;
            } else {
                m66268b = c11908c.m66268b(i5 + 1);
                i2 = m66268b;
            }
            int i6 = (c11913h.f55450c + (i2 - c11913h.f55448a)) - i5;
            int i7 = (i != 0 && i2 == m66268b) ? i6 - 1 : i6;
            while (i2 < c11913h.f55449b && i6 < c11913h.f55451d && abstractC11907b.areItemsTheSame(i2, i6)) {
                i2++;
                i6++;
            }
            c11908c.m66267c(i5, i2);
            if (z && (i3 = m66255b - i5) >= i4 + 1 && i3 <= i - 1 && c11908c2.m66268b(i3) <= i2) {
                C11914i c11914i = new C11914i();
                c11914i.f55452a = m66268b;
                c11914i.f55453b = i7;
                c11914i.f55454c = i2;
                c11914i.f55455d = i6;
                c11914i.f55456e = false;
                return c11914i;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C11914i m66271e(C11913h c11913h, AbstractC11907b abstractC11907b, C11908c c11908c, C11908c c11908c2) {
        if (c11913h.m66255b() >= 1 && c11913h.m66256a() >= 1) {
            int m66255b = ((c11913h.m66255b() + c11913h.m66256a()) + 1) / 2;
            c11908c.m66267c(1, c11913h.f55448a);
            c11908c2.m66267c(1, c11913h.f55449b);
            for (int i = 0; i < m66255b; i++) {
                C11914i m66272d = m66272d(c11913h, abstractC11907b, c11908c, c11908c2, i);
                if (m66272d != null) {
                    return m66272d;
                }
                C11914i m66275a = m66275a(c11913h, abstractC11907b, c11908c, c11908c2, i);
                if (m66275a != null) {
                    return m66275a;
                }
            }
        }
        return null;
    }
}
