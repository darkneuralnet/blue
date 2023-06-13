.class public final Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
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


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

.field public final synthetic h:LI5;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;LI5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

    iput-object p2, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->h:LI5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v1, LSR4;

    iget-object v2, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

    iget-object v3, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->h:LI5;

    invoke-direct {v1, v2, v3, v0, p1}, LSR4;-><init>(Lco/bird/android/core/mvp/BaseActivity;LI5;ZZ)V

    iget-object p1, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

    invoke-virtual {p1}, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;->m0()LHR4;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "bird"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    iget-object v3, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

    invoke-static {v3}, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;->access$getScopeProvider(Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;)Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v3

    iget-object v4, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

    invoke-virtual {v4}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v4

    invoke-interface {v0, v2, v3, v1, v4}, LHR4;->a(Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)LGR4;

    move-result-object v0

    invoke-virtual {p1, v0}, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;->n0(LzR4;)V

    iget-object p1, p0, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$b;->g:Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;

    invoke-virtual {p1}, Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;->k0()LzR4;

    move-result-object p1

    invoke-interface {p1}, LzR4;->a()V

    return-void
.end method
