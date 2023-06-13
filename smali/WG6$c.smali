.class public LWG6$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWG6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroidx/work/c;

.field public c:LZw1;

.field public d:LmZ5;

.field public e:Landroidx/work/a;

.field public f:Landroidx/work/impl/WorkDatabase;

.field public g:LHG6;

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxm5;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public j:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LmZ5;LZw1;Landroidx/work/impl/WorkDatabase;LHG6;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "LmZ5;",
            "LZw1;",
            "Landroidx/work/impl/WorkDatabase;",
            "LHG6;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/work/WorkerParameters$a;

    invoke-direct {v0}, Landroidx/work/WorkerParameters$a;-><init>()V

    iput-object v0, p0, LWG6$c;->j:Landroidx/work/WorkerParameters$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LWG6$c;->a:Landroid/content/Context;

    iput-object p3, p0, LWG6$c;->d:LmZ5;

    iput-object p4, p0, LWG6$c;->c:LZw1;

    iput-object p2, p0, LWG6$c;->e:Landroidx/work/a;

    iput-object p5, p0, LWG6$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, LWG6$c;->g:LHG6;

    iput-object p7, p0, LWG6$c;->i:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(LWG6$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LWG6$c;->i:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public b()LWG6;
    .locals 1

    new-instance v0, LWG6;

    invoke-direct {v0, p0}, LWG6;-><init>(LWG6$c;)V

    return-object v0
.end method

.method public c(Landroidx/work/WorkerParameters$a;)LWG6$c;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, LWG6$c;->j:Landroidx/work/WorkerParameters$a;

    :cond_0
    return-object p0
.end method

.method public d(Ljava/util/List;)LWG6$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxm5;",
            ">;)",
            "LWG6$c;"
        }
    .end annotation

    iput-object p1, p0, LWG6$c;->h:Ljava/util/List;

    return-object p0
.end method
