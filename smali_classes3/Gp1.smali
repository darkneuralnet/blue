.class public final LGp1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LDp1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Laq1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LDp1;Laq1;)V
    .locals 0

    iput-object p1, p0, LDp1;->b:Laq1;

    return-void
.end method


# virtual methods
.method public a(LDp1;)V
    .locals 1

    iget-object v0, p0, LGp1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laq1;

    invoke-static {p1, v0}, LGp1;->b(LDp1;Laq1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDp1;

    invoke-virtual {p0, p1}, LGp1;->a(LDp1;)V

    return-void
.end method
