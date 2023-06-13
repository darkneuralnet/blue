.class public final LKv0$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKv0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000f"
    }
    d2 = {
        "LKv0$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "onAttachedToWindow",
        "Lqe2;",
        "b",
        "Lqe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LKv0;Landroid/view/View;)V",
        "co.bird.android.feature.configurabletutorial"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$ChapterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$ChapterViewHolder\n*L\n167#1:189\n167#1:190,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lqe2;

.field public final synthetic c:LKv0;


# direct methods
.method public constructor <init>(LKv0;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKv0$b;->c:LKv0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lqe2;->a(Landroid/view/View;)Lqe2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKv0$b;->b:Lqe2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, LKv0$b;->c:LKv0;

    invoke-static {v0}, LKv0;->access$getAdapterData(LKv0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, LKv0$b;->b:Lqe2;

    iget-object v2, v2, Lqe2;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->isLottieJson()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LKv0$b;->b:Lqe2;

    iget-object v0, v0, Lqe2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    iget-object v0, p0, LKv0$b;->b:Lqe2;

    iget-object v0, v0, Lqe2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p1, v0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    :cond_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    if-nez v1, :cond_4

    iget-object p1, p0, LKv0$b;->b:Lqe2;

    iget-object p1, p1, Lqe2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v0, "binding.image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :cond_4
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Lw1;->onAttachedToWindow()V

    iget-object v0, p0, LKv0$b;->c:LKv0;

    invoke-virtual {p0}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LKv0$b;->b:Lqe2;

    iget-object v2, v2, Lqe2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v3, "binding.image"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, LKv0;->access$startAnimation(LKv0;Ljava/lang/Integer;Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method
