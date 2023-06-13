.class public final Los4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Los4;->i(I)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LXt0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LXt0;",
        "composition",
        "",
        "a",
        "(LXt0;)V"
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
        "SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n132#2,18:350\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n327#1:350,18\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Los4;

.field public final synthetic h:I

.field public final synthetic i:LjW1;


# direct methods
.method public constructor <init>(Los4;ILjW1;)V
    .locals 0

    iput-object p1, p0, Los4$a;->g:Los4;

    iput p2, p0, Los4$a;->h:I

    iput-object p3, p0, Los4$a;->i:LjW1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LXt0;)V
    .locals 13

    const-string v0, "composition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Los4$a;->g:Los4;

    invoke-static {v0}, Los4;->b(Los4;)I

    move-result v0

    iget v1, p0, Los4$a;->h:I

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Los4$a;->i:LjW1;

    iget-object v1, p0, Los4$a;->g:Los4;

    invoke-static {v1}, Los4;->d(Los4;)LjW1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    instance-of v0, p1, Lcu0;

    if-eqz v0, :cond_7

    iget-object v0, p0, Los4$a;->i:LjW1;

    iget v1, p0, Los4$a;->h:I

    iget-object v2, p0, Los4$a;->g:Los4;

    invoke-virtual {v0}, LjW1;->e()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v5, v3, :cond_5

    invoke-virtual {v0}, LjW1;->d()[Ljava/lang/Object;

    move-result-object v8

    aget-object v8, v8, v5

    const-string v9, "null cannot be cast to non-null type kotlin.Any"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LjW1;->f()[I

    move-result-object v9

    aget v9, v9, v5

    if-eq v9, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_1

    :cond_0
    move v10, v4

    :goto_1
    if-eqz v10, :cond_2

    move-object v11, p1

    check-cast v11, Lcu0;

    invoke-virtual {v11, v8, v2}, Lcu0;->E(Ljava/lang/Object;Los4;)V

    instance-of v12, v8, Lu01;

    if-eqz v12, :cond_1

    move-object v12, v8

    check-cast v12, Lu01;

    goto :goto_2

    :cond_1
    move-object v12, v7

    :goto_2
    if-eqz v12, :cond_2

    invoke-virtual {v11, v12}, Lcu0;->D(Lu01;)V

    invoke-static {v2}, Los4;->c(Los4;)LkW1;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-virtual {v11, v12}, LkW1;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11}, LkW1;->g()I

    move-result v11

    if-nez v11, :cond_2

    invoke-static {v2, v7}, Los4;->e(Los4;LkW1;)V

    :cond_2
    if-nez v10, :cond_4

    if-eq v6, v5, :cond_3

    invoke-virtual {v0}, LjW1;->d()[Ljava/lang/Object;

    move-result-object v7

    aput-object v8, v7, v6

    invoke-virtual {v0}, LjW1;->f()[I

    move-result-object v7

    aput v9, v7, v6

    :cond_3
    add-int/lit8 v6, v6, 0x1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, LjW1;->e()I

    move-result p1

    move v1, v6

    :goto_3
    if-ge v1, p1, :cond_6

    invoke-virtual {v0}, LjW1;->d()[Ljava/lang/Object;

    move-result-object v2

    aput-object v7, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {v0, v6}, LjW1;->g(I)V

    iget-object p1, p0, Los4$a;->i:LjW1;

    invoke-virtual {p1}, LjW1;->e()I

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Los4$a;->g:Los4;

    invoke-static {p1, v7}, Los4;->f(Los4;LjW1;)V

    :cond_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LXt0;

    invoke-virtual {p0, p1}, Los4$a;->a(LXt0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
