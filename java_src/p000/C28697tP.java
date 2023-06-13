package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, m28432d2 = {"LtP;", "", "", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPluses", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusConverter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1549#2:45\n1620#2,3:46\n1549#2:49\n1620#2,3:50\n*S KotlinDebug\n*F\n+ 1 BirdPlusConverter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusConverter\n*L\n15#1:45\n15#1:46,3\n22#1:49\n22#1:50,3\n*E\n"})
/* renamed from: tP */
/* loaded from: classes3.dex */
public final class C28697tP {

    /* renamed from: a */
    public final Context f110428a;

    public C28697tP(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f110428a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m12414a(List<BirdPlusView> birdPluses) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List mutableList;
        Object firstOrNull;
        C2637G6 c2637g6;
        List<C3023H6> listOf;
        String str;
        String str2;
        BirdPlusDisplayView display;
        BirdPlusDisplayView display2;
        Intrinsics.checkNotNullParameter(birdPluses, "birdPluses");
        List<BirdPlusView> list = birdPluses;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList<C26509nR> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            BirdPlusView birdPlusView = (BirdPlusView) it.next();
            BirdPlusSubscriptionPlanView subscriptionPlan = birdPlusView.getSubscriptionPlan();
            if (subscriptionPlan != null && (display2 = subscriptionPlan.getDisplay()) != null) {
                str2 = display2.getPlanPreviewTitle();
            } else {
                str2 = null;
            }
            BirdPlusSubscriptionPlanView subscriptionPlan2 = birdPlusView.getSubscriptionPlan();
            if (subscriptionPlan2 != null && (display = subscriptionPlan2.getDisplay()) != null) {
                str3 = display.getPlanPreviewMessage();
            }
            arrayList.add(new C26509nR(str2, str3, birdPlusView));
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (C26509nR c26509nR : arrayList) {
            arrayList2.add(new C2637G6(c26509nR, C47640qk4.item_bird_plus_card, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) birdPluses);
        BirdPlusView birdPlusView2 = (BirdPlusView) firstOrNull;
        if (birdPlusView2 != null) {
            BirdPlusDisplayView display3 = birdPlusView2.getDisplay();
            if (display3 != null) {
                str = display3.getHeroMessage();
            } else {
                str = null;
            }
            c2637g6 = new C2637G6(new C26509nR(str, null, birdPlusView2), C47640qk4.item_bird_plus_header, false, 4, null);
        } else {
            c2637g6 = null;
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, c2637g6, null, 4, null));
        return listOf;
    }
}
