.class public final LB55$k$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55$k;-><init>(LB55;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/p<",
        "Lco/bird/android/model/RideRequirement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u0010\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "Lco/bird/android/model/User;",
        "<anonymous parameter 1>",
        "Lio/reactivex/p;",
        "Lco/bird/android/model/RideRequirement;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LB55;

.field public final synthetic h:LB55$k;


# direct methods
.method public constructor <init>(LB55;LB55$k;)V
    .locals 0

    iput-object p1, p0, LB55$k$a;->g:LB55;

    iput-object p2, p0, LB55$k$a;->h:LB55$k;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LB55;LB55$k;)V
    .locals 0

    invoke-static {p0, p1}, LB55$k$a;->c(LB55;LB55$k;)V

    return-void
.end method

.method public static final c(LB55;LB55$k;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LB55;->access$getCompletedRideRequirementChecks$p(LB55;)Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/Config;",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 1>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LB55$k$a;->g:LB55;

    invoke-static {p2, p1}, LB55;->access$maybeRedirectToPendingIdentificationCheck(LB55;Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/p;

    move-result-object p1

    iget-object p2, p0, LB55$k$a;->g:LB55;

    iget-object v0, p0, LB55$k$a;->h:LB55$k;

    new-instance v1, LJ55;

    invoke-direct {v1, p2, v0}, LJ55;-><init>(LB55;LB55$k;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->n(Lio/reactivex/functions/a;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    check-cast p2, Lco/bird/android/model/User;

    invoke-virtual {p0, p1, p2}, LB55$k$a;->b(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method
