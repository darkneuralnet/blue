package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018B!\b\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lry3;", "Lkotlin/collections/AbstractList;", "LM70;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "b", "", "[LM70;", "c", "()[LM70;", "byteStrings", "", "[I", "e", "()[I", "trie", "getSize", "()I", "size", "<init>", "([LM70;[I)V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: ry3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48371ry3 extends AbstractList<M70> implements RandomAccess {

    /* renamed from: d */
    public static final C28077a f107972d = new C28077a(null);

    /* renamed from: b */
    public final M70[] f107973b;

    /* renamed from: c */
    public final int[] f107974c;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007JT\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002R\u0018\u0010\u0016\u001a\u00020\b*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lry3$a;", "", "", "LM70;", "byteStrings", "Lry3;", DateTokenConverter.CONVERTER_KEY, "([LM70;)Lry3;", "", "nodeOffset", "Li30;", "node", "", "byteStringOffset", "", "fromIndex", "toIndex", "indexes", "", C17296a.f69688o, "c", "(Li30;)J", "intCount", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: ry3$a */
    /* loaded from: classes8.dex */
    public static final class C28077a {
        public /* synthetic */ C28077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m14966b(C28077a c28077a, long j, C42488i30 c42488i30, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            long j2;
            int i5;
            int i6;
            int i7;
            if ((i4 & 1) != 0) {
                j2 = 0;
            } else {
                j2 = j;
            }
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 16) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 32) != 0) {
                i7 = list.size();
            } else {
                i7 = i3;
            }
            c28077a.m14967a(j2, c42488i30, i5, list, i6, i7, list2);
        }

        /* renamed from: a */
        public final void m14967a(long j, C42488i30 c42488i30, int i, List<? extends M70> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7;
            C42488i30 c42488i302;
            boolean z3;
            int i8 = i;
            if (i2 < i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (list.get(i9).size() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                M70 m70 = list.get(i2);
                M70 m702 = list.get(i3 - 1);
                int i10 = -1;
                if (i8 == m70.size()) {
                    int i11 = i2 + 1;
                    i4 = i11;
                    i5 = list2.get(i2).intValue();
                    m70 = list.get(i11);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (m70.m95808e(i8) != m702.m95808e(i8)) {
                    int i12 = 1;
                    for (int i13 = i4 + 1; i13 < i3; i13++) {
                        if (list.get(i13 - 1).m95808e(i8) != list.get(i13).m95808e(i8)) {
                            i12++;
                        }
                    }
                    long m14965c = j + m14965c(c42488i30) + 2 + (i12 * 2);
                    c42488i30.mo24533N(i12);
                    c42488i30.mo24533N(i5);
                    for (int i14 = i4; i14 < i3; i14++) {
                        byte m95808e = list.get(i14).m95808e(i8);
                        if (i14 == i4 || m95808e != list.get(i14 - 1).m95808e(i8)) {
                            c42488i30.mo24533N(m95808e & UByte.MAX_VALUE);
                        }
                    }
                    C42488i30 c42488i303 = new C42488i30();
                    while (i4 < i3) {
                        byte m95808e2 = list.get(i4).m95808e(i8);
                        int i15 = i4 + 1;
                        int i16 = i15;
                        while (true) {
                            if (i16 < i3) {
                                if (m95808e2 != list.get(i16).m95808e(i8)) {
                                    i6 = i16;
                                    break;
                                }
                                i16++;
                            } else {
                                i6 = i3;
                                break;
                            }
                        }
                        if (i15 == i6 && i8 + 1 == list.get(i4).size()) {
                            c42488i30.mo24533N(list2.get(i4).intValue());
                            i7 = i6;
                            c42488i302 = c42488i303;
                        } else {
                            c42488i30.mo24533N(((int) (m14965c + m14965c(c42488i303))) * i10);
                            i7 = i6;
                            c42488i302 = c42488i303;
                            m14967a(m14965c, c42488i303, i8 + 1, list, i4, i6, list2);
                        }
                        c42488i303 = c42488i302;
                        i4 = i7;
                        i10 = -1;
                    }
                    c42488i30.mo24532R2(c42488i303);
                    return;
                }
                int min = Math.min(m70.size(), m702.size());
                int i17 = 0;
                for (int i18 = i8; i18 < min && m70.m95808e(i18) == m702.m95808e(i18); i18++) {
                    i17++;
                }
                long m14965c2 = j + m14965c(c42488i30) + 2 + i17 + 1;
                c42488i30.mo24533N(-i17);
                c42488i30.mo24533N(i5);
                int i19 = i8 + i17;
                while (i8 < i19) {
                    c42488i30.mo24533N(m70.m95808e(i8) & UByte.MAX_VALUE);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i19 == list.get(i4).size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        c42488i30.mo24533N(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C42488i30 c42488i304 = new C42488i30();
                c42488i30.mo24533N(((int) (m14965c(c42488i304) + m14965c2)) * (-1));
                m14967a(m14965c2, c42488i304, i19, list, i4, i3, list2);
                c42488i30.mo24532R2(c42488i304);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: c */
        public final long m14965c(C42488i30 c42488i30) {
            return c42488i30.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
            continue;
         */
        @JvmStatic
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C48371ry3 m14964d(M70... byteStrings) {
            boolean z;
            List mutableList;
            List mutableListOf;
            boolean z2;
            boolean z3;
            int binarySearch$default;
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i = 0;
            if (byteStrings.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mutableList = ArraysKt___ArraysKt.toMutableList(byteStrings);
                CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
                ArrayList arrayList = new ArrayList(byteStrings.length);
                for (M70 m70 : byteStrings) {
                    arrayList.add(-1);
                }
                Object[] array = arrayList.toArray(new Integer[0]);
                if (array != null) {
                    Integer[] numArr = (Integer[]) array;
                    mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
                    int length = byteStrings.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (Object) null);
                        mutableListOf.set(binarySearch$default, Integer.valueOf(i3));
                        i2++;
                        i3++;
                    }
                    if (((M70) mutableList.get(0)).size() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        int i4 = 0;
                        while (i4 < mutableList.size()) {
                            M70 m702 = (M70) mutableList.get(i4);
                            int i5 = i4 + 1;
                            int i6 = i5;
                            while (i6 < mutableList.size()) {
                                M70 m703 = (M70) mutableList.get(i6);
                                if (m703.m95799t(m702)) {
                                    if (m703.size() != m702.size()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        if (((Number) mutableListOf.get(i6)).intValue() > ((Number) mutableListOf.get(i4)).intValue()) {
                                            mutableList.remove(i6);
                                            mutableListOf.remove(i6);
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        throw new IllegalArgumentException(("duplicate option: " + m703).toString());
                                    }
                                }
                            }
                            i4 = i5;
                        }
                        C42488i30 c42488i30 = new C42488i30();
                        m14966b(this, 0L, c42488i30, 0, mutableList, 0, 0, mutableListOf, 53, null);
                        int[] iArr = new int[(int) m14965c(c42488i30)];
                        while (!c42488i30.mo21945O2()) {
                            iArr[i] = c42488i30.readInt();
                            i++;
                        }
                        Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                        return new C48371ry3((M70[]) copyOf, iArr, null);
                    }
                    throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            return new C48371ry3(new M70[0], new int[]{0, -1}, null);
        }

        private C28077a() {
        }
    }

    public /* synthetic */ C48371ry3(M70[] m70Arr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(m70Arr, iArr);
    }

    @JvmStatic
    /* renamed from: j */
    public static final C48371ry3 m14968j(M70... m70Arr) {
        return f107972d.m14964d(m70Arr);
    }

    /* renamed from: a */
    public /* bridge */ boolean m14974a(M70 m70) {
        return super.contains(m70);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: b */
    public M70 get(int i) {
        return this.f107973b[i];
    }

    /* renamed from: c */
    public final M70[] m14972c() {
        return this.f107973b;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof M70) {
            return m14974a((M70) obj);
        }
        return false;
    }

    /* renamed from: e */
    public final int[] m14971e() {
        return this.f107974c;
    }

    /* renamed from: f */
    public /* bridge */ int m14970f(M70 m70) {
        return super.indexOf(m70);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f107973b.length;
    }

    /* renamed from: h */
    public /* bridge */ int m14969h(M70 m70) {
        return super.lastIndexOf(m70);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof M70) {
            return m14970f((M70) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof M70) {
            return m14969h((M70) obj);
        }
        return -1;
    }

    public C48371ry3(M70[] m70Arr, int[] iArr) {
        this.f107973b = m70Arr;
        this.f107974c = iArr;
    }
}
