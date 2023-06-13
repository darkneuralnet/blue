.class public final LZG1$t$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZG1$t;->b(Lco/bird/api/request/HardCountCreateRequest;)Lio/reactivex/K;
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
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/api/request/HardCountCreateRequest;",
        "+",
        "LHM4<",
        "Lco/bird/api/response/HardCountScanResponse;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001ar\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004 \u0006*8\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/HardCountScanResponse;",
        "response",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "Lco/bird/api/request/HardCountCreateRequest;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LHM4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZG1;

.field public final synthetic h:Lco/bird/api/request/HardCountCreateRequest;


# direct methods
.method public constructor <init>(LZG1;Lco/bird/api/request/HardCountCreateRequest;)V
    .locals 0

    iput-object p1, p0, LZG1$t$a;->g:LZG1;

    iput-object p2, p0, LZG1$t$a;->h:Lco/bird/api/request/HardCountCreateRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LZG1$t$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(LHM4;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/HardCountScanResponse;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/api/request/HardCountCreateRequest;",
            "LHM4<",
            "Lco/bird/api/response/HardCountScanResponse;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZG1$t$a;->g:LZG1;

    invoke-static {v0}, LZG1;->access$getInventoryScanningUiDelegate$p(LZG1;)LN92;

    move-result-object v0

    iget-object v1, p0, LZG1$t$a;->h:Lco/bird/api/request/HardCountCreateRequest;

    invoke-virtual {v1}, Lco/bird/api/request/HardCountCreateRequest;->getScanIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/HardCountScanResponse;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/api/response/HardCountScanResponse;->getErrorCode()Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, LN92;->Rl(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LZG1$t$a$a;

    iget-object v2, p0, LZG1$t$a;->h:Lco/bird/api/request/HardCountCreateRequest;

    invoke-direct {v1, v2, p1}, LZG1$t$a$a;-><init>(Lco/bird/api/request/HardCountCreateRequest;LHM4;)V

    new-instance p1, LcH1;

    invoke-direct {p1, v1}, LcH1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LZG1$t$a;->b(LHM4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
