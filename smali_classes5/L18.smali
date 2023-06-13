.class public final LL18;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LG08;)LG08;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LG08<",
            "TT;>;)",
            "LG08<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Li18;

    if-nez v0, :cond_2

    instance-of v0, p0, LT08;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, LT08;

    invoke-direct {v0, p0}, LT08;-><init>(LG08;)V

    goto :goto_0

    :cond_1
    new-instance v0, Li18;

    invoke-direct {v0, p0}, Li18;-><init>(LG08;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)LG08;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LG08<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lx18;

    invoke-direct {v0, p0}, Lx18;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
