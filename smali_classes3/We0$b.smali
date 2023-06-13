.class public final LWe0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWe0;->C(Lio/reactivex/Observable;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/BulkCaptureResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        "scans",
        "Lio/reactivex/K;",
        "Lco/bird/api/response/BulkCaptureResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$bulkCapture$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1603#2,9:164\n1855#2:173\n1856#2:175\n1612#2:176\n1#3:174\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$bulkCapture$2\n*L\n147#1:164,9\n147#1:173\n147#1:175\n147#1:176\n147#1:174\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LWe0;


# direct methods
.method public constructor <init>(LWe0;)V
    .locals 0

    iput-object p1, p0, LWe0$b;->g:LWe0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCaptureValidation;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/BulkCaptureResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "scans"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LWe0$b;->g:LWe0;

    invoke-static {v0}, LWe0;->access$getOperatorManager$p(LWe0;)Lom3;

    move-result-object v1

    iget-object v2, p0, LWe0$b;->g:LWe0;

    invoke-static {v2}, LWe0;->access$getSessionId$p(LWe0;)Ljava/lang/String;

    move-result-object v2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireCaptureValidation;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireCaptureValidation;->getBirdId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1, v2, v3}, Lom3;->j1(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {v0, p1}, LWe0;->access$progress(LWe0;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LWe0$b;->a(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
