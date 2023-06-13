.class public LUr2$b$a;
.super LUr2$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUr2$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LUr2<",
        "TK;TV;>.d<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic f:LUr2$b;


# direct methods
.method public constructor <init>(LUr2$b;)V
    .locals 0

    iput-object p1, p0, LUr2$b$a;->f:LUr2$b;

    iget-object p1, p1, LUr2$b;->b:LUr2;

    invoke-direct {p0, p1}, LUr2$d;-><init>(LUr2;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LUr2$d;->a()LUr2$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUr2$b$a;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
