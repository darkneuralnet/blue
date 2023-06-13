.class public abstract LXv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXv$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LXv;
    .locals 4

    new-instance v0, Ljt;

    sget-object v1, LXv$a;->d:LXv$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ljt;-><init>(LXv$a;J)V

    return-object v0
.end method

.method public static d()LXv;
    .locals 4

    new-instance v0, Ljt;

    sget-object v1, LXv$a;->e:LXv$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ljt;-><init>(LXv$a;J)V

    return-object v0
.end method

.method public static e(J)LXv;
    .locals 2

    new-instance v0, Ljt;

    sget-object v1, LXv$a;->b:LXv$a;

    invoke-direct {v0, v1, p0, p1}, Ljt;-><init>(LXv$a;J)V

    return-object v0
.end method

.method public static f()LXv;
    .locals 4

    new-instance v0, Ljt;

    sget-object v1, LXv$a;->c:LXv$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ljt;-><init>(LXv$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()LXv$a;
.end method
