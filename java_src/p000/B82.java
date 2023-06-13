package p000;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.A82;
import p000.C45672nQ5;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016JH\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006*"}, m28432d2 = {"LB82;", "LxE;", "LA82;", "Lio/reactivex/Observable;", "", "l", "ee", "m0", "w2", "", "warehouseName", "name", "sku", "binSize", "", "binQuantity", "binCount", "excessInventoryQuantity", "", "binWeight", "U9", "newCount", "", "addEnabled", "subtractEnabled", "q7", "LW3;", "b", "LW3;", "binding", "LnQ5;", "c", "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LW3;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B82 */
/* loaded from: classes3.dex */
public final class B82 extends AbstractC30071xE implements A82 {

    /* renamed from: b */
    public final C8921W3 f1902b;

    /* renamed from: c */
    public C45672nQ5 f1903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B82(BaseActivity activity, C8921W3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f1902b = binding;
    }

    @Override // p000.A82
    /* renamed from: U9 */
    public void mo114334U9(String warehouseName, String name, String sku, String binSize, int i, int i2, int i3, float f) {
        String replace$default;
        Intrinsics.checkNotNullParameter(warehouseName, "warehouseName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(binSize, "binSize");
        this.f1902b.f40325m.setText(warehouseName);
        TextView textView = this.f1902b.f40324l;
        replace$default = StringsKt__StringsJVMKt.replace$default(name, "_", " ", false, 4, (Object) null);
        textView.setText(replace$default);
        boolean z = true;
        this.f1902b.f40321i.setText(getActivity().getResources().getString(C45871nl4.inventory_bin_count, Integer.valueOf(i2)));
        this.f1902b.f40328p.setText(getActivity().getResources().getString(C45871nl4.inventory_sku, sku));
        this.f1902b.f40317e.setText(getActivity().getResources().getString(C45871nl4.inventory_bin_size, binSize));
        this.f1902b.f40316d.setText(getActivity().getResources().getString(C45871nl4.inventory_bin_quantity, Integer.valueOf(i)));
        this.f1902b.f40322j.setText(getActivity().getResources().getString(C45871nl4.inventory_current_stock, Integer.valueOf(i2)));
        this.f1902b.f40323k.setText(getActivity().getString(C45871nl4.inventory_bin_excess_inventory, Integer.valueOf(i3)));
        this.f1902b.f40318f.setText(getActivity().getResources().getString(C45871nl4.inventory_bin_weight, Float.valueOf(f)));
        TextView textView2 = this.f1902b.f40318f;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.binWeight");
        if (f <= 0.0f) {
            z = false;
        }
        C49520tu6.show$default(textView2, z, 0, 2, null);
    }

    @Override // p000.FQ5
    /* renamed from: b1 */
    public void mo12610b1(List<C3023H6> list) {
        A82.C0040a.m116068b(this, list);
    }

    @Override // p000.A82
    /* renamed from: ee */
    public Observable<Unit> mo114333ee() {
        ImageButton imageButton = this.f1902b.f40329q;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.subtract");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    @Override // p000.FQ5
    /* renamed from: g1 */
    public void mo12607g1(List<C3023H6> list) {
        A82.C0040a.m116069a(this, list);
    }

    @Override // p000.FQ5
    /* renamed from: ig */
    public Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        return A82.C0040a.m116067c(this, viewHolderSupplier);
    }

    @Override // p000.A82
    /* renamed from: l */
    public Observable<Unit> mo114332l() {
        ImageButton imageButton = this.f1902b.f40314b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.add");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    @Override // p000.A82
    /* renamed from: m0 */
    public Observable<Unit> mo114331m0() {
        Button button = this.f1902b.f40330r;
        Intrinsics.checkNotNullExpressionValue(button, "binding.update");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.FQ5
    /* renamed from: oc */
    public C45672nQ5 mo12605oc() {
        return this.f1903c;
    }

    @Override // p000.A82
    /* renamed from: q7 */
    public void mo114330q7(int i, boolean z, boolean z2) {
        this.f1902b.f40321i.setText(getActivity().getResources().getString(C45871nl4.inventory_bin_count, Integer.valueOf(i)));
        this.f1902b.f40314b.setEnabled(z);
        this.f1902b.f40329q.setEnabled(z2);
    }

    @Override // p000.A82
    /* renamed from: w2 */
    public Observable<Unit> mo114329w2() {
        Button button = this.f1902b.f40315c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addExcessInventory");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.FQ5
    /* renamed from: x7 */
    public void mo12602x7(C45672nQ5 c45672nQ5) {
        this.f1903c = c45672nQ5;
    }
}
