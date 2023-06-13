.class public final Lqs4$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqs4;-><init>(Lkotlin/coroutines/CoroutineContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "throwable",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n234#1:1409\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lqs4;


# direct methods
.method public constructor <init>(Lqs4;)V
    .locals 0

    iput-object p1, p0, Lqs4$f;->g:Lqs4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lqs4$f;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "Recomposer effect job completed"

    invoke-static {v0, p1}, Lhh1;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    iget-object v1, p0, Lqs4$f;->g:Lqs4;

    invoke-static {v1}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lqs4$f;->g:Lqs4;

    monitor-enter v1

    :try_start_0
    invoke-static {v2}, Lqs4;->B(Lqs4;)Lzh2;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-static {v2}, Lqs4;->H(Lqs4;)LGX2;

    move-result-object v5

    sget-object v6, Lqs4$d;->c:Lqs4$d;

    invoke-interface {v5, v6}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-static {v2}, Lqs4;->I(Lqs4;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v3, v0}, Lzh2;->f(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lqs4;->F(Lqs4;)LWc0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v2}, Lqs4;->F(Lqs4;)LWc0;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v4

    :goto_1
    invoke-static {v2, v4}, Lqs4;->Q(Lqs4;LWc0;)V

    new-instance v4, Lqs4$f$a;

    invoke-direct {v4, v2, p1}, Lqs4$f$a;-><init>(Lqs4;Ljava/lang/Throwable;)V

    invoke-interface {v3, v4}, Lzh2;->n(Lkotlin/jvm/functions/Function1;)Lo51;

    move-object v4, v0

    goto :goto_2

    :cond_2
    invoke-static {v2, v0}, Lqs4;->O(Lqs4;Ljava/lang/Throwable;)V

    invoke-static {v2}, Lqs4;->H(Lqs4;)LGX2;

    move-result-object p1

    sget-object v0, Lqs4$d;->b:Lqs4$d;

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit v1

    if-eqz v4, :cond_3

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v4, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method
