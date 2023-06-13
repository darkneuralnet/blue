.class public final LZu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:LET;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LET;
    .locals 1

    iget-object v0, p0, LZu;->e:LET;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, LZu;->d:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, LZu;->a:Z

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, LZu;->c:I

    return-void
.end method

.method public e(LET;)V
    .locals 0

    iput-object p1, p0, LZu;->e:LET;

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, LZu;->b:I

    return-void
.end method
