package p000;

import android.content.Context;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LZ76;", "LxE;", "LH31;", "Landroid/content/Context;", "getContext", "", "LH6;", "receiptDetails", "", "Rl", "", Entry.TYPE_TEXT, "t", "", "show", "Ql", "Lio/reactivex/Observable;", "Pl", "r0", "Lm6;", "b", "Lm6;", "binding", "LJ76;", "c", "LJ76;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lm6;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z76 */
/* loaded from: classes3.dex */
public final class Z76 extends AbstractC30071xE {

    /* renamed from: b */
    public final C25914m6 f47863b;

    /* renamed from: c */
    public final J76 f47864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z76(BaseActivity activity, C25914m6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f47863b = binding;
        J76 j76 = new J76();
        this.f47864c = j76;
        RecyclerView recyclerView = binding.f97353e;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(j76);
    }

    public static /* synthetic */ void showDownloadInvoiceButton$default(Z76 z76, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        z76.m73716Ql(z);
    }

    /* renamed from: Pl */
    public final Observable<Unit> m73717Pl() {
        Button button = this.f47863b.f97351c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.downloadInvoiceButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final void m73716Ql(boolean z) {
        Button button = this.f47863b.f97351c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.downloadInvoiceButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: Rl */
    public final void m73715Rl(List<C3023H6> receiptDetails) {
        Intrinsics.checkNotNullParameter(receiptDetails, "receiptDetails");
        this.f47864c.mo24871u(receiptDetails);
    }

    public final Context getContext() {
        return getActivity();
    }

    /* renamed from: r0 */
    public final Observable<Unit> m73714r0() {
        Button button = this.f47863b.f97352d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: t */
    public final void m73713t(String str) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(str);
    }
}
