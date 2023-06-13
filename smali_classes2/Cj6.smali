.class public LCj6;
.super LoB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "A:",
        "Ljava/lang/Object;",
        ">",
        "LoB<",
        "TK;TA;>;"
    }
.end annotation


# instance fields
.field public final i:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "TA;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(LgE2;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "TA;>;TA;)V"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, LoB;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p1}, LoB;->n(LgE2;)V

    iput-object p2, p0, LCj6;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public h()Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    iget-object v0, p0, LoB;->e:LgE2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v4, p0, LCj6;->i:Ljava/lang/Object;

    invoke-virtual {p0}, LoB;->f()F

    move-result v5

    invoke-virtual {p0}, LoB;->f()F

    move-result v6

    invoke-virtual {p0}, LoB;->f()F

    move-result v7

    move-object v3, v4

    invoke-virtual/range {v0 .. v7}, LgE2;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public i(Lfl2;F)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl2<",
            "TK;>;F)TA;"
        }
    .end annotation

    invoke-virtual {p0}, LCj6;->h()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, LoB;->e:LgE2;

    if-eqz v0, :cond_0

    invoke-super {p0}, LoB;->k()V

    :cond_0
    return-void
.end method

.method public m(F)V
    .locals 0

    iput p1, p0, LoB;->d:F

    return-void
.end method
