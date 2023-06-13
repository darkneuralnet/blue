.class public LrN5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LrN5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LrN5;",
        ">;"
    }
.end annotation


# static fields
.field public static s:I = 0x1


# instance fields
.field public b:Z

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:Z

.field public i:[F

.field public j:[F

.field public k:LrN5$a;

.field public l:[Lxo;

.field public m:I

.field public n:I

.field public o:Z

.field public p:I

.field public q:F

.field public r:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lxo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LrN5$a;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, -0x1

    iput p2, p0, LrN5;->d:I

    iput p2, p0, LrN5;->e:I

    const/4 v0, 0x0

    iput v0, p0, LrN5;->f:I

    iput-boolean v0, p0, LrN5;->h:Z

    const/16 v1, 0x9

    new-array v2, v1, [F

    iput-object v2, p0, LrN5;->i:[F

    new-array v1, v1, [F

    iput-object v1, p0, LrN5;->j:[F

    const/16 v1, 0x10

    new-array v1, v1, [Lxo;

    iput-object v1, p0, LrN5;->l:[Lxo;

    iput v0, p0, LrN5;->m:I

    iput v0, p0, LrN5;->n:I

    iput-boolean v0, p0, LrN5;->o:Z

    iput p2, p0, LrN5;->p:I

    const/4 p2, 0x0

    iput p2, p0, LrN5;->q:F

    const/4 p2, 0x0

    iput-object p2, p0, LrN5;->r:Ljava/util/HashSet;

    iput-object p1, p0, LrN5;->k:LrN5$a;

    return-void
.end method

.method public static c()V
    .locals 1

    sget v0, LrN5;->s:I

    add-int/lit8 v0, v0, 0x1

    sput v0, LrN5;->s:I

    return-void
.end method


# virtual methods
.method public final a(Lxo;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LrN5;->m:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LrN5;->l:[Lxo;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LrN5;->l:[Lxo;

    array-length v2, v0

    if-lt v1, v2, :cond_2

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxo;

    iput-object v0, p0, LrN5;->l:[Lxo;

    :cond_2
    iget-object v0, p0, LrN5;->l:[Lxo;

    iget v1, p0, LrN5;->m:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LrN5;->m:I

    return-void
.end method

.method public b(LrN5;)I
    .locals 1

    iget v0, p0, LrN5;->d:I

    iget p1, p1, LrN5;->d:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LrN5;

    invoke-virtual {p0, p1}, LrN5;->b(LrN5;)I

    move-result p1

    return p1
.end method

.method public final d(Lxo;)V
    .locals 4

    iget v0, p0, LrN5;->m:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, LrN5;->l:[Lxo;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v1, p1, :cond_0

    iget-object p1, p0, LrN5;->l:[Lxo;

    add-int/lit8 v2, v1, 0x1

    aget-object v3, p1, v2

    aput-object v3, p1, v1

    move v1, v2

    goto :goto_1

    :cond_0
    iget p1, p0, LrN5;->m:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LrN5;->m:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public e()V
    .locals 6

    const/4 v0, 0x0

    iput-object v0, p0, LrN5;->c:Ljava/lang/String;

    sget-object v1, LrN5$a;->f:LrN5$a;

    iput-object v1, p0, LrN5;->k:LrN5$a;

    const/4 v1, 0x0

    iput v1, p0, LrN5;->f:I

    const/4 v2, -0x1

    iput v2, p0, LrN5;->d:I

    iput v2, p0, LrN5;->e:I

    const/4 v3, 0x0

    iput v3, p0, LrN5;->g:F

    iput-boolean v1, p0, LrN5;->h:Z

    iput-boolean v1, p0, LrN5;->o:Z

    iput v2, p0, LrN5;->p:I

    iput v3, p0, LrN5;->q:F

    iget v2, p0, LrN5;->m:I

    move v4, v1

    :goto_0
    if-ge v4, v2, :cond_0

    iget-object v5, p0, LrN5;->l:[Lxo;

    aput-object v0, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, LrN5;->m:I

    iput v1, p0, LrN5;->n:I

    iput-boolean v1, p0, LrN5;->b:Z

    iget-object v0, p0, LrN5;->j:[F

    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method

.method public f(LLr2;F)V
    .locals 3

    iput p2, p0, LrN5;->g:F

    const/4 p2, 0x1

    iput-boolean p2, p0, LrN5;->h:Z

    const/4 p2, 0x0

    iput-boolean p2, p0, LrN5;->o:Z

    const/4 v0, -0x1

    iput v0, p0, LrN5;->p:I

    const/4 v1, 0x0

    iput v1, p0, LrN5;->q:F

    iget v1, p0, LrN5;->m:I

    iput v0, p0, LrN5;->e:I

    move v0, p2

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, LrN5;->l:[Lxo;

    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p0, p2}, Lxo;->A(LLr2;LrN5;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, LrN5;->m:I

    return-void
.end method

.method public g(LrN5$a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LrN5;->k:LrN5$a;

    return-void
.end method

.method public final h(LLr2;Lxo;)V
    .locals 4

    iget v0, p0, LrN5;->m:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, LrN5;->l:[Lxo;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Lxo;->B(LLr2;Lxo;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, LrN5;->m:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LrN5;->c:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LrN5;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LrN5;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
