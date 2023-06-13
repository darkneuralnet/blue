.class public final LCQ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LnQ5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoQ5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LxQ5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LnQ5;LoQ5;)V
    .locals 0

    iput-object p1, p0, LnQ5;->c:LoQ5;

    return-void
.end method

.method public static c(LnQ5;LxQ5;)V
    .locals 0

    invoke-virtual {p0, p1}, LnQ5;->B9(LxQ5;)V

    return-void
.end method


# virtual methods
.method public a(LnQ5;)V
    .locals 1

    iget-object v0, p0, LCQ5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoQ5;

    invoke-static {p1, v0}, LCQ5;->b(LnQ5;LoQ5;)V

    iget-object v0, p0, LCQ5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxQ5;

    invoke-static {p1, v0}, LCQ5;->c(LnQ5;LxQ5;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LnQ5;

    invoke-virtual {p0, p1}, LCQ5;->a(LnQ5;)V

    return-void
.end method
