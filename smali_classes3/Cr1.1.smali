.class public final LCr1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzr1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGr1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAr1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lzr1;LAr1;)V
    .locals 0

    iput-object p1, p0, Lzr1;->c:LAr1;

    return-void
.end method

.method public static c(Lzr1;LGr1;)V
    .locals 0

    iput-object p1, p0, Lzr1;->b:LGr1;

    return-void
.end method


# virtual methods
.method public b(Lzr1;)V
    .locals 1

    iget-object v0, p0, LCr1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGr1;

    invoke-static {p1, v0}, LCr1;->c(Lzr1;LGr1;)V

    iget-object v0, p0, LCr1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAr1;

    invoke-static {p1, v0}, LCr1;->a(Lzr1;LAr1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzr1;

    invoke-virtual {p0, p1}, LCr1;->b(Lzr1;)V

    return-void
.end method
