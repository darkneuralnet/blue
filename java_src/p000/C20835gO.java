package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.transition.C12055c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.SwipeUpToSubmitLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001kB\u0011\b\u0007\u0012\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\b\u0010 \u001a\u00020\u0006H\u0002R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00104\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u000109090\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010-0-0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\"\u0010A\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010-0-0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R \u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010<R>\u0010O\u001a,\u0012(\u0012&\u0012\f\u0012\n :*\u0004\u0018\u00010\u000e0\u000e :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00130\u00130\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010<R\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010/R\u0014\u0010W\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010/R\"\u0010[\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010\u00060\u00060X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010e\u001a\u00020\u00172\u0006\u0010`\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006l"}, m28432d2 = {"LgO;", "LbO;", "LxE;", "", "", "tips", "", "Lh", "tipHints", "r2", "ea", "merchantName", "C2", "amount", "", "hintLength", "D9", "couponDescription", "rb", "Lio/reactivex/Observable;", "th", "V2", "s1", "", "enable", "Xk", "Uh", "fa", "discountText", "Fe", "jf", "cd", "Ul", "Landroid/text/style/StyleSpan;", "b", "Landroid/text/style/StyleSpan;", "merchantNameBoldSpan", "Landroid/text/style/ForegroundColorSpan;", "c", "Landroid/text/style/ForegroundColorSpan;", "merchantNameColorSpan", DateTokenConverter.CONVERTER_KEY, "primaryColorSpan", "e", "secondaryColorSpan", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "merchantLabel", "g", "amountLabel", "h", "winnerText", "Landroid/widget/LinearLayout;", "i", "Landroid/widget/LinearLayout;", "tippingContainer", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "j", "Ljava/util/List;", "tipContainers", "k", "tipTextViews", "l", "tipHintTextViews", "m", "Lio/reactivex/Observable;", "Ef", "()Lio/reactivex/Observable;", "selectedTip", "Landroid/widget/ImageButton;", "n", "Landroid/widget/ImageButton;", "numpadBackspace", "Landroid/widget/Button;", "o", "numpadButtons", "p", "numpadButtonsClicks", "Lcom/airbnb/lottie/LottieAnimationView;", "q", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "r", "couponBanner", "s", "winnerLabel", "Lma4;", "t", "Lma4;", "onSubmitSubject", "Lco/bird/android/widget/SwipeUpToSubmitLayout;", "u", "Lco/bird/android/widget/SwipeUpToSubmitLayout;", "swipeToSubmitLayout", "value", "getTipsVisible", "()Z", "X1", "(Z)V", "tipsVisible", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "v", C17296a.f69688o, "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPayInputUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayInputUi.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,269:1\n1559#2:270\n1590#2,4:271\n1559#2:275\n1590#2,4:276\n1864#2,3:283\n1864#2,2:286\n1866#2:290\n1864#2,2:291\n1866#2:295\n260#3:280\n262#3,2:281\n262#3,2:288\n262#3,2:293\n262#3,2:296\n*S KotlinDebug\n*F\n+ 1 BirdPayInputUi.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputUiImpl\n*L\n104#1:270\n104#1:271,4\n133#1:275\n133#1:276,4\n158#1:283,3\n166#1:286,2\n166#1:290\n175#1:291,2\n175#1:295\n149#1:280\n151#1:281,2\n169#1:288,2\n184#1:293,2\n239#1:296,2\n*E\n"})
/* renamed from: gO */
/* loaded from: classes3.dex */
public final class C20835gO extends AbstractC30071xE implements InterfaceC12377bO {

    /* renamed from: v */
    public static final C20836a f82089v = new C20836a(null);

    /* renamed from: b */
    public final StyleSpan f82090b;

    /* renamed from: c */
    public final ForegroundColorSpan f82091c;

    /* renamed from: d */
    public final ForegroundColorSpan f82092d;

    /* renamed from: e */
    public final ForegroundColorSpan f82093e;

    /* renamed from: f */
    public final TextView f82094f;

    /* renamed from: g */
    public final TextView f82095g;

    /* renamed from: h */
    public final TextView f82096h;

    /* renamed from: i */
    public final LinearLayout f82097i;

    /* renamed from: j */
    public final List<FrameLayout> f82098j;

    /* renamed from: k */
    public final List<TextView> f82099k;

    /* renamed from: l */
    public final List<TextView> f82100l;

    /* renamed from: m */
    public final Observable<Integer> f82101m;

    /* renamed from: n */
    public final ImageButton f82102n;

    /* renamed from: o */
    public final List<Button> f82103o;

    /* renamed from: p */
    public final List<Observable<Integer>> f82104p;

