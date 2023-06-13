.class public final LkA0$c$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LkA0$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n118#2,4:428\n123#2,4:433\n48#3:432\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n*L\n236#1:428,4\n236#1:433,4\n236#1:432\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LkA0;


# direct methods
.method public constructor <init>(LkA0;)V
    .locals 0

    iput-object p1, p0, LkA0$c$a$b;->g:LkA0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LkA0$c$a$b;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    iget-object v0, p0, LkA0$c$a$b;->g:LkA0;

    invoke-static {v0}, LkA0;->j(LkA0;)LD20;

    move-result-object v0

    iget-object v7, p0, LkA0$c$a$b;->g:LkA0;

    :goto_0
    invoke-static {v0}, LD20;->a(LD20;)LLX2;

    move-result-object v1

    invoke-virtual {v1}, LLX2;->x()Z

    move-result v1

    const/4 v8, 0x1

    if-eqz v1, :cond_1

    invoke-static {v0}, LD20;->a(LD20;)LLX2;

    move-result-object v1

    invoke-virtual {v1}, LLX2;->y()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LkA0$a;

    invoke-virtual {v1}, LkA0$a;->b()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LOs4;

    if-nez v2, :cond_0

    move v1, v8

    goto :goto_1

    :cond_0
    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v7

    invoke-static/range {v1 .. v6}, LkA0;->M(LkA0;LOs4;JILjava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_1

    invoke-static {v0}, LD20;->a(LD20;)LLX2;

    move-result-object v1

    invoke-static {v0}, LD20;->a(LD20;)LLX2;

    move-result-object v2

    invoke-virtual {v2}, LLX2;->u()I

    move-result v2

    sub-int/2addr v2, v8

    invoke-virtual {v1, v2}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LkA0$a;

    invoke-virtual {v1}, LkA0$a;->a()LWc0;

    move-result-object v1

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LkA0$c$a$b;->g:LkA0;

    invoke-static {v0}, LkA0;->p(LkA0;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LkA0$c$a$b;->g:LkA0;

    invoke-static {v0}, LkA0;->k(LkA0;)LOs4;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    iget-object v1, p0, LkA0$c$a$b;->g:LkA0;

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LkA0;->M(LkA0;LOs4;JILjava/lang/Object;)Z

    move-result v1

    if-ne v1, v8, :cond_2

    goto :goto_2

    :cond_2
    move v8, v0

    :goto_2
    if-eqz v8, :cond_3

    iget-object v1, p0, LkA0$c$a$b;->g:LkA0;

    invoke-static {v1, v0}, LkA0;->w(LkA0;Z)V

    :cond_3
    iget-object v0, p0, LkA0$c$a$b;->g:LkA0;

    invoke-static {v0}, LkA0;->h(LkA0;)LFe6;

    move-result-object v0

    iget-object v1, p0, LkA0$c$a$b;->g:LkA0;

    invoke-static {v1}, LkA0;->g(LkA0;)F

    move-result v1

    invoke-virtual {v0, v1}, LFe6;->j(F)V

    return-void
.end method
