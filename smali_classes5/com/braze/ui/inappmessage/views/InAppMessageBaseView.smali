.class public abstract Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements LEO1;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field protected mHasAppliedWindowInsets:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->mHasAppliedWindowInsets:Z

    return-void
.end method

.method public static getAppropriateImageUrl(LKO1;)Ljava/lang/String;
    .locals 4

    invoke-interface {p0}, LKO1;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LjS5;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Local bitmap file does not exist. Using remote url instead. Local path: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-interface {p0}, LKO1;->w()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public applyWindowInsets(LDB6;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->mHasAppliedWindowInsets:Z

    return-void
.end method

.method public abstract getMessageBackgroundObject()Ljava/lang/Object;
.end method

.method public getMessageClickableView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public abstract getMessageIconView()Landroid/widget/TextView;
.end method

.method public abstract getMessageImageView()Landroid/widget/ImageView;
.end method

.method public abstract getMessageTextView()Landroid/widget/TextView;
.end method

.method public hasAppliedWindowInsets()Z
    .locals 1

    iget-boolean v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->mHasAppliedWindowInsets:Z

    return v0
.end method

.method public resetMessageMargins(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    invoke-static {v0}, LWt6;->j(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1}, LWt6;->j(Landroid/view/View;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1}, LWt6;->j(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setMessageBackgroundColor(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageBackgroundObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, LDZ1;->j(Landroid/view/View;I)V

    return-void
.end method

.method public setMessageIcon(Ljava/lang/String;II)V
    .locals 2

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, p1, p2, p3, v1}, LDZ1;->f(Landroid/content/Context;Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_0
    return-void
.end method

.method public setMessageImageView(Landroid/graphics/Bitmap;)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p1, v0}, LDZ1;->g(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V

    return-void
.end method

.method public setMessageTextAlign(Ls06;)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, p1}, LDZ1;->h(Landroid/widget/TextView;Ls06;)V

    return-void
.end method

.method public setMessageTextColor(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getMessageTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, p1}, LDZ1;->i(Landroid/widget/TextView;I)V

    return-void
.end method
