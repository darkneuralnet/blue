.class public final LQt1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQt1;->Q(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/QuickCaptureResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/QuickCaptureResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/QuickCaptureResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lorg/joda/time/DateTime;

.field public final synthetic h:LQt1;

.field public final synthetic i:Lco/bird/android/model/persistence/Bird;


# direct methods
.method public constructor <init>(Lorg/joda/time/DateTime;LQt1;Lco/bird/android/model/persistence/Bird;)V
    .locals 0

    iput-object p1, p0, LQt1$b;->g:Lorg/joda/time/DateTime;

    iput-object p2, p0, LQt1$b;->h:LQt1;

    iput-object p3, p0, LQt1$b;->i:Lco/bird/android/model/persistence/Bird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/QuickCaptureResponse;)V
    .locals 3

    iget-object v0, p0, LQt1$b;->g:Lorg/joda/time/DateTime;

    invoke-virtual {p1}, Lco/bird/api/response/QuickCaptureResponse;->getTimeout()I

    move-result p1

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p1

    iget-object v0, p0, LQt1$b;->h:LQt1;

    invoke-static {v0}, LQt1;->access$getQuickCaptureTimeoutCache$p(LQt1;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iget-object v1, p0, LQt1$b;->i:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "timeout"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LQt1$b;->h:LQt1;

    invoke-static {v0}, LQt1;->access$getQuickCaptureInitiatesRelay$p(LQt1;)Lma4;

    move-result-object v0

    iget-object v1, p0, LQt1$b;->i:Lco/bird/android/model/persistence/Bird;

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/QuickCaptureResponse;

    invoke-virtual {p0, p1}, LQt1$b;->a(Lco/bird/api/response/QuickCaptureResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
