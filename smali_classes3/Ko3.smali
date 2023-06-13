.class public final LKo3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LIo3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhp3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGo3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(LIo3;LGo3;)V
    .locals 0

    iput-object p1, p0, LIo3;->c:LGo3;

    return-void
.end method

.method public static c(LIo3;Lhp3;)V
    .locals 0

    iput-object p1, p0, LIo3;->b:Lhp3;

    return-void
.end method


# virtual methods
.method public b(LIo3;)V
    .locals 1

    iget-object v0, p0, LKo3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhp3;

    invoke-static {p1, v0}, LKo3;->c(LIo3;Lhp3;)V

    iget-object v0, p0, LKo3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGo3;

    invoke-static {p1, v0}, LKo3;->a(LIo3;LGo3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LIo3;

    invoke-virtual {p0, p1}, LKo3;->b(LIo3;)V

    return-void
.end method
