package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0011"}, m28432d2 = {"LqF;", "LoF;", "", "Lco/bird/android/model/wire/WireBatch;", "batches", "nextBatches", "", "itemLimit", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBatchSearchConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchSearchConverter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1549#2:49\n1620#2,3:50\n*S KotlinDebug\n*F\n+ 1 BatchSearchConverter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchConverterImpl\n*L\n31#1:49\n31#1:50,3\n*E\n"})
/* renamed from: qF */
/* loaded from: classes3.dex */
public final class C27561qF implements InterfaceC26874oF {

    /* renamed from: a */
    public final Context f104992a;

    public C27561qF(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104992a = context;
    }

    /* renamed from: c */
    public static final List m17739c(C27561qF this$0, List batches, List nextBatches, int i) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(batches, "$batches");
        Intrinsics.checkNotNullParameter(nextBatches, "$nextBatches");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(this$0.m17738d(batches, nextBatches, i));
        return listOfNotNull;
    }

    @Override // p000.InterfaceC26874oF
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo17741a(final List<WireBatch> batches, final List<WireBatch> nextBatches, final int i) {
        Intrinsics.checkNotNullParameter(batches, "batches");
        Intrinsics.checkNotNullParameter(nextBatches, "nextBatches");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: pF
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m17739c;
                m17739c = C27561qF.m17739c(C27561qF.this, batches, nextBatches, i);
                return m17739c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lis…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m17738d(List<WireBatch> list, List<WireBatch> list2, int i) {
        int collectionSizeOrDefault;
        C2637G6 c2637g6;
        List mutableListOf;
        List take;
        List mutableList;
        List<WireBatch> list3 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBatch wireBatch : list3) {
            arrayList.add(new C2637G6(wireBatch, C45268mk4.item_button_secondary, false, 4, null));
        }
        if (!list2.isEmpty()) {
            c2637g6 = new C2637G6(this.f104992a.getString(C45871nl4.batches_search_load_more), C45268mk4.item_button, false, 4, null);
        } else {
            c2637g6 = null;
        }
        C2637G6 c2637g62 = c2637g6;
        if (!arrayList.isEmpty()) {
            take = CollectionsKt___CollectionsKt.take(arrayList, i);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) take);
            return new C3023H6(mutableList, null, c2637g62, 2, null);
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C45268mk4.view_button_red, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
