package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePartCategory;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b=\u0010>J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\f\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aJ\u0016\u0010!\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aJ\u0016\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006?"}, m28432d2 = {"LS72;", "LvI3;", "Lio/reactivex/Observable;", "", "Sl", "Ul", "Zl", "Vl", "", "LH6;", "sections", "Wl", "Xl", "Lco/bird/android/model/wire/WirePartCategory;", "n2", "Yl", "Lco/bird/android/model/wire/WireInventoryPart;", "am", "", "bm", "", "show", "cm", "im", "query", "fm", "", "partsRecorded", "hm", "visible", "dm", "count", "em", "jm", "gm", "LV3;", "b", "LV3;", "inventoryCategoryBinding", "Lzm2;", "c", "Lzm2;", "inventoryStatusBinding", "LSm2;", DateTokenConverter.CONVERTER_KEY, "LSm2;", "recordNewPartsBinding", "LTm2;", "e", "LTm2;", "searchHeaderBinding", "LKg0;", "f", "LKg0;", "categoryAdapter", "LZH3;", "g", "LZH3;", "searchResultsAdapter", "Lco/bird/android/core/mvp/BaseActivity;", "baseActivity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LV3;Lzm2;LSm2;LTm2;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S72 */
/* loaded from: classes3.dex */
public final class S72 extends AbstractC50340vI3 {

    /* renamed from: b */
    public final C8538V3 f33183b;

    /* renamed from: c */
    public final C52993zm2 f33184c;

    /* renamed from: d */
    public final C35935Sm2 f33185d;

    /* renamed from: e */
    public final C36169Tm2 f33186e;

    /* renamed from: f */
    public final C34007Kg0 f33187f;

    /* renamed from: g */
    public final ZH3 f33188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S72(BaseActivity baseActivity, C8538V3 inventoryCategoryBinding, C52993zm2 inventoryStatusBinding, C35935Sm2 recordNewPartsBinding, C36169Tm2 searchHeaderBinding) {
        super(baseActivity);
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(inventoryCategoryBinding, "inventoryCategoryBinding");
        Intrinsics.checkNotNullParameter(inventoryStatusBinding, "inventoryStatusBinding");
        Intrinsics.checkNotNullParameter(recordNewPartsBinding, "recordNewPartsBinding");
        Intrinsics.checkNotNullParameter(searchHeaderBinding, "searchHeaderBinding");
        this.f33183b = inventoryCategoryBinding;
        this.f33184c = inventoryStatusBinding;
        this.f33185d = recordNewPartsBinding;
        this.f33186e = searchHeaderBinding;
        C34007Kg0 c34007Kg0 = new C34007Kg0();
        this.f33187f = c34007Kg0;
        ZH3 zh3 = new ZH3();
        this.f33188g = zh3;
        RecyclerView recyclerView = inventoryCategoryBinding.f38462b;
        recyclerView.setAdapter(c34007Kg0);
        recyclerView.addItemDecoration(new C34241Lg0());
        RecyclerView recyclerView2 = inventoryCategoryBinding.f38467g;
        recyclerView2.setAdapter(zh3);
        recyclerView2.addItemDecoration(new C40261eI3());
    }

    public static /* synthetic */ void showNoResults$default(S72 s72, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        s72.m85966fm(z, str);
    }

