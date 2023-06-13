.class public Lcom/google/android/gms/internal/vision/E;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/vision/E$a;
    }
.end annotation


# static fields
.field public static volatile b:Lcom/google/android/gms/internal/vision/E;

.field public static volatile c:Lcom/google/android/gms/internal/vision/E;

.field public static final d:Lcom/google/android/gms/internal/vision/E;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/internal/vision/E$a;",
            "Lcom/google/android/gms/internal/vision/G$d<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/vision/E;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/vision/E;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/vision/E;->d:Lcom/google/android/gms/internal/vision/E;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/E;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/vision/E;->a:Ljava/util/Map;

    return-void
.end method

.method public static b()Lcom/google/android/gms/internal/vision/E;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/vision/E;->b:Lcom/google/android/gms/internal/vision/E;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/internal/vision/E;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/vision/E;->b:Lcom/google/android/gms/internal/vision/E;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/vision/E;->d:Lcom/google/android/gms/internal/vision/E;

    sput-object v0, Lcom/google/android/gms/internal/vision/E;->b:Lcom/google/android/gms/internal/vision/E;

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

.method public static c()Lcom/google/android/gms/internal/vision/E;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/vision/E;->c:Lcom/google/android/gms/internal/vision/E;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lcom/google/android/gms/internal/vision/E;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/vision/E;->c:Lcom/google/android/gms/internal/vision/E;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    const-class v1, Lcom/google/android/gms/internal/vision/E;

    invoke-static {v1}, LyG8;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/E;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/vision/E;->c:Lcom/google/android/gms/internal/vision/E;

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
.method public final a(LlQ8;I)Lcom/google/android/gms/internal/vision/G$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "LlQ8;",
            ">(TContainingType;I)",
            "Lcom/google/android/gms/internal/vision/G$d<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/E;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/vision/E$a;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/vision/E$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/vision/G$d;

    return-object p1
.end method
