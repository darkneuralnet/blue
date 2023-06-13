.class public final Lco/bird/android/feature/operator/tasklistv2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/operator/tasklistv2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/operator/tasklistv2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Landroidx/fragment/app/FragmentManager;

.field public final c:Landroidx/lifecycle/f;

.field public final d:Lco/bird/android/feature/operator/tasklistv2/a$b;


# direct methods
.method public constructor <init>(LlG2;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->d:Lco/bird/android/feature/operator/tasklistv2/a$b;

    iput-object p1, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->a:LlG2;

    iput-object p3, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->b:Landroidx/fragment/app/FragmentManager;

    iput-object p4, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->c:Landroidx/lifecycle/f;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LgN0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/feature/operator/tasklistv2/a$b;-><init>(LlG2;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/operator/tasklistv2/a$b;->b(Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;)Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;)Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/operator/tasklistv2/a$b;->d()Lsw3;

    move-result-object v0

    invoke-static {p1, v0}, LLv3;->c(Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;Lsw3;)V

    invoke-virtual {p0}, Lco/bird/android/feature/operator/tasklistv2/a$b;->c()LWv3;

    move-result-object v0

    invoke-static {p1, v0}, LLv3;->a(Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;LWv3;)V

    return-object p1
.end method

.method public final c()LWv3;
    .locals 3

    new-instance v0, LWv3;

    iget-object v1, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->b:Landroidx/fragment/app/FragmentManager;

    iget-object v2, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->c:Landroidx/lifecycle/f;

    invoke-direct {v0, v1, v2}, LWv3;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V

    return-object v0
.end method

.method public final d()Lsw3;
    .locals 2

    new-instance v0, Lsw3;

    iget-object v1, p0, Lco/bird/android/feature/operator/tasklistv2/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->F0()Lom3;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lom3;

    invoke-direct {v0, v1}, Lsw3;-><init>(Lom3;)V

    return-object v0
.end method
