.class public final Lcom/uber/rxdogtag/M$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/uber/rxdogtag/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/uber/rxdogtag/E;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/uber/rxdogtag/M$a;->a:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/uber/rxdogtag/M$a;->b:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/uber/rxdogtag/M$a;->c:Ljava/util/List;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Lcom/uber/rxdogtag/M$a;->d:Ljava/util/Set;

    iput-boolean v0, p0, Lcom/uber/rxdogtag/M$a;->e:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Collection;)Lcom/uber/rxdogtag/M$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/uber/rxdogtag/M$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/M$a;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public b(Ljava/util/Collection;)Lcom/uber/rxdogtag/M$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/uber/rxdogtag/E;",
            ">;)",
            "Lcom/uber/rxdogtag/M$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/M$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public varargs c([Lcom/uber/rxdogtag/E;)Lcom/uber/rxdogtag/M$a;
    .locals 0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/uber/rxdogtag/M$a;->b(Ljava/util/Collection;)Lcom/uber/rxdogtag/M$a;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/uber/rxdogtag/M$c;)Lcom/uber/rxdogtag/M$a;
    .locals 0

    invoke-interface {p1, p0}, Lcom/uber/rxdogtag/M$c;->a(Lcom/uber/rxdogtag/M$a;)V

    return-object p0
.end method

.method public e()V
    .locals 1

    new-instance v0, Lcom/uber/rxdogtag/M$b;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/M$b;-><init>(Lcom/uber/rxdogtag/M$a;)V

    invoke-static {v0}, Lcom/uber/rxdogtag/M;->h(Lcom/uber/rxdogtag/M$b;)V

    return-void
.end method
