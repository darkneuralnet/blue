.class public Lcom/google/android/material/datepicker/b$h;
.super LM1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/b;->J9(Landroid/view/View;Lcom/google/android/material/datepicker/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/b;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/b$h;->a:Lcom/google/android/material/datepicker/b;

    invoke-direct {p0}, LM1;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Lp2;)V
    .locals 1

    invoke-super {p0, p1, p2}, LM1;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lp2;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/b$h;->a:Lcom/google/android/material/datepicker/b;

    invoke-static {p1}, Lcom/google/android/material/datepicker/b;->G9(Lcom/google/android/material/datepicker/b;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/b$h;->a:Lcom/google/android/material/datepicker/b;

    sget v0, Lel4;->mtrl_picker_toggle_to_year_selection:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/b$h;->a:Lcom/google/android/material/datepicker/b;

    sget v0, Lel4;->mtrl_picker_toggle_to_day_selection:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Lp2;->s0(Ljava/lang/CharSequence;)V

    return-void
.end method
