.class public final LUX2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\u0008\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0005\u0012\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u0012\u0004\u0008\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0005\u0012\u0004\u0008\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0005\u0012\u0004\u0008\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u0012\u0004\u0008\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u0012\u0004\u0008\u0018\u0010\u0007\u00a8\u0006\u001a"
    }
    d2 = {
        "",
        "locked",
        "LSX2;",
        "a",
        "LuX5;",
        "LuX5;",
        "getLOCK_FAIL$annotations",
        "()V",
        "LOCK_FAIL",
        "b",
        "getUNLOCK_FAIL$annotations",
        "UNLOCK_FAIL",
        "c",
        "getLOCKED$annotations",
        "LOCKED",
        "d",
        "getUNLOCKED$annotations",
        "UNLOCKED",
        "LLa1;",
        "e",
        "LLa1;",
        "getEMPTY_LOCKED$annotations",
        "EMPTY_LOCKED",
        "f",
        "getEMPTY_UNLOCKED$annotations",
        "EMPTY_UNLOCKED",
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

.field public static final c:LuX5;

.field public static final d:LuX5;

.field public static final e:LLa1;

.field public static final f:LLa1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LuX5;

    const-string v1, "LOCK_FAIL"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LUX2;->a:LuX5;

    new-instance v0, LuX5;

    const-string v1, "UNLOCK_FAIL"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LUX2;->b:LuX5;

    new-instance v0, LuX5;

    const-string v1, "LOCKED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LUX2;->c:LuX5;

    new-instance v1, LuX5;

    const-string v2, "UNLOCKED"

    invoke-direct {v1, v2}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v1, LUX2;->d:LuX5;

    new-instance v2, LLa1;

    invoke-direct {v2, v0}, LLa1;-><init>(Ljava/lang/Object;)V

    sput-object v2, LUX2;->e:LLa1;

    new-instance v0, LLa1;

    invoke-direct {v0, v1}, LLa1;-><init>(Ljava/lang/Object;)V

    sput-object v0, LUX2;->f:LLa1;

    return-void
.end method

.method public static final a(Z)LSX2;
    .locals 1

    new-instance v0, LTX2;

    invoke-direct {v0, p0}, LTX2;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)LSX2;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LUX2;->a(Z)LSX2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()LLa1;
    .locals 1

    sget-object v0, LUX2;->e:LLa1;

    return-object v0
.end method

.method public static final synthetic d()LLa1;
    .locals 1

    sget-object v0, LUX2;->f:LLa1;

    return-object v0
.end method

.method public static final synthetic e()LuX5;
    .locals 1

    sget-object v0, LUX2;->c:LuX5;

    return-object v0
.end method

.method public static final synthetic f()LuX5;
    .locals 1

    sget-object v0, LUX2;->d:LuX5;

    return-object v0
.end method

.method public static final synthetic g()LuX5;
    .locals 1

    sget-object v0, LUX2;->b:LuX5;

    return-object v0
.end method
