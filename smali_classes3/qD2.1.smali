.class public final LqD2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a \u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/airbnb/lottie/LottieAnimationView;",
        "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;",
        "media",
        "fallbackMedia",
        "",
        "a",
        "extension_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLottieAnimationView+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimationView+.kt\nco/bird/android/library/extension/LottieAnimationView_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->isLottieJson()Z

    move-result v2

    if-ne v2, v0, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const/4 v3, -0x1

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimationFromUrl(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->y()V

    goto/16 :goto_6

    :cond_1
    const/4 v2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_5

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->isLottieJson()Z

    move-result v3

    xor-int/2addr v0, v3

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v2

    :goto_2
    if-eqz p2, :cond_4

    :try_start_0
    invoke-static {p0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p2

    invoke-virtual {p2}, LrI4;->d1()LGA1;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, p2

    goto :goto_3

    :catchall_0
    move-exception p2

    const-string v0, "Failed to load fallback media, ignoring"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v0, v1}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_3
    invoke-static {p0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object p2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    invoke-virtual {p1, v2}, LLD;->n0(Landroid/graphics/drawable/Drawable;)LLD;

    move-result-object p1

    check-cast p1, LrI4;

    invoke-virtual {p1, v2}, LLD;->o(Landroid/graphics/drawable/Drawable;)LLD;

    move-result-object p1

    check-cast p1, LrI4;

    invoke-virtual {p1, p0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    goto :goto_6

    :cond_5
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->isLottieJson()Z

    move-result p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    move v0, v1

    :goto_4
    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimationFromUrl(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->y()V

    goto :goto_6

    :cond_7
    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_8
    move-object p1, v2

    :goto_5
    if-eqz p1, :cond_9

    invoke-static {p0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    invoke-virtual {p1, p0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    goto :goto_6

    :cond_9
    invoke-virtual {p0, v2}, Lcom/airbnb/lottie/LottieAnimationView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_6
    return-void
.end method

.method public static synthetic setMedia$default(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LqD2;->a(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    return-void
.end method
