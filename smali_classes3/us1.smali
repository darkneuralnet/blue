.class public final Lus1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lts1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDs1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lts1;LDs1;)V
    .locals 0

    iput-object p1, p0, Lts1;->e:LDs1;

    return-void
.end method


# virtual methods
.method public a(Lts1;)V
    .locals 1

    iget-object v0, p0, Lus1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDs1;

    invoke-static {p1, v0}, Lus1;->b(Lts1;LDs1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lts1;

    invoke-virtual {p0, p1}, Lus1;->a(Lts1;)V

    return-void
.end method
