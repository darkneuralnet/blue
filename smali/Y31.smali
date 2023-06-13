.class public LY31;
.super Lp01;
.source "SourceFile"


# instance fields
.field public m:I


# direct methods
.method public constructor <init>(LgB6;)V
    .locals 0

    invoke-direct {p0, p1}, Lp01;-><init>(LgB6;)V

    instance-of p1, p1, LeN1;

    if-eqz p1, :cond_0

    sget-object p1, Lp01$a;->c:Lp01$a;

    iput-object p1, p0, Lp01;->e:Lp01$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lp01$a;->d:Lp01$a;

    iput-object p1, p0, Lp01;->e:Lp01$a;

    :goto_0
    return-void
.end method


# virtual methods
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
