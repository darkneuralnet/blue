.class public final LUu2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LTu2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbv2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(LTu2;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, LTu2;->e:Landroid/content/Intent;

    return-void
.end method

.method public static c(LTu2;Lbv2;)V
    .locals 0

    iput-object p1, p0, LTu2;->f:Lbv2;

    return-void
.end method


# virtual methods
.method public b(LTu2;)V
    .locals 1

    iget-object v0, p0, LUu2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    invoke-static {p1, v0}, LUu2;->a(LTu2;Landroid/content/Intent;)V

    iget-object v0, p0, LUu2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbv2;

    invoke-static {p1, v0}, LUu2;->c(LTu2;Lbv2;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LTu2;

    invoke-virtual {p0, p1}, LUu2;->b(LTu2;)V

    return-void
.end method
