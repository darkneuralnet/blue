.class public final LZQ4$k;
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LZQ4$a;",
        "result",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LZQ4$a;)Lio/reactivex/h;"
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

    iput-object p1, p0, LZQ4$k;->g:LZQ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LZQ4$k;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(LZQ4$a;)Lio/reactivex/h;
    .locals 5

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZQ4$k;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getPhysicalLockPresent$p(LZQ4;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LZQ4$k;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getReactiveConfig$p(LZQ4;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ParkingConfig;->getEnableAndroidBackgroundRidePhotoUpload()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LZQ4$k;->g:LZQ4;

    invoke-virtual {p1}, LZQ4$a;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, LZQ4;->access$uploadRidePhoto(LZQ4;Landroid/graphics/Bitmap;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LZQ4$k;->g:LZQ4;

    invoke-static {v1}, LZQ4;->access$getUi$p(LZQ4;)LWR4;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LZQ4$k$a;

    iget-object v2, p0, LZQ4$k;->g:LZQ4;

    invoke-direct {v1, v2, p1}, LZQ4$k$a;-><init>(LZQ4;LZQ4$a;)V

    new-instance p1, LaR4;

    invoke-direct {p1, v1}, LaR4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZQ4$k;->g:LZQ4;

    new-instance v1, Ljava/net/URI;

    invoke-virtual {p1}, LZQ4$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, LZQ4;->access$uploadAndUpdate(LZQ4;Ljava/net/URI;)V

    iget-object v0, p0, LZQ4$k;->g:LZQ4;

    invoke-virtual {p1}, LZQ4$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LZQ4;->access$onPhotoUploaded(LZQ4;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZQ4$a;

    invoke-virtual {p0, p1}, LZQ4$k;->b(LZQ4$a;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
