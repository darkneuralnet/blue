.class public Lzendesk/belvedere/b$a;
.super LG80;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/b;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LG80<",
        "Ljava/util/List<",
        "Lzendesk/belvedere/MediaResult;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lzendesk/belvedere/b;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/b;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/b$a;->a:Lzendesk/belvedere/b;

    invoke-direct {p0}, LG80;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic success(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lzendesk/belvedere/b$a;->success(Ljava/util/List;)V

    return-void
.end method

.method public success(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/belvedere/MediaResult;

    invoke-virtual {v2}, Lzendesk/belvedere/MediaResult;->i()J

    move-result-wide v3

    iget-object v5, p0, Lzendesk/belvedere/b$a;->a:Lzendesk/belvedere/b;

    invoke-static {v5}, Lzendesk/belvedere/b;->a5(Lzendesk/belvedere/b;)Lzendesk/belvedere/BelvedereUi$UiConfig;

    move-result-object v5

    invoke-virtual {v5}, Lzendesk/belvedere/BelvedereUi$UiConfig;->c()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    iget-object v3, p0, Lzendesk/belvedere/b$a;->a:Lzendesk/belvedere/b;

    invoke-static {v3}, Lzendesk/belvedere/b;->a5(Lzendesk/belvedere/b;)Lzendesk/belvedere/BelvedereUi$UiConfig;

    move-result-object v3

    invoke-virtual {v3}, Lzendesk/belvedere/BelvedereUi$UiConfig;->c()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eq v1, p1, :cond_3

    iget-object p1, p0, Lzendesk/belvedere/b$a;->a:Lzendesk/belvedere/b;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lkl4;->belvedere_image_stream_file_too_large:I

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_3
    iget-object p1, p0, Lzendesk/belvedere/b$a;->a:Lzendesk/belvedere/b;

    invoke-virtual {p1, v0}, Lzendesk/belvedere/b;->I9(Ljava/util/List;)V

    return-void
.end method
