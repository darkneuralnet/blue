.class public Lar2;
.super LNs0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lar2$a;
    }
.end annotation


# instance fields
.field public g:F

.field public h:F

.field public i:I

.field public j:Landroid/graphics/Paint$Style;

.field public k:Ljava/lang/String;

.field public l:Landroid/graphics/DashPathEffect;

.field public m:Lar2$a;


# direct methods
.method public constructor <init>(F)V
    .locals 2

    invoke-direct {p0}, LNs0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lar2;->g:F

    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lar2;->h:F

    const/16 v0, 0xed

    const/16 v1, 0x5b

    invoke-static {v0, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lar2;->i:I

    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lar2;->j:Landroid/graphics/Paint$Style;

    const-string v0, ""

    iput-object v0, p0, Lar2;->k:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lar2;->l:Landroid/graphics/DashPathEffect;

    sget-object v0, Lar2$a;->d:Lar2$a;

    iput-object v0, p0, Lar2;->m:Lar2$a;

    iput p1, p0, Lar2;->g:F

    return-void
.end method


# virtual methods
.method public i(FFF)V
    .locals 3

    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p2, v1, p1

    invoke-direct {v0, v1, p3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    iput-object v0, p0, Lar2;->l:Landroid/graphics/DashPathEffect;

    return-void
.end method

.method public j()Landroid/graphics/DashPathEffect;
    .locals 1

    iget-object v0, p0, Lar2;->l:Landroid/graphics/DashPathEffect;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lar2;->k:Ljava/lang/String;

    return-object v0
.end method

.method public l()Lar2$a;
    .locals 1

    iget-object v0, p0, Lar2;->m:Lar2$a;

    return-object v0
.end method

.method public m()F
    .locals 1

    iget v0, p0, Lar2;->g:F

    return v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lar2;->i:I

    return v0
.end method

.method public o()F
    .locals 1

    iget v0, p0, Lar2;->h:F

    return v0
.end method

.method public p()Landroid/graphics/Paint$Style;
    .locals 1

    iget-object v0, p0, Lar2;->j:Landroid/graphics/Paint$Style;

    return-object v0
.end method

.method public q(I)V
    .locals 0

    iput p1, p0, Lar2;->i:I

    return-void
.end method
