.class public final LxG4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LxG4;->k()V
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LHM4;",
        "",
        "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReplacePhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplacePhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/ReplacePhysicalLockPresenterImpl$observeLockTypeClicks$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LxG4;


# direct methods
.method public constructor <init>(LxG4;)V
    .locals 0

    iput-object p1, p0, LxG4$c;->g:LxG4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, LxG4$c;->g:LxG4;

    invoke-static {v1}, LxG4;->access$getNavigator$p(LxG4;)Le13;

    move-result-object v2

    invoke-static {v1}, LxG4;->access$getBirdId$p(LxG4;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "birdId"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-interface {v2, v0, p1}, Le13;->A3(Ljava/lang/String;Ljava/util/List;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v0, :cond_2

    iget-object p1, p0, LxG4$c;->g:LxG4;

    invoke-static {p1}, LxG4;->access$getUi$p(LxG4;)LzG4;

    move-result-object p1

    sget v0, Lnl4;->physical_lock_unable_to_get_lock_types:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LxG4$c;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
