.class public abstract LNs4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(JJLGp;)LNs4;
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    const-string v5, "duration must be positive value."

    invoke-static {v2, v5}, LHZ3;->b(ZLjava/lang/Object;)V

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    const-string v0, "bytes must be positive value."

    invoke-static {v3, v0}, LHZ3;->b(ZLjava/lang/Object;)V

    new-instance v0, Lbu;

    move-object v4, v0

    move-wide v5, p0

    move-wide v7, p2

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, Lbu;-><init>(JJLGp;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()LGp;
.end method

.method public abstract b()J
.end method

.method public abstract c()J
.end method
