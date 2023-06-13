.class public final Lwn5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lvn5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lxn5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lvn5;Lxn5;)V
    .locals 0

    iput-object p1, p0, Lvn5;->b:Lxn5;

    return-void
.end method


# virtual methods
.method public a(Lvn5;)V
    .locals 1

    iget-object v0, p0, Lwn5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxn5;

    invoke-static {p1, v0}, Lwn5;->b(Lvn5;Lxn5;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lvn5;

    invoke-virtual {p0, p1}, Lwn5;->a(Lvn5;)V

    return-void
.end method
