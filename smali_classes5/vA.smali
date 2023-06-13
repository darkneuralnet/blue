.class public final synthetic LvA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/braze/ui/contentcards/view/BaseContentCardView;

.field public final synthetic c:Lcom/appboy/models/cards/Card;

.field public final synthetic d:LCf6;


# direct methods
.method public synthetic constructor <init>(Lcom/braze/ui/contentcards/view/BaseContentCardView;Lcom/appboy/models/cards/Card;LCf6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvA;->b:Lcom/braze/ui/contentcards/view/BaseContentCardView;

    iput-object p2, p0, LvA;->c:Lcom/appboy/models/cards/Card;

    iput-object p3, p0, LvA;->d:LCf6;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, LvA;->b:Lcom/braze/ui/contentcards/view/BaseContentCardView;

    iget-object v1, p0, LvA;->c:Lcom/appboy/models/cards/Card;

    iget-object v2, p0, LvA;->d:LCf6;

    invoke-static {v0, v1, v2, p1}, Lcom/braze/ui/contentcards/view/BaseContentCardView;->a(Lcom/braze/ui/contentcards/view/BaseContentCardView;Lcom/appboy/models/cards/Card;LCf6;Landroid/view/View;)V

    return-void
.end method
