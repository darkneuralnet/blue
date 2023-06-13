.class public final Lx46;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lw46;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lz46;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lw46;Lz46;)V
    .locals 0

    iput-object p1, p0, Lw46;->b:Lz46;

    return-void
.end method


# virtual methods
.method public a(Lw46;)V
    .locals 1

    iget-object v0, p0, Lx46;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz46;

    invoke-static {p1, v0}, Lx46;->b(Lw46;Lz46;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lw46;

    invoke-virtual {p0, p1}, Lx46;->a(Lw46;)V

    return-void
.end method
