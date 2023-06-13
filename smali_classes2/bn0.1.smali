.class public final Lbn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lan0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNo0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lan0;LNo0;)V
    .locals 0

    iput-object p1, p0, Lan0;->b:LNo0;

    return-void
.end method


# virtual methods
.method public a(Lan0;)V
    .locals 1

    iget-object v0, p0, Lbn0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNo0;

    invoke-static {p1, v0}, Lbn0;->b(Lan0;LNo0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lan0;

    invoke-virtual {p0, p1}, Lbn0;->a(Lan0;)V

    return-void
.end method
