package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.share.internal.C17296a;
import com.google.android.material.card.MaterialCardView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LaP;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/BirdPlusView;", "g4", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "birdPlusClicksRelay", "<init>", "()V", C17296a.f69688o, "b", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aP */
/* loaded from: classes3.dex */
public final class C10669aP extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<BirdPlusView> f50400c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LaP$a;", "Lw1;", "", "position", "", "bind", "LXa2;", "b", "LXa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LaP;Landroid/view/View;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,79:1\n18#2:80\n9#3,4:81\n*S KotlinDebug\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusHeaderViewHolder\n*L\n49#1:80\n49#1:81,4\n*E\n"})
    /* renamed from: aP$a */
    /* loaded from: classes3.dex */
    public final class C10670a extends C29735w1 {

        /* renamed from: b */
        public final C36997Xa2 f50401b;

        /* renamed from: c */
        public final /* synthetic */ C10669aP f50402c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10670a(C10669aP c10669aP, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f50402c = c10669aP;
            C36997Xa2 m76847a = C36997Xa2.m76847a(view);
            Intrinsics.checkNotNullExpressionValue(m76847a, "bind(view)");
            this.f50401b = m76847a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            AssetMedia assetMedia;
            LegacyAsset heroImage;
            LegacyAsset heroAnimation;
            super.bind(i);
            Object m105816c = this.f50402c.m94545o().m109397e(i).m105816c();
            AssetMedia assetMedia2 = null;
            if (!(m105816c instanceof C26509nR)) {
                m105816c = null;
            }
            C26509nR c26509nR = (C26509nR) m105816c;
            if (c26509nR != null) {
                this.f50401b.f43424c.setText(c26509nR.m23781d());
                LottieAnimationView lottieAnimationView = this.f50401b.f43423b;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.heroImage");
                BirdPlusDisplayView display = c26509nR.m23783b().getDisplay();
                if (display != null && (heroAnimation = display.getHeroAnimation()) != null) {
                    assetMedia = heroAnimation.getMedia();
                } else {
                    assetMedia = null;
                }
                BirdPlusDisplayView display2 = c26509nR.m23783b().getDisplay();
                if (display2 != null && (heroImage = display2.getHeroImage()) != null) {
                    assetMedia2 = heroImage.getMedia();
                }
                C47331qD2.m17898a(lottieAnimationView, assetMedia, assetMedia2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LaP$b;", "Lw1;", "", "position", "", "bind", "LTa2;", "b", "LTa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LaP;Landroid/view/View;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,79:1\n18#2:80\n9#3,4:81\n*S KotlinDebug\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusViewHolder\n*L\n72#1:80\n72#1:81,4\n*E\n"})
    /* renamed from: aP$b */
    /* loaded from: classes3.dex */
    public final class C10671b extends C29735w1 {

        /* renamed from: b */
        public final C36061Ta2 f50403b;

        /* renamed from: c */
        public final /* synthetic */ C10669aP f50404c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBirdPlusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n18#2:80\n9#3,4:81\n1#4:85\n*S KotlinDebug\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusViewHolder$1\n*L\n65#1:80\n65#1:81,4\n*E\n"})
        /* renamed from: aP$b$a */
        /* loaded from: classes3.dex */
        public static final class C10672a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C10669aP f50405g;

            /* renamed from: h */
            public final /* synthetic */ C10671b f50406h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10672a(C10669aP c10669aP, C10671b c10671b) {
                super(1);
                this.f50405g = c10669aP;
                this.f50406h = c10671b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                BirdPlusView m23783b;
                C1737E6 m94545o = this.f50405g.m94545o();
                Integer safePosition = this.f50406h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof C26509nR)) {
                        m105816c = null;
                    }
                    C26509nR c26509nR = (C26509nR) m105816c;
                    if (c26509nR == null || (m23783b = c26509nR.m23783b()) == null) {
                        return;
                    }
                    this.f50405g.f50400c.accept(m23783b);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10671b(C10669aP c10669aP, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f50404c = c10669aP;
            C36061Ta2 m83384a = C36061Ta2.m83384a(view);
            Intrinsics.checkNotNullExpressionValue(m83384a, "bind(view)");
            this.f50403b = m83384a;
            MaterialCardView root = m83384a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C10672a(c10669aP, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f50404c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C26509nR)) {
                m105816c = null;
            }
            C26509nR c26509nR = (C26509nR) m105816c;
            if (c26509nR != null) {
                this.f50403b.f35705d.setText(c26509nR.m23781d());
                this.f50403b.f35703b.setText(c26509nR.m23782c());
            }
        }
    }

    public C10669aP() {
        C45168ma4<BirdPlusView> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<BirdPlusView>()");
        this.f50400c = m25409g;
    }

    /* renamed from: g4 */
    public final Observable<BirdPlusView> m71484g4() {
        Observable<BirdPlusView> hide = this.f50400c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdPlusClicksRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C30168xQ());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C47640qk4.item_bird_plus_header ? new C10670a(this, m41761u) : i == C47640qk4.item_bird_plus_card ? new C10671b(this, m41761u) : new C29735w1(m41761u);
    }
}
