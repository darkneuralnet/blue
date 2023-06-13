.class public LEu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LEu0;->a:I

    iput p2, p0, LEu0;->b:I

    iput p3, p0, LEu0;->c:I

    iput p4, p0, LEu0;->d:I

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 3

    iget v0, p0, LEu0;->a:I

    int-to-float v1, v0

    iget v2, p0, LEu0;->c:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v1, v0

    return v1
.end method

.method public b(F)F
    .locals 3

    iget v0, p0, LEu0;->b:I

    int-to-float v1, v0

    iget v2, p0, LEu0;->d:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v1, v0

    return v1
.end method
