.class Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;
.super Landroid/support/v4/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SearchResultReceiver"
.end annotation


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Landroid/os/Bundle;

.field public final g:Landroid/support/v4/media/MediaBrowserCompat$k;


# virtual methods
.method public a(ILandroid/os/Bundle;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->b(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    :cond_0
    if-nez p1, :cond_4

    if-eqz p2, :cond_4

    const-string p1, "search_results"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance p2, Ljava/util/ArrayList;

    array-length v0, p1

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    check-cast v2, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->g:Landroid/support/v4/media/MediaBrowserCompat$k;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->e:Ljava/lang/String;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->f:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1, p2}, Landroid/support/v4/media/MediaBrowserCompat$k;->b(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->g:Landroid/support/v4/media/MediaBrowserCompat$k;

    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->e:Ljava/lang/String;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->f:Landroid/os/Bundle;

    invoke-virtual {p1, p2, v0}, Landroid/support/v4/media/MediaBrowserCompat$k;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_4
    :goto_2
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->g:Landroid/support/v4/media/MediaBrowserCompat$k;

    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->e:Ljava/lang/String;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->f:Landroid/os/Bundle;

    invoke-virtual {p1, p2, v0}, Landroid/support/v4/media/MediaBrowserCompat$k;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
