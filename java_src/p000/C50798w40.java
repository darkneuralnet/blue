package p000;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.bulkscanner.widgets.BulkScanListSheetView;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.actions.OperatorTaskActionBottomSheet;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C53094zw3;
import p000.H31;
@Metadata(m28433d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0081\u0001BO\b\u0007\u0012\u0006\u0010}\u001a\u00020|\u0012\b\b\u0001\u0010W\u001a\u00020R\u0012\u0006\u0010]\u001a\u00020X\u0012\b\b\u0001\u0010`\u001a\u00020R\u0012\u0006\u0010f\u001a\u00020a\u0012\u0006\u0010l\u001a\u00020g\u0012\u0006\u0010q\u001a\u00020\u0003\u0012\b\b\u0001\u0010t\u001a\u00020R¢\u0006\u0004\b~\u0010\u007fJ\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0096\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\t\u0010\u000f\u001a\u00020\u0004H\u0096\u0001J\u0015\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0096\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001J\u0013\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001J\u0019\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0096\u0001J\u001d\u0010%\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020 H\u0096\u0001J\u0013\u0010&\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020 H\u0096\u0001J\t\u0010'\u001a\u00020\u0004H\u0096\u0001J\t\u0010(\u001a\u00020\u0004H\u0096\u0001J\t\u0010*\u001a\u00020)H\u0096\u0001J\t\u0010+\u001a\u00020 H\u0096\u0001J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0007H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0007H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\u0016\u00106\u001a\u00020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020 H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020703H\u0016J\u001e\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u0015H\u0016J8\u0010K\u001a\u00020\u00042\u0006\u0010E\u001a\u00020 2\u0006\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020 H\u0016J\u0010\u0010L\u001a\u00020\u00042\u0006\u0010E\u001a\u00020 H\u0016J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0010\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0015H\u0016J\u0010\u0010Q\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0015H\u0016R\u0017\u0010W\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010]\u001a\u00020X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010`\u001a\u00020R8\u0006¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010VR\u0017\u0010f\u001a\u00020a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010l\u001a\u00020g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010q\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010t\u001a\u00020R8\u0006¢\u0006\f\n\u0004\br\u0010T\u001a\u0004\bs\u0010VR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010vR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020a0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006\u0082\u0001"}, m28432d2 = {"Lw40;", "Lv40;", "LxE;", "Lhm5;", "", "jl", "n0", "Lio/reactivex/Observable;", "sa", "LXK;", "W3", "", "zc", "z1", "Vg", "u5", PaymentMethodOptionsParams.Blik.PARAM_CODE, "tc", "gk", C9916Yi.f46302c, "c2", "", "length", "d2", "Lfm5;", "resultHandler", "l5", "", "tolerance", "d6", "Lco/bird/android/model/wire/WireBird;", "bird", "", "isHourly", "ec", "copy", "show", "Qa", "w9", "n1", "a1", "Lak5;", "sk", "i", "dc", "Lco/bird/android/model/persistence/Bird;", "Q0", "Lco/bird/android/model/constant/BirdAction;", "U0", "Nh", "Eb", "", "LH6;", "sections", "xb", "LDI3;", "viewModel", "f6", "K6", "I5", "Dd", "enabled", "Ve", "Hd", "title", "hint", "Lio/reactivex/F;", "LH31$b;", "M", "visible", "showChirp", "showLockUnlock", "showCancelTask", "showRemoveFromList", "showFlightSheet", "d8", "j5", "ie", "errorResId", "a2", "count", "Vi", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "getViewFinder", "()Landroid/widget/ImageView;", "viewFinder", "Landroidx/appcompat/widget/AppCompatEditText;", "c", "Landroidx/appcompat/widget/AppCompatEditText;", "getCodeEditor", "()Landroidx/appcompat/widget/AppCompatEditText;", "codeEditor", DateTokenConverter.CONVERTER_KEY, "getCodeButton", "codeButton", "Landroid/view/View;", "e", "Landroid/view/View;", "getDragView", "()Landroid/view/View;", "dragView", "Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;", "f", "Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;", "getBulkBirdListSheetView", "()Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;", "bulkBirdListSheetView", "g", "Lhm5;", "getDelegate", "()Lhm5;", "delegate", "h", "getBluetoothButton", "bluetoothButton", "Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;", "Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;", "actionSheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "j", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheet", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/view/View;Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;Lhm5;Landroid/widget/ImageView;)V", "k", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: w40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50798w40 extends AbstractC30071xE implements InterfaceC50205v40, InterfaceC42324hm5 {

    /* renamed from: k */
    public static final C29752a f115234k = new C29752a(null);

    /* renamed from: b */
    public final ImageView f115235b;

    /* renamed from: c */
    public final AppCompatEditText f115236c;

    /* renamed from: d */
    public final ImageView f115237d;

    /* renamed from: e */
    public final View f115238e;

    /* renamed from: f */
    public final BulkScanListSheetView f115239f;

    /* renamed from: g */
    public final InterfaceC42324hm5 f115240g;

    /* renamed from: h */
    public final ImageView f115241h;

    /* renamed from: i */
    public final OperatorTaskActionBottomSheet f115242i;

    /* renamed from: j */
    public final BottomSheetBehavior<View> f115243j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lw40$a;", "", "", "BLUETOOTH_BUTTON", "Ljava/lang/String;", "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: w40$a */
    /* loaded from: classes3.dex */
    public static final class C29752a {
        public /* synthetic */ C29752a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29752a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, m28432d2 = {"w40$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "p0", "", "p1", "", "onSlide", "view", "", "newState", "onStateChanged", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: w40$b */
    /* loaded from: classes3.dex */
    public static final class C29753b extends BottomSheetBehavior.AbstractC17702f {
        public C29753b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View p0, float f) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View view, int i) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (i == 1) {
                C50798w40.this.f115243j.m50082p0(3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50798w40(BaseActivity activity, ImageView viewFinder, AppCompatEditText codeEditor, ImageView codeButton, View dragView, BulkScanListSheetView bulkBirdListSheetView, InterfaceC42324hm5 delegate, ImageView bluetoothButton) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewFinder, "viewFinder");
        Intrinsics.checkNotNullParameter(codeEditor, "codeEditor");
        Intrinsics.checkNotNullParameter(codeButton, "codeButton");
        Intrinsics.checkNotNullParameter(dragView, "dragView");
        Intrinsics.checkNotNullParameter(bulkBirdListSheetView, "bulkBirdListSheetView");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(bluetoothButton, "bluetoothButton");
        this.f115235b = viewFinder;
        this.f115236c = codeEditor;
        this.f115237d = codeButton;
        this.f115238e = dragView;
        this.f115239f = bulkBirdListSheetView;
        this.f115240g = delegate;
        this.f115241h = bluetoothButton;
        this.f115242i = (OperatorTaskActionBottomSheet) C40788fB0.m41779c(activity, C41087fh4.actionSheet);
        BottomSheetBehavior<View> m50133G = BottomSheetBehavior.m50133G(dragView);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(dragView)");
        this.f115243j = m50133G;
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: Dd */
    public void mo7510Dd() {
        this.f115243j.m50073u(new C29753b());
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: Eb */
    public void mo7509Eb() {
        C51391x40.m5881a(this.f115235b, C47600qg4.qr_view_finder);
        C49520tu6.show$default(this.f115236c, false, 0, 2, null);
        mo7480n0();
        C51391x40.m5881a(this.f115237d, C48193rg4.ic_button_bird_id);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: Hd */
    public List<DI3> mo7508Hd() {
        return this.f115239f.m58533g().getItems();
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: I5 */
    public void mo7507I5() {
        C44830m00.m26553a(this.f115243j);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: K6 */
    public void mo7506K6() {
        C44830m00.m26551c(this.f115243j);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: M */
    public AbstractC23442F<H31.AbstractC3016b> mo7505M(int i, int i2) {
        return H31.C3014a.dialogWithInput$default(this, getString(i, new Object[0]), null, getString(i2, new Object[0]), "", null, getString(C45871nl4.dialog_okay, new Object[0]), getString(C45871nl4.alert_leave_page_cancel, new Object[0]), false, false, true, 18, null);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: Nh */
    public void mo7504Nh() {
        this.f115239f.m58531i();
        this.f115241h.setVisibility(8);
        this.f115237d.setVisibility(8);
        getActivity().findViewById(C41087fh4.actionSheet).setVisibility(8);
        getActivity().findViewById(C41087fh4.bulkScanV1Group).setVisibility(4);
        getActivity().findViewById(C41087fh4.scanInstructionsContainer).setVisibility(0);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: Q0 */
    public Observable<Bird> mo7503Q0() {
        return this.f115239f.m58534f().m43302v();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Qa */
    public boolean mo7502Qa(String str, boolean z) {
        return this.f115240g.mo7502Qa(str, z);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: U0 */
    public Observable<BirdAction> mo7501U0() {
        return this.f115242i.m54312k();
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: Ve */
    public void mo7500Ve(boolean z) {
        this.f115239f.m58532h().setEnabled(z);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Vg */
    public Observable<Unit> mo7499Vg() {
        return this.f115240g.mo7499Vg();
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: Vi */
    public void mo7498Vi(int i) {
        error(getString(C45871nl4.operator_bulk_update_wake_bluetooth_cannot_scan_more_message, Integer.valueOf(i)));
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: W3 */
    public Observable<C9400XK> mo7497W3() {
        return this.f115240g.mo7497W3();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Yi */
    public void mo7496Yi() {
        this.f115240g.mo7496Yi();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: a1 */
    public void mo7495a1() {
        this.f115240g.mo7495a1();
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: a2 */
    public void mo7494a2(int i) {
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(errorResId)");
        c31593a.m100a(activity, string, EnumC40735f56.SHORT.m42099c(), 48, C53094zw3.C31593a.EnumC31594a.BLACK_ON_WHITE).show();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: c2 */
    public void mo7493c2() {
        this.f115240g.mo7493c2();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d2 */
    public void mo7492d2(int i) {
        this.f115240g.mo7492d2(i);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d6 */
    public void mo7491d6(float f) {
        this.f115240g.mo7491d6(f);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: d8 */
    public void mo7490d8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f115242i.m54301v(z);
        this.f115242i.m54305r(z2, z3, z4, z5, z6);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: dc */
    public Observable<Unit> mo7489dc() {
        return C45219mf5.m25214a(this.f115239f.m58532h());
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: ec */
    public void mo7488ec(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f115240g.mo7488ec(bird, z);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: f6 */
    public void mo7487f6(DI3 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f115239f.m58535e(viewModel);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: gk */
    public void mo7486gk() {
        this.f115240g.mo7486gk();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: i */
    public boolean mo7485i() {
        return this.f115240g.mo7485i();
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: ie */
    public Observable<Unit> mo7484ie() {
        return C44626lf5.clicksThrottle$default(this.f115241h, 0L, 1, null);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: j5 */
    public void mo7483j5(boolean z) {
        C49520tu6.show$default(this.f115241h, z, 0, 2, null);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: jl */
    public void mo7482jl() {
        this.f115240g.mo7482jl();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: l5 */
    public void mo7481l5(InterfaceC41138fm5 interfaceC41138fm5) {
        this.f115240g.mo7481l5(interfaceC41138fm5);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n0 */
    public void mo7480n0() {
        this.f115240g.mo7480n0();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n1 */
    public void mo7479n1() {
        this.f115240g.mo7479n1();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sa */
    public Observable<Unit> mo7478sa() {
        return this.f115240g.mo7478sa();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sk */
    public EnumC38136ak5 mo7477sk() {
        return this.f115240g.mo7477sk();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: tc */
    public void mo7476tc(String str) {
        this.f115240g.mo7476tc(str);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: u5 */
    public void mo7475u5() {
        this.f115240g.mo7475u5();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: w9 */
    public void mo7474w9(boolean z) {
        this.f115240g.mo7474w9(z);
    }

    @Override // p000.InterfaceC50205v40
    /* renamed from: xb */
    public void mo7473xb(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f115239f.m58530j(sections);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: z1 */
    public Observable<Unit> mo7472z1() {
        return this.f115240g.mo7472z1();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: zc */
    public Observable<String> mo7471zc() {
        return this.f115240g.mo7471zc();
    }
}
