.class public final synthetic LJA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ViewSwitcher$ViewFactory;


# instance fields
.field public final synthetic a:Lcom/appboy/ui/feed/view/BaseFeedCardView;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/ui/feed/view/BaseFeedCardView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJA;->a:Lcom/appboy/ui/feed/view/BaseFeedCardView;

    return-void
.end method


# virtual methods
.method public final makeView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LJA;->a:Lcom/appboy/ui/feed/view/BaseFeedCardView;

    invoke-static {v0}, Lcom/appboy/ui/feed/view/BaseFeedCardView;->b(Lcom/appboy/ui/feed/view/BaseFeedCardView;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
