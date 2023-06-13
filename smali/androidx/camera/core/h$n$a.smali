.class public final Landroidx/camera/core/h$n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/h$n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/io/File;

.field public b:Landroid/content/ContentResolver;

.field public c:Landroid/net/Uri;

.field public d:Landroid/content/ContentValues;

.field public e:Ljava/io/OutputStream;

.field public f:Landroidx/camera/core/h$k;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/h$n$a;->a:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/h$n;
    .locals 8

    new-instance v7, Landroidx/camera/core/h$n;

    iget-object v1, p0, Landroidx/camera/core/h$n$a;->a:Ljava/io/File;

    iget-object v2, p0, Landroidx/camera/core/h$n$a;->b:Landroid/content/ContentResolver;

    iget-object v3, p0, Landroidx/camera/core/h$n$a;->c:Landroid/net/Uri;

    iget-object v4, p0, Landroidx/camera/core/h$n$a;->d:Landroid/content/ContentValues;

    iget-object v5, p0, Landroidx/camera/core/h$n$a;->e:Ljava/io/OutputStream;

    iget-object v6, p0, Landroidx/camera/core/h$n$a;->f:Landroidx/camera/core/h$k;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/camera/core/h$n;-><init>(Ljava/io/File;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/io/OutputStream;Landroidx/camera/core/h$k;)V

    return-object v7
.end method

.method public b(Landroidx/camera/core/h$k;)Landroidx/camera/core/h$n$a;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/h$n$a;->f:Landroidx/camera/core/h$k;

    return-object p0
.end method
