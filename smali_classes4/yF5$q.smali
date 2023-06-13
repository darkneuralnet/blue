.class public final LyF5$q;
.super Lkotlin/coroutines/AbstractCoroutineContextElement;
.source "SourceFile"

# interfaces
.implements LTC0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyF5;-><init>(Landroid/content/Context;LhI5;LZC0;LsE5;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "yF5$q",
        "Lkotlin/coroutines/AbstractCoroutineContextElement;",
        "LTC0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "",
        "exception",
        "",
        "u",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n1#1,110:1\n320#2,7:111\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LyF5;


# direct methods
.method public constructor <init>(LTC0$a;LyF5;)V
    .locals 0

    iput-object p2, p0, LyF5$q;->b:LyF5;

    invoke-direct {p0, p1}, Lkotlin/coroutines/AbstractCoroutineContextElement;-><init>(Lkotlin/coroutines/CoroutineContext$Key;)V

    return-void
.end method


# virtual methods
.method public u(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V
    .locals 11

    iget-object p1, p0, LyF5$q;->b:LyF5;

    invoke-virtual {p1}, LVy;->R()LGX2;

    move-result-object p1

    iget-object v0, p0, LyF5$q;->b:LyF5;

    invoke-virtual {v0}, LVy;->R()LGX2;

    move-result-object v0

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LwK5;

    iget-object v0, p0, LyF5$q;->b:LyF5;

    invoke-virtual {v0}, LVy;->R()LGX2;

    move-result-object v0

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LwK5;

    invoke-virtual {v0}, LwK5;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v2, LzK5;->q:LzK5;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x3e

    const/4 v10, 0x0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, LwK5;->copy$default(LwK5;Ljava/util/List;LBK5;LAK5;LCK5;LyK5;LxK5;Ljava/lang/Throwable;ILjava/lang/Object;)LwK5;

    move-result-object p2

    invoke-interface {p1, p2}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method
