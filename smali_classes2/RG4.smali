.class public final LRG4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQG4;


# instance fields
.field public final a:LSG4;


# direct methods
.method public constructor <init>(LSG4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRG4;->a:LSG4;

    return-void
.end method

.method public static b(LSG4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSG4;",
            ")",
            "LY94<",
            "LQG4;",
            ">;"
        }
    .end annotation

    new-instance v0, LRG4;

    invoke-direct {v0, p0}, LRG4;-><init>(LSG4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;ZLandroid/view/View;)LPG4;
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LRG4;->a:LSG4;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    invoke-virtual/range {v1 .. v13}, LSG4;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;ZLandroid/view/View;)LPG4;

    move-result-object v1

    return-object v1
.end method
