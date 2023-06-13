package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.QuickLinkIcon;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WireQuickLink;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002¨\u0006\u0010"}, m28432d2 = {"LcI3;", "", "Lco/bird/android/model/wire/WireInventoryPart;", "part", "Lio/reactivex/F;", "", "LH6;", "b", "partDetails", DateTokenConverter.CONVERTER_KEY, "e", "Lco/bird/android/model/wire/WireQuickLink;", "relatedLinks", "f", "<init>", "()V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartDetailsConverter.kt\nco/bird/android/feature/operatorinventory/adapter/PartDetailsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n*S KotlinDebug\n*F\n+ 1 PartDetailsConverter.kt\nco/bird/android/feature/operatorinventory/adapter/PartDetailsConverter\n*L\n33#1:52\n33#1:53,3\n*E\n"})
/* renamed from: cI3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39058cI3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cI3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13485a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuickLinkIcon.values().length];
            try {
                iArr[QuickLinkIcon.SHOPPING_CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuickLinkIcon.BOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuickLinkIcon.SHIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuickLinkIcon.WRENCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: c */
    public static final List m61617c(C39058cI3 this$0, WireInventoryPart part) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(part, "$part");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m61616d(part), this$0.m61615e(), this$0.m61614f(part.getRelatedLinks())});
        return listOfNotNull;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m61618b(final WireInventoryPart part) {
        Intrinsics.checkNotNullParameter(part, "part");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: bI3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m61617c;
                m61617c = C39058cI3.m61617c(C39058cI3.this, part);
                return m61617c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…part.relatedLinks))\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m61616d(WireInventoryPart wireInventoryPart) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(wireInventoryPart, C52965zj4.item_part_details, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m61615e() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C52965zj4.item_part_details_scan_another_part, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: f */
    public final C3023H6 m61614f(List<WireQuickLink> list) {
        int collectionSizeOrDefault;
        List mutableList;
        int i;
        Integer valueOf;
        if (list.isEmpty()) {
            return null;
        }
        List<WireQuickLink> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireQuickLink wireQuickLink : list2) {
            QuickLinkIcon icon = wireQuickLink.getIcon();
            if (icon == null) {
                i = -1;
            } else {
                i = C13485a.$EnumSwitchMapping$0[icon.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(C48193rg4.ic_wrench);
                        }
                    } else {
                        valueOf = Integer.valueOf(C48193rg4.ic_shield);
                    }
                } else {
                    valueOf = Integer.valueOf(C48193rg4.ic_book);
                }
            } else {
                valueOf = Integer.valueOf(C48193rg4.ic_shopping_cart);
            }
            arrayList.add(new C2637G6(new C37170Xt4(wireQuickLink, valueOf), C52965zj4.item_part_related_links, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(new ArrayList(), new C2637G6(new C3023H6(mutableList, null, null, 6, null), C52965zj4.item_part_related_links_section, false, 4, null), null, 4, null);
    }
}
