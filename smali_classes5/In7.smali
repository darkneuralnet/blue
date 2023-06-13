.class public final LIn7;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final b:Lbz9;


# direct methods
.method public constructor <init>(Lbz9;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LIn7;->b:Lbz9;

    return-void
.end method

.method public constructor <init>(Lbz9;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, LIn7;->b:Lbz9;

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Exception;)LIn7;
    .locals 2

    new-instance v0, LIn7;

    sget-object v1, Lbz9;->h:Lbz9;

    invoke-direct {v0, v1, p0, p1}, LIn7;-><init>(Lbz9;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lbz9;
    .locals 1

    iget-object v0, p0, LIn7;->b:Lbz9;

    return-object v0
.end method
