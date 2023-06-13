.class public Lzendesk/belvedere/BelvedereUi$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/BelvedereUi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Z

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaIntent;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public g:J

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzendesk/belvedere/BelvedereUi$b;->b:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->f:Ljava/util/List;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lzendesk/belvedere/BelvedereUi$b;->g:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/belvedere/BelvedereUi$b;->h:Z

    iput-object p1, p0, Lzendesk/belvedere/BelvedereUi$b;->a:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lzendesk/belvedere/BelvedereUi$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/belvedere/BelvedereUi$b;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lzendesk/belvedere/BelvedereUi$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/BelvedereUi$b;->d:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic b(Lzendesk/belvedere/BelvedereUi$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/BelvedereUi$b;->e:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic c(Lzendesk/belvedere/BelvedereUi$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/BelvedereUi$b;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic d(Lzendesk/belvedere/BelvedereUi$b;)J
    .locals 2

    iget-wide v0, p0, Lzendesk/belvedere/BelvedereUi$b;->g:J

    return-wide v0
.end method

.method public static synthetic e(Lzendesk/belvedere/BelvedereUi$b;)Z
    .locals 0

    iget-boolean p0, p0, Lzendesk/belvedere/BelvedereUi$b;->h:Z

    return p0
.end method


# virtual methods
.method public f(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 2

    invoke-static {p1}, Lzendesk/belvedere/BelvedereUi;->b(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/belvedere/b;

    move-result-object p1

    iget-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->c:Ljava/util/List;

    new-instance v1, Lzendesk/belvedere/BelvedereUi$b$a;

    invoke-direct {v1, p0, p1}, Lzendesk/belvedere/BelvedereUi$b$a;-><init>(Lzendesk/belvedere/BelvedereUi$b;Lzendesk/belvedere/b;)V

    invoke-virtual {p1, v0, v1}, Lzendesk/belvedere/b;->B9(Ljava/util/List;Lzendesk/belvedere/j$d;)V

    return-void
.end method

.method public g()Lzendesk/belvedere/BelvedereUi$b;
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lzendesk/belvedere/a;->c(Landroid/content/Context;)Lzendesk/belvedere/a;

    move-result-object v0

    invoke-virtual {v0}, Lzendesk/belvedere/a;->a()Lzendesk/belvedere/MediaIntent$b;

    move-result-object v0

    invoke-virtual {v0}, Lzendesk/belvedere/MediaIntent$b;->a()Lzendesk/belvedere/MediaIntent;

    move-result-object v0

    iget-object v1, p0, Lzendesk/belvedere/BelvedereUi$b;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public h(Ljava/lang/String;Z)Lzendesk/belvedere/BelvedereUi$b;
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lzendesk/belvedere/a;->c(Landroid/content/Context;)Lzendesk/belvedere/a;

    move-result-object v0

    invoke-virtual {v0}, Lzendesk/belvedere/a;->b()Lzendesk/belvedere/MediaIntent$c;

    move-result-object v0

    invoke-virtual {v0, p2}, Lzendesk/belvedere/MediaIntent$c;->a(Z)Lzendesk/belvedere/MediaIntent$c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lzendesk/belvedere/MediaIntent$c;->c(Ljava/lang/String;)Lzendesk/belvedere/MediaIntent$c;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/belvedere/MediaIntent$c;->b()Lzendesk/belvedere/MediaIntent;

    move-result-object p1

    iget-object p2, p0, Lzendesk/belvedere/BelvedereUi$b;->c:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public i(Ljava/util/List;)Lzendesk/belvedere/BelvedereUi$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)",
            "Lzendesk/belvedere/BelvedereUi$b;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->e:Ljava/util/List;

    return-object p0
.end method

.method public j(Z)Lzendesk/belvedere/BelvedereUi$b;
    .locals 0

    iput-boolean p1, p0, Lzendesk/belvedere/BelvedereUi$b;->h:Z

    return-object p0
.end method

.method public k(J)Lzendesk/belvedere/BelvedereUi$b;
    .locals 0

    iput-wide p1, p0, Lzendesk/belvedere/BelvedereUi$b;->g:J

    return-object p0
.end method

.method public l(Ljava/util/List;)Lzendesk/belvedere/BelvedereUi$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)",
            "Lzendesk/belvedere/BelvedereUi$b;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->d:Ljava/util/List;

    return-object p0
.end method

.method public varargs m([I)Lzendesk/belvedere/BelvedereUi$b;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p1, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lzendesk/belvedere/BelvedereUi$b;->f:Ljava/util/List;

    return-object p0
.end method
