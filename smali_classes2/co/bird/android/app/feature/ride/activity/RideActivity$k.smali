.class public final Lco/bird/android/app/feature/ride/activity/RideActivity$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/ride/activity/RideActivity;->A0(LcD1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LhY4;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LhY4;",
        "it",
        "",
        "a",
        "(LhY4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/ride/activity/RideActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/ride/activity/RideActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity$k;->g:Lco/bird/android/app/feature/ride/activity/RideActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LhY4;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity$k;->g:Lco/bird/android/app/feature/ride/activity/RideActivity;

    invoke-static {v0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->access$getMapScopeProvider(Lco/bird/android/app/feature/ride/activity/RideActivity;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    invoke-interface {p1, v0}, LhY4;->onResume(Lcom/uber/autodispose/ScopeProvider;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LhY4;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity$k;->a(LhY4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
