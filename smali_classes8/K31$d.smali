.class public LK31$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK31;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const v0, 0x1dfa0

    new-array v0, v0, [B

    sput-object v0, LK31$d;->a:[B

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/String;

    invoke-static {}, LK31$a;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {}, LK31$b;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    const/4 v2, 0x2

    invoke-static {}, LK31$c;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    move v2, v3

    move v4, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v5, v1, v2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sget-object v2, LK31$d;->a:[B

    array-length v2, v2

    if-ne v4, v2, :cond_3

    move v2, v3

    move v4, v2

    :goto_1
    if-ge v2, v0, :cond_2

    aget-object v5, v1, v2

    move v6, v3

    :goto_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_1

    sget-object v7, LK31$d;->a:[B

    add-int/lit8 v8, v4, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-byte v9, v9

    aput-byte v9, v7, v4

    add-int/lit8 v6, v6, 0x1

    move v4, v8

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Corrupted brotli dictionary"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
