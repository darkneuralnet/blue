.class public final LYO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXO;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008(\u0010)J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u0016R\u0014\u0010\'\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006*"
    }
    d2 = {
        "LYO;",
        "LXO;",
        "Lio/reactivex/Observable;",
        "",
        "b",
        "",
        "count",
        "e",
        "Lco/bird/android/model/wire/configs/BirdPayTutorialStep;",
        "step",
        "c",
        "",
        "title",
        "d",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "a",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Landroid/widget/Button;",
        "Landroid/widget/Button;",
        "actionButton",
        "Landroid/widget/TextView;",
        "Landroid/widget/TextView;",
        "bodyText",
        "Landroid/widget/ImageView;",
        "Landroid/widget/ImageView;",
        "imageView",
        "Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;",
        "Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;",
        "indicator",
        "Lcom/airbnb/lottie/LottieAnimationView;",
        "f",
        "Lcom/airbnb/lottie/LottieAnimationView;",
        "lottieView",
        "g",
        "titleText",
        "LUI4;",
        "h",
        "LUI4;",
        "glideInstance",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroid/widget/Button;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/ImageView;

.field public e:Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

.field public f:Lcom/airbnb/lottie/LottieAnimationView;

.field public final g:Landroid/widget/TextView;

.field public final h:LUI4;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYO;->a:Lco/bird/android/core/mvp/BaseActivity;

    sget v0, LVg4;->nextButton:I

    invoke-static {p1, v0}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, LYO;->b:Landroid/widget/Button;

    sget v0, LVg4;->tutorialStepBody:I

    invoke-static {p1, v0}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LYO;->c:Landroid/widget/TextView;

    sget v0, LVg4;->stepImage:I

    invoke-static {p1, v0}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LYO;->d:Landroid/widget/ImageView;

    sget v1, LVg4;->indicator:I

    invoke-static {p1, v1}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

    iput-object v1, p0, LYO;->e:Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

    sget v1, LVg4;->lottieGallery:I

    invoke-static {p1, v1}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object v1, p0, LYO;->f:Lcom/airbnb/lottie/LottieAnimationView;

    sget v1, LVg4;->tutorialStepTitle:I

    invoke-static {p1, v1}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, LYO;->g:Landroid/widget/TextView;

    invoke-static {p1}, Lcom/bumptech/glide/a;->v(Landroidx/fragment/app/FragmentActivity;)LUI4;

    move-result-object p1

    const-string v1, "with(activity)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYO;->h:LUI4;

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object p1, p0, LYO;->f:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYO;->b:Landroid/widget/Button;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public c(Lco/bird/android/model/wire/configs/BirdPayTutorialStep;)V
    .locals 2

    const-string v0, "step"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYO;->b:Landroid/widget/Button;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BirdPayTutorialStep;->getActionButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LYO;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BirdPayTutorialStep;->getBodyText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LYO;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BirdPayTutorialStep;->getTitleText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LYO;->h:LUI4;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BirdPayTutorialStep;->getAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object v0

    iget-object v1, p0, LYO;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    iget-object v0, p0, LYO;->e:Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BirdPayTutorialStep;->getIndex()I

    move-result p1

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;->setSelectedIndex(I)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYO;->a:Lco/bird/android/core/mvp/BaseActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, LYO;->e:Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;->setNumCircles(I)V

    return-void
.end method
