.class public final Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;
.super LbA0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0004\u001a\u0004\u0008\t\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;",
        "LbA0;",
        "Landroid/widget/TextView;",
        "e",
        "Landroid/widget/TextView;",
        "l",
        "()Landroid/widget/TextView;",
        "title",
        "f",
        "j",
        "description",
        "Landroid/widget/ImageView;",
        "g",
        "Landroid/widget/ImageView;",
        "k",
        "()Landroid/widget/ImageView;",
        "imageView",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;Landroid/view/View;)V",
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
.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/ImageView;

.field public final synthetic h:Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;


# direct methods
.method public constructor <init>(Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;Landroid/view/View;)V
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

    iput-object p1, p0, Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;->h:Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;

    invoke-virtual {p1}, Lcom/appboy/ui/widget/BaseCardView;->isUnreadIndicatorEnabled()Z

    move-result p1

    invoke-direct {p0, p2, p1}, LbA0;-><init>(Landroid/view/View;Z)V

    sget p1, Lcom/appboy/ui/R$id;->com_braze_content_cards_short_news_card_title:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;->e:Landroid/widget/TextView;

    sget p1, Lcom/appboy/ui/R$id;->com_braze_content_cards_short_news_card_description:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;->f:Landroid/widget/TextView;

    sget p1, Lcom/appboy/ui/R$id;->com_braze_content_cards_short_news_card_image:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;->g:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final j()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method public final k()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;->g:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final l()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;->e:Landroid/widget/TextView;

    return-object v0
.end method
