.class public final Lhp3$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhp3;->H(Llp3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhp3$n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "LFQ3;",
        "+",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LFQ3;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
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
.field public final synthetic g:Lhp3;


# direct methods
.method public constructor <init>(Lhp3;)V
    .locals 0

    iput-object p1, p0, Lhp3$n;->g:Lhp3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lhp3$n;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LFQ3;",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/OperatorOrderView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getType()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object v0

    sget-object v1, Lhp3$n$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhp3$n;->g:Lhp3;

    invoke-static {v0}, Lhp3;->access$getNavigator$p(Lhp3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getOrderId()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x2745

    invoke-interface {v0, p1, v2, v1}, Le13;->a1(Ljava/lang/String;ZI)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lhp3$n;->g:Lhp3;

    invoke-static {v0}, Lhp3;->access$getNavigator$p(Lhp3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getOrderId()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x2744

    invoke-interface {v0, p1, v2, v1}, Le13;->j3(Ljava/lang/String;ZI)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lhp3$n;->g:Lhp3;

    invoke-static {v0}, Lhp3;->access$getNavigator$p(Lhp3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getOrderId()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x2743

    invoke-interface {v0, p1, v2, v1}, Le13;->a1(Ljava/lang/String;ZI)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lhp3$n;->g:Lhp3;

    invoke-static {v0}, Lhp3;->access$getNavigator$p(Lhp3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getOrderId()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x2742

    invoke-interface {v0, p1, v2, v1}, Le13;->j3(Ljava/lang/String;ZI)V

    :goto_0
    return-void
.end method
