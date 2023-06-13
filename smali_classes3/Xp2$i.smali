.class public final LXp2$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXp2;->b(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/WorkOrder;",
        ">;+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Issue;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082J\u0010\u0007\u001aF\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/WorkOrder;",
        "",
        "",
        "Lco/bird/android/model/Issue;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/WorkOrder;

.field public final synthetic h:Lorg/joda/time/DateTime;

.field public final synthetic i:LXp2;

.field public final synthetic j:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Lco/bird/android/model/WorkOrder;Lorg/joda/time/DateTime;LXp2;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LXp2$i;->g:Lco/bird/android/model/WorkOrder;

    iput-object p2, p0, LXp2$i;->h:Lorg/joda/time/DateTime;

    iput-object p3, p0, LXp2$i;->i:LXp2;

    iput-object p4, p0, LXp2$i;->j:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/WorkOrder;",
            ">;",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v2, p0, LXp2$i;->g:Lco/bird/android/model/WorkOrder;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/WorkOrder;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :cond_2
    :goto_0
    iget-object v4, p0, LXp2$i;->h:Lorg/joda/time/DateTime;

    if-eqz v4, :cond_3

    if-eqz v2, :cond_3

    iget-object v4, p0, LXp2$i;->i:LXp2;

    invoke-static {v4}, LXp2;->access$getWorkOrderManager$p(LXp2;)LaG6;

    move-result-object v4

    iget-object v5, p0, LXp2$i;->h:Lorg/joda/time/DateTime;

    invoke-interface {v4, v5, v2}, LaG6;->i(Lorg/joda/time/DateTime;Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    :cond_3
    iget-object v2, p0, LXp2$i;->i:LXp2;

    iget-object v4, p0, LXp2$i;->j:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/WorkOrder;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_4
    invoke-virtual {v2, v4, v3, v1, p1}, LFE;->i(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LXp2$i;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
