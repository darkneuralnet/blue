package p000;

import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.NonRepair;
import co.bird.android.model.Repair;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import co.bird.android.model.wire.WireQuickLink;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C43226jI3;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002J\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00030\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0014\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u001b\u001a\u00020\bJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u0019R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, m28432d2 = {"LSE4;", "LxE;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/Repair;", "", "Ql", "", "Lco/bird/android/model/NonRepair;", "Pl", "Lco/bird/android/model/wire/WireQuickLink;", "Rl", "", "f", "enabled", "b2", "title", "t", "", "LH6;", "sections", "b", "Lco/bird/android/model/constant/PartKind;", "kind", "Lio/reactivex/p;", "Lco/bird/android/model/wire/WirePart;", "Sl", "nonRepair", "Tl", "part", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Ul", "Lk5;", "Lk5;", "binding", "LjE4;", "c", "LjE4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lk5;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SE4 */
/* loaded from: classes3.dex */
public final class SE4 extends AbstractC30071xE {

    /* renamed from: b */
    public final C25096k5 f33384b;

    /* renamed from: c */
    public final C43191jE4 f33385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SE4(BaseActivity activity, C25096k5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f33384b = binding;
        C43191jE4 c43191jE4 = new C43191jE4();
        this.f33385c = c43191jE4;
        RecyclerView recyclerView = binding.f93867c;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c43191jE4);
    }

    /* renamed from: Pl */
    public final Observable<Pair<String, NonRepair>> m85815Pl() {
        return this.f33385c.m30967v();
    }

    /* renamed from: Ql */
    public final Observable<Pair<Repair, Boolean>> m85814Ql() {
        return this.f33385c.m30966w();
    }

    /* renamed from: Rl */
    public final Observable<WireQuickLink> m85813Rl() {
        return this.f33385c.m30965x();
    }

    /* renamed from: Sl */
    public final AbstractC24507p<WirePart> m85812Sl(PartKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        String string = getActivity().getString(C45871nl4.repair_scan_part_instruction, C40854fI3.m41604a(kind, getActivity()));
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str… kind.localize(activity))");
        C43226jI3 newInstance$default = C43226jI3.C24799a.newInstance$default(C43226jI3.f92490g, kind, string, false, 4, null);
        newInstance$default.show(getActivity().getSupportFragmentManager(), "PartScanBottomSheet");
        return newInstance$default.m30816N6();
    }

    /* renamed from: Tl */
    public final AbstractC24507p<NonRepair> m85811Tl(NonRepair nonRepair) {
        Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
        C40179e93 m43172a = C40179e93.f78025d.m43172a(nonRepair);
        m43172a.show(getActivity().getSupportFragmentManager(), "NonRepairBottomSheet");
        return m43172a.m43174N6();
    }

    /* renamed from: Ul */
    public final AbstractC23442F<DialogResponse> m85810Ul(WirePart part) {
        Intrinsics.checkNotNullParameter(part, "part");
        C50933wI3 m7032a = C50933wI3.f115770d.m7032a(part);
        m7032a.show(getActivity().getSupportFragmentManager(), "PartSwapBottomSheet");
        return m7032a.m7034N6();
    }

    /* renamed from: b */
    public final void m85809b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f33385c.mo24871u(sections);
    }

    /* renamed from: b2 */
    public final void m85808b2(boolean z) {
        this.f33384b.f93866b.setEnabled(z);
    }

    /* renamed from: f */
    public final Observable<Unit> m85807f() {
        Button button = this.f33384b.f93866b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: t */
    public final void m85806t(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(title);
        }
    }
}
