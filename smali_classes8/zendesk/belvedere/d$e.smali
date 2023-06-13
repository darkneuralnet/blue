.class public Lzendesk/belvedere/d$e;
.super Lzendesk/belvedere/d$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final e:Lzendesk/belvedere/MediaResult;

.field public final f:Lzendesk/belvedere/c$b;

.field public g:Lzendesk/belvedere/FixedWidthImageView$b;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/c$b;Lzendesk/belvedere/MediaResult;)V
    .locals 1

    sget v0, LCk4;->belvedere_stream_list_item:I

    invoke-direct {p0, v0, p2}, Lzendesk/belvedere/d$b;-><init>(ILzendesk/belvedere/MediaResult;)V

    iput-object p1, p0, Lzendesk/belvedere/d$e;->f:Lzendesk/belvedere/c$b;

    iput-object p2, p0, Lzendesk/belvedere/d$e;->e:Lzendesk/belvedere/MediaResult;

    return-void
.end method

.method public static synthetic g(Lzendesk/belvedere/d$e;Lzendesk/belvedere/FixedWidthImageView$b;)Lzendesk/belvedere/FixedWidthImageView$b;
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/d$e;->g:Lzendesk/belvedere/FixedWidthImageView$b;

    return-object p1
.end method

.method public static synthetic h(Lzendesk/belvedere/d$e;)Lzendesk/belvedere/c$b;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/d$e;->f:Lzendesk/belvedere/c$b;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 10

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LSg4;->list_item_image:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lzendesk/belvedere/FixedWidthImageView;

    sget v1, LSg4;->list_item_selectable:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lzendesk/belvedere/SelectableView;

    sget v1, Lkl4;->belvedere_stream_item_select_image_desc:I

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lzendesk/belvedere/d$e;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v5}, Lzendesk/belvedere/MediaResult;->g()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v4, Lkl4;->belvedere_stream_item_unselect_image_desc:I

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lzendesk/belvedere/d$e;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v5}, Lzendesk/belvedere/MediaResult;->g()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v6

    invoke-virtual {v0, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lzendesk/belvedere/SelectableView;->setContentDescriptionStrings(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lzendesk/belvedere/d$e;->g:Lzendesk/belvedere/FixedWidthImageView$b;

    if-eqz v0, :cond_0

    invoke-static {}, LiT3;->h()LiT3;

    move-result-object v0

    iget-object v1, p0, Lzendesk/belvedere/d$e;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->h()Landroid/net/Uri;

    move-result-object v1

    iget-object v3, p0, Lzendesk/belvedere/d$e;->g:Lzendesk/belvedere/FixedWidthImageView$b;

    invoke-virtual {v2, v0, v1, v3}, Lzendesk/belvedere/FixedWidthImageView;->f(LiT3;Landroid/net/Uri;Lzendesk/belvedere/FixedWidthImageView$b;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LiT3;->h()LiT3;

    move-result-object v3

    iget-object v0, p0, Lzendesk/belvedere/d$e;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v0}, Lzendesk/belvedere/MediaResult;->h()Landroid/net/Uri;

    move-result-object v4

    iget-object v0, p0, Lzendesk/belvedere/d$e;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v0}, Lzendesk/belvedere/MediaResult;->k()J

    move-result-wide v5

    iget-object v0, p0, Lzendesk/belvedere/d$e;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v0}, Lzendesk/belvedere/MediaResult;->d()J

    move-result-wide v7

    new-instance v9, Lzendesk/belvedere/d$e$a;

    invoke-direct {v9, p0}, Lzendesk/belvedere/d$e$a;-><init>(Lzendesk/belvedere/d$e;)V

    invoke-virtual/range {v2 .. v9}, Lzendesk/belvedere/FixedWidthImageView;->e(LiT3;Landroid/net/Uri;JJLzendesk/belvedere/FixedWidthImageView$c;)V

    :goto_0
    invoke-virtual {p0}, Lzendesk/belvedere/d$b;->e()Z

    move-result v0

    invoke-virtual {p1, v0}, Lzendesk/belvedere/SelectableView;->setSelected(Z)V

    new-instance v0, Lzendesk/belvedere/d$e$b;

    invoke-direct {v0, p0}, Lzendesk/belvedere/d$e$b;-><init>(Lzendesk/belvedere/d$e;)V

    invoke-virtual {p1, v0}, Lzendesk/belvedere/SelectableView;->setSelectionListener(Lzendesk/belvedere/SelectableView$c;)V

    return-void
.end method
