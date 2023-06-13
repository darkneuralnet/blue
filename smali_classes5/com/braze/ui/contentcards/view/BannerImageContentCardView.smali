.class public Lcom/braze/ui/contentcards/view/BannerImageContentCardView;
.super Lcom/braze/ui/contentcards/view/BaseContentCardView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/braze/ui/contentcards/view/BaseContentCardView<",
        "Lcom/appboy/models/cards/BannerImageCard;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/braze/ui/contentcards/view/BannerImageContentCardView;",
        "Lcom/braze/ui/contentcards/view/BaseContentCardView;",
        "Lcom/appboy/models/cards/BannerImageCard;",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "LbA0;",
        "d",
        "viewHolder",
        "card",
        "",
        "g",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "a",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/braze/ui/contentcards/view/BaseContentCardView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LbA0;Lcom/appboy/models/cards/Card;)V
    .locals 0

    check-cast p2, Lcom/appboy/models/cards/BannerImageCard;

    invoke-virtual {p0, p1, p2}, Lcom/braze/ui/contentcards/view/BannerImageContentCardView;->g(LbA0;Lcom/appboy/models/cards/BannerImageCard;)V

    return-void
.end method

.method public d(Landroid/view/ViewGroup;)LbA0;
    .locals 3

    const-string v0, "viewGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/appboy/ui/R$layout;->com_braze_banner_image_content_card:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/view/BaseContentCardView;->f(Landroid/view/View;)V

    new-instance v0, Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;

    invoke-direct {v0, p0, p1}, Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;-><init>(Lcom/braze/ui/contentcards/view/BannerImageContentCardView;Landroid/view/View;)V

    return-object v0
.end method

.method public g(LbA0;Lcom/appboy/models/cards/BannerImageCard;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/braze/ui/contentcards/view/BaseContentCardView;->b(LbA0;Lcom/appboy/models/cards/Card;)V

    check-cast p1, Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;

    invoke-virtual {p1}, Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;->j()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p2}, Lcom/appboy/models/cards/BannerImageCard;->getAspectRatio()F

    move-result v0

    invoke-virtual {p2}, Lcom/appboy/models/cards/BannerImageCard;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/braze/ui/contentcards/view/BaseContentCardView;->setOptionalCardImage(Landroid/widget/ImageView;FLjava/lang/String;Lcom/appboy/models/cards/Card;)V

    return-void
.end method
