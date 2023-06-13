package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"LOl1;", "", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "selected", "", "categories", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilterConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterConverter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterConverter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n37#2,2:50\n1549#3:52\n1620#3,3:53\n*S KotlinDebug\n*F\n+ 1 FilterConverter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterConverter\n*L\n27#1:50,2\n35#1:52\n35#1:53,3\n*E\n"})
/* renamed from: Ol1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34989Ol1 {

    /* renamed from: a */
    public final Context f27203a;

    public C34989Ol1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27203a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m91551a(OperatorNotificationCategory operatorNotificationCategory, List<OperatorNotificationCategory> categories) {
        List listOf;
        OperatorNotificationCategory operatorNotificationCategory2;
        int collectionSizeOrDefault;
        Set set;
        List mutableList;
        List<C3023H6> listOf2;
        Intrinsics.checkNotNullParameter(categories, "categories");
        String string = this.f27203a.getString(C45871nl4.all_notifications);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.all_notifications)");
        OperatorNotificationCategory operatorNotificationCategory3 = new OperatorNotificationCategory("", string);
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(operatorNotificationCategory3);
        spreadBuilder.addSpread(categories.toArray(new OperatorNotificationCategory[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new OperatorNotificationCategory[spreadBuilder.size()]));
        if (operatorNotificationCategory == null) {
            operatorNotificationCategory2 = operatorNotificationCategory3;
        } else {
            operatorNotificationCategory2 = operatorNotificationCategory;
        }
        C2637G6 c2637g6 = new C2637G6(operatorNotificationCategory2, C48815sj4.item_selected_filter, false, 4, null);
        List<OperatorNotificationCategory> list = listOf;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (OperatorNotificationCategory operatorNotificationCategory4 : list) {
            arrayList.add(new C2637G6(operatorNotificationCategory4, C48815sj4.item_filter, false));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) set);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, c2637g6, null, 4, null));
        return listOf2;
    }
}
