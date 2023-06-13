.class public Lzendesk/belvedere/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/belvedere/a$a;
    }
.end annotation


# static fields
.field public static e:Lzendesk/belvedere/a;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public b:LZQ5;

.field public c:LY52;

.field public d:LEP2;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/a$a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lzendesk/belvedere/a$a;->a:Landroid/content/Context;

    iput-object v0, p0, Lzendesk/belvedere/a;->a:Landroid/content/Context;

    iget-object v1, p1, Lzendesk/belvedere/a$a;->b:Lzendesk/belvedere/i$b;

    iget-boolean v2, p1, Lzendesk/belvedere/a$a;->c:Z

    invoke-interface {v1, v2}, Lzendesk/belvedere/i$b;->d(Z)V

    iget-object p1, p1, Lzendesk/belvedere/a$a;->b:Lzendesk/belvedere/i$b;

    invoke-static {p1}, Lzendesk/belvedere/i;->d(Lzendesk/belvedere/i$b;)V

    new-instance p1, LY52;

    invoke-direct {p1}, LY52;-><init>()V

    iput-object p1, p0, Lzendesk/belvedere/a;->c:LY52;

    new-instance p1, LZQ5;

    invoke-direct {p1}, LZQ5;-><init>()V

    iput-object p1, p0, Lzendesk/belvedere/a;->b:LZQ5;

    new-instance v1, LEP2;

    iget-object v2, p0, Lzendesk/belvedere/a;->c:LY52;

    invoke-direct {v1, v0, p1, v2}, LEP2;-><init>(Landroid/content/Context;LZQ5;LY52;)V

    iput-object v1, p0, Lzendesk/belvedere/a;->d:LEP2;

    const-string p1, "Belvedere"

    const-string v0, "Belvedere initialized"

    invoke-static {p1, v0}, Lzendesk/belvedere/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lzendesk/belvedere/a;
    .locals 2

    const-class v0, Lzendesk/belvedere/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lzendesk/belvedere/a;->e:Lzendesk/belvedere/a;

    if-nez v1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lzendesk/belvedere/a$a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lzendesk/belvedere/a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lzendesk/belvedere/a$a;->a()Lzendesk/belvedere/a;

    move-result-object p0

    sput-object p0, Lzendesk/belvedere/a;->e:Lzendesk/belvedere/a;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid context provided"

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p0, Lzendesk/belvedere/a;->e:Lzendesk/belvedere/a;

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public a()Lzendesk/belvedere/MediaIntent$b;
    .locals 4

    iget-object v0, p0, Lzendesk/belvedere/a;->c:LY52;

    invoke-virtual {v0}, LY52;->d()I

    move-result v0

    new-instance v1, Lzendesk/belvedere/MediaIntent$b;

    iget-object v2, p0, Lzendesk/belvedere/a;->d:LEP2;

    iget-object v3, p0, Lzendesk/belvedere/a;->c:LY52;

    invoke-direct {v1, v0, v2, v3}, Lzendesk/belvedere/MediaIntent$b;-><init>(ILEP2;LY52;)V

    return-object v1
.end method

.method public b()Lzendesk/belvedere/MediaIntent$c;
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/a;->c:LY52;

    invoke-virtual {v0}, LY52;->d()I

    move-result v0

    new-instance v1, Lzendesk/belvedere/MediaIntent$c;

    iget-object v2, p0, Lzendesk/belvedere/a;->d:LEP2;

    invoke-direct {v1, v0, v2}, Lzendesk/belvedere/MediaIntent$c;-><init>(ILEP2;)V

    return-object v1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lzendesk/belvedere/MediaResult;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lzendesk/belvedere/a;->b:LZQ5;

    iget-object v2, v0, Lzendesk/belvedere/a;->a:Landroid/content/Context;

    move-object/from16 v3, p1

    move-object/from16 v7, p2

    invoke-virtual {v1, v2, v3, v7}, LZQ5;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    const-string v3, "Get internal File: %s"

    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Belvedere"

    invoke-static {v2, v1}, Lzendesk/belvedere/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v4, :cond_1

    iget-object v1, v0, Lzendesk/belvedere/a;->b:LZQ5;

    iget-object v2, v0, Lzendesk/belvedere/a;->a:Landroid/content/Context;

    invoke-virtual {v1, v2, v4}, LZQ5;->i(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    if-eqz v6, :cond_1

    iget-object v1, v0, Lzendesk/belvedere/a;->a:Landroid/content/Context;

    invoke-static {v1, v6}, LZQ5;->j(Landroid/content/Context;Landroid/net/Uri;)Lzendesk/belvedere/MediaResult;

    move-result-object v1

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->e()Ljava/lang/String;

    move-result-object v2

    const-string v3, "image"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v4}, LmU;->a(Ljava/io/File;)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v8, v3

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    move-wide v13, v2

    move-wide v11, v8

    goto :goto_0

    :cond_0
    const-wide/16 v2, -0x1

    move-wide v11, v2

    move-wide v13, v11

    :goto_0
    new-instance v2, Lzendesk/belvedere/MediaResult;

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->i()J

    move-result-wide v9

    move-object v3, v2

    move-object v5, v6

    move-object/from16 v7, p2

    invoke-direct/range {v3 .. v14}, Lzendesk/belvedere/MediaResult;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JJJ)V

    return-object v2

    :cond_1
    const/4 v1, 0x0

    return-object v1
.end method

.method public e(IILandroid/content/Intent;LG80;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroid/content/Intent;",
            "LG80<",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;>;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/a;->d:LEP2;

    iget-object v1, p0, Lzendesk/belvedere/a;->a:Landroid/content/Context;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, LEP2;->e(Landroid/content/Context;IILandroid/content/Intent;LG80;Z)V

    return-void
.end method

.method public f(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    invoke-virtual {p0, v0, p1}, Lzendesk/belvedere/a;->g(Landroid/content/Intent;Landroid/net/Uri;)V

    return-object v0
.end method

.method public g(Landroid/content/Intent;Landroid/net/Uri;)V
    .locals 3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, "Grant Permission - Intent: %s - Uri: %s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Belvedere"

    invoke-static {v1, v0}, Lzendesk/belvedere/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lzendesk/belvedere/a;->b:LZQ5;

    iget-object v1, p0, Lzendesk/belvedere/a;->a:Landroid/content/Context;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, p1, p2, v2}, LZQ5;->l(Landroid/content/Context;Landroid/content/Intent;Landroid/net/Uri;I)V

    return-void
.end method

.method public h(Ljava/util/List;Ljava/lang/String;LG80;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "LG80<",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lzendesk/belvedere/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lzendesk/belvedere/a;->b:LZQ5;

    invoke-static {v0, v1, p3, p1, p2}, LOL4;->d(Landroid/content/Context;LZQ5;LG80;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p3, p1}, LG80;->internalSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
