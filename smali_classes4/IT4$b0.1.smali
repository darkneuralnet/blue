.class public final LIT4$b0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->l4(Lco/bird/android/model/wire/WireBird;LvT3;Lio/reactivex/F;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRide;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRide;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireRide;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:LIT4;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;LIT4;)V
    .locals 0

    iput-object p1, p0, LIT4$b0;->g:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, LIT4$b0;->h:LIT4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRide;)V
    .locals 2

    iget-object p1, p0, LIT4$b0;->g:Lco/bird/android/model/wire/WireBird;

    iget-object v0, p0, LIT4$b0;->h:LIT4;

    invoke-static {v0}, LIT4;->access$getReactiveConfig$p(LIT4;)LTq4;

    move-result-object v0

    iget-object v1, p0, LIT4$b0;->g:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-static {p1, v0}, Lco/bird/android/model/wire/WireBirdKt;->shouldConnectViaBTInRide(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LIT4$b0;->h:LIT4;

    invoke-static {p1}, LIT4;->access$getBluetoothManager$p(LIT4;)LpJ;

    move-result-object p1

    iget-object v0, p0, LIT4$b0;->g:Lco/bird/android/model/wire/WireBird;

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, LpJ;->g(Lco/bird/android/model/wire/WireBird;Z)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Starting to track scan-only vehicle."

    invoke-static {v0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p0, p1}, LIT4$b0;->a(Lco/bird/android/model/wire/WireRide;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
