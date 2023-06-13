package p000;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u000f\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0016\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0018\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001a\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0002\u001aD\u0010$\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0001H\u0002\u001a,\u0010*\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002\u001a,\u0010,\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002¨\u0006-"}, m28432d2 = {"", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "F", "", "L", "P", "J", "Q", "H", "I", "value", "", "X", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "U", "B", "A", "T", "D", "M", "O", "Y", "R", "Z", "G", "W", "E", "anchor", "V", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "K", "Ljava/util/ArrayList;", "Ldb;", "Lkotlin/collections/ArrayList;", "location", "effectiveSize", "S", "index", "N", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3443:1\n82#2,3:3444\n33#2,4:3447\n85#2,2:3451\n38#2:3453\n87#2:3454\n1#3:3455\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3246#1:3444,3\n3246#1:3447,4\n3246#1:3451,2\n3246#1:3453\n3246#1:3454\n*E\n"})
/* renamed from: pE5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46750pE5 {
    /* renamed from: A */
    public static final int m19792A(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return m19789D(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* renamed from: B */
    public static final boolean m19791B(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 201326592) != 0;
    }

    /* renamed from: C */
    public static final boolean m19790C(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    /* renamed from: D */
    public static final int m19789D(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: E */
    public static final int m19788E(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: F */
    public static final int m19787F(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* renamed from: G */
    public static final int m19786G(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* renamed from: H */
    public static final boolean m19785H(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* renamed from: I */
    public static final boolean m19784I(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 134217728) != 0;
    }

    /* renamed from: J */
    public static final boolean m19783J(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    /* renamed from: K */
    public static final void m19782K(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (z) {
            i5 = 1073741824;
        } else {
            i5 = 0;
        }
        if (z2) {
            i6 = 536870912;
        } else {
            i6 = 0;
        }
        if (z3) {
            i7 = 268435456;
        } else {
            i7 = 0;
        }
        int i8 = i * 5;
        iArr[i8 + 0] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* renamed from: L */
    public static final boolean m19781L(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    /* renamed from: M */
    public static final int m19780M(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* renamed from: N */
    public static final int m19779N(ArrayList<C19797db> arrayList, int i, int i2) {
        int m19774S = m19774S(arrayList, i, i2);
        return m19774S >= 0 ? m19774S : -(m19774S + 1);
    }

    /* renamed from: O */
    public static final int m19778O(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* renamed from: P */
    public static final int m19777P(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: Q */
    public static final int m19776Q(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m19789D(iArr[i2 + 1] >> 30);
    }

    /* renamed from: R */
    public static final int m19775R(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* renamed from: S */
    public static final int m19774S(ArrayList<C19797db> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int m44095a = arrayList.get(i4).m44095a();
            if (m44095a < 0) {
                m44095a += i2;
            }
            int compare = Intrinsics.compare(m44095a, i);
            if (compare < 0) {
                i3 = i4 + 1;
            } else if (compare > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: T */
    public static final int m19773T(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m19789D(iArr[i2 + 1] >> 28);
    }

    /* renamed from: U */
    public static final void m19772U(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 67108864;
        } else {
            iArr[i2] = iArr[i2] & (-67108865);
        }
    }

    /* renamed from: V */
    public static final void m19771V(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* renamed from: W */
    public static final void m19770W(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C35528Qt0.m87818X(z);
        iArr[(i * 5) + 3] = i2;
    }

    /* renamed from: X */
    public static final void m19769X(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & (-134217729);
        }
    }

    /* renamed from: Y */
    public static final void m19768Y(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0 && i2 < 67108863) {
            z = true;
        } else {
            z = false;
        }
        C35528Qt0.m87818X(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* renamed from: Z */
    public static final void m19767Z(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m19764c(int[] iArr, int i) {
        return m19790C(iArr, i);
    }

    /* renamed from: g */
    public static final /* synthetic */ int m19760g(int[] iArr, int i) {
        return m19786G(iArr, i);
    }

    /* renamed from: s */
    public static final /* synthetic */ int m19748s(ArrayList arrayList, int i, int i2) {
        return m19774S(arrayList, i, i2);
    }
}
