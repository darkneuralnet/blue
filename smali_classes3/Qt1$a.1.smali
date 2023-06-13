.class public final LQt1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQt1;->N(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/QuickCaptureCancelResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/QuickCaptureCancelResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/api/response/QuickCaptureCancelResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LQt1;

.field public final synthetic h:Lco/bird/android/model/persistence/Bird;


# direct methods
.method public constructor <init>(LQt1;Lco/bird/android/model/persistence/Bird;)V
    .locals 0

    iput-object p1, p0, LQt1$a;->g:LQt1;

    iput-object p2, p0, LQt1$a;->h:Lco/bird/android/model/persistence/Bird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/QuickCaptureCancelResponse;)V
    .locals 1

    iget-object p1, p0, LQt1$a;->g:LQt1;

    invoke-static {p1}, LQt1;->access$getQuickCaptureAnalyticsManager$p(LQt1;)Lid4;

    move-result-object p1

    iget-object v0, p0, LQt1$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p1, v0}, Lid4;->a(Lco/bird/android/model/persistence/Bird;)V

    iget-object p1, p0, LQt1$a;->g:LQt1;

    invoke-static {p1}, LQt1;->access$getQuickCaptureTimeoutCache$p(LQt1;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, LQt1$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/QuickCaptureCancelResponse;

    invoke-virtual {p0, p1}, LQt1$a;->a(Lco/bird/api/response/QuickCaptureCancelResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
