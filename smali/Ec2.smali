.class public abstract LEc2;
.super LWS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEc2$c;,
        LEc2$d;,
        LEc2$b;,
        LEc2$a;,
        LEc2$e;
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
    message = "ItemKeyedDataSource is deprecated and has been replaced by PagingSource"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "PagingSource<Key, Value>"
        imports = {
            "androidx.paging.PagingSource"
        }
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t*\u0001)\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004./0\u001fB\u0007\u00a2\u0006\u0004\u0008,\u0010-J\'\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00018\u0000*\u0008\u0012\u0004\u0012\u00028\u00010\nH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\r\u001a\u0004\u0018\u00018\u0000*\u0008\u0012\u0004\u0012\u00028\u00010\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\'\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J$\u0010\u0018\u001a\u00020\u00172\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0015H&J$\u0010\u001a\u001a\u00020\u00172\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00112\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0019H&J$\u0010\u001b\u001a\u00020\u00172\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00112\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0019H&J\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H\u0010\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ<\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010 *\u00020\u00012\u001e\u0010\"\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\n0!J<\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010 *\u00020\u00012\u001e\u0010\"\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\n0$J0\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010 *\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!J0\u0010\'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\u0008\u0008\u0002\u0010 *\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$J+\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00070(H\u0002\u00a2\u0006\u0004\u0008*\u0010+\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00061"
    }
    d2 = {
        "LEc2;",
        "",
        "Key",
        "Value",
        "LWS0;",
        "LWS0$f;",
        "params",
        "LWS0$a;",
        "h",
        "(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "q",
        "(Ljava/util/List;)Ljava/lang/Object;",
        "p",
        "LEc2$c;",
        "w",
        "(LEc2$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LEc2$d;",
        "u",
        "(LEc2$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "s",
        "LEc2$b;",
        "callback",
        "",
        "v",
        "LEc2$a;",
        "r",
        "t",
        "item",
        "getKey",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "d",
        "ToValue",
        "LxA1;",
        "function",
        "B",
        "Lkotlin/Function1;",
        "C",
        "x",
        "y",
        "LWc0;",
        "Ec2$f",
        "o",
        "(LWc0;)LEc2$f;",
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

    sget-object v0, LWS0$e;->d:LWS0$e;

    invoke-direct {p0, v0}, LWS0;-><init>(LWS0$e;)V

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
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

.method public static final D(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
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

.method public static final synthetic access$asCallback(LEc2;LWc0;)LEc2$f;
    .locals 0

    invoke-virtual {p0, p1}, LEc2;->o(LWc0;)LEc2$f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LEc2;->D(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(LxA1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LEc2;->z(LxA1;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LEc2;->A(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final z(LxA1;Ljava/util/List;)Ljava/util/List;
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


# virtual methods
.method public final B(LxA1;)LEc2;
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
            "LEc2<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LaH6;

    invoke-direct {v0, p0, p1}, LaH6;-><init>(LEc2;LxA1;)V

    return-object v0
.end method

.method public final C(Lkotlin/jvm/functions/Function1;)LEc2;
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
            "LEc2<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LBc2;

    invoke-direct {v0, p1}, LBc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, LEc2;->B(LxA1;)LEc2;

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

    invoke-virtual {p0, p1}, LEc2;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract getKey(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)TKey;"
        }
    .end annotation
.end method

.method public final h(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
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

    sget-object v1, LEc2$e;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, LEc2$d;

    invoke-virtual {p1}, LWS0$f;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, LWS0$f;->c()I

    move-result p1

    invoke-direct {v0, v1, p1}, LEc2$d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0, p2}, LEc2;->s(LEc2$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, LEc2$d;

    invoke-virtual {p1}, LWS0$f;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, LWS0$f;->c()I

    move-result p1

    invoke-direct {v0, v1, p1}, LEc2$d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0, p2}, LEc2;->u(LEc2$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, LEc2$c;

    invoke-virtual {p1}, LWS0$f;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, LWS0$f;->a()I

    move-result v2

    invoke-virtual {p1}, LWS0$f;->d()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, LEc2$c;-><init>(Ljava/lang/Object;IZ)V

    invoke-virtual {p0, v0, p2}, LEc2;->w(LEc2$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(Lkotlin/jvm/functions/Function1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LEc2;->y(Lkotlin/jvm/functions/Function1;)LEc2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(LxA1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LEc2;->x(LxA1;)LEc2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(Lkotlin/jvm/functions/Function1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LEc2;->C(Lkotlin/jvm/functions/Function1;)LEc2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(LxA1;)LWS0;
    .locals 0

    invoke-virtual {p0, p1}, LEc2;->B(LxA1;)LEc2;

    move-result-object p1

    return-object p1
.end method

.method public final o(LWc0;)LEc2$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWc0<",
            "-",
            "LWS0$a<",
            "TValue;>;>;)",
            "LEc2$f;"
        }
    .end annotation

    new-instance v0, LEc2$f;

    invoke-direct {v0, p1, p0}, LEc2$f;-><init>(LWc0;LEc2;)V

    return-object v0
.end method

.method public final p(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TValue;>;)TKey;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LEc2;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final q(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TValue;>;)TKey;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LEc2;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public abstract r(LEc2$d;LEc2$a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$d<",
            "TKey;>;",
            "LEc2$a<",
            "TValue;>;)V"
        }
    .end annotation
.end method

.method public final s(LEc2$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$d<",
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

    invoke-static {p0, v0}, LEc2;->access$asCallback(LEc2;LWc0;)LEc2$f;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, LEc2;->r(LEc2$d;LEc2$a;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public abstract t(LEc2$d;LEc2$a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$d<",
            "TKey;>;",
            "LEc2$a<",
            "TValue;>;)V"
        }
    .end annotation
.end method

.method public final u(LEc2$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$d<",
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

    invoke-static {p0, v0}, LEc2;->access$asCallback(LEc2;LWc0;)LEc2$f;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, LEc2;->t(LEc2$d;LEc2$a;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public abstract v(LEc2$c;LEc2$b;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$c<",
            "TKey;>;",
            "LEc2$b<",
            "TValue;>;)V"
        }
    .end annotation
.end method

.method public final w(LEc2$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$c<",
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

    new-instance v1, LEc2$g;

    invoke-direct {v1, v0, p0}, LEc2$g;-><init>(LWc0;LEc2;)V

    invoke-virtual {p0, p1, v1}, LEc2;->v(LEc2$c;LEc2$b;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public final x(LxA1;)LEc2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "LxA1<",
            "TValue;TToValue;>;)",
            "LEc2<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LCc2;

    invoke-direct {v0, p1}, LCc2;-><init>(LxA1;)V

    invoke-virtual {p0, v0}, LEc2;->B(LxA1;)LEc2;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lkotlin/jvm/functions/Function1;)LEc2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-TValue;+TToValue;>;)",
            "LEc2<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDc2;

    invoke-direct {v0, p1}, LDc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, LEc2;->B(LxA1;)LEc2;

    move-result-object p1

    return-object p1
.end method
