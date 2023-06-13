.class public LTO4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwX1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTO4;->b(JILandroid/graphics/Matrix;)LwX1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:I

.field public final synthetic c:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(JILandroid/graphics/Matrix;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-wide p1, p0, LTO4$b;->a:J

    iput p3, p0, LTO4$b;->b:I

    iput-object p4, p0, LTO4$b;->c:Landroid/graphics/Matrix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LWh1$b;)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Custom ImageProxy does not contain Exif data."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()LxY5;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Custom ImageProxy does not contain TagBundle"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LTO4$b;->b:I

    return v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, LTO4$b;->a:J

    return-wide v0
.end method
