.class public final Lly8;
.super Lv39;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lv39<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final i:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lv39;-><init>()V

    iput p1, p0, Lly8;->i:I

    return-void
.end method

.method public static synthetic D(Lly8;)I
    .locals 0

    iget p0, p0, Lly8;->i:I

    return p0
.end method


# virtual methods
.method public final g(LMb9;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMb9<",
            "+TT;>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lv39;->g(LMb9;)Z

    move-result p1

    return p1
.end method
