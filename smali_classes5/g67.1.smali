.class public final Lg67;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/List;LF57;)Ljava/util/List;
    .locals 1

    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, Ld67;

    invoke-direct {v0, p0, p1}, Ld67;-><init>(Ljava/util/List;LF57;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lf67;

    invoke-direct {v0, p0, p1}, Lf67;-><init>(Ljava/util/List;LF57;)V

    :goto_0
    return-object v0
.end method
