.class public final Lqi2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqi2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltb1<",
        "Lqi2;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:LOd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOd3<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:LHj6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHj6<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:LHj6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHj6<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lqi2$b;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LOd3<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LHj6<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:LOd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOd3<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lni2;

    invoke-direct {v0}, Lni2;-><init>()V

    sput-object v0, Lqi2;->e:LOd3;

    new-instance v0, Loi2;

    invoke-direct {v0}, Loi2;-><init>()V

    sput-object v0, Lqi2;->f:LHj6;

    new-instance v0, Lpi2;

    invoke-direct {v0}, Lpi2;-><init>()V

    sput-object v0, Lqi2;->g:LHj6;

    new-instance v0, Lqi2$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqi2$b;-><init>(Lqi2$a;)V

    sput-object v0, Lqi2;->h:Lqi2$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lqi2;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lqi2;->b:Ljava/util/Map;

    sget-object v0, Lqi2;->e:LOd3;

    iput-object v0, p0, Lqi2;->c:LOd3;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqi2;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Lqi2;->f:LHj6;

    invoke-virtual {p0, v0, v1}, Lqi2;->p(Ljava/lang/Class;LHj6;)Lqi2;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Lqi2;->g:LHj6;

    invoke-virtual {p0, v0, v1}, Lqi2;->p(Ljava/lang/Class;LHj6;)Lqi2;

    const-class v0, Ljava/util/Date;

    sget-object v1, Lqi2;->h:Lqi2$b;

    invoke-virtual {p0, v0, v1}, Lqi2;->p(Ljava/lang/Class;LHj6;)Lqi2;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;LPd3;)V
    .locals 0

    invoke-static {p0, p1}, Lqi2;->l(Ljava/lang/Object;LPd3;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;LIj6;)V
    .locals 0

    invoke-static {p0, p1}, Lqi2;->m(Ljava/lang/String;LIj6;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Boolean;LIj6;)V
    .locals 0

    invoke-static {p0, p1}, Lqi2;->n(Ljava/lang/Boolean;LIj6;)V

    return-void
.end method

.method public static synthetic e(Lqi2;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lqi2;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic f(Lqi2;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lqi2;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic g(Lqi2;)LOd3;
    .locals 0

    iget-object p0, p0, Lqi2;->c:LOd3;

    return-object p0
.end method

.method public static synthetic h(Lqi2;)Z
    .locals 0

    iget-boolean p0, p0, Lqi2;->d:Z

    return p0
.end method

.method public static synthetic l(Ljava/lang/Object;LPd3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance p1, Lcom/google/firebase/encoders/EncodingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic m(Ljava/lang/String;LIj6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1, p0}, LIj6;->a(Ljava/lang/String;)LIj6;

    return-void
.end method

.method public static synthetic n(Ljava/lang/Boolean;LIj6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, LIj6;->b(Z)LIj6;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;LOd3;)Ltb1;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lqi2;->o(Ljava/lang/Class;LOd3;)Lqi2;

    move-result-object p1

    return-object p1
.end method

.method public i()LHS0;
    .locals 1

    new-instance v0, Lqi2$a;

    invoke-direct {v0, p0}, Lqi2$a;-><init>(Lqi2;)V

    return-object v0
.end method

.method public j(LFx0;)Lqi2;
    .locals 0

    invoke-interface {p1, p0}, LFx0;->configure(Ltb1;)V

    return-object p0
.end method

.method public k(Z)Lqi2;
    .locals 0

    iput-boolean p1, p0, Lqi2;->d:Z

    return-object p0
.end method

.method public o(Ljava/lang/Class;LOd3;)Lqi2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LOd3<",
            "-TT;>;)",
            "Lqi2;"
        }
    .end annotation

    iget-object v0, p0, Lqi2;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lqi2;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Ljava/lang/Class;LHj6;)Lqi2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LHj6<",
            "-TT;>;)",
            "Lqi2;"
        }
    .end annotation

    iget-object v0, p0, Lqi2;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lqi2;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
