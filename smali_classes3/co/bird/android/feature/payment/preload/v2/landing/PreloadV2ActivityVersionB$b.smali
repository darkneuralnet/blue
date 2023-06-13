.class public final Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;->h0(Lz04;)V
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


# instance fields
.field public final synthetic g:Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB$b;->g:Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB$b;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB$b;->g:Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;

    invoke-static {p1}, Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;->access$getPayPerRideSelectedRelay$p(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;)La94;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB$b;->g:Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;

    invoke-static {p1}, Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;->access$getPayPerRideSelectedRelay$p(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p1, v0}, Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;->access$payPerRideOptionSelected(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;Z)V

    return-void
.end method
