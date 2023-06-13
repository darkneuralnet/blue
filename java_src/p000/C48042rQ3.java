package p000;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BirdActionView;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B{\b\u0007\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010/\u001a\u00020,\u0012\b\b\u0001\u00103\u001a\u000200\u0012\b\b\u0001\u00105\u001a\u000200\u0012\u0006\u00109\u001a\u000206\u0012\b\b\u0001\u0010;\u001a\u000200\u0012\n\b\u0003\u0010?\u001a\u0004\u0018\u00010<\u0012\n\b\u0003\u0010A\u001a\u0004\u0018\u00010<\u0012\n\b\u0003\u0010B\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010C\u0012\n\b\u0001\u0010J\u001a\u0004\u0018\u00010G¢\u0006\u0004\bR\u0010SJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\u0012\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)H\u0016R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u0016\u0010?\u001a\u0004\u0018\u00010<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u0004\u0018\u00010<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010B\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0016\u0010F\u001a\u0004\u0018\u00010C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u0004\u0018\u00010G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010O\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010\u000f0\u000f0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006T"}, m28432d2 = {"LrQ3;", "Lhm5;", "LxE;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "tc", "gk", C9916Yi.f46302c, "Lak5;", "sk", "c2", "Lio/reactivex/Observable;", "sa", "z1", "LXK;", "W3", "", "i", "Rl", "n0", "jl", "Lco/bird/android/model/wire/WireBird;", "bird", "isHourly", "ec", "u5", "zc", "", "length", "d2", "show", "w9", "copy", "Qa", "Vg", "", "tolerance", "d6", "n1", "a1", "Lfm5;", "resultHandler", "l5", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "b", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scannerView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "flashButton", DateTokenConverter.CONVERTER_KEY, "viewFinder", "Landroidx/appcompat/widget/AppCompatEditText;", "e", "Landroidx/appcompat/widget/AppCompatEditText;", "codeEditor", "f", "codeButton", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "peripheralKeyboardScanQrTextView", "h", "infoText", "scooter", "Lco/bird/android/widget/BirdActionView;", "j", "Lco/bird/android/widget/BirdActionView;", "status", "Landroid/graphics/drawable/Drawable;", "k", "Landroid/graphics/drawable/Drawable;", "codeScooterDrawable", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "l", "Lio/reactivex/subjects/d;", "birdCodeEnteredSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/graphics/drawable/Drawable;)V", "scanner-delegate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rQ3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48042rQ3 extends AbstractC30071xE implements InterfaceC42324hm5 {

    /* renamed from: b */
    public final ZXingScannerView f107044b;

    /* renamed from: c */
    public final ImageView f107045c;

    /* renamed from: d */
    public final ImageView f107046d;

    /* renamed from: e */
    public final AppCompatEditText f107047e;

    /* renamed from: f */
    public final ImageView f107048f;

    /* renamed from: g */
    public final TextView f107049g;

    /* renamed from: h */
    public final TextView f107050h;

    /* renamed from: i */
    public final ImageView f107051i;

    /* renamed from: j */
    public final BirdActionView f107052j;

    /* renamed from: k */
    public final Drawable f107053k;

    /* renamed from: l */
    public final C24558d<C9400XK> f107054l;

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28432d2 = {"rQ3$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "regex", "scanner-delegate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rQ3$a */
    /* loaded from: classes3.dex */
    public static final class C27913a extends C39530d36 {

        /* renamed from: b */
        public final Regex f107055b = new Regex(InstructionFileId.DOT);

        public C27913a() {
        }

        @Override // p000.C39530d36, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            boolean isBlank;
            char last;
            CharSequence trim;
            Intrinsics.checkNotNullParameter(s, "s");
            super.onTextChanged(s, i, i2, i3);
            isBlank = StringsKt__StringsJVMKt.isBlank(s);
            if (!isBlank) {
                last = StringsKt___StringsKt.last(s);
                if (!this.f107055b.matches(String.valueOf(last))) {
                    C24558d c24558d = C48042rQ3.this.f107054l;
                    trim = StringsKt__StringsKt.trim((CharSequence) s.toString());
                    c24558d.onNext(new C9400XK(trim.toString()));
                }
            }
        }
    }

    public /* synthetic */ C48042rQ3(BaseActivity baseActivity, ZXingScannerView zXingScannerView, ImageView imageView, ImageView imageView2, AppCompatEditText appCompatEditText, ImageView imageView3, TextView textView, TextView textView2, ImageView imageView4, BirdActionView birdActionView, Drawable drawable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, zXingScannerView, imageView, imageView2, appCompatEditText, imageView3, (i & 64) != 0 ? null : textView, (i & 128) != 0 ? null : textView2, (i & 256) != 0 ? null : imageView4, (i & 512) != 0 ? null : birdActionView, drawable);
    }

    /* renamed from: Ql */
    public static final void m15977Ql(InterfaceC41138fm5 handler, C38511bN4 c38511bN4) {
        Intrinsics.checkNotNullParameter(handler, "$handler");
        String m64617f = c38511bN4.m64617f();
        Intrinsics.checkNotNullExpressionValue(m64617f, "result.text");
        handler.mo40823b(new C40545em5(m64617f, c38511bN4));
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Qa */
    public boolean mo7502Qa(String str, boolean z) {
        return false;
    }

    /* renamed from: Rl */
    public void m15976Rl() {
        IBinder windowToken = this.f107047e.getWindowToken();
        if (windowToken != null) {
            Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).toggleSoftInputFromWindow(windowToken, 2, 0);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Vg */
    public Observable<Unit> mo7499Vg() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: W3 */
    public Observable<C9400XK> mo7497W3() {
        Observable<C9400XK> hide = this.f107054l.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdCodeEnteredSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Yi */
    public void mo7496Yi() {
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: a1 */
    public void mo7495a1() {
        this.f107044b.stopCamera();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: c2 */
    public void mo7493c2() {
        this.f107047e.requestFocus();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d2 */
    public void mo7492d2(int i) {
        this.f107047e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d6 */
    public void mo7491d6(float f) {
        this.f107044b.setAspectTolerance(f);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: ec */
    public void mo7488ec(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        BirdActionView birdActionView = this.f107052j;
        if (birdActionView != null) {
            C49520tu6.m11233r(birdActionView);
        }
        BirdActionView birdActionView2 = this.f107052j;
        if (birdActionView2 != null) {
            BirdActionView.setBird$default(birdActionView2, null, bird, true, z, 1, null);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: gk */
    public void mo7486gk() {
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: i */
    public boolean mo7485i() {
        return true;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: jl */
    public void mo7482jl() {
        this.f107047e.setText("");
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: l5 */
    public void mo7481l5(final InterfaceC41138fm5 interfaceC41138fm5) {
        ZXingScannerView.ResultHandler resultHandler;
        ZXingScannerView zXingScannerView = this.f107044b;
        if (interfaceC41138fm5 != null) {
            resultHandler = new ZXingScannerView.ResultHandler() { // from class: qQ3
                @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
                public final void handleResult(C38511bN4 c38511bN4) {
                    C48042rQ3.m15977Ql(InterfaceC41138fm5.this, c38511bN4);
                }
            };
        } else {
            resultHandler = null;
        }
        zXingScannerView.setResultHandler(resultHandler);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n0 */
    public void mo7480n0() {
        this.f107047e.clearFocus();
        IBinder windowToken = this.f107047e.getWindowToken();
        if (windowToken != null) {
            Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n1 */
    public void mo7479n1() {
        this.f107044b.startCamera();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sa */
    public Observable<Unit> mo7478sa() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sk */
    public EnumC38136ak5 mo7477sk() {
        return EnumC38136ak5.CODE;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: tc */
    public void mo7476tc(String str) {
        C49520tu6.m11239l(this.f107044b);
        C49520tu6.m11239l(this.f107045c);
        C49520tu6.m11239l(this.f107048f);
        ViewGroup.LayoutParams layoutParams = this.f107047e.getLayoutParams();
        layoutParams.height = 1;
        layoutParams.width = 1;
        this.f107047e.setLayoutParams(layoutParams);
        C49520tu6.m11233r(this.f107047e);
        this.f107047e.requestFocus();
        this.f107046d.setImageDrawable(NA0.m94299e(getActivity(), C32364Df4.birdScanScrimColor));
        ImageView imageView = this.f107051i;
        if (imageView != null) {
            imageView.setImageDrawable(this.f107053k);
        }
        m15976Rl();
        this.f107047e.setHint(getActivity().getString(C45871nl4.peripheral_scanner_code_editor_hint));
        TextView textView = this.f107049g;
        if (textView != null) {
            C49520tu6.m11233r(textView);
        }
        if (str != null) {
            this.f107047e.setText(str);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: u5 */
    public void mo7475u5() {
        BirdActionView birdActionView = this.f107052j;
        if (birdActionView != null) {
            C49520tu6.m11239l(birdActionView);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: w9 */
    public void mo7474w9(boolean z) {
        TextView textView = this.f107050h;
        if (textView != null) {
            C49520tu6.show$default(textView, z, 0, 2, null);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: z1 */
    public Observable<Unit> mo7472z1() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: zc */
    public Observable<String> mo7471zc() {
        return C44626lf5.textChanges$default(this.f107047e, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48042rQ3(BaseActivity activity, ZXingScannerView scannerView, ImageView flashButton, ImageView viewFinder, AppCompatEditText codeEditor, ImageView codeButton, TextView textView, TextView textView2, ImageView imageView, BirdActionView birdActionView, Drawable drawable) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scannerView, "scannerView");
        Intrinsics.checkNotNullParameter(flashButton, "flashButton");
        Intrinsics.checkNotNullParameter(viewFinder, "viewFinder");
        Intrinsics.checkNotNullParameter(codeEditor, "codeEditor");
        Intrinsics.checkNotNullParameter(codeButton, "codeButton");
        this.f107044b = scannerView;
        this.f107045c = flashButton;
        this.f107046d = viewFinder;
        this.f107047e = codeEditor;
        this.f107048f = codeButton;
        this.f107049g = textView;
        this.f107050h = textView2;
        this.f107051i = imageView;
        this.f107052j = birdActionView;
        this.f107053k = drawable;
        C24558d<C9400XK> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<BirdCodeEnteredEvent>()");
        this.f107054l = m31902e;
        codeEditor.setInputType(135169);
        ActionBar supportActionBar = activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(activity.getString(C45871nl4.peripheral_scanner_activity_title));
        }
        hideKeyboard();
        codeEditor.addTextChangedListener(new C27913a());
    }
}
