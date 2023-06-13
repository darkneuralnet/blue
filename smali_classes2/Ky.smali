.class public final LKy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
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

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/core/mrp/BaseActivityLite;->d:Le13;

    return-void
.end method

.method public static c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/core/mrp/BaseActivityLite;->e:Lgl;

    return-void
.end method

.method public static d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/core/mrp/BaseActivityLite;->f:LTq4;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/core/mrp/BaseActivityLite;)V
    .locals 1

    iget-object v0, p0, LKy;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LKy;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LKy;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/core/mrp/BaseActivityLite;

    invoke-virtual {p0, p1}, LKy;->a(Lco/bird/android/core/mrp/BaseActivityLite;)V

    return-void
.end method
