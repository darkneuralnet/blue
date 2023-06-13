.class public final LSa4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LRa4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXa4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LRa4;LXa4;)V
    .locals 0

    iput-object p1, p0, LRa4;->b:LXa4;

    return-void
.end method


# virtual methods
.method public a(LRa4;)V
    .locals 1

    iget-object v0, p0, LSa4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXa4;

    invoke-static {p1, v0}, LSa4;->b(LRa4;LXa4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LRa4;

    invoke-virtual {p0, p1}, LSa4;->a(LRa4;)V

    return-void
.end method
