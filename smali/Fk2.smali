.class public abstract LFk2;
.super LXj2;
.source "SourceFile"


# instance fields
.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LXj2;-><init>()V

    sget v0, LXj2;->f:I

    iput v0, p0, LFk2;->g:I

    return-void
.end method


# virtual methods
.method public d(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
