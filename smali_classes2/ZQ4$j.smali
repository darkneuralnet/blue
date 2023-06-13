.class public final LZQ4$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZQ4;->A(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LZQ4$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LZQ4$a;",
        "kotlin.jvm.PlatformType",
        "result",
        "",
        "a",
        "(LZQ4$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZQ4;


# direct methods
.method public constructor <init>(LZQ4;)V
    .locals 0

    iput-object p1, p0, LZQ4$j;->g:LZQ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZQ4$a;)V
    .locals 10

    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getPhotoSaveResultRelay$p(LZQ4;)LAG;

    move-result-object v0

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getPhysicalLockPresent$p(LZQ4;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getHasUnlockedHelmet$p(LZQ4;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getUi$p(LZQ4;)LWR4;

    move-result-object v0

    sget v2, Lnl4;->ride_lock_photo_info_post_helmet_photo_capture_body:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getFineAmount$p(LZQ4;)I

    move-result v0

    if-lez v0, :cond_1

    sget-object v0, Lxx1;->a:Lxx1;

    iget-object v2, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v2}, LZQ4;->access$getFineAmount$p(LZQ4;)I

    move-result v2

    int-to-long v2, v2

    iget-object v4, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v4}, LZQ4;->access$getReactiveConfig$p(LZQ4;)LTq4;

    move-result-object v4

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    sget-object v5, LUx1;->d:LUx1;

    invoke-virtual {v0, v2, v3, v4, v5}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v2}, LZQ4;->access$getContext$p(LZQ4;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->lock_to_take_photo_confirmation_fine_body:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{\n            val fineSt\u2026, fineString)\n          }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getContext$p(LZQ4;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->lock_to_take_photo_confirmation_body:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{\n            context.ge\u2026rmation_body)\n          }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getFineAmount$p(LZQ4;)I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getContext$p(LZQ4;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->lock_to_take_photo_confirmation_fine_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getContext$p(LZQ4;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->lock_to_take_photo_confirmation_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v3, v0

    const-string v0, "if (fineAmount > 0) {\n  \u2026mation_title)\n          }"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getFineAmount$p(LZQ4;)I

    move-result v0

    if-lez v0, :cond_3

    sget v0, Lyg4;->ic_lock_black:I

    goto :goto_3

    :cond_3
    sget v0, Lrg4;->ic_lock_esb_circle_bg:I

    :goto_3
    move v9, v0

    iget-object v0, p0, LZQ4$j;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getUi$p(LZQ4;)LWR4;

    move-result-object v2

    invoke-virtual {p1}, LZQ4$a;->a()Landroid/graphics/Bitmap;

    move-result-object v5

    iget-object p1, p0, LZQ4$j;->g:LZQ4;

    invoke-static {p1}, LZQ4;->access$getFineAmount$p(LZQ4;)I

    move-result v6

    iget-object p1, p0, LZQ4$j;->g:LZQ4;

    invoke-static {p1}, LZQ4;->access$getReactiveConfig$p(LZQ4;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v7

    iget-object p1, p0, LZQ4$j;->g:LZQ4;

    invoke-static {p1}, LZQ4;->access$getShowParkingWarning$p(LZQ4;)Z

    move-result v8

    invoke-virtual/range {v2 .. v9}, LWR4;->Rl(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILjava/util/Currency;ZI)V

    :cond_4
    iget-object p1, p0, LZQ4$j;->g:LZQ4;

    invoke-static {p1}, LZQ4;->access$getFlashOnBeforePhotoTaken$p(LZQ4;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, LZQ4$j;->g:LZQ4;

    invoke-static {p1}, LZQ4;->access$getUi$p(LZQ4;)LWR4;

    move-result-object p1

    invoke-virtual {p1}, LWR4;->i()V

    :cond_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZQ4$a;

    invoke-virtual {p0, p1}, LZQ4$j;->a(LZQ4$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
