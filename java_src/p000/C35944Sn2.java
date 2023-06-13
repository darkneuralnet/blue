package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p000.R62;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001am\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042<\u0010\u000e\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007\u001a\u001e\u0010\u0018\u001a\u00020\u000b*\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0001¨\u0006\u0019"}, m28432d2 = {"LPn2;", "T", "LR62;", "intervals", "Lkotlin/ranges/IntRange;", "nearestItemsRange", "Lkotlin/Function2;", "LR62$a;", "Lkotlin/ParameterName;", "name", "interval", "", "index", "", "itemContent", "LRn2;", "b", "(LR62;Lkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function4;)LRn2;", "LsP5;", "delegate", C17296a.f69688o, "", "key", "lastKnownIndex", "c", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Sn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35944Sn2 {
    /* renamed from: a */
    public static final InterfaceC35710Rn2 m84829a(InterfaceC48627sP5<? extends InterfaceC35710Rn2> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new VW0(delegate);
    }

    /* renamed from: b */
    public static final <T extends InterfaceC35242Pn2> InterfaceC35710Rn2 m84828b(R62<? extends T> intervals, IntRange nearestItemsRange, Function4<? super R62.C7065a<? extends T>, ? super Integer, ? super InterfaceC32720Et0, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        return new SX0(itemContent, intervals, nearestItemsRange);
    }

    /* renamed from: c */
    public static final int m84827c(InterfaceC35710Rn2 interfaceC35710Rn2, Object obj, int i) {
        Intrinsics.checkNotNullParameter(interfaceC35710Rn2, "<this>");
        if (obj == null) {
            return i;
        }
        if (i < interfaceC35710Rn2.getItemCount() && Intrinsics.areEqual(obj, interfaceC35710Rn2.mo15369c(i))) {
            return i;
        }
        Integer num = interfaceC35710Rn2.mo15370b().get(obj);
        if (num != null) {
            return num.intValue();
        }
        return i;
    }
}
