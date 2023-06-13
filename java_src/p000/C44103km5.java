package p000;

import android.os.IBinder;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.QrCodeZXingScannerView;
import co.bird.android.widget.scan.BarcodeScanView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.skydoves.balloon.Balloon;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001\u0012\u0006\u00102\u001a\u00020-\u0012\b\u00108\u001a\u0004\u0018\u000103\u0012\u0006\u0010>\u001a\u000209\u0012\u0006\u0010D\u001a\u00020?\u0012\u0006\u0010J\u001a\u00020E\u0012\u0006\u0010M\u001a\u000209\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010V\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010N\u0012\u0006\u0010c\u001a\u00020\u000f\u0012\u0006\u0010f\u001a\u00020\u000f\u0012\u0006\u0010l\u001a\u00020g\u0012\u0006\u0010o\u001a\u00020g¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0003H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u001a\u0010+\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u00108\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010M\u001a\u0002098\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u0010=R\u0019\u0010S\u001a\u0004\u0018\u00010N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010U\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\bT\u0010=R\u0019\u0010[\u001a\u0004\u0018\u00010V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010^\u001a\u0004\u0018\u00010N8\u0006¢\u0006\f\n\u0004\b\\\u0010P\u001a\u0004\b]\u0010RR\u0017\u0010c\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010f\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bd\u0010`\u001a\u0004\be\u0010bR\u0017\u0010l\u001a\u00020g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010o\u001a\u00020g8\u0006¢\u0006\f\n\u0004\bm\u0010i\u001a\u0004\bn\u0010kR\u0016\u0010r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010w\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u001d0\u001d0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\"\u0010\u007f\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u00050\u00050|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010AR\u0018\u0010\u0083\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010qR\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001Ra\u0010\u0093\u0001\u001aC\u0012%\u0012#\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00010\u0088\u0001¢\u0006\u000f\b\u008b\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(\u008d\u0001\u0012\u0004\u0012\u00020\u00050\u0087\u0001j\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u0001`\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0098\u0001"}, m28432d2 = {"Lkm5;", "Lhm5;", "LxE;", "", "show", "", "Vl", "n1", "a1", "", "tolerance", "d6", "Lfm5;", "resultHandler", "l5", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "tc", "Lak5;", "sk", "Lio/reactivex/Observable;", "zc", "", "length", "d2", C9916Yi.f46302c, "gk", "sa", "z1", "LXK;", "W3", "i", "Wl", "n0", "jl", "Lco/bird/android/model/wire/WireBird;", "bird", "isHourly", "ec", "u5", "w9", "c2", "copy", "Qa", "Vg", "LTq4;", "b", "LTq4;", "getReactiveConfig", "()LTq4;", "reactiveConfig", "Landroidx/appcompat/app/ActionBar;", "c", "Landroidx/appcompat/app/ActionBar;", "getSupportActionBar", "()Landroidx/appcompat/app/ActionBar;", "supportActionBar", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ImageView;", "getFlashButton", "()Landroid/widget/ImageView;", "flashButton", "Landroid/view/View;", "e", "Landroid/view/View;", "getViewFinder", "()Landroid/view/View;", "viewFinder", "Landroidx/appcompat/widget/AppCompatEditText;", "f", "Landroidx/appcompat/widget/AppCompatEditText;", "Sl", "()Landroidx/appcompat/widget/AppCompatEditText;", "codeEditor", "g", "getCodeButton", "codeButton", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "getInfoText", "()Landroid/widget/TextView;", "infoText", "getScooter", "scooter", "Lco/bird/android/widget/BirdActionView;", "j", "Lco/bird/android/widget/BirdActionView;", "getStatus", "()Lco/bird/android/widget/BirdActionView;", "status", "k", "getPricing", "pricing", "l", "Ljava/lang/String;", "getScanInfoTextStr", "()Ljava/lang/String;", "scanInfoTextStr", "m", "getCodeInfoTextStr", "codeInfoTextStr", "Landroid/view/ViewGroup;", "n", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "container", "o", "getRoot", "root", "p", "Z", "flashOn", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "q", "Lio/reactivex/subjects/d;", "birdCodeEnteredSubject", "Lcom/skydoves/balloon/Balloon;", "r", "Lcom/skydoves/balloon/Balloon;", "balloonTooltip", "LAG;", "s", "LAG;", "globalLayoutChanges", "t", "resolvedScannerView", "u", "scannerRunning", "v", "Lfm5;", "currentResultHandler", "Lkotlin/Function1;", "Lco/bird/android/buava/Optional;", "", "LBx;", "Lkotlin/ParameterName;", "name", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lco/bird/android/widget/scan/AnalysisResultListener;", "w", "Lkotlin/Lazy;", "Tl", "()Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LTq4;Landroidx/appcompat/app/ActionBar;Landroid/widget/ImageView;Landroid/view/View;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScannerUiDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScannerUiDelegateImpl.kt\nco/bird/android/app/feature/scanner/ScannerUiDelegateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1#2:347\n*E\n"})
/* renamed from: km5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44103km5 extends AbstractC30071xE implements InterfaceC42324hm5 {

    /* renamed from: b */
    public final C36207Tq4 f94909b;

    /* renamed from: c */
    public final ActionBar f94910c;

    /* renamed from: d */
    public final ImageView f94911d;

    /* renamed from: e */
    public final View f94912e;

    /* renamed from: f */
    public final AppCompatEditText f94913f;

    /* renamed from: g */
    public final ImageView f94914g;

    /* renamed from: h */
    public final TextView f94915h;

    /* renamed from: i */
    public final ImageView f94916i;

    /* renamed from: j */
    public final BirdActionView f94917j;

    /* renamed from: k */
    public final TextView f94918k;

    /* renamed from: l */
    public final String f94919l;

    /* renamed from: m */
    public final String f94920m;

    /* renamed from: n */
    public final ViewGroup f94921n;

    /* renamed from: o */
    public final ViewGroup f94922o;

    /* renamed from: p */
    public boolean f94923p;

    /* renamed from: q */
    public final C24558d<C9400XK> f94924q;

    /* renamed from: r */
    public Balloon f94925r;

    /* renamed from: s */
    public final C0058AG<Unit> f94926s;

    /* renamed from: t */
    public final View f94927t;

    /* renamed from: u */
    public boolean f94928u;

    /* renamed from: v */
    public InterfaceC41138fm5 f94929v;

    /* renamed from: w */
    public final Lazy f94930w;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/TextView;", "<anonymous parameter 0>", "", "actionId", "Landroid/view/KeyEvent;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: km5$a */
    /* loaded from: classes2.dex */
    public static final class C25233a extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
        public C25233a() {
            super(3);
        }

        /* renamed from: a */
        public final Boolean m28452a(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            CharSequence trim;
            boolean isBlank;
            if (i == 6) {
                trim = StringsKt__StringsKt.trim((CharSequence) String.valueOf(C44103km5.this.m28457Sl().getText()));
                String obj = trim.toString();
                isBlank = StringsKt__StringsJVMKt.isBlank(obj);
                if (isBlank) {
                    C44103km5.this.m28457Sl().setError(C44103km5.this.getActivity().getString(C45871nl4.scanner_code_error_empty));
                } else {
                    C44103km5.this.f94924q.onNext(new C9400XK(obj));
                    C44103km5.this.mo7480n0();
                }
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
            return m28452a(textView, num.intValue(), keyEvent);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a)\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Function1;", "Lco/bird/android/buava/Optional;", "", "LBx;", "Lkotlin/ParameterName;", "name", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "b", "()Lkotlin/jvm/functions/Function1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: km5$b */
    /* loaded from: classes2.dex */
    public static final class C25234b extends Lambda implements Function0<Function1<? super Optional<List<? extends C0774Bx>>, ? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "LBx;", "barcodes", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScannerUiDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScannerUiDelegateImpl.kt\nco/bird/android/app/feature/scanner/ScannerUiDelegateImpl$listener$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,346:1\n1#2:347\n1855#3,2:348\n*S KotlinDebug\n*F\n+ 1 ScannerUiDelegateImpl.kt\nco/bird/android/app/feature/scanner/ScannerUiDelegateImpl$listener$2$1\n*L\n82#1:348,2\n*E\n"})
        /* renamed from: km5$b$a */
        /* loaded from: classes2.dex */
        public static final class C25235a extends Lambda implements Function1<Optional<List<? extends C0774Bx>>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C44103km5 f94933g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25235a(C44103km5 c44103km5) {
                super(1);
                this.f94933g = c44103km5;
            }

            /* renamed from: a */
            public final void m28450a(Optional<List<C0774Bx>> barcodes) {
                boolean isBlank;
                Intrinsics.checkNotNullParameter(barcodes, "barcodes");
                C41318g46.m40163a("barcodes received, isScannerRunning? " + this.f94933g.f94928u, new Object[0]);
                List<C0774Bx> m59035e = barcodes.m59035e();
                if (m59035e != null) {
                    if (!this.f94933g.f94928u) {
                        m59035e = null;
                    }
                    if (m59035e != null) {
                        C44103km5 c44103km5 = this.f94933g;
                        for (C0774Bx c0774Bx : m59035e) {
                            C41318g46.m40163a("barcode " + c0774Bx, new Object[0]);
                            String it = c0774Bx.m113296e();
                            if (it != null) {
                                Intrinsics.checkNotNullExpressionValue(it, "it");
                                isBlank = StringsKt__StringsJVMKt.isBlank(it);
                                if (!(!isBlank)) {
                                    it = null;
                                }
                                if (it != null) {
                                    Intrinsics.checkNotNullExpressionValue(it, "barcode.rawValue?.takeIf…ank() } ?: return@forEach");
                                    c44103km5.f94928u = false;
                                    InterfaceC41138fm5 interfaceC41138fm5 = c44103km5.f94929v;
                                    if (interfaceC41138fm5 != null) {
                                        interfaceC41138fm5.mo40823b(new C40545em5(it, c0774Bx));
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Optional<List<? extends C0774Bx>> optional) {
                m28450a(optional);
                return Unit.INSTANCE;
            }
        }

        public C25234b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Function1<Optional<List<? extends C0774Bx>>, Unit> invoke() {
            return new C25235a(C44103km5.this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/skydoves/balloon/Balloon$a;", "", C17296a.f69688o, "(Lcom/skydoves/balloon/Balloon$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: km5$c */
    /* loaded from: classes2.dex */
    public static final class C25236c extends Lambda implements Function1<Balloon.C18588a, Unit> {

        /* renamed from: g */
        public static final C25236c f94934g = new C25236c();

        public C25236c() {
            super(1);
        }

        /* renamed from: a */
        public final void m28449a(Balloon.C18588a createBirdTooltip) {
            Intrinsics.checkNotNullParameter(createBirdTooltip, "$this$createBirdTooltip");
            createBirdTooltip.m45638V0(8000L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balloon.C18588a c18588a) {
            m28449a(c18588a);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C44103km5(BaseActivity baseActivity, C36207Tq4 c36207Tq4, ActionBar actionBar, ImageView imageView, View view, AppCompatEditText appCompatEditText, ImageView imageView2, TextView textView, ImageView imageView3, BirdActionView birdActionView, TextView textView2, String str, String str2, ViewGroup viewGroup, ViewGroup viewGroup2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, c36207Tq4, actionBar, imageView, view, appCompatEditText, imageView2, (i & 128) != 0 ? null : textView, (i & 256) != 0 ? null : imageView3, (i & 512) != 0 ? null : birdActionView, (i & 1024) != 0 ? null : textView2, str, str2, viewGroup, viewGroup2);
    }

    /* renamed from: Rl */
    public static final void m28458Rl(C44103km5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f94926s.accept(Unit.INSTANCE);
    }

    /* renamed from: Ul */
    public static final void m28455Ul(InterfaceC41138fm5 handler, C38511bN4 c38511bN4) {
        Intrinsics.checkNotNullParameter(handler, "$handler");
        String m64617f = c38511bN4.m64617f();
        Intrinsics.checkNotNullExpressionValue(m64617f, "result.text");
        handler.mo40823b(new C40545em5(m64617f, c38511bN4));
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Qa */
    public boolean mo7502Qa(String str, boolean z) {
        if (getActivity().isFinishing()) {
            return false;
        }
        if (!z) {
            Balloon balloon = this.f94925r;
            if (balloon != null) {
                balloon.m45739O();
            }
            return false;
        }
        BaseActivity activity = getActivity();
        if (str == null) {
            str = getActivity().getString(C45871nl4.scan_bird_v2_tooltip_hint);
            Intrinsics.checkNotNullExpressionValue(str, "activity.getString(L.str…can_bird_v2_tooltip_hint)");
        }
        Balloon m99238a = K56.m99238a(activity, str, C25236c.f94934g);
        this.f94925r = m99238a;
        if (m99238a != null) {
            Balloon.m45751H0(m99238a, this.f94914g, 0, 0, 6, null);
            return true;
        }
        return true;
    }

    /* renamed from: Sl */
    public final AppCompatEditText m28457Sl() {
        return this.f94913f;
    }

    /* renamed from: Tl */
    public final Function1<Optional<List<? extends C0774Bx>>, Unit> m28456Tl() {
        return (Function1) this.f94930w.getValue();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Vg */
    public Observable<Unit> mo7499Vg() {
        Observable<Unit> hide = this.f94926s.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "globalLayoutChanges.hide()");
        return hide;
    }

    /* renamed from: Vl */
    public final void m28454Vl(boolean z) {
        int i;
        C49520tu6.show$default(this.f94914g, z, 0, 2, null);
        ViewGroup.LayoutParams layoutParams = this.f94911d.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            i = 8388613;
        } else {
            i = 1;
        }
        layoutParams2.gravity = i;
        this.f94911d.setLayoutParams(layoutParams);
        this.f94911d.requestLayout();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: W3 */
    public Observable<C9400XK> mo7497W3() {
        Observable<C9400XK> hide = this.f94924q.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdCodeEnteredSubject.hide()");
        return hide;
    }

    /* renamed from: Wl */
    public void m28453Wl() {
        IBinder windowToken = this.f94913f.getWindowToken();
        if (windowToken != null) {
            Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).toggleSoftInputFromWindow(windowToken, 2, 0);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Yi */
    public void mo7496Yi() {
        m28454Vl(false);
        ActionBar actionBar = this.f94910c;
        if (actionBar != null) {
            actionBar.mo70242E(getActivity().getString(C45871nl4.bird_search_serial_scan_title));
        }
        View view = this.f94912e;
        if (view instanceof ImageView) {
            C44696lm5.m26841a((ImageView) view, C33309Hg4.barcode_view_finder);
        }
        ImageView imageView = this.f94916i;
        if (imageView != null) {
            C44696lm5.m26841a(imageView, C48193rg4.ic_barcode_scooter);
        }
        TextView textView = this.f94915h;
        if (textView != null) {
            C49520tu6.m11233r(textView);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: a1 */
    public void mo7495a1() {
        View view = this.f94927t;
        if (view instanceof QrCodeZXingScannerView) {
            ((QrCodeZXingScannerView) view).stopCamera();
        } else if (view instanceof BarcodeScanView) {
            this.f94928u = false;
        } else {
            throw new ClassCastException("resolvedScannerView is not a valid instance of QrCodeZXingScannerView or BarcodeScanView");
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: c2 */
    public void mo7493c2() {
        this.f94913f.requestFocus();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d2 */
    public void mo7492d2(int i) {
        C49520tu6.m11250a(this.f94913f, new InputFilter.LengthFilter(i));
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d6 */
    public void mo7491d6(float f) {
        View view = this.f94927t;
        if (view instanceof QrCodeZXingScannerView) {
            ((QrCodeZXingScannerView) view).setAspectTolerance(f);
        } else if (view instanceof BarcodeScanView) {
        } else {
            throw new ClassCastException("resolvedScannerView is not a valid instance of QrCodeZXingScannerView or BarcodeScanView");
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: ec */
    public void mo7488ec(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        BirdActionView birdActionView = this.f94917j;
        if (birdActionView != null) {
            C49520tu6.m11233r(birdActionView);
        }
        BirdActionView birdActionView2 = this.f94917j;
        if (birdActionView2 != null) {
            BirdActionView.setBird$default(birdActionView2, null, bird, true, z, 1, null);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: gk */
    public void mo7486gk() {
        m28454Vl(false);
        ActionBar actionBar = this.f94910c;
        if (actionBar != null) {
            actionBar.mo70242E(getActivity().getString(C45871nl4.bird_search_scan_new_barcode));
        }
        View view = this.f94912e;
        if (view instanceof ImageView) {
            C44696lm5.m26841a((ImageView) view, C47600qg4.qr_view_finder);
        }
        ImageView imageView = this.f94916i;
        if (imageView != null) {
            C44696lm5.m26841a(imageView, C52342yg4.ic_qr_scooter);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: i */
    public boolean mo7485i() {
        boolean z;
        BarcodeScanView barcodeScanView;
        try {
            if (!this.f94923p) {
                z = true;
            } else {
                z = false;
            }
            this.f94923p = z;
            View view = this.f94927t;
            ZXingScannerView zXingScannerView = null;
            if (view instanceof BarcodeScanView) {
                barcodeScanView = (BarcodeScanView) view;
            } else {
                barcodeScanView = null;
            }
            if (barcodeScanView != null) {
                barcodeScanView.setFlash(z);
            } else {
                if (view instanceof ZXingScannerView) {
                    zXingScannerView = (ZXingScannerView) view;
                }
                if (zXingScannerView != null) {
                    zXingScannerView.setFlash(z);
                }
            }
            if (this.f94923p) {
                this.f94911d.setBackgroundResource(C33309Hg4.frame_rectangle_border_rounded_button_enabled);
                this.f94911d.setColorFilter(NA0.m94301c(getActivity(), C32364Df4.white));
                this.f94911d.setContentDescription(getActivity().getString(C45871nl4.turn_off_flashlight));
            } else {
                this.f94911d.setBackgroundResource(C33309Hg4.frame_rectangle_border_rounded_button);
                this.f94911d.setColorFilter(NA0.m94301c(getActivity(), C32364Df4.black));
                this.f94911d.setContentDescription(getActivity().getString(C45871nl4.turn_on_flashlight));
            }
        } catch (Exception e) {
            this.f94923p = true ^ this.f94923p;
            C41318g46.m40159e(e);
        }
        return this.f94923p;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: jl */
    public void mo7482jl() {
        this.f94913f.setText("");
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: l5 */
    public void mo7481l5(final InterfaceC41138fm5 interfaceC41138fm5) {
        ZXingScannerView.ResultHandler resultHandler;
        this.f94929v = interfaceC41138fm5;
        View view = this.f94927t;
        if (view instanceof QrCodeZXingScannerView) {
            QrCodeZXingScannerView qrCodeZXingScannerView = (QrCodeZXingScannerView) view;
            if (interfaceC41138fm5 != null) {
                resultHandler = new ZXingScannerView.ResultHandler() { // from class: jm5
                    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
                    public final void handleResult(C38511bN4 c38511bN4) {
                        C44103km5.m28455Ul(InterfaceC41138fm5.this, c38511bN4);
                    }
                };
            } else {
                resultHandler = null;
            }
            qrCodeZXingScannerView.setResultHandler(resultHandler);
        } else if (view instanceof BarcodeScanView) {
        } else {
            throw new ClassCastException("resolvedScannerView is not a valid instance of QrCodeZXingScannerView or BarcodeScanView");
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n0 */
    public void mo7480n0() {
        this.f94913f.clearFocus();
        IBinder windowToken = this.f94913f.getWindowToken();
        if (windowToken != null) {
            Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n1 */
    public void mo7479n1() {
        View view = this.f94927t;
        if (view instanceof QrCodeZXingScannerView) {
            ((QrCodeZXingScannerView) view).startCamera();
        } else if (view instanceof BarcodeScanView) {
            this.f94928u = true;
        } else {
            throw new ClassCastException("resolvedScannerView is not a valid instance of QrCodeZXingScannerView or BarcodeScanView");
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sa */
    public Observable<Unit> mo7478sa() {
        return C45219mf5.m25214a(this.f94914g);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sk */
    public EnumC38136ak5 mo7477sk() {
        if (this.f94913f.getVisibility() == 8) {
            getActivity().setTitle(C45871nl4.scan_bird_v2_enter_code_title);
            this.f94913f.setVisibility(0);
            this.f94913f.requestFocus();
            C49520tu6.m11239l(this.f94927t);
            TextView textView = this.f94915h;
            if (textView != null) {
                textView.setText(this.f94920m);
            }
            TextView textView2 = this.f94915h;
            if (textView2 != null) {
                C49520tu6.m11233r(textView2);
            }
            TextView textView3 = this.f94918k;
            if (textView3 != null) {
                C49520tu6.m11239l(textView3);
            }
            ImageView imageView = this.f94916i;
            if (imageView != null) {
                C44696lm5.m26841a(imageView, C48193rg4.ic_qr_code_illustration);
            }
            m28453Wl();
            int m41780b = (int) C40788fB0.m41780b(getActivity(), 7.0f);
            int m41780b2 = (int) C40788fB0.m41780b(getActivity(), 32.0f);
            this.f94914g.setImageResource(C48193rg4.ic_qr_button);
            this.f94914g.setPadding(m41780b2, m41780b, m41780b2, m41780b);
            return EnumC38136ak5.CODE;
        }
        getActivity().setTitle(C45871nl4.scan_bird_v2_activity_title);
        C49520tu6.m11233r(this.f94927t);
        TextView textView4 = this.f94915h;
        if (textView4 != null) {
            textView4.setText(this.f94919l);
        }
        ImageView imageView2 = this.f94916i;
        if (imageView2 != null) {
            C44696lm5.m26841a(imageView2, C48193rg4.ic_scooter_illustration);
        }
        C49520tu6.show$default(this.f94913f, false, 0, 2, null);
        mo7480n0();
        int m41780b3 = (int) C40788fB0.m41780b(getActivity(), 12.0f);
        int m41780b4 = (int) C40788fB0.m41780b(getActivity(), 24.0f);
        this.f94914g.setImageResource(C48193rg4.ic_enter_code_button);
        this.f94914g.setPadding(m41780b4, m41780b3, m41780b4, m41780b3);
        return EnumC38136ak5.QR;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: tc */
    public void mo7476tc(String str) {
        if (str != null) {
            this.f94913f.setText(str);
        }
        C34585Ms2.m94658m(this.f94913f, new C25233a());
        C49520tu6.m11250a(this.f94913f, new InputFilter.AllCaps());
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: u5 */
    public void mo7475u5() {
        BirdActionView birdActionView = this.f94917j;
        if (birdActionView != null) {
            C49520tu6.m11239l(birdActionView);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: w9 */
    public void mo7474w9(boolean z) {
        TextView textView = this.f94915h;
        if (textView != null) {
            C49520tu6.show$default(textView, z, 0, 2, null);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: z1 */
    public Observable<Unit> mo7472z1() {
        return C45219mf5.m25214a(this.f94911d);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: zc */
    public Observable<String> mo7471zc() {
        return C44626lf5.textChanges$default(this.f94913f, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44103km5(BaseActivity activity, C36207Tq4 reactiveConfig, ActionBar actionBar, ImageView flashButton, View viewFinder, AppCompatEditText codeEditor, ImageView codeButton, TextView textView, ImageView imageView, BirdActionView birdActionView, TextView textView2, String scanInfoTextStr, String codeInfoTextStr, ViewGroup container, ViewGroup root) {
        super(activity);
        Lazy lazy;
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(flashButton, "flashButton");
        Intrinsics.checkNotNullParameter(viewFinder, "viewFinder");
        Intrinsics.checkNotNullParameter(codeEditor, "codeEditor");
        Intrinsics.checkNotNullParameter(codeButton, "codeButton");
        Intrinsics.checkNotNullParameter(scanInfoTextStr, "scanInfoTextStr");
        Intrinsics.checkNotNullParameter(codeInfoTextStr, "codeInfoTextStr");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f94909b = reactiveConfig;
        this.f94910c = actionBar;
        this.f94911d = flashButton;
        this.f94912e = viewFinder;
        this.f94913f = codeEditor;
        this.f94914g = codeButton;
        this.f94915h = textView;
        this.f94916i = imageView;
        this.f94917j = birdActionView;
        this.f94918k = textView2;
        this.f94919l = scanInfoTextStr;
        this.f94920m = codeInfoTextStr;
        this.f94921n = container;
        this.f94922o = root;
        C24558d<C9400XK> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<BirdCodeEnteredEvent>()");
        this.f94924q = m31902e;
        C0058AG<Unit> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Unit>()");
        this.f94926s = m115951g;
        this.f94928u = true;
        lazy = LazyKt__LazyJVMKt.lazy(new C25234b());
        this.f94930w = lazy;
        root.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: im5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C44103km5.m28458Rl(C44103km5.this);
            }
        });
        ViewStub viewStub = (ViewStub) C40788fB0.m41779c(activity, C36585Vg4.scannerViewStub);
        if (reactiveConfig.m82623f8().m73665a().getEnableMlKitBarcodeScanner()) {
            i = C39311cj4.view_stub_mlkit_scanner_view;
        } else {
            i = C39311cj4.view_stub_zxing_scanner_view;
        }
        viewStub.setLayoutResource(i);
        View inflate = viewStub.inflate();
        Intrinsics.checkNotNullExpressionValue(inflate, "stub.inflate()");
        this.f94927t = inflate;
        BarcodeScanView barcodeScanView = inflate instanceof BarcodeScanView ? (BarcodeScanView) inflate : null;
        if (barcodeScanView != null) {
            barcodeScanView.m54003d(m28456Tl());
        }
    }
}
