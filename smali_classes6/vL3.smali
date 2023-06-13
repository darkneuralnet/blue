.class public final LvL3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LvL3$a;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:LvL3$a;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/String;

.field public final e:[B

.field public final f:LIy;

.field public final g:Ljh2;

.field public final h:LLA5;


# direct methods
.method public constructor <init>(LIy;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LvL3;->c:Ljava/util/Map;

    iput-object v0, p0, LvL3;->d:Ljava/lang/String;

    iput-object v0, p0, LvL3;->e:[B

    iput-object p1, p0, LvL3;->f:LIy;

    iput-object v0, p0, LvL3;->g:Ljh2;

    iput-object v0, p0, LvL3;->h:LLA5;

    sget-object p1, LvL3$a;->e:LvL3$a;

    iput-object p1, p0, LvL3;->b:LvL3$a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The Base64URL-encoded object must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LvL3;->c:Ljava/util/Map;

    iput-object p1, p0, LvL3;->d:Ljava/lang/String;

    iput-object v0, p0, LvL3;->e:[B

    iput-object v0, p0, LvL3;->f:LIy;

    iput-object v0, p0, LvL3;->g:Ljh2;

    iput-object v0, p0, LvL3;->h:LLA5;

    sget-object p1, LvL3$a;->c:LvL3$a;

    iput-object p1, p0, LvL3;->b:LvL3$a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The string must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LvL3;->c:Ljava/util/Map;

    iput-object v0, p0, LvL3;->d:Ljava/lang/String;

    iput-object p1, p0, LvL3;->e:[B

    iput-object v0, p0, LvL3;->f:LIy;

    iput-object v0, p0, LvL3;->g:Ljh2;

    iput-object v0, p0, LvL3;->h:LLA5;

    sget-object p1, LvL3$a;->d:LvL3$a;

    iput-object p1, p0, LvL3;->b:LvL3$a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The byte array must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a([B)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, Ljava/lang/String;

    sget-object v1, LsO5;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 1

    if-eqz p0, :cond_0

    sget-object v0, LsO5;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public c()LIy;
    .locals 1

    iget-object v0, p0, LvL3;->f:LIy;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LvL3;->d()[B

    move-result-object v0

    invoke-static {v0}, LIy;->e([B)LIy;

    move-result-object v0

    return-object v0
.end method

.method public d()[B
    .locals 1

    iget-object v0, p0, LvL3;->e:[B

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LvL3;->f:LIy;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LGy;->a()[B

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, LvL3;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LvL3;->b(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LvL3;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LvL3;->g:Ljh2;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LFg2;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LvL3;->g:Ljh2;

    invoke-virtual {v0}, LFg2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, LvL3;->g:Ljh2;

    invoke-virtual {v0}, Ljh2;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, LvL3;->c:Ljava/util/Map;

    if-eqz v0, :cond_3

    invoke-static {v0}, LMg2;->o(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v0, p0, LvL3;->e:[B

    if-eqz v0, :cond_4

    invoke-static {v0}, LvL3;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v0, p0, LvL3;->f:LIy;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LGy;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method
