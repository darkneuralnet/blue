.class public final Ltr1$a;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltr1;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lfy1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "tr1$a",
        "Landroidx/recyclerview/widget/RecyclerView$t;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "newState",
        "",
        "onScrollStateChanged",
        "a",
        "I",
        "currentPosition",
        "co.bird.android.feature.fleet-status"
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
        "SMAP\nFleetStatusUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusUi.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusUi$2$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n18#2:256\n9#3,4:257\n1#4:261\n*S KotlinDebug\n*F\n+ 1 FleetStatusUi.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusUi$2$1\n*L\n140#1:256\n140#1:257,4\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Ltr1;


# direct methods
.method public constructor <init>(Ltr1;)V
    .locals 0

    iput-object p1, p0, Ltr1$a;->b:Ltr1;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Ltr1$a;->a:I

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_3

    iget-object p2, p0, Ltr1$a;->b:Ltr1;

    invoke-static {p2}, Ltr1;->access$getSnapHelper$p(Ltr1;)Landroidx/recyclerview/widget/r;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/r;->g(Landroidx/recyclerview/widget/RecyclerView$p;)Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Lft4;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget p2, p0, Ltr1$a;->a:I

    if-ne p1, p2, :cond_1

    return-void

    :cond_1
    iput p1, p0, Ltr1$a;->a:I

    iget-object p2, p0, Ltr1$a;->b:Ltr1;

    invoke-static {p2}, Ltr1;->access$getPredictionAdapter$p(Ltr1;)LKZ3;

    move-result-object p2

    invoke-virtual {p2, p1}, LMy;->p(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lco/bird/android/model/persistence/FleetStatus;

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/FleetStatus;

    if-eqz p1, :cond_3

    iget-object p2, p0, Ltr1$a;->b:Ltr1;

    invoke-static {p2}, Ltr1;->access$getPredictionSubject$p(Ltr1;)Lio/reactivex/subjects/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    nop

    :cond_3
    return-void
.end method
