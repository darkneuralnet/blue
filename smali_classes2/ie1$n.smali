.class public final Lie1$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie1;->M(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie1$n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/SetupIntentStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/SetupIntentStatus;",
        "kotlin.jvm.PlatformType",
        "setupIntentStatus",
        "",
        "a",
        "(Lco/bird/android/model/SetupIntentStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lie1;


# direct methods
.method public constructor <init>(Lie1;)V
    .locals 0

    iput-object p1, p0, Lie1$n;->g:Lie1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/SetupIntentStatus;)V
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lie1$n$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_0
    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-eq v1, v0, :cond_3

    const/4 v0, 0x4

    if-eq v1, v0, :cond_3

    const/4 v0, 0x5

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lie1$n;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getUi$p(Lie1;)Lpe1;

    move-result-object v0

    sget v1, Lnl4;->payment_error_title:I

    invoke-interface {v0, v1}, LaM5;->error(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lie1$n;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getSetupIntentManager$p(Lie1;)Lpx5;

    move-result-object v0

    iget-object v1, p0, Lie1$n;->g:Lie1;

    invoke-static {v1}, Lie1;->access$getActivity$p(Lie1;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-interface {v0, v1}, Lpx5;->c(Landroidx/appcompat/app/AppCompatActivity;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lie1$n;->g:Lie1;

    invoke-static {v1}, Lie1;->access$getActivity$p(Lie1;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->setResult(I)V

    iget-object v0, p0, Lie1$n;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getActivity$p(Lie1;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_3
    :goto_1
    sget-object v0, Lco/bird/android/model/SetupIntentStatus;->COMPLETE:Lco/bird/android/model/SetupIntentStatus;

    if-eq p1, v0, :cond_4

    sget-object v0, Lco/bird/android/model/SetupIntentStatus;->REQUIRES_AUTHENTICATION:Lco/bird/android/model/SetupIntentStatus;

    if-eq p1, v0, :cond_4

    iget-object p1, p0, Lie1$n;->g:Lie1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lie1;->access$setUpdating$p(Lie1;Z)V

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/SetupIntentStatus;

    invoke-virtual {p0, p1}, Lie1$n;->a(Lco/bird/android/model/SetupIntentStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
