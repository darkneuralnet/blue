.class public final LBj3$m;
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
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "enabled",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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

    iput-object p1, p0, LBj3$m;->g:LBj3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LBj3$m;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, LBj3$m;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getEnableFeeArea(LBj3;)Z

    move-result v0

    const-string v1, "enabled"

    if-eqz v0, :cond_0

    iget-object v0, p0, LBj3$m;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object v0

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, v1}, LCw3;->wh(Z)V

    iget-object v0, p0, LBj3$m;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getServerDrivenFilterManager$p(LBj3;)Lot5;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/AreaKind;->FEE_MODIFIED:Lco/bird/android/model/constant/AreaKind;

    invoke-static {v1}, LGj3;->a(Lco/bird/android/model/constant/AreaKind;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Lot5;->f(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LBj3$m;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object v0

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, v1}, LWs3;->zb(Z)V

    iget-object v0, p0, LBj3$m;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getServerDrivenFilterManager$p(LBj3;)Lot5;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/AreaKind;->DEMAND_CELLS:Lco/bird/android/model/constant/AreaKind;

    invoke-static {v1}, LGj3;->a(Lco/bird/android/model/constant/AreaKind;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Lot5;->f(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Z)V

    :goto_0
    return-void
.end method
