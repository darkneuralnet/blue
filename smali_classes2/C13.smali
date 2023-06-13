.class public final LC13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LB13;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LD13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LB13;LD13;)V
    .locals 0

    iput-object p1, p0, LB13;->b:LD13;

    return-void
.end method


# virtual methods
.method public a(LB13;)V
    .locals 1

    iget-object v0, p0, LC13;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD13;

    invoke-static {p1, v0}, LC13;->b(LB13;LD13;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LB13;

    invoke-virtual {p0, p1}, LC13;->a(LB13;)V

    return-void
.end method
