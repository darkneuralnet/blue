.class public final LJd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LId0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTd0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LId0;LTd0;)V
    .locals 0

    iput-object p1, p0, LId0;->e:LTd0;

    return-void
.end method


# virtual methods
.method public a(LId0;)V
    .locals 1

    iget-object v0, p0, LJd0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTd0;

    invoke-static {p1, v0}, LJd0;->b(LId0;LTd0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LId0;

    invoke-virtual {p0, p1}, LJd0;->a(LId0;)V

    return-void
.end method
