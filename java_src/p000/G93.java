package p000;

import android.content.DialogInterface;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.NonRepairReason;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0014\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006 "}, m28432d2 = {"LG93;", "LxE;", "Lio/reactivex/Observable;", "Lco/bird/android/model/NonRepairReason;", "Pl", "", "Ql", "", "f", DateTokenConverter.CONVERTER_KEY, "", "LH6;", "sections", "b", "dismiss", "", "show", "Rl", "LRZ;", "LRZ;", "binding", "Landroid/content/DialogInterface;", "c", "Landroid/content/DialogInterface;", "dialog", "Lc93;", "Lc93;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LRZ;Landroid/content/DialogInterface;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G93 */
/* loaded from: classes3.dex */
public final class G93 extends AbstractC30071xE {

    /* renamed from: b */
    public final C7204RZ f11063b;

    /* renamed from: c */
    public final DialogInterface f11064c;

    /* renamed from: d */
    public final C38976c93 f11065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G93(BaseActivity activity, C7204RZ binding, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f11063b = binding;
        this.f11064c = dialog;
        C38976c93 c38976c93 = new C38976c93();
        this.f11065d = c38976c93;
        RecyclerView recyclerView = binding.f32211d;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(c38976c93);
        recyclerView.setItemAnimator(new C11894g());
    }

    /* renamed from: Pl */
    public final Observable<NonRepairReason> m105684Pl() {
        return this.f11065d.m61884v();
    }

    /* renamed from: Ql */
    public final Observable<String> m105683Ql() {
        return this.f11065d.m61883z();
    }

    /* renamed from: Rl */
    public final void m105682Rl(boolean z) {
        Button button = this.f11063b.f32209b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: b */
    public final void m105681b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f11065d.mo24871u(sections);
    }

    /* renamed from: d */
    public final Observable<Unit> m105680d() {
        Button button = this.f11063b.f32209b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    public final void dismiss() {
        this.f11064c.dismiss();
    }

    /* renamed from: f */
    public final Observable<Unit> m105679f() {
        Button button = this.f11063b.f32210c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
