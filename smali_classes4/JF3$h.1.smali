.class public final LJF3$h;
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
        "Lco/bird/android/model/CompleteRideResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/CompleteRideResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/CompleteRideResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireRide;

.field public final synthetic h:LFU4;

.field public final synthetic i:Lorg/joda/time/DateTime;

.field public final synthetic j:Z

.field public final synthetic k:LJF3;

.field public final synthetic l:Lf13;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRide;LFU4;Lorg/joda/time/DateTime;ZLJF3;Lf13;)V
    .locals 0

    iput-object p1, p0, LJF3$h;->g:Lco/bird/android/model/wire/WireRide;

    iput-object p2, p0, LJF3$h;->h:LFU4;

    iput-object p3, p0, LJF3$h;->i:Lorg/joda/time/DateTime;

    iput-boolean p4, p0, LJF3$h;->j:Z

    iput-object p5, p0, LJF3$h;->k:LJF3;

    iput-object p6, p0, LJF3$h;->l:Lf13;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/CompleteRideResponse;)V
    .locals 4

    iget-object v0, p0, LJF3$h;->g:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "completeRide API succeeded for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LJF3$h;->h:LFU4;

    iget-object v1, p0, LJF3$h;->g:Lco/bird/android/model/wire/WireRide;

    const-string v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LJF3$h;->i:Lorg/joda/time/DateTime;

    const-string v3, "operationStart"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v3, p0, LJF3$h;->j:Z

    invoke-interface {v0, v1, p1, v2, v3}, LFU4;->m1(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/CompleteRideResponse;Lorg/joda/time/DateTime;Z)V

    iget-object p1, p0, LJF3$h;->k:LJF3;

    invoke-static {p1}, LJF3;->access$getReactiveLocationManager$p(LJF3;)Ldr4;

    move-result-object p1

    invoke-interface {p1}, Ldr4;->a()V

    iget-object p1, p0, LJF3$h;->l:Lf13;

    invoke-interface {p1}, Lf13;->i()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/CompleteRideResponse;

    invoke-virtual {p0, p1}, LJF3$h;->a(Lco/bird/android/model/CompleteRideResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
