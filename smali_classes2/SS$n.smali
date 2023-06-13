.class public final LSS$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSS;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LSS;


# direct methods
.method public constructor <init>(LSS;)V
    .locals 0

    iput-object p1, p0, LSS$n;->g:LSS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LSS;Lco/bird/android/model/wire/configs/RideConfig;)V
    .locals 0

    invoke-static {p0, p1}, LSS$n;->b(LSS;Lco/bird/android/model/wire/configs/RideConfig;)V

    return-void
.end method

.method public static final b(LSS;Lco/bird/android/model/wire/configs/RideConfig;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_with"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LSS;->access$getScanEntryMode$p(LSS;)LAG;

    move-result-object v0

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lak5;->b:Lak5;

    if-ne v0, v1, :cond_0

    invoke-static {p0}, LSS;->access$getUi$p(LSS;)LZS;

    move-result-object p0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getScannerCodeEntryTooltipLocalizedCopy()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, Lhm5;->Qa(Ljava/lang/String;Z)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LSS$n;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 5

    iget-object p1, p0, LSS$n;->g:LSS;

    invoke-static {p1}, LSS;->access$getReactiveConfig$p(LSS;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    iget-object v0, p0, LSS$n;->g:LSS;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScannerCodeEntryTooltip()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LSS;->access$getPreference$p(LSS;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->u()I

    move-result v1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getScannerCodeEntryTooltipMaxEntries()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-static {v0}, LSS;->access$getPreference$p(LSS;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->v()I

    move-result v1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getScannerCodeEntryTooltipMaxViews()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-static {v0}, LSS;->access$getHandler$p(LSS;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, LTS;

    invoke-direct {v2, v0, p1}, LTS;-><init>(LSS;Lco/bird/android/model/wire/configs/RideConfig;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getScannerCodeEntryTooltipMaxDuration()I

    move-result p1

    int-to-long v3, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, p1}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
