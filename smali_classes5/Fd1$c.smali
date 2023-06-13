.class public LFd1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LVL4;ZLak2;LJd1$a;)LJd1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LVL4<",
            "TR;>;Z",
            "Lak2;",
            "LJd1$a;",
            ")",
            "LJd1<",
            "TR;>;"
        }
    .end annotation

    new-instance v6, LJd1;

    const/4 v3, 0x1

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LJd1;-><init>(LVL4;ZZLak2;LJd1$a;)V

    return-object v6
.end method
