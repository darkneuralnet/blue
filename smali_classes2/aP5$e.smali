.class public final LaP5$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaP5;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/BirdRepair;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "it",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/BirdRepair;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LaP5;


# direct methods
.method public constructor <init>(LaP5;)V
    .locals 0

    iput-object p1, p0, LaP5$e;->g:LaP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/BirdRepair;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LaP5$e;->g:LaP5;

    invoke-static {v0}, LaP5;->access$getEventBus$p(LaP5;)LEg1;

    move-result-object v0

    new-instance v1, LvT;

    invoke-direct {v1, p1}, LvT;-><init>(Lco/bird/android/model/wire/WireBird;)V

    invoke-interface {v0, v1}, LEg1;->c(Lg70;)V

    iget-object p1, p0, LaP5$e;->g:LaP5;

    invoke-static {p1}, LaP5;->access$getMechanicManager$p(LaP5;)LFO2;

    move-result-object p1

    iget-object v0, p0, LaP5$e;->g:LaP5;

    invoke-static {v0}, LaP5;->access$getRepairId$p(LaP5;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "repairId"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    sget-object v1, Lco/bird/android/model/constant/Resolution;->CANCELED:Lco/bird/android/model/constant/Resolution;

    invoke-interface {p1, v0, v1}, LFO2;->i(Ljava/lang/String;Lco/bird/android/model/constant/Resolution;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LaP5$e;->a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
