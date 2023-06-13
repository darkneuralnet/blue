.class public final Lsd8;
.super LTd8;
.source "SourceFile"

# interfaces
.implements LRb8;


# instance fields
.field public final b:Ljava/io/FileInputStream;

.field public final c:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/FileInputStream;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1}, LTd8;-><init>(Ljava/io/InputStream;)V

    iput-object p1, p0, Lsd8;->b:Ljava/io/FileInputStream;

    iput-object p2, p0, Lsd8;->c:Ljava/io/File;

    return-void
.end method

.method public static a(Ljava/io/File;)Lsd8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    new-instance v0, Lsd8;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1, p0}, Lsd8;-><init>(Ljava/io/FileInputStream;Ljava/io/File;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lsd8;->c:Ljava/io/File;

    return-object v0
.end method
