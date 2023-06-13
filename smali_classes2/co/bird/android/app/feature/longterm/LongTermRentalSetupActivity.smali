.class public final Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;
.super Lco/bird/android/library/flow/FlowActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;",
        "Lco/bird/android/library/flow/FlowActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Lsz2;",
        "G",
        "Lsz2;",
        "w0",
        "()Lsz2;",
        "setCoordinatorFactory",
        "(Lsz2;)V",
        "coordinatorFactory",
        "Lrz2;",
        "H",
        "Lkotlin/Lazy;",
        "t0",
        "()Lrz2;",
        "coordinator",
        "<init>",
        "()V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public G:Lsz2;

.field public final H:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/library/flow/FlowActivity;-><init>()V

    new-instance v0, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$a;-><init>(Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;->H:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public bridge synthetic getCoordinator()LMu1;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;->t0()Lrz2;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, p0}, LH22;->E0(Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;)V

    invoke-super {p0, p1}, Lco/bird/android/library/flow/FlowActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public t0()Lrz2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;->H:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrz2;

    return-object v0
.end method

.method public final w0()Lsz2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;->G:Lsz2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "coordinatorFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
