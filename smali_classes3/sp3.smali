.class public final Lsp3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lrp3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCp3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lrp3;LCp3;)V
    .locals 0

    iput-object p1, p0, Lrp3;->b:LCp3;

    return-void
.end method


# virtual methods
.method public a(Lrp3;)V
    .locals 1

    iget-object v0, p0, Lsp3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCp3;

    invoke-static {p1, v0}, Lsp3;->b(Lrp3;LCp3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lrp3;

    invoke-virtual {p0, p1}, Lsp3;->a(Lrp3;)V

    return-void
.end method
