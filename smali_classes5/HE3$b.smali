.class public final LHE3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHE3;->f(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LpI4;",
        "LpI4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LpI4;",
        "request",
        "a",
        "(LpI4;)LpI4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, LHE3$b;->g:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LpI4;)LpI4;
    .locals 8

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Content-Type"

    invoke-interface {p1, v0}, LpI4;->get(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    const-string v6, "multipart/form-data"

    invoke-static {v1, v6, v4, v3, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-ne v6, v2, :cond_0

    iget-object v0, p0, LHE3$b;->g:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LpI4;

    return-object p1

    :cond_0
    invoke-interface {p1}, LpI4;->n()LOY;

    move-result-object v6

    invoke-interface {v6}, LOY;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    sget-object v6, LHE3;->b:LHE3;

    invoke-interface {p1}, LpI4;->m()LWT2;

    move-result-object v7

    invoke-static {v6, v7}, LHE3;->a(LHE3;LWT2;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    move v2, v4

    :cond_2
    :goto_0
    const-string v7, "application/x-www-form-urlencoded"

    if-nez v2, :cond_3

    invoke-static {v1, v7, v4, v3, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    iget-object v1, p0, LHE3$b;->g:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0, v7}, LpI4;->i(Ljava/lang/String;Ljava/lang/Object;)LpI4;

    move-result-object v0

    invoke-interface {p1}, LpI4;->getParameters()Ljava/util/List;

    move-result-object p1

    invoke-static {v6, p1}, LHE3;->b(LHE3;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v5, v3, v5}, LpI4$a;->a(LpI4;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)LpI4;

    move-result-object p1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, LpI4;->f(Ljava/util/List;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LpI4;

    return-object p1

    :cond_4
    iget-object v0, p0, LHE3$b;->g:Lkotlin/jvm/functions/Function1;

    sget-object v1, LHE3;->b:LHE3;

    invoke-interface {p1}, LpI4;->a()Ljava/net/URL;

    move-result-object v2

    invoke-interface {p1}, LpI4;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, LHE3;->c(LHE3;Ljava/net/URL;Ljava/util/List;)Ljava/net/URL;

    move-result-object v1

    invoke-interface {p1, v1}, LpI4;->b(Ljava/net/URL;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v1}, LpI4;->f(Ljava/util/List;)V

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LpI4;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LpI4;

    invoke-virtual {p0, p1}, LHE3$b;->a(LpI4;)LpI4;

    move-result-object p1

    return-object p1
.end method
