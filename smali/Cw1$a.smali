.class public LCw1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCw1;->e(Landroid/content/Context;Lzw1;LP80;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "LCw1$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Lzw1;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lzw1;I)V
    .locals 0

    iput-object p1, p0, LCw1$a;->b:Ljava/lang/String;

    iput-object p2, p0, LCw1$a;->c:Landroid/content/Context;

    iput-object p3, p0, LCw1$a;->d:Lzw1;

    iput p4, p0, LCw1$a;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LCw1$e;
    .locals 4

    iget-object v0, p0, LCw1$a;->b:Ljava/lang/String;

    iget-object v1, p0, LCw1$a;->c:Landroid/content/Context;

    iget-object v2, p0, LCw1$a;->d:Lzw1;

    iget v3, p0, LCw1$a;->e:I

    invoke-static {v0, v1, v2, v3}, LCw1;->c(Ljava/lang/String;Landroid/content/Context;Lzw1;I)LCw1$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LCw1$a;->a()LCw1$e;

    move-result-object v0

    return-object v0
.end method
