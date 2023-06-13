.class public final Lah0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lah0;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdRepair;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/BirdRepair;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/BirdRepair;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lah0;


# direct methods
.method public constructor <init>(Lah0;)V
    .locals 0

    iput-object p1, p0, Lah0$b;->g:Lah0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BirdRepair;)V
    .locals 2

    iget-object p1, p0, Lah0$b;->g:Lah0;

    invoke-static {p1}, Lah0;->access$getUi$p(Lah0;)Leh0;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-interface {p1, v0, v1}, LS74;->showProgress(ZI)V

    iget-object p1, p0, Lah0$b;->g:Lah0;

    invoke-static {p1}, Lah0;->access$getEventBus$p(Lah0;)LEg1;

    move-result-object p1

    new-instance v0, LvT;

    iget-object v1, p0, Lah0$b;->g:Lah0;

    invoke-static {v1}, Lah0;->access$getBird$p(Lah0;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "bird"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-direct {v0, v1}, LvT;-><init>(Lco/bird/android/model/wire/WireBird;)V

    invoke-interface {p1, v0}, LEg1;->c(Lg70;)V

    iget-object p1, p0, Lah0$b;->g:Lah0;

    invoke-static {p1}, Lah0;->access$showCompleteDialog(Lah0;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdRepair;

    invoke-virtual {p0, p1}, Lah0$b;->a(Lco/bird/android/model/BirdRepair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
