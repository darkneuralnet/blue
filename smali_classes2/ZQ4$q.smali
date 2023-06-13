.class public final LZQ4$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZQ4;->R()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "LDG3;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "LDG3;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
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

    iput-object p1, p0, LZQ4$q;->g:LZQ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "LDG3;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDG3;

    if-eqz p1, :cond_2

    iget-object v0, p0, LZQ4$q;->g:LZQ4;

    invoke-static {v0}, LZQ4;->access$getUi$p(LZQ4;)LWR4;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1}, LDG3;->b()Ljava/lang/String;

    move-result-object v3

    sget v4, Lyg4;->ic_parking_white:I

    invoke-static {v0}, LZQ4;->access$getReactiveConfig$p(LZQ4;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getDisableEndRidePhotoMiddleIcon()Z

    move-result p1

    xor-int/lit8 v5, p1, 0x1

    invoke-static {v0}, LZQ4;->access$getRide$p(LZQ4;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "ride"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {v0, p1}, LZQ4;->access$iconRes(LZQ4;Lco/bird/android/model/wire/WireBird;)I

    move-result p1

    goto :goto_0

    :cond_1
    sget p1, Lrg4;->ic_silhouette_scooter:I

    :goto_0
    move v6, p1

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, LVR4$a;->renderPrePhotoCapture$default(LVR4;Ljava/lang/String;Ljava/lang/String;IZIILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LZQ4$q;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
