.class public Lkm1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkm1$a;->a:I

    iput p2, p0, Lkm1$a;->b:I

    iput p3, p0, Lkm1$a;->c:I

    iput p4, p0, Lkm1$a;->d:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget v0, p0, Lkm1$a;->a:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Lkm1$a;->b:I

    if-le p1, v0, :cond_1

    :cond_0
    iget v0, p0, Lkm1$a;->c:I

    if-eq p1, v0, :cond_1

    iget v0, p0, Lkm1$a;->d:I

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method
