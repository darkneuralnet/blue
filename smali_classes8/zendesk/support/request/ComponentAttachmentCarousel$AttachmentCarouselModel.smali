.class Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/ComponentAttachmentCarousel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AttachmentCarouselModel"
.end annotation


# instance fields
.field private final additionalAttachments:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation
.end field

.field private final isAttachmentSupportEnabled:Z

.field private final isLoading:Z

.field private final maxAttachmentSize:J

.field private final selectedAttachments:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;Ljava/util/Collection;ZZJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;",
            "Ljava/util/Collection<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;ZZJ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->selectedAttachments:Ljava/util/Collection;

    iput-object p2, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->additionalAttachments:Ljava/util/Collection;

    iput-boolean p3, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->isLoading:Z

    iput-boolean p4, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->isAttachmentSupportEnabled:Z

    iput-wide p5, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->maxAttachmentSize:J

    return-void
.end method


# virtual methods
.method public getAdditionalAttachments()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->additionalAttachments:Ljava/util/Collection;

    return-object v0
.end method

.method public getMaxAttachmentSize()J
    .locals 2

    iget-wide v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->maxAttachmentSize:J

    return-wide v0
.end method

.method public getSelectedAttachments()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->selectedAttachments:Ljava/util/Collection;

    return-object v0
.end method

.method public isAttachmentSupportEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->isAttachmentSupportEnabled:Z

    return v0
.end method

.method public isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/support/request/ComponentAttachmentCarousel$AttachmentCarouselModel;->isLoading:Z

    return v0
.end method
