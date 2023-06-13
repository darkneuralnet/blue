.class public final LvA6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LvA6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0011\u001a\u0004\u0008\u000c\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R+\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0011\u001a\u0004\u0008\u0016\u0010\u0012\"\u0004\u0008\u0017\u0010\u0014\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "LvA6;",
        "",
        "Landroid/webkit/WebView;",
        "",
        "c",
        "(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LZC0;",
        "a",
        "LZC0;",
        "coroutineScope",
        "LBX2;",
        "LvA6$a;",
        "b",
        "LBX2;",
        "navigationEvents",
        "",
        "<set-?>",
        "LEX2;",
        "()Z",
        "d",
        "(Z)V",
        "canGoBack",
        "getCanGoForward",
        "e",
        "canGoForward",
        "<init>",
        "(LZC0;)V",
        "web_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:LZC0;

.field public final b:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "LvA6$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LEX2;

.field public final d:LEX2;


# direct methods
.method public constructor <init>(LZC0;)V
    .locals 3

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvA6;->a:LZC0;

    const/4 p1, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v0, v1, p1, v1}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object p1

    iput-object p1, p0, LvA6;->b:LBX2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    invoke-static {p1, v1, v0, v1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v2

    iput-object v2, p0, LvA6;->c:LEX2;

    invoke-static {p1, v1, v0, v1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LvA6;->d:LEX2;

    return-void
.end method

.method public static final synthetic a(LvA6;)LBX2;
    .locals 0

    iget-object p0, p0, LvA6;->b:LBX2;

    return-object p0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, LvA6;->c:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LvA6$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LvA6$b;

    iget v1, v0, LvA6$b;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LvA6$b;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, LvA6$b;

    invoke-direct {v0, p0, p2}, LvA6$b;-><init>(LvA6;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LvA6$b;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LvA6$b;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {}, LT41;->c()LpG2;

    move-result-object p2

    new-instance v2, LvA6$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, LvA6$c;-><init>(LvA6;Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, LvA6$b;->j:I

    invoke-static {p2, v2, v0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final d(Z)V
    .locals 1

    iget-object v0, p0, LvA6;->c:LEX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Z)V
    .locals 1

    iget-object v0, p0, LvA6;->d:LEX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
