.class public final LV68;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LP78;

.field public b:LMg8;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lii8;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LUh8;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroid/net/Uri;

.field public f:Landroid/net/Uri;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LK58;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LV68;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, LV68;->e:Landroid/net/Uri;

    return-object p0
.end method

.method public static synthetic b(LV68;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, LV68;->f:Landroid/net/Uri;

    return-object p0
.end method

.method public static synthetic i(LV68;)LP78;
    .locals 0

    iget-object p0, p0, LV68;->a:LP78;

    return-object p0
.end method

.method public static synthetic j(LV68;)LMg8;
    .locals 0

    iget-object p0, p0, LV68;->b:LMg8;

    return-object p0
.end method

.method public static synthetic k(LV68;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LV68;->c:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic l(LV68;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LV68;->d:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final c(LMg8;)LV68;
    .locals 0

    iput-object p1, p0, LV68;->b:LMg8;

    return-object p0
.end method

.method public final d(Landroid/net/Uri;)LV68;
    .locals 0

    iput-object p1, p0, LV68;->f:Landroid/net/Uri;

    return-object p0
.end method

.method public final e(Ljava/util/List;)LV68;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LUh8;",
            ">;)",
            "LV68;"
        }
    .end annotation

    iput-object p1, p0, LV68;->d:Ljava/util/List;

    return-object p0
.end method

.method public final f(Landroid/net/Uri;)LV68;
    .locals 0

    iput-object p1, p0, LV68;->e:Landroid/net/Uri;

    return-object p0
.end method

.method public final g(LP78;)LV68;
    .locals 0

    iput-object p1, p0, LV68;->a:LP78;

    return-object p0
.end method

.method public final h(Ljava/util/List;)LV68;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lii8;",
            ">;)",
            "LV68;"
        }
    .end annotation

    iput-object p1, p0, LV68;->c:Ljava/util/List;

    return-object p0
.end method
