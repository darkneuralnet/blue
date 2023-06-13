package p000;

import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002¨\u0006\t"}, m28432d2 = {"LOw0;", "", "", "Lco/bird/android/model/persistence/Tutorial;", "tutorialsList", "LH6;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialViewerConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialViewerConverter.kt\nco/bird/android/feature/configurabletutorial/viewer/adapters/ConfigurableTutorialViewerConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1603#2,9:24\n1855#2:33\n1856#2:35\n1612#2:36\n1#3:34\n1#3:37\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialViewerConverter.kt\nco/bird/android/feature/configurabletutorial/viewer/adapters/ConfigurableTutorialViewerConverter\n*L\n11#1:24,9\n11#1:33\n11#1:35\n11#1:36\n11#1:34\n*E\n"})
/* renamed from: Ow0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35087Ow0 {
    /* renamed from: a */
    public final List<C3023H6> m91182a(List<? extends List<Tutorial>> tutorialsList) {
        List mutableList;
        List<C3023H6> listOf;
        Object firstOrNull;
        C2637G6 c2637g6;
        ConfigurableTutorialContext context;
        Intrinsics.checkNotNullParameter(tutorialsList, "tutorialsList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = tutorialsList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            Tutorial tutorial = (Tutorial) firstOrNull;
            if (tutorial != null && (context = tutorial.getContext()) != null) {
                c2637g6 = new C2637G6(TuplesKt.m28425to(context, list), C36837Wi4.item_tutorial_context, false, 4, null);
            } else {
                c2637g6 = null;
            }
            if (c2637g6 != null) {
                arrayList.add(c2637g6);
            }
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }
}
