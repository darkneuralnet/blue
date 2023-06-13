.class public LRq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public constructor <init>(LTe4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, LfX1;

    invoke-virtual {p1, v0}, LTe4;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, LRq;->a:Z

    const-class p1, LUD0;

    invoke-static {p1}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LRq;->b:Z

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    iget-boolean v0, p0, LRq;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LRq;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    :cond_1
    return p1
.end method
