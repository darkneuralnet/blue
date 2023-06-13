package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusPerkView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0011\u0018B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m28432d2 = {"LGP;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/BirdPlusView;", "z7", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "footerClicksRelay", "<init>", "()V", C17296a.f69688o, "b", DateTokenConverter.CONVERTER_KEY, "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GP */
/* loaded from: classes3.dex */
public final class C2836GP extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<BirdPlusView> f11854c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGP$a;", "Lw1;", "", "position", "", "bind", "LUa2;", "b", "LUa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGP;Landroid/view/View;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$FooterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n*S KotlinDebug\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$FooterViewHolder\n*L\n100#1:107\n100#1:108,4\n*E\n"})
    /* renamed from: GP$a */
    /* loaded from: classes3.dex */
    public final class C2837a extends C29735w1 {

        /* renamed from: b */
        public final C36295Ua2 f11855b;

        /* renamed from: c */
        public final /* synthetic */ C2836GP f11856c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBirdPlusDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$FooterViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n1#4:112\n*S KotlinDebug\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$FooterViewHolder$1\n*L\n94#1:107\n94#1:108,4\n*E\n"})
        /* renamed from: GP$a$a */
        /* loaded from: classes3.dex */
        public static final class C2838a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C2836GP f11857g;

            /* renamed from: h */
            public final /* synthetic */ C2837a f11858h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2838a(C2836GP c2836gp, C2837a c2837a) {
                super(1);
                this.f11857g = c2836gp;
                this.f11858h = c2837a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f11857g.m94545o();
                Integer safePosition = this.f11858h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof BirdPlusView)) {
                        m105816c = null;
                    }
                    BirdPlusView birdPlusView = (BirdPlusView) m105816c;
                    if (birdPlusView != null) {
                        this.f11857g.f11854c.accept(birdPlusView);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2837a(C2836GP c2836gp, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11856c = c2836gp;
            C36295Ua2 m81342a = C36295Ua2.m81342a(view);
            Intrinsics.checkNotNullExpressionValue(m81342a, "bind(view)");
            this.f11855b = m81342a;
            TextView textView = m81342a.f37564b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.footer");
            C34585Ms2.m94661j(textView, new C2838a(c2836gp, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f11856c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof BirdPlusView)) {
                m105816c = null;
            }
            BirdPlusView birdPlusView = (BirdPlusView) m105816c;
            if (birdPlusView != null) {
                TextView textView = this.f11855b.f37564b;
                BirdPlusSubscriptionPlanView subscriptionPlan = birdPlusView.getSubscriptionPlan();
                if (subscriptionPlan != null) {
                    str = subscriptionPlan.getLegalMessage();
                }
                textView.setText(str);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGP$b;", "Lw1;", "", "position", "", "bind", "LVa2;", "b", "LVa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGP;Landroid/view/View;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n*S KotlinDebug\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$HeaderViewHolder\n*L\n54#1:107\n54#1:108,4\n*E\n"})
    /* renamed from: GP$b */
    /* loaded from: classes3.dex */
    public final class C2839b extends C29735w1 {

        /* renamed from: b */
        public final C36529Va2 f11859b;

        /* renamed from: c */
        public final /* synthetic */ C2836GP f11860c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2839b(C2836GP c2836gp, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11860c = c2836gp;
            C36529Va2 m79737a = C36529Va2.m79737a(view);
            Intrinsics.checkNotNullExpressionValue(m79737a, "bind(view)");
            this.f11859b = m79737a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            AssetMedia assetMedia;
            AssetMedia assetMedia2;
            String str;
            boolean z;
            BirdPlusDisplayView display;
            BirdPlusDisplayView display2;
            LegacyAsset heroImage;
            BirdPlusDisplayView display3;
            LegacyAsset heroAnimation;
            Object m105816c = this.f11860c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C29191uQ)) {
                m105816c = null;
            }
            C29191uQ c29191uQ = (C29191uQ) m105816c;
            if (c29191uQ != null) {
                this.f11859b.f39255c.setText(c29191uQ.m10341c());
                LottieAnimationView lottieAnimationView = this.f11859b.f39254b;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.heroImage");
                BirdPlusSubscriptionPlanView subscriptionPlan = c29191uQ.m10342b().getSubscriptionPlan();
                if (subscriptionPlan != null && (display3 = subscriptionPlan.getDisplay()) != null && (heroAnimation = display3.getHeroAnimation()) != null) {
                    assetMedia = heroAnimation.getMedia();
                } else {
                    assetMedia = null;
                }
                BirdPlusSubscriptionPlanView subscriptionPlan2 = c29191uQ.m10342b().getSubscriptionPlan();
                if (subscriptionPlan2 != null && (display2 = subscriptionPlan2.getDisplay()) != null && (heroImage = display2.getHeroImage()) != null) {
                    assetMedia2 = heroImage.getMedia();
                } else {
                    assetMedia2 = null;
                }
                C47331qD2.m17898a(lottieAnimationView, assetMedia, assetMedia2);
                BirdPlusSubscriptionPlanView subscriptionPlan3 = c29191uQ.m10342b().getSubscriptionPlan();
                if (subscriptionPlan3 != null && (display = subscriptionPlan3.getDisplay()) != null) {
                    str = display.getHeroPillLabel();
                } else {
                    str = null;
                }
                this.f11859b.f39256d.setText(str);
                AppCompatButton appCompatButton = this.f11859b.f39256d;
                Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.heroPillLabel");
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(appCompatButton, z, 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"LGP$c;", "Lw1;", "Landroid/view/View;", "view", "<init>", "(LGP;Landroid/view/View;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: GP$c */
    /* loaded from: classes3.dex */
    public final class C2840c extends C29735w1 {

        /* renamed from: b */
        public final /* synthetic */ C2836GP f11861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2840c(C2836GP c2836gp, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11861b = c2836gp;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGP$d;", "Lw1;", "", "position", "", "bind", "LWa2;", "b", "LWa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGP;Landroid/view/View;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$PerkViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n*S KotlinDebug\n*F\n+ 1 BirdPlusDetailsAdapter.kt\nco/bird/android/feature/birdplus/v1/details/adapter/BirdPlusDetailsAdapter$PerkViewHolder\n*L\n71#1:107\n71#1:108,4\n*E\n"})
    /* renamed from: GP$d */
    /* loaded from: classes3.dex */
    public final class C2841d extends C29735w1 {

        /* renamed from: b */
        public final C36763Wa2 f11862b;

        /* renamed from: c */
        public final /* synthetic */ C2836GP f11863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2841d(C2836GP c2836gp, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11863c = c2836gp;
            C36763Wa2 m78170a = C36763Wa2.m78170a(view);
            Intrinsics.checkNotNullExpressionValue(m78170a, "bind(view)");
            this.f11862b = m78170a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            AssetMedia media;
            Object m105816c = this.f11863c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof BirdPlusPerkView)) {
                m105816c = null;
            }
            BirdPlusPerkView birdPlusPerkView = (BirdPlusPerkView) m105816c;
            if (birdPlusPerkView != null) {
                this.f11862b.f41314b.setText(birdPlusPerkView.getTitle());
                LegacyAsset icon = birdPlusPerkView.getIcon();
                if (icon != null && (media = icon.getMedia()) != null) {
                    str = media.getMediaUrl();
                } else {
                    str = null;
                }
                if (str != null) {
                    Intrinsics.checkNotNullExpressionValue(ComponentCallbacks2C17096a.m53137u(this.f11862b.f41315c).m81653k(str).m16096R0(this.f11862b.f41315c), "{\n          Glide.with(b…o(binding.icon)\n        }");
                    return;
                }
                this.f11862b.f41315c.setImageDrawable(null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public C2836GP() {
        C45168ma4<BirdPlusView> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<BirdPlusView>()");
        this.f11854c = m25409g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C3527IP());
        }
    }

    /* renamed from: z7 */
    public final Observable<BirdPlusView> m105145z7() {
        Observable<BirdPlusView> hide = this.f11854c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "footerClicksRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C47640qk4.item_bird_plus_details_header ? new C2839b(this, m41761u) : i == C47640qk4.item_bird_plus_details_perk_header ? new C2840c(this, m41761u) : i == C47640qk4.item_bird_plus_details_perk ? new C2841d(this, m41761u) : i == C47640qk4.item_bird_plus_details_footer ? new C2837a(this, m41761u) : new C29735w1(m41761u);
    }
}