    /* renamed from: q */
    public final LottieAnimationView f82105q;

    /* renamed from: r */
    public final TextView f82106r;

    /* renamed from: s */
    public final TextView f82107s;

    /* renamed from: t */
    public final C45168ma4<Unit> f82108t;

    /* renamed from: u */
    public final SwipeUpToSubmitLayout f82109u;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"LgO$a;", "", "", "CLICKS_THROTTLE_MILLIS", "J", "", "PAY_LOTTIE_END_FRAME", "I", "PAY_LOTTIE_WINNER_CONFETTI_FRAME", "PAY_WINNER_END_FRAME", "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gO$a */
    /* loaded from: classes3.dex */
    public static final class C20836a {
        public /* synthetic */ C20836a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20836a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/y;", "", "emitter", C17296a.f69688o, "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gO$b */
    /* loaded from: classes3.dex */
    public static final class C20837b extends Lambda implements Function1<InterfaceC24578y<Unit>, Unit> {

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"gO$b$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "animation", "onAnimationRepeat", "onAnimationCancel", "onAnimationStart", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: gO$b$a */
        /* loaded from: classes3.dex */
        public static final class C20838a implements Animator.AnimatorListener {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC24578y<Unit> f82111a;

            public C20838a(InterfaceC24578y<Unit> interfaceC24578y) {
                this.f82111a = interfaceC24578y;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                this.f82111a.onNext(Unit.INSTANCE);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        }

        public C20837b() {
            super(1);
        }

