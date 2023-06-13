package p000;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
import p000.H31;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0016\u0010\u001d\u001a\u00020\u0003*\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0015H\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00070\u00070)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00062"}, m28432d2 = {"Lvy;", "LxE;", "Luy;", "", "i", "da", "Lio/reactivex/Observable;", "", "z3", "z1", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "resultHandler", "il", "", "enabled", "a7", "M1", "", "aspectRatio", "h2", "C6", "", "title", "hint", "Lio/reactivex/F;", "LH31$b;", "M", "Landroid/widget/ImageView;", "res", "Pl", "LW2;", "b", "LW2;", "binding", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "c", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scannerView", DateTokenConverter.CONVERTER_KEY, "Z", "flashOn", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/a;", "codeEnteredSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LW2;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vy */
/* loaded from: classes3.dex */
public final class C29707vy extends AbstractC30071xE implements InterfaceC29346uy {

    /* renamed from: b */
    public final C8919W2 f115002b;

    /* renamed from: c */
    public final ZXingScannerView f115003c;

    /* renamed from: d */
    public boolean f115004d;

    /* renamed from: e */
    public final C24552a<String> f115005e;

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28432d2 = {"vy$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "regex", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vy$a */
    /* loaded from: classes3.dex */
    public static final class C29708a extends C39530d36 {

        /* renamed from: b */
        public final Regex f115006b = new Regex(InstructionFileId.DOT);

        public C29708a() {
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
                if (!this.f115006b.matches(String.valueOf(last))) {
                    C24552a c24552a = C29707vy.this.f115005e;
                    trim = StringsKt__StringsKt.trim((CharSequence) s.toString());
                    c24552a.onNext(trim.toString());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29707vy(BaseActivity activity, C8919W2 binding, ZXingScannerView scannerView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(scannerView, "scannerView");
        this.f115002b = binding;
        this.f115003c = scannerView;
        C24552a<String> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<String>()");
        this.f115005e = m31922e;
        binding.f40300k.addView(scannerView, 0, new RelativeLayout.LayoutParams(-1, -1));
        ImageView imageView = binding.f40304o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.viewFinder");
        m7699Pl(imageView, C47600qg4.qr_view_finder);
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: C6 */
    public void mo7702C6() {
        this.f115002b.f40296g.requestFocus();
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: M */
    public AbstractC23442F<H31.AbstractC3016b> mo7701M(int i, int i2) {
        return H31.C3014a.dialogWithInput$default(this, getString(i, new Object[0]), null, getString(i2, new Object[0]), "", null, getString(C45871nl4.dialog_okay, new Object[0]), getString(C45871nl4.alert_leave_page_cancel, new Object[0]), false, false, true, 18, null);
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: M1 */
    public void mo7700M1() {
        this.f115003c.stopCamera();
    }

    /* renamed from: Pl */
    public final void m7699Pl(ImageView imageView, int i) {
        imageView.setImageDrawable(C29611vi.m8248b(imageView.getContext(), i));
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: a7 */
    public void mo7698a7(ZXingScannerView.ResultHandler resultHandler, boolean z) {
        this.f115003c.setResultHandler(resultHandler);
        if (z) {
            this.f115003c.startCamera();
        }
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: da */
    public void mo7697da() {
        OptionalImeEditText optionalImeEditText = this.f115002b.f40296g;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText, "binding.peripheralEditText");
        C49520tu6.m11233r(optionalImeEditText);
        TextView textView = this.f115002b.f40297h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.peripheralKeyboardScanQrTextView");
        C49520tu6.m11233r(textView);
        ImageView imageView = this.f115002b.f40299j;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.qrImage");
        C49520tu6.m11233r(imageView);
        C49520tu6.m11239l(this.f115003c);
        ImageView imageView2 = this.f115002b.f40304o;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.viewFinder");
        C49520tu6.m11239l(imageView2);
        ImageView imageView3 = this.f115002b.f40294e;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.flashButton");
        C49520tu6.m11239l(imageView3);
        this.f115002b.f40296g.setInputType(135169);
        this.f115002b.f40296g.addTextChangedListener(new C29708a());
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: h2 */
    public void mo7696h2(float f) {
        this.f115003c.setAspectTolerance(f);
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: i */
    public void mo7695i() {
        boolean z;
        try {
            if (!this.f115004d) {
                z = true;
            } else {
                z = false;
            }
            this.f115004d = z;
            this.f115003c.setFlash(z);
        } catch (Exception e) {
            this.f115004d = true ^ this.f115004d;
            C41318g46.m40159e(e);
        }
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: il */
    public void mo7694il(ZXingScannerView.ResultHandler resultHandler) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.f115003c.setResultHandler(resultHandler);
        this.f115003c.startCamera();
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: z1 */
    public Observable<Unit> mo7693z1() {
        ImageView imageView = this.f115002b.f40294e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.flashButton");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC29346uy
    /* renamed from: z3 */
    public Observable<String> mo7692z3() {
        Observable<String> hide = this.f115005e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "codeEnteredSubject.hide()");
        return hide;
    }
}
