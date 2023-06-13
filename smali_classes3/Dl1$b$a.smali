.class public final LDl1$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDl1$b;-><init>(LDl1;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1549#2:134\n1620#2,2:135\n1549#2:137\n1620#2,3:138\n1622#2:141\n*S KotlinDebug\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder$1\n*L\n67#1:134\n67#1:135,2\n68#1:137\n68#1:138,3\n67#1:141\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LDl1;

.field public final synthetic h:LDl1$b;


# direct methods
.method public constructor <init>(LDl1;LDl1$b;)V
    .locals 0

    iput-object p1, p0, LDl1$b$a;->g:LDl1;

    iput-object p2, p0, LDl1$b$a;->h:LDl1$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LDl1$b$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LDl1$b$a;->g:LDl1;

    invoke-static {v1}, LDl1;->access$getAdapterData(LDl1;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->j()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH6;

    invoke-virtual {v1}, LH6;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG6;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LG6;->d()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iget-object v2, v0, LDl1$b$a;->g:LDl1;

    invoke-static {v2}, LDl1;->access$getAdapterData(LDl1;)LE6;

    move-result-object v2

    invoke-virtual {v2}, LE6;->j()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v2, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, LH6;

    invoke-virtual {v11}, LH6;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LG6;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    move v5, v1

    invoke-static/range {v2 .. v7}, LG6;->copy$default(LG6;Ljava/lang/Object;IZILjava/lang/Object;)LG6;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, LH6;->copy$default(LH6;Ljava/util/List;LG6;LG6;ILjava/lang/Object;)LH6;

    move-result-object v2

    invoke-interface {v8, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v2, v0, LDl1$b$a;->g:LDl1;

    invoke-virtual {v2, v8}, LDl1;->u(Ljava/util/Collection;)V

    iget-object v2, v0, LDl1$b$a;->h:LDl1$b;

    invoke-virtual {v2, v1}, LDl1$b;->b(Z)V

    :cond_2
    return-void
.end method
