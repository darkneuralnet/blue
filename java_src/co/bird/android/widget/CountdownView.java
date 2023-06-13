package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.format.DateUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.CountdownView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24517a;
import io.reactivex.subjects.C24554b;
import io.reactivex.subjects.C24558d;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Q2\u00020\u0001:\u0005\u0082\u0001.37B\u0011\b\u0016\u0012\u0006\u0010|\u001a\u00020{¢\u0006\u0004\b}\u0010~B\u0019\b\u0016\u0012\u0006\u0010|\u001a\u00020{\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b}\u0010\u007fB#\b\u0016\u0012\u0006\u0010|\u001a\u00020{\u0012\u0006\u0010!\u001a\u00020 \u0012\u0007\u0010\u0080\u0001\u001a\u00020\u0007¢\u0006\u0005\b}\u0010\u0081\u0001J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002JA\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002J\u0006\u0010$\u001a\u00020#J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJi\u0010(\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b(\u0010)J$\u0010*\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&J\u001c\u0010+\u001a\u00020\u001a2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\u0006\u0010,\u001a\u00020\u001aR\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00105\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00070\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010F\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010Z\u001a\u0004\u0018\u00010\u00072\b\u0010V\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010;\u001a\u0004\bX\u0010=\"\u0004\bY\u0010?R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010H\u001a\u0004\b\\\u0010J\"\u0004\b]\u0010LR.\u0010a\u001a\u0004\u0018\u00010\u00072\b\u0010V\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b^\u0010;\u001a\u0004\b_\u0010=\"\u0004\b`\u0010?R.\u0010e\u001a\u0004\u0018\u00010\u00072\b\u0010V\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010;\u001a\u0004\bc\u0010=\"\u0004\bd\u0010?R\"\u0010k\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\u000f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010r\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR*\u0010y\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u000f¨\u0006\u0083\u0001"}, m28432d2 = {"Lco/bird/android/widget/CountdownView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "v", "", "duration", "", "countUp", "Lio/reactivex/Observable;", "H", "(ILjava/lang/Boolean;Ljava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;", "durationSeconds", "I", "startingValue", "E", "timerText", "textRes", "Landroid/text/style/StyleSpan;", "timerStyleSpan", "Landroid/text/style/ForegroundColorSpan;", "textColorSpan", "", "textSize", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(Ljava/lang/String;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;)V", "seconds", "", "D", "Landroid/util/AttributeSet;", "attrs", "s", "Lio/reactivex/c;", "p", "w", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "r", "(ILjava/util/concurrent/TimeUnit;Ljava/lang/Boolean;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;)V", "setupTimer", "setupStopwatch", "x", "Lio/reactivex/subjects/b;", "b", "Lio/reactivex/subjects/b;", "countDownEndedSubject", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "remainingSeconds", "Lio/reactivex/disposables/b;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/disposables/b;", "trash", "e", "Ljava/lang/Integer;", "getTextRes", "()Ljava/lang/Integer;", "setTextRes", "(Ljava/lang/Integer;)V", "f", "Ljava/lang/String;", "getTextFormat", "()Ljava/lang/String;", "setTextFormat", "(Ljava/lang/String;)V", "textFormat", "g", "Landroid/text/style/StyleSpan;", "getTextFormatStyleSpan", "()Landroid/text/style/StyleSpan;", "setTextFormatStyleSpan", "(Landroid/text/style/StyleSpan;)V", "textFormatStyleSpan", "LR46;", "h", "LR46;", "q", "()LR46;", "setTimerState", "(LR46;)V", "timerState", "value", "i", "getTextFormatColor", "setTextFormatColor", "textFormatColor", "j", "getTimerStyleSpan", "setTimerStyleSpan", "k", "getTimerColor", "setTimerColor", "timerColor", "l", "getTimerThresholdColor", "setTimerThresholdColor", "timerThresholdColor", "m", "getTimerThreshold", "()I", "setTimerThreshold", "(I)V", "timerThreshold", "n", "J", "getTime", "()J", "setTime", "(J)V", "time", "o", "Z", "getAutoCenter", "()Z", "setAutoCenter", "(Z)V", "autoCenter", "originalGravity", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCountdownView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountdownView.kt\nco/bird/android/widget/CountdownView\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n180#2:311\n180#2:312\n180#2:313\n1#3:314\n*S KotlinDebug\n*F\n+ 1 CountdownView.kt\nco/bird/android/widget/CountdownView\n*L\n142#1:311\n170#1:312\n182#1:313\n*E\n"})
/* loaded from: classes4.dex */
public final class CountdownView extends AppCompatTextView {

