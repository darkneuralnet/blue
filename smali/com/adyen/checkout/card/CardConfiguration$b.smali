.class public final Lcom/adyen/checkout/card/CardConfiguration$b;
.super LuA;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/card/CardConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LuA<",
        "Lcom/adyen/checkout/card/CardConfiguration;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LXf0;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public f:Z

.field public g:Ljava/lang/String;

.field public h:Z

.field public i:Z

.field public j:LkN5;

.field public k:LIj2;

.field public l:Lj8;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LuA;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->d:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->f:Z

    sget-object p1, LkN5;->c:LkN5;

    iput-object p1, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->j:LkN5;

    sget-object p1, LIj2;->c:LIj2;

    iput-object p1, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->k:LIj2;

    sget-object p1, Lj8;->c:Lj8;

    iput-object p1, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->l:Lj8;

    return-void
.end method

.method public constructor <init>(Lcom/adyen/checkout/card/CardConfiguration;)V
    .locals 3

    invoke-virtual {p1}, Lcom/adyen/checkout/components/base/Configuration;->c()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1}, Lcom/adyen/checkout/components/base/Configuration;->b()Lcom/adyen/checkout/core/api/Environment;

    move-result-object v1

    invoke-virtual {p1}, Lcom/adyen/checkout/components/base/Configuration;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, LuA;-><init>(Ljava/util/Locale;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->d:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->f:Z

    sget-object v0, LkN5;->c:LkN5;

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->j:LkN5;

    sget-object v0, LIj2;->c:LIj2;

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->k:LIj2;

    sget-object v0, Lj8;->c:Lj8;

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->l:Lj8;

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->j()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->d:Ljava/util/List;

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->m()Z

    move-result v0

    iput-boolean v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->e:Z

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->n()Z

    move-result v0

    iput-boolean v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->f:Z

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->g:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->h:Z

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->i:Z

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->i()LkN5;

    move-result-object v0

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->j:LkN5;

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->g()LIj2;

    move-result-object v0

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->k:LIj2;

    invoke-virtual {p1}, Lcom/adyen/checkout/card/CardConfiguration;->e()Lj8;

    move-result-object p1

    iput-object p1, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->l:Lj8;

    return-void
.end method

.method public static synthetic g(Lcom/adyen/checkout/card/CardConfiguration$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->e:Z

    return p0
.end method

.method public static synthetic h(Lcom/adyen/checkout/card/CardConfiguration$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->d:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic i(Lcom/adyen/checkout/card/CardConfiguration$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic j(Lcom/adyen/checkout/card/CardConfiguration$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->f:Z

    return p0
.end method

.method public static synthetic k(Lcom/adyen/checkout/card/CardConfiguration$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->h:Z

    return p0
.end method

.method public static synthetic l(Lcom/adyen/checkout/card/CardConfiguration$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->i:Z

    return p0
.end method

.method public static synthetic m(Lcom/adyen/checkout/card/CardConfiguration$b;)LkN5;
    .locals 0

    iget-object p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->j:LkN5;

    return-object p0
.end method

.method public static synthetic n(Lcom/adyen/checkout/card/CardConfiguration$b;)LIj2;
    .locals 0

    iget-object p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->k:LIj2;

    return-object p0
.end method

.method public static synthetic o(Lcom/adyen/checkout/card/CardConfiguration$b;)Lj8;
    .locals 0

    iget-object p0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->l:Lj8;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b()Lcom/adyen/checkout/components/base/Configuration;
    .locals 1

    invoke-virtual {p0}, Lcom/adyen/checkout/card/CardConfiguration$b;->p()Lcom/adyen/checkout/card/CardConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public p()Lcom/adyen/checkout/card/CardConfiguration;
    .locals 1

    new-instance v0, Lcom/adyen/checkout/card/CardConfiguration;

    invoke-direct {v0, p0}, Lcom/adyen/checkout/card/CardConfiguration;-><init>(Lcom/adyen/checkout/card/CardConfiguration$b;)V

    return-object v0
.end method

.method public q(Lcom/adyen/checkout/core/api/Environment;)Lcom/adyen/checkout/card/CardConfiguration$b;
    .locals 0

    invoke-super {p0, p1}, LuA;->f(Lcom/adyen/checkout/core/api/Environment;)LuA;

    move-result-object p1

    check-cast p1, Lcom/adyen/checkout/card/CardConfiguration$b;

    return-object p1
.end method

.method public r(Z)Lcom/adyen/checkout/card/CardConfiguration$b;
    .locals 0

    iput-boolean p1, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->f:Z

    return-object p0
.end method

.method public varargs s([LXf0;)Lcom/adyen/checkout/card/CardConfiguration$b;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lcom/adyen/checkout/card/CardConfiguration;->d()[LXf0;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    iput-object v0, p0, Lcom/adyen/checkout/card/CardConfiguration$b;->d:Ljava/util/List;

    return-object p0
.end method
