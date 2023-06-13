package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C11878a;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
public class C11942p {

    /* renamed from: a */
    public final InterfaceC11943a f55577a;

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11943a {
        /* renamed from: a */
        C11878a.C11880b mo66168a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo66167b(C11878a.C11880b c11880b);
    }

    public C11942p(InterfaceC11943a interfaceC11943a) {
        this.f55577a = interfaceC11943a;
    }

    /* renamed from: a */
    public final int m66174a(List<C11878a.C11880b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f55358a == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m66173b(List<C11878a.C11880b> list) {
        while (true) {
            int m66174a = m66174a(list);
            if (m66174a != -1) {
                m66171d(list, m66174a, m66174a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m66172c(List<C11878a.C11880b> list, int i, C11878a.C11880b c11880b, int i2, C11878a.C11880b c11880b2) {
        int i3;
        int i4 = c11880b.f55361d;
        int i5 = c11880b2.f55359b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = c11880b.f55359b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            c11880b.f55359b = i6 + c11880b2.f55361d;
        }
        int i7 = c11880b2.f55359b;
        if (i7 <= i4) {
            c11880b.f55361d = i4 + c11880b2.f55361d;
        }
        c11880b2.f55359b = i7 + i3;
        list.set(i, c11880b2);
        list.set(i2, c11880b);
    }

    /* renamed from: d */
    public final void m66171d(List<C11878a.C11880b> list, int i, int i2) {
        C11878a.C11880b c11880b = list.get(i);
        C11878a.C11880b c11880b2 = list.get(i2);
        int i3 = c11880b2.f55358a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 4) {
                    m66169f(list, i, c11880b, i2, c11880b2);
                    return;
                }
                return;
            }
            m66170e(list, i, c11880b, i2, c11880b2);
            return;
        }
        m66172c(list, i, c11880b, i2, c11880b2);
    }

    /* renamed from: e */
    public void m66170e(List<C11878a.C11880b> list, int i, C11878a.C11880b c11880b, int i2, C11878a.C11880b c11880b2) {
        boolean z;
        int i3 = c11880b.f55359b;
        int i4 = c11880b.f55361d;
        boolean z2 = false;
        if (i3 < i4) {
            if (c11880b2.f55359b == i3 && c11880b2.f55361d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (c11880b2.f55359b == i4 + 1 && c11880b2.f55361d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = c11880b2.f55359b;
        if (i4 < i5) {
            c11880b2.f55359b = i5 - 1;
        } else {
            int i6 = c11880b2.f55361d;
            if (i4 < i5 + i6) {
                c11880b2.f55361d = i6 - 1;
                c11880b.f55358a = 2;
                c11880b.f55361d = 1;
                if (c11880b2.f55361d == 0) {
                    list.remove(i2);
                    this.f55577a.mo66167b(c11880b2);
                    return;
                }
                return;
            }
        }
        int i7 = c11880b.f55359b;
        int i8 = c11880b2.f55359b;
        C11878a.C11880b c11880b3 = null;
        if (i7 <= i8) {
            c11880b2.f55359b = i8 + 1;
        } else {
            int i9 = c11880b2.f55361d;
            if (i7 < i8 + i9) {
                c11880b3 = this.f55577a.mo66168a(2, i7 + 1, (i8 + i9) - i7, null);
                c11880b2.f55361d = c11880b.f55359b - c11880b2.f55359b;
            }
        }
        if (z2) {
            list.set(i, c11880b2);
            list.remove(i2);
            this.f55577a.mo66167b(c11880b);
            return;
        }
        if (z) {
            if (c11880b3 != null) {
                int i10 = c11880b.f55359b;
                if (i10 > c11880b3.f55359b) {
                    c11880b.f55359b = i10 - c11880b3.f55361d;
                }
                int i11 = c11880b.f55361d;
                if (i11 > c11880b3.f55359b) {
                    c11880b.f55361d = i11 - c11880b3.f55361d;
                }
            }
            int i12 = c11880b.f55359b;
            if (i12 > c11880b2.f55359b) {
                c11880b.f55359b = i12 - c11880b2.f55361d;
            }
            int i13 = c11880b.f55361d;
            if (i13 > c11880b2.f55359b) {
                c11880b.f55361d = i13 - c11880b2.f55361d;
            }
        } else {
            if (c11880b3 != null) {
                int i14 = c11880b.f55359b;
                if (i14 >= c11880b3.f55359b) {
                    c11880b.f55359b = i14 - c11880b3.f55361d;
                }
                int i15 = c11880b.f55361d;
                if (i15 >= c11880b3.f55359b) {
                    c11880b.f55361d = i15 - c11880b3.f55361d;
                }
            }
            int i16 = c11880b.f55359b;
            if (i16 >= c11880b2.f55359b) {
                c11880b.f55359b = i16 - c11880b2.f55361d;
            }
            int i17 = c11880b.f55361d;
            if (i17 >= c11880b2.f55359b) {
                c11880b.f55361d = i17 - c11880b2.f55361d;
            }
        }
        list.set(i, c11880b2);
        if (c11880b.f55359b != c11880b.f55361d) {
            list.set(i2, c11880b);
        } else {
            list.remove(i2);
        }
        if (c11880b3 != null) {
            list.add(i, c11880b3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m66169f(List<C11878a.C11880b> list, int i, C11878a.C11880b c11880b, int i2, C11878a.C11880b c11880b2) {
        C11878a.C11880b mo66168a;
        int i3;
        int i4;
        int i5 = c11880b.f55361d;
        int i6 = c11880b2.f55359b;
        C11878a.C11880b c11880b3 = null;
        if (i5 < i6) {
            c11880b2.f55359b = i6 - 1;
        } else {
            int i7 = c11880b2.f55361d;
            if (i5 < i6 + i7) {
                c11880b2.f55361d = i7 - 1;
                mo66168a = this.f55577a.mo66168a(4, c11880b.f55359b, 1, c11880b2.f55360c);
                i3 = c11880b.f55359b;
                i4 = c11880b2.f55359b;
                if (i3 > i4) {
                    c11880b2.f55359b = i4 + 1;
                } else {
                    int i8 = c11880b2.f55361d;
                    if (i3 < i4 + i8) {
                        int i9 = (i4 + i8) - i3;
                        c11880b3 = this.f55577a.mo66168a(4, i3 + 1, i9, c11880b2.f55360c);
                        c11880b2.f55361d -= i9;
                    }
                }
                list.set(i2, c11880b);
                if (c11880b2.f55361d <= 0) {
                    list.set(i, c11880b2);
                } else {
                    list.remove(i);
                    this.f55577a.mo66167b(c11880b2);
                }
                if (mo66168a != null) {
                    list.add(i, mo66168a);
                }
                if (c11880b3 == null) {
                    list.add(i, c11880b3);
                    return;
                }
                return;
            }
        }
        mo66168a = null;
        i3 = c11880b.f55359b;
        i4 = c11880b2.f55359b;
        if (i3 > i4) {
        }
        list.set(i2, c11880b);
        if (c11880b2.f55361d <= 0) {
        }
        if (mo66168a != null) {
        }
        if (c11880b3 == null) {
        }
    }
}
