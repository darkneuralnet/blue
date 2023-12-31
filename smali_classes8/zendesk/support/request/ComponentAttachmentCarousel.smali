.class Lzendesk/support/request/ComponentAttachmentCarousel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/b$b;
.implements Lzendesk/support/suas/Listener;
.implements Lzendesk/support/request/RequestViewConversationsDisabled$MenuItemsDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselSelector;,
        Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzendesk/belvedere/b$b;",
        "Lzendesk/support/suas/Listener<",
        "Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;",
        ">;",
        "Lzendesk/support/request/RequestViewConversationsDisabled$MenuItemsDelegate;"
    }
.end annotation


# instance fields
.field private final actionFactory:Lzendesk/support/request/ActionFactory;

.field private final activity:Landroidx/appcompat/app/AppCompatActivity;

.field private attachmentButton:Landroid/view/MenuItem;

.field private final attachmentHelper:Lzendesk/support/request/AttachmentHelper;

.field private attachmentSupportEnabled:Z

.field private final dispatcher:Lzendesk/support/suas/Dispatcher;

.field private final imageStream:Lzendesk/belvedere/b;

.field private final recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private final scrollView:Landroid/widget/ScrollView;

.field private final selector:Lzendesk/support/suas/StateSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzendesk/support/suas/StateSelector<",
            "Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzendesk/support/suas/Dispatcher;Lzendesk/support/request/ActionFactory;Lzendesk/belvedere/b;Landroidx/appcompat/app/AppCompatActivity;Lzendesk/support/request/AttachmentHelper;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentSupportEnabled:Z

    iput-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->dispatcher:Lzendesk/support/suas/Dispatcher;

    iput-object p2, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->actionFactory:Lzendesk/support/request/ActionFactory;

    iput-object p3, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->imageStream:Lzendesk/belvedere/b;

    iput-object p4, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->activity:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p5, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentHelper:Lzendesk/support/request/AttachmentHelper;

    iput-object p6, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    sget p1, LPg4;->request_conversations_disabled_scrollview:I

    invoke-virtual {p4, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->scrollView:Landroid/widget/ScrollView;

    new-instance p1, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselSelector;

    invoke-direct {p1}, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselSelector;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->selector:Lzendesk/support/suas/StateSelector;

    invoke-direct {p0}, Lzendesk/support/request/ComponentAttachmentCarousel;->initImagePicker()V

    return-void
.end method

.method public static synthetic access$000(Lzendesk/support/request/ComponentAttachmentCarousel;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel;->onAddAttachmentsRequested(Z)V

    return-void
.end method

.method public static synthetic access$100(Lzendesk/support/request/ComponentAttachmentCarousel;)Landroid/widget/ScrollView;
    .locals 0

    iget-object p0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->scrollView:Landroid/widget/ScrollView;

    return-object p0
.end method

.method private attachmentButtonVisibility(ZZ)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentButton:Landroid/view/MenuItem;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentButton:Landroid/view/MenuItem;

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method private attachmentCount(I)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentButton:Landroid/view/MenuItem;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lzendesk/support/request/ViewCellAttachmentMenuItem;

    invoke-virtual {v0, p1}, Lzendesk/support/request/ViewCellAttachmentMenuItem;->setBadgeCount(I)V

    :cond_0
    return-void
.end method

.method private initImagePicker()V
    .locals 2

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {v0, p0}, Lzendesk/belvedere/b;->N6(Lzendesk/belvedere/b$b;)V

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Lzendesk/belvedere/b;->A9()Lzendesk/belvedere/KeyboardHelper;

    move-result-object v0

    invoke-virtual {v0}, Lzendesk/belvedere/KeyboardHelper;->k()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->scrollView:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_0
    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Lzendesk/belvedere/b;->ea()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->scrollView:Landroid/widget/ScrollView;

    new-instance v1, Lzendesk/support/request/ComponentAttachmentCarousel$1;

    invoke-direct {v1, p0}, Lzendesk/support/request/ComponentAttachmentCarousel$1;-><init>(Lzendesk/support/request/ComponentAttachmentCarousel;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method private onAddAttachmentsRequested(Z)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Lzendesk/belvedere/b;->D9()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentHelper:Lzendesk/support/request/AttachmentHelper;

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->activity:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {p1, v0}, Lzendesk/support/request/AttachmentHelper;->showImagePicker(Landroidx/appcompat/app/AppCompatActivity;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {p1}, Lzendesk/belvedere/b;->dismiss()V

    :cond_1
    :goto_0
    return-void
.end method

.method private scroll(I)V
    .locals 2

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->scrollView:Landroid/widget/ScrollView;

    new-instance v1, Lzendesk/support/request/ComponentAttachmentCarousel$2;

    invoke-direct {v1, p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel$2;-><init>(Lzendesk/support/request/ComponentAttachmentCarousel;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public getSelector()Lzendesk/support/suas/StateSelector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzendesk/support/suas/StateSelector<",
            "Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->selector:Lzendesk/support/suas/StateSelector;

    return-object v0
.end method

.method public onDismissed()V
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->scrollView:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const/16 v0, 0x21

    invoke-direct {p0, v0}, Lzendesk/support/request/ComponentAttachmentCarousel;->scroll(I)V

    return-void
.end method

.method public onMediaDeselected(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->dispatcher:Lzendesk/support/suas/Dispatcher;

    iget-object v1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->actionFactory:Lzendesk/support/request/ActionFactory;

    invoke-virtual {v1, p1}, Lzendesk/support/request/ActionFactory;->deselectAttachment(Ljava/util/List;)Lzendesk/support/suas/Action;

    move-result-object p1

    invoke-interface {v0, p1}, Lzendesk/support/suas/Dispatcher;->dispatch(Lzendesk/support/suas/Action;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel;->onAddAttachmentsRequested(Z)V

    return-void
.end method

.method public onMediaSelected(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->dispatcher:Lzendesk/support/suas/Dispatcher;

    iget-object v1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->actionFactory:Lzendesk/support/request/ActionFactory;

    invoke-virtual {v1, p1}, Lzendesk/support/request/ActionFactory;->selectAttachment(Ljava/util/List;)Lzendesk/support/suas/Action;

    move-result-object p1

    invoke-interface {v0, p1}, Lzendesk/support/suas/Dispatcher;->dispatch(Lzendesk/support/suas/Action;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel;->onAddAttachmentsRequested(Z)V

    return-void
.end method

.method public onMenuItemsClicked(Landroid/view/MenuItem;)V
    .locals 0

    return-void
.end method

.method public onMenuItemsInflated(Landroid/view/MenuItem;Landroid/view/MenuItem;)V
    .locals 0

    iput-object p2, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentButton:Landroid/view/MenuItem;

    invoke-interface {p2}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    new-instance p2, Lzendesk/support/request/ComponentAttachmentCarousel$3;

    invoke-direct {p2, p0}, Lzendesk/support/request/ComponentAttachmentCarousel$3;-><init>(Lzendesk/support/request/ComponentAttachmentCarousel;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-boolean p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentSupportEnabled:Z

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentButtonVisibility(ZZ)V

    return-void
.end method

.method public onVisible()V
    .locals 1

    const/16 v0, 0x82

    invoke-direct {p0, v0}, Lzendesk/support/request/ComponentAttachmentCarousel;->scroll(I)V

    return-void
.end method

.method public bridge synthetic update(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;

    invoke-virtual {p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel;->update(Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;)V

    return-void
.end method

.method public update(Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;)V
    .locals 3

    invoke-virtual {p1}, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->isAttachmentSupportEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentSupportEnabled:Z

    invoke-virtual {p1}, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->isLoading()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v0, v1}, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentButtonVisibility(ZZ)V

    invoke-virtual {p1}, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->isLoading()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentHelper:Lzendesk/support/request/AttachmentHelper;

    invoke-virtual {p1}, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->getSelectedAttachments()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p1}, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->getAdditionalAttachments()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lzendesk/support/request/AttachmentHelper;->updateAttachments(Ljava/util/Collection;Ljava/util/Collection;)V

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentHelper:Lzendesk/support/request/AttachmentHelper;

    invoke-virtual {p1}, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->getMaxAttachmentSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lzendesk/support/request/AttachmentHelper;->updateMaxFileSize(J)V

    iget-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentHelper:Lzendesk/support/request/AttachmentHelper;

    invoke-virtual {p1}, Lzendesk/support/request/AttachmentHelper;->getSelectedAttachments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentCount(I)V

    iget-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->attachmentHelper:Lzendesk/support/request/AttachmentHelper;

    invoke-virtual {p1}, Lzendesk/support/request/AttachmentHelper;->getSelectedAttachments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    const/16 p1, 0x82

    invoke-direct {p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel;->scroll(I)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x21

    invoke-direct {p0, p1}, Lzendesk/support/request/ComponentAttachmentCarousel;->scroll(I)V

    :goto_0
    iget-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method
