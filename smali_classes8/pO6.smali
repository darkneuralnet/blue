.class public LpO6;
.super LKN6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LpO6$a;
    }
.end annotation


# static fields
.field public static n:LpO6;


# instance fields
.field public c:Landroid/content/Context;

.field public d:LWM6;

.field public e:LVF2;

.field public f:Landroid/os/Handler;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:J

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:LpO6$a;

.field public m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/widget/EditText;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LKN6;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LpO6;->c:Landroid/content/Context;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LpO6;->g:Ljava/util/List;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LpO6;->h:J

    const/4 v0, 0x0

    iput-boolean v0, p0, LpO6;->i:Z

    iput-boolean v0, p0, LpO6;->j:Z

    iput-boolean v0, p0, LpO6;->k:Z

    invoke-static {}, LpO6$a;->a()LpO6$a;

    move-result-object v0

    iput-object v0, p0, LpO6;->l:LpO6$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LpO6;->m:Ljava/util/HashMap;

    return-void
.end method

.method public static declared-synchronized r()LpO6;
    .locals 2

    const-class v0, LpO6;

    monitor-enter v0

    :try_start_0
    sget-object v1, LpO6;->n:LpO6;

    if-nez v1, :cond_0

    new-instance v1, LpO6;

    invoke-direct {v1}, LpO6;-><init>()V

    sput-object v1, LpO6;->n:LpO6;

    :cond_0
    sget-object v1, LpO6;->n:LpO6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public d()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public q(LWM6;LVF2;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, LpO6;->d:LWM6;

    iput-object p2, p0, LpO6;->e:LVF2;

    iput-object p3, p0, LpO6;->f:Landroid/os/Handler;

    return-void
.end method
