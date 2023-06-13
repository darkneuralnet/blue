package p000;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.widget.FrequentFlyerScannerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.share.internal.C17296a;
import com.google.android.play.core.review.ReviewInfo;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23470e;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Currency;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0002bcB9\b\u0007\u0012\u0006\u0010A\u001a\u00020<\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010\\\u001a\u00020[\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F¢\u0006\u0004\b_\u0010`J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0016J\u001a\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!0\u0007H\u0016J\u0010\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0003H\u0016J\u0012\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010*\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020#H\u0016J\u0018\u00101\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016J\u0012\u00104\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000102H\u0016J\u0010\u00105\u001a\u00020\b2\u0006\u0010+\u001a\u00020#H\u0016J\u0010\u00106\u001a\u00020\b2\u0006\u0010+\u001a\u00020#H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u00108\u001a\u00020\bH\u0016J\u0016\u0010;\u001a\u00020\b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\b09H\u0016R\u001a\u0010A\u001a\u00020<8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR:\u0010Q\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020# N*\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!0!0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR)\u0010X\u001a\u0010\u0012\f\u0012\n N*\u0004\u0018\u00010S0S0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006d"}, m28432d2 = {"LM75;", "LHA;", "LF75;", "", "fallback", "LYI4;", "sm", "Lio/reactivex/Observable;", "", "Wk", "", "finalCost", "vh", "url", "E8", "strikeThroughCost", "Oa", Entry.TYPE_TEXT, C8706Vc.f39333b, "y2", "tl", "Lco/bird/android/model/wire/WireRideDetail;", "detail", "ni", "title", "setTitle", "t", "subtitle", AbstractC26684u0.f100690q, "animation", "Y8", "Lco/bird/android/model/wire/WireRide;", "Xf", "Lkotlin/Pair;", "", "", "Bc", "imageRes", "k6", "imageUrl", "Lio/reactivex/c;", "Bl", "tk", "show", "n5", "", "amountSaved", "Ljava/util/Currency;", "currency", "z2", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "progress", "N2", "pb", "i0", "m9", "D", "Lkotlin/Function0;", "action", "X2", "LTo2;", "j", "LTo2;", "Vl", "()LTo2;", "assetManager", "LR5;", "k", "LR5;", "binding", "LEO4;", "l", "LEO4;", "reviewManager", "m", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Lma4;", "kotlin.jvm.PlatformType", "n", "Lma4;", "ratingBarChanges", "LXY5;", "Lcom/google/android/play/core/review/ReviewInfo;", "o", "Lkotlin/Lazy;", "qm", "()LXY5;", "requestReviewTask", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LJf;", "adapter", "Lbg;", "converter", "<init>", "(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;LR5;LEO4;)V", "p", "b", "c", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideSummaryUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideSummaryUi.kt\nco/bird/android/feature/rideendsummary/RideSummaryUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
/* renamed from: M75 */
/* loaded from: classes3.dex */
public final class M75 extends AbstractC3056HA implements F75 {

    /* renamed from: p */
    public static final C5197b f22664p = new C5197b(null);

    /* renamed from: j */
    public final InterfaceC36187To2 f22665j;

    /* renamed from: k */
    public final C7063R5 f22666k;

    /* renamed from: l */
    public final EO4 f22667l;

    /* renamed from: m */
    public WireRideDetail f22668m;

    /* renamed from: n */
    public final C45168ma4<Pair<Float, Boolean>> f22669n;

    /* renamed from: o */
    public final Lazy f22670o;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/RatingBar;", "<anonymous parameter 0>", "", "rating", "", "fromUser", "", C17296a.f69688o, "(Landroid/widget/RatingBar;FZ)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M75$a */
    /* loaded from: classes3.dex */
    public static final class C5196a extends Lambda implements Function3<RatingBar, Float, Boolean, Unit> {
        public C5196a() {
            super(3);
        }

        /* renamed from: a */
        public final void m95729a(RatingBar ratingBar, float f, boolean z) {
            M75.this.f22669n.accept(new Pair(Float.valueOf(f), Boolean.valueOf(z)));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RatingBar ratingBar, Float f, Boolean bool) {
            m95729a(ratingBar, f.floatValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LM75$b;", "", "", "COST_IMAGE_FROM_URL_HEIGHT_DP", "I", "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: M75$b */
    /* loaded from: classes3.dex */
    public static final class C5197b {
        public /* synthetic */ C5197b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5197b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LM75$c;", "LVA5;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "onLoadStarted", "errorDrawable", "onLoadFailed", "resource", "LG96;", "transition", "c", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "textView", "", "drawableSize", "<init>", "(Landroid/widget/TextView;I)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: M75$c */
    /* loaded from: classes3.dex */
    public static final class C5198c extends VA5<Drawable> {

        /* renamed from: e */
        public final TextView f22672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5198c(TextView textView, int i) {
            super(i, i);
            Intrinsics.checkNotNullParameter(textView, "textView");
            this.f22672e = textView;
        }

        @Override // p000.LY5
        /* renamed from: c */
        public void onResourceReady(Drawable resource, G96<? super Drawable> g96) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f22672e.setCompoundDrawablesRelativeWithIntrinsicBounds(resource, (Drawable) null, (Drawable) null, (Drawable) null);
        }

        @Override // p000.AbstractC28661tE, p000.LY5
        public void onLoadFailed(Drawable drawable) {
            if (drawable != null) {
                this.f22672e.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        @Override // p000.AbstractC28661tE, p000.LY5
        public void onLoadStarted(Drawable drawable) {
            if (drawable != null) {
                this.f22672e.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXY5;", "Lcom/google/android/play/core/review/ReviewInfo;", "kotlin.jvm.PlatformType", "b", "()LXY5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M75$d */
    /* loaded from: classes3.dex */
    public static final class C5199d extends Lambda implements Function0<XY5<ReviewInfo>> {
        public C5199d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final XY5<ReviewInfo> invoke() {
            return M75.this.f22667l.mo48459a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", C17296a.f69688o, "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M75$e */
    /* loaded from: classes3.dex */
    public static final class C5200e extends Lambda implements Function1<InterfaceC23470e, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f22675h;

        @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J6\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, m28432d2 = {"M75$e$a", "LTI4;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", RequestHeadersFactory.MODEL, "LLY5;", "target", "", "isFirstResource", C17296a.f69688o, "resource", "LZS0;", "dataSource", "b", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: M75$e$a */
        /* loaded from: classes3.dex */
        public static final class C5201a implements TI4<Drawable> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC23470e f22676b;

            public C5201a(InterfaceC23470e interfaceC23470e) {
                this.f22676b = interfaceC23470e;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
            @Override // p000.TI4
            /* renamed from: a */
            public boolean mo6879a(GlideException glideException, Object obj, LY5<Drawable> ly5, boolean z) {
                InterfaceC23470e interfaceC23470e = this.f22676b;
                GlideException glideException2 = glideException;
                if (glideException == null) {
                    glideException2 = new Throwable("Glide failed to load image");
                }
                interfaceC23470e.onError(glideException2);
                return false;
            }

            @Override // p000.TI4
            /* renamed from: b */
            public boolean onResourceReady(Drawable resource, Object model, LY5<Drawable> target, ZS0 dataSource, boolean z) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                this.f22676b.onComplete();
                return false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5200e(String str) {
            super(1);
            this.f22675h = str;
        }

        /* renamed from: a */
        public final void m95726a(InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            ComponentCallbacks2C17096a.m53136v(M75.this.getActivity()).m81653k(this.f22675h).mo16086d(M75.this.m95740sm(0)).m16094T0(new C5201a(emitter)).m16096R0(M75.this.f22666k.f31497m);
            ImageView imageView = M75.this.f22666k.f31497m;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageView");
            C49520tu6.m11233r(imageView);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m95726a(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M75$f */
    /* loaded from: classes3.dex */
    public static final class C5202f extends Lambda implements Function1<Unit, Optional<WireRide>> {
        public C5202f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireRide> invoke(Unit it) {
            WireRide wireRide;
            Intrinsics.checkNotNullParameter(it, "it");
            Optional.C14443a c14443a = Optional.f63040c;
            WireRideDetail wireRideDetail = M75.this.f22668m;
            if (wireRideDetail != null) {
                wireRide = wireRideDetail.getRide();
            } else {
                wireRide = null;
            }
            return c14443a.m59033b(wireRide);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireRide;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M75$g */
    /* loaded from: classes3.dex */
    public static final class C5203g extends Lambda implements Function1<Optional<WireRide>, Boolean> {

        /* renamed from: g */
        public static final C5203g f22678g = new C5203g();

        public C5203g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<WireRide> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireRide;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/wire/WireRide;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M75$h */
    /* loaded from: classes3.dex */
    public static final class C5204h extends Lambda implements Function1<Optional<WireRide>, WireRide> {

        /* renamed from: g */
        public static final C5204h f22679g = new C5204h();

        public C5204h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireRide invoke(Optional<WireRide> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M75(InterfaceC36187To2 assetManager, BaseActivity activity, C4176Jf adapter, C12470bg converter, C7063R5 binding, EO4 reviewManager) {
        super(activity, adapter, converter);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(reviewManager, "reviewManager");
        this.f22665j = assetManager;
        this.f22666k = binding;
        this.f22667l = reviewManager;
        C45168ma4<Pair<Float, Boolean>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Pair<Float, Boolean>>()");
        this.f22669n = m25409g;
        lazy = LazyKt__LazyJVMKt.lazy(new C5199d());
        this.f22670o = lazy;
        AppCompatTextView appCompatTextView = binding.f31505u;
        appCompatTextView.setPaintFlags(appCompatTextView.getPaintFlags() | 16);
        RatingBar ratingBar = binding.f31498n;
        Intrinsics.checkNotNullExpressionValue(ratingBar, "binding.ratingBar");
        C34585Ms2.m94651t(ratingBar, new C5196a());
    }

    /* renamed from: om */
    public static final void m95745om(M75 this$0, final Function0 action, XY5 task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "$action");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.mo1421g()) {
            Object mo1423e = task.mo1423e();
            Intrinsics.checkNotNullExpressionValue(mo1423e, "task.result");
            this$0.f22667l.mo48458b(this$0.getActivity(), (ReviewInfo) mo1423e).mo1427a(new InterfaceC44031kf3() { // from class: L75
                @Override // p000.InterfaceC44031kf3
                /* renamed from: a */
                public final void mo17508a(XY5 xy5) {
                    M75.m95743pm(Function0.this, xy5);
                }
            });
            return;
        }
        C41318g46.m40158f(task.mo1424d(), "Exception raised while requesting in-app review flow", new Object[0]);
    }

    /* renamed from: pm */
    public static final void m95743pm(Function0 action, XY5 xy5) {
        Intrinsics.checkNotNullParameter(action, "$action");
        Intrinsics.checkNotNullParameter(xy5, "<anonymous parameter 0>");
        C41318g46.m40163a("in app review attempted successfully", new Object[0]);
        action.invoke();
    }

    /* renamed from: rm */
    public static final void m95741rm(XY5 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        C41318g46.m40163a("request review complete (" + task + ")", new Object[0]);
    }

    /* renamed from: tm */
    public static final Optional m95736tm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: um */
    public static final boolean m95734um(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: vm */
    public static final WireRide m95732vm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireRide) tmp0.invoke(obj);
    }

    @Override // p000.F75
    /* renamed from: Bc */
    public Observable<Pair<Float, Boolean>> mo95767Bc() {
        Observable<Pair<Float, Boolean>> hide = this.f22669n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "ratingBarChanges.hide()");
        return hide;
    }

    @Override // p000.F75
    /* renamed from: Bl */
    public AbstractC23461c mo95766Bl(String str) {
        return C45832nh5.m23311e(new C5200e(str));
    }

    @Override // p000.F75
    /* renamed from: D */
    public void mo95765D() {
        m95742qm().mo1427a(new InterfaceC44031kf3() { // from class: G75
            @Override // p000.InterfaceC44031kf3
            /* renamed from: a */
            public final void mo17508a(XY5 xy5) {
                M75.m95741rm(xy5);
            }
        });
    }

    @Override // p000.F75
    /* renamed from: E8 */
    public void mo95764E8(String str, int i) {
        C47971rI4<Drawable> mo16086d = ComponentCallbacks2C17096a.m53136v(getActivity()).m81653k(str).mo16086d(m95740sm(i));
        AppCompatTextView appCompatTextView = this.f22666k.f31489e;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.cost");
        mo16086d.m16099O0(new C5198c(appCompatTextView, (int) C49347td3.m12002a(32, getActivity())));
    }

    @Override // p000.F75
    /* renamed from: N2 */
    public void mo95763N2(WireFrequentFlyerView wireFrequentFlyerView) {
        boolean z;
        if (wireFrequentFlyerView != null) {
            this.f22666k.f31492h.m54567a(wireFrequentFlyerView.getRideEndStatus(), O75.m92876a(wireFrequentFlyerView.getProgress(), getActivity()));
        }
        FrequentFlyerScannerView frequentFlyerScannerView = this.f22666k.f31492h;
        Intrinsics.checkNotNullExpressionValue(frequentFlyerScannerView, "binding.frequentFlyerStatus");
        if (wireFrequentFlyerView != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(frequentFlyerScannerView, z, 0, 2, null);
    }

    @Override // p000.F75
    /* renamed from: Oa */
    public void mo95762Oa(String str) {
        AppCompatTextView appCompatTextView = this.f22666k.f31505u;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.strikeThroughCost");
        C49520tu6.setTextAndVisibility$default(appCompatTextView, str, 0, 2, null);
    }

    @Override // p000.F75
    /* renamed from: Vc */
    public void mo95761Vc(String str) {
        AppCompatTextView appCompatTextView = this.f22666k.f31490f;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.distance");
        C49520tu6.setTextAndVisibility$default(appCompatTextView, str, 0, 2, null);
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Vl */
    public InterfaceC36187To2 mo2709Vl() {
        return this.f22665j;
    }

    @Override // p000.F75
    /* renamed from: Wk */
    public Observable<Unit> mo95760Wk() {
        Button button = this.f22666k.f31501q;
        Intrinsics.checkNotNullExpressionValue(button, "binding.rideReport");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.F75
    /* renamed from: X2 */
    public void mo95759X2(final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        C41318g46.m40163a("attemptInAppReview called, waiting for review request task to complete...", new Object[0]);
        m95742qm().mo1427a(new InterfaceC44031kf3() { // from class: K75
            @Override // p000.InterfaceC44031kf3
            /* renamed from: a */
            public final void mo17508a(XY5 xy5) {
                M75.m95745om(M75.this, action, xy5);
            }
        });
    }

    @Override // p000.F75
    /* renamed from: Xf */
    public Observable<WireRide> mo95758Xf() {
        Button button = this.f22666k.f31506v;
        Intrinsics.checkNotNullExpressionValue(button, "binding.viewReceiptButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C5202f c5202f = new C5202f();
        Observable map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: H75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m95736tm;
                m95736tm = M75.m95736tm(Function1.this, obj);
                return m95736tm;
            }
        });
        final C5203g c5203g = C5203g.f22678g;
        Observable filter = map.filter(new InterfaceC23494q() { // from class: I75
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m95734um;
                m95734um = M75.m95734um(Function1.this, obj);
                return m95734um;
            }
        });
        final C5204h c5204h = C5204h.f22679g;
        Observable<WireRide> map2 = filter.map(new InterfaceC23492o() { // from class: J75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireRide m95732vm;
                m95732vm = M75.m95732vm(Function1.this, obj);
                return m95732vm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "override fun viewReceipt…    .map { it.get() }\n  }");
        return map2;
    }

    @Override // p000.F75
    /* renamed from: Y8 */
    public void mo95757Y8(String animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f22666k.f31486b.setAnimation(animation);
        this.f22666k.f31486b.m53539y();
        this.f22666k.f31486b.setRepeatCount(-1);
        this.f22666k.f31486b.setRepeatMode(1);
    }

    @Override // p000.F75
    /* renamed from: i0 */
    public void mo95756i0(boolean z) {
        Button button = this.f22666k.f31501q;
        Intrinsics.checkNotNullExpressionValue(button, "binding.rideReport");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.F75
    /* renamed from: k6 */
    public void mo95753k6(int i) {
        ComponentCallbacks2C17096a.m53136v(getActivity()).m81654j(Integer.valueOf(i)).m16096R0(this.f22666k.f31497m);
        ImageView imageView = this.f22666k.f31497m;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageView");
        C49520tu6.m11233r(imageView);
    }

    @Override // p000.F75
    /* renamed from: m9 */
    public Observable<Unit> mo95750m9() {
        Button button = this.f22666k.f31494j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helmetBannerCta");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.F75
    /* renamed from: n5 */
    public void mo95748n5(boolean z) {
        LottieAnimationView lottieAnimationView = this.f22666k.f31486b;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.animationView");
        C49520tu6.show$default(lottieAnimationView, z, 0, 2, null);
    }

    @Override // p000.F75
    /* renamed from: ni */
    public void mo95747ni(WireRideDetail detail) {
        float f;
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.f22668m = detail;
        RatingBar ratingBar = this.f22666k.f31498n;
        Float rating = detail.getRating();
        if (rating != null) {
            f = rating.floatValue();
        } else {
            f = 0.0f;
        }
        ratingBar.setRating(f);
    }

    @Override // p000.F75
    /* renamed from: pb */
    public void mo95744pb(boolean z) {
        ConstraintLayout constraintLayout = this.f22666k.f31493i;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.helmetBanner");
        C49520tu6.show$default(constraintLayout, z, 0, 2, null);
    }

    /* renamed from: qm */
    public final XY5<ReviewInfo> m95742qm() {
        return (XY5) this.f22670o.getValue();
    }

    @Override // p000.F75
    public void setTitle(int i) {
        this.f22666k.f31504t.setText(i);
    }

    /* renamed from: sm */
    public final YI4 m95740sm(int i) {
        YI4 m97549n = new YI4().m97559g().m97554k(B41.f1615a).m97552l().m97551l0(i).m97549n(i);
        Intrinsics.checkNotNullExpressionValue(m97549n, "RequestOptions()\n      .…k)\n      .error(fallback)");
        return m97549n;
    }

    @Override // p000.F75
    /* renamed from: t */
    public void mo95739t(String str) {
        this.f22666k.f31504t.setText(str);
    }

    @Override // p000.F75
    /* renamed from: tk */
    public void mo95738tk() {
        ImageView imageView = this.f22666k.f31497m;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageView");
        C49520tu6.m11239l(imageView);
    }

    @Override // p000.F75
    /* renamed from: tl */
    public void mo95737tl(String str) {
        TextView textView = this.f22666k.f31502r;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.rideSummarySubText");
        C49520tu6.setTextAndVisibility$default(textView, str, 0, 2, null);
    }

    @Override // p000.F75
    /* renamed from: u0 */
    public void mo95735u0(String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f22666k.f31503s.setText(subtitle);
    }

    @Override // p000.F75
    /* renamed from: vh */
    public void mo95733vh(String str) {
        AppCompatTextView appCompatTextView = this.f22666k.f31489e;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.cost");
        C49520tu6.setTextAndVisibility$default(appCompatTextView, str, 0, 2, null);
    }

    @Override // p000.F75
    /* renamed from: y2 */
    public void mo95731y2(String str) {
        AppCompatTextView appCompatTextView = this.f22666k.f31491g;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.duration");
        C49520tu6.setTextAndVisibility$default(appCompatTextView, str, 0, 2, null);
    }

    @Override // p000.F75
    /* renamed from: z2 */
    public void mo95730z2(long j, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f22666k.f31487c.setText(getActivity().getString(C45871nl4.ride_summary_money_saved, C51916xx1.f118396a.m4408d(j, currency, EnumC36501Ux1.SHOW_ALWAYS)));
        AppCompatTextView appCompatTextView = this.f22666k.f31487c;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.banner");
        C49520tu6.m11233r(appCompatTextView);
    }
}
