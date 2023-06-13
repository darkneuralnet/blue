.class public final LIW5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIW5;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
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
        "Lco/bird/android/model/QCInspection;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroid/view/View;",
        "child",
        "Lco/bird/android/model/QCInspection;",
        "a",
        "(Landroid/view/View;)Lco/bird/android/model/QCInspection;"
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
        "SMAP\nSwipeQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$onAttachedToRecyclerView$scrollListener$1$3\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,144:1\n18#2:145\n9#3,4:146\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$onAttachedToRecyclerView$scrollListener$1$3\n*L\n59#1:145\n59#1:146,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic h:LIW5;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;LIW5;)V
    .locals 0

    iput-object p1, p0, LIW5$d;->g:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, LIW5$d;->h:LIW5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Lco/bird/android/model/QCInspection;
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIW5$d;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, LIW5$d;->h:LIW5;

    invoke-static {v0}, LIW5;->access$getAdapterData(LIW5;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/QCInspection;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/QCInspection;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LIW5$d;->a(Landroid/view/View;)Lco/bird/android/model/QCInspection;

    move-result-object p1

    return-object p1
.end method
