.class public final Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LeR;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\nH\u0016R\"\u0010\u0013\u001a\u00020\u000c8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LeR;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LfR;",
        "state",
        "Q",
        "Lio/reactivex/Observable;",
        "doneClicks",
        "LdR;",
        "j",
        "LdR;",
        "P",
        "()LdR;",
        "setPresenter",
        "(LdR;)V",
        "presenter",
        "Lc3;",
        "k",
        "Lc3;",
        "binding",
        "",
        "l",
        "Lkotlin/Lazy;",
        "e9",
        "()Ljava/lang/String;",
        "birdSubscriptionPlanId",
        "<init>",
        "()V",
        "bird-plus_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public j:LdR;

.field public k:Lc3;

.field public final l:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity$a;-><init>(Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->l:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final P()LdR;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->j:LdR;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q(LfR;)V
    .locals 13

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lg22;

    const-string v1, "binding.progressBar"

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "binding"

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez p1, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v5

    :cond_0
    iget-object p1, p1, Lc3;->g:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    instance-of v0, p1, LBt2;

    const/4 v6, 0x1

    if-eqz v0, :cond_3

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez p1, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v5

    :cond_2
    iget-object p1, p1, Lc3;->g:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v6, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    instance-of v0, p1, LSe6;

    if-eqz v0, :cond_1b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Updating purchased screen ui with state "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v0, v7}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_4
    iget-object v0, v0, Lc3;->g:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    check-cast p1, LSe6;

    invoke-virtual {p1}, LSe6;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getDisplay()Lco/bird/android/model/persistence/BirdPlusDisplayView;

    move-result-object p1

    if-nez p1, :cond_5

    goto/16 :goto_5

    :cond_5
    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getPurchasedHeroBottomImage()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getPurchasedHeroTopImage()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getPurchasedHeroAnimation()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getPurchasedHeroTopColor()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getPurchasedHeroBottomColor()Ljava/lang/Integer;

    move-result-object v9

    const-string v10, "binding.bottomImage"

    const-string v11, "binding.heroImage"

    const-string v12, "binding.topImage"

    if-eqz v7, :cond_d

    if-eqz v8, :cond_d

    if-eqz v9, :cond_d

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_6
    iget-object v0, v0, Lc3;->h:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_7

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_7
    iget-object v0, v0, Lc3;->e:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v7

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v1

    goto :goto_0

    :cond_8
    move-object v1, v5

    :goto_0
    invoke-static {v0, v7, v1}, LqD2;->a(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_9

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_9
    iget-object v0, v0, Lc3;->b:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_a

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_a
    iget-object v0, v0, Lc3;->h:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_b

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_b
    iget-object v0, v0, Lc3;->e:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_c

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_c
    iget-object v0, v0, Lc3;->b:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_3

    :cond_d
    const/4 v7, 0x4

    if-eqz v0, :cond_14

    iget-object v8, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v8, :cond_e

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v5

    :cond_e
    iget-object v8, v8, Lc3;->h:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v1

    goto :goto_1

    :cond_f
    move-object v1, v5

    :goto_1
    invoke-static {v8, v1, v5, v2, v5}, LqD2;->setMedia$default(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;ILjava/lang/Object;)V

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v1, :cond_10

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_10
    iget-object v1, v1, Lc3;->b:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v0

    invoke-static {v1, v0, v5, v2, v5}, LqD2;->setMedia$default(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;ILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_11

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_11
    iget-object v0, v0, Lc3;->h:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_12

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_12
    iget-object v0, v0, Lc3;->e:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3, v7}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_13

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_13
    iget-object v0, v0, Lc3;->b:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_3

    :cond_14
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_15

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_15
    iget-object v0, v0, Lc3;->h:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v1

    goto :goto_2

    :cond_16
    move-object v1, v5

    :goto_2
    invoke-static {v0, v1, v5, v2, v5}, LqD2;->setMedia$default(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;ILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_17

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_17
    iget-object v0, v0, Lc3;->h:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v3, v2, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_18

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_18
    iget-object v0, v0, Lc3;->e:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3, v7}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_19

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_19
    iget-object v0, v0, Lc3;->b:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3, v7}, Ltu6;->s(Landroid/view/View;ZI)V

    :goto_3
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez v0, :cond_1a

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_1a
    move-object v5, v0

    :goto_4
    iget-object v0, v5, Lc3;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getPurchasedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    nop

    :cond_1b
    :goto_5
    return-void
.end method

.method public doneClicks()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Lc3;->d:Landroid/widget/Button;

    const-string v2, "binding.done"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public e9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lc3;->c(Landroid/view/LayoutInflater;)Lc3;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->k:Lc3;

    if-nez p1, :cond_0

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lc3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, LbH0;->a()LsP$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, LsP$a;->a(LlG2;)LsP;

    move-result-object p1

    invoke-interface {p1, p0}, LsP;->b(Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->P()LdR;

    move-result-object p1

    invoke-virtual {p1, p0}, LdR;->s(LeR;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LfR;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;->Q(LfR;)V

    return-void
.end method
