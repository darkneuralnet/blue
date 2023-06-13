package p000;

import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\r\u001a\u00020\u0003J\u0006\u0010\u000e\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fJ\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\tR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"LCC5;", "LxE;", "Lio/reactivex/Observable;", "", "Rl", "Sl", "", "bm", "Ql", "", "LH6;", "sections", "b", "Tl", "Ul", "", "hasScannedVehicles", "containerOrderBooked", "showUploadBol", "Vl", "am", "show", "Wl", "Xl", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reasons", "Lio/reactivex/F;", "Yl", "Le6;", "Le6;", "binding", "LiC5;", "c", "LiC5;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Le6;Lco/bird/android/core/mvp/BaseActivity;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CC5 */
/* loaded from: classes3.dex */
public final class CC5 extends AbstractC30071xE {

    /* renamed from: b */
    public final C19961e6 f3601b;

    /* renamed from: c */
    public final C42581iC5 f3602c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reason", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CC5$a */
    /* loaded from: classes3.dex */
    public static final class C0922a extends Lambda implements Function1<WireTransferOrderClosedIncompleteReason, String> {

        /* renamed from: g */
        public static final C0922a f3603g = new C0922a();

        public C0922a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireTransferOrderClosedIncompleteReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return reason.getCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CC5(C19961e6 binding, BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f3601b = binding;
        C42581iC5 c42581iC5 = new C42581iC5();
        this.f3602c = c42581iC5;
        binding.f77947e.setAdapter(c42581iC5);
    }

    /* renamed from: Zl */
    public static final String m112639Zl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Ql */
    public final Observable<Unit> m112648Ql() {
        Button button = this.f3601b.f77948f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.uploadBol");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Rl */
    public final Observable<Unit> m112647Rl() {
        Button button = this.f3601b.f77944b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addToSkuButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Sl */
    public final Observable<Unit> m112646Sl() {
        Button button = this.f3601b.f77946d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.closeIncomplete");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Tl */
    public final void m112645Tl() {
        this.f3601b.f77944b.setText(getString(C45871nl4.sku_order_inbound_cta_button, new Object[0]));
    }

    /* renamed from: Ul */
    public final void m112644Ul() {
        this.f3601b.f77944b.setText(getString(C45871nl4.sku_order_outbound_cta_button, new Object[0]));
    }

    /* renamed from: Vl */
    public final void m112643Vl(boolean z, boolean z2, boolean z3) {
        int i;
        Button button = this.f3601b.f77944b;
        BaseActivity activity = getActivity();
        if (z) {
            i = C45871nl4.sku_order_continue_scrap_cta_button;
        } else {
            i = C45871nl4.sku_order_begin_scrap_cta_button;
        }
        button.setText(activity.getString(i));
        Button button2 = this.f3601b.f77948f;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.uploadBol");
        C49520tu6.show$default(button2, z3, 0, 2, null);
        this.f3601b.f77948f.setEnabled(z2);
    }

    /* renamed from: Wl */
    public final void m112642Wl(boolean z) {
        Button button = this.f3601b.f77944b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addToSkuButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: Xl */
    public final void m112641Xl(boolean z) {
        Button button = this.f3601b.f77946d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.closeIncomplete");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: Yl */
    public final AbstractC23442F<String> m112640Yl(List<WireTransferOrderClosedIncompleteReason> reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        C47646ql0 m17149a = C47646ql0.f105721e.m17149a(reasons);
        m17149a.show(getActivity().getSupportFragmentManager(), "CloseIncompleteBottomSheet");
        AbstractC23442F<WireTransferOrderClosedIncompleteReason> m17153T9 = m17149a.m17153T9();
        final C0922a c0922a = C0922a.f3603g;
        AbstractC23442F m33157I = m17153T9.m33157I(new InterfaceC23492o() { // from class: BC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m112639Zl;
                m112639Zl = CC5.m112639Zl(Function1.this, obj);
                return m112639Zl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "dialog.selectedReason().…{ reason -> reason.code }");
        return m33157I;
    }

    /* renamed from: am */
    public final Observable<Unit> m112638am() {
        return this.f3602c.m34344y();
    }

    /* renamed from: b */
    public final void m112637b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f3602c.mo24871u(sections);
    }

    /* renamed from: bm */
    public final Observable<String> m112636bm() {
        return this.f3602c.m34345A();
    }
}
