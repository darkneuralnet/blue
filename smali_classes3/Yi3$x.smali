.class public final LYi3$x;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYi3;->M(Lbj3;)V
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
        "LFQ3;",
        "+",
        "Lco/bird/android/model/persistence/SkuOrder;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LFQ3;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/persistence/SkuOrder;",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
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
.field public final synthetic g:LYi3;


# direct methods
.method public constructor <init>(LYi3;)V
    .locals 0

    iput-object p1, p0, LYi3$x;->g:LYi3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LYi3$x;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LFQ3;",
            "Lco/bird/android/model/persistence/SkuOrder;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/SkuOrder;

    const-string v0, "skuOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/persistence/SkuOrderKt;->isInbound(Lco/bird/android/model/persistence/SkuOrder;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LYi3$x;->g:LYi3;

    invoke-static {v0}, LYi3;->access$getNavigator$p(LYi3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getId()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x2742

    invoke-interface {v0, p1, v1, v2}, Le13;->j3(Ljava/lang/String;ZI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYi3$x;->g:LYi3;

    invoke-static {v0}, LYi3;->access$getNavigator$p(LYi3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getId()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x2743

    invoke-interface {v0, p1, v1, v2}, Le13;->a1(Ljava/lang/String;ZI)V

    :goto_0
    return-void
.end method
