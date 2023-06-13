.class public final LQz4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LPz4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LSz4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LPz4;LSz4;)V
    .locals 0

    iput-object p1, p0, LPz4;->b:LSz4;

    return-void
.end method


# virtual methods
.method public a(LPz4;)V
    .locals 1

    iget-object v0, p0, LQz4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSz4;

    invoke-static {p1, v0}, LQz4;->b(LPz4;LSz4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LPz4;

    invoke-virtual {p0, p1}, LQz4;->a(LPz4;)V

    return-void
.end method
