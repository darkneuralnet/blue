.class public final synthetic LYl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/appboy/ui/AppboyFeedFragment;

.field public final synthetic c:Lcom/appboy/events/FeedUpdatedEvent;

.field public final synthetic d:Landroid/widget/ListView;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/ui/AppboyFeedFragment;Lcom/appboy/events/FeedUpdatedEvent;Landroid/widget/ListView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYl;->b:Lcom/appboy/ui/AppboyFeedFragment;

    iput-object p2, p0, LYl;->c:Lcom/appboy/events/FeedUpdatedEvent;

    iput-object p3, p0, LYl;->d:Landroid/widget/ListView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LYl;->b:Lcom/appboy/ui/AppboyFeedFragment;

    iget-object v1, p0, LYl;->c:Lcom/appboy/events/FeedUpdatedEvent;

    iget-object v2, p0, LYl;->d:Landroid/widget/ListView;

    invoke-static {v0, v1, v2}, Lcom/appboy/ui/AppboyFeedFragment;->a5(Lcom/appboy/ui/AppboyFeedFragment;Lcom/appboy/events/FeedUpdatedEvent;Landroid/widget/ListView;)V

    return-void
.end method
