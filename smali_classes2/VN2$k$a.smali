.class public final LVN2$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVN2$k;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGu1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic b:LGu1;

.field public final synthetic c:Lkotlin/reflect/KProperty1;

.field public final synthetic d:Lkotlin/reflect/KProperty1;

.field public final synthetic e:Lkotlin/reflect/KProperty1;

.field public final synthetic f:Lkotlin/reflect/KProperty1;

.field public final synthetic g:Lkotlin/reflect/KProperty1;

.field public final synthetic h:Lkotlin/reflect/KProperty1;


# direct methods
.method public constructor <init>(LGu1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;)V
    .locals 0

    iput-object p1, p0, LVN2$k$a;->b:LGu1;

    iput-object p2, p0, LVN2$k$a;->c:Lkotlin/reflect/KProperty1;

    iput-object p3, p0, LVN2$k$a;->d:Lkotlin/reflect/KProperty1;

    iput-object p4, p0, LVN2$k$a;->e:Lkotlin/reflect/KProperty1;

    iput-object p5, p0, LVN2$k$a;->f:Lkotlin/reflect/KProperty1;

    iput-object p6, p0, LVN2$k$a;->g:Lkotlin/reflect/KProperty1;

    iput-object p7, p0, LVN2$k$a;->h:Lkotlin/reflect/KProperty1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, LVN2$k$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LVN2$k$a$a;

    iget v1, v0, LVN2$k$a$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LVN2$k$a$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, LVN2$k$a$a;

    invoke-direct {v0, p0, p2}, LVN2$k$a$a;-><init>(LVN2$k$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LVN2$k$a$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LVN2$k$a$a;->i:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LVN2$k$a;->b:LGu1;

    check-cast p1, LAN2;

    new-instance v2, LLN2;

    iget-object v4, p0, LVN2$k$a;->c:Lkotlin/reflect/KProperty1;

    invoke-interface {v4, p1}, Lkotlin/reflect/KProperty1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iget-object v4, p0, LVN2$k$a;->d:Lkotlin/reflect/KProperty1;

    invoke-interface {v4, p1}, Lkotlin/reflect/KProperty1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iget-object v4, p0, LVN2$k$a;->e:Lkotlin/reflect/KProperty1;

    invoke-interface {v4, p1}, Lkotlin/reflect/KProperty1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iget-object v4, p0, LVN2$k$a;->f:Lkotlin/reflect/KProperty1;

    invoke-interface {v4, p1}, Lkotlin/reflect/KProperty1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iget-object v4, p0, LVN2$k$a;->g:Lkotlin/reflect/KProperty1;

    invoke-interface {v4, p1}, Lkotlin/reflect/KProperty1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iget-object v4, p0, LVN2$k$a;->h:Lkotlin/reflect/KProperty1;

    invoke-interface {v4, p1}, Lkotlin/reflect/KProperty1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LLN2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, LVN2$k$a$a;->i:I

    invoke-interface {p2, v2, v0}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method