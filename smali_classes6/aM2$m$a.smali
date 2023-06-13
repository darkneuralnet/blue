.class public LaM2$m$a;
.super LaM2$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaM2$m;->entrySet()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LaM2$h<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LaM2$m;


# direct methods
.method public constructor <init>(LaM2$m;)V
    .locals 0

    iput-object p1, p0, LaM2$m$a;->b:LaM2$m;

    invoke-direct {p0}, LaM2$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LaM2$m$a;->b:LaM2$m;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LaM2$m$a;->b:LaM2$m;

    invoke-virtual {v0}, LaM2$m;->a()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
