.class public abstract Lcom/facebook/share/widget/ShareButtonBase;
.super Lcom/facebook/FacebookButtonBase;
.source "SourceFile"


# instance fields
.field public j:Lcom/facebook/share/model/ShareContent;

.field public k:I

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/FacebookButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/facebook/share/widget/ShareButtonBase;->k:I

    iput-boolean p1, p0, Lcom/facebook/share/widget/ShareButtonBase;->l:Z

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->g()I

    move-result p2

    :goto_0
    iput p2, p0, Lcom/facebook/share/widget/ShareButtonBase;->k:I

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/ShareButtonBase;->z(Z)V

    return-void
.end method

.method public static synthetic t(Lcom/facebook/share/widget/ShareButtonBase;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/FacebookButtonBase;->d(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/FacebookButtonBase;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->y()Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/FacebookButtonBase;->r(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/share/widget/ShareButtonBase;->l:Z

    return-void
.end method

.method public setShareContent(Lcom/facebook/share/model/ShareContent;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/widget/ShareButtonBase;->j:Lcom/facebook/share/model/ShareContent;

    iget-boolean p1, p0, Lcom/facebook/share/widget/ShareButtonBase;->l:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->u()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/ShareButtonBase;->z(Z)V

    :cond_0
    return-void
.end method

.method public u()Z
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->v()Ljj1;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->x()Lcom/facebook/share/model/ShareContent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljj1;->b(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public abstract v()Ljj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljj1<",
            "Lcom/facebook/share/model/ShareContent;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public w()I
    .locals 1

    iget v0, p0, Lcom/facebook/share/widget/ShareButtonBase;->k:I

    return v0
.end method

.method public x()Lcom/facebook/share/model/ShareContent;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/widget/ShareButtonBase;->j:Lcom/facebook/share/model/ShareContent;

    return-object v0
.end method

.method public y()Landroid/view/View$OnClickListener;
    .locals 1

    new-instance v0, Lcom/facebook/share/widget/ShareButtonBase$a;

    invoke-direct {v0, p0}, Lcom/facebook/share/widget/ShareButtonBase$a;-><init>(Lcom/facebook/share/widget/ShareButtonBase;)V

    return-object v0
.end method

.method public final z(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/ShareButtonBase;->setEnabled(Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/share/widget/ShareButtonBase;->l:Z

    return-void
.end method
