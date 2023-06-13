.class public final LXC$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXC;->birdDialog(LNy;ZZ)Lio/reactivex/F;
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRenderer.kt\nco/bird/android/core/base/ui/BaseRenderer$birdDialog$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1250:1\n1#2:1251\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LXC;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:LNy;


# direct methods
.method public constructor <init>(LXC;ZZLNy;)V
    .locals 0

    iput-object p1, p0, LXC$c;->g:LXC;

    iput-boolean p2, p0, LXC$c;->h:Z

    iput-boolean p3, p0, LXC$c;->i:Z

    iput-object p4, p0, LXC$c;->j:LNy;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, LXC$c;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 24
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

    iget-object v2, v0, LXC$c;->g:LXC;

    invoke-virtual {v2}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lco/bird/android/model/DialogResponse;->DISMISS:Lco/bird/android/model/DialogResponse;

    invoke-interface {v1, v2}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v2, v0, LXC$c;->h:Z

    if-eqz v2, :cond_1

    iget-object v2, v0, LXC$c;->g:LXC;

    invoke-virtual {v2}, LXC;->dismissDialog()V

    :cond_1
    iget-object v3, v0, LXC$c;->g:LXC;

    sget v4, LJj4;->dialog_bird_general:I

    const/4 v5, 0x0

    iget-boolean v8, v0, LXC$c;->h:Z

    iget-boolean v9, v0, LXC$c;->i:Z

    sget v2, LYg4;->title:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    sget v2, LYg4;->message:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iget-object v2, v0, LXC$c;->j:LNy;

    iget-object v12, v0, LXC$c;->g:LXC;

    invoke-virtual {v12}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v12

    invoke-virtual {v2, v12}, LNy;->title(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v12

    iget-object v2, v0, LXC$c;->j:LNy;

    iget-object v13, v0, LXC$c;->g:LXC;

    invoke-virtual {v13}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v13

    invoke-virtual {v2, v13}, LNy;->message(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v13

    sget v14, LYg4;->confirmButton:I

    sget v2, LYg4;->secondaryButton:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iget-object v2, v0, LXC$c;->j:LNy;

    invoke-virtual {v2}, LNy;->a()Ljava/lang/Integer;

    move-result-object v2

    const/16 v16, 0x0

    if-eqz v2, :cond_2

    iget-object v7, v0, LXC$c;->g:LXC;

    invoke-virtual {v7}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v7

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v7, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object/from16 v2, v16

    :goto_0
    iget-object v7, v0, LXC$c;->j:LNy;

    invoke-virtual {v7}, LNy;->getNegativeText()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_3

    iget-object v6, v0, LXC$c;->g:LXC;

    invoke-virtual {v6}, LXC;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v6

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v23, v6

    goto :goto_1

    :cond_3
    move-object/from16 v23, v16

    :goto_1
    new-instance v6, LXC$c$a;

    move-object/from16 v18, v6

    invoke-direct {v6, v1}, LXC$c$a;-><init>(Lio/reactivex/H;)V

    new-instance v6, LXC$c$b;

    move-object/from16 v19, v6

    invoke-direct {v6, v1}, LXC$c$b;-><init>(Lio/reactivex/H;)V

    new-instance v6, LXC$c$c;

    move-object/from16 v20, v6

    invoke-direct {v6, v1}, LXC$c$c;-><init>(Lio/reactivex/H;)V

    new-instance v1, LXC$c$d;

    move-object/from16 v21, v1

    iget-object v6, v0, LXC$c;->g:LXC;

    iget-object v7, v0, LXC$c;->j:LNy;

    invoke-direct {v1, v6, v7}, LXC$c$d;-><init>(LXC;LNy;)V

    const/16 v22, 0x1

    const/4 v1, 0x0

    move-object v6, v1

    const/4 v1, 0x0

    move v7, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v23

    invoke-virtual/range {v3 .. v22}, LXC;->showCustomDialog(ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V

    return-void
.end method
