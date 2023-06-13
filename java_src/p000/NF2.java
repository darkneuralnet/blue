package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0017\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\bD\u0010EJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0016J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0003H\u0016R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010-\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00107\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00109\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u0010;\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010=\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00102R\u0014\u0010?\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u0014\u0010A\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00102¨\u0006F"}, m28432d2 = {"LNF2;", "LxE;", "LKF2;", "", "minAge", "", "flavorName", "termsHtml", "privacyPolicyHtml", "", C12452bb.f57736a, "Lio/reactivex/Observable;", "", "S1", "checked", "xk", "email", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "l3", "yf", "hk", "show", "df", "V3", "agreement", "h1", "n0", "X0", "E0", "bf", "T6", "Lu22;", "Rl", "errorRes", "H8", "Lj4;", "b", "Lj4;", "binding", "c", "Z", "y7", "()Z", "Tl", "(Z)V", "inEmailEntryMode", DateTokenConverter.CONVERTER_KEY, "optInCheckboxShown", "Landroid/animation/ObjectAnimator;", "e", "Landroid/animation/ObjectAnimator;", "emailAgreementTextFadeIn", "f", "emailOptInFadeIn", "g", "rideButtonFadeIn", "h", "toolbarFadeIn", "i", "thirdPartyContainerSlideUp", "j", "thirdPartyContainerFadeout", "k", "thirdPartyContainerSlideDown", "l", "thirdPartyContainerFadeIn", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lj4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMagicLinkIntroUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagicLinkIntroUi.kt\nco/bird/android/app/feature/magiclink/MagicLinkIntroUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n44#2:286\n180#3:287\n1#4:288\n*S KotlinDebug\n*F\n+ 1 MagicLinkIntroUi.kt\nco/bird/android/app/feature/magiclink/MagicLinkIntroUiImpl\n*L\n91#1:286\n91#1:287\n*E\n"})
/* renamed from: NF2 */
/* loaded from: classes2.dex */
public final class NF2 extends AbstractC30071xE implements KF2 {

    /* renamed from: b */
    public final C24695j4 f24330b;

    /* renamed from: c */
    public boolean f24331c;

    /* renamed from: d */
    public boolean f24332d;

    /* renamed from: e */
    public final ObjectAnimator f24333e;

    /* renamed from: f */
    public final ObjectAnimator f24334f;

    /* renamed from: g */
    public final ObjectAnimator f24335g;

    /* renamed from: h */
    public final ObjectAnimator f24336h;

    /* renamed from: i */
    public final ObjectAnimator f24337i;

    /* renamed from: j */
    public final ObjectAnimator f24338j;

    /* renamed from: k */
    public final ObjectAnimator f24339k;

