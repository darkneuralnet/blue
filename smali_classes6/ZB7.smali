.class public final LZB7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final b:LZB7;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LZB7;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LZB7;-><init>(ZLVX7;)V

    sput-object v0, LZB7;->b:LZB7;

    return-void
.end method

.method public constructor <init>(ZLVX7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ZLLP7;)LZB7;
    .locals 0

    sget-object p0, LZB7;->b:LZB7;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method
