.class public final LsK4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LsK4;-><init>(Lco/bird/android/widget/ReservationBannerView;Lco/bird/android/core/mvp/BaseActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lco/bird/android/widget/ReservationBannerView$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lco/bird/android/widget/ReservationBannerView$a;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Unit;)Lco/bird/android/widget/ReservationBannerView$a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LsK4;


# direct methods
.method public constructor <init>(LsK4;)V
    .locals 0

    iput-object p1, p0, LsK4$a;->g:LsK4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Unit;)Lco/bird/android/widget/ReservationBannerView$a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LsK4$a;->g:LsK4;

    invoke-static {p1}, LsK4;->access$getReservationBannerView$p(LsK4;)Lco/bird/android/widget/ReservationBannerView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/widget/ReservationBannerView;->u()Lco/bird/android/widget/ReservationBannerView$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LsK4$a;->a(Lkotlin/Unit;)Lco/bird/android/widget/ReservationBannerView$a;

    move-result-object p1

    return-object p1
.end method
