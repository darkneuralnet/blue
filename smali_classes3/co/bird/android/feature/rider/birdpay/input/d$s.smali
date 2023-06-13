.class public final Lco/bird/android/feature/rider/birdpay/input/d$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d;->V()V
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
        "Lco/bird/android/feature/rider/birdpay/input/d$b;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a\u00020\u000326\u0010\u0004\u001a2\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003 \u0002*\u0018\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/feature/rider/birdpay/input/d$b;",
        "kotlin.jvm.PlatformType",
        "",
        "<name for destructuring parameter 0>",
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
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/input/d;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$s;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$s;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/feature/rider/birdpay/input/d$b;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/feature/rider/birdpay/input/d$b;

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$s;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getNavigator$p(Lco/bird/android/feature/rider/birdpay/input/d;)Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->close()V

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$s;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getNavigator$p(Lco/bird/android/feature/rider/birdpay/input/d;)Le13;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->g()J

    move-result-wide v4

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->b()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->d()Lorg/joda/time/DateTime;

    move-result-object v8

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$b;->h()Ljava/lang/Long;

    move-result-object v10

    invoke-interface/range {v1 .. v10}, Le13;->Q(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method
