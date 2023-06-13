.class public final Lco/bird/android/feature/operator/releaseassignment/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/operator/releaseassignment/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/operator/releaseassignment/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/feature/operator/releaseassignment/a$b;


# direct methods
.method public constructor <init>(LlG2;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/operator/releaseassignment/a$b;->b:Lco/bird/android/feature/operator/releaseassignment/a$b;

    iput-object p1, p0, Lco/bird/android/feature/operator/releaseassignment/a$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroid/app/Activity;LEO0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/feature/operator/releaseassignment/a$b;-><init>(LlG2;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/operator/releaseassignment/a$b;->b(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;)Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;)Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/operator/releaseassignment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/operator/releaseassignment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/operator/releaseassignment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/operator/releaseassignment/a$b;->c()Luu4;

    move-result-object v0

    invoke-static {p1, v0}, Lcu4;->d(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Luu4;)V

    new-instance v0, Ldu4;

    invoke-direct {v0}, Ldu4;-><init>()V

    invoke-static {p1, v0}, Lcu4;->a(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Ldu4;)V

    new-instance v0, Lfu4;

    invoke-direct {v0}, Lfu4;-><init>()V

    invoke-static {p1, v0}, Lcu4;->b(Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;Lfu4;)V

    return-object p1
.end method

.method public final c()Luu4;
    .locals 3

    new-instance v0, Luu4;

    iget-object v1, p0, Lco/bird/android/feature/operator/releaseassignment/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->c0()Liu4;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liu4;

    iget-object v2, p0, Lco/bird/android/feature/operator/releaseassignment/a$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    invoke-direct {v0, v1, v2}, Luu4;-><init>(Liu4;Le13;)V

    return-object v0
.end method
