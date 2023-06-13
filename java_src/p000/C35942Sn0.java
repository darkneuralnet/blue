package p000;

import android.widget.Button;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.model.constant.PartKind;
import co.bird.android.vehiclescanner.views.CodeScanningView;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import p000.InterfaceC35474Qn0;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001HB9\b\u0007\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010&\u001a\u00020!\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207¢\u0006\u0004\bE\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u001a\u0010&\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R:\u0010B\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r ?*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b0\u000b0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006I"}, m28432d2 = {"LSn0;", "LxE;", "LQn0;", "", "Ql", "", "init", "Lio/reactivex/Observable;", "M9", "v0", "G", "Lkotlin/Pair;", "", "Ls32;", "T", "p3", "B6", "enabled", "O3", "onResume", "onPause", "visible", "rf", "Lco/bird/android/model/constant/PartKind;", "partKind", "d1", "enable", "tf", "LbN4;", "p0", "handleResult", "ud", "R3", "Lco/bird/android/widget/OperatorInfoCard;", "b", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/widget/BlockingEnterLocationView;", "c", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/vehiclescanner/views/CodeScanningView;", "e", "Lco/bird/android/vehiclescanner/views/CodeScanningView;", "scanner", "Landroid/widget/EditText;", "f", "Landroid/widget/EditText;", "peripheralEditText", "g", "Z", "peripheralScannerEnabled", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/d;", "scanSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Landroid/widget/Button;Lco/bird/android/vehiclescanner/views/CodeScanningView;Landroid/widget/EditText;)V", "i", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35942Sn0 extends AbstractC30071xE implements InterfaceC35474Qn0 {

    /* renamed from: i */
    public static final C7543a f34262i = new C7543a(null);

    /* renamed from: j */
    public static final Regex f34263j = new Regex(InstructionFileId.DOT);

    /* renamed from: b */
    public final OperatorInfoCard f34264b;

    /* renamed from: c */
    public final BlockingEnterLocationView f34265c;

    /* renamed from: d */
    public final Button f34266d;

    /* renamed from: e */
    public final CodeScanningView f34267e;

    /* renamed from: f */
    public final EditText f34268f;

    /* renamed from: g */
    public boolean f34269g;

    /* renamed from: h */
    public final C24558d<Pair<String, EnumC48419s32>> f34270h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LSn0$a;", "", "Lkotlin/text/Regex;", "PERIPHERAL_NEGATIVE_REGEX", "Lkotlin/text/Regex;", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Sn0$a */
    /* loaded from: classes3.dex */
    public static final class C7543a {
        public /* synthetic */ C7543a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7543a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"Sn0$b", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Sn0$b */
    /* loaded from: classes3.dex */
    public static final class C7544b extends C39530d36 {
        public C7544b() {
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
                if (!C35942Sn0.f34263j.matches(String.valueOf(last))) {
                    C24558d c24558d = C35942Sn0.this.f34270h;
                    trim = StringsKt__StringsKt.trim((CharSequence) s.toString());
                    c24558d.onNext(TuplesKt.m28425to(trim.toString(), EnumC48419s32.SCAN));
                    C35942Sn0.this.f34268f.setText((CharSequence) null);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "raw", "Lkotlin/Pair;", "Ls32;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sn0$c */
    /* loaded from: classes3.dex */
    public static final class C7545c extends Lambda implements Function1<String, Pair<? extends String, ? extends EnumC48419s32>> {

        /* renamed from: g */
        public static final C7545c f34272g = new C7545c();

        public C7545c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<String, EnumC48419s32> invoke(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            return TuplesKt.m28425to(raw, EnumC48419s32.SCAN);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35942Sn0(BaseActivity activity, OperatorInfoCard operatorInfoCard, BlockingEnterLocationView blockingEnterLocationOverlay, Button settingsButton, CodeScanningView scanner, EditText peripheralEditText) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(operatorInfoCard, "operatorInfoCard");
        Intrinsics.checkNotNullParameter(blockingEnterLocationOverlay, "blockingEnterLocationOverlay");
        Intrinsics.checkNotNullParameter(settingsButton, "settingsButton");
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        Intrinsics.checkNotNullParameter(peripheralEditText, "peripheralEditText");
        this.f34264b = operatorInfoCard;
        this.f34265c = blockingEnterLocationOverlay;
        this.f34266d = settingsButton;
        this.f34267e = scanner;
        this.f34268f = peripheralEditText;
        C24558d<Pair<String, EnumC48419s32>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<String, InputType>>()");
        this.f34270h = m31902e;
    }

    /* renamed from: Rl */
    public static final Pair m84838Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: B6 */
    public void mo84845B6() {
        this.f34267e.m54783B6();
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return InterfaceC35474Qn0.C6900a.m87942a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        InterfaceC35474Qn0.C6900a.m87940c(this, user);
    }

    @Override // p000.InterfaceC35474Qn0
    /* renamed from: G */
    public Observable<Unit> mo84844G() {
        return this.f34267e.m54782G();
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return InterfaceC35474Qn0.C6900a.m87934i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        InterfaceC35474Qn0.C6900a.m87937f(this, str);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: M9 */
    public Observable<Unit> mo84843M9() {
        return this.f34267e.m54779f();
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: O3 */
    public void mo84842O3(boolean z) {
        this.f34267e.setScanningEnabled(z);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f34265c;
    }

    /* renamed from: Ql */
    public final boolean m84840Ql() {
        return getActivity().getResources().getConfiguration().keyboard != 1;
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: R3 */
    public void mo84839R3(boolean z) {
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f34266d;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        InterfaceC35474Qn0.C6900a.m87939d(this, warehouse);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: T */
    public Observable<Pair<String, EnumC48419s32>> mo84837T() {
        C24558d<Pair<String, EnumC48419s32>> c24558d = this.f34270h;
        Observable<String> m54781T = this.f34267e.m54781T();
        final C7545c c7545c = C7545c.f34272g;
        Observable<Pair<String, EnumC48419s32>> merge = Observable.merge(c24558d, m54781T.map(new InterfaceC23492o() { // from class: Rn0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m84838Rl;
                m84838Rl = C35942Sn0.m84838Rl(Function1.this, obj);
                return m84838Rl;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n    scanSubject,\n…w to InputType.SCAN }\n  )");
        return merge;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        InterfaceC35474Qn0.C6900a.m87935h(this, z);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: d1 */
    public void mo84836d1(PartKind partKind) {
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 c38511bN4) {
    }

    @Override // p000.InterfaceC35443Qj5
    public void init() {
        this.f34268f.addTextChangedListener(new C7544b());
    }

    @Override // p000.InterfaceC35443Qj5
    public void onPause() {
        this.f34268f.setText((CharSequence) null);
        this.f34267e.m54777h();
    }

    @Override // p000.InterfaceC35443Qj5
    public void onResume() {
        if (!m84840Ql()) {
            mo84834tf(false);
        }
        if (!this.f34269g) {
            this.f34267e.m54778g();
        } else {
            this.f34268f.requestFocus();
        }
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f34264b;
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: p3 */
    public void mo84835p3() {
        this.f34267e.m54776p3();
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        InterfaceC35474Qn0.C6900a.m87936g(this, z);
        mo84842O3(!z);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: tf */
    public void mo84834tf(boolean z) {
        if (!z || m84840Ql()) {
            this.f34269g = z;
            this.f34267e.m54780e(z);
            if (z) {
                this.f34268f.requestFocus();
                onResume();
                return;
            }
            this.f34268f.clearFocus();
            onPause();
        }
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: ud */
    public void mo84833ud() {
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: v0 */
    public Observable<Unit> mo84832v0() {
        return this.f34267e.m54775v0();
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return InterfaceC35474Qn0.C6900a.m87941b(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        InterfaceC35474Qn0.C6900a.m87938e(this, str);
    }
}
