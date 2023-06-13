package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusPerkView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, m28432d2 = {"LHP;", "", "LtQ;", "birdPlusState", "", "LH6;", C17296a.f69688o, "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlus", "c", DateTokenConverter.CONVERTER_KEY, "b", "<init>", "()V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsConverter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1549#2:59\n1620#2,3:60\n1#3:63\n*S KotlinDebug\n*F\n+ 1 BirdPlusDetailsConverter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsConverter\n*L\n36#1:59\n36#1:60,3\n*E\n"})
/* renamed from: HP */
/* loaded from: classes3.dex */
public final class C3138HP {
    /* renamed from: a */
    public final List<C3023H6> m103917a(C28698tQ birdPlusState) {
        List<C3023H6> listOfNotNull;
        List<C3023H6> emptyList;
        Intrinsics.checkNotNullParameter(birdPlusState, "birdPlusState");
        if (birdPlusState.m12410b() != null) {
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m103915c(birdPlusState.m12410b()), m103914d(birdPlusState.m12410b()), m103916b(birdPlusState.m12410b())});
            return listOfNotNull;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    /* renamed from: b */
    public final C3023H6 m103916b(BirdPlusView birdPlusView) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(birdPlusView, C47640qk4.item_bird_plus_details_footer, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: c */
    public final C3023H6 m103915c(BirdPlusView birdPlusView) {
        List mutableListOf;
        BirdPlusDisplayView display;
        BirdPlusSubscriptionPlanView subscriptionPlan = birdPlusView.getSubscriptionPlan();
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C29191uQ((subscriptionPlan == null || (display = subscriptionPlan.getDisplay()) == null || (r0 = display.getHeroMessage()) == null) ? "" : "", birdPlusView), C47640qk4.item_bird_plus_details_header, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: d */
    public final C3023H6 m103914d(BirdPlusView birdPlusView) {
        List<BirdPlusPerkView> perks;
        int collectionSizeOrDefault;
        List mutableList;
        BirdPlusSubscriptionPlanView subscriptionPlan = birdPlusView.getSubscriptionPlan();
        if (subscriptionPlan != null && (perks = subscriptionPlan.getPerks()) != null) {
            List<BirdPlusPerkView> list = perks;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (BirdPlusPerkView birdPlusPerkView : list) {
                arrayList.add(new C2637G6(birdPlusPerkView, C47640qk4.item_bird_plus_details_perk, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            if (mutableList != null) {
                mutableList.add(0, new C2637G6(Unit.INSTANCE, C47640qk4.item_bird_plus_details_perk_header, false, 4, null));
                return new C3023H6(mutableList, null, null, 6, null);
            }
        }
        return null;
    }
}
