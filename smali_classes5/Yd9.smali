.class public final LYd9;
.super LCe9;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, LYd9;->c:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCe9;-><init>(Lve9;)V

    return-void
.end method

.method public synthetic constructor <init>(LQd9;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LCe9;-><init>(Lve9;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;J)V
    .locals 3

    invoke-static {p1, p2, p3}, Lwm9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    instance-of v1, v0, LId9;

    if-eqz v1, :cond_0

    check-cast v0, LId9;

    invoke-interface {v0}, LId9;->zze()LId9;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, LYd9;->c:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    instance-of v1, v0, LZh9;

    if-eqz v1, :cond_3

    instance-of v1, v0, Ldc9;

    if-eqz v1, :cond_3

    check-cast v0, Ldc9;

    invoke-interface {v0}, Ldc9;->zzc()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v0}, Ldc9;->zzb()V

    :cond_2
    return-void

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-static {p1, p2, p3, v0}, Lwm9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 4

    invoke-static {p2, p3, p4}, Lwm9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, p3, p4}, Lwm9;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    instance-of v2, v1, LId9;

    if-eqz v2, :cond_0

    new-instance v1, LYc9;

    invoke-direct {v1, v0}, LYc9;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v2, v1, LZh9;

    if-eqz v2, :cond_1

    instance-of v2, v1, Ldc9;

    if-eqz v2, :cond_1

    check-cast v1, Ldc9;

    invoke-interface {v1, v0}, Ldc9;->d(I)Ldc9;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-static {p1, p3, p4, v1}, Lwm9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_2

    :cond_2
    sget-object v2, LYd9;->c:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {p1, p3, p4, v2}, Lwm9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_1
    move-object v1, v2

    goto :goto_2

    :cond_3
    instance-of v2, v1, LSl9;

    if-eqz v2, :cond_4

    new-instance v2, LYc9;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v0

    invoke-direct {v2, v3}, LYc9;-><init>(I)V

    check-cast v1, LSl9;

    invoke-virtual {v2}, LYc9;->size()I

    move-result v0

    invoke-virtual {v2, v0, v1}, LS39;->addAll(ILjava/util/Collection;)Z

    invoke-static {p1, p3, p4, v2}, Lwm9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_4
    instance-of v2, v1, LZh9;

    if-eqz v2, :cond_5

    instance-of v2, v1, Ldc9;

    if-eqz v2, :cond_5

    move-object v2, v1

    check-cast v2, Ldc9;

    invoke-interface {v2}, Ldc9;->zzc()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-interface {v2, v1}, Ldc9;->d(I)Ldc9;

    move-result-object v1

    invoke-static {p1, p3, p4, v1}, Lwm9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v0, :cond_6

    if-lez v2, :cond_6

    invoke-interface {v1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    if-gtz v0, :cond_7

    goto :goto_3

    :cond_7
    move-object p2, v1

    :goto_3
    invoke-static {p1, p3, p4, p2}, Lwm9;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
