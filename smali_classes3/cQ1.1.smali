.class public final LcQ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LbQ1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LdQ1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LbQ1;LdQ1;)V
    .locals 0

    iput-object p1, p0, LbQ1;->b:LdQ1;

    return-void
.end method


# virtual methods
.method public a(LbQ1;)V
    .locals 1

    iget-object v0, p0, LcQ1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LdQ1;

    invoke-static {p1, v0}, LcQ1;->b(LbQ1;LdQ1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LbQ1;

    invoke-virtual {p0, p1}, LcQ1;->a(LbQ1;)V

    return-void
.end method
