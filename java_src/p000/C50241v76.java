package p000;

import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireMerchantTransaction;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"Lv76;", "Lt76;", "Lio/reactivex/Observable;", "", "M0", "LZD3;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "transactions", "N0", "", "title", "P0", "R0", "", "show", "Q0", "O0", "L", "", "id", "getString", "Lco/bird/android/core/mvp/BaseActivity;", C17296a.f69688o, "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Ll4;", "b", "Ll4;", "binding", "LvO4;", "Lpr6;", "c", "LvO4;", "adapter", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ll4;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: v76  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50241v76 implements InterfaceC49056t76 {

    /* renamed from: a */
    public final BaseActivity f113550a;

    /* renamed from: b */
    public final C25594l4 f113551b;

    /* renamed from: c */
    public final C50395vO4<WireMerchantTransaction, C47119pr6> f113552c;

    public C50241v76(BaseActivity activity, C25594l4 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f113550a = activity;
        this.f113551b = binding;
        C50395vO4<WireMerchantTransaction, C47119pr6> c50395vO4 = new C50395vO4<>(new FQ2(activity));
        this.f113552c = c50395vO4;
        binding.f95417h.setLayoutManager(new LinearLayoutManager(activity));
        binding.f95417h.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        binding.f95417h.addItemDecoration(new FN5(activity, C37044Xf4.card_spacing));
        binding.f95417h.setAdapter(c50395vO4);
    }

    @Override // p000.InterfaceC49056t76
    /* renamed from: L */
    public Observable<WireMerchantTransaction> mo9164L() {
        Observable<WireMerchantTransaction> throttleFirst = this.f113552c.m8759u().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.itemClicks().thr…0, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    @Override // p000.InterfaceC49056t76
    /* renamed from: M0 */
    public Observable<Unit> mo9163M0() {
        Button button = this.f113551b.f95411b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.agreementActionButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC49056t76
    /* renamed from: N0 */
    public void mo9162N0(ZD3<WireMerchantTransaction> transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        mo9159Q0(transactions.isEmpty());
        transactions.m73551u(transactions.m73554X(), new C38969c86(this));
        this.f113552c.m71747q(transactions);
    }

    @Override // p000.InterfaceC49056t76
    /* renamed from: O0 */
    public void mo9161O0(boolean z) {
        CardView cardView = this.f113551b.f95412c;
        Intrinsics.checkNotNullExpressionValue(cardView, "binding.agreementContainer");
        C49520tu6.show$default(cardView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC49056t76
    /* renamed from: P0 */
    public void mo9160P0(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f113551b.f95411b.setText(title);
    }

    @Override // p000.InterfaceC49056t76
    /* renamed from: Q0 */
    public void mo9159Q0(boolean z) {
        TextView textView = this.f113551b.f95416g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.emptyMerchantHistory");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC49056t76
    /* renamed from: R0 */
    public void mo9158R0(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f113551b.f95413d.setText(title);
    }

    @Override // p000.InterfaceC49056t76
    public String getString(int i) {
        String string = this.f113550a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(id)");
        return string;
    }
}
