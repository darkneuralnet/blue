.class public Lp01;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll01;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp01$a;
    }
.end annotation


# instance fields
.field public a:Ll01;

.field public b:Z

.field public c:Z

.field public d:LgB6;

.field public e:Lp01$a;

.field public f:I

.field public g:I

.field public h:I

.field public i:LY31;

.field public j:Z

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll01;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp01;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LgB6;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp01;->a:Ll01;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lp01;->b:Z

    iput-boolean v1, p0, Lp01;->c:Z

    sget-object v2, Lp01$a;->b:Lp01$a;

    iput-object v2, p0, Lp01;->e:Lp01$a;

    const/4 v2, 0x1

    iput v2, p0, Lp01;->h:I

    iput-object v0, p0, Lp01;->i:LY31;

    iput-boolean v1, p0, Lp01;->j:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp01;->k:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp01;->l:Ljava/util/List;

    iput-object p1, p0, Lp01;->d:LgB6;

    return-void
.end method


# virtual methods
.method public a(Ll01;)V
    .locals 5

    iget-object p1, p0, Lp01;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp01;

    iget-boolean v0, v0, Lp01;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lp01;->c:Z

    iget-object v0, p0, Lp01;->a:Ll01;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Ll01;->a(Ll01;)V

    :cond_2
    iget-boolean v0, p0, Lp01;->b:Z

    if-eqz v0, :cond_3

    iget-object p1, p0, Lp01;->d:LgB6;

    invoke-virtual {p1, p0}, LgB6;->a(Ll01;)V

    return-void

    :cond_3
    iget-object v0, p0, Lp01;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp01;

    instance-of v4, v3, LY31;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_8

    if-ne v2, p1, :cond_8

    iget-boolean p1, v1, Lp01;->j:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Lp01;->i:LY31;

    if-eqz p1, :cond_7

    iget-boolean v0, p1, Lp01;->j:Z

    if-eqz v0, :cond_6

    iget v0, p0, Lp01;->h:I

    iget p1, p1, Lp01;->g:I

    mul-int/2addr v0, p1

    iput v0, p0, Lp01;->f:I

    goto :goto_1

    :cond_6
    return-void

    :cond_7
    :goto_1
    iget p1, v1, Lp01;->g:I

    iget v0, p0, Lp01;->f:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lp01;->d(I)V

    :cond_8
    iget-object p1, p0, Lp01;->a:Ll01;

    if-eqz p1, :cond_9

    invoke-interface {p1, p0}, Ll01;->a(Ll01;)V

    :cond_9
    return-void
.end method

.method public b(Ll01;)V
    .locals 1

    iget-object v0, p0, Lp01;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lp01;->j:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, p1}, Ll01;->a(Ll01;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lp01;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lp01;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp01;->j:Z

    iput v0, p0, Lp01;->g:I

    iput-boolean v0, p0, Lp01;->c:Z

    iput-boolean v0, p0, Lp01;->b:Z

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-boolean v0, p0, Lp01;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lp01;->j:Z

    iput p1, p0, Lp01;->g:I

    iget-object p1, p0, Lp01;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll01;

    invoke-interface {v0, v0}, Ll01;->a(Ll01;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lp01;->d:LgB6;

    iget-object v1, v1, LgB6;->b:Liz0;

    invoke-virtual {v1}, Liz0;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp01;->e:Lp01$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp01;->j:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lp01;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "unresolved"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") <t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp01;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":d="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp01;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
