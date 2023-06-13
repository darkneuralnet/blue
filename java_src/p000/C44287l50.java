package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007J:\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006 "}, m28432d2 = {"Ll50;", "", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "birdSuccessPairs", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "status", "LH6;", C17296a.f69688o, "Lco/bird/android/model/wire/WireBatch;", "batch", "b", "Landroid/graphics/drawable/Drawable;", "h", "c", "successBirds", "LG6;", "g", "failedBirds", DateTokenConverter.CONVERTER_KEY, "f", "e", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "LTq4;", "reactiveConfig", "<init>", "(Landroid/content/Context;LTq4;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressStatusConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressStatusConverter.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/adapters/BulkServiceProgressStatusConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,133:1\n766#2:134\n857#2,2:135\n1549#2:137\n1620#2,3:138\n766#2:141\n857#2,2:142\n1549#2:144\n1620#2,3:145\n766#2:152\n857#2,2:153\n1549#2:155\n1620#2,3:156\n766#2:159\n857#2,2:160\n1549#2:162\n1620#2,3:163\n1549#2:170\n1620#2,3:171\n1549#2:176\n1620#2,3:177\n37#3,2:148\n37#3,2:150\n37#3,2:166\n37#3,2:168\n37#3,2:174\n37#3,2:180\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressStatusConverter.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/adapters/BulkServiceProgressStatusConverter\n*L\n26#1:134\n26#1:135,2\n27#1:137\n27#1:138,3\n29#1:141\n29#1:142,2\n30#1:144\n30#1:145,3\n43#1:152\n43#1:153,2\n44#1:155\n44#1:156,3\n46#1:159\n46#1:160,2\n47#1:162\n47#1:163,3\n84#1:170\n84#1:171,3\n120#1:176\n120#1:177,3\n35#1:148,2\n36#1:150,2\n52#1:166,2\n53#1:168,2\n93#1:174,2\n129#1:180,2\n*E\n"})
/* renamed from: l50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44287l50 {

    /* renamed from: a */
    public final Context f95454a;

    /* renamed from: b */
    public final C36207Tq4 f95455b;

    public C44287l50(Context context, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f95454a = context;
        this.f95455b = reactiveConfig;
    }

    public static /* synthetic */ List convertForHibernate$default(C44287l50 c44287l50, List list, WireServiceCenterStatus wireServiceCenterStatus, WireBatch wireBatch, int i, Object obj) {
        if ((i & 4) != 0) {
            wireBatch = null;
        }
        return c44287l50.m27945b(list, wireServiceCenterStatus, wireBatch);
    }

    /* renamed from: a */
    public final List<C3023H6> m27946a(List<Pair<Bird, Boolean>> birdSuccessPairs, WireServiceCenterStatus status) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List<C2637G6> emptyList;
        List<C2637G6> emptyList2;
        List listOf;
        List mutableList;
        List<C3023H6> listOf2;
        Intrinsics.checkNotNullParameter(birdSuccessPairs, "birdSuccessPairs");
        Intrinsics.checkNotNullParameter(status, "status");
        List<Pair<Bird, Boolean>> list = birdSuccessPairs;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((Pair) obj).component2()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Pair pair : arrayList) {
            arrayList2.add((Bird) pair.component1());
        }
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!((Boolean) ((Pair) obj2).component2()).booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
        for (Pair pair2 : arrayList3) {
            arrayList4.add((Bird) pair2.component1());
        }
        if (!arrayList2.isEmpty()) {
            emptyList = m27940g(arrayList2, status);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!arrayList4.isEmpty()) {
            emptyList2 = m27943d(arrayList4);
        } else {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(emptyList.toArray(new C2637G6[0]));
        spreadBuilder.addSpread(emptyList2.toArray(new C2637G6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOf);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf2;
    }

    /* renamed from: b */
    public final List<C3023H6> m27945b(List<Pair<Bird, Boolean>> birdSuccessPairs, WireServiceCenterStatus status, WireBatch wireBatch) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List<C2637G6> emptyList;
        List<C2637G6> emptyList2;
        List listOf;
        List mutableList;
        List<C3023H6> listOf2;
        Intrinsics.checkNotNullParameter(birdSuccessPairs, "birdSuccessPairs");
        Intrinsics.checkNotNullParameter(status, "status");
        List<Pair<Bird, Boolean>> list = birdSuccessPairs;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((Pair) obj).component2()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Pair pair : arrayList) {
            arrayList2.add((Bird) pair.component1());
        }
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!((Boolean) ((Pair) obj2).component2()).booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
        for (Pair pair2 : arrayList3) {
            arrayList4.add((Bird) pair2.component1());
        }
        if (!arrayList2.isEmpty()) {
            emptyList = m27941f(arrayList2, status, wireBatch);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!arrayList4.isEmpty()) {
            emptyList2 = m27942e(arrayList4, wireBatch);
        } else {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(emptyList.toArray(new C2637G6[0]));
        spreadBuilder.addSpread(emptyList2.toArray(new C2637G6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOf);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf2;
    }

    /* renamed from: c */
    public final Drawable m27944c() {
        Drawable mutate;
        Drawable m94299e = NA0.m94299e(this.f95454a, C48193rg4.ic_x_circle);
        if (m94299e != null && (mutate = m94299e.mutate()) != null) {
            mutate.setTint(NA0.m94301c(this.f95454a, C32364Df4.birdRed));
            return mutate;
        }
        return null;
    }

    /* renamed from: d */
    public final List<C2637G6> m27943d(List<Bird> list) {
        int collectionSizeOrDefault;
        List<C2637G6> listOf;
        Drawable m27944c = m27944c();
        String string = this.f95454a.getString(C45871nl4.operator_bulk_service_progress_failure_message, Integer.valueOf(list.size()));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…essage, failedBirds.size)");
        C2637G6 c2637g6 = new C2637G6(new C41312g40(m27944c, C45097mS5.span$default(string, String.valueOf(list.size()), null, 2, null)), C35901Si4.item_bulk_operation_status, false, 4, null);
        List<Bird> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Bird bird : list2) {
            String string2 = this.f95454a.getString(C45871nl4.operator_bulk_service_progress_failure_item, bird.getCode());
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…_failure_item, bird.code)");
            arrayList.add(new C2637G6(C45097mS5.span$default(string2, bird.getCode(), null, 2, null), C35901Si4.item_bulk_operation_detail, false, 4, null));
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c2637g6);
        spreadBuilder.addSpread(arrayList.toArray(new C2637G6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        return listOf;
    }

    /* renamed from: e */
    public final List<C2637G6> m27942e(List<Bird> list, WireBatch wireBatch) {
        String str;
        int collectionSizeOrDefault;
        List<C2637G6> listOf;
        int hibernateMinBattery = this.f95455b.m82623f8().m73665a().getServiceCenterConfig().getBulkProgress().getHibernateMinBattery();
        Drawable m27944c = m27944c();
        String string = this.f95454a.getString(C45871nl4.operator_bulk_service_progress_hibernate_failure_message, Integer.valueOf(list.size()), Integer.valueOf(hibernateMinBattery));
        if (wireBatch != null) {
            str = "\n" + this.f95454a.getString(C45871nl4.operator_bulk_service_progress_hibernate_add_batch_failure_message);
        } else {
            str = "\n" + this.f95454a.getString(C45871nl4.operator_bulk_service_progress_hibernate_create_batch_failure_message) + "\n\n" + this.f95454a.getString(C45871nl4.operator_bulk_service_progress_hibernate_failure_footer_message);
        }
        C2637G6 c2637g6 = new C2637G6(new C41312g40(m27944c, string + str), C35901Si4.item_bulk_operation_status, false, 4, null);
        List<Bird> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Bird bird : list2) {
            String string2 = this.f95454a.getString(C45871nl4.operator_bulk_service_progress_failure_item, bird.getCode());
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…_failure_item, bird.code)");
            arrayList.add(new C2637G6(C45097mS5.span$default(string2, bird.getCode(), null, 2, null), C35901Si4.item_bulk_operation_detail, false, 4, null));
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c2637g6);
        spreadBuilder.addSpread(arrayList.toArray(new C2637G6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        return listOf;
    }

    /* renamed from: f */
    public final List<C2637G6> m27941f(List<Bird> list, WireServiceCenterStatus wireServiceCenterStatus, WireBatch wireBatch) {
        List<C2637G6> listOf;
        Drawable m27939h = m27939h();
        String string = this.f95454a.getString(C45871nl4.operator_bulk_service_progress_success_message, Integer.valueOf(list.size()), wireServiceCenterStatus.getDisplayName());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…size, status.displayName)");
        String str = null;
        SpannableString span$default = C45097mS5.span$default(string, String.valueOf(list.size()), null, 2, null);
        if (wireBatch != null) {
            str = "\n" + this.f95454a.getString(C45871nl4.operator_bulk_service_progress_hibernate_add_batch_success_message);
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C2637G6(new C41312g40(m27939h, ((Object) span$default) + str), C35901Si4.item_bulk_operation_status, false, 4, null));
        return listOf;
    }

    /* renamed from: g */
    public final List<C2637G6> m27940g(List<Bird> list, WireServiceCenterStatus wireServiceCenterStatus) {
        List<C2637G6> listOf;
        Drawable m27939h = m27939h();
        String string = this.f95454a.getString(C45871nl4.operator_bulk_service_progress_success_message, Integer.valueOf(list.size()), wireServiceCenterStatus.getDisplayName());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…size, status.displayName)");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C2637G6(new C41312g40(m27939h, C45097mS5.span$default(string, String.valueOf(list.size()), null, 2, null)), C35901Si4.item_bulk_operation_status, false, 4, null));
        return listOf;
    }

    /* renamed from: h */
    public final Drawable m27939h() {
        Drawable mutate;
        Drawable m94299e = NA0.m94299e(this.f95454a, C48193rg4.ic_check_circle);
        if (m94299e != null && (mutate = m94299e.mutate()) != null) {
            mutate.setTint(NA0.m94301c(this.f95454a, C32364Df4.birdMint));
            return mutate;
        }
        return null;
    }
}
