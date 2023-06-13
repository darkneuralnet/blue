.class public final Lak0$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0;->h(LgV2;ZLjava/util/Map;LsP5;LZC0;Lkotlin/jvm/functions/Function0;LrX2;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lik2;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lik2;",
        "keyEvent",
        "",
        "invoke-ZmokQxo",
        "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LWj2;",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LZC0;

.field public final synthetic k:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:LrX2;


# direct methods
.method public constructor <init>(ZLjava/util/Map;LsP5;LZC0;Lkotlin/jvm/functions/Function0;LrX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map<",
            "LWj2;",
            "LQ14;",
            ">;",
            "LsP5<",
            "LCe3;",
            ">;",
            "LZC0;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LrX2;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lak0$h;->g:Z

    iput-object p2, p0, Lak0$h;->h:Ljava/util/Map;

    iput-object p3, p0, Lak0$h;->i:LsP5;

    iput-object p4, p0, Lak0$h;->j:LZC0;

    iput-object p5, p0, Lak0$h;->k:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lak0$h;->l:LrX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lik2;

    invoke-virtual {p1}, Lik2;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lak0$h;->invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 10

    const-string v0, "keyEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lak0$h;->g:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ldk0;->g(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lak0$h;->h:Ljava/util/Map;

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, LWj2;->k(J)LWj2;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, LQ14;

    iget-object v2, p0, Lak0$h;->i:LsP5;

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCe3;

    invoke-virtual {v2}, LCe3;->x()J

    move-result-wide v4

    invoke-direct {v0, v4, v5, v3}, LQ14;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lak0$h;->h:Ljava/util/Map;

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, LWj2;->k(J)LWj2;

    move-result-object p1

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lak0$h;->j:LZC0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lak0$h$a;

    iget-object p1, p0, Lak0$h;->l:LrX2;

    invoke-direct {v7, p1, v0, v3}, Lak0$h$a;-><init>(LrX2;LQ14;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lak0$h;->g:Z

    if-eqz v0, :cond_2

    invoke-static {p1}, Ldk0;->c(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lak0$h;->h:Ljava/util/Map;

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, LWj2;->k(J)LWj2;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQ14;

    if-eqz p1, :cond_1

    iget-object v4, p0, Lak0$h;->j:LZC0;

    iget-object v0, p0, Lak0$h;->l:LrX2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lak0$h$b;

    invoke-direct {v7, v0, p1, v3}, Lak0$h$b;-><init>(LrX2;LQ14;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_1
    iget-object p1, p0, Lak0$h;->k:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
