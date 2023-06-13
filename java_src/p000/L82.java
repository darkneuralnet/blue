package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireInventoryPart;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u000b"}, m28432d2 = {"LL82;", "", "", "Lco/bird/android/model/wire/WireInventoryPart;", "parts", "Lio/reactivex/F;", "LH6;", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryPartConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryPartConverter.kt\nco/bird/android/feature/operatorinventory/adapter/InventoryPartConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1603#2,9:24\n1855#2:33\n1856#2:35\n1612#2:36\n1#3:34\n*S KotlinDebug\n*F\n+ 1 InventoryPartConverter.kt\nco/bird/android/feature/operatorinventory/adapter/InventoryPartConverter\n*L\n17#1:24,9\n17#1:33\n17#1:35\n17#1:36\n17#1:34\n*E\n"})
/* renamed from: L82 */
/* loaded from: classes3.dex */
public final class L82 {
    /* renamed from: c */
    public static final List m97669c(L82 this$0, List parts) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parts, "$parts");
        return this$0.m97668d(parts);
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m97670b(final List<WireInventoryPart> parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: K82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m97669c;
                m97669c = L82.m97669c(L82.this, parts);
                return m97669c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n    generatePartSection(parts)\n  }");
        return m33161E;
    }

    /* renamed from: d */
    public final List<C3023H6> m97668d(List<WireInventoryPart> list) {
        List mutableList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (WireInventoryPart wireInventoryPart : list) {
            arrayList2.add(new C2637G6(wireInventoryPart, C52965zj4.item_part_selection, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        arrayList.add(new C3023H6(mutableList, null, null, 6, null));
        return arrayList;
    }
}
