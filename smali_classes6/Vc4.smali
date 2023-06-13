.class public LVc4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LVc4;->a:F

    iput v0, p0, LVc4;->b:F

    iput v0, p0, LVc4;->c:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LVc4;->d:F

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2, p3, p4}, LVc4;->i(FFFF)V

    return-void
.end method

.method public static a(LQj6;F)LVc4;
    .locals 7

    const-string v0, "Parameter \"axis\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LVc4;

    invoke-direct {v0}, LVc4;-><init>()V

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    iget p1, p0, LQj6;->a:F

    float-to-double v5, p1

    mul-double/2addr v5, v3

    double-to-float p1, v5

    iput p1, v0, LVc4;->a:F

    iget p1, p0, LQj6;->b:F

    float-to-double v5, p1

    mul-double/2addr v5, v3

    double-to-float p1, v5

    iput p1, v0, LVc4;->b:F

    iget p0, p0, LQj6;->c:F

    float-to-double p0, p0

    mul-double/2addr p0, v3

    double-to-float p0, p0

    iput p0, v0, LVc4;->c:F

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    double-to-float p0, p0

    iput p0, v0, LVc4;->d:F

    invoke-virtual {v0}, LVc4;->f()Z

    return-object v0
.end method

.method public static b(LVc4;LVc4;)F
    .locals 3

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, LVc4;->a:F

    iget v1, p1, LVc4;->a:F

    mul-float/2addr v0, v1

    iget v1, p0, LVc4;->b:F

    iget v2, p1, LVc4;->b:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, LVc4;->c:F

    iget v2, p1, LVc4;->c:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget p0, p0, LVc4;->d:F

    iget p1, p1, LVc4;->d:F

    mul-float/2addr p0, p1

    add-float/2addr v0, p0

    return v0
.end method

.method public static c(LVc4;LVc4;)Z
    .locals 1

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, LVc4;->b(LVc4;LVc4;)F

    move-result p0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p0, p1}, LXM2;->a(FF)Z

    move-result p0

    return p0
.end method

.method public static d(LQj6;LQj6;)LVc4;
    .locals 1

    const-string v0, "Parameter \"forwardInWorld\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"desiredUpInWorld\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LQj6;->f()LQj6;

    move-result-object v0

    invoke-static {v0, p0}, LVc4;->h(LQj6;LQj6;)LVc4;

    move-result-object v0

    invoke-static {p0, p1}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object p1

    invoke-static {p1, p0}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object p0

    invoke-static {}, LQj6;->w()LQj6;

    move-result-object p1

    invoke-static {v0, p1}, LVc4;->g(LVc4;LQj6;)LQj6;

    move-result-object p1

    invoke-static {p1, p0}, LVc4;->h(LQj6;LQj6;)LVc4;

    move-result-object p0

    invoke-static {p0, v0}, LVc4;->e(LVc4;LVc4;)LVc4;

    move-result-object p0

    return-object p0
.end method

.method public static e(LVc4;LVc4;)LVc4;
    .locals 11

    const-string v0, "Parameter \"lhs\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"rhs\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, LVc4;->a:F

    iget v1, p0, LVc4;->b:F

    iget v2, p0, LVc4;->c:F

    iget p0, p0, LVc4;->d:F

    iget v3, p1, LVc4;->a:F

    iget v4, p1, LVc4;->b:F

    iget v5, p1, LVc4;->c:F

    iget p1, p1, LVc4;->d:F

    new-instance v6, LVc4;

    mul-float v7, p0, v3

    mul-float v8, v0, p1

    add-float/2addr v7, v8

    mul-float v8, v1, v5

    add-float/2addr v7, v8

    mul-float v8, v2, v4

    sub-float/2addr v7, v8

    mul-float v8, p0, v4

    mul-float v9, v0, v5

    sub-float/2addr v8, v9

    mul-float v9, v1, p1

    add-float/2addr v8, v9

    mul-float v9, v2, v3

    add-float/2addr v8, v9

    mul-float v9, p0, v5

    mul-float v10, v0, v4

    add-float/2addr v9, v10

    mul-float v10, v1, v3

    sub-float/2addr v9, v10

    mul-float v10, v2, p1

    add-float/2addr v9, v10

    mul-float/2addr p0, p1

    mul-float/2addr v0, v3

    sub-float/2addr p0, v0

    mul-float/2addr v1, v4

    sub-float/2addr p0, v1

    mul-float/2addr v2, v5

    sub-float/2addr p0, v2

    invoke-direct {v6, v7, v8, v9, p0}, LVc4;-><init>(FFFF)V

    return-object v6
.end method

