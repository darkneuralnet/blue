.class public LR89;
.super LY89;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "LY89<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final b:LMb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMb9<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LMb9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMb9<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LY89;-><init>()V

    iput-object p1, p0, LR89;->b:LMb9;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LR89;->b:LMb9;

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/util/concurrent/Future;
    .locals 1

    iget-object v0, p0, LR89;->b:LMb9;

    return-object v0
.end method

.method public final c()LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LR89;->b:LMb9;

    return-object v0
.end method
