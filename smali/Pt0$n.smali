.class public final LPt0$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPt0;->J0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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
        "SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4528:1\n3212#2,4:4529\n3222#2,9:4533\n3217#2:4542\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n*L\n3086#1:4529,4\n3087#1:4533,9\n3086#1:4542\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPt0;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function3<",
            "Llm<",
            "*>;",
            "LqE5;",
            "LOv4;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic i:LmE5;

.field public final synthetic j:LjW2;


# direct methods
.method public constructor <init>(LPt0;Ljava/util/List;LmE5;LjW2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LPt0;",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function3<",
            "Llm<",
            "*>;",
            "LqE5;",
            "LOv4;",
            "Lkotlin/Unit;",
            ">;>;",
            "LmE5;",
            "LjW2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LPt0$n;->g:LPt0;

    iput-object p2, p0, LPt0$n;->h:Ljava/util/List;

    iput-object p3, p0, LPt0$n;->i:LmE5;

    iput-object p4, p0, LPt0$n;->j:LjW2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPt0$n;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    iget-object v0, p0, LPt0$n;->g:LPt0;

    iget-object v1, p0, LPt0$n;->h:Ljava/util/List;

    iget-object v2, p0, LPt0$n;->i:LmE5;

    iget-object v3, p0, LPt0$n;->j:LjW2;

    invoke-static {v0}, LPt0;->T(LPt0;)Ljava/util/List;

    move-result-object v4

    :try_start_0
    invoke-static {v0, v1}, LPt0;->f0(LPt0;Ljava/util/List;)V

    invoke-static {v0}, LPt0;->Z(LPt0;)LmE5;

    move-result-object v1

    invoke-static {v0}, LPt0;->W(LPt0;)[I

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v0, v6}, LPt0;->h0(LPt0;[I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v0, v2}, LPt0;->i0(LPt0;LmE5;)V

    invoke-virtual {v3}, LjW2;->c()LhW2;

    move-result-object v2

    invoke-virtual {v3}, LjW2;->e()LFR3;

    move-result-object v6

    invoke-virtual {v3}, LjW2;->f()Ljava/lang/Object;

    move-result-object v3

    const/4 v7, 0x1

    invoke-static {v0, v2, v6, v3, v7}, LPt0;->d0(LPt0;LhW2;LFR3;Ljava/lang/Object;Z)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v0, v1}, LPt0;->i0(LPt0;LmE5;)V

    invoke-static {v0, v5}, LPt0;->h0(LPt0;[I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v0, v4}, LPt0;->f0(LPt0;Ljava/util/List;)V

    return-void

    :catchall_0
    move-exception v2

    :try_start_3
    invoke-static {v0, v1}, LPt0;->i0(LPt0;LmE5;)V

    invoke-static {v0, v5}, LPt0;->h0(LPt0;[I)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, v4}, LPt0;->f0(LPt0;Ljava/util/List;)V

    throw v1
.end method