.method public static g(LVc4;LQj6;)LQj6;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "Parameter \"q\" was null."

    invoke-static {v0, v2}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Parameter \"src\" was null."

    invoke-static {v1, v2}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LQj6;

    invoke-direct {v2}, LQj6;-><init>()V

    iget v3, v0, LVc4;->d:F

    mul-float v4, v3, v3

    iget v5, v0, LVc4;->a:F

    mul-float v6, v5, v5

    iget v7, v0, LVc4;->b:F

    mul-float v8, v7, v7

    iget v0, v0, LVc4;->c:F

    mul-float v9, v0, v0

    mul-float v10, v0, v3

    mul-float v11, v5, v7

    mul-float v12, v5, v0

    mul-float v13, v7, v3

    mul-float/2addr v7, v0

    mul-float/2addr v5, v3

    add-float v0, v4, v6

    sub-float/2addr v0, v9

    sub-float/2addr v0, v8

    add-float v3, v11, v10

    add-float/2addr v3, v10

    add-float/2addr v3, v11

    sub-float v14, v12, v13

    add-float/2addr v14, v12

    sub-float/2addr v14, v13

    neg-float v15, v10

    add-float/2addr v15, v11

    sub-float/2addr v15, v10

    add-float/2addr v15, v11

    sub-float v10, v8, v9

    add-float/2addr v10, v4

    sub-float/2addr v10, v6

    add-float/2addr v7, v7

    add-float v11, v7, v5

    add-float/2addr v11, v5

    add-float v16, v13, v12

    add-float v16, v16, v12

    add-float v16, v16, v13

    sub-float/2addr v7, v5

    sub-float/2addr v7, v5

    sub-float/2addr v9, v8

    sub-float/2addr v9, v6

    add-float/2addr v9, v4

    iget v4, v1, LQj6;->a:F

    iget v5, v1, LQj6;->b:F

    iget v1, v1, LQj6;->c:F

    mul-float/2addr v0, v4

    mul-float/2addr v15, v5

    add-float/2addr v0, v15

    mul-float v16, v16, v1

    add-float v0, v0, v16

    iput v0, v2, LQj6;->a:F

    mul-float/2addr v3, v4

    mul-float/2addr v10, v5

    add-float/2addr v3, v10

    mul-float/2addr v7, v1

    add-float/2addr v3, v7

    iput v3, v2, LQj6;->b:F

    mul-float/2addr v14, v4

    mul-float/2addr v11, v5

    add-float/2addr v14, v11

    mul-float/2addr v9, v1

    add-float/2addr v14, v9

    iput v14, v2, LQj6;->c:F

    return-object v2
.end method

.method public static h(LQj6;LQj6;)LVc4;
    .locals 5

    const-string v0, "Parameter \"start\" was null."

    invoke-static {p0, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"end\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LQj6;->j()LQj6;

    move-result-object p0

    invoke-virtual {p1}, LQj6;->j()LQj6;

    move-result-object p1

    invoke-static {p0, p1}, LQj6;->d(LQj6;LQj6;)F

    move-result v0

    const v1, -0x40804189    # -0.999f

    cmpg-float v1, v0, v1

    if-gez v1, :cond_1

    invoke-static {}, LQj6;->b()LQj6;

    move-result-object p1

    invoke-static {p1, p0}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object p1

    invoke-virtual {p1}, LQj6;->g()F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-static {}, LQj6;->l()LQj6;

    move-result-object p1

    invoke-static {p1, p0}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, LQj6;->j()LQj6;

    move-result-object p0

    const/high16 p1, 0x43340000    # 180.0f

    invoke-static {p0, p1}, LVc4;->a(LQj6;F)LVc4;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object p0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    float-to-double v3, v0

    add-double/2addr v3, v1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double/2addr v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p1

    new-instance v1, LVc4;

    iget v2, p0, LQj6;->a:F

    mul-float/2addr v2, v0

    iget v3, p0, LQj6;->b:F

    mul-float/2addr v3, v0

    iget p0, p0, LQj6;->c:F

    mul-float/2addr p0, v0

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p1, v0

    invoke-direct {v1, v2, v3, p0, p1}, LVc4;-><init>(FFFF)V

    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LVc4;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    check-cast p1, LVc4;

    invoke-static {p0, p1}, LVc4;->c(LVc4;LVc4;)Z

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 4

    invoke-static {p0, p0}, LVc4;->b(LVc4;LVc4;)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LXM2;->a(FF)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LVc4;->j()V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    div-double/2addr v2, v0

    double-to-float v0, v2

    iget v1, p0, LVc4;->a:F

    mul-float/2addr v1, v0

    iput v1, p0, LVc4;->a:F

    iget v1, p0, LVc4;->b:F

    mul-float/2addr v1, v0

    iput v1, p0, LVc4;->b:F

    iget v1, p0, LVc4;->c:F

    mul-float/2addr v1, v0

    iput v1, p0, LVc4;->c:F

    iget v1, p0, LVc4;->d:F

    mul-float/2addr v1, v0

    iput v1, p0, LVc4;->d:F

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, LVc4;->d:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, LVc4;->a:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, LVc4;->b:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, LVc4;->c:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i(FFFF)V
    .locals 0

    iput p1, p0, LVc4;->a:F

    iput p2, p0, LVc4;->b:F

    iput p3, p0, LVc4;->c:F

    iput p4, p0, LVc4;->d:F

    invoke-virtual {p0}, LVc4;->f()Z

    return-void
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LVc4;->a:F

    iput v0, p0, LVc4;->b:F

    iput v0, p0, LVc4;->c:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LVc4;->d:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVc4;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVc4;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", z="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVc4;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", w="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVc4;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
