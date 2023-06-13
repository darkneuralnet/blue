package p000;

import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.NonRepair;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireQuickLink;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.H31;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b)\u0010*J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002J\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u0012\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, m28432d2 = {"LGF4;", "LxE;", "Lio/reactivex/Observable;", "", "Wl", "Lco/bird/android/model/RepairCategory;", "Ql", "Lco/bird/android/model/RepairIssue;", "ze", "Lco/bird/android/model/wire/WireQuickLink;", "Sl", "Lkotlin/Pair;", "Lco/bird/android/model/NonRepair;", "Rl", "Z5", "", "LH6;", "sections", "b", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Vl", "", "show", "Tl", "", "birdId", "Ul", "Si", PaymentMethodOptionsParams.Blik.PARAM_CODE, "vehicleId", "Xl", "Ll5;", "Ll5;", "binding", "LUE4;", "c", "LUE4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ll5;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GF4 */
/* loaded from: classes3.dex */
public final class GF4 extends AbstractC30071xE {

    /* renamed from: b */
    public final C25596l5 f11194b;

    /* renamed from: c */
    public final UE4 f11195c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GF4$a */
    /* loaded from: classes3.dex */
    public static final class C2696a extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public static final C2696a f11196g = new C2696a();

        public C2696a() {
            super(1);
        }

        /* renamed from: a */
        public final void m105589a(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m105589a(wireBird);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GF4(BaseActivity activity, C25596l5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f11194b = binding;
        UE4 ue4 = new UE4();
        this.f11195c = ue4;
        RecyclerView recyclerView = binding.f95453e;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(ue4);
    }

    /* renamed from: Yl */
    public static final Unit m105593Yl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: Ql */
    public final Observable<RepairCategory> m105602Ql() {
        return this.f11195c.m81790v();
    }

    /* renamed from: Rl */
    public final Observable<Pair<RepairCategory, NonRepair>> m105601Rl() {
        return this.f11195c.m81788x();
    }

    /* renamed from: Si */
    public final AbstractC23442F<DialogResponse> m105600Si() {
        return H31.C3014a.dialog$default(this, C45268mk4.dialog_custom_cta, Integer.valueOf(C52955zi4.primaryButton), Integer.valueOf(C52955zi4.secondaryButton), null, Integer.valueOf(C52955zi4.title), Integer.valueOf(C52955zi4.body), getString(C45871nl4.operator_dialog_update_inventory_confirm, new Object[0]), getString(C45871nl4.general_not_now, new Object[0]), null, getString(C45871nl4.operator_dialog_update_inventory_title, new Object[0]), getString(C45871nl4.operator_dialog_update_inventory_body, new Object[0]), false, true, false, null, 26888, null);
    }

    /* renamed from: Sl */
    public final Observable<WireQuickLink> m105599Sl() {
        return this.f11195c.m81787y();
    }

    /* renamed from: Tl */
    public final void m105598Tl(boolean z) {
        LinearLayout linearLayout = this.f11194b.f95450b;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.buttonContainer");
        C49520tu6.show$default(linearLayout, z, 0, 2, null);
    }

    /* renamed from: Ul */
    public final void m105597Ul(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C49495ts1.f111173f.m11545a(birdId, true).show(getActivity().getSupportFragmentManager(), "FlightSheetBottomSheetFragment");
    }

    /* renamed from: Vl */
    public final AbstractC23442F<DialogResponse> m105596Vl() {
        C38430bE4 c38430bE4 = new C38430bE4();
        c38430bE4.show(getActivity().getSupportFragmentManager(), "RepairV3CompleteBottomSheet");
        return c38430bE4.m64785N6();
    }

    /* renamed from: Wl */
    public final Observable<Unit> m105595Wl() {
        return this.f11195c.m81791A();
    }

    /* renamed from: Xl */
    public final AbstractC23442F<Unit> m105594Xl(String code, String vehicleId) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        C52471yt3 m2328a = C52471yt3.f120367g.m2328a(ScanMode.ADMIN, ScanIntention.OPERATOR_IDENTIFICATION, getActivity().getString(C45871nl4.repair_verification_scan_instruction), getActivity().getString(C45871nl4.scan_code_prompt, code), false, vehicleId);
        m2328a.show(getActivity().getSupportFragmentManager(), "OperatorSingleScanBottomSheet");
        AbstractC23442F<WireBird> m2331N6 = m2328a.m2331N6();
        final C2696a c2696a = C2696a.f11196g;
        AbstractC23442F m33157I = m2331N6.m33157I(new InterfaceC23492o() { // from class: FF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m105593Yl;
                m105593Yl = GF4.m105593Yl(Function1.this, obj);
                return m105593Yl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "dialog.result().map { }");
        return m33157I;
    }

    /* renamed from: Z5 */
    public final Observable<Unit> m105592Z5() {
        Button button = this.f11194b.f95451c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.certify");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: b */
    public final void m105591b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f11195c.mo24871u(sections);
    }

    /* renamed from: ze */
    public final Observable<RepairIssue> m105590ze() {
        return this.f11195c.m81789w();
    }
}
