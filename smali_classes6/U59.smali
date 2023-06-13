.class public abstract LU59;
.super Lk39;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<OutputT:",
        "Ljava/lang/Object;",
        ">",
        "Lk39<",
        "TOutputT;>;"
    }
.end annotation


# static fields
.field public static final k:Lw59;

.field public static final l:Ljava/util/logging/Logger;


# instance fields
.field public volatile i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public volatile j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const-class v0, LU59;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    sput-object v1, LU59;->l:Ljava/util/logging/Logger;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, LE59;

    const-class v3, Ljava/util/Set;

    const-string v4, "i"

    invoke-static {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    const-string v4, "j"

    invoke-static {v0, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LE59;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    new-instance v2, LM59;

    invoke-direct {v2, v1}, LM59;-><init>(Lo59;)V

    move-object v8, v0

    :goto_0
    sput-object v2, LU59;->k:Lw59;

    if-eqz v8, :cond_0

    sget-object v3, LU59;->l:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v5, "com.google.common.util.concurrent.AggregateFutureState"

    const-string v6, "<clinit>"

    const-string v7, "SafeAtomicHelper is broken!"

    invoke-virtual/range {v3 .. v8}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lk39;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LU59;->i:Ljava/util/Set;

    iput p1, p0, LU59;->j:I

    return-void
.end method

.method public static synthetic D(LU59;)I
    .locals 1

    iget v0, p0, LU59;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LU59;->j:I

    return v0
.end method

.method public static synthetic F(LU59;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LU59;->i:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic G(LU59;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    iput-object p1, p0, LU59;->i:Ljava/util/Set;

    return-object p1
.end method


# virtual methods
.method public final E()I
    .locals 1

    sget-object v0, LU59;->k:Lw59;

    invoke-virtual {v0, p0}, Lw59;->a(LU59;)I

    move-result v0

    return v0
.end method

.method public final H()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LU59;->i:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v0}, LU59;->J(Ljava/util/Set;)V

    sget-object v1, LU59;->k:Lw59;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, v0}, Lw59;->b(LU59;Ljava/util/Set;Ljava/util/Set;)V

    iget-object v0, p0, LU59;->i:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-object v0
.end method

.method public final I()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LU59;->i:Ljava/util/Set;

    return-void
.end method

.method public abstract J(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation
.end method
