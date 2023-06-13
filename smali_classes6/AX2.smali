.class public final LAX2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LAX2;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ldt5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LAX2;

    invoke-direct {v0}, LAX2;-><init>()V

    sput-object v0, LAX2;->b:LAX2;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ldt5$b;

    invoke-direct {v1}, Ldt5$b;-><init>()V

    invoke-virtual {v1}, Ldt5$b;->e()Ldt5;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a()LAX2;
    .locals 1

    sget-object v0, LAX2;->b:LAX2;

    return-object v0
.end method


# virtual methods
.method public b(Lat5;LMq5;)Lbk2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lat5;",
            ">(TSerializationT;",
            "LMq5;",
            ")",
            "Lbk2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldt5;

    invoke-virtual {v0, p1, p2}, Ldt5;->e(Lat5;LMq5;)Lbk2;

    move-result-object p1

    return-object p1
.end method

.method public c(LG94;LMq5;)Lbk2;
    .locals 1

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p0, p1, p2}, LAX2;->b(Lat5;LMq5;)Lbk2;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :try_start_1
    new-instance v0, Lgp2;

    invoke-direct {v0, p1, p2}, Lgp2;-><init>(LG94;LMq5;)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception p1

    new-instance p2, Lcom/google/crypto/tink/internal/TinkBugException;

    const-string v0, "Creating a LegacyProtoKey failed"

    invoke-direct {p2, v0, p1}, Lcom/google/crypto/tink/internal/TinkBugException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "access cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized d(LAk2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lat5;",
            ">(",
            "LAk2<",
            "TSerializationT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ldt5$b;

    iget-object v1, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldt5;

    invoke-direct {v0, v1}, Ldt5$b;-><init>(Ldt5;)V

    invoke-virtual {v0, p1}, Ldt5$b;->f(LAk2;)Ldt5$b;

    move-result-object p1

    invoke-virtual {p1}, Ldt5$b;->e()Ldt5;

    move-result-object p1

    iget-object v0, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(LGk2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lbk2;",
            "SerializationT::",
            "Lat5;",
            ">(",
            "LGk2<",
            "TKeyT;TSerializationT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ldt5$b;

    iget-object v1, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldt5;

    invoke-direct {v0, v1}, Ldt5$b;-><init>(Ldt5;)V

    invoke-virtual {v0, p1}, Ldt5$b;->g(LGk2;)Ldt5$b;

    move-result-object p1

    invoke-virtual {p1}, Ldt5$b;->e()Ldt5;

    move-result-object p1

    iget-object v0, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized f(LKE3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lat5;",
            ">(",
            "LKE3<",
            "TSerializationT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ldt5$b;

    iget-object v1, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldt5;

    invoke-direct {v0, v1}, Ldt5$b;-><init>(Ldt5;)V

    invoke-virtual {v0, p1}, Ldt5$b;->h(LKE3;)Ldt5$b;

    move-result-object p1

    invoke-virtual {p1}, Ldt5$b;->e()Ldt5;

    move-result-object p1

    iget-object v0, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized g(LLE3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "LJE3;",
            "SerializationT::",
            "Lat5;",
            ">(",
            "LLE3<",
            "TParametersT;TSerializationT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ldt5$b;

    iget-object v1, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldt5;

    invoke-direct {v0, v1}, Ldt5$b;-><init>(Ldt5;)V

    invoke-virtual {v0, p1}, Ldt5$b;->i(LLE3;)Ldt5$b;

    move-result-object p1

    invoke-virtual {p1}, Ldt5$b;->e()Ldt5;

    move-result-object p1

    iget-object v0, p0, LAX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
