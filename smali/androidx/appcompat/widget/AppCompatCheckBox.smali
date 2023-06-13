.class public Landroidx/appcompat/widget/AppCompatCheckBox;
.super Landroid/widget/CheckBox;
.source "SourceFile"

# interfaces
.implements La56;


# instance fields
.field public final b:Lci;

.field public final c:LZh;

.field public final d:LCi;

.field public e:Lqi;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lvf4;->checkboxStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, LW46;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lp36;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lci;

    invoke-direct {p1, p0}, Lci;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->b:Lci;

    invoke-virtual {p1, p2, p3}, Lci;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, LZh;

    invoke-direct {p1, p0}, LZh;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->c:LZh;

    invoke-virtual {p1, p2, p3}, LZh;->e(Landroid/util/AttributeSet;I)V

    new-instance p1, LCi;

    invoke-direct {p1, p0}, LCi;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    invoke-virtual {p1, p2, p3}, LCi;->m(Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->c()Lqi;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lqi;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->b:Lci;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lci;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Lqi;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->e:Lqi;

    if-nez v0, :cond_0

    new-instance v0, Lqi;

    invoke-direct {v0, p0}, Lqi;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->e:Lqi;

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->e:Lqi;

    return-object v0
.end method

.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->c:LZh;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZh;->b()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LCi;->b()V

    :cond_1
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .locals 2

    invoke-super {p0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->b:Lci;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lci;->b(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->c()Lqi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqi;->d(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->c:LZh;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LZh;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->c:LZh;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LZh;->g(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lvi;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->b:Lci;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lci;->e()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LCi;->p()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LCi;->p()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->c()Lqi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqi;->e(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->c()Lqi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqi;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->c:LZh;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LZh;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->c:LZh;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LZh;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->b:Lci;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lci;->f(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->b:Lci;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lci;->g(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    invoke-virtual {v0, p1}, LCi;->w(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    invoke-virtual {p1}, LCi;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    invoke-virtual {v0, p1}, LCi;->x(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->d:LCi;

    invoke-virtual {p1}, LCi;->b()V

    return-void
.end method
