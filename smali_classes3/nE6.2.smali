.class public final LnE6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LmE6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LsE6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoE6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LmE6;LoE6;)V
    .locals 0

    iput-object p1, p0, LmE6;->c:LoE6;

    return-void
.end method

.method public static c(LmE6;LsE6;)V
    .locals 0

    iput-object p1, p0, LmE6;->b:LsE6;

    return-void
.end method


# virtual methods
.method public a(LmE6;)V
    .locals 1

    iget-object v0, p0, LnE6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LsE6;

    invoke-static {p1, v0}, LnE6;->c(LmE6;LsE6;)V

    iget-object v0, p0, LnE6;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoE6;

    invoke-static {p1, v0}, LnE6;->b(LmE6;LoE6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LmE6;

    invoke-virtual {p0, p1}, LnE6;->a(LmE6;)V

    return-void
.end method