    /* renamed from: l */
    public final ObjectAnimator f24340l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NF2$a */
    /* loaded from: classes2.dex */
    public static final class C5522a extends Lambda implements Function1<String, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f24342h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5522a(BaseActivity baseActivity) {
            super(1);
            this.f24342h = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            CharSequence trim;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            trim = StringsKt__StringsKt.trim((CharSequence) it);
            if (!C45097mS5.m25598h(trim.toString())) {
                TextInputEditText textInputEditText = NF2.this.f24330b.f92067e;
                Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.emailEditor");
                TextInputLayout m87233b = R91.m87233b(textInputEditText);
                if (m87233b == null) {
                    return;
                }
                m87233b.setError(this.f24342h.getText(C45871nl4.error_invalid_email));
                return;
            }
            TextInputEditText textInputEditText2 = NF2.this.f24330b.f92067e;
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "binding.emailEditor");
            TextInputLayout m87233b2 = R91.m87233b(textInputEditText2);
            if (m87233b2 == null) {
                return;
            }
            m87233b2.setError(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"LNF2$b;", "Landroid/view/animation/Interpolator;", "", "input", "getInterpolation", "<init>", "(LNF2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NF2$b  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class animationInterpolatorC5523b implements Interpolator {
        public animationInterpolatorC5523b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return 1 - f;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NF2$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NF2$c */
    /* loaded from: classes2.dex */
    public static final class C5524c extends AnimatorListenerAdapter {
        public C5524c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            LinearLayout linearLayout = NF2.this.f24330b.f92081s;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.thirdPartyContainer");
            C49520tu6.m11233r(linearLayout);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NF2$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NF2$d */
    /* loaded from: classes2.dex */
    public static final class C5525d extends AnimatorListenerAdapter {
        public C5525d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            TextView textView = NF2.this.f24330b.f92066d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.emailAgreementText");
            C49520tu6.m11239l(textView);
            CheckBox checkBox = NF2.this.f24330b.f92070h;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.emailOptIn");
            C49520tu6.m11239l(checkBox);
            Button button = NF2.this.f24330b.f92079q;
            Intrinsics.checkNotNullExpressionValue(button, "binding.rideButton");
            C49520tu6.m11239l(button);
            Toolbar toolbar = NF2.this.f24330b.f92082t;
            Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
            C49520tu6.m11239l(toolbar);
            NF2.this.m94133n0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NF2$e", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NF2$e */
    /* loaded from: classes2.dex */
    public static final class C5526e extends AnimatorListenerAdapter {
        public C5526e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            LinearLayout linearLayout = NF2.this.f24330b.f92081s;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.thirdPartyContainer");
            C49520tu6.m11239l(linearLayout);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NF2$f", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NF2$f */
    /* loaded from: classes2.dex */
    public static final class C5527f extends AnimatorListenerAdapter {
        public C5527f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            TextView textView = NF2.this.f24330b.f92066d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.emailAgreementText");
            C49520tu6.m11233r(textView);
            CheckBox checkBox = NF2.this.f24330b.f92070h;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.emailOptIn");
            C49520tu6.show$default(checkBox, NF2.this.f24332d, 0, 2, null);
            Button button = NF2.this.f24330b.f92079q;
            Intrinsics.checkNotNullExpressionValue(button, "binding.rideButton");
            C49520tu6.m11233r(button);
            Toolbar toolbar = NF2.this.f24330b.f92082t;
            Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
            C49520tu6.m11233r(toolbar);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NF2$g */
    /* loaded from: classes2.dex */
    public static final class C5528g extends Lambda implements Function1<Unit, String> {
        public C5528g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            CharSequence trim;
            Intrinsics.checkNotNullParameter(it, "it");
            trim = StringsKt__StringsKt.trim((CharSequence) String.valueOf(NF2.this.f24330b.f92067e.getText()));
            return trim.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NF2(BaseActivity activity, C24695j4 binding) {
        super(activity);
        ObjectAnimator m92589a;
        ObjectAnimator m92589a2;
        ObjectAnimator m92589a3;
        ObjectAnimator m92589a4;
        ObjectAnimator m92587c;
        ObjectAnimator m92588b;
        ObjectAnimator m92587c2;
        ObjectAnimator m92589a5;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f24330b = binding;
        TextView textView = binding.f92066d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.emailAgreementText");
        m92589a = OF2.m92589a(textView);
        this.f24333e = m92589a;
        CheckBox checkBox = binding.f92070h;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.emailOptIn");
        m92589a2 = OF2.m92589a(checkBox);
        this.f24334f = m92589a2;
        Button button = binding.f92079q;
        Intrinsics.checkNotNullExpressionValue(button, "binding.rideButton");
        m92589a3 = OF2.m92589a(button);
        this.f24335g = m92589a3;
        Toolbar toolbar = binding.f92082t;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        m92589a4 = OF2.m92589a(toolbar);
        this.f24336h = m92589a4;
        LinearLayout linearLayout = binding.f92081s;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.thirdPartyContainer");
        m92587c = OF2.m92587c(linearLayout, -binding.f92081s.getBottom());
        this.f24337i = m92587c;
        LinearLayout linearLayout2 = binding.f92081s;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.thirdPartyContainer");
        m92588b = OF2.m92588b(linearLayout2);
        this.f24338j = m92588b;
        LinearLayout linearLayout3 = binding.f92081s;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.thirdPartyContainer");
        m92587c2 = OF2.m92587c(linearLayout3, binding.f92081s.getTop());
        this.f24339k = m92587c2;
        LinearLayout linearLayout4 = binding.f92081s;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.thirdPartyContainer");
        m92589a5 = OF2.m92589a(linearLayout4);
        this.f24340l = m92589a5;
        binding.f92082t.setTitle(C45871nl4.magic_link_intro_activity_title);
        String string = activity.getResources().getString(C45871nl4.general_start_riding_update);
        Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getSt…eral_start_riding_update)");
        binding.f92064b.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = binding.f92064b;
        Resources resources = activity.getResources();
        int i = C45278ml4.magic_link_intro_agreement;
        textView2.setText(Html.fromHtml(resources.getString(i, string)));
        binding.f92066d.setMovementMethod(LinkMovementMethod.getInstance());
        binding.f92066d.setText(Html.fromHtml(activity.getResources().getString(i, string)));
        binding.f92067e.clearFocus();
        TextInputEditText textInputEditText = binding.f92067e;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.emailEditor");
        Observable textChanges$default = C44626lf5.textChanges$default(textInputEditText, 500, false, 2, null);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(activity);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = textChanges$default.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5522a c5522a = new C5522a(activity);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: LF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                NF2._init_$lambda$0(Function1.this, obj);
            }
        });
    }

    /* renamed from: Sl */
    public static final String m94144Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.KF2
    /* renamed from: C */
    public void mo94151C(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f24330b.f92067e.setText(email);
    }

    @Override // p000.KF2
    /* renamed from: E0 */
    public String mo94150E0() {
        if (mo94131y7()) {
            return this.f24330b.f92070h.getText().toString();
        }
        return this.f24330b.f92075m.getText().toString();
    }

    @Override // p000.KF2
    /* renamed from: H8 */
    public void mo94149H8(int i) {
        TextInputEditText textInputEditText = this.f24330b.f92067e;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.emailEditor");
        TextInputLayout m87233b = R91.m87233b(textInputEditText);
        if (m87233b == null) {
            return;
        }
        m87233b.setError(getActivity().getString(i));
    }

    @Override // p000.KF2
    /* renamed from: Rl */
    public AbstractC49595u22<Boolean> emailEditorFocuses() {
        TextInputEditText textInputEditText = this.f24330b.f92067e;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.emailEditor");
        return C45219mf5.m25213b(textInputEditText);
    }

    @Override // p000.KF2
    /* renamed from: S1 */
    public Observable<Boolean> mo94145S1() {
        CheckBox checkBox = this.f24330b.f92075m;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.optIn");
        AbstractC49595u22<Boolean> m96513a = C34228Le5.m96513a(checkBox);
        CheckBox checkBox2 = this.f24330b.f92070h;
        Intrinsics.checkNotNullExpressionValue(checkBox2, "binding.emailOptIn");
        Observable<Boolean> merge = Observable.merge(m96513a, C34228Le5.m96513a(checkBox2));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(binding.optIn.chec…ilOptIn.checkedChanges())");
        return merge;
    }

    @Override // p000.KF2
    /* renamed from: T6 */
    public Observable<Unit> mo94143T6() {
        Button button = this.f24330b.f92072j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.googleButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Tl */
    public void m94142Tl(boolean z) {
        this.f24331c = z;
    }

    @Override // p000.KF2
    /* renamed from: V3 */
    public Observable<Unit> mo94141V3() {
        Button button = this.f24330b.f92078p;
        Intrinsics.checkNotNullExpressionValue(button, "binding.reportButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.KF2
    /* renamed from: X0 */
    public boolean mo94140X0() {
        if (mo94131y7()) {
            return this.f24330b.f92070h.isChecked();
        }
        return this.f24330b.f92075m.isChecked();
    }

    @Override // p000.KF2
    /* renamed from: bb */
    public void mo94139bb(int i, String flavorName, String termsHtml, String privacyPolicyHtml) {
        Intrinsics.checkNotNullParameter(flavorName, "flavorName");
        Intrinsics.checkNotNullParameter(termsHtml, "termsHtml");
        Intrinsics.checkNotNullParameter(privacyPolicyHtml, "privacyPolicyHtml");
        Spanned fromHtml = Html.fromHtml(getActivity().getResources().getString(C45871nl4.agree_accept, Integer.valueOf(i), flavorName, termsHtml, privacyPolicyHtml));
        this.f24330b.f92064b.setText(fromHtml);
        this.f24330b.f92064b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f24330b.f92066d.setText(fromHtml);
        this.f24330b.f92066d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p000.KF2
    /* renamed from: bf */
    public void mo94138bf(boolean z) {
        Button button = this.f24330b.f92072j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.googleButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.KF2
    /* renamed from: df */
    public void mo94137df(boolean z) {
        View view = this.f24330b.f92071i;
        Intrinsics.checkNotNullExpressionValue(view, "binding.fadingEdge");
        C49520tu6.show$default(view, z, 0, 2, null);
        Button button = this.f24330b.f92078p;
        Intrinsics.checkNotNullExpressionValue(button, "binding.reportButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.KF2
    /* renamed from: h1 */
    public void mo94136h1(boolean z, String str) {
        Unit unit;
        if (str != null) {
            this.f24330b.f92070h.setText(str);
            this.f24330b.f92075m.setText(str);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            CheckBox checkBox = this.f24330b.f92070h;
            BaseActivity activity = getActivity();
            int i = C45871nl4.communication_opt_in_string_backup;
            checkBox.setText(activity.getString(i));
            this.f24330b.f92075m.setText(getActivity().getString(i));
        }
        CheckBox checkBox2 = this.f24330b.f92075m;
        Intrinsics.checkNotNullExpressionValue(checkBox2, "binding.optIn");
        C49520tu6.show$default(checkBox2, z, 0, 2, null);
        this.f24332d = z;
    }

    @Override // p000.KF2
    /* renamed from: hk */
    public Observable<String> mo94135hk() {
        Button button = this.f24330b.f92079q;
        Intrinsics.checkNotNullExpressionValue(button, "binding.rideButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C5528g c5528g = new C5528g();
        Observable<String> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: MF2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m94144Sl;
                m94144Sl = NF2.m94144Sl(Function1.this, obj);
                return m94144Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onRideButto…t.toString().trim() }\n  }");
        return map;
    }

    @Override // p000.KF2
    /* renamed from: l3 */
    public void mo94134l3() {
        m94142Tl(true);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet.setDuration(200L);
        T81 t81 = T81.f34830c;
        animatorSet.setInterpolator(t81.mo84276b());
        animatorSet.addListener(new C5526e());
        animatorSet.playTogether(this.f24338j, this.f24337i);
        animatorSet.start();
        animatorSet2.setDuration(1000L);
        animatorSet2.setInterpolator(t81.mo84276b());
        animatorSet2.addListener(new C5527f());
        animatorSet2.playTogether(this.f24336h, this.f24333e, this.f24334f, this.f24335g);
        animatorSet2.start();
    }

    /* renamed from: n0 */
    public void m94133n0() {
        TextInputEditText textInputEditText = this.f24330b.f92067e;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.emailEditor");
        R91.m87234a(textInputEditText);
    }

    @Override // p000.KF2
    /* renamed from: xk */
    public void mo94132xk(boolean z) {
        this.f24330b.f92075m.setChecked(z);
        this.f24330b.f92070h.setChecked(z);
    }

    @Override // p000.KF2
    /* renamed from: y7 */
    public boolean mo94131y7() {
        return this.f24331c;
    }

    @Override // p000.KF2
    /* renamed from: yf */
    public void mo94130yf() {
        m94142Tl(false);
        this.f24330b.f92067e.clearFocus();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(T81.f34830c.mo84276b());
        animatorSet.addListener(new C5524c());
        animatorSet.playTogether(this.f24339k, this.f24340l);
        animatorSet.start();
        animatorSet2.setDuration(100L);
        animatorSet2.setInterpolator(new animationInterpolatorC5523b());
        animatorSet2.addListener(new C5525d());
        animatorSet2.playTogether(this.f24336h, this.f24333e, this.f24334f, this.f24335g);
        animatorSet2.start();
    }
}
