.class public final Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->n(Lcom/uber/autodispose/ScopeProvider;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
        "Lkotlin/Triple<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Landroid/content/Intent;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
        "<name for destructuring parameter 0>",
        "Lkotlin/Triple;",
        "",
        "Landroid/content/Intent;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lkotlin/Triple;"
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
        "SMAP\nUserTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lkotlin/Triple;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
            ")",
            "Lkotlin/Triple<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;->b()Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget p1, Lnl4;->notification_operator_on_duty_service_missing_requirements:I

    sget v0, Lnl4;->notification_operator_on_duty_service_missing_requirements_content:I

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget p1, Lnl4;->notification_operator_on_duty_service_running_in_background:I

    sget v0, Lnl4;->notification_operator_on_duty_service_running_in_background_content:I

    :goto_0
    iget-object v1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getMainActivityIntent$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Landroid/content/Intent;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const-string v3, "co.bird.android.force_map_mode"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    new-instance v2, Lkotlin/Triple;

    iget-object v3, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-virtual {v3}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->g()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-virtual {v3}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->g()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p1, v0, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;->a(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
