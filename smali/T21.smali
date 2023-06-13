.class public LT21;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LSe4;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, LmX1;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LmX1;

    invoke-direct {v1}, LmX1;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {}, LOV5;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, LOV5;

    invoke-direct {v1}, LOV5;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {}, Lhf0;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lhf0;

    invoke-direct {v1}, Lhf0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {}, LhE2;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, LhE2;

    invoke-direct {v1}, LhE2;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method
