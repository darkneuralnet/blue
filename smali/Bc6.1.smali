.class public final LBc6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J4\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LBc6;",
        "",
        "LAc6;",
        "typefaceRequest",
        "Lkotlin/Function1;",
        "LCc6;",
        "",
        "resolveTypeface",
        "LsP5;",
        "c",
        "LRX5;",
        "a",
        "LRX5;",
        "b",
        "()LRX5;",
        "lock",
        "LtE2;",
        "LtE2;",
        "resultCache",
        "<init>",
        "()V",
        "ui-text_release"
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
        "SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n24#2:250\n24#2:251\n24#2:252\n24#2:253\n24#2:254\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n165#1:249\n202#1:250\n219#1:251\n232#1:252\n239#1:253\n245#1:254\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LRX5;

.field public final b:LtE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtE2<",
            "LAc6;",
            "LCc6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LCX5;->a()LRX5;

    move-result-object v0

    iput-object v0, p0, LBc6;->a:LRX5;

    new-instance v0, LtE2;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, LtE2;-><init>(I)V

    iput-object v0, p0, LBc6;->b:LtE2;

    return-void
.end method

.method public static final synthetic a(LBc6;)LtE2;
    .locals 0

    iget-object p0, p0, LBc6;->b:LtE2;

    return-object p0
.end method


# virtual methods
.method public final b()LRX5;
    .locals 1

    iget-object v0, p0, LBc6;->a:LRX5;

    return-object v0
.end method

.method public final c(LAc6;Lkotlin/jvm/functions/Function1;)LsP5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAc6;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCc6;",
            "Lkotlin/Unit;",
            ">;+",
            "LCc6;",
            ">;)",
            "LsP5<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "typefaceRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolveTypeface"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LBc6;->a:LRX5;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LBc6;->b:LtE2;

    invoke-virtual {v1, p1}, LtE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCc6;

    if-eqz v1, :cond_1

    invoke-interface {v1}, LCc6;->b()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v1, p0, LBc6;->b:LtE2;

    invoke-virtual {v1, p1}, LtE2;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCc6;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_1
    monitor-exit v0

    :try_start_2
    new-instance v0, LBc6$a;

    invoke-direct {v0, p0, p1}, LBc6$a;-><init>(LBc6;LAc6;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LCc6;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    iget-object v0, p0, LBc6;->a:LRX5;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, LBc6;->b:LtE2;

    invoke-virtual {v1, p1}, LtE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-interface {p2}, LCc6;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LBc6;->b:LtE2;

    invoke-virtual {v1, p1, p2}, LtE2;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Could not load font"

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method
