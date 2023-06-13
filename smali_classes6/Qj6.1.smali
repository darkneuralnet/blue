.class public LQj6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LQj6;->a:F

    iput v0, p0, LQj6;->b:F

    iput v0, p0, LQj6;->c:F

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LQj6;->a:F

    iput p2, p0, LQj6;->b:F

    iput p3, p0, LQj6;->c:F

    return-void
.end method

.method public constructor <init>(LQj6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Parameter \"v\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, LQj6;->o(LQj6;)V

    return-void
.end method

.method public static a(LQj6;LQj6;)LQj6;
    .locals 4

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LQj6;

    iget v1, p0, LQj6;->a:F

    iget v2, p1, LQj6;->a:F

    add-float/2addr v1, v2

    iget v2, p0, LQj6;->b:F

    iget v3, p1, LQj6;->b:F

    add-float/2addr v2, v3

    iget p0, p0, LQj6;->c:F

    iget p1, p1, LQj6;->c:F

    add-float/2addr p0, p1

    invoke-direct {v0, v1, v2, p0}, LQj6;-><init>(FFF)V

    return-object v0
.end method

.method public static b()LQj6;
    .locals 1

    new-instance v0, LQj6;

    invoke-direct {v0}, LQj6;-><init>()V

    invoke-virtual {v0}, LQj6;->p()V

    return-object v0
.end method

.method public static c(LQj6;LQj6;)LQj6;
    .locals 7

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, LQj6;->a:F

    iget v1, p0, LQj6;->b:F

    iget p0, p0, LQj6;->c:F

    iget v2, p1, LQj6;->a:F

    iget v3, p1, LQj6;->b:F

    iget p1, p1, LQj6;->c:F

    new-instance v4, LQj6;

    mul-float v5, v1, p1

    mul-float v6, p0, v3

    sub-float/2addr v5, v6

    mul-float/2addr p0, v2

    mul-float/2addr p1, v0

    sub-float/2addr p0, p1

    mul-float/2addr v0, v3

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    invoke-direct {v4, v5, p0, v0}, LQj6;-><init>(FFF)V

    return-object v4
.end method

.method public static d(LQj6;LQj6;)F
    .locals 3

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, LQj6;->a:F

    iget v1, p1, LQj6;->a:F

    mul-float/2addr v0, v1

    iget v1, p0, LQj6;->b:F

    iget v2, p1, LQj6;->b:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget p0, p0, LQj6;->c:F

    iget p1, p1, LQj6;->c:F

    mul-float/2addr p0, p1

    add-float/2addr v0, p0

    return v0
.end method

.method public static e(LQj6;LQj6;)Z
    .locals 3

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, LQj6;->a:F

    iget v1, p1, LQj6;->a:F

    invoke-static {v0, v1}, LXM2;->a(FF)Z

    move-result v0

    and-int/lit8 v0, v0, 0x1

    iget v1, p0, LQj6;->b:F

    iget v2, p1, LQj6;->b:F

    invoke-static {v1, v2}, LXM2;->a(FF)Z

    move-result v1

    and-int/2addr v0, v1

    iget p0, p0, LQj6;->c:F

    iget p1, p1, LQj6;->c:F

    invoke-static {p0, p1}, LXM2;->a(FF)Z

    move-result p0

    and-int/2addr p0, v0

    return p0
.end method

.method public static f()LQj6;
    .locals 1

    new-instance v0, LQj6;

    invoke-direct {v0}, LQj6;-><init>()V

    invoke-virtual {v0}, LQj6;->q()V

    return-object v0
.end method

.method public static h(LQj6;LQj6;)LQj6;
    .locals 4

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LQj6;

    iget v1, p0, LQj6;->a:F

    iget v2, p1, LQj6;->a:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget v2, p0, LQj6;->b:F

    iget v3, p1, LQj6;->b:F

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget p0, p0, LQj6;->c:F

    iget p1, p1, LQj6;->c:F

    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-direct {v0, v1, v2, p0}, LQj6;-><init>(FFF)V

    return-object v0
.end method

.method public static i(LQj6;LQj6;)LQj6;
    .locals 4

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LQj6;

    iget v1, p0, LQj6;->a:F

    iget v2, p1, LQj6;->a:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget v2, p0, LQj6;->b:F

    iget v3, p1, LQj6;->b:F

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget p0, p0, LQj6;->c:F

    iget p1, p1, LQj6;->c:F

    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-direct {v0, v1, v2, p0}, LQj6;-><init>(FFF)V

    return-object v0
.end method

.method public static k()LQj6;
    .locals 1

    new-instance v0, LQj6;

    invoke-direct {v0}, LQj6;-><init>()V

    invoke-virtual {v0}, LQj6;->r()V

    return-object v0
.end method

.method public static l()LQj6;
    .locals 1

    new-instance v0, LQj6;

    invoke-direct {v0}, LQj6;-><init>()V

    invoke-virtual {v0}, LQj6;->s()V

    return-object v0
.end method

.method public static v(LQj6;LQj6;)LQj6;
    .locals 4

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LQj6;

    iget v1, p0, LQj6;->a:F

    iget v2, p1, LQj6;->a:F

    sub-float/2addr v1, v2

    iget v2, p0, LQj6;->b:F

    iget v3, p1, LQj6;->b:F

    sub-float/2addr v2, v3

    iget p0, p0, LQj6;->c:F

    iget p1, p1, LQj6;->c:F

    sub-float/2addr p0, p1

    invoke-direct {v0, v1, v2, p0}, LQj6;-><init>(FFF)V

    return-object v0
.end method

.method public static w()LQj6;
    .locals 1

    new-instance v0, LQj6;

    invoke-direct {v0}, LQj6;-><init>()V

    invoke-virtual {v0}, LQj6;->t()V

    return-object v0
.end method

.method public static x()LQj6;
    .locals 1

    new-instance v0, LQj6;

    invoke-direct {v0}, LQj6;-><init>()V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LQj6;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    check-cast p1, LQj6;

    invoke-static {p0, p1}, LQj6;->e(LQj6;LQj6;)Z

    move-result p1

    return p1
.end method

.method public g()F
    .locals 2

    iget v0, p0, LQj6;->a:F

    mul-float/2addr v0, v0

    iget v1, p0, LQj6;->b:F

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    iget v1, p0, LQj6;->c:F

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, LQj6;->a:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, LQj6;->b:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, LQj6;->c:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j()LQj6;
    .locals 5

    new-instance v0, LQj6;

    invoke-direct {v0, p0}, LQj6;-><init>(LQj6;)V

    invoke-static {p0, p0}, LQj6;->d(LQj6;LQj6;)F

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LXM2;->a(FF)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, LQj6;->u()V

    goto :goto_0

    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    div-double/2addr v3, v1

    double-to-float v1, v3

    invoke-virtual {p0, v1}, LQj6;->m(F)LQj6;

    move-result-object v1

    invoke-virtual {v0, v1}, LQj6;->o(LQj6;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public m(F)LQj6;
    .locals 4

    new-instance v0, LQj6;

    iget v1, p0, LQj6;->a:F

    mul-float/2addr v1, p1

    iget v2, p0, LQj6;->b:F

    mul-float/2addr v2, p1

    iget v3, p0, LQj6;->c:F

    mul-float/2addr v3, p1

    invoke-direct {v0, v1, v2, v3}, LQj6;-><init>(FFF)V

    return-object v0
.end method

.method public n(FFF)V
    .locals 0

    iput p1, p0, LQj6;->a:F

    iput p2, p0, LQj6;->b:F

    iput p3, p0, LQj6;->c:F

    return-void
.end method

.method public o(LQj6;)V
    .locals 1

    const-string v0, "Parameter \"v\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p1, LQj6;->a:F

    iput v0, p0, LQj6;->a:F

    iget v0, p1, LQj6;->b:F

    iput v0, p0, LQj6;->b:F

    iget p1, p1, LQj6;->c:F

    iput p1, p0, LQj6;->c:F

    return-void
.end method

.method public p()V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v0, v1}, LQj6;->n(FFF)V

    return-void
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v0, v1}, LQj6;->n(FFF)V

    return-void
.end method

.method public r()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v0, v0}, LQj6;->n(FFF)V

    return-void
.end method

.method public s()V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, LQj6;->n(FFF)V

    return-void
.end method

.method public t()V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v1, v0}, LQj6;->n(FFF)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LQj6;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LQj6;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", z="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LQj6;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0}, LQj6;->n(FFF)V

    return-void
.end method
