.class public final LGg2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final c:LGg2;

.field public static final d:LGg2;

.field public static final e:LGg2;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LGg2;

    const-string v1, "JOSE"

    invoke-direct {v0, v1}, LGg2;-><init>(Ljava/lang/String;)V

    sput-object v0, LGg2;->c:LGg2;

    new-instance v0, LGg2;

    const-string v1, "JOSE+JSON"

    invoke-direct {v0, v1}, LGg2;-><init>(Ljava/lang/String;)V

    sput-object v0, LGg2;->d:LGg2;

    new-instance v0, LGg2;

    const-string v1, "JWT"

    invoke-direct {v0, v1}, LGg2;-><init>(Ljava/lang/String;)V

    sput-object v0, LGg2;->e:LGg2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, LGg2;->b:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The object type must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LGg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, LGg2;->b:Ljava/lang/String;

    check-cast p1, LGg2;

    iget-object p1, p1, LGg2;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

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

    iget-object v0, p0, LGg2;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LGg2;->b:Ljava/lang/String;

    return-object v0
.end method
