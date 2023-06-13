package co.bird.android.feature.birdplus.p011v1.purchased;

import android.os.Bundle;
import android.widget.Button;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.airbnb.lottie.LottieAnimationView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LeR;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LfR;", TransferTable.COLUMN_STATE, "Q", "Lio/reactivex/Observable;", "doneClicks", "LdR;", "j", "LdR;", "P", "()LdR;", "setPresenter", "(LdR;)V", "presenter", "Lc3;", "k", "Lc3;", "binding", "", "l", "Lkotlin/Lazy;", "e9", "()Ljava/lang/String;", "birdSubscriptionPlanId", "<init>", "()V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.birdplus.v1.purchased.BirdPlusPurchasedActivity */
/* loaded from: classes3.dex */
public final class BirdPlusPurchasedActivity extends BaseActivityLite implements InterfaceC20040eR {

    /* renamed from: j */
    public C19750dR f63369j;

    /* renamed from: k */
    public C13382c3 f63370k;

    /* renamed from: l */
    public final Lazy f63371l;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.birdplus.v1.purchased.BirdPlusPurchasedActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14582a extends Lambda implements Function0<String> {
        public C14582a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String stringExtra = BirdPlusPurchasedActivity.this.getIntent().getStringExtra("bird_plus_user_subscription_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            C41318g46.m40163a("computed birdSubscriptionPlanId to be " + stringExtra, new Object[0]);
            return stringExtra;
        }
    }

