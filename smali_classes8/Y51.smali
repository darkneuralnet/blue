.class public final LY51;
.super Lo0;
.source "SourceFile"

# interfaces
.implements LlX2;


# static fields
.field private static final serialVersionUID:J = 0x5b6ffa3361087671L


# instance fields
.field public final e:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Lo0;-><init>()V

    iput-wide p1, p0, LY51;->e:D

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, LY51;->j(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 4

    iget-wide v0, p0, LY51;->e:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Lo0;)Z
    .locals 0

    instance-of p1, p1, LY51;

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LY51;

    if-eqz v0, :cond_1

    check-cast p1, LY51;

    iget-wide v0, p0, LY51;->e:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-wide v1, p1, LY51;->e:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic g()Lo0;
    .locals 1

    invoke-virtual {p0}, LY51;->l()LY51;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY51;->k()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public h(Lo0;)Lo0;
    .locals 5

    new-instance v0, LY51;

    iget-wide v1, p0, LY51;->e:D

    check-cast p1, LY51;

    iget-wide v3, p1, LY51;->e:D

    mul-double/2addr v1, v3

    invoke-direct {v0, v1, v2}, LY51;-><init>(D)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LY51;->e:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, LY51;->e:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "x -> x * %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j(Lae6;)I
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, LY51;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LY51;->k()Ljava/lang/Double;

    move-result-object v0

    check-cast p1, LY51;

    invoke-virtual {p1}, LY51;->k()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public k()Ljava/lang/Double;
    .locals 2

    iget-wide v0, p0, LY51;->e:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public l()LY51;
    .locals 5

    new-instance v0, LY51;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    iget-wide v3, p0, LY51;->e:D

    div-double/2addr v1, v3

    invoke-direct {v0, v1, v2}, LY51;-><init>(D)V

    return-object v0
.end method
