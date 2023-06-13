package p000;

import co.bird.android.model.wire.WireBenefit;
import co.bird.android.model.wire.WireTierView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32541Dz1;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireTierView;", "", "LDz1$a;", C17296a.f69688o, "frequent-flyer_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFrequentFlyerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1549#2:93\n1620#2,3:94\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterKt\n*L\n90#1:93\n90#1:94,3\n*E\n"})
/* renamed from: lA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44338lA1 {
    /* renamed from: a */
    public static final List<C32541Dz1.C1679a> m27721a(WireTierView wireTierView) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireTierView, "<this>");
        List<WireBenefit> benefits = wireTierView.getBenefits();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(benefits, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBenefit wireBenefit : benefits) {
            arrayList.add(new C32541Dz1.C1679a(wireTierView.getTier(), wireBenefit));
        }
        return arrayList;
    }
}
