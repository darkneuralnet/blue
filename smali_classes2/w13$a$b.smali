.class public final Lw13$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw13$a;-><init>(Lw13;Landroid/view/View;)V
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
        "SMAP\nNearbyBirdsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder$1$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n18#2:160\n9#3,4:161\n1#4:165\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder$1$2\n*L\n109#1:160\n109#1:161,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lw13$a;

.field public final synthetic h:Lw13;


# direct methods
.method public constructor <init>(Lw13$a;Lw13;)V
    .locals 0

    iput-object p1, p0, Lw13$a$b;->g:Lw13$a;

    iput-object p2, p0, Lw13$a$b;->h:Lw13;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lw13$a$b;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lw13$a$b;->g:Lw13$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lw13$a$b;->h:Lw13;

    invoke-static {v0}, Lw13;->access$getAdapterData$p(Lw13;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/NearbyBirdViewModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/NearbyBirdViewModel;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    iget-object p1, p0, Lw13$a$b;->h:Lw13;

    invoke-static {p1}, Lw13;->access$getAddClicksSubject$p(Lw13;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method