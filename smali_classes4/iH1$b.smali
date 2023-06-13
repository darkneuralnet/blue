.class public final LiH1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiH1;->p0(Lio/reactivex/Observable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "LHM4<",
        "Lco/bird/api/response/HardCountScanResponse;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "LHM4<",
        "Lco/bird/api/response/HardCountScanResponse;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001ar\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002 \u0006*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000 \u0006*8\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002 \u0006*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "LHM4;",
        "Lco/bird/api/response/HardCountScanResponse;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LiH1;


# direct methods
.method public constructor <init>(LiH1;)V
    .locals 0

    iput-object p1, p0, LiH1$b;->g:LiH1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LiH1$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

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
.method public final b(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "LHM4<",
            "Lco/bird/api/response/HardCountScanResponse;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "LHM4<",
            "Lco/bird/api/response/HardCountScanResponse;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LHM4;

    iget-object v1, p0, LiH1$b;->g:LiH1;

    invoke-static {v1}, LiH1;->access$getHardCountManager$p(LiH1;)LXF1;

    move-result-object v2

    const-string v3, "hardCountResponse"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v0, p1}, LXF1;->e(Ljava/lang/String;LHM4;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LiH1;->t0(Ljava/lang/String;)V

    iget-object v1, p0, LiH1$b;->g:LiH1;

    invoke-static {v1}, LiH1;->access$getInventoryScanningUiDelegate$p(LiH1;)LN92;

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
    invoke-virtual {v1, v0, v2}, LN92;->Rl(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LiH1$b$a;

    invoke-direct {v2, v0, p1}, LiH1$b$a;-><init>(Ljava/lang/String;LHM4;)V

    new-instance p1, LjH1;

    invoke-direct {p1, v2}, LjH1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LiH1$b;->b(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
