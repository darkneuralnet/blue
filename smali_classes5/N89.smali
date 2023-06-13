.class public final LN89;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:LN89;

.field public static final c:LN89;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LN89;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LN89;-><init>(Z)V

    sput-object v0, LN89;->c:LN89;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LN89;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LN89;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()LN89;
    .locals 2

    sget-object v0, LN89;->b:LN89;

    if-nez v0, :cond_1

    const-class v1, LN89;

    monitor-enter v1

    :try_start_0
    sget-object v0, LN89;->b:LN89;

    if-nez v0, :cond_0

    sget-object v0, LN89;->c:LN89;

    sput-object v0, LN89;->b:LN89;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static b()LN89;
    .locals 1

    new-instance v0, LN89;

    invoke-direct {v0}, LN89;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final c(Lpg9;I)Lhb9;
    .locals 2

    iget-object v0, p0, LN89;->a:Ljava/util/Map;

    new-instance v1, LF89;

    invoke-direct {v1, p1, p2}, LF89;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhb9;

    return-object p1
.end method

.method public final d(Lhb9;)V
    .locals 4

    iget-object v0, p0, LN89;->a:Ljava/util/Map;

    new-instance v1, LF89;

    iget-object v2, p1, Lhb9;->a:Lpg9;

    const v3, 0xc0b2142

    invoke-direct {v1, v2, v3}, LF89;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
