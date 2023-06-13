.class public final LZC4$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/standardcomponents/CheckableItemView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZC4$a;-><init>(LZC4;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "ZC4$a$a",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "view",
        "",
        "isChecked",
        "",
        "a",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepairSelectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,57:1\n18#2:58\n9#3,4:59\n*S KotlinDebug\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder$1\n*L\n40#1:58\n40#1:59,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LZC4$a;

.field public final synthetic b:LZC4;


# direct methods
.method public constructor <init>(LZC4$a;LZC4;)V
    .locals 0

    iput-object p1, p0, LZC4$a$a;->a:LZC4$a;

    iput-object p2, p0, LZC4$a$a;->b:LZC4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/widget/standardcomponents/CheckableItemView;Z)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LZC4$a$a;->a:LZC4$a;

    invoke-static {p1}, LZC4$a;->a(LZC4$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LZC4$a$a;->a:LZC4$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget-object p1, p0, LZC4$a$a;->b:LZC4;

    invoke-static {p1}, LZC4;->access$getAdapterData(LZC4;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LZC4$a$a;->a:LZC4$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LvC4;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LvC4;

    if-eqz p1, :cond_2

    iget-object v0, p0, LZC4$a$a;->b:LZC4;

    invoke-virtual {v0}, LZC4;->v()Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {p1}, LvC4;->e()Lco/bird/android/model/RepairType;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
