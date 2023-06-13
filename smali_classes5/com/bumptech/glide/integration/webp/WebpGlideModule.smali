.class public Lcom/bumptech/glide/integration/webp/WebpGlideModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLC1;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/bumptech/glide/b;)V
    .locals 0

    return-void
.end method

.method public b(Landroid/content/Context;Lcom/bumptech/glide/a;Lcom/bumptech/glide/Registry;)V
    .locals 10

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p2}, Lcom/bumptech/glide/a;->f()LeU;

    move-result-object v1

    invoke-virtual {p2}, Lcom/bumptech/glide/a;->e()Lto;

    move-result-object p2

    new-instance v2, LFA6;

    invoke-virtual {p3}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-direct {v2, v3, v4, v1, p2}, LFA6;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;LeU;Lto;)V

    new-instance v3, LVe;

    invoke-direct {v3, p2, v1}, LVe;-><init>(Lto;LeU;)V

    new-instance v4, Lz70;

    invoke-direct {v4, v2}, Lz70;-><init>(LFA6;)V

    new-instance v5, LoR5;

    invoke-direct {v5, v2, p2}, LoR5;-><init>(LFA6;Lto;)V

    new-instance v2, LF70;

    invoke-direct {v2, p1, p2, v1}, LF70;-><init>(Landroid/content/Context;Lto;LeU;)V

    const-string p1, "Bitmap"

    const-class v1, Ljava/nio/ByteBuffer;

    const-class v6, Landroid/graphics/Bitmap;

    invoke-virtual {p3, p1, v1, v6, v4}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p3

    const-class v7, Ljava/io/InputStream;

    invoke-virtual {p3, p1, v7, v6, v5}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p3

    new-instance v8, LRT;

    invoke-direct {v8, v0, v4}, LRT;-><init>(Landroid/content/res/Resources;LbM4;)V

    const-string v4, "BitmapDrawable"

    const-class v9, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p3, v4, v1, v9, v8}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p3

    new-instance v8, LRT;

    invoke-direct {v8, v0, v5}, LRT;-><init>(Landroid/content/res/Resources;LbM4;)V

    invoke-virtual {p3, v4, v7, v9, v8}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p3

    new-instance v0, Lv70;

    invoke-direct {v0, v3}, Lv70;-><init>(LVe;)V

    invoke-virtual {p3, p1, v1, v6, v0}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p3

    new-instance v0, LlR5;

    invoke-direct {v0, v3}, LlR5;-><init>(LVe;)V

    invoke-virtual {p3, p1, v7, v6, v0}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p1

    const-class p3, LGA6;

    invoke-virtual {p1, v1, p3, v2}, Lcom/bumptech/glide/Registry;->p(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p1

    new-instance v0, LFR5;

    invoke-direct {v0, v2, p2}, LFR5;-><init>(LbM4;Lto;)V

    invoke-virtual {p1, v7, p3, v0}, Lcom/bumptech/glide/Registry;->p(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object p1

    new-instance p2, LHA6;

    invoke-direct {p2}, LHA6;-><init>()V

    invoke-virtual {p1, p3, p2}, Lcom/bumptech/glide/Registry;->o(Ljava/lang/Class;LeM4;)Lcom/bumptech/glide/Registry;

    return-void
.end method
