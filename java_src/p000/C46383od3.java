package p000;

import androidx.recyclerview.widget.C11905h;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a8\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a:\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a,\u0010\u000f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u0010"}, m28432d2 = {"", "T", "Lnd3;", "newList", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "Lmd3;", C17296a.f69688o, "LBs2;", "callback", "diffResult", "", "b", "", "oldPosition", "c", "paging-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: od3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46383od3 {

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"od3$a", "Landroidx/recyclerview/widget/h$b;", "", "oldItemPosition", "newItemPosition", "", "getChangePayload", "getOldListSize", "getNewListSize", "", "areItemsTheSame", "areContentsTheSame", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: od3$a */
    /* loaded from: classes.dex */
    public static final class C27015a extends C11905h.AbstractC11907b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC45790nd3<T> f102214a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC45790nd3<T> f102215b;

        /* renamed from: c */
        public final /* synthetic */ C11905h.AbstractC11911f<T> f102216c;

        /* renamed from: d */
        public final /* synthetic */ int f102217d;

        /* renamed from: e */
        public final /* synthetic */ int f102218e;

        public C27015a(InterfaceC45790nd3<T> interfaceC45790nd3, InterfaceC45790nd3<T> interfaceC45790nd32, C11905h.AbstractC11911f<T> abstractC11911f, int i, int i2) {
            this.f102214a = interfaceC45790nd3;
            this.f102215b = interfaceC45790nd32;
            this.f102216c = abstractC11911f;
            this.f102217d = i;
            this.f102218e = i2;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areContentsTheSame(int i, int i2) {
            Object mo23404f = this.f102214a.mo23404f(i);
            Object mo23404f2 = this.f102215b.mo23404f(i2);
            if (mo23404f == mo23404f2) {
                return true;
            }
            return this.f102216c.areContentsTheSame(mo23404f, mo23404f2);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areItemsTheSame(int i, int i2) {
            Object mo23404f = this.f102214a.mo23404f(i);
            Object mo23404f2 = this.f102215b.mo23404f(i2);
            if (mo23404f == mo23404f2) {
                return true;
            }
            return this.f102216c.areItemsTheSame(mo23404f, mo23404f2);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public Object getChangePayload(int i, int i2) {
            Object mo23404f = this.f102214a.mo23404f(i);
            Object mo23404f2 = this.f102215b.mo23404f(i2);
            if (mo23404f == mo23404f2) {
                return Boolean.TRUE;
            }
            return this.f102216c.getChangePayload(mo23404f, mo23404f2);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getNewListSize() {
            return this.f102218e;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getOldListSize() {
            return this.f102217d;
        }
    }

    /* renamed from: a */
    public static final <T> C45197md3 m20770a(InterfaceC45790nd3<T> interfaceC45790nd3, InterfaceC45790nd3<T> newList, C11905h.AbstractC11911f<T> diffCallback) {
        IntRange until;
        boolean z;
        Intrinsics.checkNotNullParameter(interfaceC45790nd3, "<this>");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        C27015a c27015a = new C27015a(interfaceC45790nd3, newList, diffCallback, interfaceC45790nd3.mo23407b(), newList.mo23407b());
        boolean z2 = true;
        C11905h.C11910e m66273c = C11905h.m66273c(c27015a, true);
        Intrinsics.checkNotNullExpressionValue(m66273c, "NullPaddedList<T>.comput…    },\n        true\n    )");
        until = RangesKt___RangesKt.until(0, interfaceC45790nd3.mo23407b());
        if (!(until instanceof Collection) || !((Collection) until).isEmpty()) {
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                if (m66273c.m66263b(((IntIterator) it).nextInt()) != -1) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        return new C45197md3(m66273c, z2);
    }

    /* renamed from: b */
    public static final <T> void m20769b(InterfaceC45790nd3<T> interfaceC45790nd3, InterfaceC32011Bs2 callback, InterfaceC45790nd3<T> newList, C45197md3 diffResult) {
        Intrinsics.checkNotNullParameter(interfaceC45790nd3, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        if (diffResult.m25304b()) {
            C44933mA3.f97481a.m26204a(interfaceC45790nd3, newList, callback, diffResult);
        } else {
            K51.f19040a.m99252b(callback, interfaceC45790nd3, newList);
        }
    }

    /* renamed from: c */
    public static final int m20768c(InterfaceC45790nd3<?> interfaceC45790nd3, C45197md3 diffResult, InterfaceC45790nd3<?> newList, int i) {
        boolean z;
        IntRange until;
        int coerceIn;
        int i2;
        int m66263b;
        IntRange until2;
        int coerceIn2;
        Intrinsics.checkNotNullParameter(interfaceC45790nd3, "<this>");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(newList, "newList");
        if (!diffResult.m25304b()) {
            until2 = RangesKt___RangesKt.until(0, newList.mo23408a());
            coerceIn2 = RangesKt___RangesKt.coerceIn(i, (ClosedRange<Integer>) until2);
            return coerceIn2;
        }
        int mo23406c = i - interfaceC45790nd3.mo23406c();
        int mo23407b = interfaceC45790nd3.mo23407b();
        if (mo23406c >= 0 && mo23406c < mo23407b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i3 = 0; i3 < 30; i3++) {
                int i4 = i3 / 2;
                if (i3 % 2 == 1) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                int i5 = (i4 * i2) + mo23406c;
                if (i5 >= 0 && i5 < interfaceC45790nd3.mo23407b() && (m66263b = diffResult.m25305a().m66263b(i5)) != -1) {
                    return m66263b + newList.mo23406c();
                }
            }
        }
        until = RangesKt___RangesKt.until(0, newList.mo23408a());
        coerceIn = RangesKt___RangesKt.coerceIn(i, (ClosedRange<Integer>) until);
        return coerceIn;
    }
}
