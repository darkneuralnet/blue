.class public final LtD$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtD$a;-><init>(LtD;Landroid/view/View;)V
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
        "SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$ButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$ButtonViewHolder$1\n*L\n66#1:135\n66#1:136,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LtD;

.field public final synthetic h:LtD$a;


# direct methods
.method public constructor <init>(LtD;LtD$a;)V
    .locals 0

    iput-object p1, p0, LtD$a$a;->g:LtD;

    iput-object p2, p0, LtD$a$a;->h:LtD$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LtD$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, LtD$a$a;->g:LtD;

    invoke-static {p1}, LtD;->access$getAdapterData(LtD;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LtD$a$a;->h:LtD$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LRB4;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LRB4;

    if-eqz p1, :cond_3

    iget-object v0, p0, LtD$a$a;->g:LtD;

    instance-of v1, p1, Lcn0;

    if-eqz v1, :cond_1

    invoke-static {v0}, LtD;->access$getCommandSubject$p(LtD;)Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v1, p1, Lt7;

    if-eqz v1, :cond_2

    invoke-static {v0}, LtD;->access$getAddRepairSubject$p(LtD;)Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of p1, p1, LrQ1;

    if-eqz p1, :cond_3

    invoke-static {v0}, LtD;->access$getIdToolsSubject$p(LtD;)Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method
