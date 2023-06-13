.class public final Lsd4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lrd4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwd4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lrd4;Lwd4;)V
    .locals 0

    iput-object p1, p0, Lrd4;->b:Lwd4;

    return-void
.end method


# virtual methods
.method public a(Lrd4;)V
    .locals 1

    iget-object v0, p0, Lsd4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwd4;

    invoke-static {p1, v0}, Lsd4;->b(Lrd4;Lwd4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lrd4;

    invoke-virtual {p0, p1}, Lsd4;->a(Lrd4;)V

    return-void
.end method
