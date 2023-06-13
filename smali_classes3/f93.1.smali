.class public final Lf93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Le93;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ls93;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Le93;Ls93;)V
    .locals 0

    iput-object p1, p0, Le93;->b:Ls93;

    return-void
.end method


# virtual methods
.method public a(Le93;)V
    .locals 1

    iget-object v0, p0, Lf93;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls93;

    invoke-static {p1, v0}, Lf93;->b(Le93;Ls93;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le93;

    invoke-virtual {p0, p1}, Lf93;->a(Le93;)V

    return-void
.end method
