.class public final synthetic LAe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/appboy/ui/widget/CaptionedImageCardView;

.field public final synthetic c:Lcom/appboy/models/cards/CaptionedImageCard;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/ui/widget/CaptionedImageCardView;Lcom/appboy/models/cards/CaptionedImageCard;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAe0;->b:Lcom/appboy/ui/widget/CaptionedImageCardView;

    iput-object p2, p0, LAe0;->c:Lcom/appboy/models/cards/CaptionedImageCard;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LAe0;->b:Lcom/appboy/ui/widget/CaptionedImageCardView;

    iget-object v1, p0, LAe0;->c:Lcom/appboy/models/cards/CaptionedImageCard;

    invoke-static {v0, v1, p1}, Lcom/appboy/ui/widget/CaptionedImageCardView;->c(Lcom/appboy/ui/widget/CaptionedImageCardView;Lcom/appboy/models/cards/CaptionedImageCard;Landroid/view/View;)V

    return-void
.end method
