.class public final LJ95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI95;


# instance fields
.field public final a:LK95;


# direct methods
.method public constructor <init>(LK95;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ95;->a:LK95;

    return-void
.end method

.method public static b(LK95;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK95;",
            ")",
            "LY94<",
            "LI95;",
            ">;"
        }
    .end annotation

    new-instance v0, LJ95;

    invoke-direct {v0, p0}, LJ95;-><init>(LK95;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZ)LH95;
    .locals 13

    move-object v0, p0

    iget-object v1, v0, LJ95;->a:LK95;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, LK95;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZ)LH95;

    move-result-object v1

    return-object v1
.end method
