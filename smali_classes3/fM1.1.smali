.class public final LfM1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LeM1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LvM1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LeM1;LvM1;)V
    .locals 0

    iput-object p1, p0, LeM1;->e:LvM1;

    return-void
.end method


# virtual methods
.method public a(LeM1;)V
    .locals 1

    iget-object v0, p0, LfM1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LvM1;

    invoke-static {p1, v0}, LfM1;->b(LeM1;LvM1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LeM1;

    invoke-virtual {p0, p1}, LfM1;->a(LeM1;)V

    return-void
.end method
