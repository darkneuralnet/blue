.class public final Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic create$default(Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;LlG2;Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lcom/guness/widget/NavigationView;Lco/bird/android/model/constant/FlightSheetContext;ZLu4;LCt6;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LDQ3;ILjava/lang/Object;)Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;
    .locals 17

    move/from16 v0, p15

    if-nez p16, :cond_2

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/model/constant/FlightSheetContext;->STANDARD:Lco/bird/android/model/constant/FlightSheetContext;

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v11, v0

    goto :goto_1

    :cond_1
    move/from16 v11, p9

    :goto_1
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    invoke-interface/range {v2 .. v16}, Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;->a(LlG2;Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lcom/guness/widget/NavigationView;Lco/bird/android/model/constant/FlightSheetContext;ZLu4;LCt6;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LDQ3;)Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: create"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
