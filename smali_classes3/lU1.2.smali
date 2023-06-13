.class public final LlU1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LgU1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LgU1;Le13;)V
    .locals 0

    iput-object p1, p0, LgU1;->b:Le13;

    return-void
.end method


# virtual methods
.method public a(LgU1;)V
    .locals 1

    iget-object v0, p0, LlU1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LlU1;->b(LgU1;Le13;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LgU1;

    invoke-virtual {p0, p1}, LlU1;->a(LgU1;)V

    return-void
.end method
