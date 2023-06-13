.class public final Li25$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->s3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/android/model/LastLockComplianceModel;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/LastLockComplianceModel;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$d;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/LastLockComplianceModel;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/LastLockComplianceModel;

    if-eqz p1, :cond_2

    iget-object v0, p0, Li25$d;->g:Li25;

    invoke-virtual {v0}, Li25;->f4()LYR4;

    move-result-object v1

    invoke-interface {v1}, LYR4;->r()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getRideId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v0}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object v3

    invoke-virtual {v3}, Lgl;->e1()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getWarnNotCompliant()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getShowPhysicalLockLastNonCompliantModal()Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getShowCompliant()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getShowPhysicalLockLastCompliantModal()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-static {v0}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object v1

    invoke-virtual {v1, v2}, Lgl;->d2(Ljava/lang/String;)V

    invoke-static {v0}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v0

    invoke-interface {v0, p1}, Le13;->W1(Lco/bird/android/model/LastLockComplianceModel;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Li25$d;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
