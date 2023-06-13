.class public final Lc02;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lb02;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lg02;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lb02;Lg02;)V
    .locals 0

    iput-object p1, p0, Lb02;->b:Lg02;

    return-void
.end method

.method public static c(Lb02;LTq4;)V
    .locals 0

    iput-object p1, p0, Lb02;->c:LTq4;

    return-void
.end method


# virtual methods
.method public a(Lb02;)V
    .locals 1

    iget-object v0, p0, Lc02;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg02;

    invoke-static {p1, v0}, Lc02;->b(Lb02;Lg02;)V

    iget-object v0, p0, Lc02;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, Lc02;->c(Lb02;LTq4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb02;

    invoke-virtual {p0, p1}, Lc02;->a(Lb02;)V

    return-void
.end method
