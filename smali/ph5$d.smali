.class public Lph5$d;
.super Lph5$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lph5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lph5$f<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public b:Lph5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lph5$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public final synthetic d:Lph5;


# direct methods
.method public constructor <init>(Lph5;)V
    .locals 0

    iput-object p1, p0, Lph5$d;->d:Lph5;

    invoke-direct {p0}, Lph5$f;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lph5$d;->c:Z

    return-void
.end method


# virtual methods
.method public a(Lph5$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lph5$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lph5$d;->b:Lph5$c;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Lph5$c;->e:Lph5$c;

    iput-object p1, p0, Lph5$d;->b:Lph5$c;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lph5$d;->c:Z

    :cond_1
    return-void
.end method

.method public b()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lph5$d;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lph5$d;->c:Z

    iget-object v0, p0, Lph5$d;->d:Lph5;

    iget-object v0, v0, Lph5;->b:Lph5$c;

    iput-object v0, p0, Lph5$d;->b:Lph5$c;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lph5$d;->b:Lph5$c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lph5$c;->d:Lph5$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lph5$d;->b:Lph5$c;

    :goto_1
    iget-object v0, p0, Lph5$d;->b:Lph5$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, Lph5$d;->c:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lph5$d;->d:Lph5;

    iget-object v0, v0, Lph5;->b:Lph5$c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    iget-object v0, p0, Lph5$d;->b:Lph5$c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lph5$c;->d:Lph5$c;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lph5$d;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
