.class public final Lhi9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lhi9;


# instance fields
.field public final a:LMi9;

.field public final b:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhi9;

    invoke-direct {v0}, Lhi9;-><init>()V

    sput-object v0, Lhi9;->c:Lhi9;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lhi9;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Lgf9;

    invoke-direct {v0}, Lgf9;-><init>()V

    iput-object v0, p0, Lhi9;->a:LMi9;

    return-void
.end method

.method public static a()Lhi9;
    .locals 1

    sget-object v0, Lhi9;->c:Lhi9;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)LEi9;
    .locals 2

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lkc9;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v1, p0, Lhi9;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEi9;

    if-nez v1, :cond_1

    iget-object v1, p0, Lhi9;->a:LMi9;

    invoke-interface {v1, p1}, LMi9;->zza(Ljava/lang/Class;)LEi9;

    move-result-object v1

    invoke-static {p1, v0}, Lkc9;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {v1, v0}, Lkc9;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lhi9;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEi9;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method
