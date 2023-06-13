.class public final Liy3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liy3$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final e:Liy3$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3$b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Liy3$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public volatile d:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Liy3$a;

    invoke-direct {v0}, Liy3$a;-><init>()V

    sput-object v0, Liy3;->e:Liy3$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Liy3$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;",
            "Liy3$b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LzZ3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Liy3;->c:Ljava/lang/String;

    iput-object p2, p0, Liy3;->a:Ljava/lang/Object;

    invoke-static {p3}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Liy3$b;

    iput-object p1, p0, Liy3;->b:Liy3$b;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;Liy3$b;)Liy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Liy3$b<",
            "TT;>;)",
            "Liy3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Liy3;

    invoke-direct {v0, p0, p1, p2}, Liy3;-><init>(Ljava/lang/String;Ljava/lang/Object;Liy3$b;)V

    return-object v0
.end method

.method public static b()Liy3$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Liy3$b<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Liy3;->e:Liy3$b;

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Liy3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Liy3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Liy3;

    const/4 v1, 0x0

    invoke-static {}, Liy3;->b()Liy3$b;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Liy3;-><init>(Ljava/lang/String;Ljava/lang/Object;Liy3$b;)V

    return-object v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/Object;)Liy3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)",
            "Liy3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Liy3;

    invoke-static {}, Liy3;->b()Liy3$b;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Liy3;-><init>(Ljava/lang/String;Ljava/lang/Object;Liy3$b;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Liy3;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final d()[B
    .locals 2

    iget-object v0, p0, Liy3;->d:[B

    if-nez v0, :cond_0

    iget-object v0, p0, Liy3;->c:Ljava/lang/String;

    sget-object v1, Lak2;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Liy3;->d:[B

    :cond_0
    iget-object v0, p0, Liy3;->d:[B

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Liy3;

    if-eqz v0, :cond_0

    check-cast p1, Liy3;

    iget-object v0, p0, Liy3;->c:Ljava/lang/String;

    iget-object p1, p1, Liy3;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public g(Ljava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/security/MessageDigest;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Liy3;->b:Liy3$b;

    invoke-virtual {p0}, Liy3;->d()[B

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Liy3$b;->a([BLjava/lang/Object;Ljava/security/MessageDigest;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Liy3;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Option{key=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Liy3;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
