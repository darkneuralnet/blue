.class public final Lcom/facebook/share/widget/ShareButton;
.super Lcom/facebook/share/widget/ShareButtonBase;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "fb_share_button_create"

    const-string v5, "fb_share_button_did_tap"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/share/widget/ShareButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    const/4 v3, 0x0

    const-string v4, "fb_share_button_create"

    const-string v5, "fb_share_button_did_tap"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/share/widget/ShareButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const-string v4, "fb_share_button_create"

    const-string v5, "fb_share_button_did_tap"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/share/widget/ShareButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/share/widget/ShareButtonBase;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lvg4;->com_facebook_button_icon:I

    invoke-static {p1, p2}, Lvi;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p2, p2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public g()I
    .locals 1

    sget-object v0, LM80$c;->d:LM80$c;

    invoke-virtual {v0}, LM80$c;->a()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    sget v0, LHl4;->com_facebook_button_share:I

    return v0
.end method

.method public v()Ljj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljj1<",
            "Lcom/facebook/share/model/ShareContent;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->i()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, LKy5;

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->i()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->w()I

    move-result v2

    invoke-direct {v0, v1, v2}, LKy5;-><init>(Landroidx/fragment/app/Fragment;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->j()Landroid/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, LKy5;

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->j()Landroid/app/Fragment;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->w()I

    move-result v2

    invoke-direct {v0, v1, v2}, LKy5;-><init>(Landroid/app/Fragment;I)V

    goto :goto_0

    :cond_1
    new-instance v0, LKy5;

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->f()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->w()I

    move-result v2

    invoke-direct {v0, v1, v2}, LKy5;-><init>(Landroid/app/Activity;I)V

    :goto_0
    return-object v0
.end method
