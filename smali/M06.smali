.class public final synthetic LM06;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/appboy/ui/widget/TextAnnouncementCardView;

.field public final synthetic c:Lcom/appboy/models/cards/TextAnnouncementCard;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/ui/widget/TextAnnouncementCardView;Lcom/appboy/models/cards/TextAnnouncementCard;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM06;->b:Lcom/appboy/ui/widget/TextAnnouncementCardView;

    iput-object p2, p0, LM06;->c:Lcom/appboy/models/cards/TextAnnouncementCard;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LM06;->b:Lcom/appboy/ui/widget/TextAnnouncementCardView;

    iget-object v1, p0, LM06;->c:Lcom/appboy/models/cards/TextAnnouncementCard;

    invoke-static {v0, v1, p1}, Lcom/appboy/ui/widget/TextAnnouncementCardView;->c(Lcom/appboy/ui/widget/TextAnnouncementCardView;Lcom/appboy/models/cards/TextAnnouncementCard;Landroid/view/View;)V

    return-void
.end method
