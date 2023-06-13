.class public final LTQ8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:LTQ8;

.field public static final c:LTQ8;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LTQ8;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LTQ8;-><init>(Z)V

    sput-object v0, LTQ8;->c:LTQ8;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LTQ8;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LTQ8;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()LTQ8;
    .locals 2

    sget-object v0, LTQ8;->b:LTQ8;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, LTQ8;

    monitor-enter v0

    :try_start_0
    sget-object v1, LTQ8;->b:LTQ8;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    const-class v1, LTQ8;

    invoke-static {v1}, LyS8;->b(Ljava/lang/Class;)LTQ8;

    move-result-object v1

    sput-object v1, LTQ8;->b:LTQ8;

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
.method public final b(Lr19;I)LqT8;
    .locals 2

    iget-object v0, p0, LTQ8;->a:Ljava/util/Map;

    new-instance v1, LIQ8;

    invoke-direct {v1, p1, p2}, LIQ8;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LqT8;

    return-object p1
.end method
