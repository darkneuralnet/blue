.class public final LLT3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKT3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000cR \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LLT3;",
        "LKT3;",
        "",
        "visible",
        "",
        "a",
        "",
        "text",
        "b",
        "c",
        "d",
        "Lco/bird/android/widget/PillButton;",
        "Lco/bird/android/widget/PillButton;",
        "pillButton",
        "Lio/reactivex/Observable;",
        "Lio/reactivex/Observable;",
        "e",
        "()Lio/reactivex/Observable;",
        "pillButtonClicks",
        "<init>",
        "(Lco/bird/android/widget/PillButton;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPillButtonUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillButtonUi.kt\nco/bird/android/app/feature/pill/PillButtonUiImpl\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,37:1\n262#2,2:38\n*S KotlinDebug\n*F\n+ 1 PillButtonUi.kt\nco/bird/android/app/feature/pill/PillButtonUiImpl\n*L\n22#1:38,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/widget/PillButton;

.field public final b:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/widget/PillButton;)V
    .locals 4

    const-string v0, "pillButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLT3;->a:Lco/bird/android/widget/PillButton;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, LLT3;->b:Lio/reactivex/Observable;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, LLT3;->a:Lco/bird/android/widget/PillButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LLT3;->a:Lco/bird/android/widget/PillButton;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PillButton;->setMainTitleText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LLT3;->a:Lco/bird/android/widget/PillButton;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PillButton;->setSecondaryTitleText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, LLT3;->a:Lco/bird/android/widget/PillButton;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PillButton;->setSecondaryTextVisible(Z)V

    return-void
.end method

.method public e()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LLT3;->b:Lio/reactivex/Observable;

    return-object v0
.end method
