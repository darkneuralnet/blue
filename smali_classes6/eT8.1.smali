.class public final LeT8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LeT8;


# instance fields
.field public final a:LfV8;

.field public final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class<",
            "*>;",
            "LzU8<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LeT8;

    invoke-direct {v0}, LeT8;-><init>()V

    sput-object v0, LeT8;->c:LeT8;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LeT8;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, LgO8;

    invoke-direct {v0}, LgO8;-><init>()V

    iput-object v0, p0, LeT8;->a:LfV8;

    return-void
.end method

.method public static a()LeT8;
    .locals 1

    sget-object v0, LeT8;->c:LeT8;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)LzU8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LzU8<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, LyI8;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v1, p0, LeT8;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LzU8;

    if-nez v1, :cond_0

    iget-object v1, p0, LeT8;->a:LfV8;

    invoke-interface {v1, p1}, LfV8;->zza(Ljava/lang/Class;)LzU8;

    move-result-object v1

    invoke-static {p1, v0}, LyI8;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {v1, v0}, LyI8;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LeT8;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LzU8;

    if-eqz p1, :cond_0

    move-object v1, p1

    :cond_0
    return-object v1
.end method

.method public final c(Ljava/lang/Object;)LzU8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LzU8<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, LeT8;->b(Ljava/lang/Class;)LzU8;

    move-result-object p1

    return-object p1
.end method
