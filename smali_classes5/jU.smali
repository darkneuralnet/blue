.class public final LjU;
.super LK96;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LK96<",
        "LjU;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LK96;-><init>()V

    return-void
.end method

.method public static l()LjU;
    .locals 1

    new-instance v0, LjU;

    invoke-direct {v0}, LjU;-><init>()V

    invoke-virtual {v0}, LjU;->h()LjU;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LjU;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, LK96;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h()LjU;
    .locals 1

    new-instance v0, LQ61$a;

    invoke-direct {v0}, LQ61$a;-><init>()V

    invoke-virtual {p0, v0}, LjU;->j(LQ61$a;)LjU;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LK96;->hashCode()I

    move-result v0

    return v0
.end method

.method public j(LQ61$a;)LjU;
    .locals 0

    invoke-virtual {p1}, LQ61$a;->a()LQ61;

    move-result-object p1

    invoke-virtual {p0, p1}, LjU;->k(LI96;)LjU;

    move-result-object p1

    return-object p1
.end method

.method public k(LI96;)LjU;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LI96<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "LjU;"
        }
    .end annotation

    new-instance v0, LiU;

    invoke-direct {v0, p1}, LiU;-><init>(LI96;)V

    invoke-virtual {p0, v0}, LK96;->g(LI96;)LK96;

    move-result-object p1

    check-cast p1, LjU;

    return-object p1
.end method
