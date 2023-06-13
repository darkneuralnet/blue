package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p000.C53094zw3;
import p000.H31;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0016R\u001a\u0010\u0019\u001a\u00020\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LmA;", "LH60;", "LxE;", "Lio/reactivex/Observable;", "", "L6", "qi", "", "enabled", "Rc", "", "LH6;", "sections", "b", "", "birdCodes", "Sh", "message", "Lkotlin/Function0;", "onOk", "T3", "Lf3;", "Lf3;", "getBinding", "()Lf3;", "binding", "LG50;", "c", "LG50;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lf3;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mA */
/* loaded from: classes3.dex */
public class C25922mA extends AbstractC30071xE implements H60 {

    /* renamed from: b */
    public final C20179f3 f97465b;

    /* renamed from: c */
    public final G50 f97466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25922mA(BaseActivity activity, C20179f3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f97465b = binding;
        G50 g50 = new G50();
        this.f97466c = g50;
        binding.f79343e.setLayoutManager(new LinearLayoutManager(activity));
        binding.f79343e.setItemAnimator(new C11894g());
        binding.f79343e.setAdapter(g50);
    }

    @Override // p000.H60
    /* renamed from: L6 */
    public Observable<Unit> mo26227L6() {
        Button button = this.f97465b.f79341c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.okay");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.H60
    /* renamed from: Rc */
    public void mo26226Rc(boolean z) {
        this.f97465b.f79341c.setEnabled(z);
    }

    @Override // p000.H60
    /* renamed from: Sh */
    public void mo26225Sh(List<String> birdCodes) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(birdCodes, "birdCodes");
        if (!birdCodes.isEmpty()) {
            Object systemService = getActivity().getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(birdCodes, " ", null, null, 0, null, null, 62, null);
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Vehicle Codes", joinToString$default));
            C53094zw3.C31593a c31593a = C53094zw3.f122502a;
            BaseActivity activity = getActivity();
            String string = getActivity().getString(C45871nl4.operator_bulk_update_copy_confirm, Integer.valueOf(birdCodes.size()));
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…_confirm, birdCodes.size)");
            C53094zw3.C31593a.makeText$default(c31593a, activity, string, 1, 0, null, 24, null).show();
        }
    }

    @Override // p000.H60
    /* renamed from: T3 */
    public void mo26224T3(String message, Function0<Unit> onOk) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onOk, "onOk");
        H31.C3014a.showDialog$default(this, message, null, Integer.valueOf(C45871nl4.dialog_okay), null, false, false, onOk, null, null, 442, null);
    }

    @Override // p000.H60
    /* renamed from: b */
    public void mo26223b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f97466c.mo24871u(sections);
    }

    @Override // p000.H60
    /* renamed from: qi */
    public Observable<Unit> mo26222qi() {
        Observable<Unit> m19007b;
        ConstraintLayout root = this.f97465b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        m19007b = C46998pf5.m19007b(root, null, 1, null);
        return m19007b;
    }
}
