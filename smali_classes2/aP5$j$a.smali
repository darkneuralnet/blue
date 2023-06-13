.class public final LaP5$j$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaP5$j;->invoke(Lkotlin/Unit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field public final synthetic g:LaP5;


# direct methods
.method public constructor <init>(LaP5;)V
    .locals 0

    iput-object p1, p0, LaP5$j$a;->g:LaP5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LaP5$j$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    iget-object v0, p0, LaP5$j$a;->g:LaP5;

    invoke-static {v0}, LaP5;->access$getContractorManager$p(LaP5;)LjB0;

    move-result-object v0

    iget-object v1, p0, LaP5$j$a;->g:LaP5;

    invoke-static {v1}, LaP5;->access$getNavigator$p(LaP5;)Le13;

    move-result-object v1

    iget-object v2, p0, LaP5$j$a;->g:LaP5;

    invoke-static {v2}, LaP5;->access$getBird$p(LaP5;)Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "bird"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    iget-object v4, p0, LaP5$j$a;->g:LaP5;

    invoke-static {v4}, LaP5;->access$getLocation$p(LaP5;)Landroid/location/Location;

    move-result-object v4

    if-nez v4, :cond_1

    const-string v4, "location"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    const/4 v4, 0x1

    invoke-interface {v0, v1, v2, v3, v4}, LjB0;->c(Le13;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;Z)V

    iget-object v0, p0, LaP5$j$a;->g:LaP5;

    invoke-static {v0}, LaP5;->access$getNavigator$p(LaP5;)Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->e3()V

    return-void
.end method
