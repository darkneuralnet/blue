.class public abstract Lp81;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgf$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp81$q;,
        Lp81$p;,
        Lp81$o;,
        Lp81$r;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lp81<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lgf$b;"
    }
.end annotation


# static fields
.field public static final m:Lp81$r;

.field public static final n:Lp81$r;

.field public static final o:Lp81$r;

.field public static final p:Lp81$r;

.field public static final q:Lp81$r;

.field public static final r:Lp81$r;

.field public static final s:Lp81$r;

.field public static final t:Lp81$r;

.field public static final u:Lp81$r;

.field public static final v:Lp81$r;

.field public static final w:Lp81$r;

.field public static final x:Lp81$r;

.field public static final y:Lp81$r;

.field public static final z:Lp81$r;


# instance fields
.field public a:F

.field public b:F

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Lru1;

.field public f:Z

.field public g:F

.field public h:F

.field public i:J

.field public j:F

.field public final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lp81$p;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lp81$q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp81$f;

    const-string v1, "translationX"

    invoke-direct {v0, v1}, Lp81$f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->m:Lp81$r;

    new-instance v0, Lp81$g;

    const-string v1, "translationY"

    invoke-direct {v0, v1}, Lp81$g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->n:Lp81$r;

    new-instance v0, Lp81$h;

    const-string v1, "translationZ"

    invoke-direct {v0, v1}, Lp81$h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->o:Lp81$r;

    new-instance v0, Lp81$i;

    const-string v1, "scaleX"

    invoke-direct {v0, v1}, Lp81$i;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->p:Lp81$r;

    new-instance v0, Lp81$j;

    const-string v1, "scaleY"

    invoke-direct {v0, v1}, Lp81$j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->q:Lp81$r;

    new-instance v0, Lp81$k;

    const-string v1, "rotation"

    invoke-direct {v0, v1}, Lp81$k;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->r:Lp81$r;

    new-instance v0, Lp81$l;

    const-string v1, "rotationX"

    invoke-direct {v0, v1}, Lp81$l;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->s:Lp81$r;

    new-instance v0, Lp81$m;

    const-string v1, "rotationY"

    invoke-direct {v0, v1}, Lp81$m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->t:Lp81$r;

    new-instance v0, Lp81$n;

    const-string v1, "x"

    invoke-direct {v0, v1}, Lp81$n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->u:Lp81$r;

    new-instance v0, Lp81$a;

    const-string v1, "y"

    invoke-direct {v0, v1}, Lp81$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->v:Lp81$r;

    new-instance v0, Lp81$b;

    const-string v1, "z"

    invoke-direct {v0, v1}, Lp81$b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->w:Lp81$r;

    new-instance v0, Lp81$c;

    const-string v1, "alpha"

    invoke-direct {v0, v1}, Lp81$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->x:Lp81$r;

    new-instance v0, Lp81$d;

    const-string v1, "scrollX"

    invoke-direct {v0, v1}, Lp81$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->y:Lp81$r;

    new-instance v0, Lp81$e;

    const-string v1, "scrollY"

    invoke-direct {v0, v1}, Lp81$e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp81;->z:Lp81$r;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lru1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Lru1<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lp81;->a:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lp81;->b:F

    const/4 v1, 0x0

    iput-boolean v1, p0, Lp81;->c:Z

    iput-boolean v1, p0, Lp81;->f:Z

    iput v0, p0, Lp81;->g:F

    neg-float v0, v0

    iput v0, p0, Lp81;->h:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lp81;->i:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp81;->k:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp81;->l:Ljava/util/ArrayList;

    iput-object p1, p0, Lp81;->d:Ljava/lang/Object;

    iput-object p2, p0, Lp81;->e:Lru1;

    sget-object p1, Lp81;->r:Lp81$r;

    if-eq p2, p1, :cond_4

    sget-object p1, Lp81;->s:Lp81$r;

    if-eq p2, p1, :cond_4

    sget-object p1, Lp81;->t:Lp81$r;

    if-ne p2, p1, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lp81;->x:Lp81$r;

    const/high16 v0, 0x3b800000    # 0.00390625f

    if-ne p2, p1, :cond_1

    iput v0, p0, Lp81;->j:F

    goto :goto_2

    :cond_1
    sget-object p1, Lp81;->p:Lp81$r;

    if-eq p2, p1, :cond_3

    sget-object p1, Lp81;->q:Lp81$r;

    if-ne p2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lp81;->j:F

    goto :goto_2

    :cond_3
    :goto_0
    iput v0, p0, Lp81;->j:F

    goto :goto_2

    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    iput p1, p0, Lp81;->j:F

    :goto_2
    return-void
