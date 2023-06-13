.class public Lcom/bumptech/glide/manager/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/manager/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/manager/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/a;Lwq2;LXI4;Landroid/content/Context;)LUI4;
    .locals 1

    new-instance v0, LUI4;

    invoke-direct {v0, p1, p2, p3, p4}, LUI4;-><init>(Lcom/bumptech/glide/a;Lwq2;LXI4;Landroid/content/Context;)V

    return-object v0
.end method
