.class public final LWv6$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Ljava/util/List<",
        "+",
        "LBx;",
        ">;>;",
        "LBx;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00022&\u0010\u0004\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "",
        "LBx;",
        "kotlin.jvm.PlatformType",
        "optional",
        "a",
        "(Lco/bird/android/buava/Optional;)LBx;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVpsResolvePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter$consume$20\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,489:1\n1#2:490\n288#3,2:491\n*S KotlinDebug\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter$consume$20\n*L\n214#1:491,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LWv6;

.field public final synthetic h:LYv6;


# direct methods
.method public constructor <init>(LWv6;LYv6;)V
    .locals 0

    iput-object p1, p0, LWv6$n;->g:LWv6;

    iput-object p2, p0, LWv6$n;->h:LYv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)LBx;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/List<",
            "LBx;",
            ">;>;)",
            "LBx;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    goto/16 :goto_2

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, LWv6$n;->g:LWv6;

    iget-object v3, p0, LWv6$n;->h:LYv6;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LBx;

    invoke-static {v1}, LWv6;->access$getDebugging$p(LWv6;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, LYv6;->r9()LZ84;

    move-result-object v6

    invoke-virtual {v6}, LZ84;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/buava/Optional;

    invoke-virtual {v6}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/ar/core/Earth;

    invoke-interface {v3}, LYv6;->C4()LZ84;

    move-result-object v7

    invoke-virtual {v7}, LZ84;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/buava/Optional;

    invoke-virtual {v7}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/ar/core/Session;

    sget-object v8, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v5}, LBx;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v8

    invoke-static {v1, v6, v7, v8}, LWv6;->access$showDebugInfo(LWv6;Lcom/google/ar/core/Earth;Lcom/google/ar/core/Session;Lco/bird/android/buava/Optional;)V

    :cond_3
    invoke-virtual {v5}, LBx;->e()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    sget-object v7, LJt4;->a:LJt4;

    const-string v8, "barcode"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v5}, LJt4;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-static {v1}, LWv6;->access$getBird$p(LWv6;)Lco/bird/android/model/wire/WireBird;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireBird;->getStickerId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v8, 0x2

    invoke-static {v5, v7, v6, v8, v0}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v2

    goto :goto_1

    :cond_4
    move v5, v6

    :goto_1
    if-ne v5, v2, :cond_5

    move v6, v2

    :cond_5
    if-eqz v6, :cond_2

    move-object v0, v4

    :cond_6
    iget-object p1, p0, LWv6$n;->g:LWv6;

    check-cast v0, LBx;

    if-nez v0, :cond_7

    sget-object v1, LpH6;->a:LpH6;

    invoke-virtual {p1, v1}, Lf1;->h(Ljava/lang/Object;)V

    :cond_7
    return-object v0

    :cond_8
    :goto_2
    iget-object p1, p0, LWv6$n;->g:LWv6;

    iget-object v1, p0, LWv6$n;->h:LYv6;

    invoke-static {p1}, LWv6;->access$getDebugging$p(LWv6;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, LYv6;->r9()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/ar/core/Earth;

    invoke-interface {v1}, LYv6;->C4()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ar/core/Session;

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    const-string v4, ""

    invoke-virtual {v3, v4}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v3

    invoke-static {p1, v2, v1, v3}, LWv6;->access$showDebugInfo(LWv6;Lcom/google/ar/core/Earth;Lcom/google/ar/core/Session;Lco/bird/android/buava/Optional;)V

    :cond_9
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LWv6$n;->a(Lco/bird/android/buava/Optional;)LBx;

    move-result-object p1

    return-object p1
.end method
