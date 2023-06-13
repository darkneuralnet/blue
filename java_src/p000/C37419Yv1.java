package p000;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* renamed from: Yv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37419Yv1 {

    /* renamed from: Yv1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10077a<T> {
        /* renamed from: a */
        void mo4821a(T t, Rect rect);
    }

    /* renamed from: Yv1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC10078b<T, V> {
        /* renamed from: a */
        V mo4819a(T t, int i);

        /* renamed from: b */
        int mo4818b(T t);
    }

    /* renamed from: Yv1$c */
    /* loaded from: classes.dex */
    public static class C10079c<T> implements Comparator<T> {

        /* renamed from: b */
        public final Rect f47627b = new Rect();

        /* renamed from: c */
        public final Rect f47628c = new Rect();

        /* renamed from: d */
        public final boolean f47629d;

        /* renamed from: e */
        public final InterfaceC10077a<T> f47630e;

        public C10079c(boolean z, InterfaceC10077a<T> interfaceC10077a) {
            this.f47629d = z;
            this.f47630e = interfaceC10077a;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f47627b;
            Rect rect2 = this.f47628c;
            this.f47630e.mo4821a(t, rect);
            this.f47630e.mo4821a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (!this.f47629d) {
                    return -1;
                }
                return 1;
            } else if (i3 > i4) {
                if (this.f47629d) {
                    return -1;
                }
                return 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (!this.f47629d) {
                        return -1;
                    }
                    return 1;
                } else if (i7 > i8) {
                    if (this.f47629d) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    private C37419Yv1() {
    }

    /* renamed from: a */
    public static boolean m74008a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m74007b = m74007b(i, rect, rect2);
        if (m74007b(i, rect, rect3) || !m74007b) {
            return false;
        }
        if (m73999j(i, rect, rect3) && i != 17 && i != 66 && m73998k(i, rect, rect2) >= m73996m(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m74007b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static <L, T> T m74006c(L l, InterfaceC10078b<L, T> interfaceC10078b, InterfaceC10077a<T> interfaceC10077a, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int mo4818b = interfaceC10078b.mo4818b(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < mo4818b; i2++) {
            T mo4819a = interfaceC10078b.mo4819a(l, i2);
            if (mo4819a != t) {
                interfaceC10077a.mo4821a(mo4819a, rect3);
                if (m74001h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = mo4819a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m74005d(L l, InterfaceC10078b<L, T> interfaceC10078b, InterfaceC10077a<T> interfaceC10077a, T t, int i, boolean z, boolean z2) {
        int mo4818b = interfaceC10078b.mo4818b(l);
        ArrayList arrayList = new ArrayList(mo4818b);
        for (int i2 = 0; i2 < mo4818b; i2++) {
            arrayList.add(interfaceC10078b.mo4819a(l, i2));
        }
        Collections.sort(arrayList, new C10079c(z, interfaceC10077a));
        if (i != 1) {
            if (i == 2) {
                return (T) m74004e(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) m74003f(t, arrayList, z2);
    }

    /* renamed from: e */
    public static <T> T m74004e(T t, ArrayList<T> arrayList, boolean z) {
        int lastIndexOf;
        int size = arrayList.size();
        if (t == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(t);
        }
        int i = lastIndexOf + 1;
        if (i < size) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    /* renamed from: f */
    public static <T> T m74003f(T t, ArrayList<T> arrayList, boolean z) {
        int indexOf;
        int size = arrayList.size();
        if (t == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(t);
        }
        int i = indexOf - 1;
        if (i >= 0) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    /* renamed from: g */
    public static int m74002g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    public static boolean m74001h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m74000i(rect, rect2, i)) {
            return false;
        }
        if (!m74000i(rect, rect3, i) || m74008a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m74008a(i, rect, rect3, rect2) || m74002g(m73998k(i, rect, rect2), m73994o(i, rect, rect2)) >= m74002g(m73998k(i, rect, rect3), m73994o(i, rect, rect3))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m74000i(Rect rect, Rect rect2, int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 < i3 || rect.bottom <= i3) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 > i7 || rect.top >= i7) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 > i9 || rect.left >= i9) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m73999j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        if (rect.bottom <= rect2.top) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public static int m73998k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m73997l(i, rect, rect2));
    }

    /* renamed from: l */
    public static int m73997l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return i2 - i3;
    }

    /* renamed from: m */
    public static int m73996m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m73995n(i, rect, rect2));
    }

    /* renamed from: n */
    public static int m73995n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.bottom;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.right;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.top;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.left;
        }
        return i2 - i3;
    }

    /* renamed from: o */
    public static int m73994o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
