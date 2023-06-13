.class public final LtC3$W;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003 \u0002*\u001e\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "",
        "LH6;",
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
.field public final synthetic g:LtC3;


# direct methods
.method public constructor <init>(LtC3;)V
    .locals 0

    iput-object p1, p0, LtC3$W;->g:LtC3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LtC3$W;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/Bird;

    iget-object v0, p0, LtC3$W;->g:LtC3;

    invoke-virtual {v0}, LtC3;->W0()LUC3;

    move-result-object v0

    invoke-virtual {v0}, LUC3;->cm()Z

    move-result v9

    iget-object v0, p0, LtC3$W;->g:LtC3;

    invoke-virtual {v0}, LtC3;->G0()LEa;

    move-result-object v0

    new-instance v12, Lm54;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getPrivateBird()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getOwnershipKind()Lco/bird/android/model/constant/OwnershipKind;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/constant/OwnershipKind;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    move-object v6, v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getDistance()I

    move-result v7

    iget-object v1, p0, LtC3$W;->g:LtC3;

    invoke-virtual {v1}, LtC3;->M0()LOA3;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getDistance()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, LOA3;->b(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, Lm54;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
