package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.UByte;
/* renamed from: LM1 */
/* loaded from: classes6.dex */
public final class LM1 {

    /* renamed from: b */
    public static final String[] f21304b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    public static final int[][] f21305c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    public static final int[][] f21306d;

    /* renamed from: e */
    public static final int[][] f21307e;

    /* renamed from: a */
    public final byte[] f21308a;

    /* renamed from: LM1$a */
    /* loaded from: classes6.dex */
    public class C4890a implements Comparator<C47442qP5> {
        public C4890a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C47442qP5 c47442qP5, C47442qP5 c47442qP52) {
            return c47442qP5.m17536d() - c47442qP52.m17536d();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 5, 256);
        f21306d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f21306d[0][i] = (i - 65) + 2;
        }
        f21306d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f21306d[1][i2] = (i2 - 97) + 2;
        }
        f21306d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f21306d[2][i3] = (i3 - 48) + 2;
        }
        int[] iArr2 = f21306d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f21306d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f21306d[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, 6, 6);
        f21307e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f21307e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public LM1(byte[] bArr) {
        this.f21308a = bArr;
    }

    /* renamed from: b */
    public static Collection<C47442qP5> m97038b(Iterable<C47442qP5> iterable) {
        boolean z;
        LinkedList linkedList = new LinkedList();
        for (C47442qP5 c47442qP5 : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C47442qP5 c47442qP52 = (C47442qP5) it.next();
                    if (c47442qP52.m17534f(c47442qP5)) {
                        z = false;
                        break;
                    } else if (c47442qP5.m17534f(c47442qP52)) {
                        it.remove();
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                linkedList.add(c47442qP5);
            }
        }
        return linkedList;
    }

    /* renamed from: d */
    public static void m97036d(C47442qP5 c47442qP5, int i, int i2, Collection<C47442qP5> collection) {
        C47442qP5 m17538b = c47442qP5.m17538b(i);
        collection.add(m17538b.m17533g(4, i2));
        if (c47442qP5.m17535e() != 4) {
            collection.add(m17538b.m17532h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(m17538b.m17533g(2, 16 - i2).m17533g(2, 1));
        }
        if (c47442qP5.m17537c() > 0) {
            collection.add(c47442qP5.m17539a(i).m17539a(i + 1));
        }
    }

    /* renamed from: f */
    public static Collection<C47442qP5> m97034f(Iterable<C47442qP5> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C47442qP5 c47442qP5 : iterable) {
            m97036d(c47442qP5, i, i2, linkedList);
        }
        return m97038b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1027CT m97039a() {
        byte b;
        int i;
        Collection<C47442qP5> singletonList = Collections.singletonList(C47442qP5.f105274e);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f21308a;
            if (i2 < bArr.length) {
                int i3 = i2 + 1;
                if (i3 < bArr.length) {
                    b = bArr[i3];
                } else {
                    b = 0;
                }
                byte b2 = bArr[i2];
                if (b2 != 13) {
                    if (b2 != 44) {
                        if (b2 != 46) {
                            if (b2 == 58 && b == 32) {
                                i = 5;
                                if (i <= 0) {
                                    singletonList = m97034f(singletonList, i2, i);
                                    i2 = i3;
                                } else {
                                    singletonList = m97035e(singletonList, i2);
                                }
                                i2++;
                            }
                            i = 0;
                            if (i <= 0) {
                            }
                            i2++;
                        } else {
                            if (b == 32) {
                                i = 3;
                                if (i <= 0) {
                                }
                                i2++;
                            }
                            i = 0;
                            if (i <= 0) {
                            }
                            i2++;
                        }
                    } else {
                        if (b == 32) {
                            i = 4;
                            if (i <= 0) {
                            }
                            i2++;
                        }
                        i = 0;
                        if (i <= 0) {
                        }
                        i2++;
                    }
                } else {
                    if (b == 10) {
                        i = 2;
                        if (i <= 0) {
                        }
                        i2++;
                    }
                    i = 0;
                    if (i <= 0) {
                    }
                    i2++;
                }
            } else {
                return ((C47442qP5) Collections.min(singletonList, new C4890a())).m17531i(this.f21308a);
            }
        }
    }

    /* renamed from: c */
    public final void m97037c(C47442qP5 c47442qP5, int i, Collection<C47442qP5> collection) {
        boolean z;
        char c = (char) (this.f21308a[i] & UByte.MAX_VALUE);
        if (f21306d[c47442qP5.m17535e()][c] > 0) {
            z = true;
        } else {
            z = false;
        }
        C47442qP5 c47442qP52 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f21306d[i2][c];
            if (i3 > 0) {
                if (c47442qP52 == null) {
                    c47442qP52 = c47442qP5.m17538b(i);
                }
                if (!z || i2 == c47442qP5.m17535e() || i2 == 2) {
                    collection.add(c47442qP52.m17533g(i2, i3));
                }
                if (!z && f21307e[c47442qP5.m17535e()][i2] >= 0) {
                    collection.add(c47442qP52.m17532h(i2, i3));
                }
            }
        }
        if (c47442qP5.m17537c() > 0 || f21306d[c47442qP5.m17535e()][c] == 0) {
            collection.add(c47442qP5.m17539a(i));
        }
    }

    /* renamed from: e */
    public final Collection<C47442qP5> m97035e(Iterable<C47442qP5> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C47442qP5 c47442qP5 : iterable) {
            m97037c(c47442qP5, i, linkedList);
        }
        return m97038b(linkedList);
    }
}
