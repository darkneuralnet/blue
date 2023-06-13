.class Lzendesk/support/guide/ViewArticleActivity$ArticleAttachmentAdapter;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/guide/ViewArticleActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArticleAttachmentAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lzendesk/support/HelpCenterAttachment;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    sget v0, Lyk4;->zs_row_article_attachment:I

    invoke-direct {p0, p1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    instance-of p3, p2, Lzendesk/support/guide/ViewArticleActivity$ArticleAttachmentRow;

    if-eqz p3, :cond_0

    check-cast p2, Lzendesk/support/guide/ViewArticleActivity$ArticleAttachmentRow;

    goto :goto_0

    :cond_0
    new-instance p2, Lzendesk/support/guide/ViewArticleActivity$ArticleAttachmentRow;

    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lzendesk/support/guide/ViewArticleActivity$ArticleAttachmentRow;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-interface {p0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/support/HelpCenterAttachment;

    invoke-virtual {p2, p1}, Lzendesk/support/guide/ViewArticleActivity$ArticleAttachmentRow;->bind(Lzendesk/support/HelpCenterAttachment;)V

    return-object p2
.end method
