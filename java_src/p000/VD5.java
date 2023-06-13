package p000;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 82\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\b6\u00107J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0004\u0012\u00020\u00070\f0\u0002J\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\u0014\u0010\u0015\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0018J\u0018\u0010!\u001a\u00020\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0007J(\u0010#\u001a\u00020\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\tJ\u001e\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\r0\f0\u0002R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00103\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00070\u00070/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00069"}, m28432d2 = {"LVD5;", "LxE;", "Lio/reactivex/Observable;", "", "B2", "v0", "doneClicks", "", "Ql", "", "enable", "enableDoneButton", "Lkotlin/Pair;", "", "n2", "Pl", "onResume", "onPause", "", "LH6;", "adapterSections", "b", "outbound", "H4", "", "expectedQuantity", "Rl", "failedScansCount", "Sl", "scannedQuantity", "Tl", "stringRes", "skuOrderId", "Ul", "commodityType", "Vl", "show", "Wl", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "Xl", "Lg6;", "Lg6;", "binding", "LH92;", "c", "LH92;", "adapter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "scanSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lg6;)V", "e", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VD5 */
/* loaded from: classes3.dex */
public final class VD5 extends AbstractC30071xE {

    /* renamed from: e */
    public static final C8579b f38754e = new C8579b(null);

    /* renamed from: f */
    public static final Regex f38755f = new Regex(InstructionFileId.DOT);

    /* renamed from: b */
    public final C20742g6 f38756b;

    /* renamed from: c */
    public final H92 f38757c;

    /* renamed from: d */
    public final C24558d<String> f38758d;

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"VD5$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: VD5$a */
    /* loaded from: classes3.dex */
    public static final class C8578a extends C39530d36 {
        public C8578a() {
        }

        @Override // p000.C39530d36, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            boolean isBlank;
            char last;
            CharSequence trim;
            Intrinsics.checkNotNullParameter(s, "s");
            isBlank = StringsKt__StringsJVMKt.isBlank(s);
            if (!isBlank) {
                last = StringsKt___StringsKt.last(s);
                if (!VD5.f38755f.matches(String.valueOf(last))) {
                    C24558d c24558d = VD5.this.f38758d;
                    trim = StringsKt__StringsKt.trim((CharSequence) s.toString());
                    c24558d.onNext(trim.toString());
                    VD5.this.f38756b.f81594n.setText((CharSequence) null);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LVD5$b;", "", "Lkotlin/text/Regex;", "PERIPHERAL_NEGATIVE_REGEX", "Lkotlin/text/Regex;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: VD5$b */
    /* loaded from: classes3.dex */
    public static final class C8579b {
        public /* synthetic */ C8579b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8579b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VD5(BaseActivity activity, C20742g6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f38756b = binding;
        H92 h92 = new H92();
        this.f38757c = h92;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f38758d = m31902e;
        binding.f81594n.addTextChangedListener(new C8578a());
        binding.f81595o.setAdapter(h92);
    }

    /* renamed from: B2 */
    public final Observable<Unit> m80207B2() {
        ImageView imageView = this.f38756b.f81596p;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.scanButton");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    /* renamed from: H4 */
    public final void m80206H4(boolean z) {
        int i;
        TextView textView = this.f38756b.f81593m;
        BaseActivity activity = getActivity();
        if (z) {
            i = C45871nl4.sku_scanner_items_added_label;
        } else {
            i = C45871nl4.sku_scanner_items_scanned_label;
        }
        textView.setText(activity.getString(i));
    }

    /* renamed from: Pl */
    public final void m80205Pl() {
        Group group = this.f38756b.f81592l;
        Intrinsics.checkNotNullExpressionValue(group, "binding.inboundScanGroup");
        C49520tu6.m11239l(group);
        TextView textView = this.f38756b.f81584d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.emptyStateText");
        C49520tu6.m11239l(textView);
    }

    /* renamed from: Ql */
    public final Observable<String> m80204Ql() {
        Observable<String> hide = this.f38758d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanSubject.hide()");
        return hide;
    }

    /* renamed from: Rl */
    public final void m80203Rl(int i) {
        this.f38756b.f81585e.setText(String.valueOf(i));
    }

    /* renamed from: Sl */
    public final void m80202Sl(int i) {
        this.f38756b.f81586f.setText(String.valueOf(i));
    }

    /* renamed from: Tl */
    public final void m80201Tl(int i) {
        this.f38756b.f81600t.setText(String.valueOf(i));
    }

    /* renamed from: Ul */
    public final void m80200Ul(int i, String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Group group = this.f38756b.f81592l;
        Intrinsics.checkNotNullExpressionValue(group, "binding.inboundScanGroup");
        C49520tu6.m11233r(group);
        this.f38756b.f81591k.setText(C50976wN1.m6966a(getActivity().getString(i, skuOrderId), 0));
    }

    /* renamed from: Vl */
    public final void m80199Vl(int i, int i2, String commodityType, String skuOrderId) {
        Intrinsics.checkNotNullParameter(commodityType, "commodityType");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        TextView textView = this.f38756b.f81584d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.emptyStateText");
        C49520tu6.m11233r(textView);
        this.f38756b.f81584d.setText(C50976wN1.m6966a(getActivity().getString(i, Integer.valueOf(i2), commodityType, skuOrderId), 0));
    }

    /* renamed from: Wl */
    public final void m80198Wl(boolean z) {
        Group group = this.f38756b.f81587g;
        Intrinsics.checkNotNullExpressionValue(group, "binding.failedScansGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    /* renamed from: Xl */
    public final Observable<Pair<String, Collection<WireSuccessfulScannedItem>>> m80197Xl() {
        return this.f38757c.m104263w();
    }

    /* renamed from: b */
    public final void m80196b(List<C3023H6> adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        this.f38757c.mo24871u(adapterSections);
    }

    public final Observable<Unit> doneClicks() {
        Button button = this.f38756b.f81583c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.doneButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    public final void enableDoneButton(boolean z) {
        this.f38756b.f81583c.setEnabled(z);
    }

    /* renamed from: n2 */
    public final Observable<Pair<Collection<String>, String>> m80195n2() {
        return this.f38757c.m104264v();
    }

    public final void onPause() {
        this.f38756b.f81594n.setText((CharSequence) null);
    }

    public final void onResume() {
        this.f38756b.f81594n.requestFocus();
    }

    /* renamed from: v0 */
    public final Observable<Unit> m80194v0() {
        ImageView imageView = this.f38756b.f81582b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.codeButton");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }
}
