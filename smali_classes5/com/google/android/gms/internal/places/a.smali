.class public Lcom/google/android/gms/internal/places/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/places/a$a;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static volatile c:Lcom/google/android/gms/internal/places/a;

.field public static final d:Lcom/google/android/gms/internal/places/a;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/internal/places/a$a;",
            "Lcom/google/android/gms/internal/places/c$e<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/places/a;->a()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/places/a;->b:Ljava/lang/Class;

    new-instance v0, Lcom/google/android/gms/internal/places/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/places/a;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/places/a;->d:Lcom/google/android/gms/internal/places/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/places/a;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/places/a;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.google.protobuf.Extension"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b()Lcom/google/android/gms/internal/places/a;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/places/a;->c:Lcom/google/android/gms/internal/places/a;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/internal/places/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/places/a;->c:Lcom/google/android/gms/internal/places/a;

    if-nez v0, :cond_0

    invoke-static {}, LFt7;->b()Lcom/google/android/gms/internal/places/a;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/places/a;->c:Lcom/google/android/gms/internal/places/a;

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


# virtual methods
.method public final c(LzT7;I)Lcom/google/android/gms/internal/places/c$e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "LzT7;",
            ">(TContainingType;I)",
            "Lcom/google/android/gms/internal/places/c$e<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/a;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/places/a$a;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/places/a$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/places/c$e;

    return-object p1
.end method
