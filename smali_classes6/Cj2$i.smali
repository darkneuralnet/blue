.class public LCj2$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEj2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCj2;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LEj2<",
        "[Z>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LCj2;


# direct methods
.method public constructor <init>(LCj2;)V
    .locals 0

    iput-object p1, p0, LCj2$i;->a:LCj2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Appendable;LTg2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, [Z

    invoke-virtual {p0, p1, p2, p3}, LCj2$i;->b([ZLjava/lang/Appendable;LTg2;)V

    return-void
.end method

.method public b([ZLjava/lang/Appendable;LTg2;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p3, p2}, LTg2;->c(Ljava/lang/Appendable;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    aget-boolean v3, p1, v1

    if-eqz v2, :cond_0

    invoke-virtual {p3, p2}, LTg2;->m(Ljava/lang/Appendable;)V

    goto :goto_1

    :cond_0
    const/4 v2, 0x1

    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p2}, LTg2;->d(Ljava/lang/Appendable;)V

    return-void
.end method
