.class public abstract LNs0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:F

.field public c:F

.field public d:Landroid/graphics/Typeface;

.field public e:F

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LNs0;->a:Z

    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, LNs0;->b:F

    iput v0, p0, LNs0;->c:F

    const/4 v0, 0x0

    iput-object v0, p0, LNs0;->d:Landroid/graphics/Typeface;

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, p0, LNs0;->e:F

    const/high16 v0, -0x1000000

    iput v0, p0, LNs0;->f:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LNs0;->f:I

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, LNs0;->e:F

    return v0
.end method

.method public c()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, LNs0;->d:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, LNs0;->b:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, LNs0;->c:F

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, LNs0;->a:Z

    return v0
.end method

.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, LNs0;->a:Z

    return-void
.end method

.method public h(I)V
    .locals 0

    iput p1, p0, LNs0;->f:I

    return-void
.end method
