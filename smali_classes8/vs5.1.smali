.class public final Lvs5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0000\u001a\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002\"\u001a\u0010\r\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\n\u0012\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u0012\u0004\u0008\u0011\u0010\u000c\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0010\u0012\u0004\u0008\u0014\u0010\u000c\"\u001a\u0010\u0018\u001a\u00020\u000e8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0010\u0012\u0004\u0008\u0017\u0010\u000c\"\u001a\u0010\u001b\u001a\u00020\u000e8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0010\u0012\u0004\u0008\u001a\u0010\u000c\"\u001a\u0010\u001e\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\n\u0012\u0004\u0008\u001d\u0010\u000c\u00a8\u0006\u001f"
    }
    d2 = {
        "",
        "permits",
        "acquiredPermits",
        "Lts5;",
        "a",
        "",
        "id",
        "Lws5;",
        "prev",
        "j",
        "I",
        "getMAX_SPIN_CYCLES$annotations",
        "()V",
        "MAX_SPIN_CYCLES",
        "LuX5;",
        "b",
        "LuX5;",
        "getPERMIT$annotations",
        "PERMIT",
        "c",
        "getTAKEN$annotations",
        "TAKEN",
        "d",
        "getBROKEN$annotations",
        "BROKEN",
        "e",
        "getCANCELLED$annotations",
        "CANCELLED",
        "f",
        "getSEGMENT_SIZE$annotations",
        "SEGMENT_SIZE",
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
.field public static final a:I

.field public static final b:LuX5;

.field public static final c:LuX5;

.field public static final d:LuX5;

.field public static final e:LuX5;

.field public static final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0xc

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LiY5;->f(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lvs5;->a:I

    new-instance v0, LuX5;

    const-string v1, "PERMIT"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lvs5;->b:LuX5;

    new-instance v0, LuX5;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lvs5;->c:LuX5;

    new-instance v0, LuX5;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lvs5;->d:LuX5;

    new-instance v0, LuX5;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lvs5;->e:LuX5;

    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LiY5;->f(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lvs5;->f:I

    return-void
.end method

.method public static final a(II)Lts5;
    .locals 1

    new-instance v0, Lus5;

    invoke-direct {v0, p0, p1}, Lus5;-><init>(II)V

    return-object v0
.end method

.method public static synthetic b(IIILjava/lang/Object;)Lts5;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lvs5;->a(II)Lts5;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(JLws5;)Lws5;
    .locals 0

    invoke-static {p0, p1, p2}, Lvs5;->j(JLws5;)Lws5;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()LuX5;
    .locals 1

    sget-object v0, Lvs5;->d:LuX5;

    return-object v0
.end method

.method public static final synthetic e()LuX5;
    .locals 1

    sget-object v0, Lvs5;->e:LuX5;

    return-object v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lvs5;->a:I

    return v0
.end method

.method public static final synthetic g()LuX5;
    .locals 1

    sget-object v0, Lvs5;->b:LuX5;

    return-object v0
.end method

.method public static final synthetic h()I
    .locals 1

    sget v0, Lvs5;->f:I

    return v0
.end method

.method public static final synthetic i()LuX5;
    .locals 1

    sget-object v0, Lvs5;->c:LuX5;

    return-object v0
.end method

.method public static final j(JLws5;)Lws5;
    .locals 2

    new-instance v0, Lws5;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lws5;-><init>(JLws5;I)V

    return-object v0
.end method
