.class public final Lna1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u001f\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\" \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0006\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\t\u001a\u0004\u0008\r\u0010\u000b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpm0;",
        "backgroundColor",
        "Lk61;",
        "elevation",
        "b",
        "(JFLEt0;I)J",
        "LU94;",
        "Lma1;",
        "a",
        "LU94;",
        "d",
        "()LU94;",
        "LocalElevationOverlay",
        "c",
        "LocalAbsoluteElevation",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lma1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lk61;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Lna1$b;->g:Lna1$b;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lna1;->a:LU94;

    sget-object v0, Lna1$a;->g:Lna1$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lgu0;->c(LEM5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LU94;

    move-result-object v0

    sput-object v0, Lna1;->b:LU94;

    return-void
.end method

.method public static final synthetic a(JFLEt0;I)J
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lna1;->b(JFLEt0;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(JFLEt0;I)J
    .locals 9

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)"

    const v2, 0x6029a0db

    invoke-static {v2, p4, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    int-to-float v0, v0

    add-float/2addr p2, v0

    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    double-to-float p2, v0

    const/high16 v0, 0x40900000    # 4.5f

    mul-float/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    add-float/2addr p2, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float v3, p2, v0

    and-int/lit8 p2, p4, 0xe

    invoke-static {p0, p1, p3, p2}, LNm0;->b(JLEt0;I)J

    move-result-wide v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-wide p0
.end method

.method public static final c()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Lk61;",
            ">;"
        }
    .end annotation

    sget-object v0, Lna1;->b:LU94;

    return-object v0
.end method

.method public static final d()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Lma1;",
            ">;"
        }
    .end annotation

    sget-object v0, Lna1;->a:LU94;

    return-object v0
.end method
