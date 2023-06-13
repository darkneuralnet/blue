.class public final LBj3$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBj3;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        "kotlin.jvm.PlatformType",
        "invoke"
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
.field public final synthetic g:LBj3;


# direct methods
.method public constructor <init>(LBj3;)V
    .locals 0

    iput-object p1, p0, LBj3$o;->g:LBj3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LBj3$o;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, LBj3$o;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getEnableFeeArea(LBj3;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, LBj3$o;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object p1

    invoke-interface {p1, v0}, LCw3;->wh(Z)V

    iget-object p1, p0, LBj3$o;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getServerDrivenFilterManager$p(LBj3;)Lot5;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/constant/AreaKind;->FEE_MODIFIED:Lco/bird/android/model/constant/AreaKind;

    invoke-static {v1}, LGj3;->a(Lco/bird/android/model/constant/AreaKind;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lot5;->f(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LBj3$o;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object p1

    invoke-interface {p1, v0}, LWs3;->zb(Z)V

    iget-object p1, p0, LBj3$o;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getServerDrivenFilterManager$p(LBj3;)Lot5;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/constant/AreaKind;->DEMAND_CELLS:Lco/bird/android/model/constant/AreaKind;

    invoke-static {v1}, LGj3;->a(Lco/bird/android/model/constant/AreaKind;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lot5;->f(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Z)V

    :goto_0
    return-void
.end method
