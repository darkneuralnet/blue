.class public final LJa1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJa1$a;
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/EditText;

.field public final c:Z

.field public d:Landroidx/emoji2/text/c$f;

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, LJa1;->e:I

    const/4 v0, 0x0

    iput v0, p0, LJa1;->f:I

    iput-object p1, p0, LJa1;->b:Landroid/widget/EditText;

    iput-boolean p2, p0, LJa1;->c:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, LJa1;->g:Z

    return-void
.end method

.method public static c(Landroid/widget/EditText;I)V
    .locals 2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object p0

    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroidx/emoji2/text/c;->r(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    invoke-static {p0, p1, v0}, LEa1;->b(Landroid/text/Spannable;II)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Landroidx/emoji2/text/c$f;
    .locals 2

    iget-object v0, p0, LJa1;->d:Landroidx/emoji2/text/c$f;

    if-nez v0, :cond_0

    new-instance v0, LJa1$a;

    iget-object v1, p0, LJa1;->b:Landroid/widget/EditText;

    invoke-direct {v0, v1}, LJa1$a;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, LJa1;->d:Landroidx/emoji2/text/c$f;

    :cond_0
    iget-object v0, p0, LJa1;->d:Landroidx/emoji2/text/c$f;

    return-object v0
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LJa1;->g:Z

    return v0
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public d(Z)V
    .locals 2

    iget-boolean v0, p0, LJa1;->g:Z

    if-eq v0, p1, :cond_1

    iget-object v0, p0, LJa1;->d:Landroidx/emoji2/text/c$f;

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object v0

    iget-object v1, p0, LJa1;->d:Landroidx/emoji2/text/c$f;

    invoke-virtual {v0, v1}, Landroidx/emoji2/text/c;->w(Landroidx/emoji2/text/c$f;)V

    :cond_0
    iput-boolean p1, p0, LJa1;->g:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, LJa1;->b:Landroid/widget/EditText;

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/emoji2/text/c;->g()I

    move-result v0

    invoke-static {p1, v0}, LJa1;->c(Landroid/widget/EditText;I)V

    :cond_1
    return-void
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LJa1;->g:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LJa1;->c:Z

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/emoji2/text/c;->k()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 6

    iget-object v0, p0, LJa1;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LJa1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-gt p3, p4, :cond_3

    instance-of p3, p1, Landroid/text/Spannable;

    if-eqz p3, :cond_3

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/emoji2/text/c;->g()I

    move-result p3

    if-eqz p3, :cond_2

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 p1, 0x3

    if-eq p3, p1, :cond_2

    goto :goto_0

    :cond_1
    move-object v1, p1

    check-cast v1, Landroid/text/Spannable;

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object v0

    add-int v3, p2, p4

    iget v4, p0, LJa1;->e:I

    iget v5, p0, LJa1;->f:I

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Landroidx/emoji2/text/c;->u(Ljava/lang/CharSequence;IIII)Ljava/lang/CharSequence;

    goto :goto_0

    :cond_2
    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object p1

    invoke-virtual {p0}, LJa1;->a()Landroidx/emoji2/text/c$f;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/emoji2/text/c;->v(Landroidx/emoji2/text/c$f;)V

    :cond_3
    :goto_0
    return-void
.end method
