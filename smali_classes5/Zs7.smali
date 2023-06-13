.class public final LZs7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Lis7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, LZs7;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LZs7;->a:Ljava/util/logging/Logger;

    new-instance v0, Lis7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lis7;-><init>(Lsr7;)V

    sput-object v0, LZs7;->b:Lis7;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
