.class public Lcom/uber/rxdogtag/M$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/uber/rxdogtag/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final f:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lcom/uber/rxdogtag/E;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/uber/rxdogtag/E;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Z

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-class v1, Lio/reactivex/Observable;

    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/uber/rxdogtag/DogTagObserver;

    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/uber/rxdogtag/M$b;->f:Ljava/util/Collection;

    new-instance v0, Lcom/uber/rxdogtag/M$b$a;

    invoke-direct {v0}, Lcom/uber/rxdogtag/M$b$a;-><init>()V

    sput-object v0, Lcom/uber/rxdogtag/M$b;->g:Lcom/uber/rxdogtag/E;

    return-void
.end method

.method public constructor <init>(Lcom/uber/rxdogtag/M$a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lcom/uber/rxdogtag/M$a;->b:Z

    iput-boolean v0, p0, Lcom/uber/rxdogtag/M$b;->a:Z

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/uber/rxdogtag/M$a;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object v1, Lcom/uber/rxdogtag/M$b;->g:Lcom/uber/rxdogtag/E;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p1, Lcom/uber/rxdogtag/M$a;->d:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    sget-object v2, Lcom/uber/rxdogtag/M$b;->f:Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/uber/rxdogtag/M$b;->b:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/uber/rxdogtag/M$b;->c:Ljava/util/Set;

    iget-boolean v0, p1, Lcom/uber/rxdogtag/M$a;->e:Z

    iput-boolean v0, p0, Lcom/uber/rxdogtag/M$b;->d:Z

    iget-boolean p1, p1, Lcom/uber/rxdogtag/M$a;->a:Z

    iput-boolean p1, p0, Lcom/uber/rxdogtag/M$b;->e:Z

    return-void
.end method
