.class final Lcom/google/ar/core/l;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {p0, v0, v1, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    return-void
.end method


# virtual methods
.method public final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result p1

    const/16 v0, 0xa

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
