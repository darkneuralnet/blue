.class public LTD2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public e:F

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, LTD2;->b:F

    return v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LTD2;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, LTD2;->f:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, LTD2;->e:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, LTD2;->g:F

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, LTD2;->a:F

    return v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LTD2;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public h(FFLjava/lang/Object;Ljava/lang/Object;FFF)LTD2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFTT;TT;FFF)",
            "LTD2<",
            "TT;>;"
        }
    .end annotation

    iput p1, p0, LTD2;->a:F

    iput p2, p0, LTD2;->b:F

    iput-object p3, p0, LTD2;->c:Ljava/lang/Object;

    iput-object p4, p0, LTD2;->d:Ljava/lang/Object;

    iput p5, p0, LTD2;->e:F

    iput p6, p0, LTD2;->f:F

    iput p7, p0, LTD2;->g:F

    return-object p0
.end method
