.class public final LrD3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LET;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "LfN4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LET;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LET;",
            "Ljava/util/List<",
            "[",
            "LfN4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrD3;->a:LET;

    iput-object p2, p0, LrD3;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()LET;
    .locals 1

    iget-object v0, p0, LrD3;->a:LET;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[",
            "LfN4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LrD3;->b:Ljava/util/List;

    return-object v0
.end method
