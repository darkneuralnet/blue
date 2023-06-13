.class public LBe;
.super LQy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQy<",
        "LN51;",
        "LN51;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfl2<",
            "LN51;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, LQy;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LoB;
    .locals 1

    invoke-virtual {p0}, LBe;->c()Lb26;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/List;
    .locals 1

    invoke-super {p0}, LQy;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()Lb26;
    .locals 2

    new-instance v0, Lb26;

    iget-object v1, p0, LQy;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Lb26;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic isStatic()Z
    .locals 1

    invoke-super {p0}, LQy;->isStatic()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LQy;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
