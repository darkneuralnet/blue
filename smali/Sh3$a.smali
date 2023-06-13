.class public abstract LSh3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/opengl/EGLSurface;II)LSh3$a;
    .locals 1

    new-instance v0, LRt;

    invoke-direct {v0, p0, p1, p2}, LRt;-><init>(Landroid/opengl/EGLSurface;II)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroid/opengl/EGLSurface;
.end method

.method public abstract b()I
.end method

.method public abstract c()I
.end method
