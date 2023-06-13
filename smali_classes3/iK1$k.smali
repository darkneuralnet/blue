.class public final LiK1$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiK1;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
.field public final synthetic g:LiK1;


# direct methods
.method public constructor <init>(LiK1;)V
    .locals 0

    iput-object p1, p0, LiK1$k;->g:LiK1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LiK1$k;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 3

    iget-object p1, p0, LiK1$k;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result p1

    const/4 v0, 0x0

    const-string v1, "bird"

    if-eqz p1, :cond_1

    iget-object p1, p0, LiK1$k;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getItemLeaseManager$p(LiK1;)LMc2;

    move-result-object p1

    iget-object v2, p0, LiK1$k;->g:LiK1;

    invoke-static {v2}, LiK1;->access$getBird$p(LiK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {p1, v0, v1}, LMc2;->f(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    goto :goto_2

    :cond_1
    iget-object p1, p0, LiK1$k;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getItemLeaseManager$p(LiK1;)LMc2;

    move-result-object p1

    iget-object v2, p0, LiK1$k;->g:LiK1;

    invoke-static {v2}, LiK1;->access$getBird$p(LiK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {p1, v0, v1}, LMc2;->y(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    :goto_2
    iget-object p1, p0, LiK1$k;->g:LiK1;

    invoke-static {p1}, LiK1;->access$resetUi(LiK1;)V

    return-void
.end method
