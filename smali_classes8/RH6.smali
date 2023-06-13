.class public final LRH6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "LRH6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:LQH6;

.field public final b:I

.field public final c:I

.field public final d:LN;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Lnw6;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    sget-object v3, LhY2;->c:LN;

    const/16 v4, 0xa

    invoke-direct {v2, v4, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    const/16 v5, 0x10

    invoke-direct {v2, v5, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x3

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    const/16 v6, 0x14

    invoke-direct {v2, v6, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    sget-object v3, LhY2;->e:LN;

    invoke-direct {v2, v4, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x5

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    invoke-direct {v2, v5, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    invoke-direct {v2, v6, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x7

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    sget-object v3, LhY2;->m:LN;

    invoke-direct {v2, v4, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x8

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    invoke-direct {v2, v5, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    invoke-direct {v2, v6, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    sget-object v3, LhY2;->n:LN;

    invoke-direct {v2, v4, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xb

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    invoke-direct {v2, v5, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xc

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LRH6;

    invoke-direct {v2, v6, v3}, LRH6;-><init>(ILN;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LRH6;->i:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(ILN;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    if-lt p1, v0, :cond_1

    if-eqz p2, :cond_0

    iput p1, p0, LRH6;->b:I

    invoke-virtual {p0}, LRH6;->a()I

    move-result v0

    iput v0, p0, LRH6;->c:I

    invoke-static {p2}, LR31;->b(LN;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LRH6;->f:Ljava/lang/String;

    iput-object p2, p0, LRH6;->d:LN;

    new-instance v1, Lnw6;

    invoke-direct {v1, p2}, Lnw6;-><init>(LN;)V

    iput-object v1, p0, LRH6;->h:Lnw6;

    invoke-virtual {v1}, Lnw6;->c()I

    move-result p2

    iput p2, p0, LRH6;->g:I

    invoke-virtual {v1}, Lnw6;->d()I

    move-result v2

    iput v2, p0, LRH6;->e:I

    invoke-virtual {v1}, Lnw6;->a()I

    move-result v1

    invoke-static {v0, p2, v2, v1, p1}, LZY0;->c(Ljava/lang/String;IIII)LZY0;

    move-result-object p1

    iput-object p1, p0, LRH6;->a:LQH6;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "digest == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "height must be >= 2"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(ILP31;)V
    .locals 0

    invoke-interface {p2}, LP31;->d()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LR31;->c(Ljava/lang/String;)LN;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LRH6;-><init>(ILN;)V

    return-void
.end method

.method public static k(I)LRH6;
    .locals 1

    sget-object v0, LRH6;->i:Ljava/util/Map;

    invoke-static {p0}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LRH6;

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 3

    const/4 v0, 0x2

    move v1, v0

    :goto_0
    iget v2, p0, LRH6;->b:I

    if-gt v1, v2, :cond_1

    sub-int/2addr v2, v1

    rem-int/2addr v2, v0

    if-nez v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "should never happen..."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LRH6;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LRH6;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LRH6;->h:Lnw6;

    invoke-virtual {v0}, Lnw6;->a()I

    move-result v0

    return v0
.end method

.method public e()LQH6;
    .locals 1

    iget-object v0, p0, LRH6;->a:LQH6;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LRH6;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()LN;
    .locals 1

    iget-object v0, p0, LRH6;->d:LN;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LRH6;->g:I

    return v0
.end method

.method public i()Llw6;
    .locals 2

    new-instance v0, Llw6;

    iget-object v1, p0, LRH6;->h:Lnw6;

    invoke-direct {v0, v1}, Llw6;-><init>(Lnw6;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, LRH6;->e:I

    return v0
.end method
