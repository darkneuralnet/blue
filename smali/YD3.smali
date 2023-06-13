.class public abstract LYD3;
.super LWS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYD3$c;,
        LYD3$d;,
        LYD3$b;,
        LYD3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "LWS0<",
        "TKey;TValue;>;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "PagingSource<Key, Value>"
        imports = {
            "androidx.paging.PagingSource"
        }
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004+,-\u0014B\u0007\u00a2\u0006\u0004\u0008)\u0010*J\'\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH&J*\u0010\u0011\u001a\u00020\r2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H&J*\u0010\u0012\u001a\u00020\r2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H&J\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010\u0016*\u00020\u00012\u001e\u0010\u0019\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\u00180\u0017J<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010\u0016*\u00020\u00012\u001e\u0010\u0019\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\u00180\u001bJ0\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010\u0016*\u00020\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0017J0\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010\u0016*\u00020\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001bJ\'\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J\'\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"J\'\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010\"J0\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00070$2\u0006\u0010\'\u001a\u00020&H\u0002\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006."
    }
    d2 = {
        "LYD3;",
        "",
        "Key",
        "Value",
        "LWS0;",
        "LWS0$f;",
        "params",
        "LWS0$a;",
        "h",
        "(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LYD3$c;",
        "LYD3$b;",
        "callback",
        "",
        "v",
        "LYD3$d;",
        "LYD3$a;",
        "t",
        "r",
        "item",
        "d",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "ToValue",
        "LxA1;",
        "",
        "function",
        "A",
        "Lkotlin/Function1;",
        "B",
        "w",
        "x",
        "u",
        "(LYD3$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "s",
        "(LYD3$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "q",
        "LWc0;",
        "continuation",
        "",
        "isAppend",
        "p",
        "<init>",
        "()V",
        "a",
        "b",
        "c",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, LWS0$e;->c:LWS0$e;

    invoke-direct {p0, v0}, LWS0;-><init>(LWS0$e;)V

    return-void
.end method

.method public static final C(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "$function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LYD3;->C(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LYD3;->z(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(LxA1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LYD3;->y(LxA1;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LYD3;LWc0;Z)LYD3$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYD3;->p(LWc0;Z)LYD3$a;

    move-result-object p0

    return-object p0
.end method

.method public static final y(LxA1;Ljava/util/List;)Ljava/util/List;
    .locals 2

    const-string v0, "$function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v1}, LxA1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final z(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
    .locals 2

    const-string v0, "$function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final A(LxA1;)LYD3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "LxA1<",
            "Ljava/util/List<",
            "TValue;>;",
            "Ljava/util/List<",
            "TToValue;>;>;)",
            "LYD3<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LbH6;

    invoke-direct {v0, p0, p1}, LbH6;-><init>(LYD3;LxA1;)V

    return-object v0
.end method

.method public final B(Lkotlin/jvm/functions/Function1;)LYD3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+TValue;>;+",
            "Ljava/util/List<",
            "+TToValue;>;>;)",
            "LYD3<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVD3;

    invoke-direct {v0, p1}, LVD3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, LYD3;->A(LxA1;)LYD3;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)TKey;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot get key by item in pageKeyedDataSource"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWS0$f<",
            "TKey;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LWS0$a<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, LWS0$f;->e()Lpt2;

    move-result-object v0

    sget-object v1, Lpt2;->b:Lpt2;

    if-ne v0, v1, :cond_0

    new-instance v0, LYD3$c;

    invoke-virtual {p1}, LWS0$f;->a()I

    move-result v1

    invoke-virtual {p1}, LWS0$f;->d()Z

    move-result p1

    invoke-direct {v0, v1, p1}, LYD3$c;-><init>(IZ)V

    invoke-virtual {p0, v0, p2}, LYD3;->u(LYD3$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, LWS0$f;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p1, LWS0$a;->f:LWS0$a$a;

    invoke-virtual {p1}, LWS0$a$a;->a()LWS0$a;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, LWS0$f;->e()Lpt2;

    move-result-object v0

    sget-object v1, Lpt2;->c:Lpt2;

    if-ne v0, v1, :cond_2

    new-instance v0, LYD3$d;

    invoke-virtual {p1}, LWS0$f;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, LWS0$f;->c()I

    move-result p1

    invoke-direct {v0, v1, p1}, LYD3$d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0, p2}, LYD3;->s(LYD3$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, LWS0$f;->e()Lpt2;

    move-result-object v0

    sget-object v1, Lpt2;->d:Lpt2;

    if-ne v0, v1, :cond_3

    new-instance v0, LYD3$d;

    invoke-virtual {p1}, LWS0$f;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, LWS0$f;->c()I

    move-result p1

    invoke-direct {v0, v1, p1}, LYD3$d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0, p2}, LYD3;->q(LYD3$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LWS0$f;->e()Lpt2;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic map(Lkotlin/jvm/functions/Function1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LYD3;->x(Lkotlin/jvm/functions/Function1;)LYD3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(LxA1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LYD3;->w(LxA1;)LYD3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(Lkotlin/jvm/functions/Function1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LYD3;->B(Lkotlin/jvm/functions/Function1;)LYD3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(LxA1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LYD3;->A(LxA1;)LYD3;

    move-result-object p1

    return-object p1
.end method

.method public final p(LWc0;Z)LYD3$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWc0<",
            "-",
            "LWS0$a<",
            "TValue;>;>;Z)",
            "LYD3$a<",
            "TKey;TValue;>;"
        }
    .end annotation

    new-instance v0, LYD3$e;

    invoke-direct {v0, p1, p2}, LYD3$e;-><init>(LWc0;Z)V

    return-object v0
.end method

.method public final q(LYD3$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYD3$d<",
            "TKey;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LWS0$a<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LXc0;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, LXc0;->u()V

    invoke-static {p0, v0, v2}, LYD3;->o(LYD3;LWc0;Z)LYD3$a;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, LYD3;->r(LYD3$d;LYD3$a;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public abstract r(LYD3$d;LYD3$a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYD3$d<",
            "TKey;>;",
            "LYD3$a<",
            "TKey;TValue;>;)V"
        }
    .end annotation
.end method

.method public final s(LYD3$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYD3$d<",
            "TKey;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LWS0$a<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LXc0;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, LXc0;->u()V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LYD3;->o(LYD3;LWc0;Z)LYD3$a;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, LYD3;->t(LYD3$d;LYD3$a;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public abstract t(LYD3$d;LYD3$a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYD3$d<",
            "TKey;>;",
            "LYD3$a<",
            "TKey;TValue;>;)V"
        }
    .end annotation
.end method

.method public final u(LYD3$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYD3$c<",
            "TKey;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LWS0$a<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LXc0;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, LXc0;->u()V

    new-instance v1, LYD3$f;

    invoke-direct {v1, v0}, LYD3$f;-><init>(LWc0;)V

    invoke-virtual {p0, p1, v1}, LYD3;->v(LYD3$c;LYD3$b;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public abstract v(LYD3$c;LYD3$b;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYD3$c<",
            "TKey;>;",
            "LYD3$b<",
            "TKey;TValue;>;)V"
        }
    .end annotation
.end method

.method public final w(LxA1;)LYD3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "LxA1<",
            "TValue;TToValue;>;)",
            "LYD3<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LXD3;

    invoke-direct {v0, p1}, LXD3;-><init>(LxA1;)V

    invoke-virtual {p0, v0}, LYD3;->A(LxA1;)LYD3;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lkotlin/jvm/functions/Function1;)LYD3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-TValue;+TToValue;>;)",
            "LYD3<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWD3;

    invoke-direct {v0, p1}, LWD3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, LYD3;->A(LxA1;)LYD3;

    move-result-object p1

    return-object p1
.end method
