.class public final LqE2$b;
.super LnB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqE2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LnB<",
        "LqE2$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LnB;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LaY3;
    .locals 1

    invoke-virtual {p0}, LqE2$b;->d()LqE2$a;

    move-result-object v0

    return-object v0
.end method

.method public d()LqE2$a;
    .locals 1

    new-instance v0, LqE2$a;

    invoke-direct {v0, p0}, LqE2$a;-><init>(LqE2$b;)V

    return-object v0
.end method

.method public e(ILjava/lang/Class;)LqE2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)",
            "LqE2$a;"
        }
    .end annotation

    invoke-virtual {p0}, LnB;->b()LaY3;

    move-result-object v0

    check-cast v0, LqE2$a;

    invoke-virtual {v0, p1, p2}, LqE2$a;->b(ILjava/lang/Class;)V

    return-object v0
.end method
