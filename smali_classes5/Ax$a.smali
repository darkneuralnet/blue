.class public LAx$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final synthetic d:LAx;


# direct methods
.method public constructor <init>(LAx;)V
    .locals 0

    iput-object p1, p0, LAx$a;->d:LAx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyx;LYN1;)V
    .locals 4

    iget-object v0, p0, LAx$a;->d:LAx;

    iget-object v0, v0, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->a()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-interface {p1}, Lyx;->c()F

    move-result v1

    invoke-interface {p1}, Lyx;->o()F

    move-result p1

    sget-object v2, LTS0$a;->c:LTS0$a;

    const/high16 v3, 0x7fc00000    # Float.NaN

    invoke-interface {p2, v1, v3, v2}, LoO1;->D0(FFLTS0$a;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    sget-object v2, LTS0$a;->b:LTS0$a;

    invoke-interface {p2, p1, v3, v2}, LoO1;->D0(FFLTS0$a;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-interface {p2, v1}, LoO1;->b(Lcom/github/mikephil/charting/data/Entry;)I

    move-result v1

    :goto_0
    iput v1, p0, LAx$a;->a:I

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2, p1}, LoO1;->b(Lcom/github/mikephil/charting/data/Entry;)I

    move-result v2

    :goto_1
    iput v2, p0, LAx$a;->b:I

    iget p1, p0, LAx$a;->a:I

    sub-int/2addr v2, p1

    int-to-float p1, v2

    mul-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, LAx$a;->c:I

    return-void
.end method
