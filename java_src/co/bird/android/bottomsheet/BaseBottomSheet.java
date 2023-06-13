package co.bird.android.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BirdPaymentKt;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.widget.behavior.LockableBottomSheetBehavior;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001L\b&\u0018\u0000 (*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001-B\u0011\b\u0016\u0012\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mB\u0019\b\u0016\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bl\u0010nB!\b\u0016\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010o\u001a\u00020\u0014¢\u0006\u0004\bl\u0010pJ\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0014\u0010\u0016\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017H&J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u0006\u0010\u0002\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0007J\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fJ\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!J\u0016\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!J\u000e\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0014J\u0010\u0010*\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u0005J\u0006\u0010+\u001a\u00020\u0007R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R*\u0010;\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R:\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00172\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR8\u0010G\u001a&\u0012\f\u0012\n D*\u0004\u0018\u00010\u00140\u0014 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00010\u00140\u0014\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010K\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u00000H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\u0016\u0010W\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00106R\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R!\u0010c\u001a\u0012\u0012\f\u0012\n D*\u0004\u0018\u00010!0!\u0018\u00010`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0013\u0010f\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010i\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006q"}, m28432d2 = {"Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "T", "Landroid/widget/LinearLayout;", "Lj00;", "", "S", "", "N", "Landroid/util/AttributeSet;", "attrs", "z", "", "newElevation", "o", "degrees", "q", "J", "M", "Landroidx/recyclerview/widget/RecyclerView;", "", "bottomSheetState", "B", "LwZ;", "A", "D", "onAttachedToWindow", "y", "U", "V", "W", "Lio/reactivex/Observable;", "s", "Landroid/view/View;", "itemView", "X", "", "key", "n", "additionalPeekHeight", "m", "animateImmediately", "t", "K", "LHp6;", "b", "LHp6;", "binding", "LYP3;", "c", "LYP3;", "peekHelper", "value", DateTokenConverter.CONVERTER_KEY, "I", "getPeekHeight", "()I", "setPeekHeight", "(I)V", "peekHeight", "e", "LwZ;", "v", "()LwZ;", "setBottomSheetAdapter", "(LwZ;)V", "bottomSheetAdapter", "Lcd4;", "kotlin.jvm.PlatformType", "f", "Lcd4;", "stateChangeRequestQueue", "Lio/reactivex/subjects/d;", "g", "Lio/reactivex/subjects/d;", "clickSubject", "co/bird/android/bottomsheet/BaseBottomSheet$i", "h", "Lco/bird/android/bottomsheet/BaseBottomSheet$i;", "peekHeightUpdateRunnable", "Landroid/animation/ValueAnimator;", "i", "Landroid/animation/ValueAnimator;", "elevationAnimator", "j", "rotationAnimator", "k", "bottomViewId", "Landroid/os/Handler;", "l", "Landroid/os/Handler;", "uiThreadHandler", "Lg46$b;", "w", "()Lg46$b;", "logger", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "u", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "x", "()Ljava/lang/Integer;", TransferTable.COLUMN_STATE, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Z", "isHidden", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBottomSheet.kt\nco/bird/android/bottomsheet/BaseBottomSheet\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 6 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,427:1\n9#2,4:428\n9#2,4:433\n1#3:432\n41#4:437\n41#4:441\n237#5:438\n180#5:442\n52#6,2:439\n*S KotlinDebug\n*F\n+ 1 BaseBottomSheet.kt\nco/bird/android/bottomsheet/BaseBottomSheet\n*L\n91#1:428,4\n101#1:433,4\n237#1:437\n161#1:441\n237#1:438\n161#1:442\n152#1:439,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseBottomSheet<T extends BottomSheetButton> extends LinearLayout {

    /* renamed from: m */
    public static final C14428b f63014m = new C14428b(null);

    /* renamed from: b */
    public final C33392Hp6 f63015b;

    /* renamed from: c */
    public final YP3 f63016c;

    /* renamed from: d */
    public int f63017d;

    /* renamed from: e */
    public AbstractC29912wZ<? extends T> f63018e;

    /* renamed from: f */
    public final C39251cd4<Integer> f63019f;

    /* renamed from: g */
    public final C24558d<T> f63020g;

    /* renamed from: h */
    public final RunnableC14435i f63021h;

    /* renamed from: i */
    public ValueAnimator f63022i;

    /* renamed from: j */
    public ValueAnimator f63023j;

    /* renamed from: k */
    public int f63024k;

    /* renamed from: l */
    public final Handler f63025l;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "Lco/bird/android/model/BottomSheetButton;", "height", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$a */
    /* loaded from: classes2.dex */
    public static final class C14427a extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BaseBottomSheet<T> f63026g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14427a(BaseBottomSheet<T> baseBottomSheet) {
            super(1);
            this.f63026g = baseBottomSheet;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.f63026g.setPeekHeight(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/bottomsheet/BaseBottomSheet$b;", "", "", "PULL_ARROW_ELEVATION_DP", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$b */
    /* loaded from: classes2.dex */
    public static final class C14428b {
        public /* synthetic */ C14428b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14428b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/bottomsheet/BaseBottomSheet$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$c */
    /* loaded from: classes2.dex */
    public static final class C14429c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ BaseBottomSheet<T> f63027a;

        /* renamed from: b */
        public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f63028b;

        public C14429c(BaseBottomSheet<T> baseBottomSheet, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.f63027a = baseBottomSheet;
            this.f63028b = animatorUpdateListener;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            BaseBottomSheet<T> baseBottomSheet = this.f63027a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(baseBottomSheet.f63015b.f13919b.getAlpha(), 1.0f);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f63028b;
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(animatorUpdateListener);
            baseBottomSheet.f63023j = ofFloat;
            ValueAnimator valueAnimator = this.f63027a.f63023j;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "LOZ;", "it", "", C17296a.f69688o, "(LOZ;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$d */
    /* loaded from: classes2.dex */
    public static final class C14430d extends Lambda implements Function1<AbstractC6031OZ, Boolean> {

        /* renamed from: g */
        public static final C14430d f63029g = new C14430d();

        public C14430d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC6031OZ it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C43051j00);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "LOZ;", "it", "Lj00;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LOZ;)Lj00;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$e */
    /* loaded from: classes2.dex */
    public static final class C14431e extends Lambda implements Function1<AbstractC6031OZ, C43051j00> {

        /* renamed from: g */
        public static final C14431e f63030g = new C14431e();

        public C14431e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C43051j00 invoke(AbstractC6031OZ it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (C43051j00) it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u000026\u0010\u0006\u001a2\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005 \u0004*\u0018\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "Lkotlin/Pair;", "Lj00;", "kotlin.jvm.PlatformType", "Ldt4;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$f */
    /* loaded from: classes2.dex */
    public static final class C14432f extends Lambda implements Function1<Pair<? extends C43051j00, ? extends C40021dt4>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BaseBottomSheet<T> f63031g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14432f(BaseBottomSheet<T> baseBottomSheet) {
            super(1);
            this.f63031g = baseBottomSheet;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C43051j00, ? extends C40021dt4> pair) {
            invoke2((Pair<C43051j00, C40021dt4>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Pair<C43051j00, C40021dt4> pair) {
            C43051j00 bottomSheetEvent = pair.component1();
            C40021dt4 component2 = pair.component2();
            BaseBottomSheet<T> baseBottomSheet = this.f63031g;
            Intrinsics.checkNotNullExpressionValue(bottomSheetEvent, "bottomSheetEvent");
            if (baseBottomSheet.m59083S(bottomSheetEvent)) {
                BottomSheetBehavior<View> m59057u = this.f63031g.m59057u();
                LockableBottomSheetBehavior lockableBottomSheetBehavior = m59057u instanceof LockableBottomSheetBehavior ? (LockableBottomSheetBehavior) m59057u : null;
                if (lockableBottomSheetBehavior != null) {
                    lockableBottomSheetBehavior.m54240D0(false);
                }
                FrameLayout frameLayout = this.f63031g.f63015b.f13920c;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.arrowContainer");
                C49520tu6.show$default(frameLayout, false, 0, 2, null);
            } else {
                BottomSheetBehavior<View> m59057u2 = this.f63031g.m59057u();
                LockableBottomSheetBehavior lockableBottomSheetBehavior2 = m59057u2 instanceof LockableBottomSheetBehavior ? (LockableBottomSheetBehavior) m59057u2 : null;
                if (lockableBottomSheetBehavior2 != null) {
                    lockableBottomSheetBehavior2.m54240D0(true);
                }
                FrameLayout frameLayout2 = this.f63031g.f63015b.f13920c;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.arrowContainer");
                C49520tu6.show$default(frameLayout2, true, 0, 2, null);
                boolean z = !component2.m43549a().canScrollVertically(-1);
                float f = 0.0f;
                if (bottomSheetEvent.m31275c() == 3) {
                    if (!z) {
                        Context context = this.f63031g.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        f = C49347td3.m12002a(2, context);
                    }
                    this.f63031g.m59061q(180.0f);
                    this.f63031g.m59063o(f);
                } else if (bottomSheetEvent.m31275c() != 3) {
                    this.f63031g.m59061q(0.0f);
                    this.f63031g.m59063o(0.0f);
                }
                this.f63031g.f63015b.f13919b.invalidate();
            }
            if (C3161HZ.m103747a(bottomSheetEvent.m31275c())) {
                this.f63031g.m59091K();
                return;
            }
            BaseBottomSheet<T> baseBottomSheet2 = this.f63031g;
            baseBottomSheet2.removeCallbacks(baseBottomSheet2.f63021h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "T", "Lco/bird/android/model/BottomSheetButton;", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$g */
    /* loaded from: classes2.dex */
    public static final class C14433g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14433g f63032g = new C14433g();

        public C14433g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$h */
    /* loaded from: classes2.dex */
    public static final class C14434h<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C14434h<T1, T2, R> f63033a = new C14434h<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"co/bird/android/bottomsheet/BaseBottomSheet$i", "Ljava/lang/Runnable;", "", "run", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$i */
    /* loaded from: classes2.dex */
    public static final class RunnableC14435i implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ BaseBottomSheet<T> f63034b;

        public RunnableC14435i(BaseBottomSheet<T> baseBottomSheet) {
            this.f63034b = baseBottomSheet;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            BottomSheetBehavior<View> m59057u = this.f63034b.m59057u();
            boolean z2 = true;
            if (m59057u != null && m59057u.m50128L() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.f63034b.f63015b.f13920c.isInLayout()) {
                this.f63034b.post(this);
            }
            BottomSheetBehavior<View> m59057u2 = this.f63034b.m59057u();
            if (m59057u2 == null || m59057u2.m50128L() != 5) {
                z2 = false;
            }
            if (z2) {
                C41318g46.m40163a("state collapsed being invoked by peek runnable", new Object[0]);
                BottomSheetBehavior<View> m59057u3 = this.f63034b.m59057u();
                if (m59057u3 != null) {
                    m59057u3.m50082p0(4);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"co/bird/android/bottomsheet/BaseBottomSheet$j", "Ly0;", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$j */
    /* loaded from: classes2.dex */
    public static final class C14436j extends AbstractC30391y0 {
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$k */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C14437k extends FunctionReferenceImpl implements Function1<T, Unit> {
        public C14437k(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m59048a(T p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m59048a((BottomSheetButton) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "LOZ;", "it", "", C17296a.f69688o, "(LOZ;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$l */
    /* loaded from: classes2.dex */
    public static final class C14438l extends Lambda implements Function1<AbstractC6031OZ, Boolean> {

        /* renamed from: g */
        public static final C14438l f63035g = new C14438l();

        public C14438l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC6031OZ it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C43051j00);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "LOZ;", "it", "Lj00;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LOZ;)Lj00;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$m */
    /* loaded from: classes2.dex */
    public static final class C14439m extends Lambda implements Function1<AbstractC6031OZ, C43051j00> {

        /* renamed from: g */
        public static final C14439m f63036g = new C14439m();

        public C14439m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C43051j00 invoke(AbstractC6031OZ it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (C43051j00) it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "Lj00;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lj00;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$n */
    /* loaded from: classes2.dex */
    public static final class C14440n extends Lambda implements Function1<C43051j00, Boolean> {

        /* renamed from: g */
        public static final C14440n f63037g = new C14440n();

        public C14440n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C43051j00 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m31275c() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "", "settling", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$o */
    /* loaded from: classes2.dex */
    public static final class C14441o extends Lambda implements Function1<Boolean, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ BaseBottomSheet<T> f63038g;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "", "newState", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Integer;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.bottomsheet.BaseBottomSheet$o$a */
        /* loaded from: classes2.dex */
        public static final class C14442a extends Lambda implements Function1<Integer, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ BaseBottomSheet<T> f63039g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14442a(BaseBottomSheet<T> baseBottomSheet) {
                super(1);
                this.f63039g = baseBottomSheet;
            }

            /* renamed from: c */
            public static final void m59040c(BaseBottomSheet this$0, Integer newState) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(newState, "$newState");
                BottomSheetBehavior<View> m59057u = this$0.m59057u();
                if (m59057u != null) {
                    m59057u.m50082p0(newState.intValue());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23496h invoke(final Integer newState) {
                Intrinsics.checkNotNullParameter(newState, "newState");
                C41318g46.m40163a("Processing state change request from queue: " + newState, new Object[0]);
                final BaseBottomSheet<T> baseBottomSheet = this.f63039g;
                return AbstractC23461c.m33076J(new Runnable() { // from class: kz
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseBottomSheet.C14441o.C14442a.m59040c(BaseBottomSheet.this, newState);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14441o(BaseBottomSheet<T> baseBottomSheet) {
            super(1);
            this.f63038g = baseBottomSheet;
        }

        /* renamed from: b */
        public static final InterfaceC23496h m59043b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean settling) {
            Intrinsics.checkNotNullParameter(settling, "settling");
            if (settling.booleanValue()) {
                C41318g46.m40163a("bottom sheet is settling, so queue any requests to change state for now", new Object[0]);
                return AbstractC23461c.m33039p();
            }
            C41318g46.m40163a("bottom sheet is settled, accepting any requests to change state", new Object[0]);
            AbstractC24490k m32111s0 = this.f63038g.f63019f.distinctUntilChanged().toFlowable(EnumC23460b.LATEST).m32111s0(C23454a.m33087a());
            final C14442a c14442a = new C14442a(this.f63038g);
            return m32111s0.m32162Z(new InterfaceC23492o() { // from class: jz
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m59043b;
                    m59043b = BaseBottomSheet.C14441o.m59043b(Function1.this, obj);
                    return m59043b;
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBottomSheet(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_base_bottom_sheet, this, true);
        C33392Hp6 m103406a = C33392Hp6.m103406a(this);
        Intrinsics.checkNotNullExpressionValue(m103406a, "bind(this)");
        this.f63015b = m103406a;
        RecyclerView recyclerView = m103406a.f13921d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        YP3 yp3 = new YP3(recyclerView);
        this.f63016c = yp3;
        yp3.m75089g(new C14427a(this));
        this.f63018e = mo56204A();
        this.f63019f = C39251cd4.m61155h();
        C24558d<T> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<T>()");
        this.f63020g = m31902e;
        this.f63021h = new RunnableC14435i(this);
        this.f63025l = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m59097E(BaseBottomSheet this$0) {
        Observable observable;
        Observable<AbstractC6031OZ> m13412c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        BottomSheetBehavior<View> m59057u = this$0.m59057u();
        if (m59057u != null && (m13412c = C48927su6.m13412c(m59057u)) != null) {
            final C14430d c14430d = C14430d.f63029g;
            Observable<AbstractC6031OZ> filter = m13412c.filter(new InterfaceC23494q() { // from class: cz
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m59096F;
                    m59096F = BaseBottomSheet.m59096F(Function1.this, obj);
                    return m59096F;
                }
            });
            if (filter != null) {
                final C14431e c14431e = C14431e.f63030g;
                observable = filter.map(new InterfaceC23492o() { // from class: dz
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        C43051j00 m59095G;
                        m59095G = BaseBottomSheet.m59095G(Function1.this, obj);
                        return m59095G;
                    }
                });
                if (observable == null) {
                    observable = Observable.never();
                    Intrinsics.checkNotNullExpressionValue(observable, "never()");
                }
                RecyclerView recyclerView = this$0.f63015b.f13921d;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
                Observable combineLatest = Observable.combineLatest(observable, C37036Xe5.m76741a(recyclerView), C14434h.f63033a);
                Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
                Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
                RecyclerView recyclerView2 = this$0.f63015b.f13921d;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.recyclerView");
                ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView2);
                Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45202a));
                Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C14432f c14432f = new C14432f(this$0);
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ez
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        BaseBottomSheet.m59094H(Function1.this, obj);
                    }
                };
                final C14433g c14433g = C14433g.f63032g;
                ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: fz
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        BaseBottomSheet.m59093I(Function1.this, obj);
                    }
                });
                this$0.m59088N();
            }
        }
        observable = null;
        if (observable == null) {
        }
        RecyclerView recyclerView3 = this$0.f63015b.f13921d;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "binding.recyclerView");
        Observable combineLatest2 = Observable.combineLatest(observable, C37036Xe5.m76741a(recyclerView3), C14434h.f63033a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn2 = combineLatest2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        RecyclerView recyclerView22 = this$0.f63015b.f13921d;
        Intrinsics.checkNotNullExpressionValue(recyclerView22, "binding.recyclerView");
        ScopeProvider m45202a2 = ViewScopeProvider.m45202a(recyclerView22);
        Intrinsics.checkExpressionValueIsNotNull(m45202a2, "ViewScopeProvider.from(this)");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m45202a2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c14432f2 = new C14432f(this$0);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: ez
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseBottomSheet.m59094H(Function1.this, obj);
            }
        };
        final Function1 c14433g2 = C14433g.f63032g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: fz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseBottomSheet.m59093I(Function1.this, obj);
            }
        });
        this$0.m59088N();
    }

    /* renamed from: F */
    public static final boolean m59096F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G */
    public static final C43051j00 m59095G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C43051j00) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m59094H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m59093I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m59090L(BaseBottomSheet this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f63025l.removeCallbacksAndMessages(null);
        this$0.removeCallbacks(new RunnableC22523gz(this$0));
        this$0.removeCallbacks(this$0.f63021h);
        this$0.m59081U();
    }

    /* renamed from: O */
    public static final boolean m59087O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: P */
    public static final C43051j00 m59086P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C43051j00) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final Boolean m59085Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23496h m59084R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    public static /* synthetic */ void clearPeekViews$default(BaseBottomSheet baseBottomSheet, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearPeekViews");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseBottomSheet.m59058t(z);
    }

    /* renamed from: p */
    public static final void m59062p(BaseBottomSheet this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        FrameLayout frameLayout = this$0.f63015b.f13920c;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        C38790bq6.m62545E0(frameLayout, ((Float) animatedValue).floatValue());
        this$0.f63015b.f13920c.invalidate();
    }

    /* renamed from: r */
    public static final void m59060r(BaseBottomSheet this$0, float f, ValueAnimator anim) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        ImageView imageView = this$0.f63015b.f13919b;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        imageView.setAlpha(((Float) animatedValue).floatValue());
        this$0.f63015b.f13919b.invalidate();
        Object animatedValue2 = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        if (((Float) animatedValue2).floatValue() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this$0.f63015b.f13919b.setRotation(f);
        }
    }

    /* renamed from: A */
    public abstract AbstractC29912wZ<? extends T> mo56204A();

    /* renamed from: B */
    public final boolean m59099B(RecyclerView recyclerView, int i) {
        List listOf;
        LinearLayoutManager linearLayoutManager;
        Triple triple;
        int i2;
        boolean z;
        boolean z2;
        ViewParent parent;
        boolean z3;
        Integer valueOf = Integer.valueOf(i);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{6, 4});
        if (!BirdPaymentKt.isOneOf(valueOf, listOf)) {
            return false;
        }
        RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        float f = 0.0f;
        if (linearLayoutManager != null) {
            Integer valueOf2 = Integer.valueOf(linearLayoutManager.m66711n2());
            Integer valueOf3 = Integer.valueOf(linearLayoutManager.m66706s2());
            View m66597c0 = linearLayoutManager.m66597c0(linearLayoutManager.m66706s2());
            if (m66597c0 != null) {
                f = m66597c0.getY();
            }
            triple = new Triple(valueOf2, valueOf3, Float.valueOf(f));
        } else {
            triple = new Triple(-1, -1, Float.valueOf(0.0f));
        }
        int intValue = ((Number) triple.component1()).intValue();
        int intValue2 = ((Number) triple.component2()).intValue();
        float floatValue = ((Number) triple.component3()).floatValue();
        boolean z4 = !recyclerView.canScrollVertically(-1);
        boolean z5 = !recyclerView.canScrollVertically(1);
        RecyclerView.AbstractC11843h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i2 = adapter.getItemCount();
        } else {
            i2 = 0;
        }
        if (i2 - 1 == intValue2) {
            z = true;
        } else {
            z = false;
        }
        if (intValue == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        float y = floatValue + getY();
        Intrinsics.checkNotNull(getParent(), "null cannot be cast to non-null type android.view.ViewGroup");
        if (y <= ((ViewGroup) parent).getHeight()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z4 || !z5 || !z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m59098C() {
        Integer m59054x = m59054x();
        return m59054x != null && m59054x.intValue() == 5;
    }

    /* renamed from: D */
    public boolean mo56569D() {
        return true;
    }

    /* renamed from: J */
    public final void m59092J() {
        this.f63016c.m75088h();
    }

    /* renamed from: K */
    public final void m59091K() {
        BottomSheetBehavior<View> m59057u = m59057u();
        boolean z = false;
        if (m59057u != null && m59057u.m50128L() == 2) {
            z = true;
        }
        if (z) {
            postDelayed(new RunnableC22523gz(this), 150L);
        } else if (!m59098C()) {
            m59092J();
        } else {
            this.f63025l.removeCallbacksAndMessages(null);
            removeCallbacks(new RunnableC22523gz(this));
            removeCallbacks(this.f63021h);
            this.f63025l.post(new Runnable() { // from class: hz
                @Override // java.lang.Runnable
                public final void run() {
                    BaseBottomSheet.m59090L(BaseBottomSheet.this);
                }
            });
        }
    }

    /* renamed from: M */
    public final void m59089M() {
        C41318g46.AbstractC20723b m59055w = m59055w();
        RecyclerView.AbstractC11855p layoutManager = this.f63018e.getLayoutManager();
        m59055w.mo7228a("Setting layoutManager: " + layoutManager, new Object[0]);
        this.f63015b.f13921d.setLayoutManager(this.f63018e.getLayoutManager());
        C41318g46.AbstractC20723b m59055w2 = m59055w();
        AbstractC52206yS0 adapter = this.f63018e.getAdapter();
        m59055w2.mo7228a("Setting adapter: " + adapter, new Object[0]);
        this.f63015b.f13921d.setAdapter(this.f63018e.getAdapter());
        if (this.f63015b.f13921d.getItemAnimator() == null) {
            this.f63015b.f13921d.setItemAnimator(new C14436j());
        }
        this.f63018e.m6671b(new C14437k(this.f63020g));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0024, code lost:
        if (r0 != null) goto L9;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m59088N() {
        Observable empty;
        Observable<AbstractC6031OZ> m13412c;
        BottomSheetBehavior<View> m59057u = m59057u();
        if (m59057u != null && (m13412c = C48927su6.m13412c(m59057u)) != null) {
            final C14438l c14438l = C14438l.f63035g;
            Observable<AbstractC6031OZ> filter = m13412c.filter(new InterfaceC23494q() { // from class: iz
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m59087O;
                    m59087O = BaseBottomSheet.m59087O(Function1.this, obj);
                    return m59087O;
                }
            });
            if (filter != null) {
                final C14439m c14439m = C14439m.f63036g;
                empty = filter.map(new InterfaceC23492o() { // from class: Xy
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        C43051j00 m59086P;
                        m59086P = BaseBottomSheet.m59086P(Function1.this, obj);
                        return m59086P;
                    }
                });
            }
        }
        empty = Observable.empty();
        final C14440n c14440n = C14440n.f63037g;
        Observable observeOn = empty.map(new InterfaceC23492o() { // from class: Yy
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m59085Q;
                m59085Q = BaseBottomSheet.m59085Q(Function1.this, obj);
                return m59085Q;
            }
        }).startWith((Observable) Boolean.FALSE).distinctUntilChanged().observeOn(C24542a.m31934a());
        final C14441o c14441o = new C14441o(this);
        AbstractC23461c m33066T = observeOn.switchMapCompletable(new InterfaceC23492o() { // from class: Zy
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m59084R;
                m59084R = BaseBottomSheet.m59084R(Function1.this, obj);
                return m59084R;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "T : BottomSheetButton> :…))\n      .subscribe()\n  }");
        ScopeProvider m45202a = ViewScopeProvider.m45202a(this);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(m45202a));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: S */
    public final boolean m59083S(C43051j00 c43051j00) {
        RecyclerView recyclerView = this.f63015b.f13921d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        if (m59099B(recyclerView, c43051j00.m31275c()) && mo56569D()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final void m59082T() {
        BottomSheetBehavior<View> m59057u = m59057u();
        if (m59057u == null) {
            return;
        }
        m59057u.m50082p0(5);
    }

    /* renamed from: U */
    public final void m59081U() {
        this.f63019f.accept(5);
    }

    /* renamed from: V */
    public final void m59080V() {
        this.f63015b.f13921d.scrollToPosition(0);
        BottomSheetBehavior<View> m59057u = m59057u();
        if (m59057u != null) {
            m59057u.m50082p0(4);
        }
    }

    /* renamed from: W */
    public final void m59079W() {
        this.f63015b.f13921d.scrollToPosition(0);
        this.f63019f.accept(4);
    }

    /* renamed from: X */
    public final void m59078X(View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f63016c.m75085k(itemView);
    }

    /* renamed from: m */
    public final void m59065m(int i) {
        this.f63016c.m75094b(i);
    }

    /* renamed from: n */
    public final void m59064n(CharSequence key, View itemView) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f63016c.m75093c(key, itemView);
    }

    /* renamed from: o */
    public final void m59063o(float f) {
        boolean z;
        if (this.f63015b.f13920c.getElevation() == f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        ValueAnimator valueAnimator = this.f63022i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f63015b.f13920c.getElevation(), f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BaseBottomSheet.m59062p(BaseBottomSheet.this, valueAnimator2);
            }
        });
        this.f63022i = ofFloat;
        ofFloat.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m59089M();
        post(new Runnable() { // from class: az
            @Override // java.lang.Runnable
            public final void run() {
                BaseBottomSheet.m59097E(BaseBottomSheet.this);
            }
        });
    }

    /* renamed from: q */
    public final void m59061q(final float f) {
        boolean z;
        if (this.f63015b.f13919b.getRotation() == f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        ValueAnimator valueAnimator = this.f63023j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: Wy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BaseBottomSheet.m59060r(BaseBottomSheet.this, f, valueAnimator2);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f63015b.f13919b.getAlpha(), 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.addListener(new C14429c(this, animatorUpdateListener));
        this.f63023j = ofFloat;
        ofFloat.start();
    }

    /* renamed from: s */
    public final Observable<T> m59059s() {
        Observable<T> hide = this.f63020g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "clickSubject.hide()");
        return hide;
    }

    public final void setBottomSheetAdapter(AbstractC29912wZ<? extends T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f63018e = value;
        m59089M();
    }

    public final void setPeekHeight(int i) {
        int i2;
        boolean z;
        this.f63017d = i;
        int i3 = 0;
        m59055w().mo7228a("Setting peekHeight: " + this.f63017d, new Object[0]);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Integer num = null;
        if (!(layoutParams instanceof CoordinatorLayout.C11529e)) {
            layoutParams = null;
        }
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams;
        BottomSheetBehavior<View> m59057u = m59057u();
        if (m59057u != null) {
            int i4 = this.f63017d;
            if (c11529e != null) {
                i2 = ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin;
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            Integer valueOf = Integer.valueOf(this.f63015b.f13920c.getHeight());
            valueOf.intValue();
            if (this.f63015b.f13920c.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                num = valueOf;
            }
            if (num != null) {
                i3 = num.intValue();
            }
            m59057u.m50092k0(i5 + i3);
        }
        removeCallbacks(this.f63021h);
        post(this.f63021h);
    }

    /* renamed from: t */
    public final void m59058t(boolean z) {
        this.f63016c.m75090f(z);
    }

    /* renamed from: u */
    public final BottomSheetBehavior<View> m59057u() {
        CoordinatorLayout.Behavior behavior;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C11529e)) {
            layoutParams = null;
        }
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams;
        if (c11529e != null) {
            behavior = c11529e.m67769f();
        } else {
            behavior = null;
        }
        if (!(behavior instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) behavior;
    }

    /* renamed from: v */
    public final AbstractC29912wZ<? extends T> m59056v() {
        return this.f63018e;
    }

    /* renamed from: w */
    public final C41318g46.AbstractC20723b m59055w() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("BottomSheet");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"BottomSheet\")");
        return m40153k;
    }

    /* renamed from: x */
    public final Integer m59054x() {
        BottomSheetBehavior<View> m59057u = m59057u();
        if (m59057u != null) {
            return Integer.valueOf(m59057u.m50128L());
        }
        return null;
    }

    /* renamed from: y */
    public final int m59053y() {
        Integer num;
        int roundToInt;
        BottomSheetBehavior<View> m59057u = m59057u();
        if (m59057u != null) {
            num = Integer.valueOf(m59057u.m50128L());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 5) {
            return 0;
        }
        if (num != null && num.intValue() == 4) {
            return this.f63017d;
        }
        if (num != null && num.intValue() == 3) {
            return getHeight();
        }
        int height = getHeight();
        roundToInt = MathKt__MathJVMKt.roundToInt(getY());
        return height - roundToInt;
    }

    @SuppressLint({"CustomViewStyleable"})
    /* renamed from: z */
    public final void m59052z(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.ParallaxCollapseBehavior);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ParallaxCollapseBehavior)");
        this.f63024k = obtainStyledAttributes.getResourceId(C34290Ll4.ParallaxCollapseBehavior_behavior_bottom_toTopOf, -1);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBottomSheet(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_base_bottom_sheet, this, true);
        C33392Hp6 m103406a = C33392Hp6.m103406a(this);
        Intrinsics.checkNotNullExpressionValue(m103406a, "bind(this)");
        this.f63015b = m103406a;
        RecyclerView recyclerView = m103406a.f13921d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        YP3 yp3 = new YP3(recyclerView);
        this.f63016c = yp3;
        yp3.m75089g(new C14427a(this));
        this.f63018e = mo56204A();
        this.f63019f = C39251cd4.m61155h();
        C24558d<T> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<T>()");
        this.f63020g = m31902e;
        this.f63021h = new RunnableC14435i(this);
        this.f63025l = new Handler(Looper.getMainLooper());
        m59052z(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBottomSheet(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_base_bottom_sheet, this, true);
        C33392Hp6 m103406a = C33392Hp6.m103406a(this);
        Intrinsics.checkNotNullExpressionValue(m103406a, "bind(this)");
        this.f63015b = m103406a;
        RecyclerView recyclerView = m103406a.f13921d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        YP3 yp3 = new YP3(recyclerView);
        this.f63016c = yp3;
        yp3.m75089g(new C14427a(this));
        this.f63018e = mo56204A();
        this.f63019f = C39251cd4.m61155h();
        C24558d<T> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<T>()");
        this.f63020g = m31902e;
        this.f63021h = new RunnableC14435i(this);
        this.f63025l = new Handler(Looper.getMainLooper());
        m59052z(attrs);
    }
}
