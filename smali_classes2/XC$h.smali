.class public final LXC$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXC;->selectorDialog(Ljava/util/List;ZLjava/lang/CharSequence;)Lio/reactivex/p;
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
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/r;",
        "",
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
.field public final synthetic g:LXC;

.field public final synthetic h:Ljava/lang/CharSequence;

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(LXC;Ljava/lang/CharSequence;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXC;",
            "Ljava/lang/CharSequence;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, LXC$h;->g:LXC;

    iput-object p2, p0, LXC$h;->h:Ljava/lang/CharSequence;

    iput-object p3, p0, LXC$h;->i:Ljava/util/List;

    iput-boolean p4, p0, LXC$h;->j:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-static {p0}, LXC$h;->c(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    return-void
.end method

.method public static synthetic b(Lio/reactivex/r;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1, p2}, LXC$h;->d(Lio/reactivex/r;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 2

    const-string v0, "$dialog"

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

.method public static final d(Lio/reactivex/r;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p2, "$emitter"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$dialog"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/reactivex/r;->onComplete()V

    iget-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/afollestad/materialdialogs/MaterialDialog;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/r;

    invoke-virtual {p0, p1}, LXC$h;->invoke(Lio/reactivex/r;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/r;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/r<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "emitter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LXC$h;->g:LXC;

    invoke-virtual {v2}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface/range {p1 .. p1}, Lio/reactivex/r;->onComplete()V

    return-void

    :cond_0
    iget-object v2, v0, LXC$h;->g:LXC;

    invoke-virtual {v2}, LXC;->dismissDialog()V

    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v3, Lcom/afollestad/materialdialogs/MaterialDialog;

    iget-object v4, v0, LXC$h;->g:LXC;

    invoke-virtual {v4}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v9, 0x2

    invoke-direct {v3, v4, v5, v9, v5}, Lcom/afollestad/materialdialogs/MaterialDialog;-><init>(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v5, v0, LXC$h;->h:Ljava/lang/CharSequence;

    if-eqz v5, :cond_1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lcom/afollestad/materialdialogs/MaterialDialog;->message$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v3

    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_1
    iget-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v10, v3

    check-cast v10, Lcom/afollestad/materialdialogs/MaterialDialog;

    const/4 v11, 0x0

    iget-object v12, v0, LXC$h;->i:Ljava/util/List;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    new-instance v3, LXC$h$a;

    iget-object v4, v0, LXC$h;->g:LXC;

    invoke-direct {v3, v1, v4}, LXC$h$a;-><init>(Lio/reactivex/r;LXC;)V

    const/16 v17, 0x1d

    const/16 v18, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v10 .. v18}, Lcom/afollestad/materialdialogs/list/DialogSingleChoiceExtKt;->listItemsSingleChoice$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[IIZLkotlin/jvm/functions/Function3;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    iget-object v3, v0, LXC$h;->g:LXC;

    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v3, v4}, LXC;->access$setCurrentDialog$p(LXC;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    iget-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v3}, Lcom/afollestad/materialdialogs/MaterialDialog;->show()V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-boolean v3, v0, LXC$h;->j:Z

    iget-object v4, v0, LXC$h;->g:LXC;

    new-instance v5, LgD;

    invoke-direct {v5, v2}, LgD;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-interface {v1, v5}, Lio/reactivex/r;->a(Lio/reactivex/functions/f;)V

    iget-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Lcom/afollestad/materialdialogs/MaterialDialog;

    new-instance v6, LhD;

    invoke-direct {v6, v1, v2}, LhD;-><init>(Lio/reactivex/r;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz v3, :cond_2

    invoke-virtual {v4}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v9}, Landroid/view/View;->performHapticFeedback(II)Z

    :cond_2
    return-void
.end method
