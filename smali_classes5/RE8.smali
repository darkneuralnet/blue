.class public final LRE8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LLD8;)LLD8;
    .locals 1

    instance-of v0, p0, LtE8;

    if-nez v0, :cond_2

    instance-of v0, p0, LXD8;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, LXD8;

    invoke-direct {v0, p0}, LXD8;-><init>(LLD8;)V

    goto :goto_0

    :cond_1
    new-instance v0, LtE8;

    invoke-direct {v0, p0}, LtE8;-><init>(LLD8;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)LLD8;
    .locals 1

    new-instance v0, LGE8;

    invoke-direct {v0, p0}, LGE8;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
