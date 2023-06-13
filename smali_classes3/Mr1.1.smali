.class public final LMr1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LLr1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTr1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LLr1;LTr1;)V
    .locals 0

    iput-object p1, p0, LLr1;->b:LTr1;

    return-void
.end method


# virtual methods
.method public a(LLr1;)V
    .locals 1

    iget-object v0, p0, LMr1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTr1;

    invoke-static {p1, v0}, LMr1;->b(LLr1;LTr1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LLr1;

    invoke-virtual {p0, p1}, LMr1;->a(LLr1;)V

    return-void
.end method
