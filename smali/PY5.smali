.class public LPY5;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;LWa0;)I
    .locals 1

    const-class v0, Lf83;

    invoke-static {v0}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, Lf83;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf83;->d()I

    move-result p1

    return p1

    :cond_0
    invoke-static {p1, p2}, Lec0;->a(Ljava/lang/String;LWa0;)LTe4;

    move-result-object p1

    const-class p2, LIo;

    invoke-virtual {p1, p2}, LTe4;->b(Ljava/lang/Class;)LSe4;

    move-result-object p1

    check-cast p1, LIo;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LIo;->d()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x3

    return p1
.end method
