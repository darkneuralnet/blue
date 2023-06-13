.class public abstract Lzb4$b;
.super Lzb4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzb4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lzb4;-><init>(Lzb4$a;)V

    return-void
.end method

.method public static e(ILjava/lang/String;)Lzb4$b;
    .locals 1

    new-instance v0, Lau;

    invoke-direct {v0, p0, p1}, Lau;-><init>(ILjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()I
.end method
