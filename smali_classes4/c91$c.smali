.class public Lc91$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TimeInterpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc91;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 4

    const/high16 v0, 0x3f000000    # 0.5f

    div-float/2addr p1, v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v2, p1, v1

    const/4 v3, 0x0

    if-gez v2, :cond_0

    mul-float/2addr v0, p1

    mul-float/2addr v0, p1

    add-float/2addr v0, v3

    goto :goto_0

    :cond_0
    sub-float/2addr p1, v1

    const/high16 v0, 0x40000000    # 2.0f

    sub-float v0, p1, v0

    mul-float/2addr p1, v0

    sub-float/2addr p1, v1

    const/high16 v0, -0x41000000    # -0.5f

    mul-float/2addr p1, v0

    add-float v0, p1, v3

    :goto_0
    return v0
.end method
