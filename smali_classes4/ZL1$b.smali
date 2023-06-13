.class public final LZL1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZL1;->l1(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/HibernationResultResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/HibernationResultResponse;",
        "result",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/HibernationResultResponse;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZL1;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LZL1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LZL1$b;->g:LZL1;

    iput-object p2, p0, LZL1$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/api/response/HibernationResultResponse;LZL1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, LZL1$b;->c(Lco/bird/api/response/HibernationResultResponse;LZL1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/api/response/HibernationResultResponse;LZL1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$birdId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/HibernationResultResponse;->getSuccess()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lco/bird/android/model/constant/VehicleHibernationCategory;->PENDING:Lco/bird/android/model/constant/VehicleHibernationCategory;

    invoke-static {p1}, LZL1;->access$getContext$p(LZL1;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->hibernation_status_pending:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.stri\u2026bernation_status_pending)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/constant/VehicleHibernationCategory;->NOT_HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    invoke-static {p1}, LZL1;->access$getContext$p(LZL1;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->hibernation_status_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.stri\u2026ibernation_status_failed)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    move-object v4, p0

    move-object v5, v0

    new-instance p0, Lco/bird/android/model/persistence/HibernationSessionVehicle;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, Lco/bird/android/model/persistence/HibernationSessionVehicle;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/VehicleHibernationCategory;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;)V

    invoke-static {p1}, LZL1;->access$getHibernationDao$p(LZL1;)LSL1;

    move-result-object p1

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, LSL1;->g(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/HibernationResultResponse;)Lio/reactivex/h;
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZL1$b;->g:LZL1;

    iget-object v1, p0, LZL1$b;->h:Ljava/lang/String;

    new-instance v2, LaM1;

    invoke-direct {v2, p1, v0, v1}, LaM1;-><init>(Lco/bird/api/response/HibernationResultResponse;LZL1;Ljava/lang/String;)V

    invoke-static {v2}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/HibernationResultResponse;

    invoke-virtual {p0, p1}, LZL1$b;->b(Lco/bird/api/response/HibernationResultResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
