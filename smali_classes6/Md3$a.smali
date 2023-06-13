.class public LMd3$a;
.super LNd3$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMd3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LNd3$a<",
        "LMd3$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LNd3$a;-><init>()V

    return-void
.end method


# virtual methods
.method public f()LMd3;
    .locals 2

    new-instance v0, LMd3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LMd3;-><init>(LMd3$a;Llf7;)V

    return-object v0
.end method

.method public g(I)LMd3$a;
    .locals 0

    invoke-super {p0, p1}, LNd3$a;->a(I)LNd3$a;

    move-result-object p1

    check-cast p1, LMd3$a;

    return-object p1
.end method
