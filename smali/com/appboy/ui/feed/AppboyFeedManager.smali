.class public Lcom/appboy/ui/feed/AppboyFeedManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile sInstance:Lcom/appboy/ui/feed/AppboyFeedManager;


# instance fields
.field private mCustomFeedClickActionListener:Lcom/appboy/ui/feed/listeners/IFeedClickActionListener;

.field private final mDefaultFeedClickActionListener:Lcom/appboy/ui/feed/listeners/IFeedClickActionListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/appboy/ui/feed/listeners/AppboyDefaultFeedClickActionListener;

    invoke-direct {v0}, Lcom/appboy/ui/feed/listeners/AppboyDefaultFeedClickActionListener;-><init>()V

    iput-object v0, p0, Lcom/appboy/ui/feed/AppboyFeedManager;->mDefaultFeedClickActionListener:Lcom/appboy/ui/feed/listeners/IFeedClickActionListener;

    return-void
.end method

.method public static getInstance()Lcom/appboy/ui/feed/AppboyFeedManager;
    .locals 2

    sget-object v0, Lcom/appboy/ui/feed/AppboyFeedManager;->sInstance:Lcom/appboy/ui/feed/AppboyFeedManager;

    if-nez v0, :cond_1

    const-class v0, Lcom/appboy/ui/feed/AppboyFeedManager;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/appboy/ui/feed/AppboyFeedManager;->sInstance:Lcom/appboy/ui/feed/AppboyFeedManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appboy/ui/feed/AppboyFeedManager;

    invoke-direct {v1}, Lcom/appboy/ui/feed/AppboyFeedManager;-><init>()V

    sput-object v1, Lcom/appboy/ui/feed/AppboyFeedManager;->sInstance:Lcom/appboy/ui/feed/AppboyFeedManager;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/appboy/ui/feed/AppboyFeedManager;->sInstance:Lcom/appboy/ui/feed/AppboyFeedManager;

    return-object v0
.end method


# virtual methods
.method public getFeedCardClickActionListener()Lcom/appboy/ui/feed/listeners/IFeedClickActionListener;
    .locals 1

    iget-object v0, p0, Lcom/appboy/ui/feed/AppboyFeedManager;->mCustomFeedClickActionListener:Lcom/appboy/ui/feed/listeners/IFeedClickActionListener;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/appboy/ui/feed/AppboyFeedManager;->mDefaultFeedClickActionListener:Lcom/appboy/ui/feed/listeners/IFeedClickActionListener;

    :goto_0
    return-object v0
.end method
