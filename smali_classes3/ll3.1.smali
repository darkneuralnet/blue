.class public final Lll3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Ljl3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQl3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Ljl3;LQl3;)V
    .locals 0

    iput-object p1, p0, Ljl3;->i:LQl3;

    return-void
.end method


# virtual methods
.method public a(Ljl3;)V
    .locals 1

    iget-object v0, p0, Lll3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQl3;

    invoke-static {p1, v0}, Lll3;->b(Ljl3;LQl3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljl3;

    invoke-virtual {p0, p1}, Lll3;->a(Ljl3;)V

    return-void
.end method