    @Override // p000.AbstractC50340vI3
    /* renamed from: Sl */
    public Observable<Unit> mo5780Sl() {
        ImageView imageView = this.f33186e.f36058b;
        Intrinsics.checkNotNullExpressionValue(imageView, "searchHeaderBinding.scanQR");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    /* renamed from: Ul */
    public final Observable<Unit> m85977Ul() {
        View view = this.f33184c.f122176e;
        Intrinsics.checkNotNullExpressionValue(view, "inventoryStatusBinding.incompleteContainer");
        return C44626lf5.clicksThrottle$default(view, 0L, 1, null);
    }

    /* renamed from: Vl */
    public final Observable<Unit> m85976Vl() {
        View view = this.f33184c.f122181j;
        Intrinsics.checkNotNullExpressionValue(view, "inventoryStatusBinding.outOfStockContainer");
        return C44626lf5.clicksThrottle$default(view, 0L, 1, null);
    }

    /* renamed from: Wl */
    public final void m85975Wl(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f33187f.mo24871u(sections);
    }

    /* renamed from: Xl */
    public final void m85974Xl(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f33188g.mo24871u(sections);
    }

    /* renamed from: Yl */
    public final Observable<Unit> m85973Yl() {
        View view = this.f33185d.f34251e;
        Intrinsics.checkNotNullExpressionValue(view, "recordNewPartsBinding.scanAnotherPartContainer");
        return C44626lf5.clicksThrottle$default(view, 0L, 1, null);
    }

    /* renamed from: Zl */
    public final Observable<Unit> m85972Zl() {
        View view = this.f33184c.f122187p;
        Intrinsics.checkNotNullExpressionValue(view, "inventoryStatusBinding.runningLowContainer");
        return C44626lf5.clicksThrottle$default(view, 0L, 1, null);
    }

    /* renamed from: am */
    public final Observable<WireInventoryPart> m85971am() {
        return this.f33188g.m73369v();
    }

    /* renamed from: bm */
    public final Observable<String> m85970bm() {
        AppCompatEditText appCompatEditText = this.f33186e.f36060d;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "searchHeaderBinding.searchText");
        return C44626lf5.textChanges$default(appCompatEditText, 500, false, 2, null);
    }

    /* renamed from: cm */
    public final void m85969cm(boolean z) {
        NestedScrollView nestedScrollView = this.f33183b.f38463c;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "inventoryCategoryBinding.content");
        C49520tu6.show$default(nestedScrollView, z, 0, 2, null);
    }

    /* renamed from: dm */
    public final void m85968dm(boolean z) {
        ConstraintLayout constraintLayout = this.f33183b.f38464d.f122185n;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "inventoryCategoryBinding…atusSection.rootContainer");
        C49520tu6.show$default(constraintLayout, z, 0, 2, null);
    }

    /* renamed from: em */
    public final void m85967em(boolean z, int i) {
        Group group = this.f33184c.f122177f;
        Intrinsics.checkNotNullExpressionValue(group, "inventoryStatusBinding.incompleteGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
        TextView textView = this.f33184c.f122179h;
        textView.setText(textView.getContext().getString(C45871nl4.operator_inventory_status_incomplete_label, String.valueOf(i)));
    }

    /* renamed from: fm */
    public final void m85966fm(boolean z, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f33183b.f38465e.setText(getActivity().getString(C45871nl4.operator_inventory_no_search_results, query));
        TextView textView = this.f33183b.f38465e;
        Intrinsics.checkNotNullExpressionValue(textView, "inventoryCategoryBinding.noSearchResults");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: gm */
    public final void m85965gm(boolean z, int i) {
        Group group = this.f33184c.f122182k;
        Intrinsics.checkNotNullExpressionValue(group, "inventoryStatusBinding.outOfStockGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
        TextView textView = this.f33184c.f122184m;
        textView.setText(textView.getContext().getString(C45871nl4.operator_inventory_status_oos_label, String.valueOf(i)));
    }

    /* renamed from: hm */
    public final void m85964hm(int i) {
        C52036y92.f118822b.m4039a(i).show(getActivity().getSupportFragmentManager(), "InventoryRecordedBottomSheet");
    }

    /* renamed from: im */
    public final void m85963im(boolean z) {
        RecyclerView recyclerView = this.f33183b.f38467g;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "inventoryCategoryBinding.searchResultsRecyclerView");
        C49520tu6.show$default(recyclerView, z, 0, 2, null);
    }

    /* renamed from: jm */
    public final void m85962jm(boolean z, int i) {
        Group group = this.f33184c.f122188q;
        Intrinsics.checkNotNullExpressionValue(group, "inventoryStatusBinding.runningLowGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
        TextView textView = this.f33184c.f122190s;
        textView.setText(textView.getContext().getString(C45871nl4.operator_inventory_status_running_low_label, String.valueOf(i)));
    }

    /* renamed from: n2 */
    public final Observable<WirePartCategory> m85961n2() {
        return this.f33187f.m98574v();
    }
}
