.class public final Lfv6$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;->Y(LcD1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042R\u0010\u0003\u001aN\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*&\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$o;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final b(Lkotlin/Lazy;)LbF0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "LbF0;",
            ">;)",
            "LbF0;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LbF0;

    return-object p0
.end method

.method public static final c(Lkotlin/Lazy;)LSL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "LSL4;",
            ">;)",
            "LSL4;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LSL4;

    return-object p0
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasMetAccuracy="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", hasScannedBarcode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", parkingStatusCanPark="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Lfv6$o$a;

    iget-object v4, p0, Lfv6$o;->g:Lfv6;

    invoke-direct {v2, v4}, Lfv6$o$a;-><init>(Lfv6;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    new-instance v4, Lfv6$o$b;

    iget-object v5, p0, Lfv6$o;->g:Lfv6;

    invoke-direct {v4, v5}, Lfv6$o$b;-><init>(Lfv6;)V

    invoke-static {v4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lfv6$o;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getScanModeStateRelay$p(Lfv6;)La94;

    move-result-object p1

    sget-object v0, LEH3;->b:LEH3;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6$o;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getSkipBirdScan$p(Lfv6;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {p1, v0}, Lfv6;->access$setCanSkipBirdScanOneTime$p(Lfv6;Z)V

    iget-object p1, p0, Lfv6$o;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$showScanSurroundingsUi(Lfv6;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lfv6$o;->g:Lfv6;

    invoke-static {v0}, Lfv6;->access$getCanSkipBirdScanOneTime(Lfv6;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const-string p1, "canSkipBirdScanOneTime was true when parkingStatusCanPark was, handling special case by delaying slightly longer before emitting"

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6$o;->g:Lfv6;

    invoke-static {v4}, Lfv6$o;->c(Lkotlin/Lazy;)LSL4;

    move-result-object v0

    invoke-static {v2}, Lfv6$o;->b(Lkotlin/Lazy;)LbF0;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, Lfv6;->access$setEmittedLocationAndClose(Lfv6;LSL4;LbF0;Z)V

    goto :goto_1

    :cond_1
    const-string v0, "hasScannedBarcode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v1, :cond_2

    const-string p1, "emitting location and closing due to parkingStatusCanPark=true && hasScannedBarcode=true)"

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v5, p0, Lfv6$o;->g:Lfv6;

    invoke-static {v4}, Lfv6$o;->c(Lkotlin/Lazy;)LSL4;

    move-result-object v6

    invoke-static {v2}, Lfv6$o;->b(Lkotlin/Lazy;)LbF0;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lfv6;->h0(Lfv6;LSL4;LbF0;ZILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    iget-object p1, p0, Lfv6$o;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getScanModeStateRelay$p(Lfv6;)La94;

    move-result-object p1

    sget-object v0, LEH3;->d:LEH3;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lfv6$o;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getScanModeStateRelay$p(Lfv6;)La94;

    move-result-object p1

    sget-object v0, LEH3;->c:LEH3;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    :goto_0
    iget-object p1, p0, Lfv6$o;->g:Lfv6;

    invoke-static {p1, v1}, Lfv6;->access$showParkingMode(Lfv6;Z)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lfv6$o;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
