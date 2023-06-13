.class public final Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/suggestanest/SuggestNestActivity;->t1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lqc0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqc0;",
        "kotlin.jvm.PlatformType",
        "cameraUpdate",
        "",
        "a",
        "(Lqc0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lqc0;)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    invoke-static {v0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->access$getGoogleMap$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)LcD1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->b:Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    invoke-static {v0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->access$getGoogleMap$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)LcD1;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LcD1;->m(Lqc0;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    invoke-static {v0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->access$getGoogleMap$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)LcD1;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LcD1;->f(Lqc0;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqc0;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;->a(Lqc0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
