.class public final LbX0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001a\u0008\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0008\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0006\u001a\u0004\u0008\u0003\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "LqZ0;",
        "b",
        "",
        "a",
        "Z",
        "defaultMainDelayOptIn",
        "LqZ0;",
        "()LqZ0;",
        "DefaultDelay",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Z

.field public static final b:LqZ0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LiY5;->e(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, LbX0;->a:Z

    invoke-static {}, LbX0;->b()LqZ0;

    move-result-object v0

    sput-object v0, LbX0;->b:LqZ0;

    return-void
.end method

.method public static final a()LqZ0;
    .locals 1

    sget-object v0, LbX0;->b:LqZ0;

    return-object v0
.end method

.method public static final b()LqZ0;
    .locals 2

    sget-boolean v0, LbX0;->a:Z

    if-nez v0, :cond_0

    sget-object v0, LaX0;->h:LaX0;

    return-object v0

    :cond_0
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v0

    invoke-static {v0}, LsG2;->c(LpG2;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, LqZ0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, LqZ0;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, LaX0;->h:LaX0;

    :goto_1
    return-object v0
.end method
