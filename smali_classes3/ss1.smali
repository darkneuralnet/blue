.class public final Lss1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lqs1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lqs1;LEa;)V
    .locals 0

    iput-object p1, p0, Lqs1;->c:LEa;

    return-void
.end method


# virtual methods
.method public b(Lqs1;)V
    .locals 1

    iget-object v0, p0, Lss1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, Lss1;->a(Lqs1;LEa;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lqs1;

    invoke-virtual {p0, p1}, Lss1;->b(Lqs1;)V

    return-void
.end method
