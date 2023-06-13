.class public final Lu72;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lt72;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LP72;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lt72;LP72;)V
    .locals 0

    iput-object p1, p0, Lt72;->b:LP72;

    return-void
.end method


# virtual methods
.method public a(Lt72;)V
    .locals 1

    iget-object v0, p0, Lu72;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP72;

    invoke-static {p1, v0}, Lu72;->b(Lt72;LP72;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lt72;

    invoke-virtual {p0, p1}, Lu72;->a(Lt72;)V

    return-void
.end method
