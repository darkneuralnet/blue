.class public final Lb7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "La7;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lj7;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(La7;Lj7;)V
    .locals 0

    iput-object p1, p0, La7;->e:Lj7;

    return-void
.end method


# virtual methods
.method public a(La7;)V
    .locals 1

    iget-object v0, p0, Lb7;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj7;

    invoke-static {p1, v0}, Lb7;->b(La7;Lj7;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La7;

    invoke-virtual {p0, p1}, Lb7;->a(La7;)V

    return-void
.end method
