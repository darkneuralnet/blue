.class public Lv2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/reflect/Field;

.field public b:Ljava/lang/reflect/Method;

.field public c:Ljava/lang/reflect/Method;

.field public d:I

.field public e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public f:Ljava/lang/reflect/Type;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Field;LTk1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Field;",
            "LTk1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lv2;->g:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    and-int/lit16 v1, v0, 0x88

    if-lez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-lez v0, :cond_1

    iput-object p2, p0, Lv2;->a:Ljava/lang/reflect/Field;

    :cond_1
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LA;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    :try_start_0
    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lv2;->b:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LA;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LA;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    :try_start_1
    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p1, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lv2;->c:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iget-object v1, p0, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez v1, :cond_3

    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LA;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lv2;->c:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_3
    iget-object p1, p0, Lv2;->a:Ljava/lang/reflect/Field;

    if-nez p1, :cond_4

    iget-object p1, p0, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez p1, :cond_4

    iget-object p1, p0, Lv2;->b:Ljava/lang/reflect/Method;

    if-nez p1, :cond_4

    return-void

    :cond_4
    iget-object p1, p0, Lv2;->c:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    invoke-interface {p3, p2, p1}, LTk1;->a(Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)Z

    move-result p1

    if-nez p1, :cond_5

    iput-object v0, p0, Lv2;->c:Ljava/lang/reflect/Method;

    :cond_5
    iget-object p1, p0, Lv2;->b:Ljava/lang/reflect/Method;

    if-eqz p1, :cond_6

    invoke-interface {p3, p2, p1}, LTk1;->a(Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)Z

    move-result p1

    if-nez p1, :cond_6

    iput-object v0, p0, Lv2;->b:Ljava/lang/reflect/Method;

    :cond_6
    iget-object p1, p0, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez p1, :cond_7

    iget-object p1, p0, Lv2;->b:Ljava/lang/reflect/Method;

    if-nez p1, :cond_7

    iget-object p1, p0, Lv2;->a:Ljava/lang/reflect/Field;

    if-nez p1, :cond_7

    return-void

    :cond_7
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lv2;->e:Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object p1

    iput-object p1, p0, Lv2;->f:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lv2;->d:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv2;->g:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lv2;->e:Ljava/lang/Class;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lv2;->e:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lv2;->b:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    iget-object v0, p0, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lv2;->a:Ljava/lang/reflect/Field;

    if-nez v0, :cond_1

    iget-object v0, p0, Lv2;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lv2;->a:Ljava/lang/reflect/Field;

    if-nez v0, :cond_1

    iget-object v0, p0, Lv2;->c:Ljava/lang/reflect/Method;

    if-nez v0, :cond_1

    iget-object v0, p0, Lv2;->b:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lv2;->a:Ljava/lang/reflect/Field;

    if-nez v0, :cond_1

    iget-object v0, p0, Lv2;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
