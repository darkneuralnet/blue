.class public final LGL5$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGL5;->v()V
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
.field public final synthetic g:LGL5;


# direct methods
.method public constructor <init>(LGL5;)V
    .locals 0

    iput-object p1, p0, LGL5$b;->g:LGL5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LGL5$b;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 8

    iget-object p1, p0, LGL5$b;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getAnalyticsManager$p(LGL5;)LEa;

    move-result-object p1

    new-instance v7, Lco/bird/android/model/analytics/SmartlockUnlockClosed;

    iget-object v0, p0, LGL5$b;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getUnlocking$p(LGL5;)Z

    move-result v1

    iget-object v0, p0, LGL5$b;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getPhysicalLock$p(LGL5;)Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "physicalLock"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, LGL5$b;->g:LGL5;

    invoke-static {v0}, LGL5;->access$currentElapsedTime(LGL5;)J

    move-result-wide v3

    iget-object v0, p0, LGL5$b;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getRideManager$p(LGL5;)LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->n0()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, LGL5$b;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getUnlockCount$p(LGL5;)I

    move-result v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/analytics/SmartlockUnlockClosed;-><init>(ZLjava/lang/String;JLjava/lang/String;I)V

    invoke-interface {p1, v7}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LGL5$b;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getRequestCode$p(LGL5;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, LGL5;->access$finish(LGL5;Ljava/lang/Integer;)V

    return-void
.end method
