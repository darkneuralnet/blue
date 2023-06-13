package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WirePartCategory;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u000b"}, m28432d2 = {"Ls72;", "", "", "Lco/bird/android/model/wire/WirePartCategory;", "categories", "Lio/reactivex/F;", "LH6;", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryCategoryConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryCategoryConverter.kt\nco/bird/android/feature/operatorinventory/adapter/InventoryCategoryConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1603#2,9:27\n1855#2:36\n1856#2:38\n1612#2:39\n1#3:37\n*S KotlinDebug\n*F\n+ 1 InventoryCategoryConverter.kt\nco/bird/android/feature/operatorinventory/adapter/InventoryCategoryConverter\n*L\n17#1:27,9\n17#1:36\n17#1:38\n17#1:39\n17#1:37\n*E\n"})
/* renamed from: s72  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48459s72 {
    /* renamed from: c */
    public static final List m14765c(C48459s72 this$0, List categories) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(categories, "$categories");
        return this$0.m14764d(categories);
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m14766b(final List<WirePartCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: r72
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m14765c;
                m14765c = C48459s72.m14765c(C48459s72.this, categories);
                return m14765c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n    gener…rySection(categories)\n  }");
        return m33161E;
    }

    /* renamed from: d */
    public final List<C3023H6> m14764d(List<WirePartCategory> list) {
        List mutableList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (WirePartCategory wirePartCategory : list) {
            arrayList2.add(new C2637G6(wirePartCategory, C52965zj4.item_category_selection, false, 4, null));
        }
        if (!arrayList2.isEmpty()) {
            C2637G6 c2637g6 = new C2637G6(null, C52965zj4.item_header_section, false, 4, null);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            arrayList.add(new C3023H6(mutableList, c2637g6, null, 4, null));
        }
        return arrayList;
    }
}
