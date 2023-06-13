.class public Lzendesk/belvedere/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lzendesk/belvedere/g;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/g;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lzendesk/belvedere/d$b;)Z
    .locals 5

    invoke-virtual {p1}, Lzendesk/belvedere/d$b;->d()Lzendesk/belvedere/MediaResult;

    move-result-object v0

    iget-object v1, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {v1}, Lzendesk/belvedere/g;->a(Lzendesk/belvedere/g;)LXX1;

    move-result-object v1

    invoke-interface {v1}, LXX1;->h()J

    move-result-wide v1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lzendesk/belvedere/MediaResult;->i()J

    move-result-wide v3

    cmp-long v3, v3, v1

    if-lez v3, :cond_1

    :cond_0
    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_3

    :cond_1
    invoke-virtual {p1}, Lzendesk/belvedere/d$b;->e()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-virtual {p1, v1}, Lzendesk/belvedere/d$b;->f(Z)V

    iget-object v1, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-virtual {p1}, Lzendesk/belvedere/d$b;->e()Z

    move-result v3

    invoke-static {v1, v0, v3}, Lzendesk/belvedere/g;->d(Lzendesk/belvedere/g;Lzendesk/belvedere/MediaResult;Z)Ljava/util/List;

    move-result-object v1

    iget-object v3, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {v3}, Lzendesk/belvedere/g;->c(Lzendesk/belvedere/g;)Lzendesk/belvedere/f;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3, v4}, Lzendesk/belvedere/f;->e(I)V

    iget-object v3, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {v3}, Lzendesk/belvedere/g;->c(Lzendesk/belvedere/g;)Lzendesk/belvedere/f;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v3, v1}, Lzendesk/belvedere/f;->f(I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lzendesk/belvedere/d$b;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {p1}, Lzendesk/belvedere/g;->b(Lzendesk/belvedere/g;)Lzendesk/belvedere/b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lzendesk/belvedere/b;->I9(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {p1}, Lzendesk/belvedere/g;->b(Lzendesk/belvedere/g;)Lzendesk/belvedere/b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lzendesk/belvedere/b;->G9(Ljava/util/List;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {p1}, Lzendesk/belvedere/g;->c(Lzendesk/belvedere/g;)Lzendesk/belvedere/f;

    move-result-object p1

    sget v0, Lkl4;->belvedere_image_stream_file_too_large:I

    invoke-interface {p1, v0}, Lzendesk/belvedere/f;->g(I)V

    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {v0}, Lzendesk/belvedere/g;->a(Lzendesk/belvedere/g;)LXX1;

    move-result-object v0

    invoke-interface {v0}, LXX1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {v0}, Lzendesk/belvedere/g;->c(Lzendesk/belvedere/g;)Lzendesk/belvedere/f;

    move-result-object v0

    iget-object v1, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {v1}, Lzendesk/belvedere/g;->a(Lzendesk/belvedere/g;)LXX1;

    move-result-object v1

    invoke-interface {v1}, LXX1;->j()Lzendesk/belvedere/MediaIntent;

    move-result-object v1

    iget-object v2, p0, Lzendesk/belvedere/g$c;->a:Lzendesk/belvedere/g;

    invoke-static {v2}, Lzendesk/belvedere/g;->b(Lzendesk/belvedere/g;)Lzendesk/belvedere/b;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lzendesk/belvedere/f;->i(Lzendesk/belvedere/MediaIntent;Lzendesk/belvedere/b;)V

    :cond_0
    return-void
.end method
