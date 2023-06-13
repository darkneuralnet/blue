.class public final Low3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LSv3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llw3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LSv3;Llw3;)V
    .locals 0

    iput-object p1, p0, LSv3;->b:Llw3;

    return-void
.end method


# virtual methods
.method public a(LSv3;)V
    .locals 1

    iget-object v0, p0, Low3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llw3;

    invoke-static {p1, v0}, Low3;->b(LSv3;Llw3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LSv3;

    invoke-virtual {p0, p1}, Low3;->a(LSv3;)V

    return-void
.end method
