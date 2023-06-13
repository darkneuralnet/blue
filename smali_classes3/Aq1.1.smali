.class public final LAq1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzq1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYq1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lzq1;LYq1;)V
    .locals 0

    iput-object p1, p0, Lzq1;->b:LYq1;

    return-void
.end method


# virtual methods
.method public a(Lzq1;)V
    .locals 1

    iget-object v0, p0, LAq1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYq1;

    invoke-static {p1, v0}, LAq1;->b(Lzq1;LYq1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzq1;

    invoke-virtual {p0, p1}, LAq1;->a(Lzq1;)V

    return-void
.end method
