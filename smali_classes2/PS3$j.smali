.class public final LPS3$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPS3;->i(LES3;Lco/bird/android/model/wire/WirePhysicalLock;Ljava/lang/Integer;)V
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
.field public final synthetic g:LES3;

.field public final synthetic h:LPS3;

.field public final synthetic i:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(LES3;LPS3;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LPS3$j;->g:LES3;

    iput-object p2, p0, LPS3$j;->h:LPS3;

    iput-object p3, p0, LPS3$j;->i:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LPS3$j;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 2

    iget-object p1, p0, LPS3$j;->g:LES3;

    sget-object v0, LES3;->c:LES3;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LPS3$j;->h:LPS3;

    invoke-static {p1}, LPS3;->access$getAnalyticsManager$p(LPS3;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/PhysicalLockSuccessfullyUnlocked;

    invoke-direct {v0}, Lco/bird/android/model/analytics/PhysicalLockSuccessfullyUnlocked;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LPS3$j;->h:LPS3;

    invoke-static {p1}, LPS3;->access$getAnalyticsManager$p(LPS3;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/PhysicalLockSuccessfullyLocked;

    invoke-direct {v0}, Lco/bird/android/model/analytics/PhysicalLockSuccessfullyLocked;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :goto_0
    iget-object p1, p0, LPS3$j;->i:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object v0, p0, LPS3$j;->h:LPS3;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    invoke-static {v0}, LPS3;->access$getNavigator$p(LPS3;)Le13;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Le13;->e4(ILandroid/content/Intent;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_2

    iget-object p1, p0, LPS3$j;->h:LPS3;

    invoke-static {p1}, LPS3;->access$getNavigator$p(LPS3;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    :cond_2
    return-void
.end method