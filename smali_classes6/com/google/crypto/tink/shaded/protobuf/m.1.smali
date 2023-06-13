.class public Lcom/google/crypto/tink/shaded/protobuf/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/m$a;
    }
.end annotation


# static fields
.field public static b:Z = true

.field public static volatile c:Lcom/google/crypto/tink/shaded/protobuf/m;

.field public static final d:Lcom/google/crypto/tink/shaded/protobuf/m;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/crypto/tink/shaded/protobuf/m$a;",
            "Lcom/google/crypto/tink/shaded/protobuf/t$e<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;-><init>(Z)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/m;->d:Lcom/google/crypto/tink/shaded/protobuf/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/m;->a:Ljava/util/Map;

    return-void
.end method

.method public static b()Lcom/google/crypto/tink/shaded/protobuf/m;
    .locals 2

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/m;->c:Lcom/google/crypto/tink/shaded/protobuf/m;

    if-nez v0, :cond_2

    const-class v1, Lcom/google/crypto/tink/shaded/protobuf/m;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/m;->c:Lcom/google/crypto/tink/shaded/protobuf/m;

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/google/crypto/tink/shaded/protobuf/m;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, LGi1;->a()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/m;->d:Lcom/google/crypto/tink/shaded/protobuf/m;

    :goto_0
    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/m;->c:Lcom/google/crypto/tink/shaded/protobuf/m;

    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/crypto/tink/shaded/protobuf/F;I)Lcom/google/crypto/tink/shaded/protobuf/t$e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lcom/google/crypto/tink/shaded/protobuf/F;",
            ">(TContainingType;I)",
            "Lcom/google/crypto/tink/shaded/protobuf/t$e<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/m$a;

    invoke-direct {v1, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t$e;

    return-object p1
.end method
