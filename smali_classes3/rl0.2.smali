.class public final Lrl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lql0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lvl0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lql0;Lvl0;)V
    .locals 0

    iput-object p1, p0, Lql0;->b:Lvl0;

    return-void
.end method


# virtual methods
.method public a(Lql0;)V
    .locals 1

    iget-object v0, p0, Lrl0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvl0;

    invoke-static {p1, v0}, Lrl0;->b(Lql0;Lvl0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lql0;

    invoke-virtual {p0, p1}, Lrl0;->a(Lql0;)V

    return-void
.end method
