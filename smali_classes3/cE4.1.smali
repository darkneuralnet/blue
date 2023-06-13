.class public final LcE4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LbE4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LgE4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LbE4;LgE4;)V
    .locals 0

    iput-object p1, p0, LbE4;->b:LgE4;

    return-void
.end method


# virtual methods
.method public a(LbE4;)V
    .locals 1

    iget-object v0, p0, LcE4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LgE4;

    invoke-static {p1, v0}, LcE4;->b(LbE4;LgE4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LbE4;

    invoke-virtual {p0, p1}, LcE4;->a(LbE4;)V

    return-void
.end method
