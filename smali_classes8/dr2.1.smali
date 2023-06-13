.class public abstract Ldr2;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final b:Ljava/io/InputStream;

.field public c:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Ldr2;->b:Ljava/io/InputStream;

    iput p2, p0, Ldr2;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ldr2;->c:I

    return v0
.end method

.method public b(Z)V
    .locals 2

    iget-object v0, p0, Ldr2;->b:Ljava/io/InputStream;

    instance-of v1, v0, Ll12;

    if-eqz v1, :cond_0

    check-cast v0, Ll12;

    invoke-virtual {v0, p1}, Ll12;->d(Z)V

    :cond_0
    return-void
.end method
