.class public final LLs1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LJs1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNs1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LJs1;LNs1;)V
    .locals 0

    iput-object p1, p0, LJs1;->b:LNs1;

    return-void
.end method


# virtual methods
.method public a(LJs1;)V
    .locals 1

    iget-object v0, p0, LLs1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNs1;

    invoke-static {p1, v0}, LLs1;->b(LJs1;LNs1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LJs1;

    invoke-virtual {p0, p1}, LLs1;->a(LJs1;)V

    return-void
.end method
