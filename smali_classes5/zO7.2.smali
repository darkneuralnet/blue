.class public final LzO7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/List;Lhs9;)Ljava/util/List;
    .locals 1

    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, LGN7;

    invoke-direct {v0, p0, p1}, LGN7;-><init>(Ljava/util/List;Lhs9;)V

    goto :goto_0

    :cond_0
    new-instance v0, LxO7;

    invoke-direct {v0, p0, p1}, LxO7;-><init>(Ljava/util/List;Lhs9;)V

    :goto_0
    return-object v0
.end method
