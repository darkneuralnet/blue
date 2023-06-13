package p000;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b*\u0010+J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f0\u0002J\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f0\u0002J\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u0002J\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f0\u0002J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u0014\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\rJ\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&¨\u0006,"}, m28432d2 = {"LR42;", "LxE;", "Lio/reactivex/Observable;", "", "c", "Wl", "Sl", "", "enabled", "x", "selected", "Tl", "Lkotlin/Pair;", "", "Rl", "K0", "Zl", "Ql", "Lco/bird/android/model/InspectionFlow;", "inspection", "Lco/bird/android/model/constant/InspectionContext;", "inspectionContext", "Lco/bird/android/model/DialogResponse;", "Vl", "", "LH6;", "sections", "b", "birdId", "Ul", PaymentMethodOptionsParams.Blik.PARAM_CODE, "vehicleId", "Lio/reactivex/F;", "Xl", "LU3;", "LU3;", "binding", "LW32;", "LW32;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LU3;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3Ui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Ui.kt\nco/bird/android/feature/workorders/v3/InspectionV3Ui\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1855#2,2:114\n*S KotlinDebug\n*F\n+ 1 InspectionV3Ui.kt\nco/bird/android/feature/workorders/v3/InspectionV3Ui\n*L\n44#1:114,2\n*E\n"})
/* renamed from: R42 */
/* loaded from: classes3.dex */
public final class R42 extends AbstractC30071xE {

    /* renamed from: b */
    public final C8185U3 f31469b;

    /* renamed from: c */
    public final W32 f31470c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: R42$a */
    /* loaded from: classes3.dex */
    public static final class C7061a extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public static final C7061a f31471g = new C7061a();

        public C7061a() {
            super(1);
        }

        /* renamed from: a */
        public final void m87341a(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m87341a(wireBird);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R42(BaseActivity activity, C8185U3 binding) {
        super(activity);
        List<Drawable> filterNotNull;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f31469b = binding;
        W32 w32 = new W32();
        this.f31470c = w32;
        RecyclerView recyclerView = binding.f36762e;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(w32);
        Drawable[] compoundDrawablesRelative = binding.f36760c.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "binding.passAll.compoundDrawablesRelative");
        filterNotNull = ArraysKt___ArraysKt.filterNotNull(compoundDrawablesRelative);
        for (Drawable drawable : filterNotNull) {
            drawable.setTintList(NA0.m94300d(activity, C32832Ff4.inspection_pass_all_state_list));
        }
    }

    /* renamed from: Yl */
    public static final Unit m87346Yl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public final Observable<Pair<String, Boolean>> m87356K0() {
        return this.f31470c.m78883x();
    }

    /* renamed from: Ql */
    public final Observable<Pair<String, Boolean>> m87354Ql() {
        return this.f31470c.m78885v();
    }

    /* renamed from: Rl */
    public final Observable<Pair<String, Boolean>> m87353Rl() {
        return this.f31470c.m78884w();
    }

    /* renamed from: Sl */
    public final Observable<Unit> m87352Sl() {
        Button button = this.f31469b.f36760c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.passAll");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Tl */
    public final void m87351Tl(boolean z, boolean z2) {
        this.f31469b.f36760c.setSelected(z);
        this.f31469b.f36760c.setEnabled(z2);
    }

    /* renamed from: Ul */
    public final void m87350Ul(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C49495ts1.f111173f.m11545a(birdId, true).show(getActivity().getSupportFragmentManager(), "FlightSheetBottomSheetFragment");
    }

    /* renamed from: Vl */
    public final Observable<DialogResponse> m87349Vl(InspectionFlow inspection, InspectionContext inspectionContext) {
        Intrinsics.checkNotNullParameter(inspection, "inspection");
        Intrinsics.checkNotNullParameter(inspectionContext, "inspectionContext");
        C37739a42 m71930a = C37739a42.f49776d.m71930a(inspection, inspectionContext);
        m71930a.show(getActivity().getSupportFragmentManager(), "InspectionV3CompleteBottomSheet");
        return m71930a.m71932N6();
    }

    /* renamed from: Wl */
    public final Observable<Unit> m87348Wl() {
        return this.f31470c.m78882y();
    }

    /* renamed from: Xl */
    public final AbstractC23442F<Unit> m87347Xl(String code, String vehicleId) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        C52471yt3 m2328a = C52471yt3.f120367g.m2328a(ScanMode.ADMIN, ScanIntention.OPERATOR_IDENTIFICATION, getActivity().getString(C45871nl4.repair_verification_scan_instruction), getActivity().getString(C45871nl4.scan_code_prompt, code), false, vehicleId);
        m2328a.show(getActivity().getSupportFragmentManager(), "OperatorSingleScanBottomSheet");
        AbstractC23442F<WireBird> m2331N6 = m2328a.m2331N6();
        final C7061a c7061a = C7061a.f31471g;
        AbstractC23442F m33157I = m2331N6.m33157I(new InterfaceC23492o() { // from class: Q42
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m87346Yl;
                m87346Yl = R42.m87346Yl(Function1.this, obj);
                return m87346Yl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "dialog.result().map { }");
        return m33157I;
    }

    /* renamed from: Zl */
    public final Observable<Pair<String, String>> m87345Zl() {
        return this.f31470c.m78886A();
    }

    /* renamed from: b */
    public final void m87344b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f31470c.mo24871u(sections);
    }

    /* renamed from: c */
    public final Observable<Unit> m87343c() {
        Button button = this.f31469b.f36763f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: x */
    public final void m87342x(boolean z) {
        this.f31469b.f36763f.setEnabled(z);
    }
}
