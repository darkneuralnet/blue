.class public final LXC$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXC;->agreementDialog(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)Lio/reactivex/F;
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

.field public final synthetic i:Ljava/lang/CharSequence;

.field public final synthetic j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:Ljava/lang/CharSequence;

.field public final synthetic l:Ljava/lang/Integer;

.field public final synthetic m:Ljava/lang/Integer;

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(LXC;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Integer;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXC;",
            "Z",
            "Ljava/lang/CharSequence;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z)V"
        }
    .end annotation

    iput-object p1, p0, LXC$b;->g:LXC;

    iput-boolean p2, p0, LXC$b;->h:Z

    iput-object p3, p0, LXC$b;->i:Ljava/lang/CharSequence;

    iput-object p4, p0, LXC$b;->j:Ljava/util/List;

    iput-object p5, p0, LXC$b;->k:Ljava/lang/CharSequence;

    iput-object p6, p0, LXC$b;->l:Ljava/lang/Integer;

    iput-object p7, p0, LXC$b;->m:Ljava/lang/Integer;

    iput-boolean p8, p0, LXC$b;->n:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lio/reactivex/H;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, LXC$b;->c(Lio/reactivex/H;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-static {p0}, LXC$b;->d(Lkotlin/jvm/internal/Ref$ObjectRef;)V

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

.method public static final d(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 2

    const-string v0, "$dialogBuilder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/afollestad/materialdialogs/MaterialDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->dismiss()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, LXC$b;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/DialogResponse;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "emitter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LXC$b;->g:LXC;

    invoke-virtual {v2}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lco/bird/android/model/DialogResponse;->DISMISS:Lco/bird/android/model/DialogResponse;

    invoke-interface {v1, v2}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v2, v0, LXC$b;->h:Z

    if-eqz v2, :cond_1

    iget-object v2, v0, LXC$b;->g:LXC;

    invoke-static {v2}, LXC;->access$getDialog$p(LXC;)Landroid/content/DialogInterface;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/content/DialogInterface;->dismiss()V

    :cond_1
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v3, Lcom/afollestad/materialdialogs/MaterialDialog;

    iget-object v4, v0, LXC$b;->g:LXC;

    invoke-virtual {v4}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v3, v4, v5, v6, v5}, Lcom/afollestad/materialdialogs/MaterialDialog;-><init>(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v4, v0, LXC$b;->i:Ljava/lang/CharSequence;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x1

    invoke-static {v3, v5, v4, v7, v5}, Lcom/afollestad/materialdialogs/MaterialDialog;->title$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v3

    invoke-virtual {v3}, Lcom/afollestad/materialdialogs/MaterialDialog;->noAutoDismiss()Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v3

    iget-boolean v4, v0, LXC$b;->h:Z

    invoke-virtual {v3, v4}, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelable(Z)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v8

    const/4 v9, 0x0

    iget-object v10, v0, LXC$b;->j:Ljava/util/List;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    sget-object v15, LXC$b$c;->g:LXC$b$c;

    const/16 v16, 0x3d

    const/16 v17, 0x0

    invoke-static/range {v8 .. v17}, Lcom/afollestad/materialdialogs/list/DialogMultiChoiceExtKt;->listItemsMultiChoice$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[I[IZZLkotlin/jvm/functions/Function3;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v3

    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v3, v0, LXC$b;->k:Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v7

    if-eqz v3, :cond_2

    iget-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v8, v3

    check-cast v8, Lcom/afollestad/materialdialogs/MaterialDialog;

    const/4 v9, 0x0

    iget-object v10, v0, LXC$b;->k:Ljava/lang/CharSequence;

    const/4 v11, 0x0

    const/4 v12, 0x5

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lcom/afollestad/materialdialogs/MaterialDialog;->message$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    :cond_2
    new-instance v3, LYC;

    invoke-direct {v3, v1}, LYC;-><init>(Lio/reactivex/H;)V

    iget-object v4, v0, LXC$b;->l:Ljava/lang/Integer;

    iget-object v5, v0, LXC$b;->g:LXC;

    invoke-virtual {v5}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v5

    invoke-static {v4, v5}, LsD;->access$getStringOrNull(Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_3

    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Lcom/afollestad/materialdialogs/MaterialDialog;

    const/4 v9, 0x0

    new-instance v11, LXC$b$a;

    invoke-direct {v11, v1}, LXC$b$a;-><init>(Lio/reactivex/H;)V

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v4

    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_3
    iget-object v4, v0, LXC$b;->m:Ljava/lang/Integer;

    iget-object v5, v0, LXC$b;->g:LXC;

    invoke-virtual {v5}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v5

    invoke-static {v4, v5}, LsD;->access$getStringOrNull(Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_4

    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Lcom/afollestad/materialdialogs/MaterialDialog;

    const/4 v9, 0x0

    new-instance v11, LXC$b$b;

    invoke-direct {v11, v1}, LXC$b$b;-><init>(Lio/reactivex/H;)V

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v4

    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_4
    iget-object v4, v0, LXC$b;->g:LXC;

    iget-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v4, v5}, LXC;->access$setCurrentDialog$p(LXC;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v4}, Lcom/afollestad/materialdialogs/MaterialDialog;->show()V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-boolean v4, v0, LXC$b;->n:Z

    iget-object v5, v0, LXC$b;->g:LXC;

    new-instance v8, LZC;

    invoke-direct {v8, v2}, LZC;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-interface {v1, v8}, Lio/reactivex/H;->a(Lio/reactivex/functions/f;)V

    iget-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz v4, :cond_5

    invoke-virtual {v5}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v7, v6}, Landroid/view/View;->performHapticFeedback(II)Z

    :cond_5
    return-void
.end method
