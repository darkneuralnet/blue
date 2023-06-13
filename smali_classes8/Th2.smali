.class public final LTh2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\u0008\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u0012\u0004\u0008\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0005\u0012\u0004\u0008\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0005\u0012\u0004\u0008\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0005\u0012\u0004\u0008\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u0012\u0004\u0008\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0017\u0012\u0004\u0008\u001a\u0010\u0007\u00a8\u0006\u001c"
    }
    d2 = {
        "",
        "g",
        "h",
        "LuX5;",
        "a",
        "LuX5;",
        "getCOMPLETING_ALREADY$annotations",
        "()V",
        "COMPLETING_ALREADY",
        "b",
        "getCOMPLETING_WAITING_CHILDREN$annotations",
        "COMPLETING_WAITING_CHILDREN",
        "c",
        "getCOMPLETING_RETRY$annotations",
        "COMPLETING_RETRY",
        "d",
        "getTOO_LATE_TO_CANCEL$annotations",
        "TOO_LATE_TO_CANCEL",
        "e",
        "getSEALED$annotations",
        "SEALED",
        "LMa1;",
        "f",
        "LMa1;",
        "getEMPTY_NEW$annotations",
        "EMPTY_NEW",
        "getEMPTY_ACTIVE$annotations",
        "EMPTY_ACTIVE",
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
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final c:LuX5;

.field public static final d:LuX5;

.field public static final e:LuX5;

.field public static final f:LMa1;

.field public static final g:LMa1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuX5;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LTh2;->a:LuX5;

    new-instance v0, LuX5;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LTh2;->b:LuX5;

    new-instance v0, LuX5;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LTh2;->c:LuX5;

    new-instance v0, LuX5;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LTh2;->d:LuX5;

    new-instance v0, LuX5;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LTh2;->e:LuX5;

    new-instance v0, LMa1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LMa1;-><init>(Z)V

    sput-object v0, LTh2;->f:LMa1;

    new-instance v0, LMa1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LMa1;-><init>(Z)V

    sput-object v0, LTh2;->g:LMa1;

    return-void
.end method

.method public static final synthetic a()LuX5;
    .locals 1

    sget-object v0, LTh2;->a:LuX5;

    return-object v0
.end method

.method public static final synthetic b()LuX5;
    .locals 1

    sget-object v0, LTh2;->c:LuX5;

    return-object v0
.end method

.method public static final synthetic c()LMa1;
    .locals 1

    sget-object v0, LTh2;->g:LMa1;

    return-object v0
.end method

.method public static final synthetic d()LMa1;
    .locals 1

    sget-object v0, LTh2;->f:LMa1;

    return-object v0
.end method

.method public static final synthetic e()LuX5;
    .locals 1

    sget-object v0, LTh2;->e:LuX5;

    return-object v0
.end method

.method public static final synthetic f()LuX5;
    .locals 1

    sget-object v0, LTh2;->d:LuX5;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Li12;

    if-eqz v0, :cond_0

    new-instance v0, Lj12;

    check-cast p0, Li12;

    invoke-direct {v0, p0}, Lj12;-><init>(Li12;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lj12;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lj12;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lj12;->a:Li12;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
