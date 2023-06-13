package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireContainerOrder;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lv64;", "", "Lco/bird/android/model/wire/WireContainerOrder;", "wireContainerOrder", "", "", "uploadedPhotoUrl", "Lio/reactivex/F;", "LH6;", "b", "f", DateTokenConverter.CONVERTER_KEY, "e", "g", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: v64  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50229v64 {

    /* renamed from: a */
    public final Context f113531a;

    public C50229v64(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f113531a = context;
    }

    /* renamed from: c */
    public static final List m9185c(C50229v64 this$0, WireContainerOrder wireContainerOrder, List uploadedPhotoUrl) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(wireContainerOrder, "$wireContainerOrder");
        Intrinsics.checkNotNullParameter(uploadedPhotoUrl, "$uploadedPhotoUrl");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m9182f(), this$0.m9184d(wireContainerOrder), this$0.m9183e(uploadedPhotoUrl), this$0.m9181g(wireContainerOrder)});
        return listOfNotNull;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m9186b(final WireContainerOrder wireContainerOrder, final List<String> uploadedPhotoUrl) {
        Intrinsics.checkNotNullParameter(wireContainerOrder, "wireContainerOrder");
        Intrinsics.checkNotNullParameter(uploadedPhotoUrl, "uploadedPhotoUrl");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: u64
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m9185c;
                m9185c = C50229v64.m9185c(C50229v64.this, wireContainerOrder, uploadedPhotoUrl);
                return m9185c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…inerOrder),\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m9184d(WireContainerOrder wireContainerOrder) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(C50274vB0.m9052d(wireContainerOrder, this.f113531a, true));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m9183e(List<String> list) {
        int i;
        List mutableListOf;
        C2637G6[] c2637g6Arr = new C2637G6[1];
        int i2 = C35442Qj4.item_image_upload;
        boolean isEmpty = true ^ list.isEmpty();
        if (list.isEmpty()) {
            i = C45871nl4.flight_sheet_no;
        } else {
            i = C45871nl4.flight_sheet_yes;
        }
        c2637g6Arr[0] = new C2637G6(new C45220mf6(list, isEmpty, i), i2, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: f */
    public final C3023H6 m9182f() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(this.f113531a.getString(C45871nl4.process_container_order_header), C35442Qj4.item_section_header, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: g */
    public final C3023H6 m9181g(WireContainerOrder wireContainerOrder) {
        String string = this.f113531a.getString(C45871nl4.container_order_sku_order_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…r_order_sku_order_header)");
        return new C3023H6(C50274vB0.m9043m(C50274vB0.m9044l(C50274vB0.m9047i(wireContainerOrder.getSkuOrders(), this.f113531a, wireContainerOrder))), new C2637G6(new C36626Vl0(string, true, true, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null), null, 4, null);
    }
}