    public BirdPlusPurchasedActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14582a());
        this.f63371l = lazy;
    }

    /* renamed from: P */
    public final C19750dR m58681P() {
        C19750dR c19750dR = this.f63369j;
        if (c19750dR != null) {
            return c19750dR;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(InterfaceC20400fR state) {
        BirdPlusDisplayView display;
        AssetMedia assetMedia;
        AssetMedia assetMedia2;
        AssetMedia assetMedia3;
        Intrinsics.checkNotNullParameter(state, "state");
        C13382c3 c13382c3 = null;
        if (state instanceof C41294g22) {
            C13382c3 c13382c32 = this.f63370k;
            if (c13382c32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c13382c32 = null;
            }
            LinearProgressIndicator linearProgressIndicator = c13382c32.f60010g;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
            C49520tu6.show$default(linearProgressIndicator, false, 0, 2, null);
        } else if (state instanceof C32020Bt2) {
            C13382c3 c13382c33 = this.f63370k;
            if (c13382c33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c13382c33 = null;
            }
            LinearProgressIndicator linearProgressIndicator2 = c13382c33.f60010g;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator2, "binding.progressBar");
            C49520tu6.show$default(linearProgressIndicator2, true, 0, 2, null);
        } else if (state instanceof C35867Se6) {
            C41318g46.m40163a("Updating purchased screen ui with state " + state, new Object[0]);
            C13382c3 c13382c34 = this.f63370k;
            if (c13382c34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c13382c34 = null;
            }
            LinearProgressIndicator linearProgressIndicator3 = c13382c34.f60010g;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator3, "binding.progressBar");
            C49520tu6.show$default(linearProgressIndicator3, false, 0, 2, null);
            BirdPlusSubscriptionPlanView subscriptionPlan = ((C35867Se6) state).m85162b().getSubscriptionPlan();
            if (subscriptionPlan != null && (display = subscriptionPlan.getDisplay()) != null) {
                LegacyAsset purchasedHeroBottomImage = display.getPurchasedHeroBottomImage();
                LegacyAsset purchasedHeroTopImage = display.getPurchasedHeroTopImage();
                LegacyAsset purchasedHeroAnimation = display.getPurchasedHeroAnimation();
                Integer purchasedHeroTopColor = display.getPurchasedHeroTopColor();
                Integer purchasedHeroBottomColor = display.getPurchasedHeroBottomColor();
                if (purchasedHeroAnimation != null && purchasedHeroTopColor != null && purchasedHeroBottomColor != null) {
                    C13382c3 c13382c35 = this.f63370k;
                    if (c13382c35 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c35 = null;
                    }
                    c13382c35.f60011h.setBackgroundColor(purchasedHeroTopColor.intValue());
                    C13382c3 c13382c36 = this.f63370k;
                    if (c13382c36 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c36 = null;
                    }
                    LottieAnimationView lottieAnimationView = c13382c36.f60008e;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.heroImage");
                    AssetMedia media = purchasedHeroAnimation.getMedia();
                    if (purchasedHeroTopImage != null) {
                        assetMedia3 = purchasedHeroTopImage.getMedia();
                    } else {
                        assetMedia3 = null;
                    }
                    C47331qD2.m17898a(lottieAnimationView, media, assetMedia3);
                    C13382c3 c13382c37 = this.f63370k;
                    if (c13382c37 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c37 = null;
                    }
                    c13382c37.f60005b.setBackgroundColor(purchasedHeroBottomColor.intValue());
                    C13382c3 c13382c38 = this.f63370k;
                    if (c13382c38 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c38 = null;
                    }
                    LottieAnimationView lottieAnimationView2 = c13382c38.f60011h;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "binding.topImage");
                    C49520tu6.show$default(lottieAnimationView2, true, 0, 2, null);
                    C13382c3 c13382c39 = this.f63370k;
                    if (c13382c39 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c39 = null;
                    }
                    LottieAnimationView lottieAnimationView3 = c13382c39.f60008e;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "binding.heroImage");
                    C49520tu6.show$default(lottieAnimationView3, true, 0, 2, null);
                    C13382c3 c13382c310 = this.f63370k;
                    if (c13382c310 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c310 = null;
                    }
                    LottieAnimationView lottieAnimationView4 = c13382c310.f60005b;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView4, "binding.bottomImage");
                    C49520tu6.show$default(lottieAnimationView4, true, 0, 2, null);
                } else if (purchasedHeroBottomImage != null) {
                    C13382c3 c13382c311 = this.f63370k;
                    if (c13382c311 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c311 = null;
                    }
                    LottieAnimationView lottieAnimationView5 = c13382c311.f60011h;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView5, "binding.topImage");
                    if (purchasedHeroTopImage != null) {
                        assetMedia2 = purchasedHeroTopImage.getMedia();
                    } else {
                        assetMedia2 = null;
                    }
                    C47331qD2.setMedia$default(lottieAnimationView5, assetMedia2, null, 2, null);
                    C13382c3 c13382c312 = this.f63370k;
                    if (c13382c312 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c312 = null;
                    }
                    LottieAnimationView lottieAnimationView6 = c13382c312.f60005b;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView6, "binding.bottomImage");
                    C47331qD2.setMedia$default(lottieAnimationView6, purchasedHeroBottomImage.getMedia(), null, 2, null);
                    C13382c3 c13382c313 = this.f63370k;
                    if (c13382c313 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c313 = null;
                    }
                    LottieAnimationView lottieAnimationView7 = c13382c313.f60011h;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView7, "binding.topImage");
                    C49520tu6.show$default(lottieAnimationView7, true, 0, 2, null);
                    C13382c3 c13382c314 = this.f63370k;
                    if (c13382c314 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c314 = null;
                    }
                    LottieAnimationView lottieAnimationView8 = c13382c314.f60008e;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView8, "binding.heroImage");
                    C49520tu6.m11232s(lottieAnimationView8, false, 4);
                    C13382c3 c13382c315 = this.f63370k;
                    if (c13382c315 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c315 = null;
                    }
                    LottieAnimationView lottieAnimationView9 = c13382c315.f60005b;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView9, "binding.bottomImage");
                    C49520tu6.show$default(lottieAnimationView9, true, 0, 2, null);
                } else {
                    C13382c3 c13382c316 = this.f63370k;
                    if (c13382c316 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c316 = null;
                    }
                    LottieAnimationView lottieAnimationView10 = c13382c316.f60011h;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView10, "binding.topImage");
                    if (purchasedHeroTopImage != null) {
                        assetMedia = purchasedHeroTopImage.getMedia();
                    } else {
                        assetMedia = null;
                    }
                    C47331qD2.setMedia$default(lottieAnimationView10, assetMedia, null, 2, null);
                    C13382c3 c13382c317 = this.f63370k;
                    if (c13382c317 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c317 = null;
                    }
                    LottieAnimationView lottieAnimationView11 = c13382c317.f60011h;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView11, "binding.topImage");
                    C49520tu6.show$default(lottieAnimationView11, true, 0, 2, null);
                    C13382c3 c13382c318 = this.f63370k;
                    if (c13382c318 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c318 = null;
                    }
                    LottieAnimationView lottieAnimationView12 = c13382c318.f60008e;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView12, "binding.heroImage");
                    C49520tu6.m11232s(lottieAnimationView12, false, 4);
                    C13382c3 c13382c319 = this.f63370k;
                    if (c13382c319 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c13382c319 = null;
                    }
                    LottieAnimationView lottieAnimationView13 = c13382c319.f60005b;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView13, "binding.bottomImage");
                    C49520tu6.m11232s(lottieAnimationView13, false, 4);
                }
                C13382c3 c13382c320 = this.f63370k;
                if (c13382c320 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c13382c3 = c13382c320;
                }
                c13382c3.f60009f.setText(display.getPurchasedMessage());
            }
        }
    }

    @Override // p000.InterfaceC20040eR
    public Observable<Unit> doneClicks() {
        C13382c3 c13382c3 = this.f63370k;
        if (c13382c3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c13382c3 = null;
        }
        Button button = c13382c3.f60007d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.done");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC20040eR
    /* renamed from: e9 */
    public String mo42883e9() {
        return (String) this.f63371l.getValue();
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13382c3 m61993c = C13382c3.m61993c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m61993c, "inflate(layoutInflater)");
        this.f63370k = m61993c;
        if (m61993c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m61993c = null;
        }
        setContentView(m61993c.getRoot());
        C38453bH0.m64729a().mo14236a(m58989H()).mo14238b(this);
        m58681P().consume(this);
    }
}
