.class public LCj2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCj2$s;
    }
.end annotation


# static fields
.field public static final c:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "LSg2;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "LSg2;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "LKg2;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "LJg2;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final h:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "Ljava/lang/Enum<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final i:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final j:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:LEj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEj2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "LEj2<",
            "*>;>;"
        }
    .end annotation
.end field

.field public b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "LCj2$s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LCj2$j;

    invoke-direct {v0}, LCj2$j;-><init>()V

    sput-object v0, LCj2;->c:LEj2;

    new-instance v0, LCj2$k;

    invoke-direct {v0}, LCj2$k;-><init>()V

    sput-object v0, LCj2;->d:LEj2;

    new-instance v0, LCj2$l;

    invoke-direct {v0}, LCj2$l;-><init>()V

    sput-object v0, LCj2;->e:LEj2;

    new-instance v0, LCj2$m;

    invoke-direct {v0}, LCj2$m;-><init>()V

    sput-object v0, LCj2;->f:LEj2;

    new-instance v0, LCj2$n;

    invoke-direct {v0}, LCj2$n;-><init>()V

    sput-object v0, LCj2;->g:LEj2;

    new-instance v0, LCj2$o;

    invoke-direct {v0}, LCj2$o;-><init>()V

    sput-object v0, LCj2;->h:LEj2;

    new-instance v0, LCj2$p;

    invoke-direct {v0}, LCj2$p;-><init>()V

    sput-object v0, LCj2;->i:LEj2;

    new-instance v0, LjG;

    invoke-direct {v0}, LjG;-><init>()V

    sput-object v0, LCj2;->j:LEj2;

    new-instance v0, LiG;

    invoke-direct {v0}, LiG;-><init>()V

    sput-object v0, LCj2;->k:LEj2;

    new-instance v0, Lzo;

    invoke-direct {v0}, Lzo;-><init>()V

    sput-object v0, LCj2;->l:LEj2;

    new-instance v0, LCj2$q;

    invoke-direct {v0}, LCj2$q;-><init>()V

    sput-object v0, LCj2;->m:LEj2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LCj2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, LCj2;->b:Ljava/util/LinkedList;

    invoke-virtual {p0}, LCj2;->c()V

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Appendable;LTg2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p0, :cond_0

    const-string p0, "null"

    invoke-interface {p2, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p0}, LTg2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p2, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_1
    const/16 v0, 0x22

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    invoke-static {p0, p2, p3}, LVg2;->a(Ljava/lang/String;Ljava/lang/Appendable;LTg2;)V

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_0
    invoke-virtual {p3, p2}, LTg2;->k(Ljava/lang/Appendable;)V

    instance-of p0, p1, Ljava/lang/String;

    if-eqz p0, :cond_2

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p3, p2, p1}, LTg2;->p(Ljava/lang/Appendable;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-static {p1, p2, p3}, LVg2;->b(Ljava/lang/Object;Ljava/lang/Appendable;LTg2;)V

    :goto_1
    invoke-virtual {p3, p2}, LTg2;->j(Ljava/lang/Appendable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)LEj2;
    .locals 1

    iget-object v0, p0, LCj2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEj2;

    return-object p1
.end method

.method public b(Ljava/lang/Class;)LEj2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LEj2;"
        }
    .end annotation

    iget-object v0, p0, LCj2;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCj2$s;

    iget-object v2, v1, LCj2$s;->a:Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, v1, LCj2$s;->b:LEj2;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public c()V
    .locals 6

    new-instance v0, LCj2$r;

    invoke-direct {v0, p0}, LCj2$r;-><init>(LCj2;)V

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v2}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v0, LCj2$a;

    invoke-direct {v0, p0}, LCj2$a;-><init>(LCj2;)V

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Double;

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v2}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v0, LCj2$b;

    invoke-direct {v0, p0}, LCj2$b;-><init>(LCj2;)V

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/util/Date;

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v2}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v0, LCj2$c;

    invoke-direct {v0, p0}, LCj2$c;-><init>(LCj2;)V

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Float;

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v2}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    sget-object v0, LCj2;->m:LEj2;

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Integer;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/Long;

    aput-object v3, v2, v1

    const/4 v3, 0x2

    const-class v5, Ljava/lang/Byte;

    aput-object v5, v2, v3

    const/4 v3, 0x3

    const-class v5, Ljava/lang/Short;

    aput-object v5, v2, v3

    const/4 v3, 0x4

    const-class v5, Ljava/math/BigInteger;

    aput-object v5, v2, v3

    const/4 v3, 0x5

    const-class v5, Ljava/math/BigDecimal;

    aput-object v5, v2, v3

    invoke-virtual {p0, v0, v2}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Boolean;

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v2}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v2, LCj2$d;

    invoke-direct {v2, p0}, LCj2$d;-><init>(LCj2;)V

    new-array v3, v1, [Ljava/lang/Class;

    const-class v5, [I

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v2, LCj2$e;

    invoke-direct {v2, p0}, LCj2$e;-><init>(LCj2;)V

    new-array v3, v1, [Ljava/lang/Class;

    const-class v5, [S

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v2, LCj2$f;

    invoke-direct {v2, p0}, LCj2$f;-><init>(LCj2;)V

    new-array v3, v1, [Ljava/lang/Class;

    const-class v5, [J

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v2, LCj2$g;

    invoke-direct {v2, p0}, LCj2$g;-><init>(LCj2;)V

    new-array v3, v1, [Ljava/lang/Class;

    const-class v5, [F

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v2, LCj2$h;

    invoke-direct {v2, p0}, LCj2$h;-><init>(LCj2;)V

    new-array v3, v1, [Ljava/lang/Class;

    const-class v5, [D

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    new-instance v2, LCj2$i;

    invoke-direct {v2, p0}, LCj2$i;-><init>(LCj2;)V

    new-array v1, v1, [Ljava/lang/Class;

    const-class v3, [Z

    aput-object v3, v1, v4

    invoke-virtual {p0, v2, v1}, LCj2;->d(LEj2;[Ljava/lang/Class;)V

    const-class v1, LSg2;

    sget-object v2, LCj2;->d:LEj2;

    invoke-virtual {p0, v1, v2}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    const-class v1, LRg2;

    sget-object v2, LCj2;->c:LEj2;

    invoke-virtual {p0, v1, v2}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    const-class v1, LKg2;

    sget-object v2, LCj2;->e:LEj2;

    invoke-virtual {p0, v1, v2}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    const-class v1, LJg2;

    sget-object v2, LCj2;->f:LEj2;

    invoke-virtual {p0, v1, v2}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    const-class v1, Ljava/util/Map;

    sget-object v2, LCj2;->i:LEj2;

    invoke-virtual {p0, v1, v2}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    const-class v1, Ljava/lang/Iterable;

    sget-object v2, LCj2;->g:LEj2;

    invoke-virtual {p0, v1, v2}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    const-class v1, Ljava/lang/Enum;

    sget-object v2, LCj2;->h:LEj2;

    invoke-virtual {p0, v1, v2}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    const-class v1, Ljava/lang/Number;

    invoke-virtual {p0, v1, v0}, LCj2;->e(Ljava/lang/Class;LEj2;)V

    return-void
.end method

.method public varargs d(LEj2;[Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEj2<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    iget-object v3, p0, LCj2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/Class;LEj2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "LEj2<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LCj2;->f(Ljava/lang/Class;LEj2;)V

    return-void
.end method

.method public f(Ljava/lang/Class;LEj2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "LEj2<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LCj2;->b:Ljava/util/LinkedList;

    new-instance v1, LCj2$s;

    invoke-direct {v1, p1, p2}, LCj2$s;-><init>(Ljava/lang/Class;LEj2;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    return-void
.end method
