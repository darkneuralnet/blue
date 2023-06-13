.class public final LJF3$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;->N(LFU4;Lf13;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/WireRide;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
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
.field public final synthetic g:Lco/bird/android/model/wire/WireRide;

.field public final synthetic h:LFU4;

.field public final synthetic i:Lorg/joda/time/DateTime;

.field public final synthetic j:LJF3;

.field public final synthetic k:Lf13;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRide;LFU4;Lorg/joda/time/DateTime;LJF3;Lf13;)V
    .locals 0

    iput-object p1, p0, LJF3$i;->g:Lco/bird/android/model/wire/WireRide;

    iput-object p2, p0, LJF3$i;->h:LFU4;

    iput-object p3, p0, LJF3$i;->i:Lorg/joda/time/DateTime;

    iput-object p4, p0, LJF3$i;->j:LJF3;

    iput-object p5, p0, LJF3$i;->k:Lf13;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LJF3$i;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, LJF3$i;->g:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "completeRide API failed for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", see RideEndFlowError analytic event for more detail"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LJF3$i;->h:LFU4;

    iget-object v1, p0, LJF3$i;->g:Lco/bird/android/model/wire/WireRide;

    const-string v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LJF3$i;->i:Lorg/joda/time/DateTime;

    const-string v3, "operationStart"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, p1, v2}, LFU4;->o1(Lco/bird/android/model/wire/WireRide;Ljava/lang/Throwable;Lorg/joda/time/DateTime;)V

    iget-object p1, p0, LJF3$i;->j:LJF3;

    invoke-static {p1}, LJF3;->access$getReactiveLocationManager$p(LJF3;)Ldr4;

    move-result-object p1

    invoke-interface {p1}, Ldr4;->a()V

    iget-object p1, p0, LJF3$i;->k:Lf13;

    invoke-interface {p1}, Lf13;->i()V

    return-void
.end method
