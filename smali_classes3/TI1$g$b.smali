.class public final LTI1$g$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTI1$g;->invoke(Lkotlin/Unit;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/DialogResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LTI1;


# direct methods
.method public constructor <init>(LTI1;)V
    .locals 0

    iput-object p1, p0, LTI1$g$b;->g:LTI1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)V
    .locals 8

    iget-object p1, p0, LTI1$g$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getBird$p(LTI1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LTI1$g$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getItemLeaseManager$p(LTI1;)LMc2;

    move-result-object p1

    new-instance v7, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    sget-object v2, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    sget-object v3, Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;->MISSING_HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/itemlease/ItemLeaseExemption;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v7}, LMc2;->A(Lco/bird/android/model/itemlease/ItemLeaseExemption;)V

    :cond_0
    iget-object p1, p0, LTI1$g$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getNavigator$p(LTI1;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Le13;->b1(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LTI1$g$b;->a(Lco/bird/android/model/DialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
