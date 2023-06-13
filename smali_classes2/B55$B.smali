.class public final LB55$B;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55;->B1(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/BirdPayment;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Balance;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/RideRequirement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Balance;",
        "balance",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/RideRequirement;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Balance;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/configs/RideConfig;

.field public final synthetic h:LB55;

.field public final synthetic i:Lco/bird/android/model/User;

.field public final synthetic j:Z

.field public final synthetic k:Lco/bird/android/model/BirdPayment;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/RideConfig;LB55;Lco/bird/android/model/User;ZLco/bird/android/model/BirdPayment;)V
    .locals 0

    iput-object p1, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    iput-object p2, p0, LB55$B;->h:LB55;

    iput-object p3, p0, LB55$B;->i:Lco/bird/android/model/User;

    iput-boolean p4, p0, LB55$B;->j:Z

    iput-object p5, p0, LB55$B;->k:Lco/bird/android/model/BirdPayment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Balance;)Lio/reactivex/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Balance;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation

    const-string v0, "balance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getBalance()J

    move-result-wide v0

    iget-object v2, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayMandatoryMinBalance()J

    move-result-wide v2

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, LB55$B;->h:LB55;

    invoke-static {v3}, LB55;->access$getPreference$p(LB55;)Lgl;

    move-result-object v3

    invoke-virtual {v3}, Lgl;->E()Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayNagEveryRideCount()I

    move-result v4

    if-nez v3, :cond_1

    iget-object v5, p0, LB55$B;->i:Lco/bird/android/model/User;

    invoke-virtual {v5}, Lco/bird/android/model/User;->getRideCount()I

    move-result v5

    iget-object v6, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v6}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayStartAfterRideCount()I

    move-result v6

    if-lt v5, v6, :cond_1

    move v5, v1

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ltz v6, :cond_2

    if-lez v4, :cond_2

    iget-object v6, p0, LB55$B;->i:Lco/bird/android/model/User;

    invoke-virtual {v6}, Lco/bird/android/model/User;->getRideCount()I

    move-result v6

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v4

    if-lt v6, v3, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayPromptFirst()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, LB55$B;->j:Z

    if-eqz v2, :cond_4

    iget-object v2, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayStartAfterRideCount()I

    move-result v2

    if-ltz v2, :cond_4

    if-nez v0, :cond_4

    iget-object v0, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayMandatory()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez v5, :cond_3

    if-eqz v1, :cond_4

    :cond_3
    new-instance v0, Lco/bird/android/model/RideRequirement$AutoPayV2;

    iget-object v1, p0, LB55$B;->g:Lco/bird/android/model/wire/configs/RideConfig;

    iget-object v2, p0, LB55$B;->i:Lco/bird/android/model/User;

    iget-object v3, p0, LB55$B;->k:Lco/bird/android/model/BirdPayment;

    invoke-direct {v0, v1, v2, p1, v3}, Lco/bird/android/model/RideRequirement$AutoPayV2;-><init>(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;)V

    invoke-static {v0}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_3

    :cond_4
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Balance;

    invoke-virtual {p0, p1}, LB55$B;->a(Lco/bird/android/model/Balance;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
