package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\u001aF\u0010\u000b\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¨\u0006\f"}, m28432d2 = {"", "Lxo2;", "composedVisibleItems", "LGo2;", "itemProvider", "", "", "headerIndexes", "beforeContentPadding", "layoutWidth", "layoutHeight", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,94:1\n1#2:95\n69#3,6:96\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:96,6\n*E\n"})
/* renamed from: ko2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44120ko2 {
    /* renamed from: a */
    public static final C51827xo2 m28437a(List<C51827xo2> composedVisibleItems, C33145Go2 itemProvider, List<Integer> headerIndexes, int i, int i2, int i3) {
        Object first;
        int i4;
        int i5;
        int lastIndex;
        Intrinsics.checkNotNullParameter(composedVisibleItems, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) composedVisibleItems);
        int index = ((C51827xo2) first).getIndex();
        int size = headerIndexes.size();
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        while (i8 < size && headerIndexes.get(i8).intValue() <= index) {
            i6 = headerIndexes.get(i8).intValue();
            i8++;
            if (i8 >= 0) {
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(headerIndexes);
                if (i8 <= lastIndex) {
                    i5 = headerIndexes.get(i8);
                    i7 = i5.intValue();
                }
            }
            i5 = -1;
            i7 = i5.intValue();
        }
        int size2 = composedVisibleItems.size();
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < size2; i12++) {
            C51827xo2 c51827xo2 = composedVisibleItems.get(i12);
            if (c51827xo2.getIndex() == i6) {
                i9 = c51827xo2.mo4639b();
                i11 = i12;
            } else if (c51827xo2.getIndex() == i7) {
                i10 = c51827xo2.mo4639b();
            }
        }
        if (i6 == -1) {
            return null;
        }
        C32677Eo2 m104711a = itemProvider.m104711a(KS0.m98880b(i6));
        if (i9 != Integer.MIN_VALUE) {
            i4 = Math.max(-i, i9);
        } else {
            i4 = -i;
        }
        if (i10 != Integer.MIN_VALUE) {
            i4 = Math.min(i4, i10 - m104711a.m108350d());
        }
        C51827xo2 m108348f = m104711a.m108348f(i4, i2, i3);
        if (i11 != -1) {
            composedVisibleItems.set(i11, m108348f);
        } else {
            composedVisibleItems.add(0, m108348f);
        }
        return m108348f;
    }
}
