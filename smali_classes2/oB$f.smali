.class public final LoB$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoB$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LoB$d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lfl2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfl2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public b:F


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lfl2<",
            "TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, LoB$f;->b:F

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfl2;

    iput-object p1, p0, LoB$f;->a:Lfl2;

    return-void
.end method


# virtual methods
.method public a()Lfl2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfl2<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LoB$f;->a:Lfl2;

    return-object v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LoB$f;->a:Lfl2;

    invoke-virtual {v0}, Lfl2;->f()F

    move-result v0

    return v0
.end method

.method public c(F)Z
    .locals 1

    iget v0, p0, LoB$f;->b:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iput p1, p0, LoB$f;->b:F

    const/4 p1, 0x0

    return p1
.end method

.method public d(F)Z
    .locals 0

    iget-object p1, p0, LoB$f;->a:Lfl2;

    invoke-virtual {p1}, Lfl2;->i()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public e()F
    .locals 1

    iget-object v0, p0, LoB$f;->a:Lfl2;

    invoke-virtual {v0}, Lfl2;->c()F

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
