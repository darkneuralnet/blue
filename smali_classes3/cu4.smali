.class public final Lcu4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;",
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

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Luu4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldu4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfu4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Ldu4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;->k:Ldu4;

    return-void
.end method

.method public static b(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Lfu4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;->l:Lfu4;

    return-void
.end method

.method public static d(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Luu4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;->j:Luu4;

    return-void
.end method


# virtual methods
.method public c(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;)V
    .locals 1

    iget-object v0, p0, Lcu4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lcu4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lcu4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, Lcu4;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luu4;

    invoke-static {p1, v0}, Lcu4;->d(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Luu4;)V

    iget-object v0, p0, Lcu4;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldu4;

    invoke-static {p1, v0}, Lcu4;->a(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Ldu4;)V

    iget-object v0, p0, Lcu4;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfu4;

    invoke-static {p1, v0}, Lcu4;->b(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Lfu4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;

    invoke-virtual {p0, p1}, Lcu4;->c(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;)V

    return-void
.end method
