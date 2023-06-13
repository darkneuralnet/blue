.class public final LOF6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LNF6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQF6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LNF6;LQF6;)V
    .locals 0

    iput-object p1, p0, LNF6;->b:LQF6;

    return-void
.end method


# virtual methods
.method public a(LNF6;)V
    .locals 1

    iget-object v0, p0, LOF6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQF6;

    invoke-static {p1, v0}, LOF6;->b(LNF6;LQF6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LNF6;

    invoke-virtual {p0, p1}, LOF6;->a(LNF6;)V

    return-void
.end method
