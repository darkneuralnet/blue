.class public final Lin5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lhn5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljn5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lhn5;Ljn5;)V
    .locals 0

    iput-object p1, p0, Lhn5;->b:Ljn5;

    return-void
.end method


# virtual methods
.method public a(Lhn5;)V
    .locals 1

    iget-object v0, p0, Lin5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljn5;

    invoke-static {p1, v0}, Lin5;->b(Lhn5;Ljn5;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhn5;

    invoke-virtual {p0, p1}, Lin5;->a(Lhn5;)V

    return-void
.end method
