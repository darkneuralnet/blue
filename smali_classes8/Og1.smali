.class public final LOg1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0008\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u0012\u0004\u0008\n\u0010\u0007*\u001e\u0008\u0002\u0010\u000e\u001a\u0004\u0008\u0000\u0010\u000c\"\u0008\u0012\u0004\u0012\u00028\u00000\r2\u0008\u0012\u0004\u0012\u00028\u00000\r\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "timeMillis",
        "c",
        "LuX5;",
        "a",
        "LuX5;",
        "getDISPOSED_TASK$annotations",
        "()V",
        "DISPOSED_TASK",
        "b",
        "getCLOSED_EMPTY$annotations",
        "CLOSED_EMPTY",
        "T",
        "Lex2;",
        "Queue",
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
.field public static final a:LuX5;

.field public static final b:LuX5;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuX5;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LOg1;->a:LuX5;

    new-instance v0, LuX5;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LOg1;->b:LuX5;

    return-void
.end method

.method public static final synthetic a()LuX5;
    .locals 1

    sget-object v0, LOg1;->b:LuX5;

    return-object v0
.end method

.method public static final synthetic b()LuX5;
    .locals 1

    sget-object v0, LOg1;->a:LuX5;

    return-object v0
.end method

.method public static final c(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x8637bd05af6L

    cmp-long v0, p0, v0

    if-ltz v0, :cond_1

    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0xf4240

    mul-long/2addr v0, p0

    :goto_0
    return-wide v0
.end method
