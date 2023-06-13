.class public final Llx2;
.super Lo0;
.source "SourceFile"

# interfaces
.implements LNj6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo0;",
        "LNj6<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x694239d0b2d28e86L


# instance fields
.field public final e:D

.field public final f:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Lo0;-><init>()V

    iput-wide p1, p0, Llx2;->e:D

    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    move-result-wide p1

    iput-wide p1, p0, Llx2;->f:D

    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, Llx2;->j(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e(Lo0;)Z
    .locals 6

    instance-of v0, p1, Lii1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lii1;

    invoke-virtual {p1}, Lii1;->k()D

    move-result-wide v2

    iget-wide v4, p0, Llx2;->e:D

    cmpl-double p1, v2, v4

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Llx2;

    if-eqz v0, :cond_1

    check-cast p1, Llx2;

    iget-wide v0, p0, Llx2;->e:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-wide v1, p1, Llx2;->e:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public g()Lo0;
    .locals 3

    new-instance v0, Lii1;

    iget-wide v1, p0, Llx2;->e:D

    invoke-direct {v0, v1, v2}, Lii1;-><init>(D)V

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llx2;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lo0;)Lo0;
    .locals 0

    sget-object p1, Lo0;->c:Lo0;

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, Llx2;->e:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Llx2;->e:D

    const-wide v2, 0x4005bf0a8b145769L    # Math.E

    cmpl-double v2, v0, v2

    if-nez v2, :cond_0

    const-string v0, "x -> ln(x)"

    return-object v0

    :cond_0
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v2, v3

    const-string v0, "x -> log(base=%s, x)"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j(Lae6;)I
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, LNj6;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Llx2;->l()Ljava/lang/String;

    move-result-object v0

    check-cast p1, LNj6;

    invoke-interface {p1}, LNj6;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public k()D
    .locals 2

    iget-wide v0, p0, Llx2;->e:D

    return-wide v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lo0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
