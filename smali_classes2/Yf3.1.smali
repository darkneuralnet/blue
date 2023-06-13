.class public final LYf3;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0016"
    }
    d2 = {
        "LYf3;",
        "LxE;",
        "",
        "point",
        "",
        "Pl",
        "Lio/reactivex/Observable;",
        "Ql",
        "Lco/bird/android/widget/CallToActionLayout;",
        "b",
        "Lco/bird/android/widget/CallToActionLayout;",
        "callToActionLayout",
        "Landroid/widget/LinearLayout;",
        "c",
        "Landroid/widget/LinearLayout;",
        "productPoints",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Landroid/view/View;",
        "rootView",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V",
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
.field public final b:Lco/bird/android/widget/CallToActionLayout;

.field public final c:Landroid/widget/LinearLayout;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    sget p1, LVg4;->callToActionLayout:I

    invoke-static {p2, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lco/bird/android/widget/CallToActionLayout;

    iput-object p1, p0, LYf3;->b:Lco/bird/android/widget/CallToActionLayout;

    sget p1, LVg4;->productPoints:I

    invoke-static {p2, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, LYf3;->c:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public final Pl(Ljava/lang/String;)V
    .locals 3

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/longterm/LongTermSetupProductPointView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/longterm/LongTermSetupProductPointView;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/longterm/LongTermSetupProductPointView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LYf3;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final Ql()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYf3;->b:Lco/bird/android/widget/CallToActionLayout;

    invoke-virtual {v0}, Lco/bird/android/widget/CallToActionLayout;->b()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
