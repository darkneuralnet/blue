package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11915i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ContiguousDataState;
import co.bird.android.model.ContiguousInitialDataState;
import co.bird.android.model.TransactionSummary;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.DA0;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00065"}, m28432d2 = {"Lu76;", "LxE;", "Lco/bird/android/model/ContiguousInitialDataState;", TransferTable.COLUMN_STATE, "", "Sl", "Lio/reactivex/Observable;", "Ql", "LZD3;", "Lco/bird/android/model/TransactionSummary;", "history", "Tl", "Lco/bird/android/model/ContiguousDataState;", "Rl", "Pl", "L", "", "b", "Ljava/lang/String;", "genericErrorMessage", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/ProgressBar;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ProgressBar;", "progressBar", "Landroid/view/ViewGroup;", "e", "Landroid/view/ViewGroup;", "errorContainer", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "errorMessage", "Landroid/view/View;", "g", "Landroid/view/View;", "retryButton", "h", "emptyMessage", "LvO4;", "Lor6;", "i", "LvO4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "baseActivity", "", "enableRiderParkingReview", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Z)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u76  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49649u76 extends AbstractC30071xE {

    /* renamed from: b */
    public final String f111767b;

    /* renamed from: c */
    public final RecyclerView f111768c;

    /* renamed from: d */
    public final ProgressBar f111769d;

    /* renamed from: e */
    public final ViewGroup f111770e;

    /* renamed from: f */
    public final TextView f111771f;

    /* renamed from: g */
    public final View f111772g;

    /* renamed from: h */
    public final TextView f111773h;

    /* renamed from: i */
    public final C50395vO4<TransactionSummary, C46526or6> f111774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49649u76(BaseActivity baseActivity, boolean z) {
        super(baseActivity);
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        String string = getActivity().getString(C45871nl4.error_generic_body);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.error_generic_body)");
        this.f111767b = string;
        RecyclerView recyclerView = (RecyclerView) C40788fB0.m41779c(baseActivity, C36585Vg4.recyclerView);
        this.f111768c = recyclerView;
        this.f111769d = (ProgressBar) C40788fB0.m41779c(baseActivity, C36585Vg4.progressBar);
        this.f111770e = (ViewGroup) C40788fB0.m41779c(baseActivity, C36585Vg4.error);
        this.f111771f = (TextView) C40788fB0.m41779c(baseActivity, C36585Vg4.message);
        this.f111772g = C40788fB0.m41779c(baseActivity, C36585Vg4.retryButton);
        this.f111773h = (TextView) C40788fB0.m41779c(baseActivity, C36585Vg4.emptyContentMessage);
        C50395vO4<TransactionSummary, C46526or6> c50395vO4 = new C50395vO4<>(new S66(z));
        this.f111774i = c50395vO4;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c50395vO4);
        recyclerView.addItemDecoration(new C11915i(recyclerView.getContext(), linearLayoutManager.m66744F2()));
    }

    /* renamed from: L */
    public final Observable<TransactionSummary> m10843L() {
        Observable<TransactionSummary> throttleFirst = this.f111774i.m8759u().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.itemClicks().thr…0, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Pl */
    public final Observable<Unit> m10842Pl() {
        return this.f111774i.m8760t();
    }

    /* renamed from: Ql */
    public final Observable<Unit> m10841Ql() {
        return C45219mf5.m25214a(this.f111772g);
    }

    /* renamed from: Rl */
    public final void m10840Rl(ContiguousDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, ContiguousDataState.Loading.INSTANCE)) {
            this.f111774i.m8757w(DA0.C1413c.f5316a);
        } else if (Intrinsics.areEqual(state, ContiguousDataState.Done.INSTANCE)) {
            this.f111774i.m8757w(DA0.C1411a.f5314a);
        } else if (state instanceof ContiguousDataState.Error) {
            C50395vO4<TransactionSummary, C46526or6> c50395vO4 = this.f111774i;
            String message = ((ContiguousDataState.Error) state).getMessage();
            if (message == null) {
                message = this.f111767b;
            }
            c50395vO4.m8757w(new DA0.C1412b(message));
        }
    }

    /* renamed from: Sl */
    public final void m10839Sl(ContiguousInitialDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ContiguousInitialDataState.Error error = null;
        C49520tu6.show$default(this.f111768c, state instanceof ContiguousInitialDataState.Content, 0, 2, null);
        C49520tu6.show$default(this.f111773h, state instanceof ContiguousInitialDataState.Empty, 0, 2, null);
        C49520tu6.show$default(this.f111769d, state instanceof ContiguousInitialDataState.Loading, 0, 2, null);
        boolean z = state instanceof ContiguousInitialDataState.Error;
        C49520tu6.show$default(this.f111770e, z, 0, 2, null);
        if (z) {
            error = (ContiguousInitialDataState.Error) state;
        }
        if (error != null) {
            TextView textView = this.f111771f;
            String message = error.getMessage();
            if (message == null) {
                message = this.f111767b;
            }
            textView.setText(message);
        }
    }

    /* renamed from: Tl */
    public final void m10838Tl(ZD3<TransactionSummary> history) {
        Intrinsics.checkNotNullParameter(history, "history");
        this.f111774i.m71747q(history);
    }
}
