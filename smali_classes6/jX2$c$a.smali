.class public LjX2$c$a;
.super Lv96;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjX2$c;->f()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv96<",
        "Ljava/util/Map$Entry<",
        "TK;",
        "Ljava/util/Collection<",
        "TV;>;>;",
        "LmX2$a<",
        "TK;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LjX2$c;Ljava/util/Iterator;)V
    .locals 0

    invoke-direct {p0, p2}, Lv96;-><init>(Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, LjX2$c$a;->b(Ljava/util/Map$Entry;)LmX2$a;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/Map$Entry;)LmX2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;)",
            "LmX2$a<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, LjX2$c$a$a;

    invoke-direct {v0, p0, p1}, LjX2$c$a$a;-><init>(LjX2$c$a;Ljava/util/Map$Entry;)V

    return-object v0
.end method
