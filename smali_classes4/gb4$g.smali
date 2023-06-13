.class public final Lgb4$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb4;->a(Lco/bird/android/model/WorkOrder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/QCAutoCheckResponseBody;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/QCAutoCheckResponseBody;",
        "kotlin.jvm.PlatformType",
        "qcAutoChecksResponse",
        "",
        "a",
        "(Lco/bird/api/response/QCAutoCheckResponseBody;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lgb4;


# direct methods
.method public constructor <init>(Lgb4;)V
    .locals 0

    iput-object p1, p0, Lgb4$g;->g:Lgb4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/QCAutoCheckResponseBody;)V
    .locals 1

    iget-object v0, p0, Lgb4$g;->g:Lgb4;

    invoke-static {v0}, Lgb4;->access$getQcAutoChecksSubject$p(Lgb4;)Lio/reactivex/subjects/h;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/QCAutoCheckResponseBody;->getChecks()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/QCAutoCheckResponseBody;

    invoke-virtual {p0, p1}, Lgb4$g;->a(Lco/bird/api/response/QCAutoCheckResponseBody;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
