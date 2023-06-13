.class public LRa1;
.super LdZ1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LdZ1<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:LRa1;

.field private static final serialVersionUID:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LRa1;

    invoke-direct {v0}, LRa1;-><init>()V

    sput-object v0, LRa1;->k:LRa1;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-static {}, LXY1;->h()LXY1;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, LdZ1;-><init>(LXY1;ILjava/util/Comparator;)V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, LRa1;->k:LRa1;

    return-object v0
.end method
