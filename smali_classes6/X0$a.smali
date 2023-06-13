.class public LX0$a;
.super LjX2$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LjX2$b<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LX0;


# direct methods
.method public constructor <init>(LX0;)V
    .locals 0

    iput-object p1, p0, LX0$a;->b:LX0;

    invoke-direct {p0}, LjX2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LgX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LgX2<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LX0$a;->b:LX0;

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

    iget-object v0, p0, LX0$a;->b:LX0;

    invoke-virtual {v0}, LX0;->m()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
