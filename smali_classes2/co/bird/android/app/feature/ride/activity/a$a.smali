.class public final Lco/bird/android/app/feature/ride/activity/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/ride/activity/RideActivity$c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/ride/activity/a;
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

.method public synthetic constructor <init>(LuP0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/ride/activity/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LF5;LDt6;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LDQ3;)Lco/bird/android/app/feature/ride/activity/RideActivity$c;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LF5;",
            "LDt6;",
            "Landroidx/fragment/app/FragmentManager;",
            "Landroidx/lifecycle/f;",
            "LDQ3;",
            ")",
            "Lco/bird/android/app/feature/ride/activity/RideActivity$c;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p5 .. p5}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p6 .. p6}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p7 .. p7}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p8 .. p8}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p9 .. p9}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lco/bird/android/app/feature/ride/activity/a$b;

    const/4 v10, 0x0

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lco/bird/android/app/feature/ride/activity/a$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LF5;LDt6;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LDQ3;LvP0;)V

    return-object v11
.end method
