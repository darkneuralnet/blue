.class public final LxI3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LwI3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBI3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LwI3;LBI3;)V
    .locals 0

    iput-object p1, p0, LwI3;->b:LBI3;

    return-void
.end method


# virtual methods
.method public a(LwI3;)V
    .locals 1

    iget-object v0, p0, LxI3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBI3;

    invoke-static {p1, v0}, LxI3;->b(LwI3;LBI3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LwI3;

    invoke-virtual {p0, p1}, LxI3;->a(LwI3;)V

    return-void
.end method
