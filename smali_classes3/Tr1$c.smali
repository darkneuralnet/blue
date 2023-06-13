.class public final LTr1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTr1;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTr1$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/FleetStatusSummary;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/FleetStatusSummary;",
        "kotlin.jvm.PlatformType",
        "summary",
        "",
        "a",
        "(Lco/bird/android/model/persistence/FleetStatusSummary;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LTr1;


# direct methods
.method public constructor <init>(LTr1;)V
    .locals 0

    iput-object p1, p0, LTr1$c;->g:LTr1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/FleetStatusSummary;)V
    .locals 2

    iget-object v0, p0, LTr1$c;->g:LTr1;

    invoke-static {v0}, LTr1;->access$getPurpose$p(LTr1;)Lmp1;

    move-result-object v0

    sget-object v1, LTr1$c$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LTr1$c;->g:LTr1;

    invoke-static {v0}, LTr1;->access$getFleetNavigator$p(LTr1;)Lkp1;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetStatusSummary;->getFleetId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkp1;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LTr1$c;->g:LTr1;

    invoke-static {v0}, LTr1;->access$getFleetNavigator$p(LTr1;)Lkp1;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetStatusSummary;->getFleetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetStatusSummary;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lkp1;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/FleetStatusSummary;

    invoke-virtual {p0, p1}, LTr1$c;->a(Lco/bird/android/model/persistence/FleetStatusSummary;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
