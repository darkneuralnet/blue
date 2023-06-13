.class public abstract Lu1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRp0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Q:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LRp0<",
        "TQ;>;"
    }
.end annotation


# static fields
.field public static final d:LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSd6<",
            "La41;",
            ">;"
        }
    .end annotation
.end field

.field public static final transient e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LSd6<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x3c4b1522fc6cb83cL


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq74;

    invoke-direct {v0}, Lq74;-><init>()V

    sput-object v0, Lu1;->d:LSd6;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lu1;->e:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public E(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu1;->b:Ljava/lang/String;

    return-void
.end method

.method public abstract F()LV31;
.end method

.method public final G()LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lu1;->J()LSd6;

    move-result-object v0

    return-object v0
.end method

.method public H(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu1;->c:Ljava/lang/String;

    return-void
.end method

.method public abstract J()LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation
.end method

.method public final K(Lae6;)LSd6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lae6;",
            ")",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lu1;->G()LSd6;

    move-result-object v0

    invoke-virtual {p0}, Lu1;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, LRp0;->b0()Lae6;

    move-result-object v1

    invoke-interface {v1, p1}, Lae6;->c(Lae6;)Lae6;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Lae6;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, LB96;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, v0, p1}, LB96;-><init>(Ljava/lang/String;LSd6;LSd6;Lae6;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu1;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()LSd6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lu1;->d:LSd6;

    invoke-virtual {p0, v0}, Lu1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Lq74;->c0(LSd6;LSd6;)LSd6;

    move-result-object v0

    return-object v0
.end method

.method public final c(I)LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    if-lez p1, :cond_0

    invoke-static {p0, p1}, Lq74;->d0(LSd6;I)LSd6;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, Lu1;->d:LSd6;

    neg-int p1, p1

    invoke-virtual {p0, p1}, Lu1;->c(I)LSd6;

    move-result-object p1

    invoke-interface {v0, p1}, LSd6;->i(LSd6;)LSd6;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string v0, "Root\'s order of zero"

    invoke-direct {p1, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LSd6;

    invoke-virtual {p0, p1}, Lu1;->o(LSd6;)I

    move-result p1

    return p1
.end method

.method public d(I)LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    if-lez p1, :cond_0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Lu1;->d(I)LSd6;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1;->j(LSd6;)LSd6;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lu1;->d:LSd6;

    return-object p1

    :cond_1
    sget-object v0, Lu1;->d:LSd6;

    neg-int p1, p1

    invoke-virtual {p0, p1}, Lu1;->d(I)LSd6;

    move-result-object p1

    invoke-interface {v0, p1}, LSd6;->i(LSd6;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public e(LWZ3;)LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWZ3;",
            ")",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    invoke-static {p1}, LlX2;->w0(LWZ3;)LlX2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1;->K(Lae6;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public bridge synthetic f(Ljava/lang/Class;)LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassCastException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lu1;->n(Ljava/lang/Class;)LRp0;

    move-result-object p1

    return-object p1
.end method

.method public g(D)LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    invoke-static {p1, p2}, Lqn4;->j(D)Lqn4;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1;->h(Ljava/lang/Number;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final h(Ljava/lang/Number;)LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Number;",
            ")",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    invoke-interface {v0, p1}, Lsd3;->a(Ljava/lang/Number;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, LlX2;->M2(Ljava/lang/Number;)LlX2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1;->K(Lae6;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public final i(LSd6;)LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    invoke-interface {p1}, LSd6;->b()LSd6;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1;->j(LSd6;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public final j(LSd6;)LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    instance-of v0, p1, LRp0;

    if-eqz v0, :cond_0

    check-cast p1, LRp0;

    invoke-virtual {p0, p1}, Lu1;->w(LRp0;)LSd6;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p0, p1}, Lq74;->Z(LSd6;LSd6;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public final k(LSd6;)Lae6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "TQ;>;)",
            "Lae6;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/measure/UnconvertibleException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lu1;->s(LSd6;Z)Lae6;

    move-result-object p1

    return-object p1
.end method

.method public abstract l()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "+",
            "LSd6<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public m(D)LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    invoke-static {p1, p2}, Lqn4;->j(D)Lqn4;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1;->q(Ljava/lang/Number;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljava/lang/Class;)LRp0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LRp0<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lbe6;->b(Ljava/lang/Class;)LV31;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lu1;->F()LV31;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The unit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not compatible with quantities of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public o(LSd6;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "TQ;>;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lu1;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LSd6;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lu1;->p(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu1;->b:Ljava/lang/String;

    invoke-interface {p1}, LSd6;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lu1;->p(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    if-nez p1, :cond_1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1

    :cond_1
    if-nez p2, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    :goto_1
    return p1
.end method

.method public final q(Ljava/lang/Number;)LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Number;",
            ")",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    invoke-interface {v0, p1}, Lsd3;->a(Ljava/lang/Number;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lp80;->c(Ljava/lang/Number;)Lp80;

    move-result-object p1

    invoke-virtual {p1}, Lp80;->f()Lp80;

    move-result-object p1

    invoke-virtual {p1}, Lp80;->d()Ljava/lang/Number;

    move-result-object p1

    invoke-static {p1}, LlX2;->M2(Ljava/lang/Number;)LlX2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1;->K(Lae6;)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public final r(LSd6;)Lae6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;)",
            "Lae6;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/measure/IncommensurableException;,
            Ljavax/measure/UnconvertibleException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lu1;->u(LSd6;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, LRp0;

    invoke-static {}, LZ31;->a()LZ31;

    move-result-object v0

    invoke-virtual {p0}, Lu1;->G()LSd6;

    move-result-object v1

    invoke-interface {v1}, LSd6;->F()LV31;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ31;->b(LV31;)Lo0;

    move-result-object v1

    invoke-interface {p0}, LRp0;->b0()Lae6;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo0;->c(Lae6;)Lae6;

    move-result-object v1

    invoke-interface {p1}, LRp0;->G()LSd6;

    move-result-object v2

    invoke-interface {v2}, LSd6;->F()LV31;

    move-result-object v2

    invoke-virtual {v0, v2}, LZ31;->b(LV31;)Lo0;

    move-result-object v0

    invoke-interface {p1}, LRp0;->b0()Lae6;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo0;->c(Lae6;)Lae6;

    move-result-object p1

    invoke-interface {p1}, Lae6;->b()Lae6;

    move-result-object p1

    invoke-interface {p1, v1}, Lae6;->c(Lae6;)Lae6;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljavax/measure/IncommensurableException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not compatible with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljavax/measure/IncommensurableException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s(LSd6;Z)Lae6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "TQ;>;Z)",
            "Lae6;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/measure/UnconvertibleException;
        }
    .end annotation

    if-eqz p2, :cond_1

    if-eq p0, p1, :cond_0

    invoke-virtual {p0, p1}, Lu1;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_0
    sget-object p1, Lo0;->c:Lo0;

    return-object p1

    :cond_1
    if-ne p0, p1, :cond_2

    sget-object p1, Lo0;->c:Lo0;

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lu1;->G()LSd6;

    move-result-object p2

    invoke-interface {p1}, LSd6;->G()LSd6;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :try_start_0
    invoke-virtual {p0, p1}, Lu1;->r(LSd6;)Lae6;

    move-result-object p1
    :try_end_0
    .catch Ljavax/measure/IncommensurableException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljavax/measure/UnconvertibleException;

    invoke-direct {p2, p1}, Ljavax/measure/UnconvertibleException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    invoke-interface {p0}, LRp0;->b0()Lae6;

    move-result-object p2

    invoke-interface {p1, v0}, LSd6;->k(LSd6;)Lae6;

    move-result-object p1

    invoke-interface {p1}, Lae6;->b()Lae6;

    move-result-object p1

    invoke-interface {p1, p2}, Lae6;->c(Lae6;)Lae6;

    move-result-object p1

    return-object p1
.end method

.method public final t(LSd6;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;Z)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    if-eq p0, p1, :cond_0

    invoke-virtual {p0, p1}, Lu1;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_0
    return v0

    :cond_1
    if-ne p0, p1, :cond_2

    return v0

    :cond_2
    instance-of p2, p1, LRp0;

    if-nez p2, :cond_3

    const/4 p1, 0x0

    return p1

    :cond_3
    invoke-virtual {p0}, Lu1;->F()LV31;

    move-result-object p2

    invoke-interface {p1}, LSd6;->F()LV31;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v0

    :cond_4
    invoke-static {}, LZ31;->a()LZ31;

    move-result-object v0

    invoke-virtual {v0, p2}, LZ31;->c(LV31;)LV31;

    move-result-object p2

    invoke-virtual {v0, p1}, LZ31;->c(LV31;)LV31;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {}, LbB5;->k()LbB5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv1;->b(LSd6;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(LSd6;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lu1;->t(LSd6;Z)Z

    move-result p1

    return p1
.end method

.method public v()Z
    .locals 1

    invoke-virtual {p0}, Lu1;->J()LSd6;

    move-result-object v0

    if-eq p0, v0, :cond_1

    invoke-virtual {p0, v0}, Lu1;->equals(Ljava/lang/Object;)Z

    move-result v0

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

.method public final w(LRp0;)LSd6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRp0<",
            "*>;)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lu1;->d:LSd6;

    invoke-virtual {p0, v0}, Lu1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-static {p0, p1}, Lq74;->Z(LSd6;LSd6;)LSd6;

    move-result-object p1

    return-object p1
.end method
