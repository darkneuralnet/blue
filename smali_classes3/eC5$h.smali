.class public final LeC5$h;
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
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "kotlin.jvm.PlatformType",
        "skuOrder",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireSkuOrder;)V"
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

    iput-object p1, p0, LeC5$h;->g:LeC5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuOrder;)V
    .locals 1

    iget-object v0, p0, LeC5$h;->g:LeC5;

    invoke-static {v0}, LeC5;->access$getNavigator$p(LeC5;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getContainerOrderId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->x0(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuOrder;

    invoke-virtual {p0, p1}, LeC5$h;->a(Lco/bird/android/model/wire/WireSkuOrder;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method