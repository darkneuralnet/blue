.class public final LPt0$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPt0;->u0(LkW1;Lkotlin/jvm/functions/Function2;)V
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


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LPt0;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;LPt0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LPt0;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LPt0$j;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LPt0$j;->h:LPt0;

    iput-object p3, p0, LPt0$j;->i:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPt0$j;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    iget-object v0, p0, LPt0$j;->g:Lkotlin/jvm/functions/Function2;

    const/16 v1, 0xc8

    if-eqz v0, :cond_0

    iget-object v0, p0, LPt0$j;->h:LPt0;

    invoke-static {}, LQt0;->G()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, LPt0;->j0(LPt0;ILjava/lang/Object;)V

    iget-object v0, p0, LPt0$j;->h:LPt0;

    iget-object v1, p0, LPt0$j;->g:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1}, LB6;->b(LEt0;Lkotlin/jvm/functions/Function2;)V

    iget-object v0, p0, LPt0$j;->h:LPt0;

    invoke-static {v0}, LPt0;->S(LPt0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LPt0$j;->h:LPt0;

    invoke-static {v0}, LPt0;->V(LPt0;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LPt0$j;->h:LPt0;

    invoke-static {v0}, LPt0;->Y(LPt0;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, LPt0$j;->i:Ljava/lang/Object;

    if-eqz v0, :cond_2

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LPt0$j;->h:LPt0;

    invoke-static {}, LQt0;->G()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, LPt0;->j0(LPt0;ILjava/lang/Object;)V

    iget-object v0, p0, LPt0$j;->h:LPt0;

    iget-object v1, p0, LPt0$j;->i:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/TypeIntrinsics;->beforeCheckcastToFunctionOfArity(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1}, LB6;->b(LEt0;Lkotlin/jvm/functions/Function2;)V

    iget-object v0, p0, LPt0$j;->h:LPt0;

    invoke-static {v0}, LPt0;->S(LPt0;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LPt0$j;->h:LPt0;

    invoke-virtual {v0}, LPt0;->D1()V

    :goto_0
    return-void
.end method
