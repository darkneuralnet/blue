.class public LKy1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKy1$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LKy1;->a:I

    iput p2, p0, LKy1;->b:I

    iput p3, p0, LKy1;->c:I

    return-void
.end method

.method public synthetic constructor <init>(IIILLy1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LKy1;-><init>(III)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LKy1;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LKy1;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LKy1;->a:I

    return v0
.end method
