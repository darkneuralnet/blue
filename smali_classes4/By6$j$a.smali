.class public final LBy6$j$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBy6$j;->a(Lco/bird/android/model/User;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LUx6;",
        "LUx6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LUx6;",
        "state",
        "a",
        "(LUx6;)LUx6;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/User;

.field public final synthetic h:LBy6;


# direct methods
.method public constructor <init>(Lco/bird/android/model/User;LBy6;)V
    .locals 0

    iput-object p1, p0, LBy6$j$a;->g:Lco/bird/android/model/User;

    iput-object p2, p0, LBy6$j$a;->h:LBy6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LUx6;)LUx6;
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LBy6$j$a;->g:Lco/bird/android/model/User;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2}, Lco/bird/android/model/User;->getWarehouseId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LBy6$j$a;->h:LBy6;

    invoke-static {v0}, LBy6;->access$getReactiveConfig$p(LBy6;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getServiceCenterConfig()Lco/bird/android/model/wire/configs/ServiceCenterConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ServiceCenterConfig;->getEnableEnterLocationModal()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, LUx6;->copy$default(LUx6;Lco/bird/android/model/User;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;ZLjava/lang/Throwable;ILjava/lang/Object;)LUx6;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUx6;

    invoke-virtual {p0, p1}, LBy6$j$a;->a(LUx6;)LUx6;

    move-result-object p1

    return-object p1
.end method