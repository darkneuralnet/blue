package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\n"}, m28432d2 = {"LjI;", "", "", "LTk5;", "scanResults", "LH6;", C17296a.f69688o, "b", "<init>", "()V", "co.bird.android.feature.bird-air-diagnostics"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdAirConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAirConverter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1603#2,9:20\n1855#2:29\n1856#2:31\n1612#2:32\n1#3:30\n*S KotlinDebug\n*F\n+ 1 BirdAirConverter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirConverter\n*L\n13#1:20,9\n13#1:29\n13#1:31\n13#1:32\n13#1:30\n*E\n"})
/* renamed from: jI */
/* loaded from: classes3.dex */
public final class C24767jI {
    /* renamed from: a */
    public final List<C3023H6> m30893a(List<? extends C36154Tk5> scanResults) {
        Intrinsics.checkNotNullParameter(scanResults, "scanResults");
        return m30892b(scanResults);
    }

    /* renamed from: b */
    public final List<C3023H6> m30892b(List<? extends C36154Tk5> list) {
        List mutableList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C36154Tk5 c36154Tk5 : list) {
            arrayList2.add(new C2637G6(c36154Tk5, C41117fk4.item_bird_air_scanned, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        arrayList.add(new C3023H6(mutableList, null, null, 6, null));
        return arrayList;
    }
}
