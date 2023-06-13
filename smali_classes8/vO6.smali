.class public LvO6;
.super LKN6;
.source "SourceFile"


# static fields
.field public static p:LvO6;


# instance fields
.field public c:Lorg/json/JSONObject;

.field public d:Lorg/json/JSONArray;

.field public e:Lorg/json/JSONArray;

.field public f:Z

.field public g:I

.field public h:Z

.field public i:Z

.field public j:I

.field public k:Ljava/lang/String;

.field public l:LWM6;

.field public m:LVF2;

.field public n:Landroid/os/Handler;

.field public o:Ljava/util/Timer;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LKN6;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, LvO6;->c:Lorg/json/JSONObject;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, LvO6;->d:Lorg/json/JSONArray;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, LvO6;->e:Lorg/json/JSONArray;

    const/4 v0, 0x0

    iput-boolean v0, p0, LvO6;->f:Z

    iput v0, p0, LvO6;->g:I

    iput-boolean v0, p0, LvO6;->h:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LvO6;->i:Z

    iput v0, p0, LvO6;->j:I

    const-string v0, ""

    iput-object v0, p0, LvO6;->k:Ljava/lang/String;

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, LvO6;->o:Ljava/util/Timer;

    return-void
.end method

.method public static declared-synchronized r()LvO6;
    .locals 2

    const-class v0, LvO6;

    monitor-enter v0

    :try_start_0
    sget-object v1, LvO6;->p:LvO6;

    if-nez v1, :cond_0

    new-instance v1, LvO6;

    invoke-direct {v1}, LvO6;-><init>()V

    sput-object v1, LvO6;->p:LvO6;

    :cond_0
    sget-object v1, LvO6;->p:LvO6;
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

    iput-object p1, p0, LvO6;->l:LWM6;

    iput-object p2, p0, LvO6;->m:LVF2;

    iput-object p3, p0, LvO6;->n:Landroid/os/Handler;

    return-void
.end method
