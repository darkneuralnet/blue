.class public final Lb42;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "La42;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lj42;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(La42;Lj42;)V
    .locals 0

    iput-object p1, p0, La42;->b:Lj42;

    return-void
.end method


# virtual methods
.method public a(La42;)V
    .locals 1

    iget-object v0, p0, Lb42;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj42;

    invoke-static {p1, v0}, Lb42;->b(La42;Lj42;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La42;

    invoke-virtual {p0, p1}, Lb42;->a(La42;)V

    return-void
.end method
