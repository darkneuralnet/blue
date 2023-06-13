.class public final LSS$j;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSS$j$a;
    }
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

    iput-object p1, p0, LSS$j;->g:LSS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LSS$j;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 10

    iget-object p1, p0, LSS$j;->g:LSS;

    invoke-static {p1}, LSS;->access$getPreference$p(LSS;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->S0()V

    iget-object p1, p0, LSS$j;->g:LSS;

    invoke-static {p1}, LSS;->access$getPreference$p(LSS;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/UserKt;->isInRegistration(Lco/bird/android/model/User;)Z

    move-result p1

    iget-object v0, p0, LSS$j;->g:LSS;

    invoke-static {v0}, LSS;->access$getLightSensorReading$p(LSS;)LAG;

    move-result-object v0

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v6, v0

    iget-object v0, p0, LSS$j;->g:LSS;

    invoke-static {v0}, LSS;->access$getUi$p(LSS;)LZS;

    move-result-object v0

    invoke-interface {v0}, Lhm5;->sk()Lak5;

    move-result-object v0

    sget-object v1, LSS$j$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 p1, 0x2

    if-eq v0, p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LSS$j;->g:LSS;

    invoke-static {p1}, LSS;->access$getScanEntryMode$p(LSS;)LAG;

    move-result-object p1

    sget-object v0, Lak5;->b:Lak5;

    invoke-virtual {p1, v0}, LAG;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, LSS$j;->g:LSS;

    invoke-static {v0}, LSS;->access$getScanEntryMode$p(LSS;)LAG;

    move-result-object v0

    sget-object v1, Lak5;->c:Lak5;

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LSS$j;->g:LSS;

    invoke-static {v0}, LSS;->access$getAnalyticsManager$p(LSS;)LEa;

    move-result-object v0

    new-instance v9, Lcm5;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lcm5;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_1
    return-void
.end method
