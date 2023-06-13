.class public final Lcom/facebook/share/widget/DeviceShareButton;
.super Lcom/facebook/FacebookButtonBase;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public j:Lcom/facebook/share/model/ShareContent;

.field public k:I

.field public l:Z

.field public m:La31;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/share/widget/DeviceShareButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/share/widget/DeviceShareButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    const/4 v4, 0x0

    const-string v5, "fb_device_share_button_create"

    const-string v6, "fb_device_share_button_did_tap"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/FacebookButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/facebook/share/widget/DeviceShareButton;->k:I

    iput-boolean p1, p0, Lcom/facebook/share/widget/DeviceShareButton;->l:Z

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/facebook/share/widget/DeviceShareButton;->m:La31;

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/share/widget/DeviceShareButton;->g()I

    move-result p2

    :goto_0
    iput p2, p0, Lcom/facebook/share/widget/DeviceShareButton;->k:I

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/DeviceShareButton;->z(Z)V

    return-void
.end method

.method public static synthetic t(Lcom/facebook/share/widget/DeviceShareButton;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/FacebookButtonBase;->d(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/facebook/share/widget/DeviceShareButton;)La31;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/widget/DeviceShareButton;->w()La31;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/FacebookButtonBase;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {p0}, Lcom/facebook/share/widget/DeviceShareButton;->y()Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/FacebookButtonBase;->r(Landroid/view/View$OnClickListener;)V

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

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/share/widget/DeviceShareButton;->l:Z

    return-void
.end method

.method public setShareContent(Lcom/facebook/share/model/ShareContent;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/widget/DeviceShareButton;->j:Lcom/facebook/share/model/ShareContent;

    iget-boolean p1, p0, Lcom/facebook/share/widget/DeviceShareButton;->l:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/widget/DeviceShareButton;->v()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/DeviceShareButton;->z(Z)V

    :cond_0
    return-void
.end method

.method public final v()Z
    .locals 2

    new-instance v0, La31;

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->f()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, La31;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lcom/facebook/share/widget/DeviceShareButton;->x()Lcom/facebook/share/model/ShareContent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljj1;->b(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final w()La31;
    .locals 2

    iget-object v0, p0, Lcom/facebook/share/widget/DeviceShareButton;->m:La31;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->i()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, La31;

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->i()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-direct {v0, v1}, La31;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Lcom/facebook/share/widget/DeviceShareButton;->m:La31;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->j()Landroid/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, La31;

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->j()Landroid/app/Fragment;

    move-result-object v1

    invoke-direct {v0, v1}, La31;-><init>(Landroid/app/Fragment;)V

    iput-object v0, p0, Lcom/facebook/share/widget/DeviceShareButton;->m:La31;

    goto :goto_0

    :cond_2
    new-instance v0, La31;

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->f()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, La31;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/facebook/share/widget/DeviceShareButton;->m:La31;

    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/DeviceShareButton;->m:La31;

    return-object v0
.end method

.method public x()Lcom/facebook/share/model/ShareContent;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/widget/DeviceShareButton;->j:Lcom/facebook/share/model/ShareContent;

    return-object v0
.end method

.method public y()Landroid/view/View$OnClickListener;
    .locals 1

    new-instance v0, Lcom/facebook/share/widget/DeviceShareButton$a;

    invoke-direct {v0, p0}, Lcom/facebook/share/widget/DeviceShareButton$a;-><init>(Lcom/facebook/share/widget/DeviceShareButton;)V

    return-object v0
.end method

.method public final z(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/DeviceShareButton;->setEnabled(Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/share/widget/DeviceShareButton;->l:Z

    return-void
.end method
