.class public final LDH3;
.super LxE;
.source "SourceFile"

# interfaces
.implements LCH3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDH3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u0016J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u0016R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "LDH3;",
        "LxE;",
        "LCH3;",
        "",
        "Rj",
        "z6",
        "Lio/reactivex/Observable;",
        "u",
        "ma",
        "LI4;",
        "b",
        "LI4;",
        "binding",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LI4;)V",
        "c",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:LDH3$a;

.field public static final d:I


# instance fields
.field public final b:LI4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LDH3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDH3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDH3;->c:LDH3$a;

    const/16 v0, 0x8

    sput v0, LDH3;->d:I

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LI4;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LDH3;->b:LI4;

    return-void
.end method


# virtual methods
.method public Rj()V
    .locals 2

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->d:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v1, "https://static.bird.co/cruiser_street_parking_reminder.json"

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimationFromUrl(Ljava/lang/String;)V

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->d:Lcom/airbnb/lottie/LottieAnimationView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->d:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->y()V

    return-void
.end method

.method public ma()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->c:Landroid/widget/Button;

    const-string v1, "binding.parkingLearnMoreButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lmf5;->a(Landroid/view/View;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public u()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->e:Landroid/widget/Button;

    const-string v1, "binding.parkingNextButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lmf5;->a(Landroid/view/View;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public z6()V
    .locals 3

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->parking_rules_title_moped:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->parking_rules_body_moped:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LDH3;->b:LI4;

    iget-object v0, v0, LI4;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->parking_rules_no_longer_charged:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
