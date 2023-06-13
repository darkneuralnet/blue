.class public final synthetic LdA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appboy/events/IEventSubscriber;


# instance fields
.field public final synthetic a:Lcom/braze/ui/contentcards/ContentCardsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/braze/ui/contentcards/ContentCardsFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdA0;->a:Lcom/braze/ui/contentcards/ContentCardsFragment;

    return-void
.end method


# virtual methods
.method public final trigger(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LdA0;->a:Lcom/braze/ui/contentcards/ContentCardsFragment;

    check-cast p1, LfA0;

    invoke-static {v0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->N6(Lcom/braze/ui/contentcards/ContentCardsFragment;LfA0;)V

    return-void
.end method
