.class public final LF41$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:[Ljava/io/InputStream;

.field public final e:[J

.field public final synthetic f:LF41;


# direct methods
.method public constructor <init>(LF41;Ljava/lang/String;J[Ljava/io/InputStream;[J)V
    .locals 0

    iput-object p1, p0, LF41$e;->f:LF41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LF41$e;->b:Ljava/lang/String;

    iput-wide p3, p0, LF41$e;->c:J

    iput-object p5, p0, LF41$e;->d:[Ljava/io/InputStream;

    iput-object p6, p0, LF41$e;->e:[J

    return-void
.end method

.method public synthetic constructor <init>(LF41;Ljava/lang/String;J[Ljava/io/InputStream;[JLF41$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LF41$e;-><init>(LF41;Ljava/lang/String;J[Ljava/io/InputStream;[J)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, LF41$e;->d:[Ljava/io/InputStream;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public b(I)J
    .locals 3

    iget-object v0, p0, LF41$e;->e:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public close()V
    .locals 4

    iget-object v0, p0, LF41$e;->d:[Ljava/io/InputStream;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-static {v3}, Lti6;->a(Ljava/io/Closeable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
