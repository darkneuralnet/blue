.class public final LH92$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH92$d;-><init>(LH92;Landroid/view/View;)V
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
        "SMAP\nInventoryScanningAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$ItemScannedViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$ItemScannedViewHolder$1\n*L\n77#1:102\n77#1:103,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LH92;

.field public final synthetic h:LH92$d;


# direct methods
.method public constructor <init>(LH92;LH92$d;)V
    .locals 0

    iput-object p1, p0, LH92$d$a;->g:LH92;

    iput-object p2, p0, LH92$d$a;->h:LH92$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LH92$d$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, LH92$d$a;->g:LH92;

    invoke-static {p1}, LH92;->access$getAdapterData(LH92;)LE6;

    move-result-object p1

    iget-object v0, p0, LH92$d$a;->h:LH92$d;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LG92;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LG92;

    if-eqz p1, :cond_1

    iget-object v0, p0, LH92$d$a;->g:LH92;

    invoke-virtual {p1}, LG92;->c()Ljava/util/Collection;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, LH92;->access$getItemScansAndCategorySubject$p(LH92;)Lio/reactivex/subjects/d;

    move-result-object v0

    new-instance v2, Lkotlin/Pair;

    invoke-virtual {p1}, LG92;->j()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method