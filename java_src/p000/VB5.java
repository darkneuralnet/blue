package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireSkuVehicle;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
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
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LVB5;", "", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "missingSkuItems", "Lio/reactivex/F;", "LH6;", "b", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuInvestigationConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationConverter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1549#2:40\n1620#2,3:41\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationConverter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationConverter\n*L\n23#1:40\n23#1:41,3\n*E\n"})
/* renamed from: VB5 */
/* loaded from: classes3.dex */
public final class VB5 {

    /* renamed from: a */
    public final Context f38728a;

    public VB5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38728a = context;
    }

    /* renamed from: c */
    public static final List m80239c(List missingSkuItems, VB5 this$0) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOfNotNull;
        String str;
        Drawable m94299e;
        Intrinsics.checkNotNullParameter(missingSkuItems, "$missingSkuItems");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C2637G6 c2637g6 = new C2637G6(null, C35442Qj4.item_sku_investigation_header, false, 4, null);
        List<WireSuccessfulScannedItem> list = missingSkuItems;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireSuccessfulScannedItem wireSuccessfulScannedItem : list) {
            BirdModel.Companion companion = BirdModel.Companion;
            WireSkuVehicle bird = wireSuccessfulScannedItem.getBird();
            if (bird != null) {
                str = bird.getModel();
            } else {
                str = null;
            }
            BirdModel fromString = companion.fromString(str);
            int i = C35442Qj4.item_sku_investigation_missing;
            String id = wireSuccessfulScannedItem.getId();
            String itemDisplayName = wireSuccessfulScannedItem.getItemDisplayName();
            if (itemDisplayName == null && (itemDisplayName = wireSuccessfulScannedItem.getItemId()) == null) {
                itemDisplayName = wireSuccessfulScannedItem.getId();
            }
            if (fromString == null || (m94299e = C6327PM.m90445a(fromString, this$0.f38728a)) == null) {
                m94299e = NA0.m94299e(this$0.f38728a, C48193rg4.ic_missing_error);
            }
            arrayList.add(new C2637G6(new C41988hC5(m94299e, itemDisplayName, id), i, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(new C3023H6(mutableList, c2637g6, null, 4, null));
        return listOfNotNull;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m80240b(final List<WireSuccessfulScannedItem> missingSkuItems) {
        Intrinsics.checkNotNullParameter(missingSkuItems, "missingSkuItems");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: UB5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m80239c;
                m80239c = VB5.m80239c(missingSkuItems, this);
                return m80239c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…pterItems = items))\n    }");
        return m33161E;
    }
}
