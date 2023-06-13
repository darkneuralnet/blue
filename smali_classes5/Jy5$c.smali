.class public LJy5$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LJy5$c;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(LJy5$a;)V
    .locals 0

    invoke-direct {p0}, LJy5$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LJy5$c;->a:Z

    return v0
.end method

.method public b(Lcom/facebook/share/model/ShareCameraEffectContent;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->b(Lcom/facebook/share/model/ShareCameraEffectContent;LJy5$c;)V

    return-void
.end method

.method public c(Lcom/facebook/share/model/ShareLinkContent;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->n(Lcom/facebook/share/model/ShareLinkContent;LJy5$c;)V

    return-void
.end method

.method public d(Lcom/facebook/share/model/ShareMedia;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->B(Lcom/facebook/share/model/ShareMedia;LJy5$c;)V

    return-void
.end method

.method public e(Lcom/facebook/share/model/ShareMediaContent;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->a(Lcom/facebook/share/model/ShareMediaContent;LJy5$c;)V

    return-void
.end method

.method public f(Lcom/facebook/share/model/ShareMessengerGenericTemplateContent;)V
    .locals 0

    invoke-static {p1}, LJy5;->j(Lcom/facebook/share/model/ShareMessengerGenericTemplateContent;)V

    return-void
.end method

.method public g(Lcom/facebook/share/model/ShareMessengerMediaTemplateContent;)V
    .locals 0

    invoke-static {p1}, LJy5;->k(Lcom/facebook/share/model/ShareMessengerMediaTemplateContent;)V

    return-void
.end method

.method public h(Lcom/facebook/share/model/ShareMessengerOpenGraphMusicTemplateContent;)V
    .locals 0

    invoke-static {p1}, LJy5;->i(Lcom/facebook/share/model/ShareMessengerOpenGraphMusicTemplateContent;)V

    return-void
.end method

.method public i(Lcom/facebook/share/model/ShareOpenGraphAction;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->d(Lcom/facebook/share/model/ShareOpenGraphAction;LJy5$c;)V

    return-void
.end method

.method public j(Lcom/facebook/share/model/ShareOpenGraphContent;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LJy5$c;->a:Z

    invoke-static {p1, p0}, LJy5;->c(Lcom/facebook/share/model/ShareOpenGraphContent;LJy5$c;)V

    return-void
.end method

.method public k(Lcom/facebook/share/model/ShareOpenGraphObject;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->e(Lcom/facebook/share/model/ShareOpenGraphObject;LJy5$c;)V

    return-void
.end method

.method public l(Lcom/facebook/share/model/ShareOpenGraphValueContainer;Z)V
    .locals 0

    invoke-static {p1, p0, p2}, LJy5;->f(Lcom/facebook/share/model/ShareOpenGraphValueContainer;LJy5$c;Z)V

    return-void
.end method

.method public m(Lcom/facebook/share/model/SharePhoto;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->g(Lcom/facebook/share/model/SharePhoto;LJy5$c;)V

    return-void
.end method

.method public n(Lcom/facebook/share/model/SharePhotoContent;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->o(Lcom/facebook/share/model/SharePhotoContent;LJy5$c;)V

    return-void
.end method

.method public o(Lcom/facebook/share/model/ShareStoryContent;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->l(Lcom/facebook/share/model/ShareStoryContent;LJy5$c;)V

    return-void
.end method

.method public p(Lcom/facebook/share/model/ShareVideo;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->h(Lcom/facebook/share/model/ShareVideo;LJy5$c;)V

    return-void
.end method

.method public q(Lcom/facebook/share/model/ShareVideoContent;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->p(Lcom/facebook/share/model/ShareVideoContent;LJy5$c;)V

    return-void
.end method
