package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010\u0006\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, m28432d2 = {"Lio/reactivex/subjects/a;", "", "Lqx1;", "plugin", "", C17296a.f69688o, "b", "foreground-service_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nForegroundService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundServiceKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n37#2,2:128\n819#3:130\n847#3,2:131\n*S KotlinDebug\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundServiceKt\n*L\n121#1:128,2\n125#1:130\n125#1:131,2\n*E\n"})
/* renamed from: ex1 */
/* loaded from: classes3.dex */
public final class C40651ex1 {
    /* renamed from: a */
    public static final void m42363a(C24552a<Set<AbstractC47767qx1>> c24552a, AbstractC47767qx1 abstractC47767qx1) {
        Set<AbstractC47767qx1> of;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Set<AbstractC47767qx1> value = c24552a.getValue();
        if (value == null) {
            value = SetsKt__SetsKt.emptySet();
        }
        spreadBuilder.addSpread(value.toArray(new AbstractC47767qx1[0]));
        spreadBuilder.add(abstractC47767qx1);
        of = SetsKt__SetsKt.setOf(spreadBuilder.toArray(new AbstractC47767qx1[spreadBuilder.size()]));
        c24552a.onNext(of);
    }

    public static final /* synthetic */ void access$addPlugin(C24552a c24552a, AbstractC47767qx1 abstractC47767qx1) {
        m42363a(c24552a, abstractC47767qx1);
    }

    public static final /* synthetic */ void access$removePlugin(C24552a c24552a, AbstractC47767qx1 abstractC47767qx1) {
        m42362b(c24552a, abstractC47767qx1);
    }

    /* renamed from: b */
    public static final void m42362b(C24552a<Set<AbstractC47767qx1>> c24552a, AbstractC47767qx1 abstractC47767qx1) {
        Set<AbstractC47767qx1> set;
        Set<AbstractC47767qx1> value = c24552a.getValue();
        if (value == null) {
            value = SetsKt__SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (!Intrinsics.areEqual((AbstractC47767qx1) obj, abstractC47767qx1)) {
                arrayList.add(obj);
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        c24552a.onNext(set);
    }
}
