.class public final LdD3$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdD3;->onResume()V
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
        "Lco/bird/android/model/wire/WireBird;",
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
        "Lco/bird/android/model/wire/WireBird;",
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
.field public final synthetic g:LdD3;


# direct methods
.method public constructor <init>(LdD3;)V
    .locals 0

    iput-object p1, p0, LdD3$d;->g:LdD3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LdD3$d;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LdD3$d;->g:LdD3;

    invoke-static {p1}, LdD3;->access$getFinishedUnpairingBird$p(LdD3;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lco/bird/android/navigator/MyBirdsResult$a;->b:Lco/bird/android/navigator/MyBirdsResult$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/navigator/MyBirdsResult$a;->c:Lco/bird/android/navigator/MyBirdsResult$a;

    :goto_0
    iget-object v0, p0, LdD3$d;->g:LdD3;

    invoke-static {v0}, LdD3;->access$getNavigator$p(LdD3;)Le13;

    move-result-object v0

    new-instance v1, Lco/bird/android/navigator/MyBirdsResult;

    invoke-direct {v1, p1}, Lco/bird/android/navigator/MyBirdsResult;-><init>(Lco/bird/android/navigator/MyBirdsResult$a;)V

    invoke-static {v1}, LX52;->a(Lco/bird/android/navigator/ActivityResult;)Landroid/content/Intent;

    move-result-object p1

    const/4 v1, -0x1

    invoke-interface {v0, v1, p1}, Le13;->e4(ILandroid/content/Intent;)V

    :cond_1
    iget-object p1, p0, LdD3$d;->g:LdD3;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LdD3;->access$setFinishedUnpairingBird$p(LdD3;Z)V

    return-void
.end method
