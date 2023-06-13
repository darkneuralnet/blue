.class public final LF41$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF41$c$a;
    }
.end annotation


# instance fields
.field public final a:LF41$d;

.field public final b:[Z

.field public c:Z

.field public d:Z

.field public final synthetic e:LF41;


# direct methods
.method public constructor <init>(LF41;LF41$d;)V
    .locals 0

    iput-object p1, p0, LF41$c;->e:LF41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LF41$c;->a:LF41$d;

    invoke-static {p2}, LF41$d;->e(LF41$d;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LF41;->c(LF41;)I

    move-result p1

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, LF41$c;->b:[Z

    return-void
.end method

.method public synthetic constructor <init>(LF41;LF41$d;LF41$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF41$c;-><init>(LF41;LF41$d;)V

    return-void
.end method

.method public static synthetic b(LF41$c;)LF41$d;
    .locals 0

    iget-object p0, p0, LF41$c;->a:LF41$d;

    return-object p0
.end method

.method public static synthetic c(LF41$c;)[Z
    .locals 0

    iget-object p0, p0, LF41$c;->b:[Z

    return-object p0
.end method

.method public static synthetic d(LF41$c;Z)Z
    .locals 0

    iput-boolean p1, p0, LF41$c;->c:Z

    return p1
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LF41$c;->e:LF41;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, LF41;->i(LF41;LF41$c;Z)V

    return-void
.end method

.method public e()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LF41$c;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LF41$c;->e:LF41;

    const/4 v2, 0x0

    invoke-static {v0, p0, v2}, LF41;->i(LF41;LF41$c;Z)V

    iget-object v0, p0, LF41$c;->e:LF41;

    iget-object v2, p0, LF41$c;->a:LF41$d;

    invoke-static {v2}, LF41$d;->b(LF41$d;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LF41;->C(Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF41$c;->e:LF41;

    invoke-static {v0, p0, v1}, LF41;->i(LF41;LF41$c;Z)V

    :goto_0
    iput-boolean v1, p0, LF41$c;->d:Z

    return-void
.end method

.method public f(I)Ljava/io/OutputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LF41$c;->e:LF41;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LF41$c;->a:LF41$d;

    invoke-static {v1}, LF41$d;->g(LF41$d;)LF41$c;

    move-result-object v1

    if-ne v1, p0, :cond_1

    iget-object v1, p0, LF41$c;->a:LF41$d;

    invoke-static {v1}, LF41$d;->e(LF41$d;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LF41$c;->b:[Z

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    :cond_0
    iget-object v1, p0, LF41$c;->a:LF41$d;

    invoke-virtual {v1, p1}, LF41$d;->k(I)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iget-object v1, p0, LF41$c;->e:LF41;

    invoke-static {v1}, LF41;->d(LF41;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    :try_start_4
    new-instance p1, LF41$c$a;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v1, v2}, LF41$c$a;-><init>(LF41$c;Ljava/io/OutputStream;LF41$a;)V

    monitor-exit v0

    return-object p1

    :catch_1
    invoke-static {}, LF41;->g()Ljava/io/OutputStream;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method
