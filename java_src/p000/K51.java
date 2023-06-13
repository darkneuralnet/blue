package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J8\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¨\u0006\u0013"}, m28432d2 = {"LK51;", "", "T", "LBs2;", "callback", "Lnd3;", "oldList", "newList", "", "b", "", "startBoundary", "endBoundary", "start", "end", "payload", C17296a.f69688o, "<init>", "()V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: K51 */
/* loaded from: classes.dex */
public final class K51 {

    /* renamed from: a */
    public static final K51 f19040a = new K51();

    private K51() {
    }

    /* renamed from: a */
    public final void m99253a(InterfaceC32011Bs2 interfaceC32011Bs2, int i, int i2, int i3, int i4, Object obj) {
        int i5 = i - i3;
        if (i5 > 0) {
            interfaceC32011Bs2.onChanged(i3, i5, obj);
        }
        int i6 = i4 - i2;
        if (i6 > 0) {
            interfaceC32011Bs2.onChanged(i2, i6, obj);
        }
    }

    /* renamed from: b */
    public final <T> void m99252b(InterfaceC32011Bs2 callback, InterfaceC45790nd3<T> oldList, InterfaceC45790nd3<T> newList) {
        int coerceAtMost;
        int coerceAtMost2;
        int coerceAtMost3;
        int coerceAtMost4;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        int max = Math.max(oldList.mo23406c(), newList.mo23406c());
        int min = Math.min(oldList.mo23406c() + oldList.mo23407b(), newList.mo23406c() + newList.mo23407b());
        int i = min - max;
        if (i > 0) {
            callback.onRemoved(max, i);
            callback.onInserted(max, i);
        }
        int min2 = Math.min(max, min);
        int max2 = Math.max(max, min);
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(oldList.mo23406c(), newList.mo23408a());
        coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(oldList.mo23406c() + oldList.mo23407b(), newList.mo23408a());
        m99253a(callback, min2, max2, coerceAtMost, coerceAtMost2, O31.ITEM_TO_PLACEHOLDER);
        coerceAtMost3 = RangesKt___RangesKt.coerceAtMost(newList.mo23406c(), oldList.mo23408a());
        coerceAtMost4 = RangesKt___RangesKt.coerceAtMost(newList.mo23406c() + newList.mo23407b(), oldList.mo23408a());
        m99253a(callback, min2, max2, coerceAtMost3, coerceAtMost4, O31.PLACEHOLDER_TO_ITEM);
        int mo23408a = newList.mo23408a() - oldList.mo23408a();
        if (mo23408a > 0) {
            callback.onInserted(oldList.mo23408a(), mo23408a);
        } else if (mo23408a < 0) {
            callback.onRemoved(oldList.mo23408a() + mo23408a, -mo23408a);
        }
    }
}
