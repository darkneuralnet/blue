.class public final LIE3$n;
.super LIE3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIE3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LIE3<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LsB0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsB0<",
            "TT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Z


# direct methods
.method public constructor <init>(LsB0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsB0<",
            "TT;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, LIE3;-><init>()V

    iput-object p1, p0, LIE3$n;->a:LsB0;

    iput-boolean p2, p0, LIE3$n;->b:Z

    return-void
.end method


# virtual methods
.method public a(LsI4;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsI4;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LIE3$n;->a:LsB0;

    invoke-interface {v0, p2}, LsB0;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v0, 0x0

    iget-boolean v1, p0, LIE3$n;->b:Z

    invoke-virtual {p1, p2, v0, v1}, LsI4;->g(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
