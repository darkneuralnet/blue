.class public abstract LCH6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCH6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LCH6$a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public b:I

.field public c:J

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LCH6$a;->b:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LCH6$a;->c:J

    iput v0, p0, LCH6$a;->d:I

    iput p1, p0, LCH6$a;->a:I

    return-void
.end method

.method public static synthetic a(LCH6$a;)I
    .locals 0

    iget p0, p0, LCH6$a;->b:I

    return p0
.end method

.method public static synthetic b(LCH6$a;)J
    .locals 2

    iget-wide v0, p0, LCH6$a;->c:J

    return-wide v0
.end method

.method public static synthetic c(LCH6$a;)I
    .locals 0

    iget p0, p0, LCH6$a;->a:I

    return p0
.end method

.method public static synthetic d(LCH6$a;)I
    .locals 0

    iget p0, p0, LCH6$a;->d:I

    return p0
.end method


# virtual methods
.method public abstract e()LCH6$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public f(I)LCH6$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iput p1, p0, LCH6$a;->d:I

    invoke-virtual {p0}, LCH6$a;->e()LCH6$a;

    move-result-object p1

    return-object p1
.end method

.method public g(I)LCH6$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iput p1, p0, LCH6$a;->b:I

    invoke-virtual {p0}, LCH6$a;->e()LCH6$a;

    move-result-object p1

    return-object p1
.end method

.method public h(J)LCH6$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    iput-wide p1, p0, LCH6$a;->c:J

    invoke-virtual {p0}, LCH6$a;->e()LCH6$a;

    move-result-object p1

    return-object p1
.end method
