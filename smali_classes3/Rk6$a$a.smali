.class public final LRk6$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRk6$a;-><init>(LRk6;Landroid/view/View;)V
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
        "SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder$1\n*L\n115#1:129\n115#1:130,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LRk6$a;

.field public final synthetic h:LRk6;


# direct methods
.method public constructor <init>(LRk6$a;LRk6;)V
    .locals 0

    iput-object p1, p0, LRk6$a$a;->g:LRk6$a;

    iput-object p2, p0, LRk6$a$a;->h:LRk6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LRk6$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LRk6$a$a;->g:LRk6$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LRk6$a$a;->h:LRk6;

    invoke-static {p1}, LRk6;->access$getAdapterData(LRk6;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LRk6$a$a;->g:LRk6$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LbJ3;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LbJ3;

    if-eqz p1, :cond_2

    iget-object v0, p0, LRk6$a$a;->h:LRk6;

    invoke-static {v0}, LRk6;->access$getButtonSubject(LRk6;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {p1}, LbJ3;->b()Lco/bird/android/model/PastWorkOrderButton;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method