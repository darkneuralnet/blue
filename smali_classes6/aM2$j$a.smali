.class public LaM2$j$a;
.super LLx1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LaM2$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LLx1<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LaM2$j;


# direct methods
.method public constructor <init>(LaM2$j;)V
    .locals 0

    iput-object p1, p0, LaM2$j$a;->b:LaM2$j;

    invoke-direct {p0}, LLx1;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LaM2$j;LaM2$c;)V
    .locals 0

    invoke-direct {p0, p1}, LaM2$j$a;-><init>(LaM2$j;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LaM2$j$a;->b:LaM2$j;

    iget-object v0, v0, LaM2$j;->g:Ljava/util/Set;

    return-object v0
.end method

.method public bridge synthetic delegate()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LaM2$j$a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic delegate()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LaM2$j$a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LaM2$j$a$a;

    iget-object v1, p0, LaM2$j$a;->b:LaM2$j;

    iget-object v1, v1, LaM2$j;->g:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LaM2$j$a$a;-><init>(LaM2$j$a;Ljava/util/Iterator;)V

    return-object v0
.end method
