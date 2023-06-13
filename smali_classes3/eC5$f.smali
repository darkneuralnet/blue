.class public final LeC5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LeC5;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)Lio/reactivex/K;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LeC5;


# direct methods
.method public constructor <init>(LeC5;)V
    .locals 0

    iput-object p1, p0, LeC5$f;->g:LeC5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LeC5;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0}, LeC5$f;->b(LeC5;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LeC5;)Lio/reactivex/K;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LeC5;->access$getTransferOrderManager$p(LeC5;)LO86;

    move-result-object v0

    invoke-static {p0}, LeC5;->access$getSkuOrderId$p(LeC5;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, LO86;->h(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LeC5$f;->g:LeC5;

    invoke-static {p1}, LeC5;->access$getTransferOrderManager$p(LeC5;)LO86;

    move-result-object p1

    iget-object v0, p0, LeC5$f;->g:LeC5;

    invoke-static {v0}, LeC5;->access$getSkuOrderId$p(LeC5;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LeC5$f;->g:LeC5;

    invoke-static {v1}, LeC5;->access$getMissingSkuAndReason$p(LeC5;)Ljava/util/HashMap;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LO86;->i(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LeC5$f;->g:LeC5;

    new-instance v1, LfC5;

    invoke-direct {v1, v0}, LfC5;-><init>(LeC5;)V

    invoke-static {v1}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LeC5$f;->invoke(Lkotlin/Unit;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