    /* renamed from: q */
    public static final C16492a f67281q = new C16492a(null);

    /* renamed from: b */
    public C24554b f67282b;

    /* renamed from: c */
    public final C24558d<Integer> f67283c;

    /* renamed from: d */
    public final C23464b f67284d;

    /* renamed from: e */
    public Integer f67285e;

    /* renamed from: f */
    public String f67286f;

    /* renamed from: g */
    public StyleSpan f67287g;

    /* renamed from: h */
    public R46 f67288h;

    /* renamed from: i */
    public Integer f67289i;

    /* renamed from: j */
    public StyleSpan f67290j;

    /* renamed from: k */
    public Integer f67291k;

    /* renamed from: l */
    public Integer f67292l;

    /* renamed from: m */
    public int f67293m;

    /* renamed from: n */
    public long f67294n;

    /* renamed from: o */
    public boolean f67295o;

    /* renamed from: p */
    public int f67296p;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/CountdownView$a;", "", "", "NO_COLOR", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$a */
    /* loaded from: classes4.dex */
    public static final class C16492a {
        public /* synthetic */ C16492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16492a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/widget/CountdownView$b;", "", "Landroid/text/style/StyleSpan;", "b", "Landroid/text/style/StyleSpan;", "()Landroid/text/style/StyleSpan;", "styleSpan", "<init>", "(Ljava/lang/String;ILandroid/text/style/StyleSpan;)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$b */
    /* loaded from: classes4.dex */
    public enum EnumC16493b {
        NORMAL(null),
        BOLD(new StyleSpan(1)),
        ITALIC(new StyleSpan(2));
        

        /* renamed from: b */
        public final StyleSpan f67301b;

        EnumC16493b(StyleSpan styleSpan) {
            this.f67301b = styleSpan;
        }

