.class public LY0$b;
.super LoX2$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LoX2$c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LY0;


# direct methods
.method public constructor <init>(LY0;)V
    .locals 0

    iput-object p1, p0, LY0$b;->b:LY0;

    invoke-direct {p0}, LoX2$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LmX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LmX2<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LY0$b;->b:LY0;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation

    iget-object v0, p0, LY0$b;->b:LY0;

    invoke-virtual {v0}, LY0;->f()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LY0$b;->b:LY0;

    invoke-virtual {v0}, LY0;->c()I

    move-result v0

    return v0
.end method
