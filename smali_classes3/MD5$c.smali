.class public final LMD5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMD5;->r()V
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
        "Ljava/util/Collection<",
        "+",
        "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "",
        "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
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
.field public final synthetic g:LMD5;


# direct methods
.method public constructor <init>(LMD5;)V
    .locals 0

    iput-object p1, p0, LMD5$c;->g:LMD5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LMD5$c;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Collection<",
            "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireSuccessfulScannedItem;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getReceived()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v3, v0

    iget-object v0, p0, LMD5$c;->g:LMD5;

    invoke-static {v0}, LMD5;->access$getNavigator$p(LMD5;)Le13;

    move-result-object v1

    iget-object v0, p0, LMD5$c;->g:LMD5;

    invoke-static {v0}, LMD5;->access$getOutbound$p(LMD5;)Z

    move-result v4

    iget-object v0, p0, LMD5$c;->g:LMD5;

    invoke-static {v0}, LMD5;->access$getSkuOrderId$p(LMD5;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireSuccessfulScannedItem;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getBird()Lco/bird/android/model/wire/WireSkuVehicle;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuVehicle;->getModelVersionTitle()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    move-object v6, p1

    const/4 v5, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Le13$a;->goToSkuScannerDetails$default(Le13;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method