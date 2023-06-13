.class public abstract Lcom/google/ar/sceneform/rendering/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/d$a;
    }
.end annotation


# static fields
.field public static final k:J


# instance fields
.field public final a:Lcom/google/ar/sceneform/rendering/a;

.field public b:Z

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/filament/MaterialInstance;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Z

.field public g:Z

.field public h:I

.field public i:Lnm0;

.field public final j:LDh0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xe

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/ar/sceneform/rendering/d;->k:J

    return-void
.end method

.method public constructor <init>(Lcom/google/ar/sceneform/rendering/d$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/ar/sceneform/rendering/d$a<",
            "+",
            "Lcom/google/ar/sceneform/rendering/d;",
            "+",
            "Lcom/google/ar/sceneform/rendering/d$a<",
            "**>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->d:Ljava/util/ArrayList;

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/ar/sceneform/rendering/d;->e:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->f:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->g:Z

    new-instance v0, LDh0;

    invoke-direct {v0}, LDh0;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->j:LDh0;

    const-string v0, "Parameter \"builder\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/d$a;->c(Lcom/google/ar/sceneform/rendering/d$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/ar/sceneform/rendering/g;

    invoke-direct {v0}, Lcom/google/ar/sceneform/rendering/g;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/d$a;->d(Lcom/google/ar/sceneform/rendering/d$a;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->b()Lcom/google/ar/sceneform/rendering/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/ar/sceneform/rendering/f;

    invoke-direct {v0}, Lcom/google/ar/sceneform/rendering/f;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    :goto_0
    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/d$a;->e(Lcom/google/ar/sceneform/rendering/d$a;)Lcom/google/ar/sceneform/rendering/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/d$a;->e(Lcom/google/ar/sceneform/rendering/d$a;)Lcom/google/ar/sceneform/rendering/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/ar/sceneform/rendering/d;->t(Lcom/google/ar/sceneform/rendering/e;)V

    :cond_2
    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/d$a;->f(Lcom/google/ar/sceneform/rendering/d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->b:Z

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/d$a;->g(Lcom/google/ar/sceneform/rendering/d$a;)I

    move-result p1

    iput p1, p0, Lcom/google/ar/sceneform/rendering/d;->h:I

    return-void
.end method

.method public constructor <init>(Lcom/google/ar/sceneform/rendering/d;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->d:Ljava/util/ArrayList;

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/ar/sceneform/rendering/d;->e:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->f:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->g:Z

    new-instance v1, LDh0;

    invoke-direct {v1}, LDh0;-><init>()V

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/d;->j:LDh0;

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->f()LDh0;

    move-result-object v1

    invoke-virtual {v1}, LDh0;->c()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    iget-object v1, p1, Lcom/google/ar/sceneform/rendering/d;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p1, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, LDZ3;->e(Z)V

    :goto_1
    iget-object v0, p1, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    iget-object v0, p1, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/MaterialInstance;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/google/android/filament/MaterialInstance;->getMaterial()Lcom/google/android/filament/Material;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Material;->createInstance()Lcom/google/android/filament/MaterialInstance;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->d:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/google/ar/sceneform/rendering/d;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget v0, p1, Lcom/google/ar/sceneform/rendering/d;->e:I

    iput v0, p0, Lcom/google/ar/sceneform/rendering/d;->e:I

    iget-boolean v0, p1, Lcom/google/ar/sceneform/rendering/d;->f:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->f:Z

    iget-boolean v0, p1, Lcom/google/ar/sceneform/rendering/d;->g:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->g:Z

    iget-object v0, p1, Lcom/google/ar/sceneform/rendering/d;->i:Lnm0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lnm0;->a()Lnm0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->i:Lnm0;

    :cond_2
    iget-boolean v0, p1, Lcom/google/ar/sceneform/rendering/d;->b:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->b:Z

    iget p1, p1, Lcom/google/ar/sceneform/rendering/d;->h:I

    iput p1, p0, Lcom/google/ar/sceneform/rendering/d;->h:I

    iget-object p1, p0, Lcom/google/ar/sceneform/rendering/d;->j:LDh0;

    invoke-virtual {p1}, LDh0;->d()V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot copy uninitialized Renderable."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method public a(Lo96;)Lox4;
    .locals 1

    new-instance v0, Lox4;

    invoke-direct {v0, p1, p0}, Lox4;-><init>(Lo96;Lcom/google/ar/sceneform/rendering/d;)V

    return-object v0
.end method

.method public final b()Lcom/google/ar/sceneform/rendering/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/ar/sceneform/rendering/d;->h:I

    return v0
.end method

.method public d()Lnm0;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->i:Lnm0;

    return-object v0
.end method

.method public e(LjN2;)LjN2;
    .locals 1

    const-string v0, "Parameter \"originalMatrix\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public f()LDh0;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->j:LDh0;

    return-object v0
.end method

.method public g()Lcom/google/android/filament/MaterialInstance;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ar/sceneform/rendering/d;->h(I)Lcom/google/android/filament/MaterialInstance;

    move-result-object v0

    return-object v0
.end method

.method public h(I)Lcom/google/android/filament/MaterialInstance;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/filament/MaterialInstance;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/ar/sceneform/rendering/d;->q(I)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
.end method

.method public i()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/filament/MaterialInstance;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public j()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/google/ar/sceneform/rendering/d;->e:I

    return v0
.end method

.method public l()Lcom/google/ar/sceneform/rendering/a;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    return-object v0
.end method

.method public m()I
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->f:Z

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/d;->g:Z

    return v0
.end method

.method public abstract p()Lcom/google/ar/sceneform/rendering/d;
.end method

.method public final q(I)Ljava/lang/IllegalArgumentException;
    .locals 3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "submeshIndex ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of range. It must be less than the submeshCount ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->m()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public r(Lio/github/sceneview/SceneView;)V
    .locals 0

    return-void
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/ar/sceneform/rendering/d;->f:Z

    iget-object p1, p0, Lcom/google/ar/sceneform/rendering/d;->j:LDh0;

    invoke-virtual {p1}, LDh0;->d()V

    return-void
.end method

.method public t(Lcom/google/ar/sceneform/rendering/e;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/e;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LDZ3;->e(Z)V

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->j:LDh0;

    invoke-virtual {v0}, LDh0;->d()V

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/d;->c:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/d;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/ar/sceneform/rendering/e;->d(Lcom/google/ar/sceneform/rendering/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    new-instance p1, Lb10;

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->i()LQj6;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/d;->a:Lcom/google/ar/sceneform/rendering/a;

    invoke-interface {v1}, Lcom/google/ar/sceneform/rendering/a;->m()LQj6;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lb10;-><init>(LQj6;LQj6;)V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/d;->i:Lnm0;

    return-void
.end method
