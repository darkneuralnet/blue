package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.persistence.nestedstructures.TutorialPage;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24558d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34142Kv0;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u000456\u0018\u001fB\t\b\u0007¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0004J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u000bJ!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010#\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00130\u00130\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001bR%\u0010*\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00040\u00040\u001d8\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00067"}, m28432d2 = {"LKv0;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "item", "Lio/reactivex/Observable;", "", "E", "Lco/bird/android/buava/Optional;", "J", "position", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "", "M", "(Ljava/lang/Integer;Lcom/airbnb/lottie/LottieAnimationView;)V", "", "LuT2;", "c", "Ljava/util/Map;", "A", "()Ljava/util/Map;", "messageListAdapterMap", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "B", "()Lio/reactivex/subjects/d;", "messageListSubject", "LZe4;", "e", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "quizAdapterMap", "f", "D", "quizAnsweredCorrectlySubject", "LPv0;", "g", "LPv0;", "y", "()LPv0;", "setConverter", "(LPv0;)V", "converter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter\n*L\n109#1:189\n109#1:190,4\n*E\n"})
/* renamed from: Kv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34142Kv0 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final Map<Integer, C49846uT2> f20342c = new LinkedHashMap();

    /* renamed from: d */
    public final C24558d<Unit> f20343d;

    /* renamed from: e */
    public final Map<Integer, C37503Ze4> f20344e;

    /* renamed from: f */
    public final C24558d<Integer> f20345f;

    /* renamed from: g */
    public C35312Pv0 f20346g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LKv0$a;", "Lw1;", "", "position", "", "bind", "Lpe2;", "b", "Lpe2;", "binding", "LuT2;", "c", "LuT2;", "adapter", "Landroid/view/View;", "view", "<init>", "(LKv0;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$BulletListViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$BulletListViewHolder\n*L\n155#1:189\n155#1:190,4\n*E\n"})
    /* renamed from: Kv0$a */
    /* loaded from: classes3.dex */
    public final class C4615a extends C29735w1 {

        /* renamed from: b */
        public final C46985pe2 f20347b;

        /* renamed from: c */
        public final C49846uT2 f20348c;

        /* renamed from: d */
        public final /* synthetic */ C34142Kv0 f20349d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4615a(C34142Kv0 c34142Kv0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20349d = c34142Kv0;
            C46985pe2 m19020a = C46985pe2.m19020a(view);
            Intrinsics.checkNotNullExpressionValue(m19020a, "bind(view)");
            this.f20347b = m19020a;
            this.f20348c = new C49846uT2();
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f20349d.m98181A().put(Integer.valueOf(i), this.f20348c);
            this.f20349d.m98180B().onNext(Unit.INSTANCE);
            Object m105816c = this.f20349d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof TutorialPage)) {
                m105816c = null;
            }
            TutorialPage tutorialPage = (TutorialPage) m105816c;
            if (tutorialPage != null) {
                C34142Kv0 c34142Kv0 = this.f20349d;
                this.f20347b.getRoot().setAdapter(this.f20348c);
                this.f20348c.mo24871u(c34142Kv0.m98168y().m89429a(tutorialPage));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"LKv0$b;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "Lqe2;", "b", "Lqe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LKv0;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$ChapterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$ChapterViewHolder\n*L\n167#1:189\n167#1:190,4\n*E\n"})
    /* renamed from: Kv0$b */
    /* loaded from: classes3.dex */
    public final class C4616b extends C29735w1 {

        /* renamed from: b */
        public final C47578qe2 f20350b;

        /* renamed from: c */
        public final /* synthetic */ C34142Kv0 f20351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4616b(C34142Kv0 c34142Kv0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20351c = c34142Kv0;
            C47578qe2 m17287a = C47578qe2.m17287a(view);
            Intrinsics.checkNotNullExpressionValue(m17287a, "bind(view)");
            this.f20350b = m17287a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            AssetMedia media;
            Object m105816c = this.f20351c.m94545o().m109397e(i).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof TutorialPage)) {
                m105816c = null;
            }
            TutorialPage tutorialPage = (TutorialPage) m105816c;
            if (tutorialPage != null) {
                String title = tutorialPage.getTitle();
                if (title != null) {
                    this.f20350b.f105553c.setText(title);
                }
                LegacyAsset asset = tutorialPage.getAsset();
                if (asset != null && (media = asset.getMedia()) != null) {
                    if (!media.isLottieJson()) {
                        ComponentCallbacks2C17096a.m53137u(this.f20350b.f105552b).m81653k(media.getMediaUrl()).m16096R0(this.f20350b.f105552b);
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    LottieAnimationView lottieAnimationView = this.f20350b.f105552b;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.image");
                    C49520tu6.m11239l(lottieAnimationView);
                }
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C34142Kv0 c34142Kv0 = this.f20351c;
            Integer safePosition = getSafePosition();
            LottieAnimationView lottieAnimationView = this.f20350b.f105552b;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.image");
            c34142Kv0.m98172M(safePosition, lottieAnimationView);
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LKv0$c;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "onDetachedFromWindow", "Lre2;", "b", "Lre2;", "binding", "LZe4;", "c", "Lkotlin/Lazy;", C17296a.f69688o, "()LZe4;", "adapter", "Landroid/view/View;", "view", "<init>", "(LKv0;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$QuizViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$QuizViewHolder\n*L\n124#1:189\n124#1:190,4\n*E\n"})
    /* renamed from: Kv0$c */
    /* loaded from: classes3.dex */
    public final class C4617c extends C29735w1 {

        /* renamed from: b */
        public final C48171re2 f20352b;

        /* renamed from: c */
        public final Lazy f20353c;

        /* renamed from: d */
        public final /* synthetic */ C34142Kv0 f20354d;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LZe4;", "b", "()LZe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kv0$c$a */
        /* loaded from: classes3.dex */
        public static final class C4618a extends Lambda implements Function0<C37503Ze4> {

            /* renamed from: g */
            public static final C4618a f20355g = new C4618a();

            public C4618a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final C37503Ze4 invoke() {
                return new C37503Ze4();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4617c(C34142Kv0 c34142Kv0, View view) {
            super(view);
            Lazy lazy;
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20354d = c34142Kv0;
            C48171re2 m15653a = C48171re2.m15653a(view);
            Intrinsics.checkNotNullExpressionValue(m15653a, "bind(view)");
            this.f20352b = m15653a;
            lazy = LazyKt__LazyJVMKt.lazy(C4618a.f20355g);
            this.f20353c = lazy;
        }

        /* renamed from: a */
        public final C37503Ze4 m98167a() {
            return (C37503Ze4) this.f20353c.getValue();
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            AssetMedia assetMedia;
            super.bind(i);
            Object m105816c = this.f20354d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof TutorialPage)) {
                m105816c = null;
            }
            TutorialPage tutorialPage = (TutorialPage) m105816c;
            this.f20354d.m98179C().put(Integer.valueOf(i), m98167a());
            this.f20354d.m98178D().onNext(Integer.valueOf(i));
            if (tutorialPage != null) {
                C34142Kv0 c34142Kv0 = this.f20354d;
                TextView textView = this.f20352b.f107367c;
                String title = tutorialPage.getTitle();
                if (title == null) {
                    title = "";
                }
                textView.setText(title);
                LottieAnimationView lottieAnimationView = this.f20352b.f107366b;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.image");
                LegacyAsset asset = tutorialPage.getAsset();
                if (asset != null) {
                    assetMedia = asset.getMedia();
                } else {
                    assetMedia = null;
                }
                C47331qD2.setMedia$default(lottieAnimationView, assetMedia, null, 2, null);
                this.f20352b.f107368d.setAdapter(m98167a());
                m98167a().mo24871u(c34142Kv0.m98168y().m89429a(tutorialPage));
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C34142Kv0 c34142Kv0 = this.f20354d;
            Integer safePosition = getSafePosition();
            LottieAnimationView lottieAnimationView = this.f20352b.f107366b;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.image");
            c34142Kv0.m98172M(safePosition, lottieAnimationView);
        }

        @Override // p000.C29735w1
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f20354d.m98178D().onNext(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"LKv0$d;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "Lse2;", "b", "Lse2;", "binding", "Landroid/view/View;", "view", "<init>", "(LKv0;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$TitleMessageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$TitleMessageViewHolder\n*L\n82#1:189\n82#1:190,4\n*E\n"})
    /* renamed from: Kv0$d */
    /* loaded from: classes3.dex */
    public final class C4619d extends C29735w1 {

        /* renamed from: b */
        public final C48763se2 f20356b;

        /* renamed from: c */
        public final /* synthetic */ C34142Kv0 f20357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4619d(C34142Kv0 c34142Kv0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20357c = c34142Kv0;
            C48763se2 m13915a = C48763se2.m13915a(view);
            Intrinsics.checkNotNullExpressionValue(m13915a, "bind(view)");
            this.f20356b = m13915a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Unit unit;
            Unit unit2;
            Object m105816c = this.f20357c.m94545o().m109397e(i).m105816c();
            Unit unit3 = null;
            if (!(m105816c instanceof TutorialPage)) {
                m105816c = null;
            }
            TutorialPage tutorialPage = (TutorialPage) m105816c;
            if (tutorialPage != null) {
                LegacyAsset asset = tutorialPage.getAsset();
                if (asset != null) {
                    String mediaUrl = asset.getMedia().getMediaUrl();
                    if (!asset.getMedia().isLottieJson()) {
                        ComponentCallbacks2C17096a.m53137u(this.f20356b.f109061b).m81653k(mediaUrl).m16096R0(this.f20356b.f109061b);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LottieAnimationView lottieAnimationView = this.f20356b.f109061b;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.image");
                    C49520tu6.m11239l(lottieAnimationView);
                }
                String title = tutorialPage.getTitle();
                if (title != null) {
                    this.f20356b.f109063d.setText(title);
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    TextView textView = this.f20356b.f109063d;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
                    C49520tu6.m11239l(textView);
                }
                String message = tutorialPage.getMessage();
                if (message != null) {
                    this.f20356b.f109062c.setText(message);
                    unit3 = Unit.INSTANCE;
                }
                if (unit3 == null) {
                    TextView textView2 = this.f20356b.f109062c;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.message");
                    C49520tu6.m11239l(textView2);
                }
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C34142Kv0 c34142Kv0 = this.f20357c;
            Integer safePosition = getSafePosition();
            LottieAnimationView lottieAnimationView = this.f20356b.f109061b;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.image");
            c34142Kv0.m98172M(safePosition, lottieAnimationView);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"Kv0$e", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$getDiffCallback$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$getDiffCallback$1\n*L\n51#1:189\n51#1:190,4\n*E\n"})
    /* renamed from: Kv0$e */
    /* loaded from: classes3.dex */
    public static final class C4620e implements InterfaceC2152F6 {
        @Override // p000.InterfaceC2152F6
        /* renamed from: a */
        public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
            return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: b */
        public String mo29b(C2637G6 adapterItem) {
            String id;
            Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof TutorialPage)) {
                m105816c = null;
            }
            TutorialPage tutorialPage = (TutorialPage) m105816c;
            if (tutorialPage == null || (id = tutorialPage.getId()) == null) {
                return "";
            }
            return id;
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: c */
        public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return !Intrinsics.areEqual(oldItem.m105816c(), newItem.m105816c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kv0$f */
    /* loaded from: classes3.dex */
    public static final class C4621f extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ int f20359h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4621f(int i) {
            super(1);
            this.f20359h = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C34142Kv0.this.m98181A().get(Integer.valueOf(this.f20359h)) != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kv0$g */
    /* loaded from: classes3.dex */
    public static final class C4622g extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Boolean>> {

        /* renamed from: h */
        public final /* synthetic */ int f20361h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4622g(int i) {
            super(1);
            this.f20361h = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Boolean> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C49846uT2 c49846uT2 = C34142Kv0.this.m98181A().get(Integer.valueOf(this.f20361h));
            if (c49846uT2 != null) {
                return c49846uT2.m10246v();
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "position", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Integer;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kv0$h */
    /* loaded from: classes3.dex */
    public static final class C4623h extends Lambda implements Function1<Integer, InterfaceC23434B<? extends Optional<Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kv0$h$a */
        /* loaded from: classes3.dex */
        public static final class C4624a extends Lambda implements Function1<Boolean, Optional<Boolean>> {

            /* renamed from: g */
            public static final C4624a f20363g = new C4624a();

            public C4624a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<Boolean> invoke(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59032c(it);
            }
        }

        public C4623h() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m98162c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Optional<Boolean>> invoke(Integer position) {
            Intrinsics.checkNotNullParameter(position, "position");
            C37503Ze4 c37503Ze4 = C34142Kv0.this.m98179C().get(position);
            if (c37503Ze4 == null) {
                return Observable.just(Optional.f63040c.m59034a());
            }
            C45168ma4<Boolean> m72820J = c37503Ze4.m72820J();
            final C4624a c4624a = C4624a.f20363g;
            return m72820J.map(new InterfaceC23492o() { // from class: Lv0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m98162c;
                    m98162c = C34142Kv0.C4623h.m98162c(Function1.this, obj);
                    return m98162c;
                }
            });
        }
    }

    public C34142Kv0() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f20343d = m31902e;
        this.f20344e = new LinkedHashMap();
        C24558d<Integer> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Int>()");
        this.f20345f = m31902e2;
    }

    /* renamed from: F */
    public static final boolean m98176F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H */
    public static final InterfaceC23434B m98175H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23434B m98173K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final Map<Integer, C49846uT2> m98181A() {
        return this.f20342c;
    }

    /* renamed from: B */
    public final C24558d<Unit> m98180B() {
        return this.f20343d;
    }

    /* renamed from: C */
    public final Map<Integer, C37503Ze4> m98179C() {
        return this.f20344e;
    }

    /* renamed from: D */
    public final C24558d<Integer> m98178D() {
        return this.f20345f;
    }

    /* renamed from: E */
    public final Observable<Boolean> m98177E(int i) {
        C24558d<Unit> c24558d = this.f20343d;
        final C4621f c4621f = new C4621f(i);
        Observable<Unit> filter = c24558d.filter(new InterfaceC23494q() { // from class: Hv0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m98176F;
                m98176F = C34142Kv0.m98176F(Function1.this, obj);
                return m98176F;
            }
        });
        final C4622g c4622g = new C4622g(i);
        Observable flatMap = filter.flatMap(new InterfaceC23492o() { // from class: Iv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m98175H;
                m98175H = C34142Kv0.m98175H(Function1.this, obj);
                return m98175H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "fun messageListAtBottom(…ssageAtBottom\n      }\n  }");
        return flatMap;
    }

    /* renamed from: J */
    public final Observable<Optional<Boolean>> m98174J() {
        C24558d<Integer> c24558d = this.f20345f;
        final C4623h c4623h = new C4623h();
        Observable flatMap = c24558d.flatMap(new InterfaceC23492o() { // from class: Jv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m98173K;
                m98173K = C34142Kv0.m98173K(Function1.this, obj);
                return m98173K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "fun quizAnsweredCorrectl…onal.of(it) }\n      }\n  }");
        return flatMap;
    }

    /* renamed from: M */
    public final void m98172M(Integer num, LottieAnimationView lottieAnimationView) {
        LegacyAsset asset;
        AssetMedia media;
        C1737E6 m94545o = m94545o();
        if (num != null) {
            Object m105816c = m94545o.m109397e(num.intValue()).m105816c();
            if (!(m105816c instanceof TutorialPage)) {
                m105816c = null;
            }
            TutorialPage tutorialPage = (TutorialPage) m105816c;
            if (tutorialPage != null && (asset = tutorialPage.getAsset()) != null && (media = asset.getMedia()) != null && media.isLottieJson()) {
                lottieAnimationView.setAnimationFromUrl(media.getMediaUrl());
                lottieAnimationView.m53539y();
                lottieAnimationView.setRepeatCount(3);
            }
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C4620e();
    }

    /* renamed from: y */
    public final C35312Pv0 m98168y() {
        C35312Pv0 c35312Pv0 = this.f20346g;
        if (c35312Pv0 != null) {
            return c35312Pv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36837Wi4.item_page_title_message ? new C4619d(this, m41761u) : i == C36837Wi4.item_page_bullet_list ? new C4615a(this, m41761u) : i == C36837Wi4.item_page_chapter ? new C4616b(this, m41761u) : i == C36837Wi4.item_page_quiz ? new C4617c(this, m41761u) : new C29735w1(m41761u);
    }
}
