.class public final LbF1$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbF1$d;-><init>(LbF1;Landroid/view/View;)V
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
        "SMAP\nHardCountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$IdentifierViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,116:1\n18#2:117\n9#3,4:118\n*S KotlinDebug\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$IdentifierViewHolder$1\n*L\n104#1:117\n104#1:118,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LbF1;

.field public final synthetic h:LbF1$d;


# direct methods
.method public constructor <init>(LbF1;LbF1$d;)V
    .locals 0

    iput-object p1, p0, LbF1$d$a;->g:LbF1;

    iput-object p2, p0, LbF1$d$a;->h:LbF1$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LbF1$d$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, LbF1$d$a;->g:LbF1;

    invoke-static {p1}, LbF1;->access$getAdapterData(LbF1;)LE6;

    move-result-object p1

    iget-object v0, p0, LbF1$d$a;->h:LbF1$d;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LqH1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LqH1;

    if-eqz p1, :cond_1

    iget-object v0, p0, LbF1$d$a;->g:LbF1;

    invoke-virtual {p1}, LqH1;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p1}, LqH1;->b()Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;

    move-result-object p1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    invoke-static {v0}, LbF1;->access$getIdentifiersSubject$p(LbF1;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
