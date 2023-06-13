.class public final synthetic Lpx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/appboy/ui/widget/BannerImageCardView;

.field public final synthetic c:Lcom/appboy/models/cards/BannerImageCard;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/ui/widget/BannerImageCardView;Lcom/appboy/models/cards/BannerImageCard;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpx;->b:Lcom/appboy/ui/widget/BannerImageCardView;

    iput-object p2, p0, Lpx;->c:Lcom/appboy/models/cards/BannerImageCard;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lpx;->b:Lcom/appboy/ui/widget/BannerImageCardView;

    iget-object v1, p0, Lpx;->c:Lcom/appboy/models/cards/BannerImageCard;

    invoke-static {v0, v1, p1}, Lcom/appboy/ui/widget/BannerImageCardView;->c(Lcom/appboy/ui/widget/BannerImageCardView;Lcom/appboy/models/cards/BannerImageCard;Landroid/view/View;)V

    return-void
.end method
