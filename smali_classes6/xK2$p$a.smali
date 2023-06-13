.class public final enum LxK2$p$a;
.super LxK2$p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2$p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LxK2$p;-><init>(Ljava/lang/String;ILxK2$a;)V

    return-void
.end method


# virtual methods
.method public b()LRf1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LRf1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-static {}, LRf1;->c()LRf1;

    move-result-object v0

    return-object v0
.end method
