.class public final Lco/bird/android/manager/localization/OtaManagerImpl$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/localization/OtaManagerImpl;-><init>(LTq4;LIv2;LOh;LLifecycleOwner;Landroid/content/Context;Le13;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "birdProjectId",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "e",
        "(Ljava/lang/String;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/localization/OtaManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/localization/OtaManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localization/OtaManagerImpl$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localization/OtaManagerImpl$a;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localization/OtaManagerImpl$a;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/String;)Lio/reactivex/h;
    .locals 7

    const-string v0, "birdProjectId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshing ota pulls for project "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/localization/OtaManagerImpl;->access$getLocalizationClient$p(Lco/bird/android/manager/localization/OtaManagerImpl;)LIv2;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/localization/OtaManagerImpl;->access$getAppBuildConfig$p(Lco/bird/android/manager/localization/OtaManagerImpl;)LOh;

    move-result-object v1

    invoke-interface {v1}, LOh;->h()Lorg/joda/time/DateTime;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    invoke-static {v2}, Lco/bird/android/manager/localization/OtaManagerImpl;->access$getConfig(Lco/bird/android/manager/localization/OtaManagerImpl;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getLocalizationConfig()Lco/bird/android/model/wire/configs/LocalizationConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/LocalizationConfig;->getOta()Lco/bird/android/model/wire/configs/LocalizationOtaConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/LocalizationOtaConfig;->getEnableCacheBusting()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    invoke-static {v2}, Lco/bird/android/manager/localization/OtaManagerImpl;->access$getCachePrefix$p(Lco/bird/android/manager/localization/OtaManagerImpl;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    invoke-static {v4}, Lco/bird/android/manager/localization/OtaManagerImpl;->access$getCacheBusterCount$p(Lco/bird/android/manager/localization/OtaManagerImpl;)I

    move-result v5

    add-int/lit8 v6, v5, 0x1

    invoke-static {v4, v6}, Lco/bird/android/manager/localization/OtaManagerImpl;->access$setCacheBusterCount$p(Lco/bird/android/manager/localization/OtaManagerImpl;I)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-interface {v0, p1, v1, v3, v2}, LIv2;->a(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/manager/localization/OtaManagerImpl$a$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl$a$a;

    new-instance v1, LNy3;

    invoke-direct {v1, v0}, LNy3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    const-wide/16 v2, 0x1e

    invoke-virtual {p1, v2, v3, v0, v1}, Lio/reactivex/F;->b0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/localization/OtaManagerImpl$a$b;

    iget-object v1, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    invoke-direct {v0, v1}, Lco/bird/android/manager/localization/OtaManagerImpl$a$b;-><init>(Lco/bird/android/manager/localization/OtaManagerImpl;)V

    new-instance v1, LOy3;

    invoke-direct {v1, v0}, LOy3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/localization/OtaManagerImpl$a$c;

    iget-object v1, p0, Lco/bird/android/manager/localization/OtaManagerImpl$a;->g:Lco/bird/android/manager/localization/OtaManagerImpl;

    invoke-direct {v0, v1}, Lco/bird/android/manager/localization/OtaManagerImpl$a$c;-><init>(Lco/bird/android/manager/localization/OtaManagerImpl;)V

    new-instance v1, LPy3;

    invoke-direct {v1, v0}, LPy3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->s(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object p1

    sget-object v0, Lco/bird/android/manager/localization/OtaManagerImpl$a$d;->g:Lco/bird/android/manager/localization/OtaManagerImpl$a$d;

    new-instance v1, LQy3;

    invoke-direct {v1, v0}, LQy3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->p(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/p;->F()Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/localization/OtaManagerImpl$a;->e(Ljava/lang/String;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
