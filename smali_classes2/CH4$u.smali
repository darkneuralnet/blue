.class public final LCH4$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCH4;->X(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/ComplaintType;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCH4$u$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "LHM4<",
        "Lco/bird/api/response/Complaint;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LHM4;",
        "Lco/bird/api/response/Complaint;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/ComplaintType;

.field public final synthetic h:LCH4;

.field public final synthetic i:Lco/bird/android/model/constant/MapMode;


# direct methods
.method public constructor <init>(Lco/bird/android/model/ComplaintType;LCH4;Lco/bird/android/model/constant/MapMode;)V
    .locals 0

    iput-object p1, p0, LCH4$u;->g:Lco/bird/android/model/ComplaintType;

    iput-object p2, p0, LCH4$u;->h:LCH4;

    iput-object p3, p0, LCH4$u;->i:Lco/bird/android/model/constant/MapMode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LCH4;)V
    .locals 0

    invoke-static {p0}, LCH4$u;->b(LCH4;)V

    return-void
.end method

.method public static final b(LCH4;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LCH4;->access$getNavigator$p(LCH4;)Le13;

    move-result-object p0

    invoke-interface {p0}, Le13;->e3()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LCH4$u;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LHM4<",
            "Lco/bird/api/response/Complaint;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHM4;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, LHM4;->f()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, LCH4$u;->g:Lco/bird/android/model/ComplaintType;

    sget-object v2, LCH4$u$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    new-instance v1, Lco/bird/android/model/analytics/CommunityModeBadRidingSubmitted;

    invoke-direct {v1}, Lco/bird/android/model/analytics/CommunityModeBadRidingSubmitted;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v1, Lco/bird/android/model/analytics/CommunityModeBadParkingSubmitted;

    invoke-direct {v1}, Lco/bird/android/model/analytics/CommunityModeBadParkingSubmitted;-><init>()V

    goto :goto_0

    :cond_2
    new-instance v1, Lco/bird/android/model/analytics/CommunityModeDamageSubmitted;

    invoke-direct {v1}, Lco/bird/android/model/analytics/CommunityModeDamageSubmitted;-><init>()V

    :goto_0
    iget-object v2, p0, LCH4$u;->h:LCH4;

    invoke-static {v2}, LCH4;->access$getAnalyticsManager$p(LCH4;)LEa;

    move-result-object v2

    invoke-interface {v2, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-virtual {v0}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/response/Complaint;

    if-eqz v0, :cond_3

    iget-object v1, p0, LCH4$u;->h:LCH4;

    const-string v2, "enableBackgroundImageUploads"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v1}, LCH4;->access$getImageUploader$p(LCH4;)LoY1;

    move-result-object p1

    sget-object v1, Lco/bird/android/imageupload/worker/UpdatePhotosWorker;->i:Lco/bird/android/imageupload/worker/UpdatePhotosWorker$a;

    invoke-virtual {v0}, Lco/bird/api/response/Complaint;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lco/bird/android/imageupload/worker/UpdatePhotosWorker$a;->a(Ljava/lang/String;)Landroidx/work/b;

    move-result-object v0

    const-class v1, Lco/bird/android/imageupload/worker/UpdatePhotosWorker;

    invoke-interface {p1, v1, v0}, LoY1;->a(Ljava/lang/Class;Landroidx/work/b;)Lio/reactivex/c;

    :cond_3
    iget-object p1, p0, LCH4$u;->i:Lco/bird/android/model/constant/MapMode;

    sget-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, LCH4$u;->h:LCH4;

    invoke-static {p1}, LCH4;->access$getNavigator$p(LCH4;)Le13;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToRider$default(Le13;ZZLco/bird/android/model/GoDeepLinkParams;ILjava/lang/Object;)V

    return-void

    :cond_4
    iget-object p1, p0, LCH4$u;->h:LCH4;

    invoke-static {p1}, LCH4;->access$getReactiveConfig$p(LCH4;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getChargerConfig()Lco/bird/android/model/wire/configs/ChargerConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ChargerConfig;->getMarkDamagedCopyUpdates()Z

    move-result p1

    if-eqz p1, :cond_5

    sget p1, Lnl4;->damage_feedback_feedback_thank_you:I

    goto :goto_1

    :cond_5
    sget p1, Lnl4;->feedback_thank_you:I

    :goto_1
    iget-object v0, p0, LCH4$u;->h:LCH4;

    invoke-static {v0}, LCH4;->access$getUi$p(LCH4;)LHH4;

    move-result-object v0

    invoke-interface {v0, p1}, LaM5;->success(I)V

    iget-object p1, p0, LCH4$u;->h:LCH4;

    invoke-static {p1}, LCH4;->access$getHandler$p(LCH4;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, LCH4$u;->h:LCH4;

    new-instance v1, LDH4;

    invoke-direct {v1, v0}, LDH4;-><init>(LCH4;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    :cond_6
    iget-object p1, p0, LCH4$u;->h:LCH4;

    invoke-static {p1}, LCH4;->access$getUi$p(LCH4;)LHH4;

    move-result-object p1

    sget v0, Lnl4;->error_generic_body:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :goto_2
    return-void
.end method
