package p000;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.widget.BatteryViewV2;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import p000.HA3;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \r2\u00020\u0001:\u000bFG\u001d \"$&(*,.B\u0007¢\u0006\u0004\bD\u0010EJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J*\u0010\u0010\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n\u0018\u00010\u000e0\u000eJ*\u0010\u0011\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n\u0018\u00010\u000e0\u000eJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00120\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\"\u0010#\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\"\u0010%\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\"\u0010'\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR\"\u0010)\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\"\u0010+\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001eR\"\u0010-\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001eR\"\u0010/\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001eR\"\u00101\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001eR\"\u00103\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001eR\"\u00105\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001eR\"\u00107\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u001eR\u001c\u0010;\u001a\b\u0018\u000108R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010C\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006H"}, m28432d2 = {"LHA3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "v", "x", "", "J", "H", "E", "K", "y", "F", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "B", "A", "Lio/reactivex/subjects/d;", "c", "Lio/reactivex/subjects/d;", "tamperCheckedChangeSubject", DateTokenConverter.CONVERTER_KEY, "supportClicksSubject", "e", "sleepWakeClicksSubject", "f", "renameClicksSubject", "g", "firmwareUpdateClicksSubject", "h", "diagnosticsClicksSubject", "i", "faqClicksSubject", "j", "unpairClicksSubject", "k", "pairClicksSubject", "l", "resetClicksSubject", "m", "resetTripOdometerSubject", "n", "resetTotalOdometerSubject", "o", "resetMaintenanceIndicatorSubject", "LHA3$a;", "p", "LHA3$a;", "actionsViewHolder", "value", "q", "Z", "w", "()Z", "D", "(Z)V", "actionButtonsEnabled", "<init>", "()V", C17296a.f69688o, "b", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HA3 */
/* loaded from: classes3.dex */
public final class HA3 extends AbstractC52206yS0 {

    /* renamed from: r */
    public static final C3069b f13002r = new C3069b(null);

    /* renamed from: s */
    public static final Regex f13003s = new Regex("(\\d*\\.?\\d*)");

    /* renamed from: t */
    public static final AccelerateDecelerateInterpolator f13004t = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public final C24558d<Boolean> f13005c;

    /* renamed from: d */
    public final C24558d<Unit> f13006d;

    /* renamed from: e */
    public final C24558d<Unit> f13007e;

    /* renamed from: f */
    public final C24558d<Unit> f13008f;

    /* renamed from: g */
    public final C24558d<Unit> f13009g;

    /* renamed from: h */
    public final C24558d<Unit> f13010h;

    /* renamed from: i */
    public final C24558d<Unit> f13011i;

    /* renamed from: j */
    public final C24558d<Unit> f13012j;

    /* renamed from: k */
    public final C24558d<Unit> f13013k;

    /* renamed from: l */
    public final C24558d<Unit> f13014l;

    /* renamed from: m */
    public final C24558d<Unit> f13015m;

    /* renamed from: n */
    public final C24558d<Unit> f13016n;

    /* renamed from: o */
    public final C24558d<Unit> f13017o;

    /* renamed from: p */
    public C3062a f13018p;

    /* renamed from: q */
    public boolean f13019q;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LHA3$a;", "Lw1;", "", "position", "", "bind", "LLa2;", "b", "LLa2;", "binding", "", "value", "getButtonsEnabled", "()Z", C17296a.f69688o, "(Z)V", "buttonsEnabled", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$ActionsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$ActionsViewHolder\n*L\n319#1:349\n319#1:350,4\n*E\n"})
    /* renamed from: HA3$a */
    /* loaded from: classes3.dex */
    public final class C3062a extends C29735w1 {

        /* renamed from: b */
        public final C34189La2 f13020b;

        /* renamed from: c */
        public final /* synthetic */ HA3 f13021c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$a$a */
        /* loaded from: classes3.dex */
        public static final class C3063a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13022g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3063a(HA3 ha3) {
                super(1);
                this.f13022g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13022g.f13007e.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$a$b */
        /* loaded from: classes3.dex */
        public static final class C3064b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13023g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3064b(HA3 ha3) {
                super(1);
                this.f13023g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13023g.f13010h.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$a$c */
        /* loaded from: classes3.dex */
        public static final class C3065c extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13024g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3065c(HA3 ha3) {
                super(1);
                this.f13024g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13024g.f13011i.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$a$d */
        /* loaded from: classes3.dex */
        public static final class C3066d extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13025g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3066d(HA3 ha3) {
                super(1);
                this.f13025g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13025g.f13012j.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$a$e */
        /* loaded from: classes3.dex */
        public static final class C3067e extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13026g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3067e(HA3 ha3) {
                super(1);
                this.f13026g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13026g.f13013k.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$a$f */
        /* loaded from: classes3.dex */
        public static final class C3068f extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13027g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3068f(HA3 ha3) {
                super(1);
                this.f13027g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13027g.f13014l.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3062a(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13021c = ha3;
            C34189La2 m96626a = C34189La2.m96626a(view);
            Intrinsics.checkNotNullExpressionValue(m96626a, "bind(view)");
            this.f13020b = m96626a;
            Button button = m96626a.f21702h;
            Intrinsics.checkNotNullExpressionValue(button, "binding.sleepWake");
            C34585Ms2.m94661j(button, new C3063a(ha3));
            Button button2 = m96626a.f21696b;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.diagnostics");
            C34585Ms2.m94661j(button2, new C3064b(ha3));
            Button button3 = m96626a.f21697c;
            Intrinsics.checkNotNullExpressionValue(button3, "binding.faq");
            C34585Ms2.m94661j(button3, new C3065c(ha3));
            Button button4 = m96626a.f21703i;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.unpair");
            C34585Ms2.m94661j(button4, new C3066d(ha3));
            Button button5 = m96626a.f21698d;
            Intrinsics.checkNotNullExpressionValue(button5, "binding.pair");
            C34585Ms2.m94661j(button5, new C3067e(ha3));
            Button button6 = m96626a.f21699e;
            Intrinsics.checkNotNullExpressionValue(button6, "binding.reset");
            C34585Ms2.m94661j(button6, new C3068f(ha3));
            ha3.f13018p = this;
        }

        /* renamed from: a */
        public final void m104212a(boolean z) {
            this.f13020b.f21702h.setEnabled(z);
            this.f13020b.f21703i.setEnabled(z);
            this.f13020b.f21698d.setEnabled(z);
            this.f13020b.f21699e.setEnabled(z);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            m104212a(this.f13021c.m104215w());
            Object m105816c = this.f13021c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C19712dH)) {
                m105816c = null;
            }
            C19712dH c19712dH = (C19712dH) m105816c;
            if (c19712dH != null) {
                Button button = this.f13020b.f21702h;
                Intrinsics.checkNotNullExpressionValue(button, "binding.sleepWake");
                C49520tu6.show$default(button, c19712dH.m44457b(), 0, 2, null);
                this.f13020b.f21702h.setText(c19712dH.m44450i());
                this.f13020b.f21700f.setText(c19712dH.m44452g());
                Button button2 = this.f13020b.f21696b;
                Intrinsics.checkNotNullExpressionValue(button2, "binding.diagnostics");
                C49520tu6.show$default(button2, c19712dH.m44451h(), 0, 2, null);
                Button button3 = this.f13020b.f21697c;
                Intrinsics.checkNotNullExpressionValue(button3, "binding.faq");
                String m44453f = c19712dH.m44453f();
                if (m44453f != null && m44453f.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                C49520tu6.show$default(button3, !z, 0, 2, null);
                Button button4 = this.f13020b.f21703i;
                Intrinsics.checkNotNullExpressionValue(button4, "binding.unpair");
                C49520tu6.show$default(button4, c19712dH.m44455d(), 0, 2, null);
                Button button5 = this.f13020b.f21698d;
                Intrinsics.checkNotNullExpressionValue(button5, "binding.pair");
                C49520tu6.show$default(button5, c19712dH.m44456c(), 0, 2, null);
                Button button6 = this.f13020b.f21699e;
                Intrinsics.checkNotNullExpressionValue(button6, "binding.reset");
                C49520tu6.show$default(button6, c19712dH.m44454e(), 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LHA3$b;", "", "", "ANIMATION_DURATION_MS", "J", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "INTERPOLATOR", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "", "MAP_ENDING_ZOOM_LEVEL", "F", "METERS_PER_KILOMETER", "METERS_PER_MILE", "Lkotlin/text/Regex;", "NUMBER_REGEX", "Lkotlin/text/Regex;", "<init>", "()V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HA3$b */
    /* loaded from: classes3.dex */
    public static final class C3069b {
        public /* synthetic */ C3069b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3069b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002J\f\u0010\u0012\u001a\u00020\u0010*\u00020\u0010H\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LHA3$c;", "Lw1;", "", "position", "", "bind", "batteryLevel", "distance", "tripDistance", "Lkotlin/Function1;", "", "", "distanceFormatter", "j", "(IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "", "", "o", "p", "LRa2;", "b", "LRa2;", "binding", "Landroid/animation/AnimatorSet;", "c", "Landroid/animation/AnimatorSet;", "animator", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$DetailsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n1#4:354\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$DetailsViewHolder\n*L\n124#1:349\n124#1:350,4\n*E\n"})
    /* renamed from: HA3$c */
    /* loaded from: classes3.dex */
    public final class C3070c extends C29735w1 {

        /* renamed from: b */
        public final C35593Ra2 f13028b;

        /* renamed from: c */
        public AnimatorSet f13029c;

        /* renamed from: d */
        public final /* synthetic */ HA3 f13030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3070c(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13030d = ha3;
            C35593Ra2 m86611a = C35593Ra2.m86611a(view);
            Intrinsics.checkNotNullExpressionValue(m86611a, "bind(view)");
            this.f13028b = m86611a;
        }

        /* renamed from: k */
        public static final void m104206k(C3070c this$0, ValueAnimator anim) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(anim, "anim");
            TextView textView = this$0.f13028b.f32226b;
            Context context = this$0.itemView.getContext();
            int i = C45871nl4.battery_percent;
            Object animatedValue = anim.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            textView.setText(context.getString(i, animatedValue));
        }

        /* renamed from: l */
        public static final void m104205l(C3070c this$0, ValueAnimator anim) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(anim, "anim");
            BatteryViewV2 batteryViewV2 = this$0.f13028b.f32229e;
            Object animatedValue = anim.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            batteryViewV2.setBatteryLevel(((Float) animatedValue).floatValue());
        }

        /* renamed from: m */
        public static final void m104204m(C3070c this$0, Function1 distanceFormatter, ValueAnimator anim) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(distanceFormatter, "$distanceFormatter");
            Intrinsics.checkNotNullParameter(anim, "anim");
            TextView textView = this$0.f13028b.f32237m;
            Object animatedValue = anim.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setText((CharSequence) distanceFormatter.invoke((Float) animatedValue));
        }

        /* renamed from: n */
        public static final void m104203n(C3070c this$0, Function1 distanceFormatter, ValueAnimator anim) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(distanceFormatter, "$distanceFormatter");
            Intrinsics.checkNotNullParameter(anim, "anim");
            TextView textView = this$0.f13028b.f32239o;
            Object animatedValue = anim.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setText((CharSequence) distanceFormatter.invoke((Float) animatedValue));
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
            if (r4 != false) goto L25;
         */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            ConstraintLayout.LayoutParams layoutParams;
            boolean z;
            int i2;
            Object m105816c = this.f13030d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C20006eL)) {
                m105816c = null;
            }
            C20006eL c20006eL = (C20006eL) m105816c;
            if (c20006eL != null) {
                this.f13028b.f32233i.setImageDrawable(c20006eL.m43023f());
                ViewGroup.LayoutParams layoutParams2 = this.f13028b.f32233i.getLayoutParams();
                if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    if (c20006eL.m43026c() != BirdModel.BIRDBIKE_UNPAIRED && c20006eL.m43026c() != BirdModel.BIRDBIKE_PAIRABLE) {
                        ImageView imageView = this.f13028b.f32233i;
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
                        i2 = C49520tu6.m11247d(imageView, 18);
                    } else {
                        i2 = 0;
                    }
                    layoutParams.setMarginEnd(i2);
                }
                this.f13028b.f32231g.setText(c20006eL.m43025d());
                Integer m43021h = c20006eL.m43021h();
                boolean z2 = true;
                if (m43021h != null) {
                    int intValue = m43021h.intValue();
                    if (c20006eL.m43026c() == BirdModel.ES500 && intValue <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                m43021h = null;
                if (m43021h == null) {
                    z2 = false;
                }
                TextView textView = this.f13028b.f32239o;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.trip");
                C49520tu6.show$default(textView, z2, 0, 2, null);
                TextView textView2 = this.f13028b.f32240p;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tripLabel");
                C49520tu6.show$default(textView2, z2, 0, 2, null);
                m104207j(c20006eL.m43027b(), c20006eL.m43024e(), c20006eL.m43021h(), c20006eL.m43022g());
            }
        }

        /* renamed from: j */
        public final void m104207j(int i, int i2, Integer num, final Function1<? super Number, String> function1) {
            float f;
            AnimatorSet animatorSet = this.f13029c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            CharSequence text = this.f13028b.f32226b.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.battery.text");
            ValueAnimator ofInt = ValueAnimator.ofInt((int) m104202o(text), i);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: IA3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HA3.C3070c.m104206k(HA3.C3070c.this, valueAnimator);
                }
            });
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f13028b.f32229e.m54764f(), i / 100.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: JA3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HA3.C3070c.m104205l(HA3.C3070c.this, valueAnimator);
                }
            });
            CharSequence text2 = this.f13028b.f32237m.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "binding.ridden.text");
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m104201p(m104202o(text2)), i2);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: KA3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HA3.C3070c.m104204m(HA3.C3070c.this, function1, valueAnimator);
                }
            });
            float[] fArr = new float[2];
            CharSequence text3 = this.f13028b.f32239o.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "binding.trip.text");
            fArr[0] = m104201p(m104202o(text3));
            if (num != null) {
                f = num.intValue();
            } else {
                f = 0.0f;
            }
            fArr[1] = f;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: LA3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HA3.C3070c.m104203n(HA3.C3070c.this, function1, valueAnimator);
                }
            });
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(1000L);
            animatorSet2.setInterpolator(HA3.f13004t);
            animatorSet2.playTogether(ofInt, ofFloat, ofFloat2, ofFloat3);
            animatorSet2.start();
            this.f13029c = animatorSet2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
            r5 = kotlin.text.StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(r5);
         */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final float m104202o(CharSequence charSequence) {
            MatchGroupCollection groups;
            MatchGroup matchGroup;
            Float floatOrNull;
            MatchResult find$default = Regex.find$default(HA3.f13003s, charSequence, 0, 2, null);
            if (find$default == null || (groups = find$default.getGroups()) == null || (matchGroup = groups.get(1)) == null || (r5 = matchGroup.getValue()) == null || floatOrNull == null) {
                return 0.0f;
            }
            return floatOrNull.floatValue();
        }

        /* renamed from: p */
        public final float m104201p(float f) {
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            return f * (c51916xx1.m4389w(locale) ? 1609.34f : 1000.0f);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LHA3$d;", "Lw1;", "", "position", "", "bind", "LIb2;", "b", "LIb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$FirmwareVersionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$FirmwareVersionViewHolder\n*L\n280#1:349\n280#1:350,4\n*E\n"})
    /* renamed from: HA3$d */
    /* loaded from: classes3.dex */
    public final class C3071d extends C29735w1 {

        /* renamed from: b */
        public final C33496Ib2 f13031b;

        /* renamed from: c */
        public final /* synthetic */ HA3 f13032c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$d$a */
        /* loaded from: classes3.dex */
        public static final class C3072a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13033g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3072a(HA3 ha3) {
                super(1);
                this.f13033g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13033g.f13009g.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3071d(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13032c = ha3;
            C33496Ib2 m101897a = C33496Ib2.m101897a(view);
            Intrinsics.checkNotNullExpressionValue(m101897a, "bind(view)");
            this.f13031b = m101897a;
            TextView textView = m101897a.f15928e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.updateLabel");
            C34585Ms2.m94661j(textView, new C3072a(ha3));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f13032c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C4396KL)) {
                m105816c = null;
            }
            C4396KL c4396kl = (C4396KL) m105816c;
            if (c4396kl != null) {
                TextView textView = this.f13031b.f15928e;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.updateLabel");
                C49520tu6.show$default(textView, c4396kl.m99008b(), 0, 2, null);
                this.f13031b.f15925b.setText(c4396kl.m99007c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LHA3$e;", "Lw1;", "", "position", "", "bind", "LIc2;", "b", "LIc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$LastRiddenViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$LastRiddenViewHolder\n*L\n256#1:349\n256#1:350,4\n*E\n"})
    /* renamed from: HA3$e */
    /* loaded from: classes3.dex */
    public final class C3073e extends C29735w1 {

        /* renamed from: b */
        public final C33505Ic2 f13034b;

        /* renamed from: c */
        public final /* synthetic */ HA3 f13035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3073e(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13035c = ha3;
            C33505Ic2 m101889a = C33505Ic2.m101889a(view);
            Intrinsics.checkNotNullExpressionValue(m101889a, "bind(view)");
            this.f13034b = m101889a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f13034b.f15935b;
            Object m105816c = this.f13035c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LHA3$f;", "Lw1;", "", "position", "", "bind", "Lmd2;", "b", "Lmd2;", "binding", "LfM2;", "c", "LfM2;", "marker", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$LocationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n1#4:354\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$LocationViewHolder\n*L\n229#1:349\n229#1:350,4\n*E\n"})
    /* renamed from: HA3$f */
    /* loaded from: classes3.dex */
    public final class C3074f extends C29735w1 {

        /* renamed from: b */
        public final C45196md2 f13036b;

        /* renamed from: c */
        public C40889fM2 f13037c;

        /* renamed from: d */
        public final /* synthetic */ HA3 f13038d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3074f(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13038d = ha3;
            C45196md2 m25307a = C45196md2.m25307a(view);
            Intrinsics.checkNotNullExpressionValue(m25307a, "bind(view)");
            this.f13036b = m25307a;
            C38500bM2.m64632a(view.getContext());
            m25307a.f98451e.m50725b(null);
        }

        /* renamed from: b */
        public static final void m104199b(C3074f this$0, LatLng latLng, C39011cD1 map) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(latLng, "$latLng");
            Intrinsics.checkNotNullParameter(map, "map");
            C40889fM2 c40889fM2 = this$0.f13037c;
            if (c40889fM2 == null) {
                this$0.f13037c = map.m61685c(new MarkerOptions().m50657N0(C6780QT.m88494b(C41077fg4.marker_my_bird)).m50644u(0.5f, 0.89f).m50643u1(latLng));
            } else if (c40889fM2 != null) {
                c40889fM2.m41521m(latLng);
            }
            map.m61682f(C48149rc0.m15705e(latLng, 15.5f));
        }

        @Override // p000.C29735w1
        @SuppressLint({"SetTextI18n"})
        public void bind(int i) {
            Object m105816c = this.f13038d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C10236ZL)) {
                m105816c = null;
            }
            C10236ZL c10236zl = (C10236ZL) m105816c;
            if (c10236zl != null) {
                String m73293a = c10236zl.m73293a();
                String m73292b = c10236zl.m73292b();
                final LatLng m73291c = c10236zl.m73291c();
                TextView textView = this.f13036b.f98448b;
                textView.setText(m73293a + "\n" + m73292b);
                this.f13036b.f98451e.m50726a(new InterfaceC36350Ug3() { // from class: MA3
                    @Override // p000.InterfaceC36350Ug3
                    public final void onMapReady(C39011cD1 c39011cD1) {
                        HA3.C3074f.m104199b(HA3.C3074f.this, m73291c, c39011cD1);
                    }
                });
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LHA3$g;", "Lw1;", "", "position", "", "bind", "LSa2;", "b", "LSa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$NicknameViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$NicknameViewHolder\n*L\n268#1:349\n268#1:350,4\n*E\n"})
    /* renamed from: HA3$g */
    /* loaded from: classes3.dex */
    public final class C3075g extends C29735w1 {

        /* renamed from: b */
        public final C35827Sa2 f13039b;

        /* renamed from: c */
        public final /* synthetic */ HA3 f13040c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$g$a */
        /* loaded from: classes3.dex */
        public static final class C3076a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13041g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3076a(HA3 ha3) {
                super(1);
                this.f13041g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13041g.f13008f.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3075g(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13040c = ha3;
            C35827Sa2 m85221a = C35827Sa2.m85221a(view);
            Intrinsics.checkNotNullExpressionValue(m85221a, "bind(view)");
            this.f13039b = m85221a;
            TextView textView = m85221a.f33932e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.renameLabel");
            C34585Ms2.m94661j(textView, new C3076a(ha3));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f13039b.f33931d;
            Object m105816c = this.f13040c.m94545o().m109397e(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LHA3$h;", "Lw1;", "Llf2;", "b", "Llf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HA3$h */
    /* loaded from: classes3.dex */
    public final class C3077h extends C29735w1 {

        /* renamed from: b */
        public final C44623lf2 f13042b;

        /* renamed from: c */
        public final /* synthetic */ HA3 f13043c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$h$a */
        /* loaded from: classes3.dex */
        public static final class C3078a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13044g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3078a(HA3 ha3) {
                super(1);
                this.f13044g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13044g.f13017o.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3077h(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13043c = ha3;
            C44623lf2 m27021a = C44623lf2.m27021a(view);
            Intrinsics.checkNotNullExpressionValue(m27021a, "bind(view)");
            this.f13042b = m27021a;
            Button root = m27021a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C3078a(ha3));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LHA3$i;", "Lw1;", "Llf2;", "b", "Llf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HA3$i */
    /* loaded from: classes3.dex */
    public final class C3079i extends C29735w1 {

        /* renamed from: b */
        public final C44623lf2 f13045b;

        /* renamed from: c */
        public final /* synthetic */ HA3 f13046c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$i$a */
        /* loaded from: classes3.dex */
        public static final class C3080a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13047g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3080a(HA3 ha3) {
                super(1);
                this.f13047g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13047g.f13015m.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3079i(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13046c = ha3;
            C44623lf2 m27021a = C44623lf2.m27021a(view);
            Intrinsics.checkNotNullExpressionValue(m27021a, "bind(view)");
            this.f13045b = m27021a;
            Button root = m27021a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C3080a(ha3));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LHA3$j;", "Lw1;", "LLf2;", "b", "LLf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HA3$j */
    /* loaded from: classes3.dex */
    public final class C3081j extends C29735w1 {

        /* renamed from: b */
        public final C34234Lf2 f13048b;

        /* renamed from: c */
        public final /* synthetic */ HA3 f13049c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HA3$j$a */
        /* loaded from: classes3.dex */
        public static final class C3082a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ HA3 f13050g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3082a(HA3 ha3) {
                super(1);
                this.f13050g = ha3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f13050g.f13006d.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3081j(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13049c = ha3;
            C34234Lf2 m96512a = C34234Lf2.m96512a(view);
            Intrinsics.checkNotNullExpressionValue(m96512a, "bind(view)");
            this.f13048b = m96512a;
            TextView root = m96512a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C3082a(ha3));
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LHA3$k;", "Lw1;", "", "position", "", "bind", "LNf2;", "b", "LNf2;", "binding", "", "c", "Z", "isBinding", "Landroid/view/View;", "view", "<init>", "(LHA3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$TamperViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$TamperViewHolder\n*L\n207#1:349\n207#1:350,4\n*E\n"})
    /* renamed from: HA3$k */
    /* loaded from: classes3.dex */
    public final class C3083k extends C29735w1 {

        /* renamed from: b */
        public final C34702Nf2 f13051b;

        /* renamed from: c */
        public boolean f13052c;

        /* renamed from: d */
        public final /* synthetic */ HA3 f13053d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: HA3$k$a */
        /* loaded from: classes3.dex */
        public static final class C3084a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ HA3 f13055h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3084a(HA3 ha3) {
                super(2);
                this.f13055h = ha3;
            }

            /* renamed from: a */
            public final void m104197a(CompoundButton compoundButton, boolean z) {
                if (C3083k.this.f13052c) {
                    return;
                }
                this.f13055h.f13005c.onNext(Boolean.valueOf(z));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m104197a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3083k(HA3 ha3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13053d = ha3;
            C34702Nf2 m93592a = C34702Nf2.m93592a(view);
            Intrinsics.checkNotNullExpressionValue(m93592a, "bind(view)");
            this.f13051b = m93592a;
            Switch r3 = m93592a.f24959e;
            Intrinsics.checkNotNullExpressionValue(r3, "binding.tamperSwitch");
            C34585Ms2.m94663h(r3, new C3084a(ha3));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int i2;
            this.f13052c = true;
            Object m105816c = this.f13053d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Boolean)) {
                m105816c = null;
            }
            Boolean bool = (Boolean) m105816c;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.f13051b.f24959e.setChecked(booleanValue);
                TextView textView = this.f13051b.f24958d;
                Context context = this.itemView.getContext();
                if (booleanValue) {
                    i2 = C45871nl4.owned_bird_detail_tamper_alarm_active;
                } else {
                    i2 = C45871nl4.owned_bird_detail_tamper_alarm_inactive;
                }
                textView.setText(context.getString(i2));
            }
            this.f13052c = false;
        }
    }

    public HA3() {
        C24558d<Boolean> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Boolean>()");
        this.f13005c = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f13006d = m31902e2;
        C24558d<Unit> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Unit>()");
        this.f13007e = m31902e3;
        C24558d<Unit> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Unit>()");
        this.f13008f = m31902e4;
        C24558d<Unit> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Unit>()");
        this.f13009g = m31902e5;
        C24558d<Unit> m31902e6 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e6, "create<Unit>()");
        this.f13010h = m31902e6;
        C24558d<Unit> m31902e7 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e7, "create<Unit>()");
        this.f13011i = m31902e7;
        C24558d<Unit> m31902e8 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e8, "create<Unit>()");
        this.f13012j = m31902e8;
        C24558d<Unit> m31902e9 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e9, "create<Unit>()");
        this.f13013k = m31902e9;
        C24558d<Unit> m31902e10 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e10, "create<Unit>()");
        this.f13014l = m31902e10;
        C24558d<Unit> m31902e11 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e11, "create<Unit>()");
        this.f13015m = m31902e11;
        C24558d<Unit> m31902e12 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e12, "create<Unit>()");
        this.f13016n = m31902e12;
        C24558d<Unit> m31902e13 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e13, "create<Unit>()");
        this.f13017o = m31902e13;
        this.f13019q = true;
    }

    /* renamed from: A */
    public final Observable<Unit> m104225A() {
        Observable<Unit> hide = this.f13017o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "resetMaintenanceIndicatorSubject.hide()");
        return hide;
    }

    /* renamed from: B */
    public final Observable<Unit> m104224B() {
        Observable<Unit> hide = this.f13016n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "resetTotalOdometerSubject.hide()");
        return hide;
    }

    /* renamed from: C */
    public final Observable<Unit> m104223C() {
        Observable<Unit> hide = this.f13015m.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "resetTripOdometerSubject.hide()");
        return hide;
    }

    /* renamed from: D */
    public final void m104222D(boolean z) {
        this.f13019q = z;
        C3062a c3062a = this.f13018p;
        if (c3062a != null) {
            c3062a.m104212a(z);
        }
    }

    /* renamed from: E */
    public final Observable<Unit> m104221E() {
        Observable<Unit> hide = this.f13007e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "sleepWakeClicksSubject.hide()");
        return hide;
    }

    /* renamed from: F */
    public final Observable<Unit> m104220F() {
        Observable<Unit> hide = this.f13014l.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "resetClicksSubject.hide()");
        return hide;
    }

    /* renamed from: H */
    public final Observable<Unit> m104219H() {
        Observable<Unit> hide = this.f13006d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "supportClicksSubject.hide()");
        return hide;
    }

    /* renamed from: J */
    public final Observable<Boolean> m104218J() {
        Observable<Boolean> hide = this.f13005c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "tamperCheckedChangeSubject.hide()");
        return hide;
    }

    /* renamed from: K */
    public final Observable<Unit> m104217K() {
        Observable<Unit> hide = this.f13012j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "unpairClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new QA3());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new NA3();
    }

    /* renamed from: v */
    public final Observable<Unit> m104216v() {
        return this.f13009g.hide();
    }

    /* renamed from: w */
    public final boolean m104215w() {
        return this.f13019q;
    }

    /* renamed from: x */
    public final Observable<Unit> m104214x() {
        return this.f13008f.hide();
    }

    /* renamed from: y */
    public final Observable<Unit> m104213y() {
        Observable<Unit> hide = this.f13013k.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "pairClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31698Aj4.item_bird_details ? new C3070c(this, m41761u) : i == C31698Aj4.item_tamper_alarm ? new C3083k(this, m41761u) : i == C31698Aj4.item_location ? new C3074f(this, m41761u) : i == C31698Aj4.item_last_ridden ? new C3073e(this, m41761u) : i == C31698Aj4.item_bird_nickname ? new C3075g(this, m41761u) : i == C31698Aj4.item_firmware_version ? new C3071d(this, m41761u) : i == C31698Aj4.item_support ? new C3081j(this, m41761u) : i == C31698Aj4.item_actions ? new C3062a(this, m41761u) : i == C31698Aj4.item_reset_trip_odometer ? new C3079i(this, m41761u) : i == C31698Aj4.item_reset_service_reminder ? new C3077h(this, m41761u) : new C29735w1(m41761u);
    }
}
