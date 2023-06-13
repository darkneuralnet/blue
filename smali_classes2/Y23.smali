.class public final LY23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LX23;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Li33;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LX23;Li33;)V
    .locals 0

    iput-object p1, p0, LX23;->b:Li33;

    return-void
.end method


# virtual methods
.method public a(LX23;)V
    .locals 1

    iget-object v0, p0, LY23;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li33;

    invoke-static {p1, v0}, LY23;->b(LX23;Li33;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LX23;

    invoke-virtual {p0, p1}, LY23;->a(LX23;)V

    return-void
.end method
