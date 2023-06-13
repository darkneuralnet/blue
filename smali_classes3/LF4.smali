.class public final LLF4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LKF4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQF4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LKF4;LQF4;)V
    .locals 0

    iput-object p1, p0, LKF4;->b:LQF4;

    return-void
.end method


# virtual methods
.method public a(LKF4;)V
    .locals 1

    iget-object v0, p0, LLF4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQF4;

    invoke-static {p1, v0}, LLF4;->b(LKF4;LQF4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LKF4;

    invoke-virtual {p0, p1}, LLF4;->a(LKF4;)V

    return-void
.end method
