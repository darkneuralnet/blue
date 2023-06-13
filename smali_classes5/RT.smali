.class public LRT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LbM4<",
        "TDataType;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LbM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LbM4<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;LbM4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "LbM4<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, LRT;->b:Landroid/content/res/Resources;

    invoke-static {p2}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LbM4;

    iput-object p1, p0, LRT;->a:LbM4;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lsy3;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;",
            "Lsy3;",
            ")Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LRT;->a:LbM4;

    invoke-interface {v0, p1, p2}, LbM4;->a(Ljava/lang/Object;Lsy3;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;IILsy3;)LVL4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;II",
            "Lsy3;",
            ")",
            "LVL4<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LRT;->a:LbM4;

    invoke-interface {v0, p1, p2, p3, p4}, LbM4;->b(Ljava/lang/Object;IILsy3;)LVL4;

    move-result-object p1

    iget-object p2, p0, LRT;->b:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Ldn2;->f(Landroid/content/res/Resources;LVL4;)LVL4;

    move-result-object p1

    return-object p1
.end method
