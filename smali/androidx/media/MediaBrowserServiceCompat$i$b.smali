.class public Landroidx/media/MediaBrowserServiceCompat$i$b;
.super Landroidx/media/MediaBrowserServiceCompat$h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic c:Landroidx/media/MediaBrowserServiceCompat$i;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$i;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$i$b;->c:Landroidx/media/MediaBrowserServiceCompat$i;

    invoke-direct {p0, p1, p2}, Landroidx/media/MediaBrowserServiceCompat$h$b;-><init>(Landroidx/media/MediaBrowserServiceCompat$h;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onLoadItem(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/service/media/MediaBrowserService$Result<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$i$b;->c:Landroidx/media/MediaBrowserServiceCompat$i;

    new-instance v1, Landroidx/media/MediaBrowserServiceCompat$m;

    invoke-direct {v1, p2}, Landroidx/media/MediaBrowserServiceCompat$m;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    invoke-virtual {v0, p1, v1}, Landroidx/media/MediaBrowserServiceCompat$i;->e(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$m;)V

    return-void
.end method
