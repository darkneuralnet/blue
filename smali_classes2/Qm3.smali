.class public final LQm3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPm3;


# instance fields
.field public final a:LRm3;


# direct methods
.method public constructor <init>(LRm3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQm3;->a:LRm3;

    return-void
.end method

.method public static b(LRm3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRm3;",
            ")",
            "LY94<",
            "LPm3;",
            ">;"
        }
    .end annotation

    new-instance v0, LQm3;

    invoke-direct {v0, p0}, LQm3;-><init>(LRm3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;Z)LOm3;
    .locals 11

    move-object v0, p0

    iget-object v1, v0, LQm3;->a:LRm3;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, LRm3;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;Z)LOm3;

    move-result-object v1

    return-object v1
.end method
