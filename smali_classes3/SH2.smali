.class public final LSH2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LwH2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LIH2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LwH2;LIH2;)V
    .locals 0

    iput-object p1, p0, LwH2;->b:LIH2;

    return-void
.end method


# virtual methods
.method public a(LwH2;)V
    .locals 1

    iget-object v0, p0, LSH2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIH2;

    invoke-static {p1, v0}, LSH2;->b(LwH2;LIH2;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LwH2;

    invoke-virtual {p0, p1}, LSH2;->a(LwH2;)V

    return-void
.end method
