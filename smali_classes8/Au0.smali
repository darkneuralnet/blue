.class public final LAu0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "LuX5;",
        "a",
        "LuX5;",
        "getCLOSED$annotations",
        "()V",
        "CLOSED",
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


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuX5;

    const-string v1, "CLOSED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, LAu0;->a:LuX5;

    return-void
.end method

.method public static final synthetic a()LuX5;
    .locals 1

    sget-object v0, LAu0;->a:LuX5;

    return-object v0
.end method
