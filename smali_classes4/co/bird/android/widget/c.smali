.class public final Lco/bird/android/widget/c;
.super Lcom/google/android/material/bottomsheet/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/c$a;,
        Lco/bird/android/widget/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u0016B\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0008\u0010\u000e\u001a\u00020\u000cH\u0016J\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\"\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00100\u00100\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001d"
    }
    d2 = {
        "Lco/bird/android/widget/c;",
        "Lcom/google/android/material/bottomsheet/b;",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "Landroid/content/DialogInterface;",
        "dialog",
        "",
        "onDismiss",
        "onPause",
        "Lio/reactivex/p;",
        "Lco/bird/android/widget/c$b;",
        "B9",
        "which",
        "D9",
        "Lio/reactivex/subjects/c;",
        "kotlin.jvm.PlatformType",
        "b",
        "Lio/reactivex/subjects/c;",
        "buttonSelection",
        "<init>",
        "()V",
        "c",
        "a",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:Lco/bird/android/widget/c$a;


# instance fields
.field public final b:Lio/reactivex/subjects/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/c<",
            "Lco/bird/android/widget/c$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/widget/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/c;->c:Lco/bird/android/widget/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/b;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/c;->k0()Lio/reactivex/subjects/c;

    move-result-object v0

    const-string v1, "create<WhichButton>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/c;->b:Lio/reactivex/subjects/c;

    return-void
.end method

.method public static synthetic A9(Lco/bird/android/widget/c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/c;->G9(Lco/bird/android/widget/c;Landroid/view/View;)V

    return-void
.end method

.method public static final E9(Lco/bird/android/widget/c;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/b;->dismiss()V

    return-void
.end method

.method public static final G9(Lco/bird/android/widget/c;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lco/bird/android/widget/c$b;->b:Lco/bird/android/widget/c$b;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/c;->D9(Lco/bird/android/widget/c$b;)V

    return-void
.end method

.method public static final I9(Lco/bird/android/widget/c;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lco/bird/android/widget/c$b;->b:Lco/bird/android/widget/c$b;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/c;->D9(Lco/bird/android/widget/c$b;)V

    return-void
.end method

.method public static final J9(Lco/bird/android/widget/c;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lco/bird/android/widget/c$b;->c:Lco/bird/android/widget/c$b;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/c;->D9(Lco/bird/android/widget/c$b;)V

    return-void
.end method

.method public static synthetic N6(Lco/bird/android/widget/c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/c;->I9(Lco/bird/android/widget/c;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a5(Lco/bird/android/widget/c;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/c;->E9(Lco/bird/android/widget/c;)V

    return-void
.end method

.method public static synthetic t8(Lco/bird/android/widget/c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/c;->J9(Lco/bird/android/widget/c;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final B9()Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Lco/bird/android/widget/c$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/widget/c;->b:Lio/reactivex/subjects/c;

    return-object v0
.end method

.method public final D9(Lco/bird/android/widget/c$b;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/c;->b:Lio/reactivex/subjects/c;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/c;->onSuccess(Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, LuZ;

    invoke-direct {v0, p0}, LuZ;-><init>(Lco/bird/android/widget/c;)V

    const-wide/16 v1, 0xfa

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "inflater"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v3, "bottom_modal_sheet_model"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/BottomModalSheetModel;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v1, Lco/bird/android/widget/BottomModalSheetModel;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1fff

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, Lco/bird/android/widget/BottomModalSheetModel;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/widget/BottomModalSheetLayout$a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->b()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "inflater.context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/widget/BottomModalSheetLayout;

    if-eqz p2, :cond_2

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->o()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lco/bird/android/widget/BottomModalSheetLayout;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->n()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lco/bird/android/widget/BottomModalSheetLayout;->setTitle(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->m()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v3, v4}, Lco/bird/android/widget/BottomModalSheetLayout;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_5
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->c()Lco/bird/android/widget/BottomModalSheetLayout$a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lco/bird/android/widget/BottomModalSheetLayout;->setButtonMode(Lco/bird/android/widget/BottomModalSheetLayout$a;)V

    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->g()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lco/bird/android/widget/BottomModalSheetLayout;->setPrimaryButtonText(Ljava/lang/CharSequence;)V

    sget v4, Lzi4;->primaryButtonSingle:I

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    new-instance v5, LrZ;

    invoke-direct {v5, v0}, LrZ;-><init>(Lco/bird/android/widget/c;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v4, Lzi4;->primaryButtonDouble:I

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    new-instance v5, LsZ;

    invoke-direct {v5, v0}, LsZ;-><init>(Lco/bird/android/widget/c;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->j()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lco/bird/android/widget/BottomModalSheetLayout;->setSecondaryButtonText(Ljava/lang/CharSequence;)V

    sget v2, Lzi4;->secondaryButton:I

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    new-instance v4, LtZ;

    invoke-direct {v4, v0}, LtZ;-><init>(Lco/bird/android/widget/c;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->h()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lco/bird/android/widget/BottomModalSheetLayout;->setPrimaryButtonBackgroundDrawable(I)V

    :cond_8
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->l()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lco/bird/android/widget/BottomModalSheetLayout;->setSecondaryButtonTextColor(I)V

    :cond_9
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->k()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lco/bird/android/widget/BottomModalSheetLayout;->setSecondaryButtonBackgroundDrawable(I)V

    :cond_a
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->i()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lco/bird/android/widget/BottomModalSheetLayout;->setPrimaryButtonTextColor(I)V

    :cond_b
    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->e()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lco/bird/android/widget/BottomModalSheetLayout;->setIcon(Ljava/lang/Integer;)V

    invoke-virtual {v1}, Lco/bird/android/widget/BottomModalSheetModel;->d()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/c;->setCancelable(Z)V

    :cond_c
    return-object v3
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/widget/c;->b:Lio/reactivex/subjects/c;

    invoke-virtual {p1}, Lio/reactivex/subjects/c;->l0()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/c;->b:Lio/reactivex/subjects/c;

    invoke-virtual {p1}, Lio/reactivex/subjects/c;->onComplete()V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/b;->dismiss()V

    return-void
.end method
