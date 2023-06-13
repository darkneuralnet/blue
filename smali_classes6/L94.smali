.class public final LL94;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LL94;


# instance fields
.field public final a:LKm5;

.field public final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class<",
            "*>;",
            "LJm5<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LL94;

    invoke-direct {v0}, LL94;-><init>()V

    sput-object v0, LL94;->c:LL94;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LL94;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, LSJ2;

    invoke-direct {v0}, LSJ2;-><init>()V

    iput-object v0, p0, LL94;->a:LKm5;

    return-void
.end method

.method public static a()LL94;
    .locals 1

    sget-object v0, LL94;->c:LL94;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Class;LJm5;)LJm5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "LJm5<",
            "*>;)",
            "LJm5<",
            "*>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/protobuf/t;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {p2, v0}, Lcom/google/protobuf/t;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LL94;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJm5;

    return-object p1
.end method

.method public c(Ljava/lang/Class;)LJm5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LJm5<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/protobuf/t;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LL94;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJm5;

    if-nez v0, :cond_0

    iget-object v0, p0, LL94;->a:LKm5;

    invoke-interface {v0, p1}, LKm5;->a(Ljava/lang/Class;)LJm5;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LL94;->b(Ljava/lang/Class;LJm5;)LJm5;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    :cond_0
    return-object v0
.end method

.method public d(Ljava/lang/Object;)LJm5;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LJm5<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, LL94;->c(Ljava/lang/Class;)LJm5;

    move-result-object p1

    return-object p1
.end method
