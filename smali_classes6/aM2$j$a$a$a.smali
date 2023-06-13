.class public LaM2$j$a$a$a;
.super LIx1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaM2$j$a$a;->b(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LIx1<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/Map$Entry;

.field public final synthetic c:LaM2$j$a$a;


# direct methods
.method public constructor <init>(LaM2$j$a$a;Ljava/util/Map$Entry;)V
    .locals 0

    iput-object p1, p0, LaM2$j$a$a$a;->c:LaM2$j$a$a;

    iput-object p2, p0, LaM2$j$a$a$a;->b:Ljava/util/Map$Entry;

    invoke-direct {p0}, LIx1;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LaM2$j$a$a$a;->b:Ljava/util/Map$Entry;

    return-object v0
.end method

.method public bridge synthetic delegate()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LaM2$j$a$a$a;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    iget-object v0, p0, LaM2$j$a$a$a;->c:LaM2$j$a$a;

    iget-object v0, v0, LaM2$j$a$a;->c:LaM2$j$a;

    iget-object v0, v0, LaM2$j$a;->b:LaM2$j;

    invoke-virtual {p0}, LIx1;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LaM2$f;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, LEZ3;->d(Z)V

    invoke-super {p0, p1}, LIx1;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
