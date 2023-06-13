.class public abstract LBs5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBs5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()LBs5;
.end method

.method public abstract b(LPc1;)LBs5$a;
.end method

.method public abstract c(Lyg1;)LBs5$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg1<",
            "*>;)",
            "LBs5$a;"
        }
    .end annotation
.end method

.method public abstract d(LC96;)LBs5$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC96<",
            "*[B>;)",
            "LBs5$a;"
        }
    .end annotation
.end method

.method public abstract e(LT96;)LBs5$a;
.end method

.method public abstract f(Ljava/lang/String;)LBs5$a;
.end method
