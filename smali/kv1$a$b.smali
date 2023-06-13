.class public final Lkv1$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkv1$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
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
.field public final synthetic g:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Lfe3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe3<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/LiveData;Lfe3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>;",
            "Lfe3<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lkv1$a$b;->g:Landroidx/lifecycle/LiveData;

    iput-object p2, p0, Lkv1$a$b;->h:Lfe3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkv1$a$b;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    sget-object v0, LVC1;->b:LVC1;

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v1

    invoke-virtual {v1}, LpG2;->G()LpG2;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lkv1$a$b$a;

    iget-object v4, p0, Lkv1$a$b;->g:Landroidx/lifecycle/LiveData;

    iget-object v5, p0, Lkv1$a$b;->h:Lfe3;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lkv1$a$b$a;-><init>(Landroidx/lifecycle/LiveData;Lfe3;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
