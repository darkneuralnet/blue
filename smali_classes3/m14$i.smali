.class public final Lm14$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm14;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "e",
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
.field public final synthetic g:Lm14;


# direct methods
.method public constructor <init>(Lm14;)V
    .locals 0

    iput-object p1, p0, Lm14$i;->g:Lm14;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm14$i;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Exception while handling activity result"

    invoke-static {p1, v2, v1}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lm14$i;->g:Lm14;

    invoke-static {v1}, Lm14;->access$getManager$p(Lm14;)LpM3;

    move-result-object v1

    new-instance v2, Lco/bird/android/model/UNEXPECTED;

    invoke-direct {v2, p1}, Lco/bird/android/model/UNEXPECTED;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    iget-object v1, p0, Lm14$i;->g:Lm14;

    invoke-static {v1}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object v1

    new-instance v2, LIt2;

    invoke-direct {v2, v0}, LIt2;-><init>(Z)V

    invoke-virtual {v1, v2}, Lf1;->h(Ljava/lang/Object;)V

    iget-object v0, p0, Lm14$i;->g:Lm14;

    invoke-static {v0}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object v0

    new-instance v1, LV84;

    invoke-direct {v1, p1}, LV84;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method