        /* renamed from: b */
        public final StyleSpan m54598b() {
            return this.f67301b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/widget/CountdownView$c;", "", "LR46;", "b", "LR46;", "()LR46;", "timerState", "<init>", "(Ljava/lang/String;ILR46;)V", "c", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$c */
    /* loaded from: classes4.dex */
    public enum EnumC16494c {
        COUNT_DOWN(R46.DECREASING),
        COUNT_UP(R46.INCREASING);
        

        /* renamed from: b */
        public final R46 f67305b;

        EnumC16494c(R46 r46) {
            this.f67305b = r46;
        }

        /* renamed from: b */
        public final R46 m54596b() {
            return this.f67305b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/widget/CountdownView$d;", "", "Landroid/text/style/StyleSpan;", "b", "Landroid/text/style/StyleSpan;", "()Landroid/text/style/StyleSpan;", "styleSpan", "<init>", "(Ljava/lang/String;ILandroid/text/style/StyleSpan;)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$d */
    /* loaded from: classes4.dex */
    public enum EnumC16495d {
        NORMAL(null),
        BOLD(new StyleSpan(1)),
        ITALIC(new StyleSpan(2));
        

        /* renamed from: b */
        public final StyleSpan f67310b;

        EnumC16495d(StyleSpan styleSpan) {
            this.f67310b = styleSpan;
        }

        /* renamed from: b */
        public final StyleSpan m54594b() {
            return this.f67310b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$e */
    /* loaded from: classes4.dex */
    public static final class C16496e extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ TimeUnit f67312h;

        /* renamed from: i */
        public final /* synthetic */ Integer f67313i;

        /* renamed from: j */
        public final /* synthetic */ StyleSpan f67314j;

        /* renamed from: k */
        public final /* synthetic */ ForegroundColorSpan f67315k;

        /* renamed from: l */
        public final /* synthetic */ Float f67316l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16496e(TimeUnit timeUnit, Integer num, StyleSpan styleSpan, ForegroundColorSpan foregroundColorSpan, Float f) {
            super(1);
            this.f67312h = timeUnit;
            this.f67313i = num;
            this.f67314j = styleSpan;
            this.f67315k = foregroundColorSpan;
            this.f67316l = f;
        }

        /* renamed from: a */
        public final void m54593a(Long it) {
            CountdownView countdownView = CountdownView.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            countdownView.m54628C(countdownView.m54604v(it.longValue(), this.f67312h), this.f67313i, this.f67314j, this.f67315k, this.f67316l);
            if (this.f67312h == TimeUnit.SECONDS) {
                CountdownView.this.f67283c.onNext(Integer.valueOf((int) it.longValue()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54593a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$f */
    /* loaded from: classes4.dex */
    public static final class C16497f extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ TimeUnit f67318h;

        /* renamed from: i */
        public final /* synthetic */ Integer f67319i;

        /* renamed from: j */
        public final /* synthetic */ StyleSpan f67320j;

        /* renamed from: k */
        public final /* synthetic */ ForegroundColorSpan f67321k;

        /* renamed from: l */
        public final /* synthetic */ Float f67322l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16497f(TimeUnit timeUnit, Integer num, StyleSpan styleSpan, ForegroundColorSpan foregroundColorSpan, Float f) {
            super(1);
            this.f67318h = timeUnit;
            this.f67319i = num;
            this.f67320j = styleSpan;
            this.f67321k = foregroundColorSpan;
            this.f67322l = f;
        }

        /* renamed from: a */
        public final void m54592a(Long it) {
            CountdownView countdownView = CountdownView.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            countdownView.m54628C(countdownView.m54604v(it.longValue(), this.f67318h), this.f67319i, this.f67320j, this.f67321k, this.f67322l);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54592a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "timeLeft", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$g */
    /* loaded from: classes4.dex */
    public static final class C16498g extends Lambda implements Function1<Long, Unit> {
        public C16498g() {
            super(1);
        }

        /* renamed from: a */
        public final void m54591a(Long timeLeft) {
            CountdownView countdownView = CountdownView.this;
            Intrinsics.checkNotNullExpressionValue(timeLeft, "timeLeft");
            countdownView.setTime(timeLeft.longValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54591a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "timeLeft", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$h */
    /* loaded from: classes4.dex */
    public static final class C16499h extends Lambda implements Function1<Long, Unit> {
        public C16499h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54590a(Long timeLeft) {
            CountdownView countdownView = CountdownView.this;
            Intrinsics.checkNotNullExpressionValue(timeLeft, "timeLeft");
            countdownView.setTime(timeLeft.longValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54590a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "timeLeft", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$i */
    /* loaded from: classes4.dex */
    public static final class C16500i extends Lambda implements Function1<Long, Unit> {
        public C16500i() {
            super(1);
        }

        /* renamed from: a */
        public final void m54589a(Long timeLeft) {
            CountdownView countdownView = CountdownView.this;
            Intrinsics.checkNotNullExpressionValue(timeLeft, "timeLeft");
            countdownView.setTime(timeLeft.longValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54589a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "timeLeft", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$j */
    /* loaded from: classes4.dex */
    public static final class C16501j extends Lambda implements Function1<Long, Unit> {
        public C16501j() {
            super(1);
        }

        /* renamed from: a */
        public final void m54588a(Long timeLeft) {
            CountdownView countdownView = CountdownView.this;
            Intrinsics.checkNotNullExpressionValue(timeLeft, "timeLeft");
            countdownView.setTime(timeLeft.longValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54588a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "seconds", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$k */
    /* loaded from: classes4.dex */
    public static final class C16502k extends Lambda implements Function1<Long, Unit> {
        public C16502k() {
            super(1);
        }

        /* renamed from: a */
        public final void m54587a(Long l) {
            CountdownView.this.f67283c.onNext(Integer.valueOf((int) l.longValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54587a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "seconds", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CountdownView$l */
    /* loaded from: classes4.dex */
    public static final class C16503l extends Lambda implements Function1<Long, Unit> {
        public C16503l() {
            super(1);
        }

        /* renamed from: a */
        public final void m54586a(Long l) {
            if (l != null && l.longValue() == 0 && CountdownView.this.m54609q() == R46.DECREASING) {
                CountdownView.this.f67282b.onComplete();
            }
            CountdownView.this.f67283c.onNext(Integer.valueOf((int) l.longValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54586a(l);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C24554b m31910m0 = C24554b.m31910m0();
        Intrinsics.checkNotNullExpressionValue(m31910m0, "create()");
        this.f67282b = m31910m0;
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f67283c = m31902e;
        this.f67284d = new C23464b();
        this.f67293m = -1;
    }

    /* renamed from: A */
    public static final void m54630A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m54629B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static /* synthetic */ Observable m54625F(CountdownView countdownView, int i, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return countdownView.m54626E(i, timeUnit);
    }

    /* renamed from: G */
    public static final void m54624G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m54621J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void init$default(CountdownView countdownView, int i, TimeUnit timeUnit, Boolean bool, ScopeProvider scopeProvider, Integer num, StyleSpan styleSpan, ForegroundColorSpan foregroundColorSpan, Float f, int i2, Object obj) {
        TimeUnit timeUnit2;
        Boolean bool2;
        ScopeProvider scopeProvider2;
        Integer num2;
        StyleSpan styleSpan2;
        ForegroundColorSpan foregroundColorSpan2;
        if ((i2 & 2) != 0) {
            timeUnit2 = TimeUnit.SECONDS;
        } else {
            timeUnit2 = timeUnit;
        }
        if ((i2 & 4) != 0) {
            bool2 = Boolean.FALSE;
        } else {
            bool2 = bool;
        }
        Float f2 = null;
        if ((i2 & 8) != 0) {
            scopeProvider2 = null;
        } else {
            scopeProvider2 = scopeProvider;
        }
        if ((i2 & 16) != 0) {
            num2 = countdownView.f67285e;
        } else {
            num2 = num;
        }
        if ((i2 & 32) != 0) {
            styleSpan2 = null;
        } else {
            styleSpan2 = styleSpan;
        }
        if ((i2 & 64) != 0) {
            foregroundColorSpan2 = null;
        } else {
            foregroundColorSpan2 = foregroundColorSpan;
        }
        if ((i2 & 128) == 0) {
            f2 = f;
        }
        countdownView.m54608r(i, timeUnit2, bool2, scopeProvider2, num2, styleSpan2, foregroundColorSpan2, f2);
    }

    /* renamed from: o */
    public static final boolean m54611o(CountdownView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewTreeObserver().removeOnPreDrawListener(this$0);
        if (this$0.f67296p == 0) {
            this$0.f67296p = this$0.getGravity();
        }
        if (this$0.getLineCount() > 1 && this$0.getGravity() != 1) {
            this$0.setGravity(1);
        } else if (this$0.getGravity() != 8388611) {
            this$0.setGravity(8388611);
        }
        return true;
    }

    public static /* synthetic */ void setupStopwatch$default(CountdownView countdownView, ScopeProvider scopeProvider, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            scopeProvider = null;
        }
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        countdownView.setupStopwatch(scopeProvider, timeUnit);
    }

    public static /* synthetic */ void setupTimer$default(CountdownView countdownView, int i, TimeUnit timeUnit, ScopeProvider scopeProvider, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        if ((i2 & 4) != 0) {
            scopeProvider = null;
        }
        countdownView.setupTimer(i, timeUnit, scopeProvider);
    }

    /* renamed from: t */
    public static final void m54606t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m54605u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m54601y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m54600z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final void m54628C(String str, Integer num, StyleSpan styleSpan, ForegroundColorSpan foregroundColorSpan, Float f) {
        if (num != null) {
            String string = getContext().getString(num.intValue(), str);
            if (string != null) {
                str = string;
            }
        }
        Intrinsics.checkNotNullExpressionValue(str, "textRes?.let { context.g…timerText) } ?: timerText");
        SpannableString spannableString = new SpannableString(str);
        if (styleSpan != null) {
            C45097mS5.m25592n(spannableString, str, styleSpan);
        }
        if (foregroundColorSpan != null) {
            C45097mS5.m25592n(spannableString, str, foregroundColorSpan);
        }
        setText(spannableString, TextView.BufferType.SPANNABLE);
        if (f != null) {
            setTextSize(f.floatValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1 != null) goto L5;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m54627D(long j) {
        CharSequence charSequence;
        String str;
        SpannableString m25592n;
        CharSequence m25592n2;
        CharSequence m25592n3;
        CharSequence m25592n4;
        String formattedTime = DateUtils.formatElapsedTime(j);
        String str2 = this.f67286f;
        if (str2 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            charSequence = String.format(str2, Arrays.copyOf(new Object[]{formattedTime}, 1));
            Intrinsics.checkNotNullExpressionValue(charSequence, "format(format, *args)");
        }
        Intrinsics.checkNotNullExpressionValue(formattedTime, "formattedTime");
        charSequence = formattedTime;
        String str3 = this.f67286f;
        if (str3 != null) {
            str = StringsKt__StringsJVMKt.replace$default(str3, "%s", "", false, 4, (Object) null);
        } else {
            str = null;
        }
        if (str != null) {
            StyleSpan styleSpan = this.f67287g;
            if (styleSpan != null && (m25592n4 = C45097mS5.m25592n(charSequence, str, styleSpan)) != null) {
                charSequence = m25592n4;
            }
            Integer num = this.f67289i;
            if (num != null && (m25592n3 = C45097mS5.m25592n(charSequence, str, new ForegroundColorSpan(num.intValue()))) != null) {
                charSequence = m25592n3;
            }
        }
        StyleSpan styleSpan2 = this.f67290j;
        if (styleSpan2 != null && (m25592n2 = C45097mS5.m25592n(charSequence, formattedTime, styleSpan2)) != null) {
            charSequence = m25592n2;
        }
        if (j <= this.f67293m) {
            Integer num2 = this.f67292l;
            if (num2 == null || (m25592n = C45097mS5.m25592n(charSequence, formattedTime, new ForegroundColorSpan(num2.intValue()))) == null) {
                Integer num3 = this.f67291k;
                if (num3 != null) {
                    return C45097mS5.m25592n(charSequence, formattedTime, new ForegroundColorSpan(num3.intValue()));
                }
                return charSequence;
            }
        } else {
            Integer num4 = this.f67291k;
            if (num4 == null || (m25592n = C45097mS5.m25592n(charSequence, formattedTime, new ForegroundColorSpan(num4.intValue()))) == null) {
                return charSequence;
            }
        }
        return m25592n;
    }

    /* renamed from: E */
    public final Observable<Long> m54626E(int i, TimeUnit timeUnit) {
        Observable<Long> m87335c = R46.INCREASING.m87335c(i, timeUnit);
        final C16502k c16502k = new C16502k();
        Observable<Long> observeOn = m87335c.doOnNext(new InterfaceC23484g() { // from class: oD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CountdownView.m54624G(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun timeCountUpO…edulers.mainThread())\n  }");
        return observeOn;
    }

    /* renamed from: H */
    public final Observable<Long> m54623H(int i, Boolean bool, TimeUnit timeUnit) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            if (timeUnit == null) {
                timeUnit = TimeUnit.SECONDS;
            }
            return m54626E(i, timeUnit);
        }
        if (timeUnit == null) {
            timeUnit = TimeUnit.SECONDS;
        }
        return m54622I(i, timeUnit);
    }

    /* renamed from: I */
    public final Observable<Long> m54622I(int i, TimeUnit timeUnit) {
        R46 r46 = this.f67288h;
        if (r46 == null) {
            r46 = R46.DECREASING;
        }
        Observable<Long> m87335c = r46.m87335c(i, timeUnit);
        final C16503l c16503l = new C16503l();
        Observable<Long> observeOn = m87335c.doOnNext(new InterfaceC23484g() { // from class: pD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CountdownView.m54621J(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun timerObserva…edulers.mainThread())\n  }");
        return observeOn;
    }

    /* renamed from: p */
    public final AbstractC23461c m54610p() {
        AbstractC23461c m33075K = this.f67282b.m33075K();
        Intrinsics.checkNotNullExpressionValue(m33075K, "countDownEndedSubject.hide()");
        return m33075K;
    }

    /* renamed from: q */
    public final R46 m54609q() {
        return this.f67288h;
    }

    /* renamed from: r */
    public final void m54608r(int i, TimeUnit timeUnit, Boolean bool, ScopeProvider scopeProvider, Integer num, StyleSpan styleSpan, ForegroundColorSpan foregroundColorSpan, Float f) {
        String str;
        if (i == 0 && this.f67288h == R46.STOPPED) {
            if (timeUnit == TimeUnit.SECONDS) {
                str = DateUtils.formatElapsedTime(i);
            } else {
                str = "0";
            }
            String str2 = str;
            Intrinsics.checkNotNullExpressionValue(str2, "if (timeUnit == TimeUnit…ration.toLong()) else \"0\"");
            m54628C(str2, num, styleSpan, foregroundColorSpan, f);
        } else if (scopeProvider != null) {
            Object m33094as = m54623H(i, bool, timeUnit).m33094as(AutoDispose.m45239a(scopeProvider));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C16496e c16496e = new C16496e(timeUnit, num, styleSpan, foregroundColorSpan, f);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: mD0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CountdownView.m54606t(Function1.this, obj);
                }
            });
        } else {
            m54602x();
            Observable<Long> m54623H = m54623H(i, bool, timeUnit);
            final C16497f c16497f = new C16497f(timeUnit, num, styleSpan, foregroundColorSpan, f);
            InterfaceC23465c subscribe = m54623H.subscribe(new InterfaceC23484g() { // from class: nD0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CountdownView.m54605u(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscribe, "fun init(\n    duration: … }.addTo(trash)\n    }\n  }");
            C24517a.m31963a(subscribe, this.f67284d);
        }
    }

    /* renamed from: s */
    public final void m54607s(AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.CountdownView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.CountdownView)");
        int i = obtainStyledAttributes.getInt(C34290Ll4.CountdownView_duration, -1);
        Integer valueOf = Integer.valueOf(obtainStyledAttributes.getResourceId(C34290Ll4.CountdownView_text_resource, 0));
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        this.f67285e = valueOf;
        this.f67286f = obtainStyledAttributes.getString(C34290Ll4.CountdownView_text_format);
        setTextFormatColor(Integer.valueOf(obtainStyledAttributes.getColor(C34290Ll4.CountdownView_format_color, Integer.MIN_VALUE)));
        this.f67287g = EnumC16493b.values()[obtainStyledAttributes.getInt(C34290Ll4.CountdownView_format_style, EnumC16493b.NORMAL.ordinal())].m54598b();
        this.f67290j = EnumC16495d.values()[obtainStyledAttributes.getInt(C34290Ll4.CountdownView_timer_style, EnumC16495d.NORMAL.ordinal())].m54594b();
        this.f67288h = EnumC16494c.values()[obtainStyledAttributes.getInt(C34290Ll4.CountdownView_timer_direction, EnumC16494c.COUNT_DOWN.ordinal())].m54596b();
        setTimerColor(Integer.valueOf(obtainStyledAttributes.getColor(C34290Ll4.CountdownView_timer_color, Integer.MIN_VALUE)));
        this.f67293m = obtainStyledAttributes.getInt(C34290Ll4.CountdownView_threshold, -1);
        setTimerThresholdColor(Integer.valueOf(obtainStyledAttributes.getColor(C34290Ll4.CountdownView_threshold_color, Integer.MIN_VALUE)));
        setAutoCenter(obtainStyledAttributes.getBoolean(C34290Ll4.CountdownView_auto_center, false));
        obtainStyledAttributes.recycle();
        if (i > 0) {
            setTime(i);
        }
    }

    public final void setAutoCenter(boolean z) {
        this.f67295o = z;
        if (!z) {
            setGravity(this.f67296p);
        }
        setText(getText());
    }

    public final void setTextFormat(String str) {
        this.f67286f = str;
    }

    public final void setTextFormatColor(Integer num) {
        if (num != null && num.intValue() == Integer.MIN_VALUE) {
            return;
        }
        this.f67289i = num;
    }

    public final void setTextFormatStyleSpan(StyleSpan styleSpan) {
        this.f67287g = styleSpan;
    }

    public final void setTextRes(Integer num) {
        this.f67285e = num;
    }

    public final void setTime(long j) {
        this.f67294n = j;
        setText(m54627D(j));
        if (this.f67295o) {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: hD0
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    boolean m54611o;
                    m54611o = CountdownView.m54611o(CountdownView.this);
                    return m54611o;
                }
            });
        }
    }

    public final void setTimerColor(Integer num) {
        if (num != null && num.intValue() == Integer.MIN_VALUE) {
            return;
        }
        this.f67291k = num;
    }

    public final void setTimerState(R46 r46) {
        this.f67288h = r46;
    }

    public final void setTimerStyleSpan(StyleSpan styleSpan) {
        this.f67290j = styleSpan;
    }

    public final void setTimerThreshold(int i) {
        this.f67293m = i;
    }

    public final void setTimerThresholdColor(Integer num) {
        if (num != null && num.intValue() == Integer.MIN_VALUE) {
            return;
        }
        this.f67292l = num;
    }

    public final void setupStopwatch(ScopeProvider scopeProvider, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        if (scopeProvider != null) {
            Object m33094as = m54625F(this, 0, timeUnit, 1, null).m33094as(AutoDispose.m45239a(scopeProvider));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C16498g c16498g = new C16498g();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: iD0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CountdownView.m54601y(Function1.this, obj);
                }
            });
            return;
        }
        Observable m54625F = m54625F(this, 0, timeUnit, 1, null);
        final C16499h c16499h = new C16499h();
        InterfaceC23465c subscribe = m54625F.subscribe(new InterfaceC23484g() { // from class: jD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CountdownView.m54600z(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun setupStopwatch(scope…  .addTo(trash)\n    }\n  }");
        C24517a.m31963a(subscribe, this.f67284d);
    }

    public final void setupTimer(int i, TimeUnit timeUnit, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        if (scopeProvider != null) {
            Object m33094as = m54622I(i, timeUnit).m33094as(AutoDispose.m45239a(scopeProvider));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C16500i c16500i = new C16500i();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kD0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CountdownView.m54630A(Function1.this, obj);
                }
            });
            return;
        }
        Observable<Long> m54622I = m54622I(i, timeUnit);
        final C16501j c16501j = new C16501j();
        InterfaceC23465c subscribe = m54622I.subscribe(new InterfaceC23484g() { // from class: lD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CountdownView.m54629B(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun setupTimer(durationS…  .addTo(trash)\n    }\n  }");
        C24517a.m31963a(subscribe, this.f67284d);
    }

    /* renamed from: v */
    public final String m54604v(long j, TimeUnit timeUnit) {
        if (timeUnit == TimeUnit.SECONDS) {
            String formatElapsedTime = DateUtils.formatElapsedTime(j);
            Intrinsics.checkNotNullExpressionValue(formatElapsedTime, "formatElapsedTime(this)");
            return formatElapsedTime;
        }
        return String.valueOf(j);
    }

    /* renamed from: w */
    public final Observable<Integer> m54603w() {
        Observable<Integer> hide = this.f67283c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "remainingSeconds.hide()");
        return hide;
    }

    /* renamed from: x */
    public final void m54602x() {
        this.f67284d.m33026d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        C24554b m31910m0 = C24554b.m31910m0();
        Intrinsics.checkNotNullExpressionValue(m31910m0, "create()");
        this.f67282b = m31910m0;
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f67283c = m31902e;
        this.f67284d = new C23464b();
        this.f67293m = -1;
        m54607s(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        C24554b m31910m0 = C24554b.m31910m0();
        Intrinsics.checkNotNullExpressionValue(m31910m0, "create()");
        this.f67282b = m31910m0;
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f67283c = m31902e;
        this.f67284d = new C23464b();
        this.f67293m = -1;
        m54607s(attrs);
    }
}
