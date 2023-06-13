.class public final Ljn6$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljn6;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/VehiclePricingDetails;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/VehiclePricingDetails;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/Boolean;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljn6;


# direct methods
.method public constructor <init>(Ljn6;)V
    .locals 0

    iput-object p1, p0, Ljn6$c;->g:Ljn6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ljn6$c;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Boolean;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/VehiclePricingDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ljn6$c;->g:Ljn6;

    invoke-static {p1}, Ljn6;->access$getVehiclePricingDetails$p(Ljn6;)Lco/bird/android/model/VehiclePricingDetails;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ljn6$c;->g:Ljn6;

    invoke-static {p1}, Ljn6;->access$getVehiclePricingDetails$p(Ljn6;)Lco/bird/android/model/VehiclePricingDetails;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ljn6$c;->g:Ljn6;

    invoke-static {p1}, Ljn6;->access$getPricingManager$p(Ljn6;)Lu24;

    move-result-object v0

    invoke-static {p1}, Ljn6;->access$getFromScan$p(Ljn6;)Z

    move-result v1

    invoke-static {p1, v1}, Ljn6;->access$getLocation(Ljn6;Z)Landroid/location/Location;

    move-result-object v1

    invoke-static {p1}, Ljn6;->access$getFromScan$p(Ljn6;)Z

    move-result v2

    invoke-static {p1, v2}, Ljn6;->access$getRadius(Ljn6;Z)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lu24;->a(Landroid/location/Location;Ljava/lang/Double;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p1}, Ljn6;->access$getUi$p(Ljn6;)Lmn6;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ljn6$c$a;

    invoke-direct {v1, p1}, Ljn6$c$a;-><init>(Ljn6;)V

    new-instance p1, Lkn6;

    invoke-direct {p1, v1}, Lkn6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Ljn6$c;->b(Ljava/lang/Boolean;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
