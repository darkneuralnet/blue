.class public final Lht4$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lht4$a;->a(Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LpI4;",
        "LFM4;",
        "LFM4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LpI4;",
        "request",
        "LFM4;",
        "response",
        "a",
        "(LpI4;LFM4;)LFM4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lht4$a;

.field public final synthetic h:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lht4$a;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    iput-object p1, p0, Lht4$a$a;->g:Lht4$a;

    iput-object p2, p0, Lht4$a$a;->h:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LpI4;LFM4;)LFM4;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "request"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "response"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p2 .. p2}, LJM4;->c(LFM4;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface/range {p1 .. p1}, LpI4;->c()LII4;

    move-result-object v3

    invoke-virtual {v3}, LII4;->a()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "Location"

    invoke-virtual {v2, v3}, LFM4;->a(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v3, "Content-Location"

    invoke-virtual {v2, v3}, LFM4;->a(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v3

    :cond_1
    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v10, 0x1

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    move v5, v4

    goto :goto_1

    :cond_3
    :goto_0
    move v5, v10

    :goto_1
    if-eqz v5, :cond_4

    iget-object v3, v0, Lht4$a$a;->h:Lkotlin/jvm/functions/Function2;

    invoke-interface {v3, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFM4;

    return-object v1

    :cond_4
    new-instance v11, Ljava/net/URI;

    new-array v5, v10, [C

    const/16 v6, 0x3f

    aput-char v6, v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v3

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v11, v4}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/net/URI;->isAbsolute()Z

    move-result v4

    if-eqz v4, :cond_5

    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    new-instance v4, Ljava/net/URL;

    invoke-interface/range {p1 .. p1}, LpI4;->a()Ljava/net/URL;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    :goto_2
    invoke-static {}, Lht4;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, LFM4;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, LWT2;->c:LWT2;

    goto :goto_3

    :cond_6
    invoke-interface/range {p1 .. p1}, LpI4;->m()LWT2;

    move-result-object v2

    :goto_3
    new-instance v3, LOc1;

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v13

    const-string v5, "newUrl.toString()"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0xc

    const/16 v17, 0x0

    move-object v11, v3

    move-object v12, v2

    invoke-direct/range {v11 .. v17}, LOc1;-><init>(LWT2;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v5, v0, Lht4$a$a;->g:Lht4$a;

    iget-object v5, v5, Lht4$a;->g:LrA1;

    invoke-virtual {v5, v3}, LrA1;->n(LMI4;)LpI4;

    move-result-object v3

    sget-object v5, LLH1;->f:LLH1$a;

    invoke-interface/range {p1 .. p1}, LpI4;->getHeaders()LLH1;

    move-result-object v6

    invoke-virtual {v5, v6}, LLH1$a;->c(Ljava/util/Map;)LLH1;

    move-result-object v5

    invoke-interface {v3, v5}, LpI4;->g(Ljava/util/Map;)LpI4;

    move-result-object v3

    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, LpI4;->a()Ljava/net/URL;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v10

    if-eqz v4, :cond_7

    invoke-interface {v3}, LpI4;->getHeaders()LLH1;

    move-result-object v4

    const-string v5, "Authorization"

    invoke-virtual {v4, v5}, LLH1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-interface/range {p1 .. p1}, LpI4;->c()LII4;

    move-result-object v4

    invoke-virtual {v4}, LII4;->h()LH74;

    move-result-object v4

    invoke-interface {v3, v4}, LpI4;->e(Lkotlin/jvm/functions/Function2;)LpI4;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, LpI4;->c()LII4;

    move-result-object v4

    invoke-virtual {v4}, LII4;->j()LH74;

    move-result-object v4

    invoke-interface {v3, v4}, LpI4;->j(Lkotlin/jvm/functions/Function2;)LpI4;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, LpI4;->m()LWT2;

    move-result-object v4

    if-ne v2, v4, :cond_8

    invoke-interface/range {p1 .. p1}, LpI4;->n()LOY;

    move-result-object v2

    invoke-interface {v2}, LOY;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-interface/range {p1 .. p1}, LpI4;->n()LOY;

    move-result-object v2

    invoke-interface {v2}, LOY;->g()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-interface/range {p1 .. p1}, LpI4;->n()LOY;

    move-result-object v2

    invoke-interface {v3, v2}, LpI4;->l(LOY;)LpI4;

    move-result-object v3

    :cond_8
    iget-object v2, v0, Lht4$a$a;->h:Lkotlin/jvm/functions/Function2;

    invoke-interface {v3}, LpI4;->h()Lkotlin/Triple;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFM4;

    return-object v1

    :cond_9
    :goto_4
    iget-object v3, v0, Lht4$a$a;->h:Lkotlin/jvm/functions/Function2;

    invoke-interface {v3, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFM4;

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LpI4;

    check-cast p2, LFM4;

    invoke-virtual {p0, p1, p2}, Lht4$a$a;->a(LpI4;LFM4;)LFM4;

    move-result-object p1

    return-object p1
.end method
