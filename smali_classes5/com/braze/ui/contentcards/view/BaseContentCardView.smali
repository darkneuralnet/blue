.class public abstract Lcom/braze/ui/contentcards/view/BaseContentCardView;
.super Lcom/appboy/ui/widget/BaseCardView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/appboy/models/cards/Card;",
        ">",
        "Lcom/appboy/ui/widget/BaseCardView<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ*\u0010\u0013\u001a\u00020\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0001J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u001a\u001a\u00020\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0005J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0004\u00a8\u0006 "
    }
    d2 = {
        "Lcom/braze/ui/contentcards/view/BaseContentCardView;",
        "Lcom/appboy/models/cards/Card;",
        "T",
        "Lcom/appboy/ui/widget/BaseCardView;",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "LbA0;",
        "d",
        "viewHolder",
        "card",
        "",
        "b",
        "(LbA0;Lcom/appboy/models/cards/Card;)V",
        "Landroid/widget/ImageView;",
        "imageView",
        "",
        "cardAspectRatio",
        "",
        "cardImageUrl",
        "setOptionalCardImage",
        "Landroid/content/Context;",
        "context",
        "LVN1;",
        "cardAction",
        "",
        "isClickHandled",
        "e",
        "Landroid/view/View;",
        "view",
        "f",
        "<init>",
        "(Landroid/content/Context;)V",
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

    invoke-direct {p0, p1}, Lcom/appboy/ui/widget/BaseCardView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/braze/ui/contentcards/view/BaseContentCardView;Lcom/appboy/models/cards/Card;LCf6;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/braze/ui/contentcards/view/BaseContentCardView;->c(Lcom/braze/ui/contentcards/view/BaseContentCardView;Lcom/appboy/models/cards/Card;LCf6;Landroid/view/View;)V

    return-void
.end method

.method public static final c(Lcom/braze/ui/contentcards/view/BaseContentCardView;Lcom/appboy/models/cards/Card;LCf6;Landroid/view/View;)V
    .locals 0

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$card"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/appboy/ui/widget/BaseCardView;->applicationContext:Landroid/content/Context;

    invoke-virtual {p0, p3, p1, p2}, Lcom/appboy/ui/widget/BaseCardView;->handleCardClick(Landroid/content/Context;Lcom/appboy/models/cards/Card;LVN1;)V

    return-void
.end method


# virtual methods
.method public b(LbA0;Lcom/appboy/models/cards/Card;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LbA0;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/appboy/models/cards/Card;->isPinned()Z

    move-result v0

    invoke-virtual {p1, v0}, LbA0;->e(Z)V

    iget-object v0, p0, Lcom/appboy/ui/widget/BaseCardView;->configurationProvider:LX10;

    invoke-virtual {v0}, LX10;->isContentCardsUnreadVisualIndicatorEnabled()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/appboy/models/cards/Card;->isIndicatorHighlighted()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p1, v0}, LbA0;->i(Z)V

    invoke-static {p2}, Lcom/appboy/ui/widget/BaseCardView;->getUriActionForCard(Lcom/appboy/models/cards/Card;)LCf6;

    move-result-object v0

    iget-object v3, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v4, LvA;

    invoke-direct {v4, p0, p2, v0}, LvA;-><init>(Lcom/braze/ui/contentcards/view/BaseContentCardView;Lcom/appboy/models/cards/Card;LCf6;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {p1, v1}, LbA0;->b(Z)V

    return-void
.end method

.method public abstract d(Landroid/view/ViewGroup;)LbA0;
.end method

.method public final e(Landroid/widget/ImageView;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    :goto_0
    return-void
.end method

.method public final f(Landroid/view/View;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/appboy/ui/R$drawable;->com_braze_content_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/appboy/ui/R$drawable;->com_braze_content_card_scrim:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public isClickHandled(Landroid/content/Context;Lcom/appboy/models/cards/Card;LVN1;)Z
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LY10;->b:LY10$b;

    invoke-virtual {v0}, LY10$b;->a()LY10;

    move-result-object v0

    invoke-virtual {v0}, LY10;->b()LlO1;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1, p2, p3}, LlO1;->b(Landroid/content/Context;Lcom/appboy/models/cards/Card;LVN1;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    move v1, p2

    :cond_1
    :goto_0
    return v1
.end method

.method public final setOptionalCardImage(Landroid/widget/ImageView;FLjava/lang/String;Lcom/appboy/models/cards/Card;)V
    .locals 1

    const-string v0, "card"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p3, p2, p4}, Lcom/appboy/ui/widget/BaseCardView;->setImageViewToUrl(Landroid/widget/ImageView;Ljava/lang/String;FLcom/appboy/models/cards/Card;)V

    :cond_0
    return-void
.end method
