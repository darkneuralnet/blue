.class public final LSS$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSS;->c0(Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;ZLjava/lang/String;)V
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
        "Lco/bird/android/model/BirdScan;",
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
        "Lco/bird/android/model/BirdScan;",
        "kotlin.jvm.PlatformType",
        "scanResponse",
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
.field public final synthetic g:Lco/bird/android/model/constant/BirdAction;

.field public final synthetic h:LSS;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/BirdAction;LSS;)V
    .locals 0

    iput-object p1, p0, LSS$r;->g:Lco/bird/android/model/constant/BirdAction;

    iput-object p2, p0, LSS$r;->h:LSS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/BirdScan;

    if-eqz p1, :cond_1

    iget-object v0, p0, LSS$r;->g:Lco/bird/android/model/constant/BirdAction;

    iget-object v1, p0, LSS$r;->h:LSS;

    sget-object v2, Lco/bird/android/model/constant/BirdAction;->GET_CODE:Lco/bird/android/model/constant/BirdAction;

    if-ne v0, v2, :cond_0

    invoke-static {v1, p1}, LSS;->access$postBirdScannedForCodeEvent(LSS;Lco/bird/android/model/BirdScan;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {v1}, LSS;->access$getEventBus$p(LSS;)LEg1;

    move-result-object v1

    new-instance v2, LbT;

    invoke-direct {v2, p1, v0}, LbT;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/BirdAction;)V

    invoke-interface {v1, v2}, LEg1;->c(Lg70;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LSS$r;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
