.class public final LOk2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final d:LOk2;

.field public static final e:LOk2;

.field public static final f:LOk2;

.field public static final g:LOk2;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:LrJ4;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LOk2;

    const-string v1, "EC"

    sget-object v2, LrJ4;->c:LrJ4;

    invoke-direct {v0, v1, v2}, LOk2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LOk2;->d:LOk2;

    new-instance v0, LOk2;

    const-string v1, "RSA"

    sget-object v2, LrJ4;->b:LrJ4;

    invoke-direct {v0, v1, v2}, LOk2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LOk2;->e:LOk2;

    new-instance v0, LOk2;

    sget-object v1, LrJ4;->d:LrJ4;

    const-string v2, "oct"

    invoke-direct {v0, v2, v1}, LOk2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LOk2;->f:LOk2;

    new-instance v0, LOk2;

    const-string v2, "OKP"

    invoke-direct {v0, v2, v1}, LOk2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LOk2;->g:LOk2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LrJ4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, LOk2;->b:Ljava/lang/String;

    iput-object p2, p0, LOk2;->c:LrJ4;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The key type value must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ljava/lang/String;)LOk2;
    .locals 2

    if-eqz p0, :cond_4

    sget-object v0, LOk2;->d:LOk2;

    invoke-virtual {v0}, LOk2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LOk2;->e:LOk2;

    invoke-virtual {v0}, LOk2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, LOk2;->f:LOk2;

    invoke-virtual {v0}, LOk2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, LOk2;->g:LOk2;

    invoke-virtual {v0}, LOk2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    new-instance v0, LOk2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LOk2;-><init>(Ljava/lang/String;LrJ4;)V

    return-object v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The key type to parse must not be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LOk2;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LOk2;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LOk2;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LOk2;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LOk2;->b:Ljava/lang/String;

    return-object v0
.end method
