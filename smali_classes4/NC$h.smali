.class public final LNC$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNC;->a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/WorkOrder;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/WorkOrder;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/WorkOrder;",
        "workOrder",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LNC;


# direct methods
.method public constructor <init>(LNC;)V
    .locals 0

    iput-object p1, p0, LNC$h;->g:LNC;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/WorkOrder;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/WorkOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "workOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNC$h;->g:LNC;

    invoke-virtual {v0}, LNC;->z()LaG6;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/WorkOrderStatus;->QUALITY_CONTROL:Lco/bird/android/model/WorkOrderStatus;

    sget-object v2, Lco/bird/android/model/WorkOrderStatusReason;->QUALITY_CONTROL:Lco/bird/android/model/WorkOrderStatusReason;

    invoke-interface {v0, p1, v1, v2}, LaG6;->t(Ljava/lang/String;Lco/bird/android/model/WorkOrderStatus;Lco/bird/android/model/WorkOrderStatusReason;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/WorkOrder;

    invoke-virtual {p0, p1}, LNC$h;->a(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
