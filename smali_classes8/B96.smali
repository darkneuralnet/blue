.class public final LB96;
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
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final f:Lu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu1<",
            "TQ;>;"
        }
    .end annotation
.end field

.field public final g:LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSd6<",
            "TQ;>;"
        }
    .end annotation
.end field

.field public final h:Lae6;


# direct methods
.method public constructor <init>(LSd6;Lae6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "TQ;>;",
            "Lae6;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, LB96;-><init>(Ljava/lang/String;LSd6;Lae6;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LSd6;LSd6;Lae6;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LSd6<",
            "TQ;>;",
            "LSd6<",
            "TQ;>;",
            "Lae6;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LB96;-><init>(Ljava/lang/String;Ljava/lang/String;LSd6;LSd6;Lae6;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LSd6;Lae6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LSd6<",
            "TQ;>;",
            "Lae6;",
            ")V"
        }
    .end annotation

    invoke-interface {p2}, LSd6;->G()LSd6;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0, p3}, LB96;-><init>(Ljava/lang/String;LSd6;LSd6;Lae6;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LSd6;LSd6;Lae6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LSd6<",
            "TQ;>;",
            "LSd6<",
            "TQ;>;",
            "Lae6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lu1;-><init>()V

    instance-of v0, p3, Lu1;

    if-eqz v0, :cond_0

    check-cast p3, Lu1;

    iput-object p4, p0, LB96;->g:LSd6;

    iput-object p3, p0, LB96;->f:Lu1;

    iput-object p5, p0, LB96;->h:Lae6;

    invoke-virtual {p0, p1}, Lu1;->H(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lu1;->E(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "The parent unit: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " is not an abstract unit."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LSd6;Lae6;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LSd6<",
            "TQ;>;",
            "Lae6;",
            ")V"
        }
    .end annotation

    invoke-interface {p3}, LSd6;->G()LSd6;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LB96;-><init>(Ljava/lang/String;Ljava/lang/String;LSd6;LSd6;Lae6;)V

    return-void
.end method


# virtual methods
.method public F()LV31;
    .locals 1

    iget-object v0, p0, LB96;->f:Lu1;

    invoke-virtual {v0}, Lu1;->F()LV31;

    move-result-object v0

    return-object v0
.end method

.method public J()LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    iget-object v0, p0, LB96;->g:LSd6;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LB96;->f:Lu1;

    invoke-virtual {v0}, Lu1;->G()LSd6;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public L()Lae6;
    .locals 1

    iget-object v0, p0, LB96;->h:Lae6;

    return-object v0
.end method

.method public M()LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    iget-object v0, p0, LB96;->f:Lu1;

    return-object v0
.end method

.method public b0()Lae6;
    .locals 2

    iget-object v0, p0, LB96;->f:Lu1;

    invoke-interface {v0}, LRp0;->b0()Lae6;

    move-result-object v0

    iget-object v1, p0, LB96;->h:Lae6;

    invoke-interface {v0, v1}, Lae6;->c(Lae6;)Lae6;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LB96;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LB96;

    iget-object v1, p0, LB96;->f:Lu1;

    iget-object v3, p1, LB96;->f:Lu1;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LB96;->h:Lae6;

    iget-object p1, p1, LB96;->h:Lae6;

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

    iget-object v2, p0, LB96;->f:Lu1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LB96;->h:Lae6;

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

    iget-object v0, p0, LB96;->f:Lu1;

    invoke-virtual {v0}, Lu1;->l()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
