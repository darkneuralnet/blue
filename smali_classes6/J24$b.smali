.class public LJ24$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ24;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field public b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "LJ24$d;",
            "Ljava/util/List<",
            "LJ24$c<",
            "TP;>;>;>;"
        }
    .end annotation
.end field

.field public c:LJ24$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ24$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field public d:LxV2;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LJ24$b;->b:Ljava/util/concurrent/ConcurrentMap;

    iput-object p1, p0, LJ24$b;->a:Ljava/lang/Class;

    sget-object p1, LxV2;->b:LxV2;

    iput-object p1, p0, LJ24$b;->d:LxV2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;LJ24$a;)V
    .locals 0

    invoke-direct {p0, p1}, LJ24$b;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lkl2$c;)LJ24$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lkl2$c;",
            ")",
            "LJ24$b<",
            "TP;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LJ24$b;->c(Ljava/lang/Object;Lkl2$c;Z)LJ24$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;Lkl2$c;)LJ24$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lkl2$c;",
            ")",
            "LJ24$b<",
            "TP;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, LJ24$b;->c(Ljava/lang/Object;Lkl2$c;Z)LJ24$b;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Object;Lkl2$c;Z)LJ24$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lkl2$c;",
            "Z)",
            "LJ24$b<",
            "TP;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, LJ24$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lkl2$c;->N()LIk2;

    move-result-object v0

    sget-object v1, LIk2;->d:LIk2;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LJ24$b;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1, p2, v0}, LJ24;->a(Ljava/lang/Object;Lkl2$c;Ljava/util/concurrent/ConcurrentMap;)LJ24$c;

    move-result-object p1

    if-eqz p3, :cond_1

    iget-object p2, p0, LJ24$b;->c:LJ24$c;

    if-nez p2, :cond_0

    iput-object p1, p0, LJ24$b;->c:LJ24$c;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "you cannot set two primary primitives"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object p0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "only ENABLED key is allowed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "addPrimitive cannot be called after build"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d()LJ24;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LJ24<",
            "TP;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v1, p0, LJ24$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_0

    new-instance v6, LJ24;

    iget-object v2, p0, LJ24$b;->c:LJ24$c;

    iget-object v3, p0, LJ24$b;->d:LxV2;

    iget-object v4, p0, LJ24$b;->a:Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LJ24;-><init>(Ljava/util/concurrent/ConcurrentMap;LJ24$c;LxV2;Ljava/lang/Class;LJ24$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, LJ24$b;->b:Ljava/util/concurrent/ConcurrentMap;

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "build cannot be called twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(LxV2;)LJ24$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxV2;",
            ")",
            "LJ24$b<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, LJ24$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_0

    iput-object p1, p0, LJ24$b;->d:LxV2;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
