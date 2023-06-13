.class public Lzendesk/support/SupportUiStorage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CACHE_INDEX:I = 0x0

.field private static final LOG_TAG:Ljava/lang/String; = "SupportUiStorage"

.field public static final REQUEST_MAPPER:Ljava/lang/String; = "request_id_mapper"


# instance fields
.field private final gson:LoE1;

.field private final storage:LF41;


# direct methods
.method public constructor <init>(LF41;LoE1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/SupportUiStorage;->storage:LF41;

    iput-object p2, p0, Lzendesk/support/SupportUiStorage;->gson:LoE1;

    return-void
.end method

.method private static abortEdit(LF41$c;)V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "SupportUiStorage"

    const-string v3, "Unable to cache data"

    invoke-static {v2, v3, v1}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, LF41$c;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v1, "Unable to abort write"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, p0, v0}, LIx2;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public static synthetic access$000(Lzendesk/support/SupportUiStorage;)LoE1;
    .locals 0

    iget-object p0, p0, Lzendesk/support/SupportUiStorage;->gson:LoE1;

    return-object p0
.end method

.method private static key(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LU31;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public read(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TE;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lzendesk/support/SupportUiStorage;->storage:LF41;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lzendesk/support/SupportUiStorage;->storage:LF41;

    invoke-static {p1}, Lzendesk/support/SupportUiStorage;->key(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LF41;->t(Ljava/lang/String;)LF41$e;

    move-result-object p1

    new-instance v1, Lzendesk/support/SupportUiStorage$1;

    invoke-direct {v1, p0, p2}, Lzendesk/support/SupportUiStorage$1;-><init>(Lzendesk/support/SupportUiStorage;Ljava/lang/reflect/Type;)V

    invoke-static {p1, v1}, Lzendesk/support/Streams;->use(Ljava/io/Closeable;Lzendesk/support/Streams$Use;)Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    const-string p1, "SupportUiStorage"

    const-string p2, "Unable to read from cache"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public write(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lzendesk/support/SupportUiStorage;->storage:LF41;

    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lzendesk/support/SupportUiStorage;->storage:LF41;

    invoke-static {p1}, Lzendesk/support/SupportUiStorage;->key(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, LF41;->r(Ljava/lang/String;)LF41$c;

    move-result-object v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :try_start_2
    invoke-virtual {v0, p1}, LF41$c;->f(I)Ljava/io/OutputStream;

    move-result-object p1

    invoke-static {p1}, LOe3;->h(Ljava/io/OutputStream;)LwB5;

    move-result-object p1

    iget-object v1, p0, Lzendesk/support/SupportUiStorage;->gson:LoE1;

    invoke-static {v1, p1, p2}, Lzendesk/support/Streams;->toJson(LoE1;LwB5;Ljava/lang/Object;)V

    invoke-virtual {v0}, LF41$c;->e()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    invoke-static {v0}, Lzendesk/support/SupportUiStorage;->abortEdit(LF41$c;)V

    :cond_0
    :goto_0
    return-void
.end method