        /* renamed from: a */
        public final void m39517a(InterfaceC24578y<Unit> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C20835gO.this.f82105q.m53555i(new C20838a(emitter));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<Unit> interfaceC24578y) {
            m39517a(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gO$c */
    /* loaded from: classes3.dex */
    public static final class C20839c extends Lambda implements Function1<Unit, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f82112g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20839c(int i) {
            super(1);
            this.f82112g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(this.f82112g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gO$d */
    /* loaded from: classes3.dex */
    public static final class C20840d extends Lambda implements Function1<Unit, Integer> {

        /* renamed from: g */
        public final /* synthetic */ int f82113g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20840d(int i) {
            super(1);
            this.f82113g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(this.f82113g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "selectedIndex", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBirdPayInputUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayInputUi.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputUiImpl$selectedTip$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1864#2,3:270\n*S KotlinDebug\n*F\n+ 1 BirdPayInputUi.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputUiImpl$selectedTip$2\n*L\n110#1:270,3\n*E\n"})
    /* renamed from: gO$e */
    /* loaded from: classes3.dex */
    public static final class C20841e extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f82115h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20841e(BaseActivity baseActivity) {
            super(1);
            this.f82115h = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            BaseActivity baseActivity = this.f82115h;
            int i = 0;
            for (Object obj : C20835gO.this.f82098j) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                FrameLayout frameLayout = (FrameLayout) obj;
                if (num != null && num.intValue() == i) {
                    frameLayout.setBackground(null);
                } else if (i == 0) {
                    frameLayout.setBackgroundResource(C42263hg4.bg_tip_deselected_left);
                } else if (i == 3) {
                    frameLayout.setBackgroundResource(C42263hg4.bg_tip_deselected_right);
                } else {
                    frameLayout.setBackgroundColor(C40788fB0.m41776f(baseActivity, C32364Df4.white));
                }
                i = i2;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gO$f */
    /* loaded from: classes3.dex */
    public static final class C20842f extends Lambda implements Function0<Unit> {
        public C20842f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C20835gO.this.f82108t.accept(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20835gO(BaseActivity activity) {
        super(activity);
        List<FrameLayout> listOf;
        List<TextView> listOf2;
        List<TextView> listOf3;
        int collectionSizeOrDefault;
        List<Button> listOf4;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f82090b = new StyleSpan(1);
        this.f82091c = new ForegroundColorSpan(C40788fB0.m41776f(activity, C32364Df4.black));
        this.f82092d = new ForegroundColorSpan(C40788fB0.m41776f(activity, C32364Df4.birdNewRoad));
        this.f82093e = new ForegroundColorSpan(C40788fB0.m41776f(activity, C32364Df4.birdGray));
        this.f82094f = (TextView) C40788fB0.m41779c(activity, C36360Uh4.title);
        this.f82095g = (TextView) C40788fB0.m41779c(activity, C36360Uh4.amount);
        this.f82096h = (TextView) C40788fB0.m41779c(activity, C36360Uh4.winnerLabel);
        View findViewById = activity.findViewById(C36360Uh4.tipping_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "activity.findViewById(R.id.tipping_container)");
        this.f82097i = (LinearLayout) findViewById;
        int i = 0;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FrameLayout[]{activity.findViewById(C36360Uh4.no_tip_container), activity.findViewById(C36360Uh4.tip_level_one_container), activity.findViewById(C36360Uh4.tip_level_two_container), activity.findViewById(C36360Uh4.tip_level_three_container)});
        this.f82098j = listOf;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new TextView[]{activity.findViewById(C36360Uh4.tip_level_one_tv), activity.findViewById(C36360Uh4.tip_level_two_tv), activity.findViewById(C36360Uh4.tip_level_three_tv)});
        this.f82099k = listOf2;
        listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new TextView[]{activity.findViewById(C36360Uh4.tip_level_one_hint_tv), activity.findViewById(C36360Uh4.tip_level_two_hint_tv), activity.findViewById(C36360Uh4.tip_level_three_hint_tv)});
        this.f82100l = listOf3;
        List<FrameLayout> list = listOf;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            FrameLayout tipContainer = (FrameLayout) obj;
            Intrinsics.checkNotNullExpressionValue(tipContainer, "tipContainer");
            Observable<Unit> m25214a = C45219mf5.m25214a(tipContainer);
            final C20840d c20840d = new C20840d(i2);
            arrayList.add(m25214a.map(new InterfaceC23492o() { // from class: cO
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    Integer m39530Vl;
                    m39530Vl = C20835gO.m39530Vl(Function1.this, obj2);
                    return m39530Vl;
                }
            }));
            i2 = i3;
        }
        Observable observeOn = Observable.merge(arrayList).debounce(100L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final C20841e c20841e = new C20841e(activity);
        Observable<Integer> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: dO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C20835gO.m39529Wl(Function1.this, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "merge(\n    tipContainers…)\n        }\n      }\n    }");
        this.f82101m = doOnNext;
        this.f82102n = (ImageButton) C40788fB0.m41779c(activity, C36360Uh4.numPadBackspace);
        listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new Button[]{C40788fB0.m41779c(activity, C36360Uh4.numPadZero), C40788fB0.m41779c(activity, C36360Uh4.numPadOne), C40788fB0.m41779c(activity, C36360Uh4.numPadTwo), C40788fB0.m41779c(activity, C36360Uh4.numPadThree), C40788fB0.m41779c(activity, C36360Uh4.numPadFour), C40788fB0.m41779c(activity, C36360Uh4.numPadFive), C40788fB0.m41779c(activity, C36360Uh4.numPadSix), C40788fB0.m41779c(activity, C36360Uh4.numPadSeven), C40788fB0.m41779c(activity, C36360Uh4.numPadEight), C40788fB0.m41779c(activity, C36360Uh4.numPadNine)});
        this.f82103o = listOf4;
        List<Button> list2 = listOf4;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (Object obj2 : list2) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Observable<Unit> m27017c = C44626lf5.m27017c((Button) obj2, 100L);
            final C20839c c20839c = new C20839c(i);
            arrayList2.add(m27017c.map(new InterfaceC23492o() { // from class: eO
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    Integer m39534Tl;
                    m39534Tl = C20835gO.m39534Tl(Function1.this, obj3);
                    return m39534Tl;
                }
            }));
            i = i4;
        }
        this.f82104p = arrayList2;
        this.f82105q = (LottieAnimationView) C40788fB0.m41779c(activity, C36360Uh4.lottieAnimation);
        this.f82106r = (TextView) C40788fB0.m41779c(activity, C36360Uh4.couponBanner);
        this.f82107s = (TextView) C40788fB0.m41779c(activity, C36360Uh4.winnerLabel);
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f82108t = m25409g;
        SwipeUpToSubmitLayout swipeUpToSubmitLayout = (SwipeUpToSubmitLayout) C40788fB0.m41779c(activity, C36360Uh4.submit_layout);
        swipeUpToSubmitLayout.setOnSubmitCallback(new C20842f());
        this.f82109u = swipeUpToSubmitLayout;
    }

    /* renamed from: Tl */
    public static final Integer m39534Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: Vl */
    public static final Integer m39530Vl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: Wl */
    public static final void m39529Wl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Xl */
    public static final void m39526Xl(C20835gO this$0, ValueAnimator it) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        TextView textView = this$0.f82107s;
        if (this$0.f82105q.m53546r() >= 356) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: C2 */
    public void mo39543C2(String merchantName) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        String string = getActivity().getString(C45871nl4.merchant_input_name_prefix, merchantName);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…ame_prefix, merchantName)");
        SpannableString spannableString = new SpannableString(string);
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, merchantName, 0, false, 6, (Object) null);
        spannableString.setSpan(this.f82090b, indexOf$default, merchantName.length() + indexOf$default, 17);
        spannableString.setSpan(this.f82091c, indexOf$default, merchantName.length() + indexOf$default, 17);
        this.f82094f.setText(spannableString);
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: D9 */
    public void mo39542D9(String amount, int i) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        SpannableString spannableString = new SpannableString(amount);
        spannableString.setSpan(this.f82092d, 0, amount.length() - i, 34);
        spannableString.setSpan(this.f82093e, amount.length() - i, amount.length(), 17);
        this.f82095g.setText(spannableString);
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: Ef */
    public Observable<Integer> mo39541Ef() {
        return this.f82101m;
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: Fe */
    public void mo39540Fe(String discountText) {
        Intrinsics.checkNotNullParameter(discountText, "discountText");
        m39532Ul();
        this.f82096h.setText(getActivity().getString(C45871nl4.merchant_pay_discount_label, discountText));
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: Lh */
    public void mo39539Lh(List<String> tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (tips.size() != 3) {
            return;
        }
        int i = 0;
        for (Object obj : tips) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            this.f82099k.get(i).setText((String) obj);
            i = i2;
        }
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: Uh */
    public void mo39533Uh() {
        getActivity().m58961d0();
        C49520tu6.m11233r(this.f82105q);
        this.f82105q.setMaxFrame(260);
        this.f82105q.m53539y();
        this.f82105q.m53554j(new ValueAnimator.AnimatorUpdateListener() { // from class: fO
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C20835gO.m39526Xl(C20835gO.this, valueAnimator);
            }
        });
    }

    /* renamed from: Ul */
    public final void m39532Ul() {
        this.f82105q.setMaxFrame(442);
        if (!this.f82105q.m53544t()) {
            this.f82105q.m53539y();
        }
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: V2 */
    public Observable<Unit> mo39531V2() {
        return C44626lf5.m27017c(this.f82102n, 100L);
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: X1 */
    public void mo39528X1(boolean z) {
        int i;
        LinearLayout linearLayout = this.f82097i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: Xk */
    public void mo39527Xk(boolean z) {
        this.f82109u.setSubmitEnabled(z);
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: cd */
    public Observable<Unit> mo39525cd() {
        return C45832nh5.m23307i(new C20837b());
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: ea */
    public void mo39524ea() {
        getActivity().invalidateOptionsMenu();
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: fa */
    public void mo39523fa() {
        getActivity().m58958i0();
        this.f82109u.setVisibility(0);
        C49520tu6.m11239l(this.f82105q);
        this.f82105q.m53552l();
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: jf */
    public void mo39522jf() {
        m39532Ul();
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: r2 */
    public void mo39521r2(List<String> tipHints) {
        boolean isBlank;
        float f;
        int i;
        Intrinsics.checkNotNullParameter(tipHints, "tipHints");
        int i2 = 0;
        if (tipHints.size() != 3) {
            C12055c.m65805a(this.f82097i);
            for (Object obj : this.f82100l) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                TextView view = (TextView) obj;
                this.f82099k.get(i2).setTranslationY(0.0f);
                view.setText((CharSequence) null);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                view.setVisibility(8);
                i2 = i3;
            }
            return;
        }
        C12055c.m65805a(this.f82097i);
        int i4 = 0;
        for (Object obj2 : tipHints) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj2;
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            boolean z = !isBlank;
            TextView textView = this.f82099k.get(i4);
            if (z) {
                f = -C40788fB0.m41780b(getActivity(), 6.0f);
            } else {
                f = 0.0f;
            }
            textView.setTranslationY(f);
            this.f82100l.get(i4).setText(str);
            TextView textView2 = this.f82100l.get(i4);
            Intrinsics.checkNotNullExpressionValue(textView2, "tipHintTextViews[index]");
            TextView textView3 = textView2;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView3.setVisibility(i);
            i4 = i5;
        }
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: rb */
    public void mo39520rb(String couponDescription) {
        Intrinsics.checkNotNullParameter(couponDescription, "couponDescription");
        C49520tu6.m11233r(this.f82106r);
        this.f82106r.setText(getActivity().getString(C45871nl4.merchant_input_coupon_will_apply, couponDescription));
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: s1 */
    public Observable<Unit> mo39519s1() {
        return this.f82108t;
    }

    @Override // p000.InterfaceC12377bO
    /* renamed from: th */
    public Observable<Integer> mo39518th() {
        Observable<Integer> merge = Observable.merge(this.f82104p);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(numpadButtonsClicks)");
        return merge;
    }
}
