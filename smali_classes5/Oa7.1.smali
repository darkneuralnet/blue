.class public final LOa7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:LOa7;

.field public static final c:LOa7;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LOa7;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LOa7;-><init>(Z)V

    sput-object v0, LOa7;->c:LOa7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LOa7;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LOa7;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()LOa7;
    .locals 1

    sget-object v0, LOa7;->c:LOa7;

    return-object v0
.end method

.method public static b()LOa7;
    .locals 2

    sget-object v0, LOa7;->b:LOa7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, LOa7;

    monitor-enter v0

    :try_start_0
    sget-object v1, LOa7;->b:LOa7;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    const-class v1, LOa7;

    invoke-static {v1}, LYa7;->b(Ljava/lang/Class;)LOa7;

    move-result-object v1

    sput-object v1, LOa7;->b:LOa7;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final c(LTb7;I)Leb7;
    .locals 2

    iget-object v0, p0, LOa7;->a:Ljava/util/Map;

    new-instance v1, LNa7;

    invoke-direct {v1, p1, p2}, LNa7;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb7;

    return-object p1
.end method
