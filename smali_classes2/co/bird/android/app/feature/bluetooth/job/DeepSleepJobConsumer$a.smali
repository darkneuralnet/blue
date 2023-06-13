.class public final Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;->n(Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/Vehicle;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer$a;->g:Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer$a;->g:Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;

    invoke-virtual {v0}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;->m()LpJ;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LpJ;->a(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer$a;->a(Lco/bird/android/model/Vehicle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
