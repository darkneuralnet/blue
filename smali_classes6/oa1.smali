.class public Loa1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:I


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4014666666666667L    # 5.1000000000000005

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Loa1;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    sget v0, Luf4;->elevationOverlayEnabled:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, LBM2;->b(Landroid/content/Context;IZ)Z

    move-result v3

    sget v0, Luf4;->elevationOverlayColor:I

    invoke-static {p1, v0, v1}, LHM2;->b(Landroid/content/Context;II)I

    move-result v4

    sget v0, Luf4;->elevationOverlayAccentColor:I

    invoke-static {p1, v0, v1}, LHM2;->b(Landroid/content/Context;II)I

    move-result v5

    sget v0, Luf4;->colorSurface:I

    invoke-static {p1, v0, v1}, LHM2;->b(Landroid/content/Context;II)I

    move-result v6

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget v7, p1, Landroid/util/DisplayMetrics;->density:F

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Loa1;-><init>(ZIIIF)V

    return-void
.end method

.method public constructor <init>(ZIIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Loa1;->a:Z

    iput p2, p0, Loa1;->b:I

    iput p3, p0, Loa1;->c:I

    iput p4, p0, Loa1;->d:I

    iput p5, p0, Loa1;->e:F

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 3

    iget v0, p0, Loa1;->e:F

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-lez v2, :cond_1

    cmpg-float v2, p1, v1

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->log1p(D)D

    move-result-wide v0

    double-to-float p1, v0

    const/high16 v0, 0x40900000    # 4.5f

    mul-float/2addr p1, v0

    const/high16 v0, 0x40000000    # 2.0f

    add-float/2addr p1, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public b(IF)I
    .locals 2

    invoke-virtual {p0, p2}, Loa1;->a(F)F

    move-result p2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/16 v1, 0xff

    invoke-static {p1, v1}, LJm0;->p(II)I

    move-result p1

    iget v1, p0, Loa1;->b:I

    invoke-static {p1, v1, p2}, LHM2;->i(IIF)I

    move-result p1

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    if-lez p2, :cond_0

    iget p2, p0, Loa1;->c:I

    if-eqz p2, :cond_0

    sget v1, Loa1;->f:I

    invoke-static {p2, v1}, LJm0;->p(II)I

    move-result p2

    invoke-static {p1, p2}, LHM2;->h(II)I

    move-result p1

    :cond_0
    invoke-static {p1, v0}, LJm0;->p(II)I

    move-result p1

    return p1
.end method

.method public c(IF)I
    .locals 1

    iget-boolean v0, p0, Loa1;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Loa1;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Loa1;->b(IF)I

    move-result p1

    :cond_0
    return p1
.end method

.method public d(F)I
    .locals 1

    iget v0, p0, Loa1;->d:I

    invoke-virtual {p0, v0, p1}, Loa1;->c(IF)I

    move-result p1

    return p1
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Loa1;->a:Z

    return v0
.end method

.method public final f(I)Z
    .locals 1

    const/16 v0, 0xff

    invoke-static {p1, v0}, LJm0;->p(II)I

    move-result p1

    iget v0, p0, Loa1;->d:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
