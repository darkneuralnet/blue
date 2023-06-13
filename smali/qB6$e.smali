.class public LqB6$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:I

.field public b:F

.field public final c:Landroid/view/animation/Interpolator;

.field public final d:J


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LqB6$e;->a:I

    iput-object p2, p0, LqB6$e;->c:Landroid/view/animation/Interpolator;

    iput-wide p3, p0, LqB6$e;->d:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, LqB6$e;->d:J

    return-wide v0
.end method

.method public b()F
    .locals 2

    iget-object v0, p0, LqB6$e;->c:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_0

    iget v1, p0, LqB6$e;->b:F

    invoke-interface {v0, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v0

    return v0

    :cond_0
    iget v0, p0, LqB6$e;->b:F

    return v0
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, LqB6$e;->b:F

    return-void
.end method
