.class public final Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a$a;
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
.method public static synthetic create$default(Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a$a;LlG2;Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LC3;ZLco/bird/android/model/constant/FlightSheetContext;ILjava/lang/Object;)Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a;
    .locals 9

    if-nez p9, :cond_2

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v7, v0

    goto :goto_0

    :cond_0
    move v7, p6

    :goto_0
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_1

    sget-object v0, Lco/bird/android/model/constant/FlightSheetContext;->STANDARD:Lco/bird/android/model/constant/FlightSheetContext;

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object/from16 v8, p7

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v8}, Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a$a;->a(LlG2;Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LC3;ZLco/bird/android/model/constant/FlightSheetContext;)Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: create"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
