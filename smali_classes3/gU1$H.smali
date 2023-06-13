.class public final LgU1$H;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgU1;->oc(Ljava/lang/String;Lco/bird/android/core/mvp/BaseActivity;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/r<",
        "Lorg/joda/time/DateTime;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/r;",
        "Lorg/joda/time/DateTime;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/r;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    iput-object p1, p0, LgU1$H;->g:Ljava/lang/String;

    iput-object p2, p0, LgU1$H;->h:Lco/bird/android/core/mvp/BaseActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LgU1$H;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lio/reactivex/r;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LgU1$H;->e(Lio/reactivex/r;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lio/reactivex/r;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, LgU1$H;->d(Lio/reactivex/r;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final d(Lio/reactivex/r;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p1, "$emitter"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/reactivex/r;->onComplete()V

    return-void
.end method

.method public static final e(Lio/reactivex/r;Landroid/view/View;)V
    .locals 0

    const-string p1, "$emitter"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/reactivex/r;->onComplete()V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/r;

    invoke-virtual {p0, p1}, LgU1$H;->invoke(Lio/reactivex/r;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/r;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/r<",
            "Lorg/joda/time/DateTime;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/material/datepicker/c$g;->c()Lcom/google/android/material/datepicker/c$g;

    move-result-object v0

    iget-object v1, p0, LgU1$H;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/c$g;->f(Ljava/lang/CharSequence;)Lcom/google/android/material/datepicker/c$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/c$g;->a()Lcom/google/android/material/datepicker/c;

    move-result-object v0

    const-string v1, "datePicker()\n        .se\u2026tleText)\n        .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LiU1;

    invoke-direct {v1, p1}, LiU1;-><init>(Lio/reactivex/r;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/c;->G9(Landroid/content/DialogInterface$OnCancelListener;)Z

    new-instance v1, LjU1;

    invoke-direct {v1, p1}, LjU1;-><init>(Lio/reactivex/r;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/c;->I9(Landroid/view/View$OnClickListener;)Z

    new-instance v1, LgU1$H$a;

    invoke-direct {v1, p1}, LgU1$H$a;-><init>(Lio/reactivex/r;)V

    new-instance p1, LkU1;

    invoke-direct {p1, v1}, LkU1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/c;->J9(LMM2;)Z

    iget-object p1, p0, LgU1$H;->h:Lco/bird/android/core/mvp/BaseActivity;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v1, "MaterialDatePicker"

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
