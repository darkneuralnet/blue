package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.NonRepair;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairFlow;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.constant.QuickLinkIcon;
import co.bird.android.model.wire.WireQuickLink;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LWE4;", "", "Lco/bird/android/model/RepairFlow;", "repairFlow", "", "LH6;", C17296a.f69688o, "e", "Lco/bird/android/model/RepairCategory;", "category", "c", "Lco/bird/android/model/wire/WireQuickLink;", "quickLinks", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3OverviewConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewConverter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1549#2:105\n1620#2,3:106\n766#2:111\n857#2,2:112\n1549#2:114\n1620#2,3:115\n1774#2,4:120\n2624#2,3:124\n1549#2:127\n1620#2,2:128\n1622#2:131\n37#3,2:109\n37#3,2:118\n1#4:130\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewConverter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewConverter\n*L\n26#1:105\n26#1:106,3\n43#1:111\n43#1:112,2\n44#1:114\n44#1:115,3\n57#1:120,4\n71#1:124,3\n84#1:127\n84#1:128,2\n84#1:131\n26#1:109,2\n45#1:118,2\n*E\n"})
/* renamed from: WE4 */
/* loaded from: classes3.dex */
public final class WE4 {

    /* renamed from: a */
    public final Context f40630a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WE4$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8960a {
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

    public WE4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40630a = context;
    }

    /* renamed from: d */
    public static final C2637G6 m78681d(NonRepair nonRepair, RepairCategory repairCategory) {
        if (nonRepair != null) {
            return new C2637G6(TuplesKt.m28425to(repairCategory, nonRepair), C32634Ej4.item_repair_category_non_repair, false, 4, null);
        }
        return null;
    }

    /* renamed from: a */
    public final List<C3023H6> m78684a(RepairFlow repairFlow) {
        int collectionSizeOrDefault;
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(repairFlow, "repairFlow");
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(m78680e(repairFlow));
        List<RepairCategory> categories = repairFlow.getCategories();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(categories, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RepairCategory repairCategory : categories) {
            arrayList.add(m78682c(repairCategory));
        }
        spreadBuilder.addSpread(arrayList.toArray(new C3023H6[0]));
        spreadBuilder.add(m78683b(repairFlow.getQuickLinks()));
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOfNotNull;
    }

    /* renamed from: b */
    public final C3023H6 m78683b(List<WireQuickLink> list) {
        int collectionSizeOrDefault;
        List mutableList;
        int i;
        Integer valueOf;
        List<WireQuickLink> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireQuickLink wireQuickLink : list2) {
            QuickLinkIcon icon = wireQuickLink.getIcon();
            if (icon == null) {
                i = -1;
            } else {
                i = C8960a.$EnumSwitchMapping$0[icon.ordinal()];
            }
            Drawable drawable = null;
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
            if (valueOf != null) {
                valueOf.intValue();
                drawable = NA0.m94299e(this.f40630a, valueOf.intValue());
            }
            arrayList.add(new C2637G6(new C46977pd4(wireQuickLink, drawable), C32634Ej4.item_quick_link, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(new ArrayList(), new C2637G6(new C3023H6(mutableList, null, null, 6, null), C32634Ej4.item_quick_links_section, false, 4, null), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3023H6 m78682c(RepairCategory repairCategory) {
        Object firstOrNull;
        boolean z;
        int collectionSizeOrDefault;
        C2637G6 c2637g6;
        C2637G6 c2637g62;
        List listOfNotNull;
        List mutableList;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        String str;
        RepairCategory repairCategory2 = repairCategory;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) repairCategory.getOverviewNonRepairs());
        NonRepair nonRepair = (NonRepair) firstOrNull;
        if (nonRepair != null && H93.m104262a(nonRepair)) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<RepairIssue> arrayList = new ArrayList();
        for (Object obj : repairCategory.getIssues()) {
            if (((RepairIssue) obj).getSelected()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (RepairIssue repairIssue : arrayList) {
            arrayList2.add(new C2637G6(repairIssue, C32634Ej4.item_repair_issue, false, 4, null));
        }
        C2637G6[] c2637g6Arr = (C2637G6[]) arrayList2.toArray(new C2637G6[0]);
        C2637G6 c2637g63 = null;
        if (z) {
            c2637g6 = m78681d(nonRepair, repairCategory2);
        } else {
            c2637g6 = null;
        }
        if (!z) {
            c2637g62 = m78681d(nonRepair, repairCategory2);
        } else {
            c2637g62 = null;
        }
        if (z) {
            List<RepairIssue> issues = repairCategory.getIssues();
            if ((issues instanceof Collection) && issues.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (RepairIssue repairIssue2 : issues) {
                    if (repairIssue2.getSelected() && !repairIssue2.getCompleted()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i > 0) {
                str = "Repairs needed (" + i + ")";
            } else {
                str = "Repairs needed";
            }
            c2637g63 = new C2637G6(str, C32634Ej4.item_repair_category_divider, false, 4, null);
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c2637g63);
        spreadBuilder.addSpread(c2637g6Arr);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOfNotNull);
        C3023H6 c3023h6 = new C3023H6(mutableList, c2637g6, c2637g62);
        if (!(!repairCategory.getNonRepairs().isEmpty())) {
            List<RepairIssue> issues2 = repairCategory.getIssues();
            if (!(issues2 instanceof Collection) || !issues2.isEmpty()) {
                for (RepairIssue repairIssue3 : issues2) {
                    if (repairIssue3.getSelected()) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (!z3) {
                z2 = false;
                if (z) {
                    repairCategory2 = repairCategory.copy((r18 & 1) != 0 ? repairCategory.f66622id : null, (r18 & 2) != 0 ? repairCategory.display : null, (r18 & 4) != 0 ? repairCategory.description : "Can't repair now", (r18 & 8) != 0 ? repairCategory.assetUrl : null, (r18 & 16) != 0 ? repairCategory.issues : null, (r18 & 32) != 0 ? repairCategory.trainingGuide : null, (r18 & 64) != 0 ? repairCategory.nonRepairs : null, (r18 & 128) != 0 ? repairCategory.overviewNonRepairs : null);
                }
                return new C3023H6(new ArrayList(), new C2637G6(new C33705Iy4(repairCategory2, c3023h6, z2), C32634Ej4.item_repair_category, false, 4, null), null, 4, null);
            }
        }
        z2 = true;
        if (z) {
        }
        return new C3023H6(new ArrayList(), new C2637G6(new C33705Iy4(repairCategory2, c3023h6, z2), C32634Ej4.item_repair_category, false, 4, null), null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m78680e(RepairFlow repairFlow) {
        return new C3023H6(new ArrayList(), new C2637G6(repairFlow, C45268mk4.item_vehicle_servicing_vehicle_info, false, 4, null), new C2637G6(null, C32634Ej4.item_repair_instructions, false, 4, null));
    }
}
