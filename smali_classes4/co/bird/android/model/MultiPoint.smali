.class public Lco/bird/android/model/MultiPoint;
.super Lco/bird/android/model/PointComposedGeom;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x100L


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lco/bird/android/model/PointComposedGeom;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/MultiPoint;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1, p2}, Lco/bird/android/model/PointComposedGeom;-><init>(ILjava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>([Lco/bird/android/model/Point;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Lco/bird/android/model/PointComposedGeom;-><init>(I[Lco/bird/android/model/Point;)V

    return-void
.end method
