.class public Lzendesk/belvedere/d$d;
.super Lzendesk/belvedere/d$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final e:Lzendesk/belvedere/MediaResult;

.field public final f:Landroid/content/pm/ResolveInfo;

.field public final g:Lzendesk/belvedere/c$b;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/c$b;Lzendesk/belvedere/MediaResult;Landroid/content/Context;)V
    .locals 1

    sget v0, LCk4;->belvedere_stream_list_item_genric_file:I

    invoke-direct {p0, v0, p2}, Lzendesk/belvedere/d$b;-><init>(ILzendesk/belvedere/MediaResult;)V

    iput-object p2, p0, Lzendesk/belvedere/d$d;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {p2}, Lzendesk/belvedere/MediaResult;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, p3}, Lzendesk/belvedere/d$d;->h(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/ResolveInfo;

    move-result-object p2

    iput-object p2, p0, Lzendesk/belvedere/d$d;->f:Landroid/content/pm/ResolveInfo;

    iput-object p1, p0, Lzendesk/belvedere/d$d;->g:Lzendesk/belvedere/c$b;

    return-void
.end method

.method public static synthetic g(Lzendesk/belvedere/d$d;)Lzendesk/belvedere/c$b;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/d$d;->g:Lzendesk/belvedere/c$b;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 9

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LSg4;->list_item_file_icon:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    sget v2, LSg4;->list_item_file_title:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    sget v3, LSg4;->list_item_file_label:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    sget v4, LSg4;->list_item_file_holder:I

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lzendesk/belvedere/SelectableView;

    sget v4, Lkl4;->belvedere_stream_item_select_file_desc:I

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Object;

    iget-object v7, p0, Lzendesk/belvedere/d$d;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v7}, Lzendesk/belvedere/MediaResult;->g()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-virtual {v0, v4, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v6, Lkl4;->belvedere_stream_item_unselect_file_desc:I

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v7, p0, Lzendesk/belvedere/d$d;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v7}, Lzendesk/belvedere/MediaResult;->g()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v8

    invoke-virtual {v0, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5, v4}, Lzendesk/belvedere/SelectableView;->setContentDescriptionStrings(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lzendesk/belvedere/d$d;->e:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v4}, Lzendesk/belvedere/MediaResult;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lzendesk/belvedere/d$d;->f:Landroid/content/pm/ResolveInfo;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v2, p0, Lzendesk/belvedere/d$d;->f:Landroid/content/pm/ResolveInfo;

    invoke-virtual {v2, v0}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lzendesk/belvedere/d$d;->f:Landroid/content/pm/ResolveInfo;

    invoke-virtual {v2, v0}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    sget v0, Lkl4;->belvedere_image_stream_unknown_app:I

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x1080093

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    invoke-virtual {p0}, Lzendesk/belvedere/d$b;->e()Z

    move-result v0

    invoke-virtual {p1, v0}, Lzendesk/belvedere/SelectableView;->setSelected(Z)V

    new-instance v0, Lzendesk/belvedere/d$d$a;

    invoke-direct {v0, p0}, Lzendesk/belvedere/d$d$a;-><init>(Lzendesk/belvedere/d$d;)V

    invoke-virtual {p1, v0}, Lzendesk/belvedere/SelectableView;->setSelectionListener(Lzendesk/belvedere/SelectableView$c;)V

    return-void
.end method

.method public final h(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/ResolveInfo;
    .locals 3

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {p2}, Lzendesk/belvedere/a;->c(Landroid/content/Context;)Lzendesk/belvedere/a;

    move-result-object p2

    const-string v1, "tmp"

    invoke-virtual {p2, v1, p1}, Lzendesk/belvedere/a;->d(Ljava/lang/String;Ljava/lang/String;)Lzendesk/belvedere/MediaResult;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lzendesk/belvedere/MediaResult;->j()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 p1, 0x10000

    invoke-virtual {v0, v1, p1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ResolveInfo;

    return-object p1

    :cond_1
    return-object p2
.end method
