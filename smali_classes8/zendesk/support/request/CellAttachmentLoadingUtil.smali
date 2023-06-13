.class Lzendesk/support/request/CellAttachmentLoadingUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;,
        Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "AttachmentLoadingUtil"


# instance fields
.field private final imageLoadingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;

.field private final imageSizingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;


# direct methods
.method public constructor <init>(LiT3;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;

    invoke-direct {v0, p1, p2}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;-><init>(LiT3;Landroid/content/Context;)V

    iput-object v0, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageSizingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;

    new-instance p2, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;

    invoke-direct {p2, p1}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;-><init>(LiT3;)V

    iput-object p2, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageLoadingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;

    return-void
.end method

.method public static synthetic access$000(Lzendesk/support/request/CellAttachmentLoadingUtil;Landroid/widget/ImageView;Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic$ImageDimensions;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/support/request/CellAttachmentLoadingUtil;->adjustImageViewDimensions(Landroid/widget/ImageView;Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic$ImageDimensions;)V

    return-void
.end method

.method public static synthetic access$100(Lzendesk/support/request/CellAttachmentLoadingUtil;)Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;
    .locals 0

    iget-object p0, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageLoadingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;

    return-object p0
.end method

.method private adjustImageViewDimensions(Landroid/widget/ImageView;Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic$ImageDimensions;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p2}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic$ImageDimensions;->getImageWidth()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p2}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic$ImageDimensions;->getImageHeight()I

    move-result p2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public bindImage(Landroid/widget/ImageView;Lzendesk/support/request/StateRequestAttachment;)V
    .locals 2

    iget-object v0, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageLoadingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;

    invoke-virtual {v0, p1, p2}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;->isImageLoading(Landroid/widget/ImageView;Lzendesk/support/request/StateRequestAttachment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageLoadingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;

    invoke-virtual {v0, p1, p2}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;->setImageViewLoading(Landroid/widget/ImageView;Lzendesk/support/request/StateRequestAttachment;)V

    iget-object v0, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageSizingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;

    invoke-virtual {v0}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;->getMaxSize()Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic$ImageDimensions;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lzendesk/support/request/CellAttachmentLoadingUtil;->adjustImageViewDimensions(Landroid/widget/ImageView;Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic$ImageDimensions;)V

    iget-object v0, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageLoadingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;

    invoke-virtual {v0, p1}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageLoadingLogic;->initImageView(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lzendesk/support/request/CellAttachmentLoadingUtil;->imageSizingLogic:Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;

    new-instance v1, Lzendesk/support/request/CellAttachmentLoadingUtil$1;

    invoke-direct {v1, p0, p1, p2}, Lzendesk/support/request/CellAttachmentLoadingUtil$1;-><init>(Lzendesk/support/request/CellAttachmentLoadingUtil;Landroid/widget/ImageView;Lzendesk/support/request/StateRequestAttachment;)V

    invoke-virtual {v0, p2, v1}, Lzendesk/support/request/CellAttachmentLoadingUtil$ImageSizingLogic;->loadDimensionsForAttachment(Lzendesk/support/request/StateRequestAttachment;LlI6;)V

    :cond_0
    return-void
.end method
