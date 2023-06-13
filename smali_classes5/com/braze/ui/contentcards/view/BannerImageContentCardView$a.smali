.class public final Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;
.super LbA0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/braze/ui/contentcards/view/BannerImageContentCardView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;",
        "LbA0;",
        "Landroid/widget/ImageView;",
        "e",
        "Landroid/widget/ImageView;",
        "j",
        "()Landroid/widget/ImageView;",
        "imageView",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lcom/braze/ui/contentcards/view/BannerImageContentCardView;Landroid/view/View;)V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final e:Landroid/widget/ImageView;

.field public final synthetic f:Lcom/braze/ui/contentcards/view/BannerImageContentCardView;


# direct methods
.method public constructor <init>(Lcom/braze/ui/contentcards/view/BannerImageContentCardView;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;->f:Lcom/braze/ui/contentcards/view/BannerImageContentCardView;

    invoke-virtual {p1}, Lcom/appboy/ui/widget/BaseCardView;->isUnreadIndicatorEnabled()Z

    move-result p1

    invoke-direct {p0, p2, p1}, LbA0;-><init>(Landroid/view/View;Z)V

    sget p1, Lcom/appboy/ui/R$id;->com_braze_content_cards_banner_image_card_image:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;->e:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final j()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;->e:Landroid/widget/ImageView;

    return-object v0
.end method
