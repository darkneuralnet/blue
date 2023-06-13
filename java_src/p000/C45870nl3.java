package p000;

import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.persistence.OperatorFilter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, m28432d2 = {"Lnl3;", "", "", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "LH6;", C17296a.f69688o, "<init>", "()V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorFilterV2Converter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Converter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Converter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n766#2:33\n857#2,2:34\n1549#2:36\n1620#2,3:37\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Converter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Converter\n*L\n16#1:33\n16#1:34,2\n17#1:36\n17#1:37,3\n*E\n"})
/* renamed from: nl3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45870nl3 {

    /* renamed from: a */
    public static final C26580a f100471a = new C26580a(null);

    /* renamed from: b */
    public static final Set<OperatorFilterType> f100472b;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lnl3$a;", "", "", "Lco/bird/android/model/constant/OperatorFilterType;", "VALID_TYPES", "Ljava/util/Set;", "<init>", "()V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nl3$a */
    /* loaded from: classes3.dex */
    public static final class C26580a {
        public /* synthetic */ C26580a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26580a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nl3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26581b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperatorFilterType.values().length];
            try {
                iArr[OperatorFilterType.MULTI_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperatorFilterType.RANGE_SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperatorFilterType.TOGGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Set<OperatorFilterType> of;
        of = SetsKt__SetsKt.setOf((Object[]) new OperatorFilterType[]{OperatorFilterType.MULTI_SELECT, OperatorFilterType.RANGE_SELECT, OperatorFilterType.TOGGLE});
        f100472b = of;
    }

    /* renamed from: a */
    public final List<C3023H6> m23213a(List<? extends OperatorFilter> filters) {
        int collectionSizeOrDefault;
        int i;
        List mutableListOf;
        Intrinsics.checkNotNullParameter(filters, "filters");
        ArrayList<OperatorFilter> arrayList = new ArrayList();
        for (Object obj : filters) {
            if (f100472b.contains(((OperatorFilter) obj).getType())) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (OperatorFilter operatorFilter : arrayList) {
            C2637G6 c2637g6 = new C2637G6(operatorFilter, C37539Zi4.item_operator_filter_title, false, 4, null);
            int i2 = C26581b.$EnumSwitchMapping$0[operatorFilter.getType().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        i = -1;
                    } else {
                        i = C37539Zi4.item_operator_toggle_select_filter;
                    }
                } else {
                    i = C37539Zi4.item_operator_range_select_filter;
                }
            } else {
                i = C37539Zi4.item_operator_multi_select_filter;
            }
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(operatorFilter, i, false, 4, null));
            arrayList2.add(new C3023H6(mutableListOf, c2637g6, null, 4, null));
        }
        return arrayList2;
    }
}
