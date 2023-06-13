.class public final LkI3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LjI3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LqI3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LjI3;LqI3;)V
    .locals 0

    iput-object p1, p0, LjI3;->e:LqI3;

    return-void
.end method


# virtual methods
.method public a(LjI3;)V
    .locals 1

    iget-object v0, p0, LkI3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LqI3;

    invoke-static {p1, v0}, LkI3;->b(LjI3;LqI3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LjI3;

    invoke-virtual {p0, p1}, LkI3;->a(LjI3;)V

    return-void
.end method
