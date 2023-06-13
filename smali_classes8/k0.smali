.class public final Lk0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0008\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u0012\u0004\u0008\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u0012\u0004\u0008\n\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0002\u0012\u0004\u0008\r\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0002\u0012\u0004\u0008\u0010\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0002\u0012\u0004\u0008\u0013\u0010\u0004*(\u0008\u0000\u0010\u0018\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "LuX5;",
        "a",
        "LuX5;",
        "getEMPTY$annotations",
        "()V",
        "EMPTY",
        "b",
        "getOFFER_SUCCESS$annotations",
        "OFFER_SUCCESS",
        "c",
        "getOFFER_FAILED$annotations",
        "OFFER_FAILED",
        "d",
        "getPOLL_FAILED$annotations",
        "POLL_FAILED",
        "e",
        "getENQUEUE_FAILED$annotations",
        "ENQUEUE_FAILED",
        "f",
        "getHANDLER_INVOKED$annotations",
        "HANDLER_INVOKED",
        "Lkotlin/Function1;",
        "",
        "",
        "Handler",
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
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final b:LuX5;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final c:LuX5;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final d:LuX5;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final e:LuX5;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final f:LuX5;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuX5;

    const-string v1, "EMPTY"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lk0;->a:LuX5;

    new-instance v0, LuX5;

    const-string v1, "OFFER_SUCCESS"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lk0;->b:LuX5;

    new-instance v0, LuX5;

    const-string v1, "OFFER_FAILED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lk0;->c:LuX5;

    new-instance v0, LuX5;

    const-string v1, "POLL_FAILED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lk0;->d:LuX5;

    new-instance v0, LuX5;

    const-string v1, "ENQUEUE_FAILED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lk0;->e:LuX5;

    new-instance v0, LuX5;

    const-string v1, "ON_CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lk0;->f:LuX5;

    return-void
.end method
