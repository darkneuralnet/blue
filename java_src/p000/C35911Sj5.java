package p000;

import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C11515b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PartKind;
import co.bird.android.widget.QrCodeZXingScannerView;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001;B\u0019\b\u0007\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b8\u00109J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002R\u001a\u0010%\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R:\u0010/\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b ,*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00102¨\u0006<"}, m28432d2 = {"LSj5;", "LxE;", "LQj5;", "", "init", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Ls32;", "T", "M9", "v0", "p3", "", "enabled", "O3", "B6", "Lco/bird/android/model/constant/PartKind;", "partKind", "d1", "onResume", "onPause", "LbN4;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "handleResult", "enable", "tf", "ud", "visible", "R3", "Sl", "Rl", "LU5;", "b", "LU5;", "Ql", "()LU5;", "binding", "c", "Z", "peripheralScannerEnabled", DateTokenConverter.CONVERTER_KEY, "scanningEnabled", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "scanSubject", "Landroidx/constraintlayout/widget/b;", "f", "Landroidx/constraintlayout/widget/b;", "scanConstraintSet", "g", "codeConstraintSet", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LU5;)V", "h", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanCodeUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanCodeUi.kt\nco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n1#2:232\n*E\n"})
/* renamed from: Sj5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C35911Sj5 extends AbstractC30071xE implements InterfaceC35443Qj5 {

    /* renamed from: h */
    public static final C7518a f34150h = new C7518a(null);

    /* renamed from: i */
    public static final PartKind[] f34151i = {PartKind.BRAIN, PartKind.PLATE};

    /* renamed from: j */
    public static final Regex f34152j = new Regex(InstructionFileId.DOT);

    /* renamed from: k */
    public static final long f34153k = 500;

    /* renamed from: b */
    public final C8191U5 f34154b;

    /* renamed from: c */
    public boolean f34155c;

    /* renamed from: d */
    public boolean f34156d;

    /* renamed from: e */
    public final C24558d<Pair<String, EnumC48419s32>> f34157e;

    /* renamed from: f */
    public C11515b f34158f;

    /* renamed from: g */
    public C11515b f34159g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"LSj5$a;", "", "", "Lco/bird/android/model/constant/PartKind;", "BARCODE_KINDS", "[Lco/bird/android/model/constant/PartKind;", "Lkotlin/text/Regex;", "PERIPHERAL_NEGATIVE_REGEX", "Lkotlin/text/Regex;", "", "SHOW_KEYBOARD_DELAY_MS", "J", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Sj5$a */
    /* loaded from: classes4.dex */
    public static final class C7518a {
        public /* synthetic */ C7518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7518a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Sj5$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C7519b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.STICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PartKind.PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PartKind.GERMAN_PLATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PartKind.IL_PLATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PartKind.BRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"Sj5$c", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Sj5$c */
    /* loaded from: classes4.dex */
    public static final class C7520c extends C39530d36 {
        public C7520c() {
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
                if (!C35911Sj5.f34152j.matches(String.valueOf(last))) {
                    C24558d c24558d = C35911Sj5.this.f34157e;
                    trim = StringsKt__StringsKt.trim((CharSequence) s.toString());
                    c24558d.onNext(TuplesKt.m28425to(trim.toString(), EnumC48419s32.SCAN));
                    C35911Sj5.this.m84984Ql().f36819j.setText((CharSequence) null);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/TextView;", "<anonymous parameter 0>", "", "actionId", "Landroid/view/KeyEvent;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sj5$d */
    /* loaded from: classes4.dex */
    public static final class C7521d extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
        public C7521d() {
            super(3);
        }

        /* renamed from: a */
        public final Boolean m84980a(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 0 || i == 3) {
                C35911Sj5.this.f34157e.onNext(TuplesKt.m28425to(String.valueOf(C35911Sj5.this.m84984Ql().f36819j.getText()), EnumC48419s32.MANUAL));
                C35911Sj5.this.m84984Ql().f36819j.setText((CharSequence) null);
            }
            return Boolean.FALSE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
            return m84980a(textView, num.intValue(), keyEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35911Sj5(BaseActivity activity, C8191U5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f34154b = binding;
        this.f34156d = true;
        C24558d<Pair<String, EnumC48419s32>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<String, InputType>>()");
        this.f34157e = m31902e;
    }

    /* renamed from: Tl */
    public static final void m84981Tl(C35911Sj5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OptionalImeEditText optionalImeEditText = this$0.f34154b.f36819j;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText, "binding.peripheralEditText");
        this$0.showKeyboard(optionalImeEditText);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: B6 */
    public void mo84845B6() {
        QrCodeZXingScannerView qrCodeZXingScannerView = this.f34154b.f36823n;
        qrCodeZXingScannerView.setFlash(!qrCodeZXingScannerView.getFlash());
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: M9 */
    public Observable<Unit> mo84843M9() {
        ImageView imageView = this.f34154b.f36815f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.flash");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: O3 */
    public void mo84842O3(boolean z) {
        this.f34156d = z;
    }

    /* renamed from: Ql */
    public final C8191U5 m84984Ql() {
        return this.f34154b;
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: R3 */
    public void mo84839R3(boolean z) {
        ImageView imageView = this.f34154b.f36813d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.code");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    /* renamed from: Rl */
    public final boolean m84983Rl() {
        return getActivity().getResources().getConfiguration().keyboard != 1;
    }

    /* renamed from: Sl */
    public final void m84982Sl() {
        TextView textView = this.f34154b.f36817h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.or");
        C49520tu6.m11232s(textView, false, 4);
        ImageView imageView = this.f34154b.f36821l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.qrScooter");
        C49520tu6.m11232s(imageView, false, 4);
        ImageView imageView2 = this.f34154b.f36811b;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.barcodeScooter");
        C49520tu6.m11232s(imageView2, false, 4);
        ImageView imageView3 = this.f34154b.f36818i;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.partIcon");
        C49520tu6.m11233r(imageView3);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: T */
    public Observable<Pair<String, EnumC48419s32>> mo84837T() {
        Observable<Pair<String, EnumC48419s32>> hide = this.f34157e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: d1 */
    public void mo84836d1(PartKind partKind) {
        boolean contains;
        int i;
        contains = ArraysKt___ArraysKt.contains(f34151i, partKind);
        if (contains) {
            C11515b c11515b = new C11515b();
            c11515b.m67813o(getActivity(), C36144Tj4.activity_scan_barcode);
            c11515b.m67819i(this.f34154b.f36822m);
            C11515b c11515b2 = new C11515b();
            c11515b2.m67813o(getActivity(), C36144Tj4.activity_scan_barcode_2);
            this.f34159g = c11515b2;
            this.f34154b.f36826q.setImageDrawable(NA0.m94299e(getActivity(), C33309Hg4.barcode_view_finder));
        } else {
            C11515b c11515b3 = new C11515b();
            c11515b3.m67813o(getActivity(), C36144Tj4.activity_scan_qr_code_2);
            this.f34159g = c11515b3;
        }
        if (partKind == null) {
            i = -1;
        } else {
            i = C7519b.$EnumSwitchMapping$0[partKind.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.f34154b.f36818i.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_vehicle_brain));
                            this.f34154b.f36816g.setText(getActivity().getString(C45871nl4.id_tools_scan_instruction_brain));
                        }
                    } else {
                        this.f34154b.f36818i.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_license_plate));
                        this.f34154b.f36816g.setText(getActivity().getString(C45871nl4.id_tools_scan_instruction_il_license));
                        m84982Sl();
                    }
                } else {
                    this.f34154b.f36818i.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_license_plate));
                    this.f34154b.f36816g.setText(getActivity().getString(C45871nl4.id_tools_scan_instruction_german_license));
                    m84982Sl();
                }
            } else {
                this.f34154b.f36818i.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_license_plate));
                this.f34154b.f36816g.setText(getActivity().getString(C45871nl4.id_tools_scan_instruction_license));
            }
        } else {
            this.f34154b.f36818i.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_qr_code));
            this.f34154b.f36816g.setText(getActivity().getString(C45871nl4.id_tools_scan_instruction_qr_code));
            m84982Sl();
        }
        C11515b c11515b4 = new C11515b();
        c11515b4.m67812p(this.f34154b.f36822m);
        this.f34158f = c11515b4;
        mo84834tf(this.f34155c);
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 c38511bN4) {
        String m64617f;
        if (this.f34156d && c38511bN4 != null && (m64617f = c38511bN4.m64617f()) != null) {
            this.f34157e.onNext(TuplesKt.m28425to(m64617f, EnumC48419s32.SCAN));
        }
    }

    @Override // p000.InterfaceC35443Qj5
    public void init() {
        this.f34154b.f36819j.addTextChangedListener(new C7520c());
        OptionalImeEditText optionalImeEditText = this.f34154b.f36819j;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText, "binding.peripheralEditText");
        C34585Ms2.m94658m(optionalImeEditText, new C7521d());
    }

    @Override // p000.InterfaceC35443Qj5
    public void onPause() {
        this.f34154b.f36819j.setText((CharSequence) null);
        this.f34154b.f36823n.stopCamera();
    }

    @Override // p000.InterfaceC35443Qj5
    public void onResume() {
        if (!m84983Rl()) {
            mo84834tf(false);
        }
        if (!this.f34155c) {
            this.f34154b.f36823n.setAspectTolerance(0.2f);
            this.f34154b.f36823n.startCamera();
            mo84835p3();
            return;
        }
        this.f34154b.f36819j.requestFocus();
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: p3 */
    public void mo84835p3() {
        this.f34154b.f36823n.resumeCameraPreview(this);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: tf */
    public void mo84834tf(boolean z) {
        if (!z || m84983Rl()) {
            this.f34155c = z;
            ImageView imageView = this.f34154b.f36826q;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.viewFinder");
            C49520tu6.show$default(imageView, !z, 0, 2, null);
            ImageView imageView2 = this.f34154b.f36815f;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.flash");
            C49520tu6.show$default(imageView2, !z, 0, 2, null);
            if (z) {
                this.f34154b.f36819j.requestFocus();
                onResume();
                return;
            }
            this.f34154b.f36819j.clearFocus();
            onPause();
        }
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: ud */
    public void mo84833ud() {
        boolean z;
        if (this.f34154b.f36819j.getAlpha() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C11515b c11515b = null;
        if (z) {
            this.f34154b.f36819j.setTextEditor(true);
            OptionalImeEditText optionalImeEditText = this.f34154b.f36819j;
            Intrinsics.checkNotNullExpressionValue(optionalImeEditText, "binding.peripheralEditText");
            showKeyboard(optionalImeEditText);
            new Handler().postDelayed(new Runnable() { // from class: Rj5
                @Override // java.lang.Runnable
                public final void run() {
                    C35911Sj5.m84981Tl(C35911Sj5.this);
                }
            }, f34153k);
            C11515b c11515b2 = this.f34159g;
            if (c11515b2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("codeConstraintSet");
            } else {
                c11515b = c11515b2;
            }
            c11515b.m67819i(this.f34154b.f36822m);
            return;
        }
        this.f34154b.f36819j.setTextEditor(false);
        OptionalImeEditText optionalImeEditText2 = this.f34154b.f36819j;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText2, "binding.peripheralEditText");
        hideKeyboard(optionalImeEditText2);
        C11515b c11515b3 = this.f34158f;
        if (c11515b3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scanConstraintSet");
        } else {
            c11515b = c11515b3;
        }
        c11515b.m67819i(this.f34154b.f36822m);
    }

    @Override // p000.InterfaceC35443Qj5
    /* renamed from: v0 */
    public Observable<Unit> mo84832v0() {
        ImageView imageView = this.f34154b.f36813d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.code");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }
}
