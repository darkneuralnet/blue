package p000;

import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.LegacyRepairType;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J.\u0010\u0013\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011 \u0012*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\u000f0\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"LgB4;", "LxE;", "LeB4;", "", "LH6;", "adapterSections", "", "T4", "Lio/reactivex/k;", "S5", "Lio/reactivex/Observable;", "", "I1", "q0", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "Lco/bird/android/model/LegacyRepairType;", "", "kotlin.jvm.PlatformType", "Ql", "", "count", "ph", "Le5;", "b", "Le5;", "binding", "Ly7;", "c", "Ly7;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Le5;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gB4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41385gB4 extends AbstractC30071xE implements InterfaceC40199eB4 {

    /* renamed from: b */
    public final C19960e5 f81745b;

    /* renamed from: c */
    public final C30418y7 f81746c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gB4$a */
    /* loaded from: classes3.dex */
    public static final class C20780a extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C20780a f81747g = new C20780a();

        public C20780a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41385gB4(BaseActivity activity, C19960e5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f81745b = binding;
        C30418y7 c30418y7 = new C30418y7();
        this.f81746c = c30418y7;
        binding.f77932e.setLayoutManager(new LinearLayoutManager(activity));
        binding.f77932e.setAdapter(c30418y7);
    }

    /* renamed from: Rl */
    public static final String m39899Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40199eB4
    /* renamed from: I1 */
    public Observable<String> mo39902I1() {
        C24558d<CharSequence> m4127q = this.f81746c.m4127q();
        final C20780a c20780a = C20780a.f81747g;
        Observable map = m4127q.map(new InterfaceC23492o() { // from class: fB4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m39899Rl;
                m39899Rl = C41385gB4.m39899Rl(Function1.this, obj);
                return m39899Rl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "adapter.searchPublisher.map { it.toString() }");
        return map;
    }

    @Override // p000.InterfaceC40199eB4
    /* renamed from: Ql */
    public C24558d<Pair<LegacyRepairType, Boolean>> repairItemChecks() {
        return this.f81746c.m4128p();
    }

    @Override // p000.InterfaceC40199eB4
    /* renamed from: S5 */
    public AbstractC24490k<Unit> mo39898S5() {
        Button button = this.f81745b.f77929b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addRepair");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.addRepair.clicks…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC40199eB4
    /* renamed from: T4 */
    public void mo39897T4(List<C3023H6> adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        this.f81746c.m4126r(adapterSections);
    }

    @Override // p000.InterfaceC40199eB4
    /* renamed from: ph */
    public void mo39896ph(int i) {
        String string;
        if (i == 1) {
            string = getActivity().getString(C45871nl4.repair_logger_add_repair);
        } else {
            string = getActivity().getString(C45871nl4.add_count_format, Integer.valueOf(i));
        }
        Intrinsics.checkNotNullExpressionValue(string, "if (count == 1) {\n      …ount_format, count)\n    }");
        this.f81745b.f77929b.setText(string);
    }

    @Override // p000.InterfaceC40199eB4
    /* renamed from: q0 */
    public List<C3023H6> mo39895q0() {
        return this.f81746c.m4129o();
    }
}
