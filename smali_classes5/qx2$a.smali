.class public abstract Lqx2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqx2;
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
.method public abstract a()Lqx2;
.end method

.method public abstract b(LIk0;)Lqx2$a;
.end method

.method public abstract c(Ljava/util/List;)Lqx2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnx2;",
            ">;)",
            "Lqx2$a;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/Integer;)Lqx2$a;
.end method

.method public abstract e(Ljava/lang/String;)Lqx2$a;
.end method

.method public abstract f(Lvb4;)Lqx2$a;
.end method

.method public abstract g(J)Lqx2$a;
.end method

.method public abstract h(J)Lqx2$a;
.end method

.method public i(I)Lqx2$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx2$a;->d(Ljava/lang/Integer;)Lqx2$a;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Lqx2$a;
    .locals 0

    invoke-virtual {p0, p1}, Lqx2$a;->e(Ljava/lang/String;)Lqx2$a;

    move-result-object p1

    return-object p1
.end method
