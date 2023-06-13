.class public final LxK2$r;
.super LxK2$n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "r"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LxK2$n<",
        "TK;TV;",
        "LxK2$q<",
        "TK;TV;>;",
        "LxK2$r<",
        "TK;TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LxK2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2<",
            "TK;TV;",
            "LxK2$q<",
            "TK;TV;>;",
            "LxK2$r<",
            "TK;TV;>;>;II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, LxK2$n;-><init>(LxK2;II)V

    return-void
.end method


# virtual methods
.method public bridge synthetic D()LxK2$n;
    .locals 1

    invoke-virtual {p0}, LxK2$r;->H()LxK2$r;

    move-result-object v0

    return-object v0
.end method

.method public H()LxK2$r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LxK2$r<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method
