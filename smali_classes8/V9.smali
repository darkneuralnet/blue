.class public final LV9;
.super Lu1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Q:",
        "Ljava/lang/Object;",
        ">",
        "Lu1<",
        "TQ;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x412dff5bde6ffa51L


# instance fields
.field public final f:LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSd6<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LSd6;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lu1;-><init>(Ljava/lang/String;)V

    instance-of p2, p1, Lu1;

    const-string v0, "The parent unit: "

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lu1;

    invoke-virtual {p2}, Lu1;->v()Z

    move-result p2

    if-eqz p2, :cond_1

    instance-of p2, p1, LV9;

    if-eqz p2, :cond_0

    check-cast p1, LV9;

    invoke-virtual {p1}, LV9;->L()LSd6;

    move-result-object p1

    :cond_0
    iput-object p1, p0, LV9;->f:LSd6;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an unscaled SI unit"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an AbstractUnit"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(LSd6;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LV9;-><init>(LSd6;Ljava/lang/String;)V

    iput-object p3, p0, Lu1;->b:Ljava/lang/String;

    return-void
.end method

.method public static M(LSd6;Ljava/lang/String;Ljava/lang/String;)LV9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Ljava/lang/Object;",
            ">(",
            "LSd6<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "LV9<",
            "TQ;>;"
        }
    .end annotation

    new-instance v0, LV9;

    invoke-direct {v0, p0, p1, p2}, LV9;-><init>(LSd6;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public F()LV31;
    .locals 1

    iget-object v0, p0, LV9;->f:LSd6;

    invoke-interface {v0}, LSd6;->F()LV31;

    move-result-object v0

    return-object v0
.end method

.method public J()LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    return-object p0
.end method

.method public L()LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LV9;->f:LSd6;

    return-object v0
.end method

.method public b0()Lae6;
    .locals 1

    iget-object v0, p0, LV9;->f:LSd6;

    check-cast v0, Lu1;

    invoke-interface {v0}, LRp0;->b0()Lae6;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LV9;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LV9;

    iget-object v1, p0, LV9;->f:LSd6;

    iget-object v3, p1, LV9;->f:LSd6;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lu1;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lu1;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LV9;->f:LSd6;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lu1;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public l()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "+",
            "LSd6<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LV9;->f:LSd6;

    invoke-interface {v0}, LSd6;->l()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
