package p000;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.mlkitscanner.MLKitScanView;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.constant.ScanStatus;
import co.bird.android.widget.QrCodeZXingScannerView;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
import p000.H31;
import p000.InterfaceC41921h56;
@Metadata(m28433d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 x2\u00020\u0001:\u0001AB!\u0012\u0006\u00109\u001a\u000204\u0012\u0006\u0010?\u001a\u00020:\u0012\b\u0010E\u001a\u0004\u0018\u00010@¢\u0006\u0004\bv\u0010wJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\u0002J\u001c\u0010%\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012J\u0006\u0010&\u001a\u00020\u0002J\u0006\u0010'\u001a\u00020\u0002J\u0006\u0010(\u001a\u00020\u0002J$\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-J\u000e\u00102\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u00103\u001a\u00020\u0002R\u001a\u00109\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010E\u001a\u0004\u0018\u00010@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010K\u001a\u00020F8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u0010Q\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010V\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010\u00120\u00120R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010X\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010\u00120\u00120R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\"\u0010]\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010f\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010c0c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010NR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR*\u0010u\u001a\u00020\f2\u0006\u0010L\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010t¨\u0006y"}, m28432d2 = {"LRk5;", "LXC;", "", "jm", "", "newElevation", "cm", "degrees", "em", "", "show", "wm", "", "hiddenState", "showProgress", "enabled", "gm", "Lio/reactivex/Observable;", "", "Am", "v0", "G", "M9", "B1", "hm", "Lco/bird/android/model/constant/PartKind;", "kind", "rm", "sm", "vm", "zm", "ym", "enable", "im", "p3", "instructions", "instructions2", "om", "onResume", "onPause", "dismiss", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanStatus;", "status", "LTq4;", "reactiveConfig", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "nm", "tm", "xm", "Landroidx/appcompat/app/AppCompatActivity;", "b", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lf00;", "c", "Lf00;", "lm", "()Lf00;", "binding", "Landroid/content/DialogInterface;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/DialogInterface;", "getDialog", "()Landroid/content/DialogInterface;", "dialog", "Landroid/view/View;", "e", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "value", "f", "Z", "pm", "(Z)V", "mlKitEnabled", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "scanSubject", "h", "throttledScanSubject", "Lkotlin/Function1;", "LbN4;", "i", "Lkotlin/jvm/functions/Function1;", "resultHandler", "LPx;", "j", "LPx;", "barcodeAnalyzer", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "k", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheet", "l", "enablePeripheralScanner", "Landroid/animation/AnimatorSet;", "m", "Landroid/animation/AnimatorSet;", "elevationAnimator", "n", "rotationAnimator", "o", "I", "getPeekHeight", "()I", "qm", "(I)V", "peekHeight", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lf00;Landroid/content/DialogInterface;)V", "p", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanRenderer.kt\nco/bird/android/vehiclescanner/common/ScanRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,432:1\n1#2:433\n1855#3,2:434\n*S KotlinDebug\n*F\n+ 1 ScanRenderer.kt\nco/bird/android/vehiclescanner/common/ScanRenderer\n*L\n347#1:434,2\n*E\n"})
/* renamed from: Rk5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C35686Rk5 extends AbstractC9344XC {

    /* renamed from: p */
    public static final C7253d f32500p = new C7253d(null);

    /* renamed from: b */
    public final AppCompatActivity f32501b;

    /* renamed from: c */
    public final C40679f00 f32502c;

    /* renamed from: d */
    public final DialogInterface f32503d;

    /* renamed from: e */
    public final View f32504e;

    /* renamed from: f */
    public boolean f32505f;

    /* renamed from: g */
    public final C24558d<String> f32506g;

    /* renamed from: h */
    public final C24558d<String> f32507h;

    /* renamed from: i */
    public final Function1<C38511bN4, Unit> f32508i;

    /* renamed from: j */
    public final C6587Px f32509j;

    /* renamed from: k */
    public final BottomSheetBehavior<LinearLayout> f32510k;

    /* renamed from: l */
    public boolean f32511l;

    /* renamed from: m */
    public AnimatorSet f32512m;

    /* renamed from: n */
    public AnimatorSet f32513n;

    /* renamed from: o */
    public int f32514o;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Rk5$a */
    /* loaded from: classes4.dex */
    public static final class C7249a extends Lambda implements Function1<HJ6, Unit> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", Entry.TYPE_TEXT, "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Rk5$a$a */
        /* loaded from: classes4.dex */
        public static final class C7250a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Regex f32516g;

            /* renamed from: h */
            public final /* synthetic */ C35686Rk5 f32517h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7250a(Regex regex, C35686Rk5 c35686Rk5) {
                super(4);
                this.f32516g = regex;
                this.f32517h = c35686Rk5;
            }

            /* renamed from: a */
            public final void m86356a(CharSequence charSequence, int i, int i2, int i3) {
                char last;
                CharSequence trim;
                boolean isBlank;
                boolean z = false;
                if (charSequence != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
                    if (!isBlank) {
                        z = true;
                    }
                }
                if (z) {
                    last = StringsKt___StringsKt.last(charSequence);
                    if (!this.f32516g.matches(String.valueOf(last))) {
                        C24558d c24558d = this.f32517h.f32506g;
                        trim = StringsKt__StringsKt.trim((CharSequence) charSequence.toString());
                        c24558d.onNext(trim.toString());
                        this.f32517h.m86374lm().f79262e.f47685e.setText((CharSequence) null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                m86356a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                return Unit.INSTANCE;
            }
        }

        public C7249a() {
            super(1);
        }

        /* renamed from: a */
        public final void m86357a(HJ6 textChangedListener) {
            Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
            textChangedListener.m104030b(new C7250a(new Regex(InstructionFileId.DOT), C35686Rk5.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
            m86357a(hj6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/TextView;", "<anonymous parameter 0>", "", "actionId", "Landroid/view/KeyEvent;", "event", "", C17296a.f69688o, "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Rk5$b */
    /* loaded from: classes4.dex */
    public static final class C7251b extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
        public C7251b() {
            super(3);
        }

        /* renamed from: a */
        public final Boolean m86355a(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            if (i == 6) {
                C35686Rk5.this.f32506g.onNext(String.valueOf(C35686Rk5.this.m86374lm().f79262e.f47685e.getText()));
                C35686Rk5.this.m86374lm().f79262e.f47685e.setText((CharSequence) null);
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
            return m86355a(textView, num.intValue(), keyEvent);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m28432d2 = {"Rk5$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "", "slideOffset", "onSlide", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Rk5$c */
    /* loaded from: classes4.dex */
    public static final class C7252c extends BottomSheetBehavior.AbstractC17702f {
        public C7252c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View bottomSheet, float f) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View bottomSheet, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i == 3) {
                C35686Rk5.this.m86381em(180.0f);
                C35686Rk5.this.m86383cm(C49347td3.m12002a(4, C35686Rk5.this.getActivity()));
                return;
            }
            C35686Rk5.this.m86381em(0.0f);
            C35686Rk5.this.m86383cm(0.0f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"LRk5$d;", "", "", "CORNER_RADIUS_DP", "I", "", "MLKIT_SCANNER_THROTTLE_TIME_SPAN_MS", "J", "PULL_ARROW_ELEVATION_DP", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Rk5$d */
    /* loaded from: classes4.dex */
    public static final class C7253d {
        public /* synthetic */ C7253d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7253d() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Rk5$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C7254e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.GERMAN_PLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "LBx;", "barcodes", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScanRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanRenderer.kt\nco/bird/android/vehiclescanner/common/ScanRenderer$barcodeAnalyzer$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
    /* renamed from: Rk5$f */
    /* loaded from: classes4.dex */
    public static final class C7255f extends Lambda implements Function1<List<? extends C0774Bx>, Unit> {
        public C7255f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C0774Bx> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends C0774Bx> barcodes) {
            Object firstOrNull;
            String m113296e;
            Intrinsics.checkNotNullParameter(barcodes, "barcodes");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) barcodes);
            C0774Bx c0774Bx = (C0774Bx) firstOrNull;
            if (c0774Bx == null || (m113296e = c0774Bx.m113296e()) == null) {
                return;
            }
            C35686Rk5.this.f32507h.onNext(m113296e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"Rk5$g", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Rk5$g */
    /* loaded from: classes4.dex */
    public static final class C7256g extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ boolean f32521a;

        /* renamed from: b */
        public final /* synthetic */ C35686Rk5 f32522b;

        public C7256g(boolean z, C35686Rk5 c35686Rk5) {
            this.f32521a = z;
            this.f32522b = c35686Rk5;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i;
            int i2;
            int i3;
            if (outline != null) {
                if (view != null) {
                    i = view.getWidth();
                } else {
                    i = 0;
                }
                if (view != null) {
                    i3 = view.getHeight();
                } else {
                    if (this.f32521a) {
                        i2 = (int) C49347td3.m12002a(10, this.f32522b.getActivity());
                    } else {
                        i2 = 0;
                    }
                    i3 = i2 + 0;
                }
                outline.setRoundRect(0, 0, i, i3, C49347td3.m12002a(10, this.f32522b.getActivity()));
            }
            if (view != null) {
                view.setClipToOutline(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LbN4;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LbN4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScanRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanRenderer.kt\nco/bird/android/vehiclescanner/common/ScanRenderer$resultHandler$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
    /* renamed from: Rk5$h */
    /* loaded from: classes4.dex */
    public static final class C7257h extends Lambda implements Function1<C38511bN4, Unit> {
        public C7257h() {
            super(1);
        }

        /* renamed from: a */
        public final void m86354a(C38511bN4 c38511bN4) {
            String m64617f;
            if (c38511bN4 == null || (m64617f = c38511bN4.m64617f()) == null) {
                return;
            }
            C35686Rk5.this.f32507h.onNext(m64617f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C38511bN4 c38511bN4) {
            m86354a(c38511bN4);
            return Unit.INSTANCE;
        }
    }

    public C35686Rk5(AppCompatActivity activity, C40679f00 binding, DialogInterface dialogInterface) {
        Dialog dialog;
        List<EnumC7009Qx> listOf;
        Window window;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f32501b = activity;
        this.f32502c = binding;
        this.f32503d = dialogInterface;
        if (dialogInterface instanceof Dialog) {
            dialog = (Dialog) dialogInterface;
        } else {
            dialog = null;
        }
        View m41779c = (dialog == null || (window = dialog.getWindow()) == null || (m41779c = window.getDecorView()) == null) ? C40788fB0.m41779c(getActivity(), 16908290) : m41779c;
        Intrinsics.checkNotNullExpressionValue(m41779c, "(dialog as? Dialog)?.win…ind(android.R.id.content)");
        this.f32504e = m41779c;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f32506g = m31902e;
        C24558d<String> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<String>()");
        this.f32507h = m31902e2;
        final C7257h c7257h = new C7257h();
        this.f32508i = c7257h;
        C6587Px c6587Px = new C6587Px(1, 2, 256, 4, 128, 16);
        c6587Px.m89281K(new C7255f());
        this.f32509j = c6587Px;
        BottomSheetBehavior<LinearLayout> m50133G = BottomSheetBehavior.m50133G(binding.f79259b);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.bottomSheet)");
        this.f32510k = m50133G;
        binding.f79262e.f47692l.setClipToOutline(true);
        binding.f79262e.f47692l.setResultHandler(new ZXingScannerView.ResultHandler() { // from class: Ik5
            @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
            public final void handleResult(C38511bN4 c38511bN4) {
                C35686Rk5.m86387Yl(Function1.this, c38511bN4);
            }
        });
        QrCodeZXingScannerView qrCodeZXingScannerView = binding.f79262e.f47692l;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EnumC7009Qx[]{EnumC7009Qx.CODE_128, EnumC7009Qx.CODE_39, EnumC7009Qx.QR_CODE, EnumC7009Qx.CODE_93, EnumC7009Qx.ITF, EnumC7009Qx.DATA_MATRIX});
        qrCodeZXingScannerView.setFormats(listOf);
        binding.f79262e.f47690j.setClipToOutline(true);
        binding.f79262e.f47690j.setAnalyzer(c6587Px);
        OptionalImeEditText optionalImeEditText = binding.f79262e.f47685e;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText, "binding.constraintLayout.codeEditor");
        C34585Ms2.m94647x(optionalImeEditText, new C7249a());
        OptionalImeEditText optionalImeEditText2 = binding.f79262e.f47685e;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText2, "binding.constraintLayout.codeEditor");
        C34585Ms2.m94658m(optionalImeEditText2, new C7251b());
        BottomSheetBehavior.m50133G(binding.f79259b).m50073u(new C7252c());
        m86376jm();
    }

    /* renamed from: Yl */
    public static final void m86387Yl(Function1 tmp0, C38511bN4 c38511bN4) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(c38511bN4);
    }

    /* renamed from: Zl */
    public static final void m86386Zl(Function1 tmp0, C38511bN4 c38511bN4) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(c38511bN4);
    }

    /* renamed from: am */
    public static final void m86385am(C35686Rk5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m86368qm(this$0.f32514o);
    }

    /* renamed from: bm */
    public static final void m86384bm(C35686Rk5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m86368qm(this$0.f32514o);
    }

    /* renamed from: dm */
    public static final void m86382dm(C35686Rk5 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        FrameLayout frameLayout = this$0.f32502c.f79265h;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        C38790bq6.m62545E0(frameLayout, ((Float) animatedValue).floatValue());
        this$0.f32502c.f79265h.invalidate();
    }

    /* renamed from: fm */
    public static final void m86380fm(C35686Rk5 this$0, float f, ValueAnimator anim) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        ImageView imageView = this$0.f32502c.f79264g;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        imageView.setAlpha(((Float) animatedValue).floatValue());
        this$0.f32502c.f79264g.invalidate();
        Object animatedValue2 = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        if (((Float) animatedValue2).floatValue() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this$0.f32502c.f79264g.setRotation(f);
        }
    }

    /* renamed from: km */
    public static final boolean m86375km(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: mm */
    public static final void m86373mm(Function1 tmp0, C38511bN4 c38511bN4) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(c38511bN4);
    }

    public static /* synthetic */ void setInstructions$default(C35686Rk5 c35686Rk5, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInstructions");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        c35686Rk5.m86371om(str, str2);
    }

    /* renamed from: um */
    public static final void m86364um(C35686Rk5 this$0, boolean z) {
        Set<ViewGroup> of;
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout root = this$0.f32502c.f79262e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.constraintLayout.root");
        LinearLayout linearLayout = this$0.f32502c.f79259b;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.bottomSheet");
        of = SetsKt__SetsKt.setOf((Object[]) new ViewGroup[]{root, linearLayout});
        for (ViewGroup viewGroup : of) {
            if (z) {
                i = this$0.f32502c.f79261d.getMeasuredHeight();
            } else {
                i = 0;
            }
            viewGroup.setPaddingRelative(0, 0, 0, i);
        }
        this$0.m86368qm(this$0.f32514o);
    }

    /* renamed from: Am */
    public final Observable<String> m86400Am() {
        Observable<String> merge = Observable.merge(this.f32506g.hide(), this.f32507h.hide().throttleFirst(500L, TimeUnit.MILLISECONDS));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n    scanSubject.h…imeUnit.MILLISECONDS)\n  )");
        return merge;
    }

    /* renamed from: B1 */
    public final Observable<Unit> m86399B1() {
        Button button = this.f32502c.f79260c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.button");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: G */
    public final Observable<Unit> m86398G() {
        ImageButton imageButton = this.f32502c.f79262e.f47682b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.bluetooth");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    /* renamed from: M9 */
    public final Observable<Unit> m86397M9() {
        ImageButton imageButton = this.f32502c.f79262e.f47686f;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.flashlight");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    /* renamed from: cm */
    public final void m86383cm(float f) {
        boolean z;
        if (this.f32502c.f79265h.getElevation() == f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        AnimatorSet animatorSet = this.f32512m;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32502c.f79265h.getElevation(), f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Pk5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C35686Rk5.m86382dm(C35686Rk5.this, valueAnimator);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat);
        this.f32512m = animatorSet2;
        animatorSet2.start();
    }

    public final void dismiss() {
        DialogInterface dialogInterface = this.f32503d;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: em */
    public final void m86381em(final float f) {
        boolean z;
        if (this.f32502c.f79264g.getRotation() == f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        AnimatorSet animatorSet = this.f32513n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: Jk5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C35686Rk5.m86380fm(C35686Rk5.this, f, valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32502c.f79264g.getAlpha(), 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f32502c.f79264g.getAlpha(), 1.0f);
        ofFloat2.setDuration(150L);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat, ofFloat2);
        this.f32513n = animatorSet2;
        animatorSet2.start();
    }

    @Override // p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public AppCompatActivity getActivity() {
        return this.f32501b;
    }

    @Override // p000.AbstractC9344XC
    public View getContentView() {
        return this.f32504e;
    }

    /* renamed from: gm */
    public void mo86379gm(boolean z) {
        int i;
        if (z) {
            i = C36144Tj4.constraint_bottom_sheet_bulk_scan_code;
        } else {
            i = C36144Tj4.constraint_bottom_sheet_scan_code;
        }
        C11515b c11515b = new C11515b();
        c11515b.m67813o(this.f32502c.getRoot().getContext(), i);
        c11515b.m67819i(this.f32502c.f79262e.getRoot());
        this.f32502c.f79262e.f47692l.setOutlineProvider(new C7256g(z, this));
        LinearLayout linearLayout = this.f32502c.f79259b;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.bottomSheet");
        C49520tu6.show$default(linearLayout, z, 0, 2, null);
        m86369pm(this.f32505f);
    }

    /* renamed from: hm */
    public final void m86378hm(boolean z) {
        m86369pm(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (getActivity().getResources().getConfiguration().keyboard != 1) goto L5;
     */
    /* renamed from: im */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m86377im(boolean z) {
        boolean z2;
        int i;
        float f;
        int i2;
        this.f32511l = z;
        if (z) {
            z2 = true;
        }
        z2 = false;
        m86361wm(!z2);
        ImageButton imageButton = this.f32502c.f79262e.f47684d;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.code");
        C49520tu6.show$default(imageButton, !z2, 0, 2, null);
        ImageButton imageButton2 = this.f32502c.f79262e.f47686f;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "binding.constraintLayout.flashlight");
        C49520tu6.show$default(imageButton2, !z2, 0, 2, null);
        ImageView imageView = this.f32502c.f79262e.f47691k;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.constraintLayout.peripheralIcon");
        C49520tu6.show$default(imageView, z2, 0, 2, null);
        CoordinatorLayout root = this.f32502c.getRoot();
        AppCompatActivity activity = getActivity();
        if (z2) {
            i = C32364Df4.birdNewRoad;
        } else {
            i = C32364Df4.birdWhite;
        }
        root.setBackgroundColor(NA0.m94301c(activity, i));
        OptionalImeEditText optionalImeEditText = this.f32502c.f79262e.f47685e;
        if (z2) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        optionalImeEditText.setAlpha(f);
        OptionalImeEditText optionalImeEditText2 = this.f32502c.f79262e.f47685e;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText2, "binding.constraintLayout.codeEditor");
        C49520tu6.show$default(optionalImeEditText2, z2, 0, 2, null);
        this.f32502c.f79262e.f47685e.setTextEditor(!z2);
        OptionalImeEditText optionalImeEditText3 = this.f32502c.f79262e.f47685e;
        if (z2) {
            i2 = 135169;
        } else {
            i2 = 4097;
        }
        optionalImeEditText3.setInputType(i2);
        if (z) {
            this.f32502c.f79262e.f47685e.requestFocus();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: jm */
    public final void m86376jm() {
        this.f32502c.f79265h.setOnTouchListener(new View.OnTouchListener() { // from class: Qk5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m86375km;
                m86375km = C35686Rk5.m86375km(view, motionEvent);
                return m86375km;
            }
        });
    }

    /* renamed from: lm */
    public final C40679f00 m86374lm() {
        return this.f32502c;
    }

    /* renamed from: nm */
    public final AbstractC23442F<DialogResponse> m86372nm(ScanMode mode, ScanStatus status, C36207Tq4 reactiveConfig) {
        AbstractC23442F<DialogResponse> dialog$default;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        AbstractC5751Ny m91146a = C6212Oy.m91146a(mode, status, reactiveConfig);
        if (m91146a == null || (dialog$default = H31.C3014a.dialog$default(this, m91146a, false, false, 4, null)) == null) {
            AbstractC23442F<DialogResponse> m33158H = AbstractC23442F.m33158H(DialogResponse.DISMISS);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(DialogResponse.DISMISS)");
            return m33158H;
        }
        return dialog$default;
    }

    /* renamed from: om */
    public final void m86371om(String str, String str2) {
        this.f32502c.f79262e.f47688h.setText(str);
        TextView textView = this.f32502c.f79262e.f47689i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.constraintLayout.instructions2");
        boolean z = false;
        C49520tu6.setTextAndVisibility$default(textView, str2, 0, 2, null);
        ImageView imageView = this.f32502c.f79262e.f47687g;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.constraintLayout.icon");
        if (str2 == null) {
            z = true;
        }
        C49520tu6.m11232s(imageView, z, 4);
    }

    public final void onPause() {
        if (this.f32505f) {
            this.f32502c.f79262e.f47690j.m56007k();
        } else {
            this.f32502c.f79262e.f47692l.stopCamera();
        }
    }

    public final void onResume() {
        if (this.f32505f) {
            this.f32502c.f79262e.f47690j.m56009i();
        } else {
            this.f32502c.f79262e.f47692l.setAspectTolerance(0.2f);
            this.f32502c.f79262e.f47692l.startCamera();
            m86370p3();
        }
        m86377im(this.f32511l);
    }

    /* renamed from: p3 */
    public final void m86370p3() {
        if (this.f32505f) {
            this.f32502c.f79262e.f47690j.m56009i();
            return;
        }
        QrCodeZXingScannerView qrCodeZXingScannerView = this.f32502c.f79262e.f47692l;
        final Function1<C38511bN4, Unit> function1 = this.f32508i;
        qrCodeZXingScannerView.resumeCameraPreview(new ZXingScannerView.ResultHandler() { // from class: Mk5
            @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
            public final void handleResult(C38511bN4 c38511bN4) {
                C35686Rk5.m86373mm(Function1.this, c38511bN4);
            }
        });
        this.f32502c.f79262e.f47692l.setAutoFocus(true);
    }

    /* renamed from: pm */
    public final void m86369pm(boolean z) {
        this.f32505f = z;
        QrCodeZXingScannerView qrCodeZXingScannerView = this.f32502c.f79262e.f47692l;
        Intrinsics.checkNotNullExpressionValue(qrCodeZXingScannerView, "binding.constraintLayout.scanner");
        C49520tu6.m11232s(qrCodeZXingScannerView, !z, 4);
        MLKitScanView mLKitScanView = this.f32502c.f79262e.f47690j;
        Intrinsics.checkNotNullExpressionValue(mLKitScanView, "binding.constraintLayout.mlKitScanner");
        C49520tu6.m11232s(mLKitScanView, z, 8);
        if (this.f32505f) {
            this.f32502c.f79262e.f47692l.stopCamera();
            this.f32502c.f79262e.f47690j.m56009i();
            return;
        }
        this.f32502c.f79262e.f47690j.m56007k();
        QrCodeZXingScannerView qrCodeZXingScannerView2 = this.f32502c.f79262e.f47692l;
        final Function1<C38511bN4, Unit> function1 = this.f32508i;
        qrCodeZXingScannerView2.resumeCameraPreview(new ZXingScannerView.ResultHandler() { // from class: Nk5
            @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
            public final void handleResult(C38511bN4 c38511bN4) {
                C35686Rk5.m86386Zl(Function1.this, c38511bN4);
            }
        });
    }

    /* renamed from: qm */
    public final void m86368qm(int i) {
        int measuredHeight;
        int i2;
        this.f32514o = i;
        int i3 = 0;
        if (i == 0) {
            measuredHeight = 0;
        } else if (this.f32502c.f79265h.getMeasuredHeight() > 0) {
            measuredHeight = this.f32502c.f79265h.getMeasuredHeight();
        } else {
            this.f32502c.f79265h.post(new Runnable() { // from class: Kk5
                @Override // java.lang.Runnable
                public final void run() {
                    C35686Rk5.m86385am(C35686Rk5.this);
                }
            });
            return;
        }
        int i4 = i + measuredHeight;
        FrameLayout frameLayout = this.f32502c.f79261d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.buttonContainer");
        if (C49520tu6.m11230u(frameLayout) && this.f32502c.f79261d.getMeasuredHeight() > 0) {
            i2 = this.f32502c.f79261d.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = this.f32502c.f79261d;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.buttonContainer");
            if (!C49520tu6.m11230u(frameLayout2)) {
                i2 = 0;
            } else {
                this.f32502c.f79261d.post(new Runnable() { // from class: Lk5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C35686Rk5.m86384bm(C35686Rk5.this);
                    }
                });
                return;
            }
        }
        this.f32510k.m50092k0(i2 + i4);
        ViewGroup.LayoutParams layoutParams = this.f32502c.f79262e.getRoot().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams;
        if (this.f32514o > 0) {
            i3 = (int) C49347td3.m12002a(10, getActivity());
        }
        ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin = i4 - i3;
        this.f32502c.f79262e.getRoot().setLayoutParams(c11529e);
    }

    /* renamed from: rm */
    public final void m86367rm(PartKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (C7254e.$EnumSwitchMapping$0[kind.ordinal()] == 1) {
            this.f32502c.f79262e.f47685e.setInputType(1);
        }
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        LinearProgressIndicator linearProgressIndicator = this.f32502c.f79263f;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
        C49520tu6.m11232s(linearProgressIndicator, z, i);
    }

    /* renamed from: sm */
    public final void m86366sm(boolean z) {
        ImageButton imageButton = this.f32502c.f79262e.f47682b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.bluetooth");
        C49520tu6.show$default(imageButton, z, 0, 2, null);
    }

    /* renamed from: tm */
    public final void m86365tm(final boolean z) {
        FrameLayout frameLayout = this.f32502c.f79261d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.buttonContainer");
        C49520tu6.show$default(frameLayout, z, 0, 2, null);
        this.f32502c.f79261d.post(new Runnable() { // from class: Ok5
            @Override // java.lang.Runnable
            public final void run() {
                C35686Rk5.m86364um(C35686Rk5.this, z);
            }
        });
    }

    /* renamed from: v0 */
    public final Observable<Unit> m86363v0() {
        ImageButton imageButton = this.f32502c.f79262e.f47684d;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.code");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    /* renamed from: vm */
    public final void m86362vm(boolean z) {
        ImageButton imageButton = this.f32502c.f79262e.f47684d;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.code");
        C49520tu6.show$default(imageButton, z, 0, 2, null);
    }

    /* renamed from: wm */
    public final void m86361wm(boolean z) {
        if (this.f32505f) {
            MLKitScanView mLKitScanView = this.f32502c.f79262e.f47690j;
            Intrinsics.checkNotNullExpressionValue(mLKitScanView, "binding.constraintLayout.mlKitScanner");
            C49520tu6.m11232s(mLKitScanView, z, 8);
            return;
        }
        QrCodeZXingScannerView qrCodeZXingScannerView = this.f32502c.f79262e.f47692l;
        Intrinsics.checkNotNullExpressionValue(qrCodeZXingScannerView, "binding.constraintLayout.scanner");
        C49520tu6.m11232s(qrCodeZXingScannerView, z, 4);
    }

    /* renamed from: xm */
    public final void m86360xm() {
        InterfaceC41921h56.C22549a.topToast$default(this, C45871nl4.incorrect_vehicle_scanned, (EnumC40735f56) null, 2, (Object) null);
    }

    /* renamed from: ym */
    public final void m86359ym() {
        OptionalImeEditText optionalImeEditText = this.f32502c.f79262e.f47685e;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText, "binding.constraintLayout.codeEditor");
        boolean m11230u = C49520tu6.m11230u(optionalImeEditText);
        m86361wm(m11230u);
        OptionalImeEditText optionalImeEditText2 = this.f32502c.f79262e.f47685e;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText2, "binding.constraintLayout.codeEditor");
        C49520tu6.show$default(optionalImeEditText2, !m11230u, 0, 2, null);
        if (m11230u) {
            hideKeyboard();
            return;
        }
        this.f32502c.f79262e.f47685e.requestFocus();
        OptionalImeEditText optionalImeEditText3 = this.f32502c.f79262e.f47685e;
        Intrinsics.checkNotNullExpressionValue(optionalImeEditText3, "binding.constraintLayout.codeEditor");
        showKeyboard(optionalImeEditText3);
    }

    /* renamed from: zm */
    public final void m86358zm() {
        if (this.f32505f) {
            this.f32502c.f79262e.f47690j.m56005m();
        } else {
            this.f32502c.f79262e.f47692l.toggleFlash();
        }
    }
}
