.class public final LJF3$z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;-><init>(LTq4;Landroid/content/Context;Lgl;Ldr4;Lbn;LEa;LYR4;LTL;Ltm;LXc1;Llw0;Lys0;LpU4;LaM;LMc2;LoI5;)V
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
        "Landroid/location/Location;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/ParkingNest;",
        ">;>;",
        "LbF0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062 \u0010\u0005\u001a\u001c\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Landroid/location/Location;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/ParkingNest;",
        "<name for destructuring parameter 0>",
        "LbF0;",
        "a",
        "(Lkotlin/Pair;)LbF0;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJF3;


# direct methods
.method public constructor <init>(LJF3;)V
    .locals 0

    iput-object p1, p0, LJF3$z;->g:LJF3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)LbF0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Landroid/location/Location;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;>;)",
            "LbF0;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, LJF3$z;->g:LJF3;

    const-string v2, "location"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LJF3$z;->g:LJF3;

    invoke-static {v2}, LJF3;->access$getReactiveConfig$p(LJF3;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    sget-object v3, Lco/bird/android/model/ParkingLocationSource;->USER:Lco/bird/android/model/ParkingLocationSource;

    invoke-static {v1, v0, p1, v2, v3}, LJF3;->access$computeCurrentParkingNest(LJF3;Landroid/location/Location;Ljava/util/List;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/ParkingLocationSource;)LbF0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LJF3$z;->a(Lkotlin/Pair;)LbF0;

    move-result-object p1

    return-object p1
.end method
