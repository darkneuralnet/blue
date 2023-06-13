.class public final Lsk9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:Lsk9;

.field public static volatile c:Lsk9;

.field public static final d:Lsk9;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lmk9;",
            "Ltm9<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsk9;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lsk9;-><init>(Z)V

    sput-object v0, Lsk9;->d:Lsk9;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lsk9;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lsk9;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lsk9;
    .locals 2

    sget-object v0, Lsk9;->b:Lsk9;

    if-nez v0, :cond_1

    const-class v1, Lsk9;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lsk9;->b:Lsk9;

    if-nez v0, :cond_0

    sget-object v0, Lsk9;->d:Lsk9;

    sput-object v0, Lsk9;->b:Lsk9;

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

.method public static b()Lsk9;
    .locals 2

    sget-object v0, Lsk9;->c:Lsk9;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lsk9;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lsk9;->c:Lsk9;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    const-class v1, Lsk9;

    invoke-static {v1}, Lnl9;->b(Ljava/lang/Class;)Lsk9;

    move-result-object v1

    sput-object v1, Lsk9;->c:Lsk9;

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
.method public final c(LNp9;I)Ltm9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "LNp9;",
            ">(TContainingType;I)",
            "Ltm9<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lsk9;->a:Ljava/util/Map;

    new-instance v1, Lmk9;

    invoke-direct {v1, p1, p2}, Lmk9;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltm9;

    return-object p1
.end method
