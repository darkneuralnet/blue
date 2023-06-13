package p000;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.wire.WireInventoryPart;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007J\u0014\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, m28432d2 = {"Lx92;", "LvI3;", "Lio/reactivex/Observable;", "", "Sl", "", "titleRes", "", "Ul", "Lco/bird/android/model/constant/HealthStatus;", "healthStatus", "Yl", "title", "Zl", "", "LH6;", "sections", "b", "Vl", "Lco/bird/android/model/wire/WireInventoryPart;", "Wl", "Xl", "query", "", "show", "am", "bm", "LY3;", "LY3;", "inventoryPartBinding", "LTm2;", "c", "LTm2;", "searchHeaderBinding", "LZH3;", DateTokenConverter.CONVERTER_KEY, "LZH3;", "partAdapter", "Lco/bird/android/core/mvp/BaseActivity;", "baseActivity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LY3;LTm2;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: x92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51443x92 extends AbstractC50340vI3 {

    /* renamed from: b */
    public final C9606Y3 f117139b;

    /* renamed from: c */
    public final C36169Tm2 f117140c;

    /* renamed from: d */
    public final ZH3 f117141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51443x92(BaseActivity baseActivity, C9606Y3 inventoryPartBinding, C36169Tm2 searchHeaderBinding) {
        super(baseActivity);
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(inventoryPartBinding, "inventoryPartBinding");
        Intrinsics.checkNotNullParameter(searchHeaderBinding, "searchHeaderBinding");
        this.f117139b = inventoryPartBinding;
        this.f117140c = searchHeaderBinding;
        ZH3 zh3 = new ZH3();
        this.f117141d = zh3;
        RecyclerView recyclerView = inventoryPartBinding.f44481e;
        recyclerView.setAdapter(zh3);
        recyclerView.addItemDecoration(new C40261eI3());
    }

    @Override // p000.AbstractC50340vI3
    /* renamed from: Sl */
    public Observable<Unit> mo5780Sl() {
        ImageView imageView = this.f117140c.f36058b;
        Intrinsics.checkNotNullExpressionValue(imageView, "searchHeaderBinding.scanQR");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    /* renamed from: Ul */
    public final String m5779Ul(int i) {
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(titleRes)");
        return string;
    }

    /* renamed from: Vl */
    public final Observable<Unit> m5778Vl() {
        Button button = this.f117139b.f44480d;
        Intrinsics.checkNotNullExpressionValue(button, "inventoryPartBinding.orderButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Wl */
    public final Observable<WireInventoryPart> m5777Wl() {
        return this.f117141d.m73369v();
    }

    /* renamed from: Xl */
    public final Observable<String> m5776Xl() {
        AppCompatEditText appCompatEditText = this.f117140c.f36060d;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "searchHeaderBinding.searchText");
        return C44626lf5.m27015e(appCompatEditText, 500, false);
    }

    /* renamed from: Yl */
    public final void m5775Yl(HealthStatus healthStatus) {
        Intrinsics.checkNotNullParameter(healthStatus, "healthStatus");
        this.f117141d.m73368w(healthStatus);
    }

    /* renamed from: Zl */
    public final void m5774Zl(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getActivity().setTitle(title);
        AppCompatEditText appCompatEditText = this.f117140c.f36060d;
        BaseActivity activity = getActivity();
        int i = C45871nl4.operator_inventory_part_search_hint;
        String lowerCase = title.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        appCompatEditText.setHint(activity.getString(i, lowerCase));
    }

    /* renamed from: am */
    public final void m5773am(String query, boolean z) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f117139b.f44479c.setText(getActivity().getString(C45871nl4.operator_inventory_no_search_results, query));
        TextView textView = this.f117139b.f44479c;
        Intrinsics.checkNotNullExpressionValue(textView, "inventoryPartBinding.noFilteredResults");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: b */
    public final void m5772b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f117141d.mo24871u(sections);
    }

    /* renamed from: bm */
    public final void m5771bm(boolean z) {
        FrameLayout frameLayout = this.f117139b.f44478b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "inventoryPartBinding.footerContainer");
        C49520tu6.show$default(frameLayout, z, 0, 2, null);
    }
}
