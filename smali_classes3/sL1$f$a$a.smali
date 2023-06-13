.class public final LsL1$f$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LsL1$f$a;->invoke(Ljava/lang/String;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LEL1;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LEL1;",
        "kotlin.jvm.PlatformType",
        "result",
        "",
        "a",
        "(LEL1;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LsL1;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LsL1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LsL1$f$a$a;->g:LsL1;

    iput-object p2, p0, LsL1$f$a$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LEL1;)V
    .locals 9

    iget-object v0, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {v0}, LsL1;->access$isPostRide$p(LsL1;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {v0}, LsL1;->access$getHelmetSelfieManager$p(LsL1;)LBL1;

    move-result-object v0

    iget-object v2, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {v2}, LsL1;->access$getBird$p(LsL1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "bird"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_0
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, LBL1;->e(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "received result for helmet selfie: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, LEL1;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LEL1;->g()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v3, p0, LsL1$f$a$a;->g:LsL1;

    const-string v4, "selfie_success"

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-object v8, p0, LsL1$f$a$a;->h:Ljava/lang/String;

    move-object v5, p1

    invoke-static/range {v3 .. v8}, LsL1;->access$trackResolution(LsL1;Ljava/lang/String;LEL1;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    iget-object v0, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {v0}, LsL1;->access$getHasSubmittedOrSkipped$p(LsL1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p1}, LEL1;->b()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_2
    if-lez v2, :cond_3

    iget-object p1, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {p1}, LsL1;->access$handleCouponEarned(LsL1;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {p1}, LsL1;->access$getNavigator$p(LsL1;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Le13;->b1(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {v0}, LsL1;->access$getUi$p(LsL1;)LAL1;

    move-result-object v0

    iget-object v2, p0, LsL1$f$a$a;->g:LsL1;

    invoke-static {v2}, LsL1;->access$getCanSkip(LsL1;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, LAL1;->Rl(Landroid/net/Uri;Z)V

    iget-object v0, p0, LsL1$f$a$a;->g:LsL1;

    new-instance v1, Ljava/lang/Throwable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Helmet selfie was not detected on head in call to API: ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, LsL1;->access$trackError(LsL1;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEL1;

    invoke-virtual {p0, p1}, LsL1$f$a$a;->a(LEL1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
