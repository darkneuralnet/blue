.class public LpO6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LpO6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static g:LpO6$a;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LpO6$a;->a:Z

    iput-boolean v0, p0, LpO6$a;->b:Z

    iput-boolean v0, p0, LpO6$a;->c:Z

    iput-boolean v0, p0, LpO6$a;->d:Z

    iput-boolean v0, p0, LpO6$a;->e:Z

    iput-boolean v0, p0, LpO6$a;->f:Z

    return-void
.end method

.method public static declared-synchronized a()LpO6$a;
    .locals 2

    const-class v0, LpO6$a;

    monitor-enter v0

    :try_start_0
    sget-object v1, LpO6$a;->g:LpO6$a;

    if-nez v1, :cond_0

    new-instance v1, LpO6$a;

    invoke-direct {v1}, LpO6$a;-><init>()V

    sput-object v1, LpO6$a;->g:LpO6$a;

    :cond_0
    sget-object v1, LpO6$a;->g:LpO6$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
