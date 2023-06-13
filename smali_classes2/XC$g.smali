.class public final LXC$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXC;->dialogWithInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZ)Lio/reactivex/F;
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
        "LH31$b;",
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
        "LH31$b;",
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

.field public final synthetic h:Ljava/lang/Integer;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Z

.field public final synthetic q:Z


# direct methods
.method public constructor <init>(LXC;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    iput-object p1, p0, LXC$g;->g:LXC;

    iput-object p2, p0, LXC$g;->h:Ljava/lang/Integer;

    iput-object p3, p0, LXC$g;->i:Ljava/lang/String;

    iput-object p4, p0, LXC$g;->j:Ljava/lang/String;

    iput-object p5, p0, LXC$g;->k:Ljava/lang/String;

    iput-boolean p6, p0, LXC$g;->l:Z

    iput-object p7, p0, LXC$g;->m:Ljava/lang/String;

    iput-object p8, p0, LXC$g;->n:Ljava/lang/String;

    iput-object p9, p0, LXC$g;->o:Ljava/lang/String;

    iput-boolean p10, p0, LXC$g;->p:Z

    iput-boolean p11, p0, LXC$g;->q:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lio/reactivex/H;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, LXC$g;->d(Lio/reactivex/H;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic b(Lcom/afollestad/materialdialogs/MaterialDialog;)V
    .locals 0

    invoke-static {p0}, LXC$g;->c(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    return-void
.end method

.method public static final c(Lcom/afollestad/materialdialogs/MaterialDialog;)V
    .locals 1

    const-string v0, "$dialog"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->dismiss()V

    return-void
.end method

.method public static final d(Lio/reactivex/H;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p1, "$emitter"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LH31$b$b;->a:LH31$b$b;

    invoke-interface {p0, p1}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, LXC$g;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "LH31$b;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "emitter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LXC$g;->g:LXC;

    invoke-virtual {v2}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, LH31$b$b;->a:LH31$b$b;

    invoke-interface {v1, v2}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v2, v0, LXC$g;->g:LXC;

    invoke-virtual {v2}, LXC;->dismissDialog()V

    iget-object v2, v0, LXC$g;->h:Ljava/lang/Integer;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v9, v2

    goto :goto_0

    :cond_1
    move v9, v3

    :goto_0
    new-instance v2, Lcom/afollestad/materialdialogs/MaterialDialog;

    iget-object v4, v0, LXC$g;->g:LXC;

    invoke-virtual {v4}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v4

    const/4 v15, 0x0

    const/4 v14, 0x2

    invoke-direct {v2, v4, v15, v14, v15}, Lcom/afollestad/materialdialogs/MaterialDialog;-><init>(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v4, v0, LXC$g;->i:Ljava/lang/String;

    invoke-static {v2, v15, v4, v3, v15}, Lcom/afollestad/materialdialogs/MaterialDialog;->title$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v4

    iget-object v5, v0, LXC$g;->j:Ljava/lang/String;

    const/4 v6, 0x0

    iget-object v7, v0, LXC$g;->k:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    iget-boolean v12, v0, LXC$g;->l:Z

    new-instance v13, LXC$g$b;

    invoke-direct {v13, v1}, LXC$g$b;-><init>(Lio/reactivex/H;)V

    const/16 v2, 0x6a

    const/16 v16, 0x0

    move v14, v2

    move-object v2, v15

    move-object/from16 v15, v16

    invoke-static/range {v4 .. v15}, Lcom/afollestad/materialdialogs/input/DialogInputExtKt;->input$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;ILjava/lang/Integer;ZZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v4

    iget-object v5, v0, LXC$g;->m:Ljava/lang/String;

    if-eqz v5, :cond_2

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x5

    const/16 v22, 0x0

    move-object/from16 v17, v4

    move-object/from16 v19, v5

    invoke-static/range {v17 .. v22}, Lcom/afollestad/materialdialogs/MaterialDialog;->message$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    :cond_2
    iget-object v5, v0, LXC$g;->n:Ljava/lang/String;

    if-eqz v5, :cond_3

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x5

    const/16 v22, 0x0

    move-object/from16 v17, v4

    move-object/from16 v19, v5

    invoke-static/range {v17 .. v22}, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    :cond_3
    iget-object v5, v0, LXC$g;->o:Ljava/lang/String;

    if-eqz v5, :cond_4

    const/16 v18, 0x0

    new-instance v6, LXC$g$a;

    invoke-direct {v6, v1}, LXC$g$a;-><init>(Lio/reactivex/H;)V

    const/16 v21, 0x1

    const/16 v22, 0x0

    move-object/from16 v17, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    invoke-static/range {v17 .. v22}, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;

    :cond_4
    iget-object v5, v0, LXC$g;->g:LXC;

    invoke-static {v5, v4}, LXC;->access$setCurrentDialog$p(LXC;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-virtual {v4}, Lcom/afollestad/materialdialogs/MaterialDialog;->show()V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-boolean v5, v0, LXC$g;->p:Z

    iget-boolean v6, v0, LXC$g;->q:Z

    iget-object v7, v0, LXC$g;->g:LXC;

    if-nez v5, :cond_5

    :try_start_0
    invoke-static {v4}, Lcom/afollestad/materialdialogs/input/DialogInputExtKt;->getInputField(Lcom/afollestad/materialdialogs/MaterialDialog;)Landroid/widget/EditText;

    move-result-object v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v15, v2

    :goto_1
    if-eqz v15, :cond_5

    invoke-virtual {v15}, Landroid/widget/TextView;->getInputType()I

    move-result v2

    const/high16 v5, 0x20000

    or-int/2addr v2, v5

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setInputType(I)V

    const/16 v2, 0x50

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setGravity(I)V

    :cond_5
    new-instance v2, LeD;

    invoke-direct {v2, v4}, LeD;-><init>(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-interface {v1, v2}, Lio/reactivex/H;->a(Lio/reactivex/functions/f;)V

    new-instance v2, LfD;

    invoke-direct {v2, v1}, LfD;-><init>(Lio/reactivex/H;)V

    invoke-virtual {v4, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz v6, :cond_6

    invoke-virtual {v7}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v3, v2}, Landroid/view/View;->performHapticFeedback(II)Z

    :cond_6
    return-void
.end method
