.class public Lcj5;
.super Lgl2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgl2<",
        "Ldj5;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Ldj5;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfl2<",
            "Ldj5;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lgl2;-><init>(Ljava/util/List;)V

    new-instance p1, Ldj5;

    invoke-direct {p1}, Ldj5;-><init>()V

    iput-object p1, p0, Lcj5;->i:Ldj5;

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lfl2;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcj5;->p(Lfl2;F)Ldj5;

    move-result-object p1

    return-object p1
.end method

.method public p(Lfl2;F)Ldj5;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl2<",
            "Ldj5;",
            ">;F)",
            "Ldj5;"
        }
    .end annotation

    iget-object v0, p1, Lfl2;->b:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lfl2;->c:Ljava/lang/Object;

    if-eqz v1, :cond_1

    check-cast v0, Ldj5;

    check-cast v1, Ldj5;

    iget-object v2, p0, LoB;->e:LgE2;

    if-eqz v2, :cond_0

    iget v3, p1, Lfl2;->g:F

    iget-object p1, p1, Lfl2;->h:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {p0}, LoB;->e()F

    move-result v8

    invoke-virtual {p0}, LoB;->f()F

    move-result v9

    move-object v5, v0

    move-object v6, v1

    move v7, p2

    invoke-virtual/range {v2 .. v9}, LgE2;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldj5;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcj5;->i:Ldj5;

    invoke-virtual {v0}, Ldj5;->b()F

    move-result v2

    invoke-virtual {v1}, Ldj5;->b()F

    move-result v3

    invoke-static {v2, v3, p2}, LrU2;->i(FFF)F

    move-result v2

    invoke-virtual {v0}, Ldj5;->c()F

    move-result v0

    invoke-virtual {v1}, Ldj5;->c()F

    move-result v1

    invoke-static {v0, v1, p2}, LrU2;->i(FFF)F

    move-result p2

    invoke-virtual {p1, v2, p2}, Ldj5;->d(FF)V

    iget-object p1, p0, Lcj5;->i:Ldj5;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
