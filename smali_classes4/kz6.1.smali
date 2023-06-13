.class public final Lkz6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Ljz6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llz6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Ljz6;Llz6;)V
    .locals 0

    iput-object p1, p0, Ljz6;->b:Llz6;

    return-void
.end method


# virtual methods
.method public a(Ljz6;)V
    .locals 1

    iget-object v0, p0, Lkz6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llz6;

    invoke-static {p1, v0}, Lkz6;->b(Ljz6;Llz6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljz6;

    invoke-virtual {p0, p1}, Lkz6;->a(Ljz6;)V

    return-void
.end method
