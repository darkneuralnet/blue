.class public final LXC$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXC;->dialog(LNy;ZZ)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "Lco/bird/android/model/DialogResponse;",
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
        "Lio/reactivex/H;",
        "Lco/bird/android/model/DialogResponse;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
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
.field public final synthetic g:LXC;

.field public final synthetic h:Z

.field public final synthetic i:LNy;

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(LXC;ZLNy;Z)V
    .locals 0

    iput-object p1, p0, LXC$e;->g:LXC;

    iput-boolean p2, p0, LXC$e;->h:Z

    iput-object p3, p0, LXC$e;->i:LNy;

    iput-boolean p4, p0, LXC$e;->j:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/afollestad/materialdialogs/MaterialDialog;)V
    .locals 0

    invoke-static {p0}, LXC$e;->d(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    return-void
.end method

.method public static synthetic b(Lio/reactivex/H;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, LXC$e;->c(Lio/reactivex/H;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final c(Lio/reactivex/H;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p1, "$emitter"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lco/bird/android/model/DialogResponse;->DISMISS:Lco/bird/android/model/DialogResponse;

    invoke-interface {p0, p1}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lcom/afollestad/materialdialogs/MaterialDialog;)V
    .locals 1

    const-string v0, "$dialogBuilder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->dismiss()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, LXC$e;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/DialogResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LXC$e;->g:LXC;

    invoke-virtual {v0}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/model/DialogResponse;->DISMISS:Lco/bird/android/model/DialogResponse;

    invoke-interface {p1, v0}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v0, p0, LXC$e;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LXC$e;->g:LXC;

    invoke-virtual {v0}, LXC;->dismissDialog()V

    :cond_1
    new-instance v0, LaD;

    invoke-direct {v0, p1}, LaD;-><init>(Lio/reactivex/H;)V

    new-instance v1, Lcom/afollestad/materialdialogs/MaterialDialog;

    iget-object v2, p0, LXC$e;->g:LXC;

    invoke-virtual {v2}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lcom/afollestad/materialdialogs/MaterialDialog;-><init>(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, LXC$e;->i:LNy;

    iget-object v5, p0, LXC$e;->g:LXC;

    invoke-virtual {v5}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v5

    invoke-virtual {v2, v5}, LNy;->title(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    invoke-static {v1, v3, v2, v5, v3}, Lcom/afollestad/materialdialogs/MaterialDialog;->title$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v6

    const/4 v7, 0x0

    iget-object v1, p0, LXC$e;->i:LNy;

    iget-object v2, p0, LXC$e;->g:LXC;

    invoke-virtual {v2}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    invoke-virtual {v1, v2}, LNy;->message(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lcom/afollestad/materialdialogs/MaterialDialog;->message$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v1

    invoke-virtual {v1}, Lcom/afollestad/materialdialogs/MaterialDialog;->noAutoDismiss()Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v1

    iget-boolean v2, p0, LXC$e;->h:Z

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelable(Z)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v1

    iget-object v2, p0, LXC$e;->i:LNy;

    invoke-virtual {v2}, LNy;->a()Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, LXC$e;->g:LXC;

    invoke-virtual {v3}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v3

    invoke-static {v2, v3}, LsD;->access$getStringOrNull(Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    const/4 v7, 0x0

    new-instance v9, LXC$e$a;

    invoke-direct {v9, p1}, LXC$e$a;-><init>(Lio/reactivex/H;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v6, v1

    invoke-static/range {v6 .. v11}, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    :cond_2
    iget-object v2, p0, LXC$e;->i:LNy;

    invoke-virtual {v2}, LNy;->getNegativeText()Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, LXC$e;->g:LXC;

    invoke-virtual {v3}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v3

    invoke-static {v2, v3}, LsD;->access$getStringOrNull(Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    const/4 v7, 0x0

    new-instance v9, LXC$e$b;

    invoke-direct {v9, p1}, LXC$e$b;-><init>(Lio/reactivex/H;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v6, v1

    invoke-static/range {v6 .. v11}, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    :cond_3
    iget-object v2, p0, LXC$e;->g:LXC;

    invoke-static {v2, v1}, LXC;->access$setCurrentDialog$p(LXC;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-virtual {v1}, Lcom/afollestad/materialdialogs/MaterialDialog;->show()V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-boolean v2, p0, LXC$e;->j:Z

    iget-object v3, p0, LXC$e;->g:LXC;

    new-instance v6, LbD;

    invoke-direct {v6, v1}, LbD;-><init>(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-interface {p1, v6}, Lio/reactivex/H;->a(Lio/reactivex/functions/f;)V

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz v2, :cond_4

    invoke-virtual {v3}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v5, v4}, Landroid/view/View;->performHapticFeedback(II)Z

    :cond_4
    return-void
.end method
