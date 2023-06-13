.class public final LOb4$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOb4;->c(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOb4$h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
.field public final synthetic g:LOb4;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LOb4;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LOb4$h;->g:LOb4;

    iput-object p2, p0, LOb4$h;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LOb4$h;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 3

    iget-object p1, p0, LOb4$h;->g:LOb4;

    invoke-static {p1}, LOb4;->access$getReactiveConfig$p(LOb4;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getServiceCenterConfig()Lco/bird/android/model/wire/configs/ServiceCenterConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ServiceCenterConfig;->getQualityControl()Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;->getFlow()Lco/bird/android/model/constant/QualityControlFlow;

    move-result-object p1

    sget-object v0, LOb4$h$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOb4$h;->g:LOb4;

    invoke-static {p1}, LOb4;->access$getNavigator$p(LOb4;)Le13;

    move-result-object p1

    iget-object v0, p0, LOb4$h;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {p1, v0, v2, v1, v2}, Le13$a;->goToListQualityControl$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LOb4$h;->g:LOb4;

    invoke-static {p1}, LOb4;->access$getNavigator$p(LOb4;)Le13;

    move-result-object p1

    iget-object v0, p0, LOb4$h;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {p1, v0, v2, v1, v2}, Le13$a;->goToSwipeQualityControl$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
