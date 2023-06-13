.class public final Lso1$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lso1$c;-><init>(Lso1;Landroid/view/View;)V
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
        "SMAP\nFleetListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n18#2:219\n18#2:225\n9#3,4:220\n9#3,4:226\n1#4:224\n*S KotlinDebug\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder$1\n*L\n134#1:219\n135#1:225\n134#1:220,4\n135#1:226,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lso1;

.field public final synthetic h:Lso1$c;


# direct methods
.method public constructor <init>(Lso1;Lso1$c;)V
    .locals 0

    iput-object p1, p0, Lso1$c$a;->g:Lso1;

    iput-object p2, p0, Lso1$c$a;->h:Lso1$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lso1$c$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lso1$c$a;->g:Lso1;

    invoke-static {p1}, Lso1;->access$getAdapterData(Lso1;)LE6;

    move-result-object p1

    iget-object v0, p0, Lso1$c$a;->h:Lso1$c;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/FleetListVehicle;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/FleetListVehicle;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getAction()Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lso1$c$a;->g:Lso1;

    invoke-static {v0}, Lso1;->access$getVehicleSelectsActionSubject$p(Lso1;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lso1$c$a;->g:Lso1;

    invoke-static {p1}, Lso1;->access$getAdapterData(Lso1;)LE6;

    move-result-object p1

    iget-object v0, p0, Lso1$c$a;->h:Lso1$c;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/FleetListVehicle;

    if-eqz v0, :cond_2

    move-object v1, p1

    :cond_2
    check-cast v1, Lco/bird/android/model/persistence/FleetListVehicle;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lso1$c$a;->g:Lso1;

    invoke-static {p1}, Lso1;->access$getVehicleSelectsSubject$p(Lso1;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
