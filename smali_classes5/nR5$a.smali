.class public LnR5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li61$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnR5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lbt4;

.field public final b:LZg1;


# direct methods
.method public constructor <init>(Lbt4;LZg1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnR5$a;->a:Lbt4;

    iput-object p2, p0, LnR5$a;->b:LZg1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LnR5$a;->a:Lbt4;

    invoke-virtual {v0}, Lbt4;->b()V

    return-void
.end method

.method public b(LeU;Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LnR5$a;->b:LZg1;

    invoke-virtual {v0}, LZg1;->a()Ljava/io/IOException;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, LeU;->c(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method
