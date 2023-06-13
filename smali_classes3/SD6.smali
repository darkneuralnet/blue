.class public final LSD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LRD6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXD6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LRD6;LXD6;)V
    .locals 0

    iput-object p1, p0, LRD6;->b:LXD6;

    return-void
.end method


# virtual methods
.method public a(LRD6;)V
    .locals 1

    iget-object v0, p0, LSD6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXD6;

    invoke-static {p1, v0}, LSD6;->b(LRD6;LXD6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LRD6;

    invoke-virtual {p0, p1}, LSD6;->a(LRD6;)V

    return-void
.end method
