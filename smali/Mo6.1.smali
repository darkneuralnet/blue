.class public final LMo6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lzb4;",
            "Lyp6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Landroid/util/Size;",
            "Lzb4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lyp6;

.field public final d:Lyp6;

.field public final e:Lkc1;


# direct methods
.method public constructor <init>(LKb0;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LMo6;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/TreeMap;

    new-instance v1, LTp0;

    invoke-direct {v1}, LTp0;-><init>()V

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, LMo6;->b:Ljava/util/TreeMap;

    invoke-interface {p1}, LKb0;->k()LTe4;

    move-result-object v0

    new-instance v1, LML4;

    invoke-interface {p1}, LKb0;->g()Lkc1;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LML4;-><init>(Lkc1;LTe4;)V

    iput-object v1, p0, LMo6;->e:Lkc1;

    invoke-static {}, Lzb4;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "VideoCapabilities"

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzb4;

    invoke-virtual {p0, p1, v1}, LMo6;->e(LKb0;Lzb4;)Llc1;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "profiles = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, LMo6;->i(Llc1;)Lyp6;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EncoderProfiles of quality "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has no video validated profiles."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lyp6;->h()Llc1$c;

    move-result-object v2

    new-instance v4, Landroid/util/Size;

    invoke-virtual {v2}, Llc1$c;->k()I

    move-result v5

    invoke-virtual {v2}, Llc1$c;->h()I

    move-result v2

    invoke-direct {v4, v5, v2}, Landroid/util/Size;-><init>(II)V

    iget-object v2, p0, LMo6;->b:Ljava/util/TreeMap;

    invoke-virtual {v2, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LMo6;->a:Ljava/util/Map;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object p1, p0, LMo6;->a:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "No supported EncoderProfiles"

    invoke-static {v2, p1}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, LMo6;->d:Lyp6;

    iput-object p1, p0, LMo6;->c:Lyp6;

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/util/ArrayDeque;

    iget-object v0, p0, LMo6;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1}, Ljava/util/Deque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyp6;

    iput-object v0, p0, LMo6;->c:Lyp6;

    invoke-interface {p1}, Ljava/util/Deque;->peekLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyp6;

    iput-object p1, p0, LMo6;->d:Lyp6;

    :goto_1
    return-void
.end method

.method public static a(Lzb4;)V
    .locals 3

    invoke-static {p0}, Lzb4;->a(Lzb4;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown quality: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, LHZ3;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public static d(LJb0;)LMo6;
    .locals 1

    new-instance v0, LMo6;

    check-cast p0, LKb0;

    invoke-direct {v0, p0}, LMo6;-><init>(LKb0;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroid/util/Size;)Lyp6;
    .locals 3

    invoke-virtual {p0, p1}, LMo6;->c(Landroid/util/Size;)Lzb4;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Using supported quality of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "VideoCapabilities"

    invoke-static {v1, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lzb4;->g:Lzb4;

    if-eq v0, p1, :cond_1

    invoke-virtual {p0, v0}, LMo6;->f(Lzb4;)Lyp6;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Camera advertised available quality but did not produce EncoderProfiles for advertised quality."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public c(Landroid/util/Size;)Lzb4;
    .locals 1

    iget-object v0, p0, LMo6;->b:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzb4;

    return-object p1

    :cond_0
    iget-object v0, p0, LMo6;->b:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzb4;

    return-object p1

    :cond_1
    sget-object p1, Lzb4;->g:Lzb4;

    return-object p1
.end method

.method public final e(LKb0;Lzb4;)Llc1;
    .locals 2

    instance-of v0, p2, Lzb4$b;

    const-string v1, "Currently only support ConstantQuality"

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lzb4$b;

    invoke-virtual {v0}, Lzb4$b;->d()I

    move-result v0

    iget-object v1, p0, LMo6;->e:Lkc1;

    invoke-interface {v1, v0}, Lkc1;->b(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1, p2}, LMo6;->h(LKb0;Lzb4;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LMo6;->e:Lkc1;

    invoke-interface {p1, v0}, Lkc1;->a(I)Llc1;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Lzb4;)Lyp6;
    .locals 1

    invoke-static {p1}, LMo6;->a(Lzb4;)V

    sget-object v0, Lzb4;->f:Lzb4;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LMo6;->c:Lyp6;

    return-object p1

    :cond_0
    sget-object v0, Lzb4;->e:Lzb4;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LMo6;->d:Lyp6;

    return-object p1

    :cond_1
    iget-object v0, p0, LMo6;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyp6;

    return-object p1
.end method

.method public g()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzb4;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, LMo6;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final h(LKb0;Lzb4;)Z
    .locals 3

    const-class v0, Lup6;

    invoke-static {v0}, LQ21;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lup6;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2}, Lup6;->b(LKb0;Lzb4;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Lup6;->a()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final i(Llc1;)Lyp6;
    .locals 1

    invoke-interface {p1}, Llc1;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Lyp6;->f(Llc1;)Lyp6;

    move-result-object p1

    return-object p1
.end method
