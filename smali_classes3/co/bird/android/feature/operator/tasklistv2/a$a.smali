.class public final Lco/bird/android/feature/operator/tasklistv2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/operator/tasklistv2/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/operator/tasklistv2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LfN0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/operator/tasklistv2/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)Lco/bird/android/feature/operator/tasklistv2/b;
    .locals 7

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lco/bird/android/feature/operator/tasklistv2/a$b;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/feature/operator/tasklistv2/a$b;-><init>(LlG2;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LgN0;)V

    return-object v6
.end method
