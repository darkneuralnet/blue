.class public final LxK2$k;
.super LxK2$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LxK2<",
        "TK;TV;TE;TS;>.h<TK;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LxK2;)V
    .locals 0

    invoke-direct {p0, p1}, LxK2$h;-><init>(LxK2;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, LxK2$h;->c()LxK2$D;

    move-result-object v0

    invoke-virtual {v0}, LxK2$D;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
