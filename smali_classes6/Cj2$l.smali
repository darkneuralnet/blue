.class public LCj2$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEj2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCj2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LEj2<",
        "LKg2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

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

    check-cast p1, LKg2;

    invoke-virtual {p0, p1, p2, p3}, LCj2$l;->b(LKg2;Ljava/lang/Appendable;LTg2;)V

    return-void
.end method

.method public b(LKg2;Ljava/lang/Appendable;LTg2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "LKg2;",
            ">(TE;",
            "Ljava/lang/Appendable;",
            "LTg2;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1, p3}, LKg2;->j(LTg2;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method
