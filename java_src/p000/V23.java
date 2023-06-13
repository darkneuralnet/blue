package p000;

import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002¨\u0006\u000b"}, m28432d2 = {"LV23;", "", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "nestFavoritePartners", "LH6;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFavoritePartnerConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerConverter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1549#2:22\n1620#2,3:23\n1#3:26\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerConverter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerConverter\n*L\n11#1:22\n11#1:23,3\n*E\n"})
/* renamed from: V23 */
/* loaded from: classes2.dex */
public final class V23 {
    /* renamed from: a */
    public final List<C3023H6> m80473a(List<Pair<NestFavoritePartner, Boolean>> nestFavoritePartners) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(nestFavoritePartners, "nestFavoritePartners");
        List<Pair<NestFavoritePartner, Boolean>> list = nestFavoritePartners;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2637G6((Pair) it.next(), C39311cj4.item_nest_favorite_partner, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }
}
