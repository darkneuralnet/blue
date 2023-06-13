.class public final Lzt3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lyt3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEt3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lyt3;LEt3;)V
    .locals 0

    iput-object p1, p0, Lyt3;->e:LEt3;

    return-void
.end method


# virtual methods
.method public a(Lyt3;)V
    .locals 1

    iget-object v0, p0, Lzt3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEt3;

    invoke-static {p1, v0}, Lzt3;->b(Lyt3;LEt3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lyt3;

    invoke-virtual {p0, p1}, Lzt3;->a(Lyt3;)V

    return-void
.end method
