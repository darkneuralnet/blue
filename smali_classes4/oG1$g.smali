.class public final LoG1$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoG1;->o(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lio/reactivex/F;
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
        "Lco/bird/api/response/HardCountScanResponse;",
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
        "Lco/bird/api/response/HardCountScanResponse;",
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
.field public final synthetic g:LoG1;


# direct methods
.method public constructor <init>(LoG1;)V
    .locals 0

    iput-object p1, p0, LoG1$g;->g:LoG1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/HardCountScanResponse;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/HardCountScanResponse;

    if-eqz p1, :cond_0

    iget-object v0, p0, LoG1$g;->g:LoG1;

    invoke-static {v0}, LoG1;->access$getHardCountStatusSubject$p(LoG1;)Lio/reactivex/subjects/a;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/HardCountStatus;

    invoke-virtual {p1}, Lco/bird/api/response/HardCountScanResponse;->getFailureScans()I

    move-result v2

    invoke-virtual {p1}, Lco/bird/api/response/HardCountScanResponse;->getSuccessScans()I

    move-result v3

    invoke-virtual {p1}, Lco/bird/api/response/HardCountScanResponse;->getUserFailureScans()I

    move-result v4

    invoke-virtual {p1}, Lco/bird/api/response/HardCountScanResponse;->getUserSuccessScans()I

    move-result p1

    invoke-direct {v1, v2, v3, v4, p1}, Lco/bird/android/model/HardCountStatus;-><init>(IIII)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LoG1$g;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
