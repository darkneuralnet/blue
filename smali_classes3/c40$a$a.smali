.class public final Lc40$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc40$a;-><init>(Lc40;Landroid/view/View;)V
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
        "SMAP\nBulkActionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1603#2,9:73\n1855#2:82\n1856#2:89\n1612#2:90\n288#2,2:91\n350#2,7:93\n18#3:83\n9#4,4:84\n1#5:88\n1#5:100\n*S KotlinDebug\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder$1\n*L\n45#1:73,9\n45#1:82\n45#1:89\n45#1:90\n46#1:91,2\n52#1:93,7\n45#1:83\n45#1:84,4\n45#1:88\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lc40;

.field public final synthetic h:Lc40$a;


# direct methods
.method public constructor <init>(Lc40;Lc40$a;)V
    .locals 0

    iput-object p1, p0, Lc40$a$a;->g:Lc40;

    iput-object p2, p0, Lc40$a$a;->h:Lc40$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lc40$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lc40$a$a;->g:Lc40;

    invoke-static {p1}, Lc40;->access$getAdapterData(Lc40;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG6;

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ld40;

    if-eqz v3, :cond_1

    move-object v2, v1

    :cond_1
    check-cast v2, Ld40;

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ld40;

    invoke-virtual {v1}, Ld40;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v2, v0

    :cond_4
    check-cast v2, Ld40;

    if-eqz v2, :cond_7

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Ld40;->e(Z)V

    iget-object v0, p0, Lc40$a$a;->g:Lc40;

    invoke-static {v0}, Lc40;->access$getAdapterData(Lc40;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, -0x1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG6;

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_6
    move p1, v3

    :goto_2
    if-eq p1, v3, :cond_7

    iget-object v0, p0, Lc40$a$a;->g:Lc40;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    :cond_7
    iget-object p1, p0, Lc40$a$a;->h:Lc40$a;

    invoke-static {p1}, Lc40$a;->a(Lc40$a;)Ld40;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ld40;->e(Z)V

    :goto_3
    iget-object p1, p0, Lc40$a$a;->h:Lc40$a;

    invoke-static {p1}, Lc40$a;->a(Lc40$a;)Ld40;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ld40;->b()Lco/bird/api/response/OpsBatchJobActionKind;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object v0, p0, Lc40$a$a;->g:Lc40;

    invoke-static {v0}, Lc40;->access$getActionSubject$p(Lc40;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_9
    return-void
.end method
