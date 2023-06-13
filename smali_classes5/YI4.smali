.class public LYI4;
.super LLD;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LLD<",
        "LYI4;",
        ">;"
    }
.end annotation


# static fields
.field public static B:LYI4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LLD;-><init>()V

    return-void
.end method

.method public static F0()LYI4;
    .locals 1

    sget-object v0, LYI4;->B:LYI4;

    if-nez v0, :cond_0

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    invoke-virtual {v0}, LLD;->f()LLD;

    move-result-object v0

    check-cast v0, LYI4;

    invoke-virtual {v0}, LLD;->e()LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sput-object v0, LYI4;->B:LYI4;

    :cond_0
    sget-object v0, LYI4;->B:LYI4;

    return-object v0
.end method

.method public static G0(Ljava/lang/Class;)LYI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYI4;"
        }
    .end annotation

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    invoke-virtual {v0, p0}, LLD;->j(Ljava/lang/Class;)LLD;

    move-result-object p0

    check-cast p0, LYI4;

    return-object p0
.end method

.method public static H0(LB41;)LYI4;
    .locals 1

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    invoke-virtual {v0, p0}, LLD;->k(LB41;)LLD;

    move-result-object p0

    check-cast p0, LYI4;

    return-object p0
.end method

.method public static I0(II)LYI4;
    .locals 1

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    invoke-virtual {v0, p0, p1}, LLD;->k0(II)LLD;

    move-result-object p0

    check-cast p0, LYI4;

    return-object p0
.end method

.method public static J0(Lak2;)LYI4;
    .locals 1

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    invoke-virtual {v0, p0}, LLD;->v0(Lak2;)LLD;

    move-result-object p0

    check-cast p0, LYI4;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LYI4;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, LLD;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LLD;->hashCode()I

    move-result v0

    return v0
.end method
