.class public final LjV1$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LjV1;


# direct methods
.method public constructor <init>(LjV1;)V
    .locals 0

    iput-object p1, p0, LjV1$m;->g:LjV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LjV1$m;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)Lio/reactivex/h;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->getStatus()Lco/bird/android/model/identification/IdentificationStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationStatus;->PENDING:Lco/bird/android/model/identification/IdentificationStatus;

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LjV1$m;->g:LjV1;

    invoke-static {p1}, LjV1;->access$getReactiveConfig$p(LjV1;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getIdentificationConfig()Lco/bird/android/model/wire/configs/IdentificationConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getPendingSubmissionPollingIntervalSeconds()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Lio/reactivex/Observable;->interval(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LjV1$m$a;

    iget-object v1, p0, LjV1$m;->g:LjV1;

    invoke-direct {v0, v1}, LjV1$m$a;-><init>(LjV1;)V

    new-instance v1, LkV1;

    invoke-direct {v1, v0}, LkV1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->getStatus()Lco/bird/android/model/identification/IdentificationStatus;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationStatus;->canTreatAsSuccessful()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LjV1$m;->g:LjV1;

    invoke-static {p1}, LjV1;->access$getNavigator$p(LjV1;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Le13;->b1(I)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    invoke-virtual {p0, p1}, LjV1$m;->b(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