.end method

.method public static f(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/ArrayList<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 4

    iget-wide v0, p0, Lp81;->i:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-wide p1, p0, Lp81;->i:J

    iget p1, p0, Lp81;->b:F

    invoke-virtual {p0, p1}, Lp81;->g(F)V

    return v3

    :cond_0
    sub-long v0, p1, v0

    iput-wide p1, p0, Lp81;->i:J

    invoke-virtual {p0, v0, v1}, Lp81;->k(J)Z

    move-result p1

    iget p2, p0, Lp81;->b:F

    iget v0, p0, Lp81;->g:F

    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    move-result p2

    iput p2, p0, Lp81;->b:F

    iget v0, p0, Lp81;->h:F

    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Lp81;->b:F

    invoke-virtual {p0, p2}, Lp81;->g(F)V

    if-eqz p1, :cond_1

    invoke-virtual {p0, v3}, Lp81;->b(Z)V

    :cond_1
    return p1
.end method

.method public final b(Z)V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp81;->f:Z

    invoke-static {}, Lgf;->d()Lgf;

    move-result-object v1

    invoke-virtual {v1, p0}, Lgf;->g(Lgf$b;)V

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lp81;->i:J

    iput-boolean v0, p0, Lp81;->c:Z

    :goto_0
    iget-object v1, p0, Lp81;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lp81;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lp81;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp81$p;

    iget v2, p0, Lp81;->b:F

    iget v3, p0, Lp81;->a:F

    invoke-interface {v1, p0, p1, v2, v3}, Lp81$p;->a(Lp81;ZFF)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lp81;->k:Ljava/util/ArrayList;

    invoke-static {p1}, Lp81;->f(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final c()F
    .locals 2

    iget-object v0, p0, Lp81;->e:Lru1;

    iget-object v1, p0, Lp81;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lru1;->a(Ljava/lang/Object;)F

    move-result v0

    return v0
.end method

.method public d()F
    .locals 2

    iget v0, p0, Lp81;->j:F

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lp81;->f:Z

    return v0
.end method

.method public g(F)V
    .locals 3

    iget-object v0, p0, Lp81;->e:Lru1;

    iget-object v1, p0, Lp81;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lru1;->b(Ljava/lang/Object;F)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lp81;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lp81;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp81;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp81$q;

    iget v1, p0, Lp81;->b:F

    iget v2, p0, Lp81;->a:F

    invoke-interface {v0, p0, v1, v2}, Lp81$q;->a(Lp81;FF)V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lp81;->l:Ljava/util/ArrayList;

    invoke-static {p1}, Lp81;->f(Ljava/util/ArrayList;)V

    return-void
.end method

.method public h(F)Lp81;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iput p1, p0, Lp81;->b:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp81;->c:Z

    return-object p0
.end method

.method public i()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lp81;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp81;->j()V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Animations may only be started on the main thread"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()V
    .locals 3

    iget-boolean v0, p0, Lp81;->f:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp81;->f:Z

    iget-boolean v0, p0, Lp81;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp81;->c()F

    move-result v0

    iput v0, p0, Lp81;->b:F

    :cond_0
    iget v0, p0, Lp81;->b:F

    iget v1, p0, Lp81;->g:F

    cmpl-float v1, v0, v1

    if-gtz v1, :cond_1

    iget v1, p0, Lp81;->h:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, Lgf;->d()Lgf;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lgf;->a(Lgf$b;J)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Starting value need to be in between min value and max value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public abstract k(J)Z
.end method
