.class public LE9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final d:LE9;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:LrJ4;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LE9;

    const-string v1, "none"

    sget-object v2, LrJ4;->b:LrJ4;

    invoke-direct {v0, v1, v2}, LE9;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LE9;->d:LE9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LE9;-><init>(Ljava/lang/String;LrJ4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LrJ4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, LE9;->b:Ljava/lang/String;

    iput-object p2, p0, LE9;->c:LrJ4;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The algorithm name must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ljava/lang/String;)LE9;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LE9;

    invoke-direct {v0, p0}, LE9;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LE9;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LE9;->toString()Ljava/lang/String;

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

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LE9;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LE9;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LE9;->b:Ljava/lang/String;

    return-object v0
.end method
